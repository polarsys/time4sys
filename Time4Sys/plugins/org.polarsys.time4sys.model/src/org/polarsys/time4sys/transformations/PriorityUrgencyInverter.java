/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.transformations;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.builder.design.posix.PosixSporadicServerBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.marte.grm.FixedPriorityParameters;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.PeriodicServerParameters;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Transformation;
import org.polarsys.time4sys.transformations.PriorityUrgencyInverter.PriorityUrgencyInverterConfiguration;

/**
 * Convert priority values to urgency values as expected by Time4Sys.
 * Handles FixedPriorityParameters, PeriodicServerParameters, and Arinc-653 PSS order annotation attribute.
 * @author loic
 *
 */
public class PriorityUrgencyInverter extends AbstractEndogenousMappedTransformation {
	
	public static final String TRANS_NAME = "Priority to Urgency".intern();
	
	public static class PriorityUrgencyInverterConfiguration {
		
		protected final boolean withPSSOrder;
		protected final boolean isZeroBased;
		
		public PriorityUrgencyInverterConfiguration() {
			withPSSOrder = true;
			isZeroBased = true;
		}
		
		public PriorityUrgencyInverterConfiguration(final boolean withPSS, final boolean isZeroBased) {
			this.withPSSOrder = withPSS;
			this.isZeroBased = isZeroBased;
		}
		
		public PriorityUrgencyInverterConfiguration withoutPSSOrder() {
			return new PriorityUrgencyInverterConfiguration(false, isZeroBased);
		}
		
		public PriorityUrgencyInverterConfiguration zeroBased() {
			return new PriorityUrgencyInverterConfiguration(withPSSOrder, true);
		}
		
		public PriorityUrgencyInverterConfiguration oneBased() {
			return new PriorityUrgencyInverterConfiguration(withPSSOrder, false);
		}

		public PriorityUrgencyInverterConfiguration inverseOnly() {
			return new PriorityUrgencyInverterConfiguration(false, false);
		}
	}
	
	public static PriorityUrgencyInverterConfiguration defaultCfg() {
		return new PriorityUrgencyInverterConfiguration();
	}
	
	public static Transformation transform(final Project project, final DesignModel source) {
		return transform(defaultCfg(), project, source);
	}
	
	public static Transformation transform(final PriorityUrgencyInverterConfiguration cfg, final Project project, final DesignModel source) {
		return new PriorityUrgencyInverter(cfg, project, source).transform();
	}
	
	private int highestPriorityValue = Integer.MIN_VALUE;
	private int highestOrderValue = Integer.MIN_VALUE;
	private int lowestOrderValue = Integer.MAX_VALUE;
	private List<FixedPriorityParameters> fpParamsToBeUpdated = new LinkedList<>();
	private List<PeriodicServerParameters> pssParamsToBeUpdated = new LinkedList<>();
	private List<SoftwareSchedulableResource> pssToBeUpdated = new LinkedList<>();
	private Set<Link> linksToBeUpdated = new LinkedHashSet<>();
	private final PriorityUrgencyInverterConfiguration config;
	
	public PriorityUrgencyInverter(final PriorityUrgencyInverterConfiguration cfg, final Project project, final DesignModel source) {
		super(project, source, TRANS_NAME);
		config = cfg;
	}
	
	@Override
	protected void finalize(final DesignModel target) {
		if (!config.isZeroBased) {
			highestPriorityValue++;
		}
		if (config.withPSSOrder && highestOrderValue != Integer.MIN_VALUE) {
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
			if (config.withPSSOrder) {
				final int order = pssBuilder.getOrder();
				pssBuilder.ofBackgroundPriority(updatedPriority - order + lowestOrderValue);
				pssBuilder.unsetOrder();
			}
		}
		for(Link lnk: linksToBeUpdated) {
			lnk.setRationale(mainCtx);
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
				linksToBeUpdated.add(lnk);
			}
			if (source instanceof PeriodicServerParameters) {
				final PeriodicServerParameters pssParam = (PeriodicServerParameters)source;
				if (pssParam.eIsSet(GrmPackage.eINSTANCE.getPeriodicServerParameters_BackgroundPriority())) {
					highestPriorityValue = Integer.max(highestPriorityValue, pssParam.getBackgroundPriority());
					pssParamsToBeUpdated.add((PeriodicServerParameters)theCopy);
					linksToBeUpdated.add(lnk);
				}
			}
		}
		if (source instanceof SoftwareSchedulableResource) {
			if (config.withPSSOrder && PosixSporadicServerBuilder.hasPSSOrder((SoftwareSchedulableResource)source)) {
				final int order = PosixSporadicServerBuilder.as((SoftwareSchedulableResource)source).getOrder();
				highestOrderValue = Integer.max(highestOrderValue, order);
				lowestOrderValue = Integer.min(lowestOrderValue, order);
				pssToBeUpdated.add((SoftwareSchedulableResource)theCopy);
				linksToBeUpdated.add(lnk);
			}
		}
	}
}
