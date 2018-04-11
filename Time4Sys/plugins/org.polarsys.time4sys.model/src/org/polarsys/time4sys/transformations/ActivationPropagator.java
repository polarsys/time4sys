/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and code
 *******************************************************************************/
package org.polarsys.time4sys.transformations;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.builder.design.StepBuilder;
import org.polarsys.time4sys.builder.design.TaskBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Context;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.grm.EDFParameters;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Transformation;

/**
 * @author loic
 *
 */
public class ActivationPropagator extends AbstractTransformation {

	public static final String TRANS_NAME = ActivationPropagator.class.getSimpleName();
	public static final String CTRL2DATAFLOW_RULE = "control2data-flow rule";
	private static final String DEP_SRC_ROLE = "dependency source";
	private static final String DEP_TGT_ROLE = "dependency target";
	private static final String DEP2ACTIVATION_RULE = "dependency activation propagation rule";

	public static Transformation transform(final Project project, final DesignModel source) {
		return new ActivationPropagator(project, source).transform();
	}
	
	protected Queue<Link> controlFlowOutputPinWithCauseLnks = new LinkedList<>();
	private Context control2dataFlow;
	private Context dep2activationRule;
	
	/**
	 * @param project
	 * @param source
	 */
	public ActivationPropagator(final Project project, final DesignModel source) {
		super(project, source, TRANS_NAME);
	}

	@Override
	public void createRules() {
		super.createRules();
		control2dataFlow = mappingFactory.createContext(CTRL2DATAFLOW_RULE);
		mapping.getRules().add(control2dataFlow);
		dep2activationRule = mappingFactory.createContext(DEP2ACTIVATION_RULE);
		mapping.getRules().add(dep2activationRule);
	}
	
	@Override
	public void copied(final EObject source, final Link lnk, final EObject theCopy) {
		if (source instanceof OutputPin && ((OutputPin)source).isIsControl()) {
			final Step sourceStep = (Step)source.eContainer();
			if (sourceStep.getCause() != null && !sourceStep.getCause().isEmpty()) {
				controlFlowOutputPinWithCauseLnks.add(lnk);
			}
		}
	}

	@Override
	protected void finalize(final DesignModel target) {
		// Forward propagate activations
		while(!controlFlowOutputPinWithCauseLnks.isEmpty()) {
			final Link lnk = controlFlowOutputPinWithCauseLnks.poll();
			final OutputPin originalOutputPin = ((OutputPin)lnk.getUniqueSourceValue(IdentityDerivation.ORIGINAL_ROLE));
			final OutputPin copyOutputPin = ((OutputPin)lnk.getUniqueTargetValue(IdentityDerivation.COPY_ROLE));
			final Step copyStepWithCause = (Step)copyOutputPin.eContainer();
			copyOutputPin.setIsControl(false);
			lnk.setRationale(control2dataFlow);
			for (InputPin copyInputPin: copyOutputPin.getSuccessors()) {
				copyInputPin.setIsControl(false);
				for(Link lnkInput: mapping.getLinksForSlice(copyInputPin)) {
					lnkInput.setRationale(control2dataFlow);
					final InputPin originalInputPin = (InputPin) lnkInput.getUniqueSourceValue(COPY_ROLE);
					final Step copyNextStep = ((Step)copyInputPin.eContainer());
					propagate(target, originalOutputPin, originalInputPin, copyStepWithCause, copyNextStep, lnk);
					for(OutputPin outputPinWithNewlyCause: copyNextStep.getOutputPin()) {
						controlFlowOutputPinWithCauseLnks.addAll(mapping.getLinksForSlice(outputPinWithNewlyCause));
					}
				}
				
			}
		}
		// Backward sets the deadline
		final DesignBuilder targetDesignBuilder = new DesignBuilder(target);
		final Collection<Step> allSteps = targetDesignBuilder.allSteps();
		
		boolean needsUpate = true;
		while (needsUpate) {
			needsUpate = false;
			for (Step aStep : allSteps) {
				// Whenever there is a data-flow (formely control-flow)
				// dependencies tau_i -> tau_j
				for (InputPin ipin : aStep.getInputPin()) {
					for (OutputPin opin : ipin.getPredecessors()) {
						needsUpate = needsUpate || checkOrUpdate(targetDesignBuilder, (Step)ipin.eContainer(), (Step)opin.eContainer());
					}
				}
			}
		}
	}

	protected boolean checkOrUpdate(DesignBuilder resultingDesign, final Step target, Step source) {
		final StepBuilder step_i = new StepBuilder(resultingDesign, source);
		final StepBuilder step_j = new StepBuilder(resultingDesign, target);
		final Duration d_i = step_i.getDeadline();
		final Duration d_j = step_j.getDeadline();
		if (d_i == null || d_j == null) {
			return false;
		}
		if (d_i.compareTo(d_j) > 0) {
			step_i.getTask().setDeadline(d_j);
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param copyDesign
	 * @param originalOutputPin
	 * @param originalInputPin
	 * @param copyStepWithCause
	 * @param copyNextStep
	 * @param lnk2 
	 */
	protected void propagate(
			final DesignModel copyDesign,
			final OutputPin originalOutputPin,
			final InputPin originalInputPin,
			final Step copyStepWithCause,
			final Step copyNextStep,
			final Link outputPinsLink) {
		assert(copyStepWithCause != null);
		final EDFParameters edfSchedParam = propagateDeadline(copyDesign, originalOutputPin, originalInputPin, copyStepWithCause.getConcurRes(), copyNextStep.getConcurRes(), outputPinsLink);
		final Duration delta = propagateWorkloadEvt(copyDesign, originalOutputPin, originalInputPin, copyStepWithCause, copyNextStep, outputPinsLink);
		if (delta != null && edfSchedParam != null) {
			edfSchedParam.setDeadline(edfSchedParam.getDeadline().sub(delta));
		}
	}
	
	protected EDFParameters propagateDeadline(
			final DesignModel copyDesign,
			final OutputPin originalOutputPin,
			final InputPin originalInputPin,
			final SchedulableResource copyTaskWithCause,
			final SchedulableResource copyNextTask,
			final Link outputPinsLink) {
		assert(copyTaskWithCause != null);
		final EDFParameters originalSchedParam = new TaskBuilder(null, (SoftwareSchedulableResource) copyTaskWithCause).getEDFSchedParams(false);
		EDFParameters nextSchedParam = new TaskBuilder(null, (SoftwareSchedulableResource) copyNextTask).getEDFSchedParams(false);
		if (nextSchedParam == null) {
			nextSchedParam = copyDeadline(copyDesign, originalOutputPin, originalInputPin, copyTaskWithCause, copyNextTask, outputPinsLink);
		}
		return nextSchedParam;
	}

	protected EDFParameters copyDeadline(DesignModel copyDesign, OutputPin originalOutputPin, InputPin originalInputPin,
			SchedulableResource copyTaskWithCause, SchedulableResource copyNextTask, Link outputPinsLink) {
		final EDFParameters toCopySchedParam = new TaskBuilder(null, (SoftwareSchedulableResource) copyTaskWithCause).getEDFSchedParams(false);
		if (toCopySchedParam == null) {
			return null;
		}
		final Copier copier = new EcoreUtil.Copier();
		final EDFParameters newSchedParams = (EDFParameters) copier.copy(toCopySchedParam);
		copyNextTask.getSchedParams().add(newSchedParams);
		copier.copyReferences();
		/*final Link lnk = mappingFactory.createLink();
		//lnk.getSources().add(mappingFactory.createMappableArtefact(ORIGINAL_ROLE, originalCause));
		lnk.getTargets().add(mappingFactory.createMappableArtefact(COPY_ROLE, newCause));
		lnk.getSources().add(mappingFactory.createMappableArtefact(DEP_SRC_ROLE, originalInputPin));
		lnk.getSources().add(mappingFactory.createMappableArtefact(DEP_TGT_ROLE, originalOutputPin));
		lnk.setRationale(dep2activationRule);
		outputPinsLink.getSubLinks().add(lnk);*/
		return newSchedParams;
	}

	/**
	 * Copy or merge WorkloadEvent from copyStepWithCause to copyNextStep
	 * @param copyDesign
	 * @param originalOutputPin
	 * @param originalInputPin
	 * @param copyStepWithCause
	 * @param copyNextStep
	 * @param lnk2 
	 */
	protected Duration propagateWorkloadEvt(
			final DesignModel copyDesign,
			final OutputPin originalOutputPin,
			final InputPin originalInputPin,
			final Step copyStepWithCause,
			final Step copyNextStep,
			final Link outputPinsLink) {

		Duration result = null;
		final Copier copier = new EcoreUtil.Copier();
		for(WorkloadEvent evt: copyStepWithCause.getCause()) {
			
			// Is there a similar cause? If yes merge, otherwise copy
			final WorkloadEvent similarEvt = findSimilar(copyNextStep, evt);
			if (similarEvt == null) {
				final Duration deadlineChange = copyWorkloadEvent(copyDesign, originalOutputPin, originalInputPin, copyNextStep, outputPinsLink, copier,
						evt);
				result = deadlineChange;//TODO
			} else {
				final Duration deadlineChange = mergeWorkloadEvent(similarEvt, originalOutputPin, originalInputPin, copyNextStep, outputPinsLink, copier, evt);
				result = deadlineChange;//TODO
			}
		}
		copier.copyReferences();
		return result;
	}
	
	protected WorkloadEvent findSimilar(final Step copyNextStep, final WorkloadEvent evt) {
		for(WorkloadEvent existingEvt: copyNextStep.getCause()) {
			if (evt.getPattern().getClass().isInstance(existingEvt.getPattern())) {
				return existingEvt;
			}
		}
		return null;
	}

	protected Duration mergeWorkloadEvent(
			WorkloadEvent similarEvt,
			OutputPin originalOutputPin,
			InputPin originalInputPin,
			Step copyNextStep,
			Link outputPinsLink,
			Copier copier,
			WorkloadEvent evt) {
		if (similarEvt.getPattern() instanceof PeriodicPattern) {
			final PeriodicPattern mergedPattern = (PeriodicPattern)similarEvt.getPattern();
			final PeriodicPattern mergeePattern = (PeriodicPattern)evt.getPattern();
			return mergePeriodicPattern(mergeePattern, mergedPattern);
		} else {
			throw new IllegalArgumentException("Propagation of " + similarEvt.getPattern().getClass().getSimpleName() + " kind of activation is unknown.");
		}
	}

	private Duration mergePeriodicPattern(final PeriodicPattern mergeePattern, final PeriodicPattern mergedPattern) {
		return mergeOffset(mergeePattern, mergedPattern);
	}
	
	/**
	 *
	 * @param mergeePattern
	 * @param mergedPattern
	 * @return the difference between new value and old value, or null
	 */
	private Duration mergeOffset(final PeriodicPattern mergeePattern, final PeriodicPattern mergedPattern) {
		if (mergeePattern.eIsSet(GqamPackage.eINSTANCE.getArrivalPattern_Phase())) {
			if (mergedPattern.eIsSet(GqamPackage.eINSTANCE.getArrivalPattern_Phase())) {
				final Duration oldValue = mergedPattern.getPhase();
				mergedPattern.setPhase(mergedPattern.getPhase().max(mergeePattern.getPhase()));
				return mergedPattern.getPhase().sub(oldValue);
			} else {
				mergedPattern.setPhase(mergeePattern.getPhase());
				return mergedPattern.getPhase();
			}
		}
		return null;
	}

	protected Duration copyWorkloadEvent(final DesignModel copyDesign, final OutputPin originalOutputPin,
			final InputPin originalInputPin, final Step copyNextStep, final Link outputPinsLink, final Copier copier,
			WorkloadEvent evt) {
		final WorkloadEvent newCause = (WorkloadEvent)copier.copy(evt);
		newCause.setName(newCause.getName() + "_x_" + copyNextStep.getName());
		copyDesign.getWorkloadBehavior().getDemand().add(newCause);
		copyNextStep.getCause().add(newCause);
		
		
		final Link lnk = mappingFactory.createLink();
		//lnk.getSources().add(mappingFactory.createMappableArtefact(ORIGINAL_ROLE, originalCause));
		lnk.getTargets().add(mappingFactory.createMappableArtefact(COPY_ROLE, newCause));
		lnk.getSources().add(mappingFactory.createMappableArtefact(DEP_SRC_ROLE, originalInputPin));
		lnk.getSources().add(mappingFactory.createMappableArtefact(DEP_TGT_ROLE, originalOutputPin));
		lnk.setRationale(dep2activationRule);
		outputPinsLink.getSubLinks().add(lnk);
		
		if (newCause.getPattern() instanceof PeriodicPattern) {
			return ((PeriodicPattern)newCause.getPattern()).getPhase();
		} else {
			return null;
		}
	}

}
