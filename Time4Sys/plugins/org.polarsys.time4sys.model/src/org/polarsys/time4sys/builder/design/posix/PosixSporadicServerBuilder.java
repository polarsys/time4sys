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
package org.polarsys.time4sys.builder.design.posix;

import org.eclipse.emf.ecore.EClass;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.builder.design.TaskBuilder;
import org.polarsys.time4sys.marte.grm.FixedPriorityParameters;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.PeriodicServerParameters;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;

/**
 * @author loic
 *
 */
public class PosixSporadicServerBuilder extends TaskBuilder {
	
	private static final EClass PSS_PARAM_ECLASS = GrmPackage.eINSTANCE.getPeriodicServerParameters();
	
	public static PosixSporadicServerBuilder aPSS() {
		return new PosixSporadicServerBuilder();
	}

	public PosixSporadicServerBuilder() {
		super(PSS_PARAM_ECLASS);
	}
	
	public PosixSporadicServerBuilder(final DesignBuilder designBuilder, final SoftwareSchedulableResource raw) {
		super(designBuilder, raw, PSS_PARAM_ECLASS);
	}

	public PosixSporadicServerBuilder called(final String value) {
		super.called(value);
		return this;
	}
	
	public PosixSporadicServerBuilder ofWCET(final String value) {
		super.ofWCET(value);
		return this;
	}

	public PosixSporadicServerBuilder ofBCET(final String value) {
		super.ofBCET(value);
		return this;
	}

	public PosixSporadicServerBuilder ofInitialBudget(final String timeBudget) {
		final PeriodicServerParameters schedParam = (PeriodicServerParameters)getSchedParams(FP_POLICY_NAME, fpParamEClass);
		schedParam.setInitialBudget(NfpFactory.eINSTANCE.createDurationFromString(timeBudget));
		return this;
	}
	
	public PosixSporadicServerBuilder ofPriority(final int urgency) {
		super.ofPriority(urgency);
		return this;
	}
	
	public PosixSporadicServerBuilder ofBackgroundPriority(final int urgency) {
		final PeriodicServerParameters schedParam = (PeriodicServerParameters)getSchedParams(FP_POLICY_NAME, fpParamEClass);
		schedParam.setBackgroundPriority(urgency);
		return this;
	}
}
