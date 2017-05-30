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
package org.polarsys.time4sys.design2analysis;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.analysis.AnalysisFactory;
import org.polarsys.time4sys.analysis.AnalyzedSystem;
import org.polarsys.time4sys.analysis.ComputingResource;
import org.polarsys.time4sys.analysis.EventModel;
import org.polarsys.time4sys.analysis.Offset;
import org.polarsys.time4sys.analysis.Task;
import org.polarsys.time4sys.builder.analysis.AnalysisBuilder;
import org.polarsys.time4sys.builder.analysis.ComputingResourceBuilder;
import org.polarsys.time4sys.builder.analysis.TaskBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.gqam.ArrivalPattern;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.grm.ProcessingResource;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourcePackage;
import org.polarsys.time4sys.analysis.Scheduler;
import org.polarsys.time4sys.analysis.SchedulerPolicyKind;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.grm.SchedulingPolicy;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.model.time4sys.Project;

/**
 * @author loic
 *
 */
public class Design2AnalysisTransformer {

	public static void transform(final Project project) {
		new Design2AnalysisTransformer(project).transform();
	}
	
	private final Project project;
	private DesignModel designModel;
	private AnalyzedSystem anaSys;
	private AnalysisBuilder analysis;
	private Map<Step, Task> maps = new HashMap<>();
	private Map<Resource, Scheduler> schedMaps = new HashMap<>();
	private Map<ProcessingResource, ComputingResource> hw = new HashMap<>();

	/**
	 * This is an helper class.
	 */
	protected Design2AnalysisTransformer(final Project project) {
		assert(project != null);
		this.project = project;
		designModel = project.getDesign();
		anaSys = project.getAnalysis();
		analysis = new AnalysisBuilder(anaSys);
		assert(designModel != null);
		assert(anaSys != null);
	}

	public void transform() {
		transformScheduler();
		transformPeriodic();
		adjustDeadlineBackward();
	}
	
	/**
	 * Adjust offset and deadline to keep same critical delay
	 */
	private void adjustDeadlineBackward() {
		boolean propagationHasHappen = true;
		while (propagationHasHappen) {
			propagationHasHappen = false;
			for(BehaviorScenario behav: designModel.getWorkloadBehavior().getBehavior()) {
				for(PrecedenceRelation rel: behav.getConnectors()) {
					for(Step pred: rel.getPredec()) {
						for(Step succ: rel.getSucces()) {
							propagationHasHappen = adjustDeadlineBackward(propagationHasHappen, pred, succ);
						}
					}
				}
				for(Step pred: behav.getSteps()) {
					for(OutputPin opin: pred.getOutputPin()) {
						for(InputPin ipin: opin.getSuccessors()) {
							final Step succ = (Step)ipin.eContainer();
							propagationHasHappen = adjustDeadlineBackward(propagationHasHappen, pred, succ);
						}
					}
				}
			}
		}
	}

	public boolean adjustDeadlineBackward(boolean propagationHasHappen, final Step pred, final Step succ) {
		System.out.println(pred.getName() + " -> " + succ.getName());
		final Task predTask = mapsTo(pred);
		final TaskBuilder p = new TaskBuilder(analysis, predTask);
		final Task succTask = mapsTo(succ);
		final TaskBuilder s = new TaskBuilder(analysis, succTask);
		final Duration dp = p.getDeadline();
		final Duration ds = s.getDeadline();
		if (ds != null && ((dp == null && ds != null) || (dp.compareTo(ds) > 0))) {
			p.updateDeadline(s.getDeadline());
			propagationHasHappen = true;
		}
		return propagationHasHappen;
	}

	private void searchForScheduler(List<?> resources) {
		for(Object elt: resources) {
			if (elt instanceof ResourcePackage) {
				searchForScheduler(((ResourcePackage) elt).getOwnedElement());
			}
			if (elt instanceof Resource) {
				searchForScheduler(((Resource)elt).getOwnedResource());
				if (elt instanceof org.polarsys.time4sys.marte.grm.ProcessingResource) {
					final ProcessingResource designProcessingResource = (org.polarsys.time4sys.marte.grm.ProcessingResource)elt;
					final ComputingResourceBuilder cr = analysis.hasComputingResource().called(designProcessingResource.getName());
					final ComputingResource cpr = cr.build();
					hw.put(designProcessingResource, cpr);
					cpr.setScheduler(schedMaps.get(designProcessingResource.getMainScheduler()));
				}
			}
			if (elt instanceof org.polarsys.time4sys.marte.grm.Scheduler) {
				final org.polarsys.time4sys.marte.grm.Scheduler sched = (org.polarsys.time4sys.marte.grm.Scheduler)elt;
				final Scheduler anaSched = transform(sched);
				schedMaps.put(sched, anaSched);
				for(ProcessingResource res: sched.getProcessingUnits()) {
					anaSched.setUsedBy(hw.get(res));
					schedMaps.put(res, anaSched);
				}
			}
		}
	}
	
	private Scheduler transform(org.polarsys.time4sys.marte.grm.Scheduler sched) {
		return analysis.hasAScheduler().called(sched.getName()).withPolicy(transform(sched.getPolicy())).build();
	}

	private SchedulerPolicyKind transform(final SchedulingPolicy policy) {
		switch(policy.getPolicy()) {
		case EARLIEST_DEADLINE_FIRST:
			return SchedulerPolicyKind.EDF;
		case FIFO:
			return SchedulerPolicyKind.FIFO;
		case FIXED_PRIORITY:
			return SchedulerPolicyKind.FIXED_PRIORITY;
		case ROUND_ROBIN:
			return SchedulerPolicyKind.ROUND_ROBIN;
		default:
			return null;
		}
	}

	protected void transformScheduler() {
		searchForScheduler(designModel.getResourcePackage().getOwnedElement());
	}

	protected void transformPeriodic() {

		for(WorkloadEvent evt: designModel.getWorkloadBehavior().getDemand()) {
			final ConcurrentLinkedQueue<Step> steps = new ConcurrentLinkedQueue<>();
			BehaviorScenario behavior = evt.getEffect();
			if (behavior instanceof Step) {
				final Step step = (Step)behavior;
				steps.add(step);
				final PrecedenceRelation outputRel = step.getOutputRel();
				if (outputRel != null) {
					steps.addAll(outputRel.getSucces());
				}
			}
			steps.addAll(behavior.getSteps());
			
			while(!steps.isEmpty()) {
				final Step step = steps.poll();
				final String name = step.getConcurRes().getName() + " - " + step.getName();
				if (notAlreadyMapped(step)) {
					final Scheduler anaScheduler = schedMaps.get(step.getConcurRes().getHost());
					final TaskBuilder tb = analysis.hasATask()
						.called(name)
						.ofBCET(step.getBestCET())
						.ofWCET(step.getWorstCET())
						.withEventModel(transform(evt.getPattern()))
						.withScheduler(anaScheduler);
					final EObject designTaskOwner = step.getConcurRes().eContainer();
					if (designTaskOwner instanceof ProcessingResource) {
						tb.setMappedTo(hw.get(designTaskOwner));
					}
					for(SchedulingParameter schedParam: step.getConcurRes().getSchedParams()) {
						if ("Deadline".equals(schedParam.getName())) {
							tb.setDeadline(schedParam.getValue());
						} else if ("FixedPriority".equals(schedParam.getName())) {
							tb.setPriority(Integer.parseInt(schedParam.getValue()));
						}
					}
					mapsTo(step, tb);
				}
				if (step.getInputRel() != null || !step.getInputPin().isEmpty()) {
					initOffsetForward(step);
				}
				final PrecedenceRelation outputRel = step.getOutputRel();
				if (outputRel != null) {
					steps.addAll(outputRel.getSucces());
				}
				for(OutputPin opin: step.getOutputPin()) {
					for(InputPin ipin: opin.getSuccessors()) {
						final Step sucStep = (Step)ipin.eContainer();
						steps.add(sucStep);
					}
				}
			}
		}
	}

	private void initOffsetForward(final Step step) {
		final TaskBuilder tb = new TaskBuilder(analysis, mapsTo(step));
		Duration maxOffset = NfpFactory.eINSTANCE.createDuration();
		if (step.getInputRel() != null) {
			for(Step predecessor: step.getInputRel().getPredec()) {
				final Task prev = mapsTo(predecessor);
				maxOffset = computeMaxOffset(maxOffset, prev);
			}
		}
		for(InputPin ipin: step.getInputPin()) {
			for(OutputPin opin: ipin.getPredecessors()) {
				final Task prev = mapsTo((Step)opin.eContainer());
				maxOffset = computeMaxOffset(maxOffset, prev);
			}
		}
		if (maxOffset.notZero()) {
			tb.updateOffset(maxOffset);
		}
	}

	public Duration computeMaxOffset(Duration maxOffset, final Task prev) {
		if (prev != null) {
			for(Offset offset: prev.getEventModel().getOffsets()) {
				maxOffset = maxOffset.max(offset.getValue());
			}
		}
		return maxOffset;
	}

	private boolean notAlreadyMapped(final Step step) {
		return !isAlreadyMapped(step);
	}

	private boolean isAlreadyMapped(final Step step) {
		return maps.containsKey(step);
	}

	private void mapsTo(final Step step, final TaskBuilder tb) {
		maps.put(step, tb.build());
	}

	private Task mapsTo(final Step step) {
		return maps.get(step);
	}

	private EventModel transform(final ArrivalPattern pattern) {
		final EventModel evt = AnalysisFactory.eINSTANCE.createEventModel();
		if (pattern instanceof PeriodicPattern) {
			final PeriodicPattern p = (PeriodicPattern)pattern;
			evt.setPeriod(p.getPeriod());
			evt.setJitter(p.getJitter());
			if (p.getPhase() != null) {
				Offset o = AnalysisFactory.eINSTANCE.createOffset();
				o.setValue(p.getPhase());
				o.setEventModel(evt); //equivalent to evt.getOffsets().add(o);
			}
		} else {
			//TODO
			throw new UnsupportedOperationException("Not yet implemented for " + pattern.getClass().getSimpleName());
		}
		return evt;
	}
}
