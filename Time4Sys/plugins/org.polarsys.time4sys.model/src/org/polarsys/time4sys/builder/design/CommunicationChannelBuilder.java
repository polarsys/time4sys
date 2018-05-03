/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.builder.design;

import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.marte.gqam.CommunicationChannel;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * @author loic
 *
 */
public class CommunicationChannelBuilder implements SchedulableResourceBuilder<CommunicationChannel, CommunicationChannelBuilder> {

	protected static DesignFactory df = DesignFactory.eINSTANCE;
	protected static GqamFactory gqamFactory = GqamFactory.eINSTANCE;
	protected static SrmFactory srmFactory = SrmFactory.eINSTANCE;
	protected static GrmFactory grmFactory = GrmFactory.eINSTANCE;
	protected static HrmFactory hrmFactory = HrmFactory.eINSTANCE;
	protected static NfpFactory nfpFactory = NfpFactory.eINSTANCE;
	
	public static CommunicationChannelBuilder aMessage() {
		return new CommunicationChannelBuilder();
	}
	

	private String period;
	private CommunicationChannel task;
	private StepBuilder firstStep;
	private DesignBuilder design;
	private String wcet;
	private String bcet;
	private String jitter;
	private int nbEvents = 1;
	private String windowSize;
	private Boolean isAtomic = null;
	
	public CommunicationChannelBuilder() {
		this(null, gqamFactory.createCommunicationChannel());
	}
	
	public CommunicationChannelBuilder(final DesignBuilder designBuilder, final CommunicationChannel raw) {
		assert(raw != null);
		task = raw;
		design = designBuilder;
	}

	public CommunicationChannel build(final DesignBuilder design) {
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
		if (isAtomic != null) {
			firstStep().isAtomic(isAtomic);
		}
		return task;
	}

	public CommunicationChannelBuilder ofPeriod(final String value) {
		period = value;
		return this;
	}
	
	public CommunicationChannelBuilder withSlidingWindow(final int nbEvents, final String windowSize) {
		this.nbEvents = nbEvents;
		this.windowSize = windowSize;
		period = null;
		return this;
	}
	
	public CommunicationChannelBuilder called(final String value) {
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
				return new CommunicationStepBuilder(design, this, step);
			}
		}
		// otherwise create it
		firstStep = new CommunicationStepBuilder(design, this);
		firstStep().called(task.getName());
		firstStep().build();
		return firstStep;
	}
	
	public StepBuilder anotherStep() {
		final StepBuilder res = new CommunicationStepBuilder(design, this);
		res.setChannel(this);
		return res;
	}


	public CommunicationChannelBuilder ofWCET(final String value) {
		wcet = value;
		return this;
	}

	public CommunicationChannelBuilder ofBCET(final String value) {
		bcet = value;
		return this;
	}

	public StepBuilder whoseFirstStep() {
		return firstStep();
	}

	public CommunicationChannelBuilder ofDeadline(final String value) {
		getSchedParams("Deadline").setValue(value);
		return this;
	}
	
	public CommunicationChannelBuilder ofPriority(final int value) {
		getSchedParams("FixedPriority").setValue(Integer.toString(value));
		return this;
	}
	
	public int getPriority() {
		return Integer.parseInt(getSchedParams("FixedPriority").getValue());
	}

	private SchedulingParameter getSchedParams(final String key) {
		for(SchedulingParameter v: task.getSchedParams()) {
			if (key.equals(v.getName())) {
				return v;
			}
		}
		final SchedulingParameter sp = grmFactory.createSchedulingParameter();
		sp.setName(key);
		task.getSchedParams().add(sp);
		return sp;
	}

	public CommunicationChannelBuilder has(StepBuilder... steps) {
		for(StepBuilder step: steps) {
			step.setChannel(this);
		}
		return this;
	}

	public CommunicationChannelBuilder ofET(final String value) {
		return ofBCET(value).ofWCET(value);
	}

	public CommunicationChannelBuilder ofJitter(final String value) {
		jitter = value;
		return this;
	}

	public CommunicationChannelBuilder nonPreemptive() {
		isAtomic  = true;
		return this;
	}
}
