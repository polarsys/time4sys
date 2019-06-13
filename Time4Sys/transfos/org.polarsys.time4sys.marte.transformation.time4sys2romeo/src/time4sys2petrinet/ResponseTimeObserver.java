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
import taskmodel.Observer;
import taskmodel.System;
import taskmodel.Task;
import taskmodel.TaskmodelFactory;

public class ResponseTimeObserver {
	
	private static PetrinetFactory petriNetFactory;
	
	private static TaskmodelFactory taskModelFactory;
	
	/**
	 * Set up
	 * @param petriNetFactory
	 * @param taskModelFactory
	 */
	public static void setup() {
		ResponseTimeObserver.petriNetFactory = PetrinetFactory.eINSTANCE;
		ResponseTimeObserver.taskModelFactory = TaskmodelFactory.eINSTANCE;
	}
	
	/**
	 * Remove observer
	 * @param system
	 * @param observer
	 */
//	public static void degenerateResponseTimeObserver(System system,int taskNumber,Observer observer) {
//		
//		Task currentTask = system.getOwnedTasks().get(taskNumber);
//		Transition jitterTransition = currentTask.getStimulus().getJitter().getOwnedTransition();
//		Transition execTransition = currentTask.getFragments().get(currentTask.getFragments().size()-1).getOwnedTransition();
//
//		List<Connection> jitterTransitionOutputRels = jitterTransition.getOutputRel();
//		List<Connection> execTransitionOutputRels = execTransition.getOutputRel();
//		List<Connection> observerConnections = observer.getConnections();
//		
//		Connection jitterConnection = null;
//		Connection execConnection = null;
//		
//		for (Connection jitterConn : jitterTransitionOutputRels) {
//			for (Connection obsConn : observerConnections) {
//				if (jitterConn == obsConn) jitterConnection = jitterConn;
//			}
//		}
//		
//		for (Connection execConn : execTransitionOutputRels) {
//			for (Connection obsConn : observerConnections) {
//				if (execConn==obsConn) {
//					execConnection = execConn;
//				}
//			}
//		}
//			
//		// Disconnect
//		jitterConnection.getSource().getOutputRel().remove(jitterConnection);
//		execConnection.getSource().getOutputRel().remove(execConnection);
//		
//		system.getObservers().remove(observer);	
//	}
	
	/**
	 * Create response time observer
	 * @param system
	 * @param taskNumber
	 * @param nbMaxToken
	 */
	public static Observer generateResponseTimeObserver(System system,int taskNumber,int nbMaxToken) {
		
		setup();
		
		if (nbMaxToken==1) {
			 Task currentTask = system.getOwnedTasks().get(taskNumber);
			 
			 Place obs_activation = petriNetFactory.createPlace();
			 String placeId = Time4Sys2PetriNet.generatePlaceId();
			 //java.lang.System.out.println(placeId);
			 obs_activation.setId(placeId);
			 obs_activation.setName(placeId);
			 
			 Place obs_termination = petriNetFactory.createPlace();
			 placeId = Time4Sys2PetriNet.generatePlaceId();
			 //java.lang.System.out.println(placeId);
			 obs_termination.setId(placeId);
			 obs_termination.setName(placeId);
			 
			 Place newPlace1 = petriNetFactory.createPlace();
			 placeId = Time4Sys2PetriNet.generatePlaceId();
			 //java.lang.System.out.println(placeId);
			 newPlace1.setId(placeId);
			 newPlace1.setName(placeId);
			 
			 Place newPlace2 = petriNetFactory.createPlace();
			 placeId = Time4Sys2PetriNet.generatePlaceId();
			 //java.lang.System.out.println(placeId);
			 newPlace2.setId(placeId);
			 newPlace2.setName(placeId);
			 
			 Transition newTransition1 = petriNetFactory.createTransition();
			 String transitionId = Time4Sys2PetriNet.generateTransitionId();
			 newTransition1.setId(transitionId);
			 newTransition1.setName(transitionId);
			 newTransition1.setLowerBound("wt");
			 newTransition1.setUpperBound("wt");
			 
			 Transition newTransition2 = petriNetFactory.createTransition();
			 transitionId = Time4Sys2PetriNet.generateTransitionId();
			 newTransition2.setId(transitionId);
			 newTransition2.setName(transitionId);
			 newTransition2.setLowerBound("0");
			 newTransition2.setUpperBound("0");

			 Transition newTransition3 = petriNetFactory.createTransition();
			 transitionId = Time4Sys2PetriNet.generateTransitionId();
			 newTransition3.setId(transitionId);
			 newTransition3.setName(transitionId);
			 newTransition3.setLowerBound("0");
			 newTransition3.setUpperBound("0");
			 
			 Transition newTransition4= petriNetFactory.createTransition();
			 transitionId = Time4Sys2PetriNet.generateTransitionId();
			 newTransition4.setId(transitionId);
			 newTransition4.setName(transitionId);
			 newTransition4.setLowerBound("0");
			 newTransition4.setUpperBound("0");			 
			 

			 // Create link with default model
			 Transition jitterTransition = currentTask.getStimulus().getJitter().getOwnedTransition();
			 Transition execTransition;
			 
			 Transition lastFragmentTransition = null;
			 if (currentTask.getFragments().size()>0) lastFragmentTransition = currentTask.getFragments().get(currentTask.getFragments().size()-1).getOwnedTransition();
			 
			 Transition lastSharingResourceFragmentTransition = null;
			 if (currentTask.getSharingResourceFragments().size()>0) lastSharingResourceFragmentTransition = currentTask.getSharingResourceFragments().get(currentTask.getSharingResourceFragments().size()-1).getSecondFragment().getOwnedTransition();
			 
			 if (lastFragmentTransition==null) execTransition = lastSharingResourceFragmentTransition;
			 else if (lastSharingResourceFragmentTransition==null) execTransition = lastFragmentTransition;
			 else {
				 if (precede(lastFragmentTransition, lastSharingResourceFragmentTransition)) execTransition = lastSharingResourceFragmentTransition;
				 else execTransition = lastFragmentTransition;
			 }
			 
			 Connection conn1 = petriNetFactory.createNormalArc();
			 conn1.setSource(jitterTransition);
			 jitterTransition.getOutputRel().add(conn1);
			 conn1.setTarget(obs_activation);
			 obs_activation.getInputRel().add(conn1);
			 
			 Connection conn2 = petriNetFactory.createNormalArc();
			 conn2.setSource(execTransition);
			 execTransition.getOutputRel().add(conn2);
			 conn2.setTarget(obs_termination);
			 obs_termination.getInputRel().add(conn2);
			 
			 Connection conn3 = petriNetFactory.createNormalArc();
			 conn3.setSource(obs_activation);
			 obs_activation.getOutputRel().add(conn3);
			 conn3.setTarget(newTransition1);
			 newTransition1.getInputRel().add(conn3);
			 
			 Connection conn4 = petriNetFactory.createNormalArc();
			 conn4.setSource(obs_activation);
			 obs_activation.getOutputRel().add(conn4);
			 conn4.setTarget(newTransition3);
			 newTransition3.getInputRel().add(conn4);
			 
			 Connection conn5 = petriNetFactory.createNormalArc();
			 conn5.setSource(obs_termination);
			 obs_termination.getOutputRel().add(conn5);
			 conn5.setTarget(newTransition3);
			 newTransition3.getInputRel().add(conn5);
			 
			 Connection conn6 = petriNetFactory.createNormalArc();
			 conn6.setSource(newTransition1);
			 newTransition1.getOutputRel().add(conn6);
			 conn6.setTarget(newPlace1);
			 newPlace1.getInputRel().add(conn6);
			 
			 Connection conn7 = petriNetFactory.createNormalArc();
			 conn7.setSource(newTransition3);
			 newTransition3.getOutputRel().add(conn7);
			 conn7.setTarget(newPlace2);
			 newPlace2.getInputRel().add(conn7);
			 
			 Connection conn8 = petriNetFactory.createNormalArc();
			 conn8.setSource(newPlace1);
			 newPlace1.getOutputRel().add(conn8);
			 conn8.setTarget(newTransition2);
			 newTransition2.getInputRel().add(conn8);
			 
			 Connection conn9 = petriNetFactory.createNormalArc();
			 conn9.setSource(newPlace2);
			 newPlace2.getOutputRel().add(conn9);
			 conn9.setTarget(newTransition4);
			 newTransition4.getInputRel().add(conn9);
			 
			 taskmodel.ResponseTimeObserver observer = taskModelFactory.createResponseTimeObserver();
			 observer.getOwnedPlaces().add(obs_activation);
			 observer.getOwnedPlaces().add(newPlace1);
			 observer.getOwnedPlaces().add(obs_termination);
			 observer.getOwnedPlaces().add(newPlace2);
			 
			 observer.getOwnedTransitions().add(newTransition1);
			 observer.getOwnedTransitions().add(newTransition2);
			 observer.getOwnedTransitions().add(newTransition3);
			 observer.getOwnedTransitions().add(newTransition4);
			 
			 observer.getConnections().add(conn1);
			 observer.getConnections().add(conn2);
			 observer.getConnections().add(conn3);
			 observer.getConnections().add(conn4);
			 observer.getConnections().add(conn5);
			 observer.getConnections().add(conn6);
			 observer.getConnections().add(conn7);
			 observer.getConnections().add(conn8);
			 observer.getConnections().add(conn9);
			 
			 observer.getCheckPlaces().add(newPlace1);
			 
			 system.getObservers().add(observer);
			 
			 return observer;
		
		} else if (nbMaxToken == 2) {
			Task currentTask = system.getOwnedTasks().get(taskNumber);
			
			 Place pl1 = petriNetFactory.createPlace();
			 String pl1Id = Time4Sys2PetriNet.generatePlaceId();
			 pl1.setId(pl1Id);
			 pl1.setName(pl1Id);
			 pl1.setInitCount(0);
			 
			 Place pl2 = petriNetFactory.createPlace();
			 String pl2Id = Time4Sys2PetriNet.generatePlaceId();
			 pl2.setId(pl2Id);
			 pl2.setName(pl2Id);
			 pl2.setInitCount(0);
			 
			 Place pl3 = petriNetFactory.createPlace();
			 String pl3Id = Time4Sys2PetriNet.generatePlaceId();
			 pl3.setId(pl3Id);
			 pl3.setName(pl3Id);
			 pl3.setInitCount(0);
			 
			 Place pl4 = petriNetFactory.createPlace();
			 String pl4Id = Time4Sys2PetriNet.generatePlaceId();
			 pl4.setId(pl4Id);
			 pl4.setName(pl4Id);
			 pl4.setInitCount(0);
			 
			 Place pl5 = petriNetFactory.createPlace();
			 String pl5Id = Time4Sys2PetriNet.generatePlaceId();
			 pl5.setId(pl5Id);
			 pl5.setName(pl5Id);
			 pl5.setInitCount(1);
			 
			 Place pl6 = petriNetFactory.createPlace();
			 String pl6Id = Time4Sys2PetriNet.generatePlaceId();
			 pl6.setId(pl6Id);
			 pl6.setName(pl6Id);
			 pl6.setInitCount(1);
			 
			 Place pl7 = petriNetFactory.createPlace();
			 String pl7Id = Time4Sys2PetriNet.generatePlaceId();
			 pl7.setId(pl7Id);
			 pl7.setName(pl7Id);
			 pl7.setInitCount(0);
			 
			 Place pl8 = petriNetFactory.createPlace();
			 String pl8Id = Time4Sys2PetriNet.generatePlaceId();
			 pl8.setId(pl8Id);
			 pl8.setName(pl8Id);
			 
			 Place pl9 = petriNetFactory.createPlace();
			 String pl9Id = Time4Sys2PetriNet.generatePlaceId();
			 pl9.setId(pl9Id);
			 pl9.setName(pl9Id);
			 pl9.setInitCount(0);
			 
			 Place pl10 = petriNetFactory.createPlace();
			 String pl10Id = Time4Sys2PetriNet.generatePlaceId();
			 pl10.setId(pl10Id);
			 pl10.setName(pl10Id);
			 pl10.setInitCount(0);
			 
			 Place pl11 = petriNetFactory.createPlace();
			 String pl11Id = Time4Sys2PetriNet.generatePlaceId();
			 pl11.setId(pl11Id);
			 pl11.setName(pl11Id);
			 pl11.setInitCount(0);
			 
			 Place pl12 = petriNetFactory.createPlace();
			 String pl12Id = Time4Sys2PetriNet.generatePlaceId();
			 pl12.setId(pl12Id);
			 pl12.setName(pl12Id);
			 pl12.setInitCount(0);
			 
			 Place pl13 = petriNetFactory.createPlace();
			 String pl13Id = Time4Sys2PetriNet.generatePlaceId();
			 pl13.setId(pl13Id);
			 pl13.setName(pl13Id);
			 pl13.setInitCount(0);
			 
			 Place pl14 = petriNetFactory.createPlace();
			 String pl14Id = Time4Sys2PetriNet.generatePlaceId();
			 pl14.setId(pl14Id);
			 pl14.setName(pl14Id);
			 pl14.setInitCount(0);			 
			 
			 Transition trans1 = petriNetFactory.createTransition();
			 String trans1Id = Time4Sys2PetriNet.generateTransitionId();
			 trans1.setId(trans1Id);
			 trans1.setName(trans1Id);
			 trans1.setLowerBound("0");
			 trans1.setUpperBound("0");
			 
			 Transition trans2 = petriNetFactory.createTransition();
			 String trans2Id = Time4Sys2PetriNet.generateTransitionId();
			 trans2.setId(trans2Id);
			 trans2.setName(trans2Id);
			 trans2.setLowerBound("0");
			 trans2.setUpperBound("0");
			 
			 Transition trans3 = petriNetFactory.createTransition();
			 String trans3Id = Time4Sys2PetriNet.generateTransitionId();
			 trans3.setId(trans3Id);
			 trans3.setName(trans3Id);
			 trans3.setLowerBound("wt");
			 trans3.setUpperBound("wt");
			 
			 Transition trans4 = petriNetFactory.createTransition();
			 String trans4Id = Time4Sys2PetriNet.generateTransitionId();
			 trans4.setId(trans4Id);
			 trans4.setName(trans4Id);
			 trans4.setLowerBound("0");
			 trans4.setUpperBound("0");
			 
			 Transition trans5 = petriNetFactory.createTransition();
			 String trans5Id = Time4Sys2PetriNet.generateTransitionId();
			 trans5.setId(trans5Id);
			 trans5.setName(trans5Id);
			 trans5.setLowerBound("0");
			 trans5.setUpperBound("0");
			 
			 Transition trans6 = petriNetFactory.createTransition();
			 String trans6Id = Time4Sys2PetriNet.generateTransitionId();
			 trans6.setId(trans6Id);
			 trans6.setName(trans6Id);
			 trans6.setLowerBound("0");
			 trans6.setUpperBound("0");
			 
			 Transition trans7 = petriNetFactory.createTransition();
			 String trans7Id = Time4Sys2PetriNet.generateTransitionId();
			 trans7.setId(trans7Id);
			 trans7.setName(trans7Id);
			 trans7.setLowerBound("0");
			 trans7.setUpperBound("0");
			 
			 Transition trans8 = petriNetFactory.createTransition();
			 String trans8Id = Time4Sys2PetriNet.generateTransitionId();
			 trans8.setId(trans8Id);
			 trans8.setName(trans8Id);
			 trans8.setLowerBound("0");
			 trans8.setUpperBound("0");
			 
			 Transition trans9 = petriNetFactory.createTransition();
			 String trans9Id = Time4Sys2PetriNet.generateTransitionId();
			 trans9.setId(trans9Id);
			 trans9.setName(trans9Id);
			 trans9.setLowerBound("wt");
			 trans9.setUpperBound("wt");
			 
			 Transition trans10 = petriNetFactory.createTransition();
			 String trans10Id = Time4Sys2PetriNet.generateTransitionId();
			 trans10.setId(trans10Id);
			 trans10.setName(trans10Id);
			 trans10.setLowerBound("0");
			 trans10.setUpperBound("0");
			 
			 Transition trans11 = petriNetFactory.createTransition();
			 String trans11Id = Time4Sys2PetriNet.generateTransitionId();
			 trans11.setId(trans11Id);
			 trans11.setName(trans11Id);
			 trans11.setLowerBound("0");
			 trans11.setUpperBound("0");
			 
			 Transition trans12 = petriNetFactory.createTransition();
			 String trans12Id = Time4Sys2PetriNet.generateTransitionId();
			 trans12.setId(trans12Id);
			 trans12.setName(trans12Id);
			 trans12.setLowerBound("0");
			 trans12.setUpperBound("0");
			 
			 Connection conn1 = petriNetFactory.createNormalArc();
			 conn1.setSource(pl1);
			 pl1.getOutputRel().add(conn1);
			 conn1.setTarget(trans1);
			 trans1.getInputRel().add(conn1);

			 Connection conn2 = petriNetFactory.createNormalArc();
			 conn2.setSource(pl1);
			 pl1.getOutputRel().add(conn2);
			 conn2.setTarget(trans7);
			 trans7.getInputRel().add(conn2);
			 
			 Connection conn3 = petriNetFactory.createNormalArc();
			 conn3.setSource(pl2);
			 pl2.getOutputRel().add(conn3);
			 conn3.setTarget(trans2);
			 trans2.getInputRel().add(conn3);
			 
			 Connection conn4 = petriNetFactory.createNormalArc();
			 conn4.setSource(pl2);
			 pl2.getOutputRel().add(conn4);
			 conn4.setTarget(trans8);
			 trans8.getInputRel().add(conn4);
			 
			 Connection conn5 = petriNetFactory.createNormalArc();
			 conn5.setSource(trans1);
			 trans1.getOutputRel().add(conn5);
			 conn5.setTarget(pl3);
			 pl3.getInputRel().add(conn5);
			 conn5.setToken(1);
			 
			 Connection conn6 = petriNetFactory.createNormalArc();
			 conn6.setSource(trans2);
			 trans2.getOutputRel().add(conn6);
			 conn6.setTarget(pl4);
			 pl4.getInputRel().add(conn6);
			 conn6.setToken(1);
			 
			 Connection conn7 = petriNetFactory.createNormalArc();
			 conn7.setSource(pl3);
			 pl3.getOutputRel().add(conn7);
			 conn7.setTarget(trans3);
			 trans3.getInputRel().add(conn7);
			 
			 Connection conn8 = petriNetFactory.createNormalArc();
			 conn8.setSource(pl3);
			 pl3.getOutputRel().add(conn8);
			 conn8.setTarget(trans4);
			 trans4.getInputRel().add(conn8);
			 
			 Connection conn9 = petriNetFactory.createNormalArc();
			 conn9.setSource(pl4);
			 pl4.getOutputRel().add(conn9);
			 conn9.setTarget(trans4);
			 trans4.getInputRel().add(conn9);
			 
			 Connection conn10 = petriNetFactory.createNormalArc();
			 conn10.setSource(pl5);
			 pl5.getOutputRel().add(conn10);
			 conn10.setTarget(trans1);
			 trans1.getInputRel().add(conn10);
			 
			 Connection conn11 = petriNetFactory.createNormalArc();
			 conn11.setSource(pl6);
			 pl6.getOutputRel().add(conn11);
			 conn11.setTarget(trans2);
			 trans2.getInputRel().add(conn11);
			 
			 Connection conn12 = petriNetFactory.createNormalArc();
			 conn12.setSource(trans1);
			 trans1.getOutputRel().add(conn12);
			 conn12.setTarget(pl11);
			 pl11.getInputRel().add(conn12);
			 conn12.setToken(1);
			 
			 Connection conn13 = petriNetFactory.createNormalArc();
			 conn13.setSource(trans2);
			 trans2.getOutputRel().add(conn13);
			 conn13.setTarget(pl12);
			 pl12.getInputRel().add(conn13);
			 conn13.setToken(1);
			 
			 Connection conn14 = petriNetFactory.createNormalArc();
			 conn14.setSource(trans7);
			 trans7.getOutputRel().add(conn14);
			 conn14.setTarget(pl5);
			 pl5.getInputRel().add(conn14);
			 
			 Connection conn15 = petriNetFactory.createNormalArc();
			 conn15.setSource(trans8);
			 trans8.getOutputRel().add(conn15);
			 conn15.setTarget(pl6);
			 pl6.getInputRel().add(conn15);
			 
			 Connection conn16 = petriNetFactory.createNormalArc();
			 conn16.setSource(trans3);
			 trans3.getOutputRel().add(conn16);
			 conn16.setTarget(pl7);
			 pl7.getInputRel().add(conn16);
			 
			 Connection conn17 = petriNetFactory.createNormalArc();
			 conn17.setSource(trans4);
			 trans4.getOutputRel().add(conn17);
			 conn17.setTarget(pl8);
			 pl8.getInputRel().add(conn17);
			 
			 Connection conn18 = petriNetFactory.createNormalArc();
			 conn18.setSource(pl7);
			 pl7.getOutputRel().add(conn18);
			 conn18.setTarget(trans5);
			 trans5.getInputRel().add(conn18);
			 
			 Connection conn19 = petriNetFactory.createNormalArc();
			 conn19.setSource(pl8);
			 pl8.getOutputRel().add(conn19);
			 conn19.setTarget(trans6);
			 trans6.getInputRel().add(conn19);
			 
			 Connection conn20 = petriNetFactory.createNormalArc();
			 conn20.setSource(pl11);
			 pl11.getOutputRel().add(conn20);
			 conn20.setTarget(trans7);
			 trans7.getInputRel().add(conn20);
	
			 Connection conn21 = petriNetFactory.createNormalArc();
			 conn21.setSource(pl12);
			 pl12.getOutputRel().add(conn21);
			 conn21.setTarget(trans8);
			 trans8.getInputRel().add(conn21);
	
			 Connection conn22 = petriNetFactory.createNormalArc();
			 conn22.setSource(trans7);
			 trans7.getOutputRel().add(conn22);
			 conn22.setTarget(pl9);
			 pl9.getInputRel().add(conn22);
				
			 Connection conn23 = petriNetFactory.createNormalArc();
			 conn23.setSource(trans8);
			 trans8.getOutputRel().add(conn23);
			 conn23.setTarget(pl10);
			 pl10.getInputRel().add(conn23);
				
			 Connection conn24 = petriNetFactory.createNormalArc();
			 conn24.setSource(pl9);
			 pl9.getOutputRel().add(conn24);
			 conn24.setTarget(trans9);
			 trans9.getInputRel().add(conn24);
				
			 Connection conn25 = petriNetFactory.createNormalArc();
			 conn25.setSource(pl9);
			 pl9.getOutputRel().add(conn25);
			 conn25.setTarget(trans10);
			 trans10.getInputRel().add(conn25);
				
			 Connection conn26 = petriNetFactory.createNormalArc();
			 conn26.setSource(pl10);
			 pl10.getOutputRel().add(conn26);
			 conn26.setTarget(trans10);
			 trans10.getInputRel().add(conn26);
			 
			 Connection conn27 = petriNetFactory.createNormalArc();
			 conn27.setSource(trans9);
			 trans9.getOutputRel().add(conn27);
			 conn27.setTarget(pl13);
			 pl13.getInputRel().add(conn27);
			 
			 Connection conn28 = petriNetFactory.createNormalArc();
			 conn28.setSource(trans10);
			 trans10.getOutputRel().add(conn28);
			 conn28.setTarget(pl14);
			 pl14.getInputRel().add(conn28);
			 
			 Connection conn29 = petriNetFactory.createNormalArc();
			 conn29.setSource(pl13);
			 pl13.getOutputRel().add(conn29);
			 conn29.setTarget(trans11);
			 trans11.getInputRel().add(conn29);
			 
			 Connection conn30 = petriNetFactory.createNormalArc();
			 conn30.setSource(pl14);
			 pl14.getOutputRel().add(conn30);
			 conn30.setTarget(trans12);
			 trans12.getInputRel().add(conn30);
			 
			 Connection conn31 = petriNetFactory.createFlushArc();
			 conn31.setSource(pl4);
			 pl4.getOutputRel().add(conn31);
			 conn31.setTarget(trans1);
			 trans1.getInputRel().add(conn31);

			 Connection conn32 = petriNetFactory.createFlushArc();
			 conn32.setSource(pl10);
			 pl10.getOutputRel().add(conn32);
			 conn32.setTarget(trans7);
			 trans7.getInputRel().add(conn32);	
			 
			 Transition jitterTransition = currentTask.getStimulus().getJitter().getOwnedTransition();
			 Transition execTransition;
			 
			 Transition lastFragmentTransition = null;
			 if (currentTask.getFragments().size()>0) lastFragmentTransition = currentTask.getFragments().get(currentTask.getFragments().size()-1).getOwnedTransition();
			 
			 Transition lastSharingResourceFragmentTransition = null;
			 if (currentTask.getSharingResourceFragments().size()>0) lastSharingResourceFragmentTransition = currentTask.getSharingResourceFragments().get(currentTask.getSharingResourceFragments().size()-1).getSecondFragment().getOwnedTransition();
			 
			 if (lastFragmentTransition==null) execTransition = lastSharingResourceFragmentTransition;
			 else if (lastSharingResourceFragmentTransition==null) execTransition = lastFragmentTransition;
			 else {
				 if (precede(lastFragmentTransition, lastSharingResourceFragmentTransition)) execTransition = lastSharingResourceFragmentTransition;
				 else execTransition = lastFragmentTransition;
			 }
			 
			 Connection conn33 = petriNetFactory.createNormalArc();
			 conn33.setSource(jitterTransition);
			 jitterTransition.getOutputRel().add(conn33);
			 conn33.setTarget(pl1);
			 pl1.getInputRel().add(conn33);

			 Connection conn34 = petriNetFactory.createNormalArc();
			 conn34.setSource(execTransition);
			 execTransition.getOutputRel().add(conn34);
			 conn34.setTarget(pl2);
			 pl2.getInputRel().add(conn34);
			 
			 taskmodel.ResponseTimeObserver observer = taskModelFactory.createResponseTimeObserver();
			 observer.getOwnedPlaces().add(pl1);
			 observer.getOwnedPlaces().add(pl2);
			 observer.getOwnedPlaces().add(pl3);
			 observer.getOwnedPlaces().add(pl4);
			 observer.getOwnedPlaces().add(pl5);
			 observer.getOwnedPlaces().add(pl6);
			 observer.getOwnedPlaces().add(pl7);
			 observer.getOwnedPlaces().add(pl8);
			 observer.getOwnedPlaces().add(pl9);
			 observer.getOwnedPlaces().add(pl10);
			 observer.getOwnedPlaces().add(pl11);
			 observer.getOwnedPlaces().add(pl12);
			 observer.getOwnedPlaces().add(pl13);
			 observer.getOwnedPlaces().add(pl14);
			 
			 observer.getOwnedTransitions().add(trans1);
			 observer.getOwnedTransitions().add(trans2);
			 observer.getOwnedTransitions().add(trans3);
			 observer.getOwnedTransitions().add(trans4);
			 observer.getOwnedTransitions().add(trans5);
			 observer.getOwnedTransitions().add(trans6);
			 observer.getOwnedTransitions().add(trans7);
			 observer.getOwnedTransitions().add(trans8);
			 observer.getOwnedTransitions().add(trans9);
			 observer.getOwnedTransitions().add(trans10);
			 observer.getOwnedTransitions().add(trans11);
			 observer.getOwnedTransitions().add(trans12);
			 
			 observer.getConnections().add(conn1);
			 observer.getConnections().add(conn2);
			 observer.getConnections().add(conn3);
			 observer.getConnections().add(conn4);
			 observer.getConnections().add(conn5);
			 observer.getConnections().add(conn6);
			 observer.getConnections().add(conn7);
			 observer.getConnections().add(conn8);
			 observer.getConnections().add(conn9);
			 observer.getConnections().add(conn10);
			 observer.getConnections().add(conn11);
			 observer.getConnections().add(conn12);
			 observer.getConnections().add(conn13);
			 observer.getConnections().add(conn14);
			 observer.getConnections().add(conn15);
			 observer.getConnections().add(conn16);
			 observer.getConnections().add(conn17);
			 observer.getConnections().add(conn18);
			 observer.getConnections().add(conn19);
			 observer.getConnections().add(conn20);
			 observer.getConnections().add(conn21);
			 observer.getConnections().add(conn22);
			 observer.getConnections().add(conn23);
			 observer.getConnections().add(conn24);
			 observer.getConnections().add(conn25);
			 observer.getConnections().add(conn26);
			 observer.getConnections().add(conn27);
			 observer.getConnections().add(conn28);
			 observer.getConnections().add(conn29);
			 observer.getConnections().add(conn30);
			 observer.getConnections().add(conn31);
			 observer.getConnections().add(conn32);
			 observer.getConnections().add(conn33);
			 observer.getConnections().add(conn34);
			 
			 observer.getCheckPlaces().add(pl7);
			 observer.getCheckPlaces().add(pl13);
			 
			 system.getObservers().add(observer);
			 
			 return observer;
		}
		
		return null;
	}
	
	/**
	 * precede
	 * @param node1
	 * @param node2
	 * @return
	 */
	private static boolean precede(Node node1,Node node2) {
		
		List<Connection> allConnections = node1.getOutputRel();
		List<NormalArc> allNormalArcs = new ArrayList<NormalArc>();
		for (Connection conn: allConnections) {
			if (conn instanceof NormalArc) allNormalArcs.add((NormalArc)conn);
		}
		
		if (allNormalArcs.size()==0) return false;
		
		for (Connection conn : allNormalArcs) {
			if (conn.getTarget()==node2) return true;
		}
		
		boolean result = false;
		for (Connection conn : allNormalArcs) {
			result = result || precede(conn.getTarget(), node2);
		}
		return result;
	}
}
