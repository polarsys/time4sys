/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
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
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.util.RefreshIdsHolder;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.DNodeList;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.DragAndDropTarget;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.diagram.business.api.componentization.DiagramMappingsManager;
import org.eclipse.sirius.diagram.business.api.componentization.DiagramMappingsManagerRegistry;
import org.eclipse.sirius.diagram.business.internal.helper.decoration.DecorationHelperInternal;
import org.eclipse.sirius.diagram.business.internal.metamodel.helper.MappingHelper;
import org.eclipse.sirius.diagram.business.internal.metamodel.operations.DDiagramSpecOperations;
//import org.eclipse.sirius.diagram.business.internal.sync.DDiagramElementSynchronizer;
//import org.eclipse.sirius.diagram.business.internal.sync.DDiagramSynchronizer;
//import org.eclipse.sirius.diagram.business.internal.sync.DEdgeCandidate;
//import org.eclipse.sirius.diagram.business.internal.sync.DNodeCandidate;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.EdgeMappingImport;
import org.eclipse.sirius.diagram.description.IEdgeMapping;
import org.eclipse.sirius.diagram.description.MappingBasedDecoration;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.filter.FilterDescription;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.SemanticBasedDecoration;
import org.polarsys.time4sys.odesign.helper.DiagramHelper;

@SuppressWarnings("restriction")
public class DiagramServices {

	private static DiagramServices singleton = null;

	public static DiagramServices getDiagramServices() {
		if (singleton == null) {
			singleton = new DiagramServices();
		}
		return singleton;
	}

	/**
	 * @param pDiagram
	 * @param sourceNode
	 * @param targetNode
	 * @param semanticObject
	 * @param mapping
	 * @return
	 */
	public DEdge findDEdgeElement(DDiagram pDiagram, EdgeTarget sourceNode, EdgeTarget targetNode,
			EObject semanticObject, EdgeMapping mapping) {
		for (DEdge anEdge : DDiagramSpecOperations.getEdgesFromMapping(pDiagram, mapping)) {
			if ((anEdge.getTarget() != null) && anEdge.getTarget().equals(semanticObject)
					&& anEdge.getSourceNode().equals(sourceNode) && anEdge.getTargetNode().equals(targetNode)) {
				return anEdge;
			}
		}
		return null;
	}

	public DEdge createEdge(EdgeMapping mapping, EdgeTarget sourceView, EdgeTarget targetView, EObject semanticObject) {
		ModelAccessor accessor = SiriusPlugin.getDefault().getModelAccessorRegistry().getModelAccessor(semanticObject);
		IInterpreter interpreter = SiriusPlugin.getDefault().getInterpreterRegistry().getInterpreter(semanticObject);

		if (mapping == null) {
			return null;
		}

		if ((sourceView == null) || (targetView == null)) {
			return null;
		}

		final DDiagram diagram = DiagramHelper.getService().getDiagramContainer(sourceView);
		RefreshIdsHolder rId = RefreshIdsHolder.getOrCreateHolder(diagram);
		//TODO: Urgent -> find a another way!
//DEdgeCandidate edgeCandidate = new DEdgeCandidate(mapping, semanticObject, sourceView, targetView, rId);

//		final DDiagramSynchronizer diagramSync = new DDiagramSynchronizer(interpreter, diagram.getDescription(),
//				accessor);
//		diagramSync.setDiagram((DSemanticDiagram) diagram);
//		final DDiagramElementSynchronizer elementSync = diagramSync.getElementSynchronizer();
		/* maps for decorations */
		final Map<EdgeMapping, Collection<MappingBasedDecoration>> edgeToMappingBasedDecoration = new HashMap<EdgeMapping, Collection<MappingBasedDecoration>>();
		final Map<String, Collection<SemanticBasedDecoration>> edgeToSemanticBasedDecoration = new HashMap<String, Collection<SemanticBasedDecoration>>();

		/* create the mapping to edge targets map */
		final Map<DiagramElementMapping, Collection<EdgeTarget>> mappingsToEdgeTargets = new HashMap<DiagramElementMapping, Collection<EdgeTarget>>();

		DDiagramElement sourceElement = null;
		DDiagramElement targetElement = null;
		DiagramElementMapping sourceMapping = null;
		DiagramElementMapping targetMapping = null;

		if (sourceView instanceof DDiagramElement) {
			sourceElement = (DDiagramElement) sourceView;
			sourceMapping = sourceElement.getDiagramElementMapping();
		}

		if (targetView instanceof DDiagramElement) {
			targetElement = (DDiagramElement) targetView;
			targetMapping = targetElement.getDiagramElementMapping();
		}

		if (sourceMapping != null) {
			mappingsToEdgeTargets.put(sourceMapping, new ArrayList<EdgeTarget>());
		}
		if ((targetMapping != null) && !targetMapping.equals(sourceMapping)) {
			mappingsToEdgeTargets.put(targetMapping, new ArrayList<EdgeTarget>());
		}

		if (sourceMapping != null) {
			mappingsToEdgeTargets.get(sourceMapping).add(sourceView);
		}
		if ((targetMapping != null) && !sourceView.equals(targetView)) {
			mappingsToEdgeTargets.get(targetMapping).add(targetView);
		}
		final DecorationHelperInternal decorationHelper = new DecorationHelperInternal(diagram, interpreter, accessor);
		decorationHelper.computeDecorations(mappingsToEdgeTargets, edgeToSemanticBasedDecoration,
				edgeToMappingBasedDecoration);
		//TODO: Urgent -> find a another way!
//		return elementSync.createNewEdge(getMappingManager((DSemanticDiagram) diagram), edgeCandidate,
//				mappingsToEdgeTargets, edgeToMappingBasedDecoration, edgeToSemanticBasedDecoration);
		return null;
	}

	private DiagramMappingsManager getMappingManager(final DSemanticDiagram diagram) {
		Session session = SessionManager.INSTANCE.getSession(diagram.getTarget());
		return DiagramMappingsManagerRegistry.INSTANCE.getDiagramMappingsManager(session, diagram);
	}

	public Set<DEdge> getOutgoingEdges(EdgeTarget node) {
		DDiagram diagram = DiagramHelper.getService().getDiagramContainer(node);
		Set<DEdge> returnedSet = new HashSet<DEdge>();
		returnedSet.addAll(node.getOutgoingEdges());
		returnedSet.retainAll(diagram.getEdges());
		return returnedSet;
	}

	public EdgeMapping getEdgeMapping(final DiagramDescription description, String mappingName) {
		for (final EdgeMapping edgeMapping : description.getAllEdgeMappings()) {
			if (edgeMapping.getName().equals(mappingName)) {
				return edgeMapping;
			}
		}
		return null;
	}

	public EdgeMapping getEdgeMapping(final DDiagram diagram, String mappingName) {
		final DiagramDescription description = diagram.getDescription();
		return getEdgeMapping(description, mappingName);
	}

	/**
	 * Returns a DiagramElementMapping from an edge (works with
	 * EdgeMappingImport)
	 * 
	 * @param aEdge
	 */
	public DiagramElementMapping getEdgeMapping(DEdge aEdge) {
		if ((aEdge != null) && (aEdge.getActualMapping() != null)) {
			IEdgeMapping mapping = aEdge.getActualMapping();
			if ((mapping != null) && (mapping instanceof EdgeMappingImport)) {
				mapping = MappingHelper.getEdgeMapping((EdgeMappingImport) mapping);
			}

			if ((mapping != null) && (mapping instanceof DiagramElementMapping)) {
				return (DiagramElementMapping) mapping;
			}
		}
		return null;
	}

	/**
	 * This method tests if a Node is a BorderedNode
	 * 
	 * @param node
	 *            : a DNode in a diagram
	 * @return true if the current node is a borderedNode
	 */
	public boolean isABorderedNode(AbstractDNode node) {
		if (null == node) {
			return false;
		}
		EObject container = node.eContainer();
		if (null == container) {
			return false;
		}
		if (container instanceof DDiagram) {
			return false;
		}
		if (container instanceof AbstractDNode) {
			AbstractDNode nodeContainer = (AbstractDNode) container;
			return nodeContainer.getOwnedBorderedNodes().contains(node);
		}
		return false;
	}

	/**
	 * remove a Node view
	 * 
	 * @param node
	 *            a node
	 */
	public void removeNodeView(DNode node) {
		EObject container = node.eContainer();
		if (container != null) {
			if (container instanceof DDiagram) {
				((DDiagram) container).getOwnedDiagramElements().remove(node);
			}
			if (container instanceof DNodeContainer) {
				DNodeContainer nodeContainer = (DNodeContainer) container;
				if (nodeContainer.getOwnedDiagramElements().contains(node)) {
					nodeContainer.getOwnedDiagramElements().remove(node);
				}
				if (nodeContainer.getOwnedBorderedNodes().contains(node)) {
					nodeContainer.getOwnedBorderedNodes().remove(node);
				}
			}
			if (container instanceof DNode) {
				((DNode) container).getOwnedBorderedNodes().remove(node);
			}
		}
	}

	public void removeNodeListElementView(AbstractDNode node) {
		EObject container = node.eContainer();
		if ((container != null) && (container instanceof DNodeList)) {
			((DNodeList) container).getOwnedElements().remove(node);
		}
	}

	public void removeAbstractDNodeView(AbstractDNode node) {
		EObject container = node.eContainer();
		if (container != null) {
			if (container instanceof DDiagram) {
				((DDiagram) container).getOwnedDiagramElements().remove(node);
			} else if (container instanceof DNodeContainer) {
				DNodeContainer nodeContainer = (DNodeContainer) container;
				if (nodeContainer.getOwnedDiagramElements().contains(node)) {
					nodeContainer.getOwnedDiagramElements().remove(node);
				}
				if (nodeContainer.getOwnedBorderedNodes().contains(node)) {
					nodeContainer.getOwnedBorderedNodes().remove(node);
				}
			} else if (container instanceof DNode) {
				((DNode) container).getOwnedBorderedNodes().remove(node);
			} else if (container instanceof DNodeList) {
				((DNodeList) container).getOwnedElements().remove(node);
			}
		}
	}

	/**
	 * remove a container View
	 * 
	 * @param container
	 *            a container
	 */
	public void removeContainerView(EObject container) {
		EObject owner = container.eContainer();
		if (owner != null) {
			if (owner instanceof DDiagram) {
				((DDiagram) owner).getOwnedDiagramElements().remove(container);
			}
			if (owner instanceof DNodeContainer) {
				DNodeContainer nodeContainer = (DNodeContainer) owner;
				if (nodeContainer.getOwnedDiagramElements().contains(container)) {
					nodeContainer.getOwnedDiagramElements().remove(container);
				}
			}
		}
	}

	public AbstractDNode createNode(NodeMapping mapping, EObject modelElement, DragAndDropTarget container,
			DDiagram diagram) {
		final DDiagram diag = diagram;

		ModelAccessor accessor = SiriusPlugin.getDefault().getModelAccessorRegistry().getModelAccessor(modelElement);
		IInterpreter interpreter = SiriusPlugin.getDefault().getInterpreterRegistry().getInterpreter(modelElement);
		//TODO: Urgent -> find a another way!
//		final DDiagramSynchronizer diagramSync = new DDiagramSynchronizer(interpreter, diag.getDescription(), accessor);
//		diagramSync.setDiagram((DSemanticDiagram) diagram);
//		final DDiagramElementSynchronizer elementSync = diagramSync.getElementSynchronizer();
//		RefreshIdsHolder rId = RefreshIdsHolder.getOrCreateHolder(diagram);

//		DNodeCandidate nodeCandidate = new DNodeCandidate(mapping, modelElement, container, rId);
//		return (AbstractDNode) elementSync.createNewNode(getMappingManager((DSemanticDiagram) diag), nodeCandidate,
//				false);
		return null;//TODO: Urgent -> find a another way!

	}

	/**
	 * @param targetDescription
	 * @param targetMappingName
	 * @return
	 */
	public DiagramElementMapping getMappingByName(RepresentationDescription targetDescription,
			String targetMappingName) {
		DiagramElementMapping mapping = null;

		if ((targetMappingName != null) && (targetDescription != null)
				&& (targetDescription instanceof DiagramDescription)) {
			mapping = DiagramServices.getDiagramServices()
					.getAbstractNodeMapping((DiagramDescription) targetDescription, targetMappingName);
			if (mapping == null) {
				mapping = DiagramServices.getDiagramServices().getEdgeMapping((DiagramDescription) targetDescription,
						targetMappingName);
			}
		}

		return mapping;
	}

	public NodeMapping getAbstractNodeMapping(final DiagramDescription description, String mappingName) {

		for (NodeMapping nodeMapping : description.getNodeMappings()) {
			if (nodeMapping.getName().equals(mappingName)) {
				return nodeMapping;
			}
			for (NodeMapping borderedMapping : nodeMapping.getBorderedNodeMappings()) {
				if (borderedMapping.getName().equals(mappingName)) {
					return borderedMapping;
				}
			}
		}
		for (ContainerMapping nodeMapping : description.getContainerMappings()) {
			if (nodeMapping.getName().equals(mappingName)) {
				return (NodeMapping) nodeMapping;
			}
			// recursively
			List<ContainerMapping> visited = new ArrayList<ContainerMapping>();
			NodeMapping anm = getAbstractNodeInSubMapping(mappingName, nodeMapping, visited);
			if (anm!=null){
				return anm;
			}
		}
		return null;
	}

	private NodeMapping getAbstractNodeInSubMapping(String mappingName, ContainerMapping nodeMapping,
			List<ContainerMapping> visited) {
		visited.add(nodeMapping);
		for (DiagramElementMapping mapping : nodeMapping.getSubNodeMappings()) {
			if ((mapping instanceof NodeMapping)) {

				if (mapping.getName().equals(mappingName)) {
					return (NodeMapping) mapping;
				}
				for (NodeMapping borderedMapping : ((NodeMapping) mapping).getBorderedNodeMappings()) {
					if (borderedMapping.getName().equals(mappingName)) {
						return borderedMapping;
					}
				}
				if (nodeMapping instanceof ContainerMapping && mapping instanceof ContainerMapping
						&& !visited.contains(mapping)) {
					NodeMapping result = getAbstractNodeInSubMapping(mappingName, (ContainerMapping) mapping,
							visited);
					if (result != null) {
						return result;
					}
				}
			}
		}
		return null;
	}

	public ContainerMapping getContainerMapping(final DDiagram diagram, String mappingName) {
		final DiagramDescription description = diagram.getDescription();
		for (ContainerMapping aContainerMapping : description.getContainerMappings()) {
			for (ContainerMapping aSubContainerMapping : getAllContainerMappings(aContainerMapping)) {
				if (aSubContainerMapping.getName().equals(mappingName)) {
					return aSubContainerMapping;
				}
			}
		}
		return null;
	}

	public List<ContainerMapping> getAllContainerMappings(ContainerMapping mapping) {
		List<ContainerMapping> returnedList = new ArrayList<ContainerMapping>();
		returnedList.add(mapping);
		for (ContainerMapping aMapping : mapping.getSubContainerMappings()) {
			returnedList.addAll(getAllContainerMappings(aMapping));
		}
		return returnedList;
	}

	/**
	 * remove an edge from a diagram
	 * 
	 * @param anEdge
	 *            the edge to remove from diagram
	 */
	public void removeEdgeView(DEdge anEdge) {

		EObject container = anEdge.eContainer();
		if ((container != null) && (container instanceof DDiagram)) {
			if (anEdge.getSourceNode() != null) {
				anEdge.getSourceNode().getIncomingEdges().remove(anEdge);
				anEdge.getSourceNode().getOutgoingEdges().remove(anEdge);
			}
			if (anEdge.getTargetNode() != null) {
				anEdge.getTargetNode().getOutgoingEdges().remove(anEdge);
				anEdge.getTargetNode().getIncomingEdges().remove(anEdge);
			}
			((DDiagram) container).getOwnedDiagramElements().remove(anEdge);
		}
	}
	
	public boolean isFilterActivate(String filterName, DDiagram ddiag){
        EList<FilterDescription> activatedFilters = ddiag.getActivatedFilters();
        for (FilterDescription filterDescription : activatedFilters) {
        	if (filterName.equalsIgnoreCase(filterDescription.getName())){
        		return true;
        	}
         }
        return false;
	}
	
}
