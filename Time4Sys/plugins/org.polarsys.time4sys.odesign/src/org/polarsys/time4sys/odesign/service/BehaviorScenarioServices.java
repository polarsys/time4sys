/*******************************************************************************
 * Copyright (c) 2016, 2018 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Aurelien Didier - initial API and implementation
 *     Loïc Fejoz      - Arinc653 related implemenetation 
 *******************************************************************************/
package org.polarsys.time4sys.odesign.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.BorderedStyle;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.EdgeStyle;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.diagram.business.internal.metamodel.helper.MappingHelper;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeContainerSpec;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.style.BorderedStyleDescription;
import org.eclipse.sirius.diagram.description.style.EdgeStyleDescription;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.RGBValues;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.swt.graphics.RGB;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653MIFBuilder;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653PlatformBuilder;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653SpareTaskBuilder;
import org.polarsys.time4sys.builder.design.posix.PosixSporadicServerBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.gqam.ArrivalPattern;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.FlowInvolvedElement;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.InputPin;
import org.polarsys.time4sys.marte.gqam.OutputPin;
import org.polarsys.time4sys.marte.gqam.Reference;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadBehavior;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.grm.TableEntryType;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;
import org.polarsys.time4sys.marte.sam.SamFactory;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.odesign.helper.DiagramHelper;
import org.polarsys.time4sys.odesign.helper.EcoreUtil2;
import org.polarsys.time4sys.odesign.helper.ShapeUtil;

@SuppressWarnings("restriction")
public class BehaviorScenarioServices {

	private static final Integer THICK_BORDER_SIZE = Integer.valueOf(1);

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
	public Set<DDiagramElement> getBestDisplayedFIE(FlowInvolvedElement function,
			HashMap<FlowInvolvedElement, Set<DDiagramElement>> displayedFunctions) {
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

	/**
	 * @param function
	 * @param displayedFunctions
	 * @return the function or one of its container contained in the map keys
	 */
	public Set<DDiagramElement> getBestDisplayedStep(FlowInvolvedElement function,
			HashMap<Step, Set<DDiagramElement>> displayedFunctions) {
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

	/**
	 * @param aEdge
	 */
	public void resetOutputPinStyle(DEdge aEdge) {
		DiagramElementMapping mapping = DiagramServices.getDiagramServices().getEdgeMapping(aEdge);
		if (mapping != null) {
			// get default style size of an edge
			EdgeStyleDescription desc = (EdgeStyleDescription) getMappingHelper(aEdge).getBestStyleDescription(mapping,
					aEdge.getTarget(), aEdge, aEdge.eContainer(),
					DiagramHelper.getService().getDiagramContainer(aEdge));
			String defaultStyleSize = desc.getSizeComputationExpression();
			// get current style size of an edge
			EdgeStyle edgeStyle = aEdge.getOwnedStyle();
			Integer currentSize = edgeStyle.getSize();

			if ((null != currentSize) && (null != defaultStyleSize)) {
				// apply style & color : if currentSize is equal to default size
				// + if current size is equal to default size of Functional
				// Chain
				if (currentSize.equals(THICK_BORDER_SIZE) || currentSize.equals(defaultStyleSize)) {
					if (ShapeUtil.resetEdgeThickStyle(aEdge, Integer.valueOf(defaultStyleSize))) {
						ShapeUtil.resetEdgeColorStyle(aEdge,
								ShapeUtil.getDefaultColor(aEdge, desc, desc.getStrokeColor()));
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
			EdgeStyleDescription desc = (EdgeStyleDescription) getMappingHelper(edge).getBestStyleDescription(mapping,
					edge.getTarget(), edge, edge.eContainer(), DiagramHelper.getService().getDiagramContainer(edge));
			if (null != desc) {
				// assuming it is an integer value
				String defaultSize = desc.getSizeComputationExpression();
				if ((null != defaultSize) && (null != currentSize) && (currentSize.equals(Integer.valueOf(defaultSize))
						|| (currentSize.equals(THICK_BORDER_SIZE)))) {
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
	public DEdge createInternalLink(EdgeTarget sourceNode, EdgeTarget targetNode, BehaviorScenario bs,
			RGBValues color) {
		DDiagram diagram = DiagramHelper.getService().getDiagramContainer(sourceNode);
		EdgeMapping mapping = getInternLinkEdgeMapping(diagram);
		DEdge newEdge = DiagramServices.getDiagramServices().findDEdgeElement(diagram, sourceNode, targetNode, bs,
				mapping);
		if (newEdge == null) {
			DiagramServices.getDiagramServices().createEdge(mapping, sourceNode, targetNode, bs);
			newEdge = DiagramServices.getDiagramServices().findDEdgeElement(diagram, sourceNode, targetNode, bs,
					mapping);
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
			BorderedStyleDescription desc = (BorderedStyleDescription) getMappingHelper(functionNode)
					.getBestStyleDescription(functionNode.getDiagramElementMapping(), functionNode.getTarget(),
							functionNode, functionNode.eContainer(),
							DiagramHelper.getService().getDiagramContainer(functionNode));

			if (desc != null) {
				defaultStyleSize = desc.getBorderSizeComputationExpression();
				style = (BorderedStyle) ShapeUtil.getCurrentStyle(node);
				if (style != null) {
					currentSize = style.getBorderSize();
				}

				if ((null != currentSize) && (null != defaultStyleSize)) {
					// apply style & color : if currentSize is equal to default
					// size + if current size is equal to default size of
					// Functional Chain
					if (currentSize.equals(THICK_BORDER_SIZE) || currentSize.equals(THICK_BORDER_SIZE)
							|| currentSize.equals(defaultStyleSize)) {
						if (ShapeUtil.resetBorderStyle(node,
								Integer.valueOf(desc.getBorderSizeComputationExpression()))) {
							if (ShapeUtil.resetBorderColorStyle(node,
									ShapeUtil.getDefaultColor(node, desc, desc.getBorderColor()))) {
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
		return new MappingHelper(
				SiriusPlugin.getDefault().getInterpreterRegistry().getInterpreter(semanticDecorator.getTarget()));
	}

	// getFlatBehaviorScenarioLastFunctions
	// resetPrecedenceRelationStyle
	// customizePrecedenceRelationEdgeStyle
	// getFlatPrecedenceRelations
	// getBestDisplayedFunctionNode

	/**
	 * Retrieves the extremum steps of a Behavior Scernario.
	 * 
	 * @param bs
	 *            a Behavior Scenario
	 * @return Collection of Steps
	 */
	public static Collection<Step> getScenarioEnds(BehaviorScenario bs) {
		Set<Step> result = new HashSet<Step>();

		for (Step step : bs.getSteps()) {
			if ((step.getOutputRel() == null) || (step.getInputRel() == null)) {// TODO:CHANGE
																				// THAT
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
				if ((aSelectedElement instanceof DDiagramElement)
						&& (((DDiagramElement) aSelectedElement).getTarget() != null)) {
					EObject obj = ((DDiagramElement) aSelectedElement).getTarget();

					if (obj instanceof OutputPin) {
						OutputPin pr = (OutputPin) obj;
						if (!(obj.eContainer() instanceof Step)) {
							BehaviorScenario oldBS = (BehaviorScenario) pr.eContainer();
							// Initialize new behavior scenario container
							if (bs.eContainer() == null) {
								WorkloadBehavior wb = (WorkloadBehavior) oldBS.eContainer();
								wb.getBehavior().add(bs);
							}
						}
					}

					if (obj instanceof Step) {
						Step step = (Step) obj;
						if (!(step.getParentStep() instanceof Step)) {
							// Initialize new behavior scenario container
							if (bs.eContainer() == null) {
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

	public EndToEndFlow createETEF(EObject context, List<EObject> views) {
		EndToEndFlow etef = SamFactory.eINSTANCE.createEndToEndFlow();
		if (!views.isEmpty()) {
			etef.setName("End To End Flow");
			DesignModel design = MarteServices.getDesign(context);
			design.getEndToEndFlows().add(etef);
			Step step = null;
			for (EObject aSelectedElement : views) {
				if ((aSelectedElement instanceof DEdge) && (((DEdge) aSelectedElement).getTarget() != null)) {
					EObject obj = ((DDiagramElement) aSelectedElement).getTarget();
					if (obj instanceof ArrivalPattern) {
						WorkloadEvent we = ((ArrivalPattern) obj).getParent();
						etef.getEndToEndStimuli().add(we);
						step = (Step) we.getEffect();
						etef.getInvolvedElement().add(step);
					} else if (obj instanceof OutputPin) {
						if ((obj.eContainer() instanceof BehaviorScenario)) {
							OutputPin outputPin = (OutputPin) obj;
							InputPin inputPin = getTargetInputPin((DEdge) aSelectedElement);

							etef.getInvolvedElement().add(outputPin);
							etef.getInvolvedElement().add(inputPin);
							step = (Step) inputPin.eContainer();
							etef.getInvolvedElement().add(step);
						}
					}
				}
			}
			etef.setEndToEndScenario(step);
		}
		return etef;
	}

	private InputPin getTargetInputPin(DEdge aSelectedElement) {
		EdgeTarget targetNode = aSelectedElement.getTargetNode();
		if (targetNode instanceof DNode) {
			EObject target = ((DNode) targetNode).getTarget();
			if (target instanceof InputPin) {
				return (InputPin) target;
			}
		}
		return null;
	}

	public static boolean isValidBehaviorScenarioSelection(EObject context, List<EObject> views) {
		if (!views.isEmpty()) {
			for (EObject select : views) {
				if (!(((select instanceof DNode) && ((DNode) select).getTarget() instanceof Step)
						|| (((select instanceof DEdge) && ((DEdge) select).getTarget() instanceof OutputPin)))) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isValidETEFSelection(EObject context, List<EObject> views) {
		boolean isFirst = true;
		List<EObject> last = null;
		BehaviorScenario first = null;
		for (EObject select : views) {
			if (select instanceof DEdge) {
				EObject target = ((DEdge) select).getTarget();
				// first iteration
				if (isFirst) {
					if ((select instanceof DEdge) && target instanceof ArrivalPattern) {
						first = (((WorkloadEvent) ((ArrivalPattern) target).eContainer()).getEffect());
					} else {
						return false;
					}
					isFirst = false;
				}

				else if (select instanceof DEdge && target instanceof OutputPin) {
					// the second iteration
					if (first != null && target.eContainer().equals(first)) {
						first = null;
						last = getNextSteps(target);
					} else if (last.contains(target.eContainer())) {
						// third and other iteration
						last = getNextSteps(target);
					}
				} else {
					return false;
				}
			}
		}
		return true;
	}

	private static List<EObject> getNextSteps(EObject target) {
		List<EObject> last;
		last = new ArrayList<>();
		for (InputPin succesors : ((OutputPin) target).getSuccessors()) {
			last.add(succesors.eContainer());
		}
		return last;
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

	public void updateBehaviorScenarioStyles(DDiagram diagram) {

		// displayed Behavior Scenario
		HashMap<BehaviorScenario, DNode> displayedBS = new HashMap<BehaviorScenario, DNode>();
		// displayed Precedence Relations
		HashMap<PrecedenceRelation<OutputPin, InputPin>, Set<DEdge>> displayedPR = new HashMap<PrecedenceRelation<OutputPin, InputPin>, Set<DEdge>>();
		// displayed Steps
		HashMap<Step, Set<DDiagramElement>> displayedSteps = new HashMap<Step, Set<DDiagramElement>>();
		// colored Steps
		HashMap<DDiagramElement, Set<BehaviorScenario>> coloreSteps = new HashMap<DDiagramElement, Set<BehaviorScenario>>();
		// incomplete displayed behavior scenario steps
		Set<BehaviorScenario> incompleteBS = new HashSet<BehaviorScenario>();
		// colored precedence relations
		HashMap<DEdge, Set<BehaviorScenario>> coloredPR = new HashMap<DEdge, Set<BehaviorScenario>>();

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
				OutputPin op = (OutputPin) edgeTarget;
				for (InputPin ip : op.getSuccessors()) {
					if ((anEdge.getTargetNode() instanceof DNode)
							&& (((DNode) anEdge.getTargetNode()).getTarget() == ip)) {
						Set<DEdge> edges = displayedPR.get(op);
						PrecedenceRelation<OutputPin, InputPin> oiPR = new PrecedenceRelation<OutputPin, InputPin>(op,
								ip);
						if (edges == null) {
							edges = new HashSet<DEdge>();
							displayedPR.put(oiPR, edges);
						}
						edges.add(anEdge);
					}
				}
			}
		}

		// find source and target functions that must be colored
		for (Entry<BehaviorScenario, DNode> me : displayedBS.entrySet()) {
			for (Step step : me.getKey().getSteps()) {
				// source Node of the functional chain
				Set<DDiagramElement> stepNodes = displayedSteps.get(step);// use
																			// getBestDisplayedFunctionNode(aSourceFunction,
																			// displayedSteps);
																			// instead
																			// (when
																			// all
																			// steps
																			// are
																			// not
																			// represented)

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

				for (OutputPin op : step.getOutputPin()) {
					for (InputPin ip : op.getSuccessors()) {
						PrecedenceRelation<OutputPin, InputPin> oiPR = new PrecedenceRelation<OutputPin, InputPin>(op,
								ip);
						if ((((Step) op.eContainer()).getScenario() == ((Step) ip.eContainer()).getScenario())
								&& displayedPR.containsKey(oiPR)) {
							Set<DEdge> exchangeEdges = displayedPR.get(oiPR);
							for (DEdge exchangeEdge : exchangeEdges) {
								if (!coloredPR.containsKey(exchangeEdge)) {
									Set<BehaviorScenario> newSet = new HashSet<BehaviorScenario>();
									newSet.add(me.getKey());
									coloredPR.put(exchangeEdge, newSet);
								} else {
									coloredPR.get(exchangeEdge).add(me.getKey());
								}
							}
						}
					}
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
					Set<DDiagramElement> sourceFunctionNodes = getBestDisplayedStep(aSourceFunction, displayedSteps);
					if (sourceFunctionNodes != null) {
						for (DDiagramElement sourceFunctionNode : sourceFunctionNodes) {
							if (coloreSteps.get(sourceFunctionNode).size() == 1) {
								customizeStepStyle(sourceFunctionNode, color);
								// color the border of the source function with
								// the color of the functional chain
							} else {
								// color source function in red
								customizeStepStyle(sourceFunctionNode, ShapeUtil.getBlackColor());
							}
						}
					}
				}

				// customize functional exchanges
				for (Step step : me.getKey().getSteps()) {
					for (OutputPin op : step.getOutputPin()) {
						for (InputPin ip : op.getSuccessors()) {
							PrecedenceRelation<OutputPin, InputPin> oiPR = new PrecedenceRelation<OutputPin, InputPin>(
									op, ip);
							if (displayedPR.containsKey(oiPR)) {
								Set<DEdge> currentEdges = displayedPR.get(oiPR);
								for (DEdge currentEdge : currentEdges) {
									if ((coloredPR.get(currentEdge) != null
											&& coloredPR.get(currentEdge).size() == 1)) {
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
				}
				me.getValue().refresh();
			}
		}

		// reset functional exchanges with no behavior scenario
		for (Set<DEdge> aFEs : displayedPR.values()) {
			for (DEdge aFE : aFEs) {
				if (!coloredPR.containsKey(aFE)) {
					resetOutputPinStyle(aFE);
				}
			}
		}
	}

	public void updateETEFStyles(DDiagram diagram) {

		// displayed Behavior Scenario
		HashMap<EndToEndFlow, DEdge> displayedETEF = new HashMap<EndToEndFlow, DEdge>();
		// displayed Precedence Relations
		HashMap<PrecedenceRelation<OutputPin, InputPin>, Set<DEdge>> displayedPR = new HashMap<PrecedenceRelation<OutputPin, InputPin>, Set<DEdge>>();
		// displayed Event to Step
		HashMap<ArrivalPattern, DEdge> displayedE2S = new HashMap<ArrivalPattern, DEdge>();

		// displayed Steps
		HashMap<FlowInvolvedElement, Set<DDiagramElement>> displayedFIE = new HashMap<FlowInvolvedElement, Set<DDiagramElement>>();
		// colored Steps
		HashMap<DDiagramElement, Set<EndToEndFlow>> coloreFIE = new HashMap<DDiagramElement, Set<EndToEndFlow>>();
		// incomplete displayed behavior scenario steps
		Set<EndToEndFlow> incompleteBS = new HashSet<EndToEndFlow>();
		// colored precedence relations
		HashMap<DEdge, Set<EndToEndFlow>> coloredEdges = new HashMap<DEdge, Set<EndToEndFlow>>();

		// find displayed ETEF and functions
		for (DEdge aNode : diagram.getEdges()) {
			EObject target = aNode.getTarget();
			if (target instanceof EndToEndFlow) {
				displayedETEF.put((EndToEndFlow) target, aNode);
			}
		}
		// find displayed FlowInvolvedElement
		for (DNode aNode : diagram.getNodes()) {
			EObject target = aNode.getTarget();
			if (target instanceof FlowInvolvedElement) {
				Set<DDiagramElement> set = displayedFIE.get(target);
				if (set == null) {
					set = new HashSet<DDiagramElement>();
					displayedFIE.put((FlowInvolvedElement) target, set);
				}
				set.add(aNode);
			}
		}
		for (DDiagramElement aContainer : diagram.getContainers()) {
			EObject target = aContainer.getTarget();
			if ((target instanceof FlowInvolvedElement)) {
				Set<DDiagramElement> set = displayedFIE.get(target);
				if (set == null) {
					set = new HashSet<DDiagramElement>();
					displayedFIE.put((FlowInvolvedElement) target, set);
				}
				set.add(aContainer);
			}
		}

		// find displayed Precedence Relations
		for (DEdge anEdge : diagram.getEdges()) {
			EObject edgeTarget = anEdge.getTarget();
			if (edgeTarget instanceof OutputPin) {
				OutputPin op = (OutputPin) edgeTarget;
				for (InputPin ip : op.getSuccessors()) {
					if ((anEdge.getTargetNode() instanceof DNode)
							&& (((DNode) anEdge.getTargetNode()).getTarget() == ip)) {
						Set<DEdge> edges = displayedPR.get(op);
						PrecedenceRelation<OutputPin, InputPin> oiPR = new PrecedenceRelation<OutputPin, InputPin>(op,
								ip);
						if (edges == null) {
							edges = new HashSet<DEdge>();
							displayedPR.put(oiPR, edges);
						}
						edges.add(anEdge);
					}
				}
			}
		}

		// find displayed Event to Step
		for (DEdge anEdge : diagram.getEdges()) {
			EObject edgeTarget = anEdge.getTarget();
			if (edgeTarget instanceof ArrivalPattern) {
				displayedE2S.put((ArrivalPattern) edgeTarget, anEdge);
			}
		}

		// find nodes that must be colored
		for (Entry<EndToEndFlow, DEdge> etef : displayedETEF.entrySet()) {
			OutputPin op = null;
			for (FlowInvolvedElement fie : etef.getKey().getInvolvedElement()) {
				// source Node of the functional chain
				Set<DDiagramElement> fieNodes = displayedFIE.get(fie);

				if (fieNodes != null) {
					for (DDiagramElement fieNode : fieNodes) {
						if (!coloreFIE.containsKey(fieNode)) {
							Set<EndToEndFlow> newSet = new HashSet<EndToEndFlow>();
							newSet.add(etef.getKey());
							coloreFIE.put(fieNode, newSet);
						} else {
							coloreFIE.get(fieNode).add(etef.getKey());
						}
					}
				}
				// separate case of op, ip and steps
				if (fie instanceof OutputPin) {
					op = (OutputPin) fie;
				}
				if (fie instanceof InputPin) {
					InputPin ip = (InputPin) fie;

					PrecedenceRelation<OutputPin, InputPin> oiPR = new PrecedenceRelation<OutputPin, InputPin>(op, ip);
					if (displayedPR.containsKey(oiPR)) {
						Set<DEdge> exchangeEdges = displayedPR.get(oiPR);
						for (DEdge exchangeEdge : exchangeEdges) {
							if (!coloredEdges.containsKey(exchangeEdge)) {
								Set<EndToEndFlow> newSet = new HashSet<EndToEndFlow>();
								newSet.add(etef.getKey());
								coloredEdges.put(exchangeEdge, newSet);
							} else {
								coloredEdges.get(exchangeEdge).add(etef.getKey());
							}
						}
					}
				}
			}
			// Color Event to Step
			for (WorkloadEvent event : etef.getKey().getEndToEndStimuli()) {
				ArrivalPattern ap = event.getPattern();
				if (displayedE2S.containsKey(ap)) {
					DEdge exchangeEdge = displayedE2S.get(ap);
					if (!coloredEdges.containsKey(exchangeEdge)) {
						Set<EndToEndFlow> newSet = new HashSet<EndToEndFlow>();
						newSet.add(etef.getKey());
						coloredEdges.put(exchangeEdge, newSet);
					} else {
						coloredEdges.get(exchangeEdge).add(etef.getKey());
					}
				}
			}
		}

		// update functions style
		for (Entry<FlowInvolvedElement, Set<DDiagramElement>> me : displayedFIE.entrySet()) {
			Set<DDiagramElement> functionNodes = me.getValue();
			for (DDiagramElement functionNode : functionNodes) {
				if (!coloreFIE.containsKey(functionNode)) {
					resetFunctionStyle(functionNode);
				}
			}
		}

		// customize source and target function styles
		for (Entry<EndToEndFlow, DEdge> me : displayedETEF.entrySet()) {
			if (!(me.getKey() instanceof FlowInvolvedElement)) {
				updateETEFNodeColor(me.getValue(), displayedETEF.values());
				RGBValues color = getEdgeColorStyle(me.getValue());
				if (color == null) {
					continue;
				}

				// customize source function of the Behavior Scenario
				for (FlowInvolvedElement aSourceFunction : me.getKey().getInvolvedElement()) {
					// source Node of the functional chain
					Set<DDiagramElement> sourceFunctionNodes = getBestDisplayedFIE(aSourceFunction, displayedFIE);
					if (sourceFunctionNodes != null) {
						for (DDiagramElement sourceFunctionNode : sourceFunctionNodes) {
							if (coloreFIE.get(sourceFunctionNode).size() == 1) {
								customizeStepStyle(sourceFunctionNode, color);
								// color the border of the source function with
								// the color of the functional chain
							} else {
								// color source function in red
								customizeStepStyle(sourceFunctionNode, ShapeUtil.getBlackColor());
							}
						}
					}
				}

				// customize precedence relation
				OutputPin op = null;
				for (FlowInvolvedElement fie : me.getKey().getInvolvedElement()) {
					if (fie instanceof OutputPin) {
						op = (OutputPin) fie;
					}
					if (fie instanceof InputPin) {
						InputPin ip = (InputPin) fie;
						PrecedenceRelation<OutputPin, InputPin> oiPR = new PrecedenceRelation<OutputPin, InputPin>(op,
								ip);
						if (displayedPR.containsKey(oiPR)) {
							Set<DEdge> currentEdges = displayedPR.get(oiPR);
							for (DEdge currentEdge : currentEdges) {
								if ((coloredEdges.get(currentEdge) != null
										&& coloredEdges.get(currentEdge).size() == 1)) {
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
				// customize precedence relation
				for (WorkloadEvent we : me.getKey().getEndToEndStimuli()) {
					ArrivalPattern ap = we.getPattern();
					if (displayedE2S.containsKey(ap)) {
						DEdge currentEdges = displayedE2S.get(ap);
						if ((coloredEdges.get(currentEdges) != null && coloredEdges.get(currentEdges).size() == 1)) {
							customizePrecedenceRelationEdgeStyle(currentEdges, color);
						} else {
							customizePrecedenceRelationEdgeStyle(currentEdges, ShapeUtil.getBlackColor());
						}
					} else {
						incompleteBS.add(me.getKey());
					}
				}
				me.getValue().refresh();
			}
		}

		// reset functional exchanges with no behavior scenario
		for (Set<DEdge> aFEs : displayedPR.values()) {
			for (DEdge aFE : aFEs) {
				if (!coloredEdges.containsKey(aFE)) {
					resetOutputPinStyle(aFE);
				}
			}
		}
	}

	public void updateETEFNodeColor(DEdge fcNode, Collection<DEdge> visibleBehaviorScenarios) {
		RGBValues color = getEdgeColorStyle(fcNode);
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
		for (DEdge aFc : visibleBehaviorScenarios) {
			if (!aFc.equals(fcNode)) {
				RGBValues nodeColor = getEdgeColorStyle(aFc);
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
			ShapeUtil.setEdgeColorStyle(fcNode, colorList.get(0));
		}
	}

	public static RGBValues getEdgeColorStyle(DEdge edge) {
		EdgeStyle shape = edge.getOwnedStyle();
		return shape.getStrokeColor();
	}
	
	public static <T extends EObject> T unwrap(Object obj, final Class<T> clazz) {
		if (obj instanceof DNode) {
			obj = ((DNode)obj).getTarget();
		} 
		if (obj instanceof DNodeContainerSpec) {
			obj = ((DNodeContainerSpec)obj).getTarget();
		}
		if (obj == null) {
			return null;
		}
		if (clazz.isInstance(obj)) {
			return clazz.cast(obj);
		}
		return null;
	}
	
	public static <T extends EObject> boolean isWrappedInstanceOf(final EObject obj, final Class<T> clazz) {
		return unwrap(obj, clazz) != null;
	}
	
	public static <T extends EObject> boolean areAllWrappedOfType(EObject context, List<EObject> views, final Class<T> clazz) {
		if (!views.isEmpty()) {
			for (EObject select : views) {
				if (!isWrappedInstanceOf(select, clazz)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isValidArinc653PlatformToBe(EObject context, List<EObject> views) {
		return areAllWrappedOfType(context, views, HardwareProcessor.class);
	}
	
	public static boolean isArinc653Platform(final EObject context, final EObject value) {
		final HardwareProcessor proc = unwrap(value, HardwareProcessor.class);
		if (proc != null) {
			return Arinc653PlatformBuilder.isInstance(proc);
		}
		return false;
	}
	
	public static void transformAsArinc653Platform(final EObject context, final List<EObject> views) {
		for(EObject obj: views) {
			final HardwareProcessor proc = unwrap(obj, HardwareProcessor.class);
			assert(proc != null);
			Arinc653PlatformBuilder.as(proc).build();
		}
	}
	
	public static String getMAF(final EObject context) {
		final HardwareProcessor proc = unwrap(context, HardwareProcessor.class);
		if (proc != null) {
			return Arinc653PlatformBuilder.as(proc).getMAFDuration().toString();
		}
		return null;
	}
	
	public static String getMIF(final EObject context) {
		final HardwareProcessor proc = unwrap(context, HardwareProcessor.class);
		if (proc != null) {
			return Arinc653PlatformBuilder.as(proc).getMIFDuration().toString();
		}
		return null;
	}
	
	public static void setMIF(final EObject context, final Object newValue) {
		final HardwareProcessor proc = unwrap(context, HardwareProcessor.class);
		if (proc != null && newValue != null && newValue instanceof String) {
			Arinc653PlatformBuilder.as(proc).withMIFDuration((String)newValue);
		}
	}
	
	public static boolean isValidArinc653PartitionToBe(EObject context, List<EObject> views) {
		return areAllWrappedOfType(context, views, SoftwareSchedulableResource.class);
	}
	
	public static boolean isArinc653Partition(final EObject value) {
		final SoftwareSchedulableResource task = unwrap(value, SoftwareSchedulableResource.class);
		if (task != null) {
			return Arinc653MIFBuilder.isInstance(task);
		}
		return false;
	}

	public static void transformAsArinc653Partition(final EObject context, final List<EObject> views) {
		for(EObject obj: views) {
			final SoftwareSchedulableResource task = unwrap(obj, SoftwareSchedulableResource.class);
			assert(task != null);
			final Arinc653MIFBuilder partition = Arinc653MIFBuilder.as(task);
			partition.hasAReference();
			partition.getPlatform().build();
		}
	}
	
	public static void setAsSpareStep(final EObject context, final EObject value) {
		final Step step = unwrap(value, Step.class);
		if (step != null) {
			Arinc653SpareTaskBuilder.asSpare(step);
		}
	}
	
	public static boolean isSpareStep(final EObject context) {
		final Step step = unwrap(context, Step.class);
		if (step != null) {
			return Arinc653SpareTaskBuilder.isSpare(step);
		}
		return false;
	}
	
	public static boolean isSpareTask(final EObject context) {
		final SoftwareSchedulableResource task = unwrap(context, SoftwareSchedulableResource.class);
		if (task != null) {
			return Arinc653SpareTaskBuilder.isSpare(task);
		}
		return false;
	}
	
	public static void setAsPSS(final EObject context, final EObject value) {
		final SoftwareSchedulableResource task = unwrap(value, SoftwareSchedulableResource.class);
		if (task != null) {
			final PosixSporadicServerBuilder pssTask = PosixSporadicServerBuilder.as(task);
			pssTask.withOrder(1).getPSSSchedParams(true);
			pssTask.build();
		}
	}
	
	public static boolean isPSS(final EObject context) {
		final SoftwareSchedulableResource task = unwrap(context, SoftwareSchedulableResource.class);
		if (task != null) {
			return PosixSporadicServerBuilder.isInstance(task);
		}
		return false;
	}
	
	public static String getPSSOrder(final EObject context) {
		final SoftwareSchedulableResource task = unwrap(context, SoftwareSchedulableResource.class);
		if (task != null) {
			return Integer.toString(PosixSporadicServerBuilder.as(task).getOrder());
		}
		return null;
	}
	
	public static void setPSSOrder(final EObject context, final Object newValue) {
		final SoftwareSchedulableResource task = unwrap(context, SoftwareSchedulableResource.class);
		if (task != null && newValue != null && newValue instanceof String) {
			int order = 0;
			try {
				order = Integer.parseInt((String)newValue);
			} catch (Exception e) {
				
			}
			PosixSporadicServerBuilder.as(task).withOrder(order);
		}
	}
	
	public static String getPSSPriority(final EObject context) {
		final SoftwareSchedulableResource task = unwrap(context, SoftwareSchedulableResource.class);
		if (task != null) {
			return Integer.toString(PosixSporadicServerBuilder.as(task).getPriority());
		}
		return null;
	}
	
	public static void setPSSPriority(final EObject context, final Object newValue) {
		final SoftwareSchedulableResource task = unwrap(context, SoftwareSchedulableResource.class);
		if (task != null && newValue != null && (newValue instanceof String || newValue instanceof Number)) {
			int priority = 0;
			if (newValue instanceof Number) {
				priority = ((Number)newValue).intValue();
			} else {
				try {
					priority = Integer.parseInt(newValue.toString());
				} catch (Exception e) {
					
				}
			}
			PosixSporadicServerBuilder.as(task).ofPriority(priority);
		}
	}
	
	public static String getPSSBackgroundPriority(final EObject context) {
		final SoftwareSchedulableResource task = unwrap(context, SoftwareSchedulableResource.class);
		if (task != null) {
			return Integer.toString(PosixSporadicServerBuilder.as(task).getBackgroundPriority());
		}
		return null;
	}
	
	public static void setPSSBackgroundPriority(final EObject context, final Object newValue) {
		final SoftwareSchedulableResource task = unwrap(context, SoftwareSchedulableResource.class);
		if (task != null && newValue != null && (newValue instanceof String || newValue instanceof Number)) {
			int priority = 0;
			if (newValue instanceof Number) {
				priority = ((Number)newValue).intValue();
			} else {
				try {
					priority = Integer.parseInt(newValue.toString());
				} catch (Exception e) {
					
				}
			}
			PosixSporadicServerBuilder.as(task).ofBackgroundPriority(priority);
		}
	}
	
	public static String getPSSInitialTimeBudget(final EObject context) {
		final SoftwareSchedulableResource task = unwrap(context, SoftwareSchedulableResource.class);
		if (task != null) {
			return PosixSporadicServerBuilder.as(task).getInitialBudget().toString();
		}
		return null;
	}
	
	public static void setPSSInitialTimeBudget(final EObject context, final Object newValue) {
		final SoftwareSchedulableResource task = unwrap(context, SoftwareSchedulableResource.class);
		if (task != null && newValue != null && (newValue instanceof String || newValue instanceof Duration)) {
			Duration budget;
			if (newValue instanceof Duration) {
				budget = ((Duration)newValue);
			} else {
				budget = NfpFactory.eINSTANCE.createDurationFromString(newValue.toString());
			}
			PosixSporadicServerBuilder.as(task).ofInitialBudget(budget);
		}
	}
	
	public static boolean isArinc653Synchronizable(final EObject context) {
		final SoftwareSchedulableResource task = unwrap(context, SoftwareSchedulableResource.class);
		if (task == null) {
			return false;
		}
		if (Arinc653MIFBuilder.isInstance(task)) {
			return false;
		}
		final EObject parent = task.eContainer(); 
		if (parent instanceof SoftwareSchedulableResource) {
			return Arinc653MIFBuilder.isInstance((SoftwareSchedulableResource)parent);
		}
		return false;
	}
	
	public static boolean isSynchronisedWithArinc653Partition(final EObject context, final Object eInverse) {
		final SoftwareSchedulableResource task = unwrap(context, SoftwareSchedulableResource.class);
		final SoftwareSchedulableResource parent = unwrap(task.eContainer(), SoftwareSchedulableResource.class);
		if (Arinc653MIFBuilder.isInstance(parent)) {
			final Arinc653MIFBuilder partition = Arinc653MIFBuilder.as(parent);
			final Reference reference = partition.reference().build();
			if (eInverse instanceof Collection) {
				for(Object maybeStep: (Collection<?>)eInverse) {
					if (maybeStep instanceof Step) {
						for(WorkloadEvent cause: ((Step)maybeStep).getCause()) {
							final ArrivalPattern pattern = cause.getPattern();
							if(pattern == null || pattern.getReference() != reference) {
								return false;
							}
						}
					}
				}
				return true;
			}
		}
		return false;
	}
	
	public static void setSynchronisedWithArinc653Partition(final EObject context, final Object newValue, final Object eInverse) {
		final SoftwareSchedulableResource task = unwrap(context, SoftwareSchedulableResource.class);
		final SoftwareSchedulableResource parent = unwrap(task.eContainer(), SoftwareSchedulableResource.class);
		if (Arinc653MIFBuilder.isInstance(parent)) {
			final Arinc653MIFBuilder partition = Arinc653MIFBuilder.as(parent);
			final Reference reference = partition.reference().build();
			if (eInverse instanceof Collection) {
				for(Object maybeStep: (Collection<?>)eInverse) {
					if (maybeStep instanceof Step) {
						for(WorkloadEvent cause: ((Step)maybeStep).getCause()) {
							final ArrivalPattern pattern = cause.getPattern();
							if (pattern != null) {
								pattern.setReference(reference);
							}
						}
					}
				}
			}
		}
	}
	
	public static Collection<TimeInterval> getArinc653IntervalActivations(final EObject context) {
		final List<TimeInterval> activations = new ArrayList<>(2);
		final SoftwareSchedulableResource partition = unwrap(context, SoftwareSchedulableResource.class);
		for(SchedulingParameter param: partition.getSchedParams()) {
			if (param instanceof TableEntryType) {
				final TableEntryType tb = (TableEntryType)param;
				if (!tb.getTimeSlot().isEmpty() && tb.getOffset().isEmpty()) {
					tb.getOffset().add(NfpFactory.eINSTANCE.createDurationFromString("0ps"));
				}
				assert(tb.getTimeSlot().isEmpty() || !tb.getOffset().isEmpty());
				final int nbSlots = tb.getTimeSlot().size();
				final int nbOffsets = tb.getOffset().size();
				for(int i=0; i < nbSlots; ++i) {
					final TimeInterval slotTime = NfpFactory.eINSTANCE.createTimeInterval();
					final Duration startTime = tb.getOffset().get(i % nbOffsets);
					final Duration lengthTime = tb.getTimeSlot().get(i % nbSlots);
					final Duration endTime = startTime.add(lengthTime);
					slotTime.setMin(startTime);
					slotTime.setMinOpen(false);
					slotTime.setMax(endTime);
					slotTime.setMaxOpen(true);
					activations.add(slotTime);
				}
			}
		}
		return activations;
	}
	
	public static Collection<String> getArinc653Activations(final EObject context) {
		final List<String> activations = new ArrayList<>(2);
		for(TimeInterval ti: getArinc653IntervalActivations(context)) {
			activations.add(ti.toString() + " (" + ti.computeLength().toString() + ")");
		}
		return activations;
	}
	
	public static void setAsSpareTask(final EObject context) {
		final SoftwareSchedulableResource task = unwrap(context, SoftwareSchedulableResource.class);
		if (task != null) {
			Arinc653SpareTaskBuilder.asSpare(task);
		}
	}
}
