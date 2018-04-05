/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.transformations;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.builder.design.posix.PosixSporadicServerBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Context;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.marte.grm.FixedPriorityParameters;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.PeriodicServerParameters;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Transformation;
import org.polarsys.time4sys.transformations.CopierMapper.Observer;

/**
 * @author loic
 *
 */
public class PriorityUrgencyInverter extends IdentityDerivation implements Observer {
	
	public static final String TRANS_NAME = "Priority to Urgency".intern();
	
	public static Transformation transform(final Project project, final DesignModel source) {
		return new PriorityUrgencyInverter(project, source).transform();
	}
	
	private Context priorityInversion;
	private int highestPriorityValue = Integer.MIN_VALUE;
	private int highestOrderValue = Integer.MIN_VALUE;
	private int lowestOrderValue = Integer.MAX_VALUE;
	private List<FixedPriorityParameters> fpParamsToBeUpdated = new LinkedList<>();
	private List<PeriodicServerParameters> pssParamsToBeUpdated = new LinkedList<>();
	private List<SoftwareSchedulableResource> pssToBeUpdated = new LinkedList<>();
	
	public PriorityUrgencyInverter(final Project project, final DesignModel source) {
		super(project, source);
	}
	
	public CopierMapper createCopierMapper() {
		final CopierMapper result = super.createCopierMapper();
		result.addObserver(this);
		return result;
	}
	
	public Transformation transform() {
		final Transformation result = super.transform();
		result.getMapping().setRationale(priorityInversion);
		return result;
	}
	
	public void createRules() {
		super.createRules();
		priorityInversion = mappingFactory.createContext(TRANS_NAME);
		mapping.getRules().add(priorityInversion);
	}
	
	protected void finalize(final DesignModel target) {
		super.finalize(target);
		if (highestOrderValue != Integer.MIN_VALUE) {
			highestPriorityValue = highestPriorityValue + highestOrderValue - lowestOrderValue;
		}
		for(FixedPriorityParameters fpParam: fpParamsToBeUpdated) {
			fpParam.setPriority(highestPriorityValue - fpParam.getPriority());
		}
		for(PeriodicServerParameters pssParam: pssParamsToBeUpdated) {
			pssParam.setBackgroundPriority(highestPriorityValue - pssParam.getBackgroundPriority());
		}
		for(SoftwareSchedulableResource pss: pssToBeUpdated) {
			final PosixSporadicServerBuilder pssBuilder = PosixSporadicServerBuilder.as(pss);
			final int updatedPriority = pssBuilder.getBackgroundPriority();
			final int order = pssBuilder.getOrder();
			pssBuilder.ofBackgroundPriority(updatedPriority - order + lowestOrderValue);
			pssBuilder.unsetOrder();
		}
	}

	/**
	 * Lookup for highest priority value AND track parameters to be finally updated.
	 */
	@Override
	public void copied(EObject source, Link lnk, EObject theCopy) {
		if (source instanceof FixedPriorityParameters) {
			final FixedPriorityParameters fpParam = (FixedPriorityParameters)source;
			if (fpParam.eIsSet(GrmPackage.eINSTANCE.getFixedPriorityParameters_Priority())) {
				highestPriorityValue = Integer.max(highestPriorityValue, fpParam.getPriority());
				fpParamsToBeUpdated .add((FixedPriorityParameters)theCopy);
			}
			if (source instanceof PeriodicServerParameters) {
				final PeriodicServerParameters pssParam = (PeriodicServerParameters)source;
				if (pssParam.eIsSet(GrmPackage.eINSTANCE.getPeriodicServerParameters_BackgroundPriority())) {
					highestPriorityValue = Integer.max(highestPriorityValue, pssParam.getBackgroundPriority());
					pssParamsToBeUpdated.add((PeriodicServerParameters)theCopy);
				}
			}
		}
		if (source instanceof SoftwareSchedulableResource) {
			if (PosixSporadicServerBuilder.hasPSSOrder((SoftwareSchedulableResource)source)) {
				final int order = PosixSporadicServerBuilder.as((SoftwareSchedulableResource)source).getOrder();
				highestOrderValue = Integer.max(highestOrderValue, order);
				lowestOrderValue = Integer.min(lowestOrderValue, order);
				pssToBeUpdated.add((SoftwareSchedulableResource)theCopy);
			}
		}
	}
}
