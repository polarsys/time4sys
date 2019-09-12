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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;

import fr.ensma.lias.transformation.time4sys2mast.general.Time4Sys2MastGenerator;

public class Time4Sys2MastServices {

	public static String generateInternalEvents(List<Step> steps, HashMap<Step, List<String>> outputStepMap,
			DesignModel design) {
		String internalEvents = "";
		String type = "Regular";
		String timingRequirementType = "Hard_Global_Deadline";
		int i = 0;
		for (Entry<Step, List<String>> entry : outputStepMap.entrySet()) {
			Step key = entry.getKey();
			for (String internalEventName : outputStepMap.get(key)) {
				// The first internal event
				// String name = generateInternalEventName(bs, i);
				if (i>0){
					internalEvents += "),\n";
				}
				i++;
				internalEvents += "\t(Type				=> " + type + ",\n";
				internalEvents += "\tName				=> " + internalEventName;
				if (key.getName() != null) {

					EndToEndFlow etef = getETEF(key, design);
					if (etef != null) {
						String triggerEvent = "ext_trigger_" + etef.getEndToEndStimuli().get(0).getEffect().getName().replaceAll(" ", "").trim();
						internalEvents += ",\n";
						internalEvents += "\tTiming_Requirements		=> " + "\n";
						internalEvents += "\t\t(Type				=> " + timingRequirementType + ",\n";
						internalEvents += "\t\t Deadline			=> " + getDeadlineAsString(key, design) + ",\n";
						internalEvents += "\t\t Referenced_Event		=> " + triggerEvent + ")";
					}
				}
			}
//			if (i < outputStepMap.entrySet().size()) {
//				internalEvents += "),\n";
//			}

			// Generate other internal events
			// Step nextStep = null;
			// while (true) {
			// nextStep = getSuccStep(step);
			//
			// // Stop condition
			// if (nextStep == null)
			// break;
			//
			// // Update parameters
			// name = generateInternalEventName(step, i++);
			// step = nextStep;
			//
			// // Generate event
			// internalEvents += ",\n";
			// internalEvents += "\t(Type => " + type + ",\n";
			// internalEvents += "\tName => " + name;
			// if (getETEF(step, design) != null) {
			// internalEvents += ",\n";
			// internalEvents += "\tTiming_Requirements => " + "\n";
			// internalEvents += "\t\t(Type => " + timingRequirementType +
			// ",\n";
			// internalEvents += "\t\t Deadline => " +
			// getDeadlineAsString(step, design) + ",\n";
			// internalEvents += "\t\t Referenced_Event => " + triggerEvent
			// + "))";
			// } else {
			// internalEvents += ")\n";
			// }
			// }
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
	public static String generateEventHandlers(List<Step> steps, HashMap<Step, String> typeStepMap,
			HashMap<Step, List<String>> inputStepMap, HashMap<Step, List<String>> oututStepMap) {
		String eventHandlers = "";
		String activityOperation = "";
		String activityServer = "";
		int i = 0;

		for (Map.Entry<Step, String> entry : typeStepMap.entrySet()) {
			Step currentStep = entry.getKey();
			i++;
			List<String> inputEventName = inputStepMap.get(currentStep);
			List<String> outputEventName = oututStepMap.get(currentStep);
			// if (currentStep.getCause().size() > 0) {
			// triggerEvent = Time4Sys2MastGenerator.getName(currentStep,
			// "ext_trigger_");
			// inputEventName.add(triggerEvent);
			// }
			// String type = getType(inputEventName, outputEventName);
			// outputEvent = generateInternalEventName(currentStep, eventId++);

			// Generate the first event handler
			eventHandlers += "\t(Type				=> " + typeStepMap.get(currentStep) + ",\n";
			// Barrier
			if (typeStepMap.get(currentStep).equals("Barrier")) {
				eventHandlers += "\tInput_Events_List			=> (";
				int j = 0;
				for (String itInputName : inputEventName) {
					j++;
					eventHandlers += itInputName;
					if (j < inputEventName.size()) {
						eventHandlers += ",";
					} else {
						eventHandlers += "),\n";
					}
				}
				eventHandlers += "\tOutput_Event		=> " + outputEventName.get(0);
			}
			// Multicast
			if (typeStepMap.get(currentStep).equals("Multicast")) {
				int j = 0;
				eventHandlers += "\tOutput_Events_List			=> (";
				for (String itOutputName : outputEventName) {
					j++;
					eventHandlers += itOutputName;
					if (j < outputEventName.size()) {
						eventHandlers += ",";
					} else {
						eventHandlers += "),\n";
					}
				}
				eventHandlers += "\tInput_Event		=> " + inputEventName.get(0);
			}
			// Activity
			if (typeStepMap.get(currentStep).equals("Activity")) {
				eventHandlers += "\tInput_Event		=> " + inputEventName.get(0) + ",\n";
				if (outputEventName.size() == 1) {
					eventHandlers += "\tOutput_Event		=> " + outputEventName.get(0) + ",\n";
				}
				activityOperation = Time4Sys2MastGenerator.getName(currentStep, "operation_");
				activityServer = Time4Sys2MastGenerator.getName(currentStep.getConcurRes(), "server_");
				eventHandlers += "\tActivity_Operation	=> " + activityOperation + ",\n";
				eventHandlers += "\tActivity_Server		=> " + activityServer + ")";
			} else {
				eventHandlers += ")";
			}
			if (i < typeStepMap.entrySet().size()) {
				eventHandlers += ",\n";
			}

			// Generate other event handlers
			// Step nextStep = null;
			// while (true) {
			// nextStep = getSuccStep(currentStep);
			//
			// // Stop condition
			// if (nextStep == null)
			// break;
			//
			// // Update parameters
			// inputEvent = outputEvent;
			// outputEvent = generateInternalEventName(currentStep, eventId++);
			// currentStep = nextStep;
			// activityOperation = Time4Sys2MastGenerator.getName(currentStep,
			// "operation_");
			// activityServer =
			// Time4Sys2MastGenerator.getName(currentStep.getConcurRes(),
			// "server_");
			//
			// // Generate event handler
			// eventHandlers += ",\n";
			// eventHandlers += "(\n";
			// eventHandlers += "\tType => " + type + ",\n";
			// eventHandlers += "\tInput_Event => " + inputEvent + ",\n";
			// eventHandlers += "\tOutput_Event => " + outputEvent + ",\n";
			// eventHandlers += "\tActivity_Operation => " + activityOperation +
			// ",\n";
			// eventHandlers += "\tActivity_Server => " + activityServer + ")";
			// }
		}

		return eventHandlers;
	}

	// calculer directement dans la Map
//	private static String getType(List<String> inputName, List<String> outputName) {
//		// TODO Auto-generated method stub
//		if (inputName.size() > 1) {
//			return "Barrier";
//		}
//		if (outputName.size() > 1) {
//			return "Multicast";
//		}
//		return "Activity";
//	}

//	/**
//	 * Get successor of current step in the workflow
//	 * 
//	 * @param currentStep
//	 * @return
//	 */
//	private static Step getSuccStep(BehaviorScenario currentStep) {
//		if (currentStep instanceof Step && ((Step) currentStep).getOutputRel() == null)
//			return null;
//		List<Step> succs = ((Step) currentStep).getOutputRel().getSucces();
//		if (succs.isEmpty())
//			return null;
//		else
//			return succs.get(0);
//	}

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
//	private static String generateInternalEventName(BehaviorScenario step, int id) {
//		return Time4Sys2MastGenerator.getName(step, "internal_" + id);
//	}

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
