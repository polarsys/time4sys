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

import petrinet.Connection;
import petrinet.Node;
import petrinet.NormalArc;
import petrinet.PetrinetFactory;
import petrinet.Place;
import petrinet.Transition;
import taskmodel.Fragment;
import taskmodel.Jitter;
import taskmodel.Observer;
import taskmodel.SharingResourceFragment;
import taskmodel.System;
import taskmodel.Task;
import taskmodel.TaskmodelFactory;

public class NbReentrancyObserver {

	private static PetrinetFactory petriNetFactory;
	
	private static TaskmodelFactory taskModelFactory;
	
	/**
	 * set up with params
	 * @param petriNetFactory
	 * @param taskModelFactory
	 */
	public static void setup(PetrinetFactory petriNetFactory,TaskmodelFactory taskModelFactory) {
		NbReentrancyObserver.petriNetFactory = petriNetFactory;
		NbReentrancyObserver.taskModelFactory = taskModelFactory;
	}
	
	/**
	 * set up
	 */
	public static void setup() {
		petriNetFactory = PetrinetFactory.eINSTANCE;
		taskModelFactory = TaskmodelFactory.eINSTANCE;
	}
	
	/**
	 * 
	 * @param fragment
	 * @param sharingResourceFragment
	 * @return
	 */
	private static boolean precede(Fragment fragment,SharingResourceFragment sharingResourceFragment) {
		if (fragment ==null) return false;
		if (sharingResourceFragment==null) return true;
		Transition transition = fragment.getOwnedTransition();
		Place place = sharingResourceFragment.getFirstFragment().getOwnedPlace();
		
		return precede(transition, place);
	}
	
	/**
	 * precede
	 * @param transition
	 * @param place
	 * @return
	 */
	private static boolean precede(Node transition,Node place) {
		
		List<Connection> allConnections = transition.getOutputRel();
		List<NormalArc> allNormalArcs = new ArrayList<NormalArc>();
		for (Connection conn: allConnections) {
			if (conn instanceof NormalArc) allNormalArcs.add((NormalArc)conn);
		}
		
		if (allNormalArcs.size()==0) return false;
		
		for (Connection conn : allNormalArcs) {
			if (conn.getTarget()==place) return true;
		}
		
		boolean result = false;
		for (Connection conn : allNormalArcs) {
			result = result || precede(conn.getTarget(), place);
		}
		return result;
	}
	
	/**
	 * generate observer to observe number of re-entrancies
	 * @param system
	 */
	public static void generateNumberReentrancyObserver(System system) {
		
		setup();
		
		for (Task task : system.getOwnedTasks()) {
			Place place1 = petriNetFactory.createPlace(); 
			String place1Id = Time4Sys2PetriNet.generatePlaceId();
			place1.setId(place1Id);
			place1.setName(place1Id);
			
			Place place2 = petriNetFactory.createPlace();
			String place2Id = Time4Sys2PetriNet.generatePlaceId();
			place2.setId(place2Id);
			place2.setName(place2Id);
			
			Transition transition = petriNetFactory.createTransition();
			String transitionId = Time4Sys2PetriNet.generateTransitionId();
			transition.setId(transitionId);
			transition.setName(transitionId);
			transition.setUpperBound("0");
			transition.setLowerBound("0");
			
			NormalArc conn1 = petriNetFactory.createNormalArc();
			conn1.setSource(place1);
			place1.getOutputRel().add(conn1);
			conn1.setTarget(transition);
			transition.getInputRel().add(conn1);
			
			NormalArc conn2 = petriNetFactory.createNormalArc();
			conn2.setSource(place2);
			place2.getOutputRel().add(conn2);
			conn2.setTarget(transition);
			transition.getInputRel().add(conn2);
			
			NormalArc conn3 = petriNetFactory.createNormalArc();
			if (task.getStimulus()!=null) {
				Jitter jitter = task.getStimulus().getJitter();
				Transition jitterTransition = jitter.getOwnedTransition();
				
				conn3.setSource(jitterTransition);
				jitterTransition.getOutputRel().add(conn3);


			} else {
				//AbstractFragment firstFragment = task.getAllFragments().get(0);
				Fragment firstFragment = task.getFragments().get(0);
				SharingResourceFragment firstSharingResourceFragment = task.getSharingResourceFragments().get(0);
				//TODO
				if (precede(firstFragment,firstSharingResourceFragment)) {
					Transition firstTransition = firstFragment.getOwnedTransition();
					
					conn3.setSource(firstTransition);
					firstTransition.getOutputRel().add(conn3);
				} else {
					Transition firstTransition = firstSharingResourceFragment.getFirstFragment().getOwnedTransition();

					conn3.setSource(firstTransition);
					firstTransition.getOutputRel().add(conn3);
				}
				
//				if (firstFragment instanceof Fragment) {
//					Transition firstTransition = ((Fragment) firstFragment).getOwnedTransition();
//					 
//					conn3.setSource(firstTransition);
//					firstTransition.getOutputRel().add(conn3);
//				} else if (firstFragment instanceof SharingResourceFragment) {
//					Transition firstTransition = ((SharingResourceFragment)firstFragment).getFirstFragment().getOwnedTransition();
//					
//					conn3.setSource(firstTransition);
//					firstTransition.getOutputRel().add(conn3);
//				}
			}
			
			conn3.setTarget(place1);
			place1.getInputRel().add(conn3);
			
//			First_Release firstRelease = task.getStimulus().getFirstRelease();
//			Transition firstReleaseTransition = null;
//			firstReleaseTransition = firstRelease.getOwnedTransition();
			
			
//			Period periodicRelease = task.getStimulus().getPeriod();
//			Transition periodicReleaseTransition = periodicRelease.getOwnedTransition();
			
//			NormalArc conn4 = petriNetFactory.createNormalArc();
//			conn4.setSource(periodicReleaseTransition);
//			periodicReleaseTransition.getOutputRel().add(conn4);
//			conn4.setTarget(place1);
//			place1.getInputRel().add(conn4);
			
			Fragment lastFragment = null;
			if (task.getFragments().size()>0) lastFragment = task.getFragments().get(task.getFragments().size()-1);
			SharingResourceFragment lastSharingResourceFragment = null;
			if (task.getSharingResourceFragments().size()>0) lastSharingResourceFragment = task.getSharingResourceFragments().get(task.getSharingResourceFragments().size()-1);
			
			NormalArc conn5 = petriNetFactory.createNormalArc();
			Transition lastTransition = null;
			if (precede(lastFragment, lastSharingResourceFragment)) {
				if (lastSharingResourceFragment==null) {
					lastTransition = lastFragment.getOwnedTransition();
					//java.lang.System.out.println(1);
				} else {
					//java.lang.System.out.println(2);
					lastTransition = lastSharingResourceFragment.getSecondFragment().getOwnedTransition();
				}
				
			} else {
				if (lastFragment==null) {
					lastTransition = lastSharingResourceFragment.getSecondFragment().getOwnedTransition();
				} else {
					lastTransition = lastFragment.getOwnedTransition();	
				}
			}
			
			conn5.setSource(lastTransition);
			lastTransition.getOutputRel().add(conn5);
			conn5.setTarget(place2);
			place2.getInputRel().add(conn5);
			
			Observer observer = taskModelFactory.createBoundObserver();
			observer.getOwnedPlaces().add(place1);
			observer.getOwnedPlaces().add(place2);
			observer.getOwnedTransitions().add(transition);
			observer.getConnections().add(conn1);
			observer.getConnections().add(conn2);
			observer.getConnections().add(conn3);
			//observer.getConnections().add(conn4);
			observer.getConnections().add(conn5);
			
			observer.getCheckPlaces().add(place1);
			
			system.getObservers().add(observer);
		}		
	}
}

			
			
			
		