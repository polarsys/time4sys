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
package org.polarsys.time4sys.builder.design;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.grm.EDFParameters;
import org.polarsys.time4sys.marte.grm.FixedPriorityParameters;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * @author loic
 *
 */
public class TaskBuilder implements SchedulableResourceBuilder<SoftwareSchedulableResource, TaskBuilder> {

	public static final String EDF_POLICY_NAME = "EDF";
	public static final String FP_POLICY_NAME = "FixedPriority";
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
	protected EClass fpParamEClass;
	private boolean isSporadic = false;
	private String minInterarrival;
	private String maxInterarrival;
	private boolean isActivatedOnce = false;
	private ReferenceBuilder ref;
	private String offset;
	private ReferenceBuilder reference;

	
	public TaskBuilder() {
		this(FP_PARAM_ECLASS);
	}

	public TaskBuilder(final EClass pssParamEclass) {
		this(null, srmFactory.createSoftwareSchedulableResource(), pssParamEclass);
	}
	
	public TaskBuilder(final DesignBuilder designBuilder, final SoftwareSchedulableResource raw) {
		this(designBuilder, raw, FP_PARAM_ECLASS);
	}
	
	public TaskBuilder(final DesignBuilder designBuilder, final SoftwareSchedulableResource raw, final EClass fpParamEClass) {
		assert(raw != null);
		task = raw;
		if (designBuilder == null) {
			EObject container = raw;
			do {
				container = container.eContainer();
			} while (container != null && !(container instanceof DesignModel));
			if (container != null && container instanceof DesignModel) {
				design = new DesignBuilder((DesignModel)container);
			}
		} else {
			design = designBuilder;
		}
		this.fpParamEClass = fpParamEClass;
	}


	public SoftwareSchedulableResource build(final DesignBuilder design) {
		this.design = design;
		if (period != null) {
			firstStep().isPeriodic(period);
		}
		if (offset != null) {
			firstStep().ofOffset(offset);
		}
		if (reference != null) {
			firstStep().ofReference(reference);
		}
		if (windowSize != null) {
			firstStep().withSlidingWindow(nbEvents, windowSize).withReference(ref);
		}
		if (isSporadic) {
			firstStep().isSporadic(minInterarrival, maxInterarrival).withReference(ref);
		}
		if (isActivatedOnce) {
			firstStep().isActivatedOnce().withReference(ref);
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
	
	public Duration getPeriod() {
		if (design != null) {
			build();
			return firstStep().getPeriod();
		}
		return null;
	}
	

	public TaskBuilder ofOffset(String value) {
		offset = value;
		return this;
	}
	
	public Duration getOffset() {
		if (design != null) {
			build();
			return firstStep().getOffset();
		}
		return null;
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
		
		final Duration val = NfpFactory.eINSTANCE.createDurationFromString(value);
		setDeadline(val);
		/* NB: An EndToEndFlow will also be created later */
		deadline = value;
		return this;
	}
	
	public void setDeadline(final Duration value) {
		final EDFParameters edfParam = (EDFParameters)getSchedParams(EDF_POLICY_NAME, EDF_PARAM_ECLASS);
		edfParam.setDeadline(value);
	}
	
	public EDFParameters getEDFSchedParams(final boolean buildIfNone) {
		return (EDFParameters)getSchedParams(EDF_POLICY_NAME, buildIfNone ? EDF_PARAM_ECLASS : null);
	}
	
	public FixedPriorityParameters getFPSchedParams(final boolean buildIfNone) {
		return (FixedPriorityParameters)getSchedParams(FP_POLICY_NAME, buildIfNone ? fpParamEClass : null);
	}

	public Duration getDeadline() {
		final EDFParameters edfParam = (EDFParameters)getSchedParams(EDF_POLICY_NAME, null);
		if (edfParam == null) {
			if (firstStep != null) {
				return firstStep.getPeriod();
			}
			return null;
		}
		return edfParam.getDeadline();
	}
	
	public TaskBuilder ofPriority(final int value) {
		final FixedPriorityParameters schedParam = (FixedPriorityParameters)getSchedParams(FP_POLICY_NAME, fpParamEClass);
		//schedParam.setValue(Integer.toString(value));
		schedParam.setPriority(value);
		return this;
	}
	
	public int getPriority() {
		final FixedPriorityParameters fp = (FixedPriorityParameters) getSchedParams(FP_POLICY_NAME, fpParamEClass);
		return fp.getPriority();
	}

	protected SchedulingParameter getSchedParams(final String key, final EClass eClass) {
		for(SchedulingParameter v: task.getSchedParams()) {
			if (key.equals(v.getName())) {
				return v;
			}
		}
		if (eClass == null) {
			return null;
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

	public EAnnotation annotate(final String source) {
		return Annotations.annotate(task, source);
	}

	public boolean hasAnnotation(final String source) {
		return Annotations.hasAnnotation(task, source);
	}
	
	public void unsetAnnotationAttr(final String source, final String attrname) {
		Annotations.unsetAnnotationAttr(task, source, attrname);
	}

	public TaskBuilder aperiodic() {
		return sporadic(null, null);
	}

	private TaskBuilder sporadic(final String min, final String max) {
		this.isSporadic = true;
		this.minInterarrival = min;
		this.maxInterarrival = max;
		return this;
	}
	public TaskBuilder withSingleActivation() {
		this.isActivatedOnce  = true;
		return this;
	}

	public void withReference(final ReferenceBuilder reference) {
		ref = reference;
		if (design != null && firstStep != null) {
			firstStep().withReference(ref);
		}
	}
	
	public ReferenceBuilder getReference() {
		return firstStep().getReference();
	}

	public DesignBuilder design() {
		return design;
	}

	public TaskBuilder ofReference(final ReferenceBuilder value) {
		reference = value;
		return this;
	}
}
