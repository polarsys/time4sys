/*******************************************************************************
 * Copyright (c) 2018 LIAS Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     LIAS - initial API and implementation
 *******************************************************************************/
package fr.ensma.lias.transformation.time4sys2mast.general.services;

import java.util.List;

import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.nfp.Duration;

public class Time4Sys2MastServices {
	
	private static int transactionId = 1;
	
	public String generateInternalEvents(WorkloadEvent workloadEvent,BehaviorScenario behaviorScenario)  {
		String internalEvents = "";
		String type = "Regular";
		String timingRequirementType = "Hard_Global_Deadline";
		int eventId=1;
		
		// The first internal event 
		Step currentStep = (Step) workloadEvent.getEffect();
		String triggerEvent = "ext_trigger";
		String name = generateInternalEventName(workloadEvent,eventId++);
		internalEvents += "(\n";
		internalEvents += "\tType				=> " + type + ",\n";
		internalEvents += "\tName				=> " + name ;
		if (getDeadline(currentStep)!=null) {
			internalEvents += ",\n";
			internalEvents += "\tTiming_Requirements		=> " + "\n";
			internalEvents += "\t\t(Type				=> " +timingRequirementType+ ",\n";
			internalEvents += "\t\t Deadline			=> " +getNestedValue(getDeadline(currentStep))+ ",\n";
			internalEvents += "\t\t Referenced_Event		=> " +triggerEvent+"))";
		} else {
			internalEvents += ")";
		}

		// Generate other internal events
		Step nextStep = null;
		while (true) {
			nextStep = getSuccStep(currentStep);
			
			// Stop condition
			if (nextStep==null) break;
			
			// Update parameters 
			name = generateInternalEventName(workloadEvent, eventId++);
			currentStep = nextStep;
			
			// Generate event
			internalEvents += ",\n";
			internalEvents += "(\n";
			internalEvents += "\tType				=> " + type + ",\n";
			internalEvents += "\tName				=> " + name;
			if (getDeadline(currentStep)!=null) {
				internalEvents += ",\n";
				internalEvents += "\tTiming_Requirements		=> " + "\n";
				internalEvents += "\t\t(Type				=> " +timingRequirementType+ ",\n";
				internalEvents += "\t\t Deadline			=> " +getNestedValue(getDeadline(currentStep))+ ",\n";
				internalEvents += "\t\t Referenced_Event		=> " +triggerEvent+"))";
			} else {
				internalEvents += ")";
			}
		}
		return internalEvents;
	}
	
	/**
	 * Generate event handlers
	 * @param workloadEvent
	 * @param behaviorScenario
	 * @return
	 */
	public String generateEventHandlers(WorkloadEvent workloadEvent,BehaviorScenario behaviorScenario)  {
		String eventHandlers = "";
		String type = "Activity";
		String inputEvent = "";
		String outputEvent = "";
		String activityOperation = "";
		String activityServer = "";
		int eventId=1;
		
		Step currentStep = (Step) workloadEvent.getEffect();
		String triggerEvent = "ext_trigger";
		activityOperation = "Operation_"+currentStep.getName().trim();
		activityServer = "Server_"+currentStep.getConcurRes().getName().trim();
		outputEvent = generateInternalEventName(workloadEvent, eventId++);
		
		// Generate the first event handler		  
		eventHandlers += "(\n";
		eventHandlers += "\tType				=> " + type +",\n";		
		eventHandlers += "\tInput_Event			=> " + triggerEvent+",\n";
		eventHandlers += "\tOutput_Event			=> " + outputEvent+",\n";
		eventHandlers += "\tActivity_Operation	=> " + activityOperation+",\n";
		eventHandlers += "\tActivity_Server		=> " + activityServer+")";
					
		// Generate other event handlers
		Step nextStep = null;
		while (true) {
			nextStep = getSuccStep(currentStep);
			
			// Stop condition
			if (nextStep==null) break;
			
			// Update parameters
			inputEvent = outputEvent;
			outputEvent = generateInternalEventName(workloadEvent, eventId++);
			currentStep = nextStep;
			activityOperation =  "Operation_"+currentStep.getName().trim();
			activityServer = "Server_"+currentStep.getConcurRes().getName().trim();
			
			// Generate event handler
			eventHandlers += ",\n";
			eventHandlers += "(\n";
			eventHandlers += "\tType				=> " + type +",\n";		
			eventHandlers += "\tInput_Event			=> " + inputEvent+",\n";
			eventHandlers += "\tOutput_Event			=> " + outputEvent+",\n";
			eventHandlers += "\tActivity_Operation	=> " + activityOperation+",\n";
			eventHandlers += "\tActivity_Server		=> " + activityServer+")";
		}
		
		return eventHandlers;
	}
	
	/**
	 * Get successor of current step in the workflow
	 * @param currentStep
	 * @return
	 */
	private Step getSuccStep(Step currentStep)  {
		if (currentStep.getOutputRel()==null) return null;
		List<Step> succs = currentStep.getOutputRel().getSucces();
		if (succs.isEmpty()) return null;
		else return succs.get(0);
	}
	
	/**
	 * Get deadline as scheduling parameter of concurrence resource
	 * @param currentStep
	 * @return
	 */
	private String getDeadline(Step currentStep) {
		List<SchedulingParameter> allParams = currentStep.getConcurRes().getSchedParams();
		
		for (SchedulingParameter param : allParams) {
			if (param.getName().toLowerCase().compareTo("deadline")==0) return param.getValue();
		}
		
		return null;
	}
	
	/**
	 * Generate internal event root name
	 * @param workloadEvent
	 * @return
	 */
	private String generateInternalEventName(WorkloadEvent workloadEvent,int id) {
		String internalEventName = "internal";
		if (workloadEvent.getName()!=null) internalEventName+="_"+workloadEvent.getName().replaceAll(" ","").trim();
		internalEventName+="_"+id;
		return internalEventName;
	}

	
	/**
	 * generate transaction name
	 * @return
	 */
	public String generateTransactionName(WorkloadEvent workloadEvent) {
		return "Transaction_"+transactionId++;
	}
	
	
	public String getNestedValue(Duration duration) {
		return ""+duration.getValue();
	}
	
	public String getNestedValue(String s) {
		if (s==null) return null;
		for (int i = 0; i < s.length(); i++){
		    char c = s.charAt(i);   
		    if (Character.isLetter(c)) {
		    	int index = s.indexOf(c);
		    	return s.substring(0, index);
		    }
		}
		return s;
	}
}
