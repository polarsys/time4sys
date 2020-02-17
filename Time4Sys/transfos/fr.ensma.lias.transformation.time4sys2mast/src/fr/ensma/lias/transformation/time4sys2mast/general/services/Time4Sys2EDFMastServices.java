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

import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;

import fr.ensma.lias.transformation.time4sys2mast.general.Time4Sys2EDFMastGenerator;

public class Time4Sys2EDFMastServices {

	public static String generateInternalEvents(BehaviorScenario behaviorScenario, DesignModel design) {
		String internalEvents = "";
		String type = "Regular";
		String timingRequirementType = "Hard_Global_Deadline";
		int eventId = 1;

		// The first internal event
		String triggerEvent = "ext_trigger_" + behaviorScenario.getName().replaceAll(" ", "").trim();
		String name = generateInternalEventName(behaviorScenario, eventId++);
		internalEvents += "(\n";
		internalEvents += "\tType				=> " + type + ",\n";
		internalEvents += "\tName				=> " + name;
		if (getETEF(behaviorScenario, design) != null) {
			internalEvents += ",\n";
			internalEvents += "\tTiming_Requirements		=> " + "\n";
			internalEvents += "\t\t(Type				=> " + timingRequirementType + ",\n";
			String addDeadline= getDeadlineAsString(behaviorScenario, design);
			internalEvents += "\t\t Deadline			=> "+getDeadlineAsString(behaviorScenario, design)+
					 ",\n";
			internalEvents += "\t\t Referenced_Event		=> " + triggerEvent + "))";
		} else {
			internalEvents += ")";
		}

		// Generate other internal events
		Step nextStep = null;
		while (true) {
			nextStep = getSuccStep(behaviorScenario);

			// Stop condition
			if (nextStep == null)
				break;

			// Update parameters
			name = generateInternalEventName(behaviorScenario, eventId++);
			behaviorScenario = nextStep;

			// Generate event
			internalEvents += ",\n";
			internalEvents += "(\n";
			internalEvents += "\tType				=> " + type + ",\n";
			internalEvents += "\tName				=> " + name;
			if (getETEF(behaviorScenario, design) != null) {
				internalEvents += ",\n";
				internalEvents += "\tTiming_Requirements		=> " + "\n";
				internalEvents += "\t\t(Type				=> " + timingRequirementType + ",\n";
				internalEvents += "\t\t Deadline			=> "
						+ getDeadlineAsString(behaviorScenario, design)
						+ ",\n";
				internalEvents += "\t\t Referenced_Event		=> " + triggerEvent + "))";
			} else {
				internalEvents += ")";
			}
		}
		return internalEvents;
	}

	public static String getDeadlineAsString(BehaviorScenario behaviorScenario, DesignModel design) {
		return getNestedValue(String.valueOf(getETEF(behaviorScenario, design).getEndToEndDeadline().getValue()));
	}

	/**
	 * Generate event handlers
	 * 
	 * @param workloadEvent
	 * @param behaviorScenario
	 * @return
	 */
	public static String generateEventHandlers(List<WorkloadEvent> wes, BehaviorScenario behaviorScenario) {
		String eventHandlers = "";
		String type = "Activity";
		String inputEvent = "";
		String outputEvent = "";
		String activityOperation = "";
		String activityServer = "";
		int eventId = 1;

		Step currentStep = (Step) behaviorScenario;
		String triggerEvent = Time4Sys2EDFMastGenerator.getName(currentStep, "ext_trigger_");
		activityOperation = Time4Sys2EDFMastGenerator.getName(currentStep, "Operation_");
		activityServer = Time4Sys2EDFMastGenerator.getName(currentStep, "Server_");
		outputEvent = generateInternalEventName(currentStep, eventId++);

		// Generate the first event handler
		eventHandlers += "(\n";
		eventHandlers += "\tType				=> " + type + ",\n";
		eventHandlers += "\tInput_Event			=> " + triggerEvent + ",\n";
		eventHandlers += "\tOutput_Event			=> " + outputEvent + ",\n";
		eventHandlers += "\tActivity_Operation	=> " + activityOperation + ",\n";
		eventHandlers += "\tActivity_Server		=> " + activityServer + ")";

		// Generate other event handlers
		Step nextStep = null;
		while (true) {
			nextStep = getSuccStep(currentStep);

			// Stop condition
			if (nextStep == null)
				break;

			// Update parameters
			inputEvent = outputEvent;
			outputEvent = generateInternalEventName(currentStep, eventId++);
			currentStep = nextStep;
			activityOperation = Time4Sys2EDFMastGenerator.getName(currentStep, "Operation_");
			activityServer = Time4Sys2EDFMastGenerator.getName(currentStep.getConcurRes(), "Server_");

			// Generate event handler
			eventHandlers += ",\n";
			eventHandlers += "(\n";
			eventHandlers += "\tType				=> " + type + ",\n";
			eventHandlers += "\tInput_Event			=> " + inputEvent + ",\n";
			eventHandlers += "\tOutput_Event			=> " + outputEvent + ",\n";
			eventHandlers += "\tActivity_Operation	=> " + activityOperation + ",\n";
			eventHandlers += "\tActivity_Server		=> " + activityServer + ")";
		}

		return eventHandlers;
	}

	/**
	 * Get successor of current step in the workflow
	 * 
	 * @param currentStep
	 * @return
	 */
	private static Step getSuccStep(BehaviorScenario currentStep) {
		if (currentStep instanceof Step && ((Step) currentStep).getOutputRel() == null)
			return null;
		List<Step> succs = ((Step) currentStep).getOutputRel().getSucces();
		if (succs.isEmpty())
			return null;
		else
			return succs.get(0);
	}

	/**
	 * Get deadline as scheduling parameter of concurrence resource
	 * 
	 * @param currentStep
	 * @return
	 */
	private static EndToEndFlow getETEF(BehaviorScenario currentStep, DesignModel design) {
		for (EndToEndFlow etef : design.getEndToEndFlows()) {
			if (etef.getEndToEndScenario() != null && etef.getEndToEndStimuli() != null
					&& etef.getEndToEndScenario().equals(currentStep)) {
				return etef;
			}
		}
		return null;
	}

	/**
	 * Generate internal event root name
	 * 
	 * @param workloadEvent
	 * @return
	 */
	private static String generateInternalEventName(BehaviorScenario step, int id) {
		return Time4Sys2EDFMastGenerator.getName(step, "internal_" + id);
	}

	public static double getNestedValue(Duration duration, TimeUnitKind unit) {
		if (duration == null) {
			return 0;
		} else {
			return duration.convertToUnit(unit).getValue();
		}
	}

	public static String getNestedValue(String s) {
		if (s == null)
			return null;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLetter(c)) {
				int index = s.indexOf(c);
				return s.substring(0, index);
			}
		}
		return s;
	}
}
