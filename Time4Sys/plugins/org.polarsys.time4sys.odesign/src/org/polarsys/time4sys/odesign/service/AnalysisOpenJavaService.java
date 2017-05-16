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

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.analysis.AnalyzedSystem;
import org.polarsys.time4sys.analysis.ComputingResource;
import org.polarsys.time4sys.analysis.ConstraintContainer;
import org.polarsys.time4sys.analysis.Delay;
import org.polarsys.time4sys.analysis.EventModel;
import org.polarsys.time4sys.analysis.Fragment;
import org.polarsys.time4sys.analysis.InputPort;
import org.polarsys.time4sys.analysis.InputStimulus;
import org.polarsys.time4sys.analysis.OutputPort;
import org.polarsys.time4sys.analysis.Port;
import org.polarsys.time4sys.analysis.PortContainer;
import org.polarsys.time4sys.analysis.ResourceSchedulingParameterValue;
import org.polarsys.time4sys.analysis.SchedulerParameterValue;
import org.polarsys.time4sys.analysis.Task;
//import org.polarsys.time4sys.datatypes.model.datatypes.DatatypesFactory;
//import org.polarsys.time4sys.datatypes.model.datatypes.NFP_Duration;
//import org.polarsys.time4sys.datatypes.model.datatypes.NFP_TimeInterval;
import org.polarsys.time4sys.constraints.model.constraints.LatencyConstraint;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;

@SuppressWarnings("restriction")
public class AnalysisOpenJavaService {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AnalysisOpenJavaService() {
		// TODO Auto-generated method stub
	}

	public TimeInterval getIntervalCET(EObject context) {
		TimeInterval interval = NfpFactory.eINSTANCE.createTimeInterval();
		if (context instanceof Task) {
			Task task = (Task) context;
			for (Fragment fragment : task.getFragments()) {
				interval.setMin(
						NfpFactory.eINSTANCE.createDuration().add(interval.getMin()).add(fragment.getCET().getMin()));
				interval.setMax(
						NfpFactory.eINSTANCE.createDuration().add(interval.getMin()).add(fragment.getCET().getMax()));
			}
		} else if (context instanceof Fragment) {
			Fragment fragment = (Fragment) context;
			interval.setMin(fragment.getCET().getMin());
			interval.setMax(fragment.getCET().getMax());
		} else {
			return null;
		}
		return interval;
	}

	public TimeInterval getIntervalCET(EObject context, List<EObject> views_p) {
		TimeInterval interval = NfpFactory.eINSTANCE.createTimeInterval();
		for (EObject aSelectedElement : views_p) {
			if (aSelectedElement instanceof AnalyzedSystem) {
				if (context instanceof Task) {
					Task task = (Task) context;
					for (Fragment fragment : task.getFragments()) {
						interval.setMin(NfpFactory.eINSTANCE.createDuration().add(interval.getMin())
								.add(fragment.getCET().getMin()));
						interval.setMax(NfpFactory.eINSTANCE.createDuration().add(interval.getMax())
								.add(fragment.getCET().getMax()));
					}
				} else if (context instanceof Fragment) {
					Fragment fragment = (Fragment) context;
					interval.setMin(fragment.getCET().getMin());
					interval.setMax(fragment.getCET().getMax());
				} else {
					return null;
				}
			}
		}

		return interval;
	}

	public InputStimulus findInputStimulus(EObject context) {
		if (context instanceof Task) {
			for (Port port : ((Task) context).getPorts()) {
				if (port instanceof InputPort) {
					return findFirstInputStimulus((InputPort) port);
				}
			}
		}
		return null;
	}

	private InputStimulus findFirstInputStimulus(InputPort inputPort) {
		OutputPort outputPort = inputPort.getReceiveFrom();
		PortContainer container = outputPort.getParent();

		if (container instanceof InputStimulus) {
			return (InputStimulus) container;
		} else if (container instanceof Task) {
			for (Port port : ((Task) container).getPorts()) {
				if (port instanceof InputPort) {
					return findFirstInputStimulus((InputPort) port);
				}
			}
		} else if (container instanceof Delay) {
			for (Port port : ((Delay) container).getPorts()) {
				if (port instanceof InputPort) {
					return findFirstInputStimulus((InputPort) port);
				}
			}
		} else if (outputPort.eContainer() instanceof InputStimulus) {
			return (InputStimulus) outputPort.eContainer();
		}

		return null;
	}

	public EventModel findEventModel(EObject context_p) {
		if (context_p instanceof Task) {
			for (Port port : ((Task) context_p).getPorts()) {
				if (port instanceof InputPort) {
					return findFirstEventModel((InputPort) port);
				}
			}
		}
		return null;
	}

	private EventModel findFirstEventModel(InputPort inputPort) {
		if (inputPort.getEventModel() != null) {
			return inputPort.getEventModel();
		} else {
			OutputPort outputPort = inputPort.getReceiveFrom();
			if (outputPort.getEventModel() != null) {
				return outputPort.getEventModel();
			} else {
				PortContainer container = outputPort.getParent();
				if (container instanceof Task) {
					for (Port port : ((Task) container).getPorts()) {
						if (port instanceof InputPort) {
							return findFirstEventModel((InputPort) port);
						}
					}
				} else if (container instanceof Delay) {
					for (Port port : ((Delay) container).getPorts()) {
						if (port instanceof InputPort) {
							return findFirstEventModel((InputPort) port);
						}
					}
				} else if (outputPort.eContainer() instanceof InputStimulus) {
					return ((InputStimulus) outputPort.eContainer()).getEventModel();
				}
			}
		}
		return null;
	}

	public List<Task> getTasksOrderedByPriority(EObject context_p) {
		List<Task> sortedTasks = new BasicEList<Task>();
		if (context_p instanceof ComputingResource) {
			ComputingResource cr = (ComputingResource) context_p;
			for (Task task : cr.getTasksAffectedOn()) {
				int insertionIndex = 0;
				// WARNING First SchedulingParameter value considered as
				// priority
				if ((task.getSchedulingParameters() != null) && (task.getSchedulingParameters().size() != 0)) {
					int priority = Integer.parseInt(task.getSchedulingParameters().get(0).getValue());
					for (Task sortedTask : sortedTasks) {
						int sortedTaskPriority = Integer
								.parseInt(sortedTask.getSchedulingParameters().get(0).getValue());
						if (sortedTaskPriority < priority) {
							insertionIndex++;
						} else {
							break;
						}
					}
					sortedTasks.add(insertionIndex, task);
				}
			}
		}
		return sortedTasks;
	}

	// //TODO: Reintroduce Result class
	// // public Result getCorrespondingResult(EObject context_p, String
	// sourceName){
	// // if(context_p instanceof Task){
	// // Task task = (Task)context_p;
	// //
	// // for(ResultContainer rc: task.getParent().getResultContainers()){
	// // if(rc instanceof ResultSet){
	// // ResultSet resultSet = (ResultSet)rc;
	// // if(resultSet.getSourceName().equals(sourceName)){
	// // for(Result result: resultSet.getResults()){
	// // if(result.getRefersTo().equals(task)){
	// // return result;
	// // }
	// // }
	// // }
	// // }
	// // }
	// // }
	// // return null;
	// // }
	//
	public String getTaskTooltip(EObject context) {
		String tooltip = "";
		if (context instanceof Task) {
			Task task = (Task) context;
			for (SchedulerParameterValue param : task.getSchedulingParameters()) {
				tooltip += param.getType().getName() + ": ";
				tooltip += param.getValue() + "\n";
			}
		}
		if (tooltip.endsWith("\n")) {
			tooltip = tooltip.substring(0, tooltip.length() - 1);
		}
		return tooltip;
	}

	public String getComputingResourceToolTip(EObject context) {
		String tooltip = "";
		if (context instanceof ComputingResource) {
			ComputingResource cr = (ComputingResource) context;
			tooltip += "Scheduler: " + cr.getScheduler().getPolicyKind() + "\n";
			for (ResourceSchedulingParameterValue schedParam : cr.getScheduler().getResourceParameterValue()) {
				tooltip += schedParam.getName() + " :" + schedParam.getValue() + "\n";
			}
		}
		if (tooltip.endsWith("\n")) {
			tooltip = tooltip.substring(0, tooltip.length() - 1);
		}
		return tooltip;
	}

	public boolean hasPolling(EObject context) {
		if (context instanceof Task) {
			Task t = (Task) context;
			for (SchedulerParameterValue p : t.getSchedulingParameters()) {
				if ((p.getType() != null) && p.getType().getName().contains("Polling")) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean hasDeadline(EObject context) {
		if (context instanceof Task) {
			Task t = (Task) context;
			AnalyzedSystem system = t.getParent();
			if (system.getConstraintContainer() instanceof ConstraintContainer) {
				ConstraintContainer constraintContainer = (ConstraintContainer) system.getConstraintContainer();
				for (EObject constraints : constraintContainer.getConstraints()) {
					if (constraints instanceof LatencyConstraint) {
						LatencyConstraint lc = (LatencyConstraint) constraints;
						if (t.equals(lc.getFrom()) || t.equals(lc.getTo())) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public String getSystemUnit(EObject context_p) {
		if (context_p.eContainer() instanceof AnalyzedSystem) {
			return ((AnalyzedSystem) context_p.eContainer()).getTimeUnit();
		} else if (context_p.eContainer() != null && context_p.eContainer().eContainer() instanceof AnalyzedSystem) {
			return ((AnalyzedSystem) context_p.eContainer().eContainer()).getTimeUnit();
		}
		return "";
	}
}
