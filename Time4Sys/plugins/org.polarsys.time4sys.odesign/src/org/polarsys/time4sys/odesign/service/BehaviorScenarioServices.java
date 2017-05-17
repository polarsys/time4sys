/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.odesign.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.BorderedStyle;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.EdgeStyle;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.diagram.business.internal.metamodel.helper.MappingHelper;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.style.BorderedStyleDescription;
import org.eclipse.sirius.diagram.description.style.EdgeStyleDescription;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.RGBValues;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.swt.graphics.RGB;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.gqam.ArrivalPattern;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.BurstPattern;
import org.polarsys.time4sys.marte.gqam.ClosedPattern;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.SlidingWindowPattern;
import org.polarsys.time4sys.marte.gqam.SporadicPattern;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadBehavior;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.odesign.helper.DiagramHelper;
import org.polarsys.time4sys.odesign.helper.ShapeUtil;

@SuppressWarnings("restriction")
public class BehaviorScenarioServices {	
	  
	 private static final Integer THICK_BORDER_SIZE = Integer.valueOf(4);
	 
	 private static BehaviorScenarioServices instance;

	  public static BehaviorScenarioServices getService() {
	    if (instance == null) {
	      instance = new BehaviorScenarioServices();
	    }
	    return instance;
	  }
	  
	/**
	 * Returns the best function through the elements collection
	 */
	public Step getBestStep(Step element, Collection<? extends EObject> elements) {
		EObject current = element;
		while (current != null) {
			if (current instanceof Step && elements.contains(current)) {
				return (Step) current;
			}
			current = current.eContainer();
		}
		return null;
	}
	
	 /**
	  * @param function
	  * @param displayedFunctions
	  * @return the function or one of its container contained in the map keys
	  */
	 public Set<DDiagramElement> getBestDisplayedStep(Step function, Map<Step, Set<DDiagramElement>> displayedFunctions) {
		 if (displayedFunctions.containsKey(function)) {
			 return displayedFunctions.get(function);
		 }
		 EObject ancestor = function.eContainer();
		 while ((ancestor != null) && (ancestor instanceof Step)) {
			 if (displayedFunctions.containsKey(ancestor)) {
				 return displayedFunctions.get(ancestor);
			 }
			 ancestor = ancestor.eContainer();
		 }
		 return null;
	 }
	
	public void updateBehaviorScenarioStyles(DDiagram diagram) {
		HashMap<BehaviorScenario, DNode> displayedBS = new HashMap<BehaviorScenario, DNode>(); // displayed Behavior Scenario
		HashMap<OutputPin, Set<DEdge>> displayedOP = new HashMap<OutputPin, Set<DEdge>>(); // displayed Precedence Relations
		HashMap<BehaviorScenario, Set<DEdge>> displayedIR = new HashMap<BehaviorScenario, Set<DEdge>>(); // displayed Internal Relations
		HashMap<Step, Set<DDiagramElement>> displayedSteps = new HashMap<Step, Set<DDiagramElement>>(); // displayed Steps
		HashMap<DDiagramElement, Set<BehaviorScenario>> coloreSteps = new HashMap<DDiagramElement, Set<BehaviorScenario>>(); // colored steps
		Set<BehaviorScenario> incompleteBS = new HashSet<BehaviorScenario>(); // incomplete displayed behavior scenario
		HashMap<DEdge, Set<BehaviorScenario>> coloredOP = new HashMap<DEdge, Set<BehaviorScenario>>(); // colored precedence relations

		// find displayed Behavior Scenario and functions
		for (DNode aNode : diagram.getNodes()) {
		  EObject target = aNode.getTarget();
		  if (target instanceof BehaviorScenario && !(target instanceof Step)) {
				displayedBS.put((BehaviorScenario) target, aNode);
			}
		}
		// find displayed Steps
		for (DNode aNode : diagram.getNodes()) {
			EObject target = aNode.getTarget();
			if (target instanceof Step) {
				Set<DDiagramElement> set = displayedSteps.get(target);
				if (set == null) {
					set = new HashSet<DDiagramElement>();
					displayedSteps.put((Step) target, set);
				}
				set.add(aNode);
			}
		}
		for (DDiagramElement aContainer : diagram.getContainers()) {
			EObject target = aContainer.getTarget();
			if ((target instanceof Step)) {
				Set<DDiagramElement> set = displayedSteps.get(target);
				if (set == null) {
					set = new HashSet<DDiagramElement>();
					displayedSteps.put((Step) target, set);
				}
				set.add(aContainer);
			}
		}

		// find displayed Precedence Relations
		for (DEdge anEdge : diagram.getEdges()) {
			EObject edgeTarget = anEdge.getTarget();
			if (edgeTarget instanceof OutputPin) {
				OutputPin fe = (OutputPin) edgeTarget;
				Set<DEdge> edges = displayedOP.get(fe);
				if (edges == null) {
					edges = new HashSet<DEdge>();
					displayedOP.put(fe, edges);
				}
				edges.add(anEdge);
			}
			if (edgeTarget instanceof BehaviorScenario) {
				if (!displayedIR.containsKey(edgeTarget)) {
					Set<DEdge> newSet = new HashSet<DEdge>();
					newSet.add(anEdge);
					displayedIR.put((BehaviorScenario) edgeTarget, newSet);
				} else {
					displayedIR.get(edgeTarget).add(anEdge);
				}
			}
		}
		
		// find source and target functions that must be colored
		for (Entry<BehaviorScenario, DNode> me : displayedBS.entrySet()) {
			for (Step step : me.getKey().getSteps()) {
			  // source Node of the functional chain
			  Set<DDiagramElement> stepNodes = displayedSteps.get(step);//use getBestDisplayedFunctionNode(aSourceFunction, displayedSteps); instead (when all steps are not represented)
				if (stepNodes != null) {
					for (DDiagramElement stepNode : stepNodes) {
						if (!coloreSteps.containsKey(stepNode)) {
							Set<BehaviorScenario> newSet = new HashSet<BehaviorScenario>();
							newSet.add(me.getKey());
							coloreSteps.put(stepNode, newSet);
						} else {
							coloreSteps.get(stepNode).add(me.getKey());
						}
					}
				}
				for (OutputPin anExchange : step.getOutputPin()) {
					if (displayedOP.containsKey(anExchange)) {
						Set<DEdge> exchangeEdges = displayedOP.get(anExchange);
						for (DEdge exchangeEdge : exchangeEdges) {
							if (!coloredOP.containsKey(exchangeEdge)) {
								Set<BehaviorScenario> newSet = new HashSet<BehaviorScenario>();
								newSet.add(me.getKey());
								coloredOP.put(exchangeEdge, newSet);
							} else {
								coloredOP.get(exchangeEdge).add(me.getKey());
							}
						}
					}
				}
			}
		}

		// remove links if the Behavior Scenario is not displayed
		for (Entry<BehaviorScenario, Set<DEdge>> me : displayedIR.entrySet()) {
			if (!displayedBS.containsKey(me.getKey())) {
				for (DEdge anEdge : me.getValue()) {
					DiagramServices.getDiagramServices().removeEdgeView(anEdge);
				}
			}
		}

		// update functions style
		for (Entry<Step, Set<DDiagramElement>> me : displayedSteps.entrySet()) {
			Set<DDiagramElement> functionNodes = me.getValue();
			for (DDiagramElement functionNode : functionNodes) {
				if (!coloreSteps.containsKey(functionNode)) {
					resetFunctionStyle(functionNode);
				}
			}
		}

		// customize source and target function styles
		for (Entry<BehaviorScenario, DNode> me : displayedBS.entrySet()) {
			if (!(me.getKey() instanceof Step)) {
			updateBehaviorScenarioNodeColor(me.getValue(), displayedBS.values()); 
			RGBValues color = ShapeUtil.getNodeColorStyle(me.getValue());
			if (color == null) {
				continue;
			}
			// customize source function of the Behavior Scenario
			for (Step aSourceFunction : me.getKey().getSteps()) {
			  // source Node of the functional chain
			  Set<DDiagramElement>  sourceFunctionNodes = getBestDisplayedStep(aSourceFunction, displayedSteps);
				if (sourceFunctionNodes != null) {
					for (DDiagramElement sourceFunctionNode : sourceFunctionNodes) {
						if (coloreSteps.get(sourceFunctionNode).size() == 1) {
							customizeStepStyle(sourceFunctionNode, color);
							// color the border of the source function with the color of the functional chain
						} else {
							// color source function in red
							customizeStepStyle(sourceFunctionNode, ShapeUtil.getBlackColor());
						}
					}
				}
			}

			// customize functional exchanges
				for (Step step : me.getKey().getSteps()) {
					for (OutputPin anExchange : step.getOutputPin()) {
						if (displayedOP.containsKey(anExchange)) {
							Set<DEdge> currentEdges = displayedOP.get(anExchange);
							for (DEdge currentEdge : currentEdges) {
								if ((coloredOP.get(currentEdge).size() == 1)) {
									customizePrecedenceRelationEdgeStyle(currentEdge, color);
								} else {
									customizePrecedenceRelationEdgeStyle(currentEdge, ShapeUtil.getBlackColor());
								}
							}
						} else {
							incompleteBS.add(me.getKey());
						}
					}
				}
			me.getValue().refresh();
		}
	}

		// reset functional exchanges with no functional chain
		for (Set<DEdge> aFEs : displayedOP.values()) {
			for (DEdge aFE : aFEs) {
				if (!coloredOP.containsKey(aFE)) {
					resetOutputPinStyle(aFE);
				}
			}
		}
	}
	
	/**
	 * @param aEdge
	 */
	 public void resetOutputPinStyle(DEdge aEdge) {
		 DiagramElementMapping mapping = DiagramServices.getDiagramServices().getEdgeMapping(aEdge);
		 if (mapping != null) {
			 // get default style size of an edge
			 EdgeStyleDescription desc =
					 (EdgeStyleDescription) getMappingHelper(aEdge).getBestStyleDescription(mapping, aEdge.getTarget(), aEdge, aEdge.eContainer(),
							 DiagramHelper.getService().getDiagramContainer(aEdge));
			 String defaultStyleSize = desc.getSizeComputationExpression();
			 // get current style size of an edge
			 EdgeStyle edgeStyle = aEdge.getOwnedStyle();
			 Integer currentSize = edgeStyle.getSize();

			 if ((null != currentSize) && (null != defaultStyleSize)) {
				 // apply style & color : if currentSize is equal to default size + if current size is equal to default size of Functional Chain
				 if (currentSize.equals(THICK_BORDER_SIZE) || currentSize.equals(defaultStyleSize)) {
					 if (ShapeUtil.resetEdgeThickStyle(aEdge, Integer.valueOf(defaultStyleSize))) {
						 ShapeUtil.resetEdgeColorStyle(aEdge, ShapeUtil.getDefaultColor(aEdge, desc, desc.getStrokeColor()));
					 }
				 }
			 }
		 }
	 }
	
	public void customizePrecedenceRelationEdgeStyle(DEdge edge, RGBValues color) {
		 // get current style size of an edge
		 EdgeStyle edgeStyle = edge.getOwnedStyle();
		 Integer currentSize = edgeStyle.getSize();

		 // get default style size of an edge
		 DiagramElementMapping mapping = DiagramServices.getDiagramServices().getEdgeMapping(edge);
		 if (mapping != null) {
			 EdgeStyleDescription desc =
					 (EdgeStyleDescription) getMappingHelper(edge).getBestStyleDescription(mapping, edge.getTarget(), edge, edge.eContainer(),
							 DiagramHelper.getService().getDiagramContainer(edge));
			 if (null != desc) {
				 // assuming it is an integer value
				 String defaultSize = desc.getSizeComputationExpression();
				 if ((null != defaultSize) && (null != currentSize)
						 && (currentSize.equals(Integer.valueOf(defaultSize)) || (currentSize.equals(THICK_BORDER_SIZE)))) {
					 // apply change
					 customizeEdgeStyle(edge, color);
				 }
			 }
		 }
	 }
	
	 public void customizeEdgeStyle(DEdge edge, RGBValues color) {
		 RGB rgbColor = new RGB(color.getRed(), color.getGreen(), color.getBlue());
		 ShapeUtil.setEdgeColorStyle(edge, rgbColor);
		 ShapeUtil.setEdgeThickStyle(edge, THICK_BORDER_SIZE);
	 }
	
	/**
	 * @param sourceNode
	 * @param targetNode
	 * @param color
	 * @return
	 */
	public DEdge createInternalLink(EdgeTarget sourceNode, EdgeTarget targetNode, BehaviorScenario bs, RGBValues color) {
		DDiagram diagram = DiagramHelper.getService().getDiagramContainer(sourceNode);
		EdgeMapping mapping = getInternLinkEdgeMapping(diagram);
		DEdge newEdge = DiagramServices.getDiagramServices().findDEdgeElement(diagram, sourceNode, targetNode, bs, mapping);
		if (newEdge == null) {
			DiagramServices.getDiagramServices().createEdge(mapping, sourceNode, targetNode, bs);
			newEdge = DiagramServices.getDiagramServices().findDEdgeElement(diagram, sourceNode, targetNode, bs, mapping);
		}
		return newEdge;
	}
	
	public EdgeMapping getInternLinkEdgeMapping(DDiagram diagram) {
			return DiagramServices.getDiagramServices().getEdgeMapping(diagram, "OutputPin");
	}
	
	 public void customizeStepColor(DDiagramElement functionNode, RGBValues color) {
		 // Change color border style
		 RGB rgbColor = new RGB(color.getRed(), color.getGreen(), color.getBlue());
		 if (functionNode instanceof AbstractDNode) {
			 ShapeUtil.setBorderColorStyle(((AbstractDNode) functionNode), rgbColor);
		 }
	 }
	 
	 public void customizeStepStyle(DDiagramElement functionNode, RGBValues color) {
		 customizeStepColor(functionNode, color);
		 if (functionNode instanceof AbstractDNode) {
			 ShapeUtil.setBorderStyle(((AbstractDNode) functionNode), THICK_BORDER_SIZE);
		 }
	 }

	 public void updateBehaviorScenarioNodeColor(DNode fcNode, Collection<DNode> visibleBehaviorScenarios) {
		 RGBValues color = ShapeUtil.getNodeColorStyle(fcNode);
		 LinkedList<RGB> colorList = new LinkedList<RGB>();

		 RGB blue = new RGB(24, 114, 248);
		 RGB yellow = new RGB(249, 252, 103);
		 RGB purple = new RGB(160, 32, 240);
		 RGB gray = new RGB(136, 136, 136);
		 RGB orange = new RGB(255, 165, 0);
		 RGB green = new RGB(34, 139, 34);
		 RGB brown = new RGB(165, 42, 42);

		 colorList.addLast(blue);
		 colorList.addLast(brown);
		 colorList.addLast(orange);
		 colorList.addLast(green);
		 colorList.addLast(purple);
		 colorList.addLast(yellow);
		 colorList.addLast(gray);

		 boolean changeColor = false;

		 if (ShapeUtil.isSameColor(color, gray)) {
			 changeColor = true;
		 }
		 for (DNode aFc : visibleBehaviorScenarios) {
			 if (!aFc.equals(fcNode)) {
				 RGBValues nodeColor = ShapeUtil.getNodeColorStyle(aFc);
				 if (ShapeUtil.isSameColor(nodeColor, color)) {
					 changeColor = true;
				 }
				 ShapeUtil.removeColorFromList(nodeColor, colorList);
			 }
		 }
		 if (!changeColor) {
			 return;
		 }
		 if (!colorList.isEmpty()) {
			 ShapeUtil.setColorStyle(fcNode, colorList.get(0));
		 }
	 }
	
	 /**
	  * @param value
	  * @param displayedFC
	  */
	public boolean resetFunctionStyle(DDiagramElement functionNode) {
		 boolean result = false;
		 String defaultStyleSize = null;
		 Integer currentSize = null;
		 BorderedStyle style = null;

		 if (functionNode instanceof AbstractDNode) {
			 AbstractDNode node = (AbstractDNode) functionNode;
			 BorderedStyleDescription desc =
					 (BorderedStyleDescription) getMappingHelper(functionNode).getBestStyleDescription(functionNode.getDiagramElementMapping(),
							 functionNode.getTarget(), functionNode, functionNode.eContainer(), DiagramHelper.getService().getDiagramContainer(functionNode));

			 if(desc != null){
				 defaultStyleSize = desc.getBorderSizeComputationExpression();
				 style = (BorderedStyle) ShapeUtil.getCurrentStyle(node);
				 if(style != null){
					 currentSize = style.getBorderSize();
				 }


				 if ((null != currentSize) && (null != defaultStyleSize)) {
					 // apply style & color : if currentSize is equal to default size + if current size is equal to default size of Functional Chain
					if (currentSize.equals(THICK_BORDER_SIZE) || currentSize.equals(THICK_BORDER_SIZE) || currentSize.equals(defaultStyleSize)) {
						 if (ShapeUtil.resetBorderStyle(node, Integer.valueOf(desc.getBorderSizeComputationExpression()))) {
							 if (ShapeUtil.resetBorderColorStyle(node, ShapeUtil.getDefaultColor(node, desc, desc.getBorderColor()))) {
								 result = true;
							 }
						 }
					 }
				 }
			 }
		 }

		 return result;
	 }

	public MappingHelper getMappingHelper(DSemanticDecorator semanticDecorator) {
		  return new MappingHelper(SiriusPlugin.getDefault().getInterpreterRegistry().getInterpreter(semanticDecorator.getTarget()));
	  }
	  
//	getFlatBehaviorScenarioLastFunctions
//	resetPrecedenceRelationStyle
//	customizePrecedenceRelationEdgeStyle
//	getFlatPrecedenceRelations
//	getBestDisplayedFunctionNode
	
	  /**
	   * Retrieves the extremum steps of a Behavior Scernario.
	   * @param bs a Behavior Scenario
	   * @return Collection of Steps
	   */
	  public static Collection<Step> getScenarioEnds(BehaviorScenario bs) {
	    Set<Step> result = new HashSet<Step>();

	    for (Step step : bs.getSteps()) {
	    	if ((step.getOutputRel() == null) || (step.getInputRel() == null)){//TODO:CHANGE THAT
	    		result.add(step);
	    	}
	    }
			return result;
		}
	
	 public EObject createBehaviorScenario(EObject context, List<EObject> views) {
		 if (!views.isEmpty()) {
			 BehaviorScenario bs = GqamFactory.eINSTANCE.createBehaviorScenario();
			 bs.setName("Behavior Scenario");
			 
			 for (EObject aSelectedElement : views) {
				 if ((aSelectedElement instanceof DDiagramElement) && (((DDiagramElement) aSelectedElement).getTarget() != null)) {
					 EObject obj = ((DDiagramElement) aSelectedElement).getTarget();
					 
					 if (obj instanceof OutputPin){
						 OutputPin pr = (OutputPin) obj;
							 if (!(obj.eContainer() instanceof Step)){
								 BehaviorScenario oldBS = (BehaviorScenario) pr.eContainer();
								 //Initialize new behavior scenario container
								 if (bs.eContainer() == null){
									 WorkloadBehavior wb = (WorkloadBehavior) oldBS.eContainer();
									 wb.getBehavior().add(bs);
								 	}
								 }
						}
					 
					 if (obj instanceof Step){
						 Step step = (Step) obj;
						 if (!(step.getParentStep() instanceof Step)){
							 //Initialize new behavior scenario container
							 if (bs.eContainer() == null){
								 WorkloadBehavior wb = (WorkloadBehavior) step.getScenario().eContainer();
								 wb.getBehavior().add(bs);
							 	}
							 bs.getSteps().add(step);
							 }
					 }
				 }
			}
		 }
		 return context;
	 }
	 
	 public static boolean isValidBehaviorScenarioSelection(EObject context, List<EObject> views) {
		 if (!views.isEmpty()) {
			 for (EObject select : views) {
				 if (! (((select instanceof DNode) && ((DNode) select).getTarget() instanceof Step) ||
						 (((select instanceof DEdge) && ((DEdge) select).getTarget() instanceof OutputPin)))) {
					 return false;
				 }
			 }
		 }
		 return true;
	 }
	 
	 public void addPeriodicEventOnStep(EObject bs){
		 PeriodicPattern pp = GqamFactory.eINSTANCE.createPeriodicPattern();
		 if (bs instanceof BehaviorScenario) {
			 BehaviorScenario behaviorScenario = (BehaviorScenario) bs;
			 ArrivalPattern arrivalPattern = (ArrivalPattern) pp;
			 EObject container = bs.eContainer();
			 while (!(container instanceof DesignModel)){
				 container = container.eContainer();
			 }
			 DesignModel dm = (DesignModel) container;
			 WorkloadEvent we = GqamFactory.eINSTANCE.createWorkloadEvent();
			 dm.getWorkloadBehavior().getDemand().add(we);
			 we.setPattern(arrivalPattern);
			 behaviorScenario.getCause().add(we);
		}
	 }

	 public void addSporadicEventOnStep(EObject bs){
		 SporadicPattern pp = GqamFactory.eINSTANCE.createSporadicPattern();
		 if (bs instanceof BehaviorScenario) {
			 BehaviorScenario behaviorScenario = (BehaviorScenario) bs;
			 ArrivalPattern arrivalPattern = (ArrivalPattern) pp;
			 EObject container = bs.eContainer();
			 while (!(container instanceof DesignModel)){
				 container = container.eContainer();
			 }
			 DesignModel dm = (DesignModel) container;
			 WorkloadEvent we = GqamFactory.eINSTANCE.createWorkloadEvent();
			 dm.getWorkloadBehavior().getDemand().add(we);
			 we.setPattern(arrivalPattern);
			 behaviorScenario.getCause().add(we);
		}
	 }
	 
	 public void addClosedEventOnStep(EObject bs){
		 ClosedPattern pp = GqamFactory.eINSTANCE.createClosedPattern();
		 if (bs instanceof BehaviorScenario) {
			 BehaviorScenario behaviorScenario = (BehaviorScenario) bs;
			 ArrivalPattern arrivalPattern = (ArrivalPattern) pp;
			 EObject container = bs.eContainer();
			 while (!(container instanceof DesignModel)){
				 container = container.eContainer();
			 }
			 DesignModel dm = (DesignModel) container;
			 WorkloadEvent we = GqamFactory.eINSTANCE.createWorkloadEvent();
			 dm.getWorkloadBehavior().getDemand().add(we);
			 we.setPattern(arrivalPattern);
			 behaviorScenario.getCause().add(we);
		}
	 }
	 
	 public void addSlidingWindowEventOnStep(EObject bs){
		 SlidingWindowPattern pp = GqamFactory.eINSTANCE.createSlidingWindowPattern();
		 if (bs instanceof BehaviorScenario) {
			 BehaviorScenario behaviorScenario = (BehaviorScenario) bs;
			 ArrivalPattern arrivalPattern = (ArrivalPattern) pp;
			 EObject container = bs.eContainer();
			 while (!(container instanceof DesignModel)){
				 container = container.eContainer();
			 }
			 DesignModel dm = (DesignModel) container;
			 WorkloadEvent we = GqamFactory.eINSTANCE.createWorkloadEvent();
			 dm.getWorkloadBehavior().getDemand().add(we);
			 we.setPattern(arrivalPattern);
			 behaviorScenario.getCause().add(we);
		}
	 }
	 
	 public void addBurstEventOnStep(EObject bs){
		 BurstPattern pp = GqamFactory.eINSTANCE.createBurstPattern();
		 if (bs instanceof BehaviorScenario) {
			 BehaviorScenario behaviorScenario = (BehaviorScenario) bs;
			 ArrivalPattern arrivalPattern = (ArrivalPattern) pp;
			 EObject container = bs.eContainer();
			 while (!(container instanceof DesignModel)){
				 container = container.eContainer();
			 }
			 DesignModel dm = (DesignModel) container;
			 WorkloadEvent we = GqamFactory.eINSTANCE.createWorkloadEvent();
			 dm.getWorkloadBehavior().getDemand().add(we);
			 we.setPattern(arrivalPattern);
			 behaviorScenario.getCause().add(we);
		}
	 }
	 
	 
	 
//	  For scenario diagram tests (NOT WORKING)
//	 
//	  public static Set<SchedulableResource> getSchedulableResourceOrder(BehaviorScenario scenario) {
//		  Set<SchedulableResource> schedulableResources = new HashSet<SchedulableResource>();
//		    if (scenario == null) {
//		      return new HashSet<SchedulableResource>();
//		    }
//		    for (Step step : scenario.getSteps()) {
//				schedulableResources.add(step.getConcurRes());
//				schedulableResources.remove(null);
//			};
//			return schedulableResources;
//		  }
//
//		/**
//		 * Get ends ordering.
//		 *
//		 * @param interaction
//		 *            Interaction
//		 * @param eventEnds
//		 *            Event ends
//		 * @return Ends ordering
//		 */
//		public Set<EventEndsCouple> getEndsOrdering(BehaviorScenario bs, List<EventEndsCouple> eventEnds) {
//			final Set<EventEndsCouple> endsOrderingSet = ImmutableSet.copyOf(getEndsOrdering(bs));
//			final Set<EventEndsCouple> eventEndsSet = ImmutableSet.copyOf(eventEnds);
//			final Sets.SetView<EventEndsCouple> intersection = Sets.intersection(endsOrderingSet, eventEndsSet);
//			return intersection;
//		}
//		
//		/**
//		 * the ordered list of all <Step,PrecedenceRelation> couples
//		 *
//		 * @param Behavior Scenario
//		 * @return the ordered list of all EventEndsCouple
//		 */
//		public List<EventEndsCouple> getEndsOrdering(BehaviorScenario bs) {
//
//			final List<EventEndsCouple> result = new BasicEList<EventEndsCouple>();
//
//			final Step currentStep = bs.getRoot();
//			result.add(new EventEndsCouple<Step, EObject>(currentStep, bs));
//			
//			if (currentStep.getOutputRel() != null) {
//				result.addAll(getEndsOrdering(currentStep,currentStep.getOutputRel()));
//			}
//			return result;
//		}
//
//		private List<EventEndsCouple<Step, EObject>> getEndsOrdering(Step currentStep, PrecedenceRelation outputRel) {
//			// TODO Auto-generated method stub
//			final List<EventEndsCouple<Step, EObject>> result = new BasicEList<EventEndsCouple<Step, EObject>>();
//			result.add(new EventEndsCouple<Step, EObject>(currentStep,outputRel));
//			for (Step step : outputRel.getSucces()) {
//				if (step.getOutputRel() == null) {
//					result.add(new EventEndsCouple<Step, EObject>(step,null));
//				} else {
//					result.addAll(getEndsOrdering(step, step.getOutputRel()));
//				}
//			}
//			return result;
//		}
//
//		public EventEndsCouple<Step, EObject> getStartingEnd(EObject obj){
//			if (obj instanceof Step){
//				Step step = (Step) obj;
//				if (step.getInputRel() == null){
//					return new EventEndsCouple<Step, EObject>(step, step.getParentStep());
//				} else {
//					PrecedenceRelation inputRel=step.getInputRel();
//					return new EventEndsCouple<Step, EObject>(inputRel.getPredec().get(0),inputRel );
//				}
//			}
//				return null;
//		}
//		
//		public EventEndsCouple<Object, Object> getFinishingEnd(EObject obj){
//			if (obj instanceof Step){
//				Step step = (Step) obj;
//				if (step.getOutputRel() == null){
//					return new EventEndsCouple<Object, Object>(step, null);
//				} else {
//					return new EventEndsCouple<Object, Object>(step, step.getOutputRel());
//				}
//			}
//			return null;
//		}	  
//	  
}
