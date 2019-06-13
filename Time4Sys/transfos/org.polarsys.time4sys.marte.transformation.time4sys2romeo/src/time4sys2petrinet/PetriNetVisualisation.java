/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Thanh Dat NGUYEN- initial API and implementation
 *
 *******************************************************************************/
package time4sys2petrinet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.osgi.service.component.annotations.Component;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestImpl;
import org.polarsys.time4sys.marte.analysisrepository.tysco.util.AbstractExogenousTransformation;

import eclipseview.polarsys.ui.graphmodel.PolarsysGraphView;
import petrinet.Connection;
import petrinet.NormalArc;
import petrinet.Place;
import petrinet.TimedInhibitorArc;
import petrinet.Transition;
import taskmodel.Fragment;
import taskmodel.MutualExclusionResource;
import taskmodel.Observer;
import taskmodel.SharingResourceFragment;
import taskmodel.Stimulus;
import taskmodel.System;
import taskmodel.Task;
import taskmodel.TaskmodelPackage;

@Component
public class PetriNetVisualisation implements AbstractExogenousTransformation{
	
	private static String emptyPlaceIcon = "icons/place_no_token.png";
	private static String oneTokenPlaceIcon = "icons/place_1_token.png";
	private static String transitionIcon = "icons/transition.png";
	private static String normalArcIcon = "icons/simple_arc.png";
	private static String inhibitorArcIcon = "icons/inhibitor_arc.png";
//	private static String flushArcIcon = "icons/flush_arc.png";
	
	/**
	 * load system
	 * @param modelPath
	 * @return
	 */
	public static System loadSystem(String modelPath) {
		TaskmodelPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("taskmodel", new XMIResourceFactoryImpl());
		
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		
		// Get the resource
		Resource resource = resSet.getResource(URI.createURI(modelPath),true);
		System system = (System) resource.getContents().get(0);
		
		return system;
	}
	
	/**
	 * Visualize Petri net
	 * @param modelPath
	 */
	public static void visualizePetrinet(String modelPath) {
		visualizePetrinet(loadSystem(modelPath));
	}
	
	/**
	 * Visualize Petri net
	 * @param system
	 */
	public static void visualizePetrinet(System system)  {
		
		Shell shell = new Shell();
		PolarsysGraphView view = new PolarsysGraphView(shell);
		
		// Petri net graph component
		List<Place> allPlaces = getAllPlacesFromSystem(system);
		List<Transition> allTransitions = getAllTransitionsFromSystem(system);
		List<NormalArc> allNormalArcs = getAllNormalArcs(system);
		List<TimedInhibitorArc> allInhibitorArcs = getAllInhibitorArcs(system);
		
		//Visualize the components
		// create node corresponding to place
		for (Place place : allPlaces) {
			GraphNode graphNode = view.createGraphNode(SWT.NONE,place.getName());
			if (place.getInitCount()==1) view.setNodeFigure(graphNode, oneTokenPlaceIcon);
			else if (place.getInitCount()==0) view.setNodeFigure(graphNode, emptyPlaceIcon);
		}
		
		// Create node corresponding to transtion
		for (Transition transition : allTransitions) {
			GraphNode graphNode = view.createGraphNode(SWT.NONE, transition.getName());
			view.setNodeFigure(graphNode, transitionIcon);
		}
		
		// create normal arcs
		for (NormalArc conn : allNormalArcs) {
			GraphNode sourceNode = view.getGraphNodebyName(conn.getSource().getName()).get(0);
			java.lang.System.out.println("target name: "+conn.getTarget().getName());
			GraphNode targetNode = view.getGraphNodebyName(conn.getTarget().getName()).get(0);
			GraphConnection graphConnection = view.createGraphConnection(sourceNode, targetNode,SWT.NONE);
			view.setConnectionFigure(graphConnection, normalArcIcon);
		}
		
		// Create Inhibitor arcs
		for (TimedInhibitorArc conn : allInhibitorArcs) {
			GraphNode source = view.getGraphNodebyName(conn.getSource().getName()).get(0);
			GraphNode target = view.getGraphNodebyName(conn.getTarget().getName()).get(0);
			GraphConnection graphConnection = view.createGraphConnection(source, target,SWT.NONE);
			view.setConnectionFigure(graphConnection, inhibitorArcIcon);
		}
		
		// create shell
		view.setTreeLayoutAlgorithm();
		shell.open();
		shell.setLayout(new FillLayout());
		Display display = shell.getDisplay();
        shell.setFocus();
        shell.setActive();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
	}
	
	/**
	 * Get all normal arcs from system
	 * @param system
	 * @return
	 */
	private static List<NormalArc> getAllNormalArcs(System system) {
		
		List<NormalArc> allNormalArcs = new ArrayList<NormalArc>();
		for (Task task : system.getOwnedTasks()) {
			
			if (task.getStimulus()!=null) {
				for (Connection conn : task.getStimulus().getOffset().getConnections()) {
					if (conn instanceof NormalArc) 
						allNormalArcs.add((NormalArc)conn);
				}
				
				for (Connection conn: task.getStimulus().getFirstRelease().getConnections()) {
					if (conn instanceof NormalArc)
						allNormalArcs.add((NormalArc)conn);
				}
				
				for (Connection conn: task.getStimulus().getPeriod().getConnections()) {
					if (conn instanceof NormalArc)
						allNormalArcs.add((NormalArc)conn);
				}
				
				for (Connection conn: task.getStimulus().getJitter().getConnections()) {
					if (conn instanceof NormalArc)
						allNormalArcs.add((NormalArc)conn);
				}
			}
			
			for (Fragment fragment : task.getFragments()) {
				for (Connection conn : fragment.getConnections()) {
					if (conn instanceof NormalArc)
						allNormalArcs.add((NormalArc)conn);
				}
			}
			
			for (SharingResourceFragment srf : task.getSharingResourceFragments()) {
				for (Connection conn : srf.getConnections()) {
					if (conn instanceof NormalArc) {
						allNormalArcs.add((NormalArc)conn);
					}
				}
			}
		}
		
		for (Observer observer : system.getObservers()) {
			for (Connection conn : observer.getConnections()) {
				allNormalArcs.add((NormalArc)conn);
			}
		}
		
		for (MutualExclusionResource mutex : system.getOwnedMutualExclusionResources()) {
			for (Connection conn : mutex.getConnections()) {
				allNormalArcs.add((NormalArc)conn);
			}
		}
		
		return allNormalArcs;
	
	}

	
	/**
	 * Get all inhibitor arcs from system
	 * @param system
	 * @return
	 */
	private static List<TimedInhibitorArc> getAllInhibitorArcs(System system) {
		
		List<TimedInhibitorArc> allInhibitorArcs = new ArrayList<TimedInhibitorArc>();
		for (Task task : system.getOwnedTasks()) {
			
			if (task.getStimulus()!=null) {
				for (Connection conn : task.getStimulus().getOffset().getConnections()) {
					if (conn instanceof TimedInhibitorArc) 
						allInhibitorArcs.add((TimedInhibitorArc)conn);
				}
				
				for (Connection conn: task.getStimulus().getFirstRelease().getConnections()) {
					if (conn instanceof TimedInhibitorArc)
						allInhibitorArcs.add((TimedInhibitorArc)conn);
				}
				
				for (Connection conn: task.getStimulus().getPeriod().getConnections()) {
					if (conn instanceof TimedInhibitorArc)
						allInhibitorArcs.add((TimedInhibitorArc)conn);
				}
				
				for (Connection conn: task.getStimulus().getJitter().getConnections()) {
					if (conn instanceof TimedInhibitorArc)
						allInhibitorArcs.add((TimedInhibitorArc)conn);
				}
			}
			
			for (Fragment fragment : task.getFragments()) {
				for (Connection conn : fragment.getConnections()) {
					if (conn instanceof TimedInhibitorArc)
						allInhibitorArcs.add((TimedInhibitorArc)conn);
				}
			}
			
			for (SharingResourceFragment fragment : task.getSharingResourceFragments()) {
				for (Connection conn : fragment.getConnections()) {
					if (conn instanceof TimedInhibitorArc) {
						allInhibitorArcs.add((TimedInhibitorArc)conn);
					}
				}
			}
		}
		
		return allInhibitorArcs;
	
	}
	
	/**
	 * get all transition from system
	 * @param system
	 * @return
	 */
	private static List<Transition> getAllTransitionsFromSystem(System system) {
		
		List<Transition> allTransitions = new ArrayList<Transition>();
		
		List<Task> allTasks = system.getOwnedTasks();
		for (Task task : allTasks) {
			
			Stimulus stimulus = task.getStimulus();
			if (stimulus!=null) {
				allTransitions.add(stimulus.getOffset().getOwnedTransition());
				allTransitions.add(stimulus.getFirstRelease().getOwnedTransition());
				allTransitions.add(stimulus.getPeriod().getOwnedTransition());
				allTransitions.add(stimulus.getJitter().getOwnedTransition());
			}
			
			List<Fragment> allFragments =  task.getFragments();
			for (Fragment fragment : allFragments) {
				allTransitions.add(fragment.getOwnedTransition());
			}			
			
			List<SharingResourceFragment> allSharingResourceFragments = task.getSharingResourceFragments();
			for (SharingResourceFragment srf : allSharingResourceFragments) {
				allTransitions.add(srf.getFirstFragment().getOwnedTransition());
				allTransitions.add(srf.getSecondFragment().getOwnedTransition());
			}
		}
		
		List<Observer> allObservers = system.getObservers();
		for (Observer observer : allObservers) {
			allTransitions.addAll(observer.getOwnedTransitions());
		}
		
		return allTransitions;
	}
	
	
	/**
	 * get all place from system
	 * @param system
	 * @return
	 */
	private static List<Place> getAllPlacesFromSystem(System system) {
		
		List<Place> allPlaces = new ArrayList<Place>();
		
		List<Task> allTasks = system.getOwnedTasks();
		for (Task task : allTasks) {
			
			Stimulus stimulus = task.getStimulus();
			if (stimulus!=null) {
				allPlaces.add(stimulus.getOffset().getOwnedPlace());
				allPlaces.add(stimulus.getFirstRelease().getOwnedPlace());
				allPlaces.add(stimulus.getPeriod().getOwnedPlace());
				allPlaces.add(stimulus.getJitter().getOwnedPlace());	
			}
			
			List<Fragment> allFragments = task.getFragments();
			for (Fragment fragment : allFragments) {
				allPlaces.add(fragment.getOwnedPlace());
			}
			
			List<SharingResourceFragment> allSharingResourceFragments = task.getSharingResourceFragments();
			for (SharingResourceFragment srf : allSharingResourceFragments) {
				allPlaces.add(srf.getFirstFragment().getOwnedPlace());
				allPlaces.add(srf.getSecondFragment().getOwnedPlace());
			}
		}
		
		List<Observer> allObservers = system.getObservers();
		for (Observer observer : allObservers) {
			allPlaces.addAll(observer.getOwnedPlaces());
		}
		
		for (MutualExclusionResource mutex : system.getOwnedMutualExclusionResources()) {
			allPlaces.add(mutex.getMutualExclusionResourcePlace());
		}
		
		return allPlaces;
	}
	
	
	
	/***************** Test *******************/
//	public static void main(String[] args) {
//		String modelPath = "model/minepump2.taskmodel";
//		visualizePetrinet(modelPath);
//	}

	@Override
	public void transform(TestImplementation test) {
		String modelPath = "model/minepump2.taskmodel";
		visualizePetrinet(modelPath);		
	}
}
