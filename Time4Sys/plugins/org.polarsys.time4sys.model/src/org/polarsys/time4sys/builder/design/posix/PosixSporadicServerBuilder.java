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
import org.polarsys.time4sys.builder.design.arinc653.Arinc653Builder;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.PeriodicServerParameters;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;

/**
 * @author loic
 *
 */
public class PosixSporadicServerBuilder extends TaskBuilder {
	
	public static final String POSIX_URL = "http://www.polarsys.org/time4sys/org.polarsys.time4sys.builder.design.posix";
	
	private static final EClass PSS_PARAM_ECLASS = GrmPackage.eINSTANCE.getPeriodicServerParameters();

	private static final String ORDER_ATTR = "pss_order";
	
	public static PosixSporadicServerBuilder aPSS() {
		return new PosixSporadicServerBuilder();
	}

	public static PosixSporadicServerBuilder as(final TaskBuilder task) {
		return new PosixSporadicServerBuilder(task);
	}
	
	public static PosixSporadicServerBuilder as(final SoftwareSchedulableResource task) {
		return new PosixSporadicServerBuilder(null, task);
	}
	
	public static boolean hasPSSOrder(final SoftwareSchedulableResource aTask) {
		final TaskBuilder taskBuilder = new TaskBuilder(null, aTask);
		if (taskBuilder.hasAnnotation(POSIX_URL)) {
			final String orderValue = taskBuilder.annotate(POSIX_URL).getDetails().get(ORDER_ATTR);
			return (orderValue != null);
		}
		return false;
	}

	public PosixSporadicServerBuilder() {
		super(PSS_PARAM_ECLASS);
	}
	
	public PosixSporadicServerBuilder(final DesignBuilder designBuilder, final SoftwareSchedulableResource raw) {
		super(designBuilder, raw, PSS_PARAM_ECLASS);
	}

	public PosixSporadicServerBuilder(final TaskBuilder task) {
		super(task.design(), task.build(), PSS_PARAM_ECLASS);
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
	
	public PosixSporadicServerBuilder ofPeriod(final String value) {
		super.ofPeriod(value);
		return this;
	}
	
	public PosixSporadicServerBuilder ofDeadline(final String value) {
		super.ofDeadline(value);
		return this;
	}
	
	public PosixSporadicServerBuilder ofBackgroundPriority(final int urgency) {
		final PeriodicServerParameters schedParam = (PeriodicServerParameters)getSchedParams(FP_POLICY_NAME, fpParamEClass);
		schedParam.setBackgroundPriority(urgency);
		return this;
	}
	
	public int getBackgroundPriority() {
		final PeriodicServerParameters schedParam = (PeriodicServerParameters)getSchedParams(FP_POLICY_NAME, fpParamEClass);
		return schedParam.getBackgroundPriority();
	}
	
	public PosixSporadicServerBuilder withSingleActivation() {
		super.withSingleActivation();
		return this;
	}
	
	public PosixSporadicServerBuilder withOrder(final int order) {
		annotate(POSIX_URL).getDetails().put(ORDER_ATTR, Integer.toString(order));
		return this;
	}


	public int getOrder() {
		final String strVal = annotate(POSIX_URL).getDetails().get(ORDER_ATTR);
		return Integer.parseInt(strVal);
	}

	public PosixSporadicServerBuilder unsetOrder() {
		unsetAnnotationAttr(POSIX_URL, ORDER_ATTR);
		return this;
	}
}
