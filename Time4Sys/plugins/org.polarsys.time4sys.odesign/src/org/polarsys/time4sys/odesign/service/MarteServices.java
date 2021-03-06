/*******************************************************************************
 * Copyright (c) 2016, 2018 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Aurelien Didier - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.odesign.service;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterSiriusVariables;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DEdgeSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeSpec;
import org.eclipse.sirius.tools.api.interpreter.InterpreterUtil;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.design.DesignPackage;
import org.polarsys.time4sys.marte.gqam.ArrivalPattern;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.BurstPattern;
import org.polarsys.time4sys.marte.gqam.ClosedPattern;
import org.polarsys.time4sys.marte.gqam.ConnectorKind;
import org.polarsys.time4sys.marte.gqam.ExecutionStep;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.MultiplicityElement;
import org.polarsys.time4sys.marte.gqam.Once;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.Pin;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;
import org.polarsys.time4sys.marte.gqam.Reference;
import org.polarsys.time4sys.marte.gqam.SlidingWindowPattern;
import org.polarsys.time4sys.marte.gqam.SporadicPattern;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadBehavior;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.grm.CommunicationResource;
import org.polarsys.time4sys.marte.grm.ProcessingResource;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.Scheduler;
import org.polarsys.time4sys.marte.hrm.HardwareComputingResource;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Time4sysPackage;
import org.polarsys.time4sys.odesign.helper.DiagramHelper;
import org.polarsys.time4sys.odesign.helper.EcoreUtil2;

@SuppressWarnings("restriction")
public class MarteServices {

	/**
	 * used everywhere
	 * 
	 * @param current
	 * @return current if it is a diagram or the diagram that contains current
	 *         if it is a DDiagramElement
	 */
	public DDiagram getDiagramContainer(EObject current) {
		DDiagram parent = DiagramHelper.getService().getDiagramContainer(current);

		if (parent == null) {
			EObject target = current;
			if ((current instanceof DSemanticDecorator) && (((DSemanticDecorator) current).getTarget() != null)) {
				target = ((DSemanticDecorator) current).getTarget();
			}
			Object oDiagram = InterpreterUtil.getInterpreter(target).getVariable(IInterpreterSiriusVariables.DIAGRAM);
			if ((oDiagram != null) && (oDiagram instanceof DDiagram)) {
				return (DDiagram) oDiagram;
			}
		}

		return parent;
	}
	
	public CommunicationResource getContainingComunicationResource(EObject element) {
		CommunicationResource result = null;
		EObject container = element;
		while (!(container instanceof CommunicationResource || container instanceof DesignModel)) {
			container=container.eContainer();
		}
		if (container instanceof CommunicationResource) {
			result = (CommunicationResource) container;
		}
		return result;
	}

	public List<EObject> getBranchPrecedenceRelations(EObject context, EObject view) {

		return getPrecedenceRelations(view, ConnectorKind.BRANCH);

	}

	public List<EObject> getForkPrecedenceRelations(EObject context, EObject views) {
		return getPrecedenceRelations(views, ConnectorKind.FORK);
	}

	public List<EObject> getJoinPrecedenceRelations(EObject context, EObject views) {
		return getPrecedenceRelations(views, ConnectorKind.JOIN);
	}

	public List<EObject> getMergePrecedenceRelations(EObject context, EObject views) {
		return getPrecedenceRelations(views, ConnectorKind.MERGE);
	}

	public List<EObject> getPrecedenceRelations(EObject view, ConnectorKind kind) {
		List<EObject> precedenceRelations = new BasicEList<EObject>();
		if (view instanceof ExecutionStep) {
			ExecutionStep execStep = (ExecutionStep) view;
			PrecedenceRelation inputRelation = execStep.getInputRel();
			if (inputRelation != null) {
				if (inputRelation.getConnectorKind().equals(kind)) {
					precedenceRelations.add(inputRelation);
				}
			}
			PrecedenceRelation outputRelation = execStep.getOutputRel();
			if (outputRelation != null) {
				if (outputRelation.getConnectorKind().equals(kind)) {
					precedenceRelations.add(outputRelation);
				}
			}
		}
		return precedenceRelations;
	}

	public boolean isForkPrecedenceRelation(EObject context) {
		return ((PrecedenceRelation) context).getConnectorKind().equals(ConnectorKind.FORK);
	}

	public boolean isJoinPrecedenceRelation(EObject context) {
		return ((PrecedenceRelation) context).getConnectorKind().equals(ConnectorKind.JOIN);
	}

	public boolean isBranchPrecedenceRelation(EObject context) {
		return ((PrecedenceRelation) context).getConnectorKind().equals(ConnectorKind.BRANCH);
	}

	public boolean isMergePrecedenceRelation(EObject context) {
		return ((PrecedenceRelation) context).getConnectorKind().equals(ConnectorKind.MERGE);
	}

	public boolean isSequencePrecedenceRelation(EObject context) {
		return ((PrecedenceRelation) context).getConnectorKind().equals(ConnectorKind.SEQUENCE);
	}

	public String formatStepLabel(EObject context, EObject view) {
		if (view instanceof DNodeSpec) {
			if (((DNodeSpec) view).getTarget() instanceof Step) {
				Step step = (Step) ((DNodeSpec) view).getTarget();

				String result = "";
				if (step.getName() != null) {
					result = step.getName() + "\n";
				}
				result += "[";
				if (step.getBestCET() != null) {
					result += String.valueOf(step.getBestCET().getValue());
				}
				result += ":";
				if (step.getWorstCET() != null) {
					result += String.valueOf(step.getWorstCET().getValue());
				}
				result += "]";
				if (step.getWorstCET() != null) {
					result += step.getWorstCET().getUnit().getName();
				}

				return result;
			}
		}
		return "invalid label";
	}

	//
	public WorkloadEvent getWorkloadEvent(EObject context, EObject views) {
		if (views instanceof DesignModel) {
			DesignModel model = (DesignModel) views;
			if (context instanceof Step) {
				SoftwareSchedulableResource swSchedRes = (SoftwareSchedulableResource) context;
				// WARNING: only first scenario is considered ( get(0) )
				return getWorkloadEvent(swSchedRes, model);
			}
		}
		return null;
	}

	//
	public static WorkloadEvent getWorkloadEvent(SoftwareSchedulableResource swSchedRes, DesignModel model) {
		// WARNING: only first scenario is considered ( get(0) )
		for (Step step : model.getWorkloadBehavior().getBehavior().get(0).getSteps()) {
			if (step instanceof ExecutionStep) {
				// Look for the steps allocated on swSchedRes
				if (((ExecutionStep) step).getConcurRes().equals(swSchedRes)) {
					// Look for the step that has a WorloadEvent
					if ((step.getCause() != null) && (step.getCause().size() > 0)) {
						return step.getCause().get(0);
					}
				}
			}
		}
		return null;
	}

	public TimeInterval getTimeIntervalCET(EObject context, EObject views) {
		NfpFactory nfpfactory = NfpFactory.eINSTANCE;
		Duration min = nfpfactory.createDuration();
		Duration max = nfpfactory.createDuration();
		if (views instanceof DesignModel) {
			DesignModel model = (DesignModel) views;
			if (context instanceof SoftwareSchedulableResource) {
				SoftwareSchedulableResource swSchedRes = (SoftwareSchedulableResource) context;
				for (Step step : model.getWorkloadBehavior().getBehavior().get(0).getSteps()) {
					if (step instanceof ExecutionStep) {
						ExecutionStep execStep = (ExecutionStep) step;
						if (execStep.getConcurRes().equals(swSchedRes)) {
							min = min.add(nfpfactory.createDurationFromString(execStep.getBestCET().toString()));
							max = max.add(nfpfactory.createDurationFromString(execStep.getWorstCET().toString()));
						}
					}
				}
			} else if (context instanceof ExecutionStep) {
				ExecutionStep execStep = (ExecutionStep) context;
				min = nfpfactory.createDurationFromString(execStep.getBestCET().toString());
				max = nfpfactory.createDurationFromString(execStep.getWorstCET().toString());
			} else {
				return null;
			}
		}
		TimeInterval ti = nfpfactory.createTimeInterval();
		ti.setMin(min);
		ti.setMax(max);
		return ti;
	}

	//
	public int getPriority(EObject context) {
		if (context instanceof SoftwareSchedulableResource) {
			SoftwareSchedulableResource swSchedRes = (SoftwareSchedulableResource) context;
			return Integer.parseInt(swSchedRes.getSchedParams().get(0).getValue());
		}
		return 0;
	}

	// /**
	// * Used for conditional style on column Deadline
	// * @param context
	// * @return
	// */
	// public boolean deadlineLowerThanWcrt(EObject context) {
	// if(context instanceof EndToEndFlow){
	// EndToEndFlow endToEndFlow = (EndToEndFlow)context;
	// if(endToEndFlow.getEndToEndScenario() instanceof ExecutionStep){
	// ExecutionStep execStep =
	// (ExecutionStep)endToEndFlow.getEndToEndScenario();
	// if(execStep.getConcurRes() != null){
	// SoftwareSchedulableResource swSchedRes = (SoftwareSchedulableResource)
	// execStep.getConcurRes();
	// if(endToEndFlow.eContainer() instanceof DesignModel){
	// DesignModel model = (DesignModel)endToEndFlow.eContainer();
	// for(ResultSet resultSet: model.getResultSets()){
	// for(Result result: resultSet.getResults()){
	// if(result.getRefersTo().equals(swSchedRes)){
	// if(result instanceof TaskResult){
	// TaskResult taskResult = (TaskResult)result;
	// if(taskResult.getResponseTime().getMax() >
	// endToEndFlow.getEndToEndDeadline().getValue()){
	// return true;
	// }
	// }
	// }
	// }
	// }
	// }
	// }
	// }
	// }
	// return false;
	// }

	// /**
	// * Used for conditional style on column ResponseTime
	// * @param context_p
	// * @return
	// */
	// public boolean wcrtGreaterThanDeadline(EObject context_p) {
	//// if(context_p instanceof TaskResult){
	//// TaskResult taskResult = (TaskResult)context_p;
	//// if(taskResult.getRefersTo() instanceof SoftwareSchedulableResource){
	//// SoftwareSchedulableResource swSchedRes = (SoftwareSchedulableResource)
	// taskResult.getRefersTo();
	//// if(taskResult.getResultSet().getContainer() instanceof DesignModel){
	//// DesignModel model =
	// (DesignModel)taskResult.getResultSet().getContainer();
	//// for(EndToEndFlow endToEndFlow: model.getEndToEndFlows()){
	//// if(endToEndFlow.getEndToEndScenario() instanceof ExecutionStep){
	//// ExecutionStep executionStep =
	// (ExecutionStep)endToEndFlow.getEndToEndScenario();
	//// if(executionStep.getConcurRes().equals(swSchedRes)){
	//// if(taskResult.getResponseTime().getMax() >
	// endToEndFlow.getEndToEndDeadline().getValue()){
	//// return true;
	//// }
	//// }
	//// }
	//// }
	//// }
	//// }
	//// }
	// return false;
	// }

	public Duration getOffset(EObject context) {
		WorkloadEvent we = (WorkloadEvent) context;
		if (we != null) {
			if (we.getPattern() instanceof PeriodicPattern) {
				return ((PeriodicPattern) we.getPattern()).getPhase();
			}
		}
		return null;
	}

	public Duration getPeriod(EObject context) {
		WorkloadEvent we = (WorkloadEvent) context;
		if (we != null) {
			if (we.getPattern() instanceof PeriodicPattern) {
				return ((PeriodicPattern) we.getPattern()).getPeriod();
			}
		}
		return null;
	}

	public Duration getJitter(EObject context) {
		WorkloadEvent we = (WorkloadEvent) context;
		if (we != null) {
			if (we.getPattern() instanceof PeriodicPattern) {
				return ((PeriodicPattern) we.getPattern()).getJitter();
			}
		}
		return null;
	}

	public List<SoftwareSchedulableResource> getSwSchedulableResourcesOrderedByPriority(EObject context) {
		List<SoftwareSchedulableResource> sortedSwSchedRes = new BasicEList<SoftwareSchedulableResource>();
		if (context instanceof HardwareComputingResource) {
			HardwareComputingResource hcr = (HardwareComputingResource) context;
			for (Resource resource : hcr.getOwnedResource()) {
				if (resource instanceof SoftwareSchedulableResource) {
					SoftwareSchedulableResource swSchedRes = (SoftwareSchedulableResource) resource;
					int insertionIndex = 0;
					// WARNING First SchedulingParameter value considered as
					// priority
					Integer priority = Integer.valueOf(swSchedRes.getSchedParams().get(0).getValue());
					for (SoftwareSchedulableResource sortedSwSched : sortedSwSchedRes) {
						Integer sortedSwSchedPriority = Integer
								.parseInt(sortedSwSched.getSchedParams().get(0).getValue());
						if (sortedSwSchedPriority < priority) {
							insertionIndex++;
						} else {
							break;
						}
					}
					sortedSwSchedRes.add(insertionIndex, swSchedRes);

				}
			}
		}
		return sortedSwSchedRes;
	}

	public float createFloat(EObject context, int value) {
		return new Integer(value).floatValue();
	}

	public static DesignModel getDesign(EObject context) {
		final EClass designModelEClass = DesignPackage.eINSTANCE.getDesignModel();
		final EObject fContainer = EcoreUtil2.getFirstContainer(context,  designModelEClass);
		return DesignModel.class.cast(fContainer);
	}

	public void deleteConnection(DEdge views) {
		EObject source = views.getSourceNode();
		EObject target = views.getTargetNode();
		if (source instanceof DNode && target instanceof DNode) {
			EObject sourcePin = ((DNode) source).getTarget();
			EObject targetPin = ((DNode) target).getTarget();
			if (sourcePin instanceof OutputPin && targetPin instanceof InputPin) {
				OutputPin outputPin = (OutputPin) sourcePin;
				InputPin inputPin = (InputPin) targetPin;
				boolean hasMultipleOutputs = outputPin.getSuccessors().size() > 1;
				boolean hasMultipleInputs = inputPin.getPredecessors().size() > 1;
				if (hasMultipleOutputs) {
					outputPin.getSuccessors().remove(inputPin);
				} else {
					EcoreUtil.delete(outputPin);
				}
				if (hasMultipleInputs) {
					inputPin.getPredecessors().remove(outputPin);
				} else {
					EcoreUtil.delete(inputPin);
				}
			}
		}
	}

	public void createPrecedenceRelation(EObject sourceObj, EObject targetObj) {
		OutputPin outputPin = null;
		InputPin inputPin = null;
		if (sourceObj instanceof Step) {
			Step sourceStep = (Step) sourceObj;
			outputPin = GqamFactory.eINSTANCE.createOutputPin();
			sourceStep.getOutputPin().add(outputPin);

		} else if (sourceObj instanceof OutputPin) {
			outputPin = (OutputPin) sourceObj;
		}
		if (targetObj instanceof Step) {
			Step targetStep = (Step) targetObj;
			inputPin = GqamFactory.eINSTANCE.createInputPin();
			targetStep.getInputPin().add(inputPin);

		} else if (targetObj instanceof InputPin) {
			inputPin = (InputPin) targetObj;
		}
		if (outputPin != null && inputPin != null) {
			outputPin.getSuccessors().add(inputPin);
		}
	}

	public List<ArrivalPattern> getAllPatternInDiagram(EObject obj, EObject diagram) {
		List<ArrivalPattern> result = new ArrayList<ArrivalPattern>();
		if (obj instanceof DesignModel) {
			DesignModel design = (DesignModel) obj;
			result = getAllPatternInDesign(design);
			if (diagram instanceof DDiagram) {
				DDiagram dDiagram = (DDiagram) diagram;
				for (EObject controlPin : dDiagram.getDiagramElements()) {
					EObject target = ((DDiagramElement) controlPin).getTarget();
					if (target instanceof Pin) {
						result.add(((Pin) target).getPattern());
					}
				}
			}
		}
		return result;
	}

	public static List<ArrivalPattern> getAllPatternInDesign(DesignModel design) {
		List<ArrivalPattern> result = new ArrayList<ArrivalPattern>();
		for (WorkloadEvent demand : design.getWorkloadBehavior().getDemand()) {
			result.add(demand.getPattern());
		}
		return result;
	}

	public void deleteStep(DNode views) {
		EObject context = ((DNode) views).getTarget();
		if (context instanceof Step) {
			Step step = (Step) context;
			if (step.getInputRel() != null) {
				List<Step> inputRelBrother = step.getInputRel().getSucces();

				if (inputRelBrother.size() == 1) {
					step.getScenario().getConnectors().remove(step.getInputRel());
				}
				if (inputRelBrother.size() == 2) {
					step.getInputRel().setConnectorKind(ConnectorKind.SEQUENCE);
				}
			}
			if (step.getOutputRel() != null) {
				List<Step> outputRelBrother = step.getOutputRel().getPredec();
				if (outputRelBrother.size() == 1) {
					step.getScenario().getConnectors().remove(step.getOutputRel());
				}
				if (outputRelBrother.size() == 2) {
					step.getOutputRel().setConnectorKind(ConnectorKind.SEQUENCE);
				}
			}
			step.getScenario().getSteps().remove(step);
		}
	}

	public boolean hasDeadline2(EObject context) {
		if (context instanceof SoftwareSchedulableResource) {
			SoftwareSchedulableResource ssr = (SoftwareSchedulableResource) context;
			if (!ssr.getDeadlineElements().isEmpty()) {
				return true;
			}
		}
		return false;
	}

	public static void dragAndDropResourceToDiagram(EObject context, EObject diagram) {
		if (context instanceof ProcessingResource && diagram instanceof DesignModel) {
			ProcessingResource res = (ProcessingResource) context;
			DesignModel dm = (DesignModel) diagram;
			dm.getResourcePackage().getOwnedElement().add(res);
		}
	}

	public static List<ArrivalPattern> getArrivalPattern(EObject obj) {
		List<ArrivalPattern> results = new ArrayList<ArrivalPattern>();
		if (obj instanceof DesignModel) {
			DesignModel design = (DesignModel) obj;
			getAllPatternInDesign(design);
			for (Step step : getAllSteps(design.getWorkloadBehavior())) {
				for (OutputPin outputPin : step.getOutputPin()) {
					if (outputPin.getPattern() != null) {
						results.add(outputPin.getPattern());
					}
				}
				for (InputPin inputPin : step.getInputPin()) {
					if (inputPin.getPattern() != null) {
						results.add(inputPin.getPattern());
					}
				}
			}
		}
		return results;
	}

	private static List<Step> getAllSteps(WorkloadBehavior workloadBehavior) {
		List<Step> result = new ArrayList<Step>();
		for (BehaviorScenario bs : workloadBehavior.getBehavior()) {
			for (Step step : bs.getSteps()) {
				result.add(step);
				result.addAll(getAllSubSteps(step));
			}
		}
		return result;
	}

	private static List<Step> getAllSubSteps(Step step) {
		List<Step> result = new ArrayList<>();
		for (Step iStep : step.getSteps()) {
			result.add(iStep);
			result.addAll(getAllSubSteps(iStep));
		}
		return result;
	}

	public static void removeOldStimuli(EndToEndFlow current, ArrivalPattern oldStimuli) {
		current.getEndToEndStimuli().remove(oldStimuli.eContainer());
	}

	public static Scheduler getMainScheduler(EObject obj) {
		if (obj instanceof SoftwareSchedulableResource) {
			while (!(obj instanceof ProcessingResource || obj instanceof DesignModel)) {
				obj = obj.eContainer();
			}
		}
		if (obj instanceof ProcessingResource) {
			return ((ProcessingResource) obj).getMainScheduler();
		}
		return null;
	}

	public String computePortLabel(EObject self, EObject diagram) {
		MultiplicityElement mult = (MultiplicityElement) self;
		DDiagram diag = (DDiagram) diagram;
		if (DiagramServices.getDiagramServices().isFilterActivate("Hide Pins label", diag)) {
			return "";
		}
		return ("[" + mult.getLowerBound() + ":" + mult.getUpperBound() + "]");
	}

	public void removeInput(OutputPin output, EObject input) {
		output.getSuccessors().remove(input);
	}

	public void addPeriodicEventOnStep(EObject bs) {
		PeriodicPattern pp = GqamFactory.eINSTANCE.createPeriodicPattern();
		if (bs instanceof BehaviorScenario) {
			BehaviorScenario behaviorScenario = (BehaviorScenario) bs;
			ArrivalPattern arrivalPattern = (ArrivalPattern) pp;
			final DesignModel dm = getDesign(bs);
			WorkloadEvent we = GqamFactory.eINSTANCE.createWorkloadEvent();
			dm.getWorkloadBehavior().getDemand().add(we);
			we.setPattern(arrivalPattern);
			behaviorScenario.getCause().add(we);
		}
	}
	
	public void addOnceEventOnStep(EObject bs) {
		Once pp = GqamFactory.eINSTANCE.createOnce();
		if (bs instanceof BehaviorScenario) {
			BehaviorScenario behaviorScenario = (BehaviorScenario) bs;
			ArrivalPattern arrivalPattern = (ArrivalPattern) pp;
			final DesignModel dm = getDesign(bs);
			WorkloadEvent we = GqamFactory.eINSTANCE.createWorkloadEvent();
			dm.getWorkloadBehavior().getDemand().add(we);
			we.setPattern(arrivalPattern);
			behaviorScenario.getCause().add(we);
		}
	}

	public void addSporadicEventOnStep(EObject bs) {
		SporadicPattern pp = GqamFactory.eINSTANCE.createSporadicPattern();
		if (bs instanceof BehaviorScenario) {
			BehaviorScenario behaviorScenario = (BehaviorScenario) bs;
			ArrivalPattern arrivalPattern = (ArrivalPattern) pp;
			final DesignModel dm = getDesign(bs);
			WorkloadEvent we = GqamFactory.eINSTANCE.createWorkloadEvent();
			dm.getWorkloadBehavior().getDemand().add(we);
			we.setPattern(arrivalPattern);
			behaviorScenario.getCause().add(we);
		}
	}

	public void addClosedEventOnStep(EObject bs) {
		ClosedPattern pp = GqamFactory.eINSTANCE.createClosedPattern();
		if (bs instanceof BehaviorScenario) {
			BehaviorScenario behaviorScenario = (BehaviorScenario) bs;
			ArrivalPattern arrivalPattern = (ArrivalPattern) pp;
			final DesignModel dm = getDesign(bs);
			WorkloadEvent we = GqamFactory.eINSTANCE.createWorkloadEvent();
			dm.getWorkloadBehavior().getDemand().add(we);
			we.setPattern(arrivalPattern);
			behaviorScenario.getCause().add(we);
		}
	}

	public void addSlidingWindowEventOnStep(EObject bs) {
		SlidingWindowPattern pp = GqamFactory.eINSTANCE.createSlidingWindowPattern();
		if (bs instanceof BehaviorScenario) {
			BehaviorScenario behaviorScenario = (BehaviorScenario) bs;
			ArrivalPattern arrivalPattern = (ArrivalPattern) pp;
			final DesignModel dm = getDesign(bs);
			WorkloadEvent we = GqamFactory.eINSTANCE.createWorkloadEvent();
			dm.getWorkloadBehavior().getDemand().add(we);
			we.setPattern(arrivalPattern);
			behaviorScenario.getCause().add(we);
		}
	}

	public void addBurstEventOnStep(EObject bs) {
		BurstPattern pp = GqamFactory.eINSTANCE.createBurstPattern();
		if (bs instanceof BehaviorScenario) {
			BehaviorScenario behaviorScenario = (BehaviorScenario) bs;
			ArrivalPattern arrivalPattern = (ArrivalPattern) pp;
			final DesignModel dm = getDesign(bs);
			WorkloadEvent we = GqamFactory.eINSTANCE.createWorkloadEvent();
			dm.getWorkloadBehavior().getDemand().add(we);
			we.setPattern(arrivalPattern);
			behaviorScenario.getCause().add(we);
		}
	}

	public void setEffect(EObject source, EObject target) {
		if (source instanceof ArrivalPattern && target instanceof Step) {
			ArrivalPattern ap = (ArrivalPattern) source;
			if (ap.eContainer() instanceof WorkloadEvent) {
				WorkloadEvent we = (WorkloadEvent) ap.eContainer();
				we.setEffect((Step) target);
			}
		}
	}

	public boolean isValidReferenceSelection(EObject context, List<EObject> views) {
		for (EObject select : views) {
			if (select instanceof DNode) {
				EObject target = ((DNode) select).getTarget();
				if (!(target instanceof ArrivalPattern)) {
					return false;
				}
			}
		}
		return true;
	}

	public void createReference(EObject context, List<EObject> views) {
		Reference ref = GqamFactory.eINSTANCE.createReference();
		if (context instanceof ArrivalPattern){
			WorkloadBehavior wb = (WorkloadBehavior)((ArrivalPattern)context).getParent().eContainer();
			wb.getReferences().add(ref);
			ref.setReferenceName("Reference "+ wb.getReferences().size());
		}
		for (EObject select : views) {
			EObject target = ((DNode) select).getTarget();
			((ArrivalPattern) target).setReference(ref);
		}
	}

}
