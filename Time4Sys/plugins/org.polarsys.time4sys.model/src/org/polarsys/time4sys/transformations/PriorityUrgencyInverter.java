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
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Context;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.marte.grm.FixedPriorityParameters;
import org.polarsys.time4sys.marte.grm.GrmPackage;
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
	private List<FixedPriorityParameters> toBeUpdated = new LinkedList<>();
	
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
		for(FixedPriorityParameters fpParam: toBeUpdated) {
			fpParam.setPriority(highestPriorityValue - fpParam.getPriority() + 1);
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
				toBeUpdated .add((FixedPriorityParameters)theCopy);
			}
		}
	}
}
