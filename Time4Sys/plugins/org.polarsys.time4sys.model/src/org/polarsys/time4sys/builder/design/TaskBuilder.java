/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 * 
 */
package org.polarsys.time4sys.builder.design;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.grm.EDFParameters;
import org.polarsys.time4sys.marte.grm.FixedPriorityParameters;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * @author loic
 *
 */
public class TaskBuilder implements SchedulableResourceBuilder<SoftwareSchedulableResource, TaskBuilder> {

	private static final String EDF_POLICY_NAME = "EDF";
	private static final String FP_POLICY_NAME = "FixedPriority";
	private static final EClass FP_PARAM_ECLASS = GrmPackage.eINSTANCE.getFixedPriorityParameters();
	private static final EClass EDF_PARAM_ECLASS = GrmPackage.eINSTANCE.getEDFParameters();
	protected static DesignFactory df = DesignFactory.eINSTANCE;
	protected static GqamFactory gqamFactory = GqamFactory.eINSTANCE;
	protected static SrmFactory srmFactory = SrmFactory.eINSTANCE;
	protected static GrmFactory grmFactory = GrmFactory.eINSTANCE;
	protected static HrmFactory hrmFactory = HrmFactory.eINSTANCE;
	protected static NfpFactory nfpFactory = NfpFactory.eINSTANCE;
	
	public static TaskBuilder aTask() {
		return new TaskBuilder();
	}

	private String period;
	private SoftwareSchedulableResource task;
	private StepBuilder firstStep;
	private List<StepBuilder> ownedSteps = new LinkedList<>();
	private DesignBuilder design;
	private String wcet;
	private String bcet;
	private String jitter;
	private int nbEvents = 1;
	private String windowSize;
	private String deadline;
	
	public TaskBuilder() {
		this(null, srmFactory.createSoftwareSchedulableResource());
	}
	
	public TaskBuilder(final DesignBuilder designBuilder, final SoftwareSchedulableResource raw) {
		assert(raw != null);
		task = raw;
		design = designBuilder;
	}

	public SoftwareSchedulableResource build(final DesignBuilder design) {
		this.design = design;
		if (period != null) {
			firstStep().isPeriodic(period);
		}
		if (windowSize != null) {
			firstStep().withSlidingWindow(nbEvents, windowSize);
		}
		if (jitter != null) {
			firstStep().hasJitter(jitter);
		}
		if (bcet != null) {
			firstStep().ofBCET(bcet);
		}		
		if (wcet != null) {
			firstStep().ofWCET(wcet);
		}
		for(StepBuilder st: ownedSteps) {
			st.build();
		}
		if (deadline != null) {
			design.has(EndToEndFlowConstraintBuilder.anEndToEndConstraint().from(firstStep()).to(this).withDeadline(deadline));
			deadline = null;
		}
		return task;
	}
	
	public SoftwareSchedulableResource build() {
		if (design == null) {
			throw new IllegalStateException("Build() cannot be called until it has been built with a DesignBuilder once.");
		}
		return task;
	}

	public TaskBuilder ofPeriod(final String value) {
		period = value;
		return this;
	}
	
	public TaskBuilder withSlidingWindow(final int nbEvents, final String windowSize) {
		this.nbEvents = nbEvents;
		this.windowSize = windowSize;
		period = null;
		return this;
	}
	
	public TaskBuilder called(final String value) {
		task.setName(value);
		return this;
	}

	public StepBuilder firstStep() {
		if (firstStep != null) {
			return firstStep;
		}
		if (design == null) {
			throw new IllegalStateException("Illegal API order of calls.");
		}
		// Checking that there is not an already existing step
		for(Step step: design.allSteps()) {
			if (step.getConcurRes() == task) {
				if (step.getInputRel() != null) {
					while(!step.getInputRel().getPredec().isEmpty()) {
						for(Step prec: step.getInputRel().getPredec()) {
							if (prec.getConcurRes() == task) {
								step = prec;
							}
						}
					}
				}
				return new StepBuilder(design, this, step);
			}
		}
		// otherwise create it
		firstStep = new StepBuilder(design, this);
		firstStep().called(task.getName());
		firstStep().build();
		return firstStep;
	}
	
	public StepBuilder anotherStep() {
		final StepBuilder res = design.aStep();
		res.setTask(this);
		return res;
	}


	public TaskBuilder ofWCET(final String value) {
		wcet = value;
		return this;
	}

	public TaskBuilder ofBCET(final String value) {
		bcet = value;
		return this;
	}

	public StepBuilder whoseFirstStep() {
		return firstStep();
	}

	public TaskBuilder ofDeadline(final String value) {
		final EDFParameters edfParam = (EDFParameters)getSchedParams(EDF_POLICY_NAME, EDF_PARAM_ECLASS);
		edfParam.setDeadline(NfpFactory.eINSTANCE.createDurationFromString(value));
		/* NB: An EndToEndFlow will also be created later */
		deadline = value;
		return this;
	}
	
	public TaskBuilder ofPriority(final int value) {
		final FixedPriorityParameters schedParam = (FixedPriorityParameters)getSchedParams(FP_POLICY_NAME, FP_PARAM_ECLASS);
		//schedParam.setValue(Integer.toString(value));
		schedParam.setPriority(value);
		return this;
	}
	
	public int getPriority() {
		return Integer.parseInt(getSchedParams(FP_POLICY_NAME, FP_PARAM_ECLASS).getValue());
	}

	private SchedulingParameter getSchedParams(final String key, final EClass eClass) {
		for(SchedulingParameter v: task.getSchedParams()) {
			if (key.equals(v.getName())) {
				return v;
			}
		}
		final SchedulingParameter sp = (SchedulingParameter)grmFactory.create(eClass);
		sp.setName(key);
		task.getSchedParams().add(sp);
		return sp;
	}

	public TaskBuilder has(StepBuilder... steps) {
		for(StepBuilder step: steps) {
			step.setTask(this);
			ownedSteps.add(step);
		}
		return this;
	}
	
	public TaskBuilder running(StepBuilder aStep) {
		return has(aStep);
	}

	public TaskBuilder ofET(final String value) {
		return ofBCET(value).ofWCET(value);
	}

	public TaskBuilder ofJitter(final String value) {
		jitter = value;
		return this;
	}

	public TaskBuilder runsInSequence(StepBuilder... steps) {
		has(steps);
		StepBuilder prev = null;
		for(StepBuilder step: steps) {
			if (prev != null) {
				prev.activates(step);
			}
			prev = step;
		}
		return this;
	}
	
	public TaskBuilder thatRunsInSequence(StepBuilder... steps) {
		return runsInSequence(steps);
	}

	public String getName() {
		return task.getName();
	}

	public void addOwnedResource(final Resource value) {
		task.getOwnedResource().add(value);
	}
	
	public void addOwnedResource(final TaskBuilder value) {
		task.getOwnedResource().add(value.task);
	}

	public Collection<Resource> getOwnedResource() {
		return task.getOwnedResource();
	}
}
