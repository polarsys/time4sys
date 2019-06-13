/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Thanh Dat NGUYEN- initial API and implementation
 * Aurelien DIDIER - connection to analysis repository 
 *******************************************************************************/
package time4sys2petrinet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.osgi.service.component.annotations.Component;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.common.CurrentAnalysisContext;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.AnalysisRepositoryControler;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.utils.WorkspaceUtils;
import org.polarsys.time4sys.marte.analysisrepository.tysco.util.AbstractExogenousTransformation;

import petrinet.Connection;
import petrinet.FlushArc;
import petrinet.NormalArc;
import petrinet.PetriNet;
import petrinet.Place;
import petrinet.TimedInhibitorArc;
import petrinet.Transition;
import taskmodel.Observer;
import taskmodel.System;

@Component
public class RomeoCTSSerialization implements AbstractExogenousTransformation{

	public static RomeoCTSSerialization launcher;
	
	public RomeoCTSSerialization() {
		launcher = this;
	}
	
	
	
	public static int maxNbToken = 10;
	
	/**
	 * Generate file CTS from petri net model
	 * @param petriNet
	 * @param outputModelPath
	 */
	public static String generateRomeoCTS(PetriNet petriNet,String outputModelPath) {
	
		String content = "";
		content += generateInitially(petriNet)+"\n\n";
	
		List<Transition> allTransitions = petriNet.getTransitions();
		for (Transition tran : allTransitions) {
			content += generateTransition(tran) +"\n\n";
		}
		
		writeToFile(content,outputModelPath);
		
		return content;
	}
	
//	/**
//	 * Generate CTS file from system model
//	 * @param system
//	 * @param outputModelPath
//	 * @return
//	 */
//	public static String generateRomeoCTS(System system,String outputModelPath) {
//		
//		PetriNet petriNet = system.convertToPetrinet();
//		int nbObservers = system.getObservers().size();
//		for (int i=0;i<nbObservers;i++) {
//			Place observerPlace = system.getObservers().get(i).getOwnedPlaces().get(0);
//			
//		}
//	}
	
	
	private static String getSourceDirPath() {
		String sourceDir = launcher.getClass().getClassLoader().getResource("time4sys2petrinet/RomeoCTSSerialization").getPath();
		if (sourceDir.contains("!")) sourceDir = sourceDir.substring(0,sourceDir.lastIndexOf('!')+1);
        else sourceDir = sourceDir.substring(0,sourceDir.lastIndexOf("bin/time4sys2petrinet/"));
        if (sourceDir.startsWith("/")) sourceDir = sourceDir.substring(1,sourceDir.length());
        if (sourceDir.startsWith("file:/")) sourceDir = sourceDir.substring(6,sourceDir.length());
        return sourceDir;
	}
	
	
	/**
	 * Generate transition
	 * @param transition
	 * @return
	 */
	private static String generateTransition(Transition transition) {
		
		/******************************************************/
		// get all input-connection
		List<TimedInhibitorArc> allInTimedInhibitorArcs = new ArrayList<TimedInhibitorArc>();
		List<NormalArc> allInNormalArcs = new ArrayList<NormalArc>();
		List<FlushArc> allInFlushArcs = new ArrayList<FlushArc>();

		String content = "";
		
		List<Connection> allInConnections = transition.getInputRel();
		for (Connection conn : allInConnections) {
			if (conn instanceof NormalArc) allInNormalArcs.add((NormalArc)conn);
			else if (conn instanceof TimedInhibitorArc) {
				allInTimedInhibitorArcs.add((TimedInhibitorArc)conn);
			}
			else allInFlushArcs.add((FlushArc) conn);
		}
		
		//java.lang.System.out.println("allInConnections.size() = "+allInConnections.size());
		
		List<Place> allImpactedPlaces = new ArrayList<Place>();
		for (Connection conn : allInNormalArcs) {
			allImpactedPlaces.add((Place)conn.getSource());
		}
		for (Connection conn : allInTimedInhibitorArcs) {
			allImpactedPlaces.add((Place)conn.getSource());
		}
		for (Connection conn : allInFlushArcs) {
			allImpactedPlaces.add((Place)conn.getSource());
		}
			
		content += "transition " + "[";
		
		//java.lang.System.out.println("allInFlushArcs.size() = "+allInFlushArcs.size());
		//java.lang.System.out.println("allInNormalArcs.size() = "+allInNormalArcs.size());
		//java.lang.System.out.println("allInTimedInhibitorArcs.size() = "+allInTimedInhibitorArcs.size());
		
		if (allImpactedPlaces.size()==1 && allInNormalArcs.size()==1) {
			Place impactedPlace = allImpactedPlaces.get(0);
			content += " intermediate { "+ impactedPlace.getId()+ " = " + impactedPlace.getId() + " - 1; }]";
			
			//java.lang.System.out.println(1);
			
		} else if (allImpactedPlaces.size()==1 && allInTimedInhibitorArcs.size()==1) {
			Place impactedPlace = allImpactedPlaces.get(0);
			content += "speed=min(1,max(0,1-"+impactedPlace.getId()+")) ]";
		
			//java.lang.System.out.println(2);
		
		} else if (allImpactedPlaces.size()==1 && allInFlushArcs.size()==1){
			Place impactedPlace = allImpactedPlaces.get(0);
			content += "intermediate { "+impactedPlace.getId() +" = "+"0;}]";
			
			//java.lang.System.out.println(3);
			
		} else if (allImpactedPlaces.size()>1 && allInNormalArcs.size() == allImpactedPlaces.size()) {
			Place firstImpactedPlace = allImpactedPlaces.get(0);
			content += "intermediate { "+ firstImpactedPlace.getId()+ " = " +firstImpactedPlace.getId() + " - 1";
			for (int i=1;i<allImpactedPlaces.size();i++) {
				content += ", " + allImpactedPlaces.get(i).getId() + " = " +allImpactedPlaces.get(i).getId()+ " - 1";
			}
			content += "; }]";
			
			//java.lang.System.out.println(4);
			
		} else if (allInFlushArcs.size()==0 && allInNormalArcs.size()==1 && allInTimedInhibitorArcs.size()==1) {
			Place placeOfNormalArc = (Place) allInNormalArcs.get(0).getSource();
			Place placeOfTimedInhibitorArc = (Place) allInTimedInhibitorArcs.get(0).getSource();
			content += "intermediate { "+ placeOfNormalArc.getId() + " = " +placeOfNormalArc.getId() + " - 1; },";
			content += "speed=min(1,max(0,1-"+placeOfTimedInhibitorArc.getId()+")) ]";
			
			//java.lang.System.out.println(5);
			
		} else if (allInFlushArcs.size()==0 && allInNormalArcs.size()>1 && allInTimedInhibitorArcs.size()==1) {
			List<Place> placesOfNormalArcs = new ArrayList<Place>();
			for (NormalArc normalArc : allInNormalArcs) {
				placesOfNormalArcs.add((Place)normalArc.getSource());
			}
			
			Place firstPlace = placesOfNormalArcs.get(0);
			content += "intermediate { " + firstPlace.getId() +" = "+ firstPlace.getId() + " - 1";
			for (int i=1;i<placesOfNormalArcs.size();i++) {
				content += ", " + placesOfNormalArcs.get(i).getId() + " = " + placesOfNormalArcs.get(i).getId() + " - 1";
			}
			content += "; },";
			Place placeOfTimedInhibitorArc = (Place) allInTimedInhibitorArcs.get(0).getSource();
			content += "speed=min(1,max(0,1-"+placeOfTimedInhibitorArc.getId()+")) ]";
			
			//java.lang.System.out.println(6);
			
		} else if (allInFlushArcs.size()==0 && allInNormalArcs.size()==1 && allInTimedInhibitorArcs.size()>1) {
			Place placeOfNormalArc = (Place) allInNormalArcs.get(0).getSource();
			content += "intermediate { " +placeOfNormalArc.getId() + " = " +placeOfNormalArc.getId() +" - 1;},";
		
			List<Place> placesOfTimedInhibitorArcs = new ArrayList<Place>();
			for (TimedInhibitorArc timedInhibitorArc : allInTimedInhibitorArcs) {
				placesOfTimedInhibitorArcs.add((Place)timedInhibitorArc.getSource());
			}
			content += "speed=";
			if (placesOfTimedInhibitorArcs.size()==2) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				content += "min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"+pl1.getId()+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==3) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				content += "min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==4) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				content += "min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==5) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				content += "min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()
						+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==6) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				content += "min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==7) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				content += "min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()
						+")) ]";
			}  else if (placesOfTimedInhibitorArcs.size()==8) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				content += "min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")) ]";
			}   else if (placesOfTimedInhibitorArcs.size()==9) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				content += "min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")) ]";
			}  else if (placesOfTimedInhibitorArcs.size()==10) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				content += "min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==11) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				content += "min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==12) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()+")) ]";
			}  else if (placesOfTimedInhibitorArcs.size()==13) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==14) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				Place pl13 = placesOfTimedInhibitorArcs.get(13);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")),max(0,1-"+pl13.getId()+")) ]";
			
			} else if (placesOfTimedInhibitorArcs.size()==15) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				Place pl13 = placesOfTimedInhibitorArcs.get(13);
				Place pl14 = placesOfTimedInhibitorArcs.get(14);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")),max(0,1-"+pl13.getId()
						+")),max(0,1-"+pl14.getId()+")) ]";
			
			} else if (placesOfTimedInhibitorArcs.size()==16) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				Place pl13 = placesOfTimedInhibitorArcs.get(13);
				Place pl14 = placesOfTimedInhibitorArcs.get(14);
				Place pl15 = placesOfTimedInhibitorArcs.get(15);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")),max(0,1-"+pl13.getId()
						+")),max(0,1-"+pl14.getId()+")),max(0,1-"+pl15.getId()+")) ]";
			
			} else if (placesOfTimedInhibitorArcs.size()==17) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				Place pl13 = placesOfTimedInhibitorArcs.get(13);
				Place pl14 = placesOfTimedInhibitorArcs.get(14);
				Place pl15 = placesOfTimedInhibitorArcs.get(15);
				Place pl16 = placesOfTimedInhibitorArcs.get(16);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")),max(0,1-"+pl13.getId()
						+")),max(0,1-"+pl14.getId()+")),max(0,1-"+pl15.getId()
						+")),max(0,1-"+pl16.getId()+")) ]";
			
			} else if (placesOfTimedInhibitorArcs.size()==18) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				Place pl13 = placesOfTimedInhibitorArcs.get(13);
				Place pl14 = placesOfTimedInhibitorArcs.get(14);
				Place pl15 = placesOfTimedInhibitorArcs.get(15);
				Place pl16 = placesOfTimedInhibitorArcs.get(16);
				Place pl17 = placesOfTimedInhibitorArcs.get(17);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")),max(0,1-"+pl13.getId()
						+")),max(0,1-"+pl14.getId()+")),max(0,1-"+pl15.getId()
						+")),max(0,1-"+pl16.getId()+")),max(0,1-"+pl17.getId()+")) ]";
			
			} else {
				java.lang.System.out.println("TimedInhibitorArcs: "+placesOfTimedInhibitorArcs.size());
			}
			
			//java.lang.System.out.println(7);
						
		} else if (allInFlushArcs.size()==0 && allInNormalArcs.size()>1 && allInTimedInhibitorArcs.size()>1) {
			List<Place> placesOfNormalArcs = new ArrayList<Place>();
			for (NormalArc normalArc : allInNormalArcs) {
				placesOfNormalArcs.add((Place)normalArc.getSource());
			}
			
			Place firstPlace = placesOfNormalArcs.get(0);
			content += "intermediate { " + firstPlace.getId() +" = "+ firstPlace.getId() + " - 1";
			for (int i=1;i<placesOfNormalArcs.size();i++) {
				content += ", " + placesOfNormalArcs.get(i).getId() + " = " + placesOfNormalArcs.get(i).getId() + " - 1";
			}
			content += "; },";
			
			List<Place> placesOfTimedInhibitorArcs = new ArrayList<Place>();
			for (TimedInhibitorArc timedInhibitorArc : allInTimedInhibitorArcs) {
				placesOfTimedInhibitorArcs.add((Place)timedInhibitorArc.getSource());
			}
			content += "speed=";
			if (placesOfTimedInhibitorArcs.size()==2) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				content += "min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"+pl1.getId()+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==3) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				content += "min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==4) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				content += "min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==5) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				content += "min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()
						+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==6) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				content += "min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==7) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				content += "min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()
						+")) ]";
			}  else if (placesOfTimedInhibitorArcs.size()==8) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				content += "min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")) ]";
			}   else if (placesOfTimedInhibitorArcs.size()==9) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				content += "min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")) ]";
			}  else if (placesOfTimedInhibitorArcs.size()==10) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				content += "min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()+")) ]";
			}  else if (placesOfTimedInhibitorArcs.size()==11) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				content += "min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==12) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==13) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==14) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				Place pl13 = placesOfTimedInhibitorArcs.get(13);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")),max(0,1-"+pl13.getId()+")) ]";
			
			} else if (placesOfTimedInhibitorArcs.size()==15) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				Place pl13 = placesOfTimedInhibitorArcs.get(13);
				Place pl14 = placesOfTimedInhibitorArcs.get(14);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")),max(0,1-"+pl13.getId()
						+")),max(0,1-"+pl14.getId()+")) ]";
			
			} else if (placesOfTimedInhibitorArcs.size()==16) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				Place pl13 = placesOfTimedInhibitorArcs.get(13);
				Place pl14 = placesOfTimedInhibitorArcs.get(14);
				Place pl15 = placesOfTimedInhibitorArcs.get(15);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")),max(0,1-"+pl13.getId()
						+")),max(0,1-"+pl14.getId()+")),max(0,1-"+pl15.getId()+")) ]";
			
			} else if (placesOfTimedInhibitorArcs.size()==17) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				Place pl13 = placesOfTimedInhibitorArcs.get(13);
				Place pl14 = placesOfTimedInhibitorArcs.get(14);
				Place pl15 = placesOfTimedInhibitorArcs.get(15);
				Place pl16 = placesOfTimedInhibitorArcs.get(16);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")),max(0,1-"+pl13.getId()
						+")),max(0,1-"+pl14.getId()+")),max(0,1-"+pl15.getId()
						+")),max(0,1-"+pl16.getId()+")) ]";
			
			} else if (placesOfTimedInhibitorArcs.size()==18) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				Place pl13 = placesOfTimedInhibitorArcs.get(13);
				Place pl14 = placesOfTimedInhibitorArcs.get(14);
				Place pl15 = placesOfTimedInhibitorArcs.get(15);
				Place pl16 = placesOfTimedInhibitorArcs.get(16);
				Place pl17 = placesOfTimedInhibitorArcs.get(17);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")),max(0,1-"+pl13.getId()
						+")),max(0,1-"+pl14.getId()+")),max(0,1-"+pl15.getId()
						+")),max(0,1-"+pl16.getId()+")),max(0,1-"+pl17.getId()+")) ]";
			
			} else {
				java.lang.System.out.println("timedInhibitorArcs: "+placesOfTimedInhibitorArcs.size());
			}
			
		} else if (allInFlushArcs.size()>1 && allInNormalArcs.size()==0 && allInTimedInhibitorArcs.size()==0) {
			Place firstImpactedPlace = (Place)allInFlushArcs.get(0).getSource();
			content += "intermediate { "+ firstImpactedPlace.getId()+" = 0";
			for (int i=1;i<allInFlushArcs.size();i++) {
				Place currentPlace = (Place) allInFlushArcs.get(i).getSource(); 
				content += ", " + currentPlace.getId()+" = 0";
			}
			content += ";} ]";
			
			//java.lang.System.out.println(9);
			
		} else if (allInFlushArcs.size()>0 && allInNormalArcs.size()>0 && allInTimedInhibitorArcs.size()==0) {
			Place firstImpacedPlace = (Place)allInFlushArcs.get(0).getSource();
			content += "intermediate { "+firstImpacedPlace.getId() + " = 0";
			
			for (int i=1;i<allInFlushArcs.size();i++) {
				Place currentPlace = (Place) allInFlushArcs.get(i).getSource();
				content += ", " + currentPlace.getId()+" = 0";
			}
			
			for (int i=0;i<allInNormalArcs.size();i++) {
				Place currentPlace = (Place) allInNormalArcs.get(i).getSource();
				content += ", "+ currentPlace.getId() +" = "+currentPlace.getId()+" - 1";
			}
			content += ";} ]";
			
			//java.lang.System.out.println(10);
			
		} else if (allInFlushArcs.size()>0 && allInNormalArcs.size()>0 && allInTimedInhibitorArcs.size()>0) {
			Place firstImpacedPlace = (Place)allInFlushArcs.get(0).getSource();
			content += "intermediate { "+firstImpacedPlace.getId() + " = 0";
			
			for (int i=1;i<allInFlushArcs.size();i++) {
				Place currentPlace = (Place) allInFlushArcs.get(i).getSource();
				content += ", " + currentPlace.getId()+" = 0";
			}
			
			for (int i=0;i<allInNormalArcs.size();i++) {
				Place currentPlace = (Place) allInNormalArcs.get(i).getSource();
				content += ", "+ currentPlace.getId() +" = "+currentPlace.getId()+" - 1";
			}
			content += ";}, ";
			
			List<Place> placesOfTimedInhibitorArcs = new ArrayList<Place>();
			for (TimedInhibitorArc timedInhibitorArc : allInTimedInhibitorArcs) {
				placesOfTimedInhibitorArcs.add((Place)timedInhibitorArc.getSource());
			}
			content += "speed=";
			if (placesOfTimedInhibitorArcs.size()==2) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				content += "min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"+pl1.getId()+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==3) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				content += "min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==4) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				content += "min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==5) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				content += "min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()
						+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==6) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				content += "min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==7) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				content += "min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()
						+")) ]";
			}  else if (placesOfTimedInhibitorArcs.size()==8) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				content += "min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")) ]";
			}   else if (placesOfTimedInhibitorArcs.size()==9) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				content += "min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")) ]";
			}  else if (placesOfTimedInhibitorArcs.size()==10) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				content += "min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()+")) ]";
			}  else if (placesOfTimedInhibitorArcs.size()==11) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				content += "min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")) ]";
			}  else if (placesOfTimedInhibitorArcs.size()==12) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==13) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")) ]";
			} else if (placesOfTimedInhibitorArcs.size()==14) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				Place pl13 = placesOfTimedInhibitorArcs.get(13);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")),max(0,1-"+pl13.getId()+")) ]";
			
			} else if (placesOfTimedInhibitorArcs.size()==15) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				Place pl13 = placesOfTimedInhibitorArcs.get(13);
				Place pl14 = placesOfTimedInhibitorArcs.get(14);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")),max(0,1-"+pl13.getId()
						+")),max(0,1-"+pl14.getId()+")) ]";
			
			} else if (placesOfTimedInhibitorArcs.size()==16) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				Place pl13 = placesOfTimedInhibitorArcs.get(13);
				Place pl14 = placesOfTimedInhibitorArcs.get(14);
				Place pl15 = placesOfTimedInhibitorArcs.get(15);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")),max(0,1-"+pl13.getId()
						+")),max(0,1-"+pl14.getId()+")),max(0,1-"+pl15.getId()+")) ]";
			
			} else if (placesOfTimedInhibitorArcs.size()==17) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				Place pl13 = placesOfTimedInhibitorArcs.get(13);
				Place pl14 = placesOfTimedInhibitorArcs.get(14);
				Place pl15 = placesOfTimedInhibitorArcs.get(15);
				Place pl16 = placesOfTimedInhibitorArcs.get(16);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")),max(0,1-"+pl13.getId()
						+")),max(0,1-"+pl14.getId()+")),max(0,1-"+pl15.getId()
						+")),max(0,1-"+pl16.getId()+")) ]";
			
			} else if (placesOfTimedInhibitorArcs.size()==18) {
				Place pl0 = placesOfTimedInhibitorArcs.get(0);
				Place pl1 = placesOfTimedInhibitorArcs.get(1);
				Place pl2 = placesOfTimedInhibitorArcs.get(2);
				Place pl3 = placesOfTimedInhibitorArcs.get(3);
				Place pl4 = placesOfTimedInhibitorArcs.get(4);
				Place pl5 = placesOfTimedInhibitorArcs.get(5);
				Place pl6 = placesOfTimedInhibitorArcs.get(6);
				Place pl7 = placesOfTimedInhibitorArcs.get(7);
				Place pl8 = placesOfTimedInhibitorArcs.get(8);
				Place pl9 = placesOfTimedInhibitorArcs.get(9);
				Place pl10 = placesOfTimedInhibitorArcs.get(10);
				Place pl11 = placesOfTimedInhibitorArcs.get(11);
				Place pl12 = placesOfTimedInhibitorArcs.get(12);
				Place pl13 = placesOfTimedInhibitorArcs.get(13);
				Place pl14 = placesOfTimedInhibitorArcs.get(14);
				Place pl15 = placesOfTimedInhibitorArcs.get(15);
				Place pl16 = placesOfTimedInhibitorArcs.get(16);
				Place pl17 = placesOfTimedInhibitorArcs.get(17);
				content += "min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(min(1,max(0,1-"+pl0.getId()+")),max(0,1-"
						+ pl1.getId()+")),max(0,1-"+pl2.getId()+")),max(0,1-"+pl3.getId()
						+")),max(0,1-"+pl4.getId()+")),max(0,1-"+pl5.getId()
						+")),max(0,1-"+pl6.getId()+")),max(0,1-"+pl7.getId()
						+")),max(0,1-"+pl8.getId()+")),max(0,1-"+pl9.getId()
						+")),max(0,1-"+pl10.getId()+")),max(0,1-"+pl11.getId()
						+")),max(0,1-"+pl12.getId()+")),max(0,1-"+pl13.getId()
						+")),max(0,1-"+pl14.getId()+")),max(0,1-"+pl15.getId()
						+")),max(0,1-"+pl16.getId()+")),max(0,1-"+pl17.getId()+")) ]";
			
			} else {
				java.lang.System.out.println("timedInhibitorArcs: "+placesOfTimedInhibitorArcs.size());
			}
			
			
		} else {
			
		}
		
		content+= transition.getId()+" ["+transition.getLowerBound()+","+transition.getUpperBound()+"]\n";
		
		/************************************/
		content += "\twhen (";
		//List<Connection> allInConns = transition.getInputRel();
				
		if (allInNormalArcs.size()==0) {
			
		} else if (allInNormalArcs.size()==1) {
			Place pl = (Place) allInNormalArcs.get(0).getSource();
			if (allInNormalArcs.get(0) instanceof NormalArc) {
				content += pl.getId() +" >= 1";
			}

		} else {
			//java.lang.System.out.println(allInNormalArcs);
			Connection firstConn = allInNormalArcs.get(0);
			Place firstPlace = (Place) firstConn.getSource();
			if (firstConn instanceof NormalArc) {
				content += firstPlace.getId() + " >= 1";
			}
			for (int i=1;i<allInNormalArcs.size();i++) {
				content += " and ";
				Connection nextConn = allInNormalArcs.get(i);
				Place nextPlace = (Place) nextConn.getSource();
				if (nextConn instanceof NormalArc) {
					content += nextPlace.getId() + " >= 1";
				}
			}
		}
		content += ")";	
		/************************************************/
		content += "\n\t{ ";

		List<Connection> allOutConnectionss = transition.getOutputRel();
		
		if (allInTimedInhibitorArcs.size()==0
					&& allInNormalArcs.size()==1
					&& allOutConnectionss.size()==0) {
			Place pl = (Place) allInNormalArcs.get(0).getSource();
			content += pl.getId() + " = " + pl.getId() +" - 1";
			
		} else if (allInTimedInhibitorArcs.size()==0
					&& allInNormalArcs.size()==0
					&& allOutConnectionss.size()==1) {
			Place pl = (Place) allInNormalArcs.get(0).getSource();
			content += pl.getId() + " = " + pl.getId() +" + 1";
			
		} else {
			List<Place> normalInPlaces = new ArrayList<Place>();
			for (Connection conn: allInNormalArcs) {
				normalInPlaces.add((Place)conn.getSource());
			}
			
			List<Place> normalOutPlaces = new ArrayList<Place>();
			for (Connection conn : allOutConnectionss) {
				normalOutPlaces.add((Place)conn.getTarget());
			}
			
			List<Place> flushArcInPlaces = new ArrayList<Place>();
			for (Connection conn : allInFlushArcs) {
				flushArcInPlaces.add((Place)conn.getSource());
			}
			
			Place firstPlace = normalInPlaces.get(0);
			if (!normalOutPlaces.contains(firstPlace)) {
				content += firstPlace.getId() + " = " + firstPlace.getId() + "- 1";
			} else {
				content += firstPlace.getId() + " = " + firstPlace.getId() + "- 1 + 1";
			}
			
			for (int i=1;i<normalInPlaces.size();i++) {
				Place pl = normalInPlaces.get(i);
				if (!normalOutPlaces.contains(pl)) {
					content += ", "+ pl.getId() + " = " + pl.getId() +" - 1";
				} else {
					content += ", "+ pl.getId() + " = " + pl.getId() +" - 1 + 1";
				}
			}
			
			for (Place  place : flushArcInPlaces) {
				content += ", " + place.getId() + " = 0";
			}
			
			for (Place pl : normalOutPlaces) {
				if (!normalInPlaces.contains(pl)) {
					content += ", "+ pl.getId() + " = " + pl.getId() +" + 1";
				}
			}
			
			List<Place> priorityOrderPlaces = new ArrayList<Place>();
			for (TimedInhibitorArc pr : allInTimedInhibitorArcs) priorityOrderPlaces.add((Place)pr.getSource());
			for (Place pl : priorityOrderPlaces) {
				content += ", " + pl.getId() + " = " + pl.getId();
			}
		}
		
		content += ";}";
				
		return content;
		
	}
		
	
	/**
	 * Generate "Initially" part of cts file
	 * @param petriNet
	 * @return
	 */
	private static String generateInitially(PetriNet petriNet) {
		
		String content = "";
		content += "initially {\nint ";
		
		List<Place> allPlaces = petriNet.getPlaces();
		Place firstPlace = allPlaces.remove(0);
		content += firstPlace.getId()+ "=" +firstPlace.getInitCount();
		
		for (Place pl : allPlaces) {
			content += ", "+pl.getId()+"="+pl.getInitCount();
		}
		
		content += ";}";
		return content;
		
	}
	
	/**
	 * Write to text file
	 * @param filePath
	 * @param content
	 */
	private static void writeToFile(String content,String filePath) {
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			fw = new FileWriter(filePath);
			bw = new BufferedWriter(fw);
			bw.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	/**
	 * Check if the response of romeo-cli is true
	 * @param response
	 * @return
	 */
	private static boolean isTrue(String response) {
		String truePattern = ".*true$";
		if (response==null) return false;
		if (response.matches(truePattern)) return true;
		else return false;
	}
	
//	/**
//	 * Check if the response of romeo-cli is false
//	 * @param response
//	 * @return
//	 */
//	private static boolean isFalse(String response) {
//		String truePattern = ".*false$";
//		if (response==null) return false;
//		if (response.matches(truePattern)) return true;
//		else return false;
//	}
	
//	public static int getNumberOfReentrancy(System system,int observerNumber) {
//		Place checkedPlace = system.getObservers().get(observerNumber).getOwnedPlaces().get(0);
//		String tctlFormula = "check AG[0,inf]"+checkedPlace.getId()+"<="+maxNbReentrancyObservableNumber;
//		
//		
//	}
	
	/**
	 * check for true/false
	 * @param outputModelPath
	 * @return
	 */
	public static boolean check(String outputModelPath) {
		
		Runtime rt = Runtime.getRuntime();
		String[] commands = {"analysis/romeo-cli.exe",outputModelPath,"-m"};

		try {
			Process proc = rt.exec(commands);
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
//			BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
			String s = null;
			String response = "";
			while ((s=stdInput.readLine())!=null) {
				response += s;
			}
			
			if (isTrue(response)) return true;
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		return false;
	}
	
	/**
	 * check for response
	 * @param outputModelPath
	 * @return
	 */
	public static String checkForResponse(String outputModelPath) {
		Runtime rt = Runtime.getRuntime();
		String[] commands = {"analysis/romeo-cli.exe",outputModelPath,"-m"};

//		try {
//			Process proc = rt.exec(commands);
//			BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
////			BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
//			String s = null;
//			String response = "";
//			while ((s=stdInput.readLine())!=null) {
//				response += s;
//			}
//			
//			return response;
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}		
		return null;
	}
	

	
	/**
	 * Get response time from response string
	 * @param responseTimeString
	 * @return
	 */
	private static int getResponseTime(String responseTimeString) {
		
		java.lang.System.out.println(responseTimeString);
		
		String responseTime="";
		Matcher m = Pattern.compile("(.*)\\](.*), inf\\[").matcher(responseTimeString);
		
		while (m.find()) {
			responseTime = m.group(2);
		}
		
		return Integer.parseInt(responseTime);
		
	}
	
//	/**
//	 * save Petri net as a xmi file
//	 * @param filePath
//	 * @param petriNet
//	 */
//	private static void saveAsXmi(String filePath, PetriNet petriNet) {
//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//        Map<String, Object> m = reg.getExtensionToFactoryMap();
//        m.put("petrinet", new XMIResourceFactoryImpl());
//
//        // Obtain a new resource set
//        ResourceSet resSet = new ResourceSetImpl();
//
//        // create a resource
//        Resource resource = resSet.createResource(URI.createURI(filePath));
//        // Get the first model element and cast it to the right type, in my
//        // example everything is hierarchical included in this first node
//        resource.getContents().add(petriNet);
//
//        // now save the content.
//        try {
//            resource.save(Collections.EMPTY_MAP);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//	}
	
	/**
	 * create a directory
	 * @param path
	 * @return
	 */
	private static boolean createFolder(String path) {
		
		File dir = new File(path);
		
		if (!dir.exists()) {
			try {
				dir.mkdir();
			} catch (SecurityException e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}
	
	
	/**
	 * Run Analysis by romeo-cli
	 * @param inputFilePath
	 * @return
	 */
//	public static boolean runAnalysis() {
//		
//		createFolder("tysco_out");
//		
//		String outputModelPath = "tysco_out/generatedRomeo.cts";
//		return runAnalysis(outputModelPath);
//	}
	
	
	/**
	 * Run Analysis by romeo-cli
	 * @param inputFilePath
	 * @param outputFilePath
	 * @return
	 */
	public static boolean runAnalysis(String outputFilePath) {

		DesignModel design = CurrentAnalysisContext.getInstance().getDesignModel();
		System system = Time4Sys2PetriNet.transform(design);
		
		System clonedSystem = system.clone();
		NbReentrancyObserver.generateNumberReentrancyObserver(clonedSystem);
		PetriNet petriNet = clonedSystem.convertToPetriNet();
		String content = generateRomeoCTS(petriNet,outputFilePath);
		int nbBoundObservers = clonedSystem.getObservers().size();
		
		for (int i=0;i<nbBoundObservers;i++) {
			Place checkedPlace = clonedSystem.getObservers().get(i).getCheckPlaces().get(0);
			
			//get nb reentrancies
			int nbTokenMax = 1;
			for (nbTokenMax = 1; nbTokenMax<=maxNbToken;nbTokenMax++) {
				
				String tctlFormula = "check AG[0,inf]"+checkedPlace.getId()+"<="+nbTokenMax;
				String addedContent = content + "\n"+tctlFormula;
				writeToFile(addedContent,outputFilePath);
				
				//java.lang.System.out.println(nbTokenMax);
				
				if (check(outputFilePath)) break;	
			}
						
			// Create response time observer in function of nb reentrancies
			System clonedSystem2 = system.clone();
			Observer observer = ResponseTimeObserver.generateResponseTimeObserver(clonedSystem2, i, nbTokenMax);
			
			//petriNet = clonedSystem2.convertToPetriNet();
			//RomeoXmlSerialization.romeoXmlSerialization(petriNet, "model/minepump6.xml");
			
			String tctlFormula = "";
			
			if (nbTokenMax==1) {
				checkedPlace = observer.getCheckPlaces().get(0);
				tctlFormula = "check AG[0,inf]"+checkedPlace.getId() + "<1";
			
			} else if (nbTokenMax==2) {
				
				Place checkPlace1 = observer.getCheckPlaces().get(0);
				Place checkPlace2 = observer.getCheckPlaces().get(1);
				tctlFormula = "check AG[0,inf]"+checkPlace1.getId()+"<1"+" and "
											   +checkPlace2.getId()+"<1";
			} else {
				java.lang.System.out.println("nbTokenMax: "+nbTokenMax);
			}
			
			//java.lang.System.out.println("nbmax :"+nbTokenMax);
			
			String newContent = generateRomeoCTS(clonedSystem2.convertToPetriNet(),outputFilePath);
			
			String addedContent = newContent+"\n"+tctlFormula;
			//java.lang.System.out.println(addedContent);
			writeToFile(addedContent,outputFilePath);
			
//			String response = checkForResponse(outputFilePath);
//			java.lang.System.out.println("response time: "+getResponseTime(response)+"\n\n");
			
		}
		return true;
	}
	
	@Override
	public void transform(TestImplementation test) {
		// TODO Auto-generated method stub
		IProject currentProject = WorkspaceUtils.getProject();
		IFolder folder = WorkspaceUtils.createFolder(currentProject, AnalysisRepositoryControler.getFolder(test.getTestedFile()));
		String outputFolderPath = folder.getLocation().toOSString()+File.separator+AnalysisRepositoryControler.getFileName(test.getTestedFile());
		runAnalysis(outputFolderPath);
	}
}
