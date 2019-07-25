/*******************************************************************************
 * Copyright (c) 2018 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier - initial API and implementation
 *******************************************************************************/
package fr.ensma.lias.transformation.time4sys2mast.general;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.common.CurrentAnalysisContext;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.AnalysisRepositoryControler;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.utils.WorkspaceUtils;
import org.polarsys.time4sys.marte.analysisrepository.tysco.util.AbstractExogenousTransformation;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.BurstPattern;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.SporadicPattern;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadBehavior;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.grm.MutualExclusionProtocol;
import org.polarsys.time4sys.marte.grm.ProtectProtocolKind;
import org.polarsys.time4sys.marte.grm.SchedPolicyKind;
import org.polarsys.time4sys.marte.grm.Scheduler;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.hrm.HardwareComputingResource;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;
import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;
import org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;

import fr.ensma.lias.transformation.time4sys2mast.general.services.Time4Sys2MastServices;

/**
 * Entry point of the 'Time4sys2mast' generation module.
 *
 * @generated
 */
@Component
public class Time4Sys2MastGenerator implements AbstractExogenousTransformation {

	DesignModel design;
	static TimeUnitKind minUnit;

	public void transform(TestImplementation testImpl) {
		// if (args.length < 1) {
		// System.out.println("Arguments not valid : {folder}.");
		// } else {
		IProject currentProject = WorkspaceUtils.getProject();
		IFolder folder = WorkspaceUtils.createFolder(currentProject,
				AnalysisRepositoryControler.getFolder(testImpl.getTestedFile()));
		String outputFolderPath = folder.getLocation().toOSString() + File.separator
				+ AnalysisRepositoryControler.getFileName(testImpl.getTestedFile());
		File file = new File(outputFolderPath);
		// System.out.println("output folder path: "+outputFolderPath);

		// String outputModelPath = outputFolderPath+ "/transformed_model.txt";

		CurrentAnalysisContext context = CurrentAnalysisContext.getInstance();
		DesignModel model = context.getDesignModel();
		Time4Sys2MastGenerator generator = new Time4Sys2MastGenerator();
		generator.generate(model, file);

	}

	public void generate(DesignModel des, File targetFile) {
		try {
			design = des;
			minUnit = getMinDurationUnit(des);
			// String transfoName = design.getName();
			FileWriter mastWriter = createFileWriter(design, targetFile.getAbsolutePath());
			generateMastContent(mastWriter);
			mastWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private TimeUnitKind getMinDurationUnit(DesignModel des) {
		TreeIterator<EObject> it = des.eAllContents();
		minUnit = TimeUnitKind.D;
		while (it.hasNext()) {
			EObject obj = it.next();
			if (obj instanceof Step && ((Step) obj).getWorstCET() != null) {
				TimeUnitKind unit = ((Step) obj).getWorstCET().getUnit();
				if (unit.getValue() < minUnit.getValue()) {
					minUnit = unit;
				}
				;
			}
		}
		return minUnit;
	}

	private static FileWriter createFileWriter(DesignModel design, String transfoName) throws IOException {
		File file = new File(transfoName);
		FileWriter fr = new FileWriter(file);
		return fr;
	}

	public void generateMastContent(FileWriter mastWriter) {
		HardwareComputingResource HardwareComputingResource = getHardwareComputingResource(design);
		List<SoftwareSchedulableResource> softwareSchedulableResources = getSchedulableResources(design);
		List<SoftwareMutualExclusionResource> mutex = getMutexResources(design);
		List<Step> steps = getAllSteps(design);
		List<WorkloadEvent> workloadEvents = design.getWorkloadBehavior().getDemand();
		BehaviorScenario mainBS = design.getWorkloadBehavior().getBehavior().get(0);
		try {
			generateProcessingResource(mastWriter, HardwareComputingResource);
			generateScheduler(mastWriter, HardwareComputingResource);
			generateSchedulingServers(mastWriter, softwareSchedulableResources);
			generateSharedResources(mastWriter, mutex);
			generateOperations(mastWriter, steps, mutex);
			generateTransactions(mastWriter, workloadEvents);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void generateOperations(FileWriter mastWriter, List<Step> steps,
			List<SoftwareMutualExclusionResource> mutex) throws IOException {
		for (Step step : steps) {
			generateOperation(mastWriter, step, mutex);
		}
	}

	private void generateOperation(FileWriter mastWriter, Step step, List<SoftwareMutualExclusionResource> mutex)
			throws IOException {
		String type = "Simple";
		String name = "Operation_" + getNameOrNull(step).replaceAll(" ", "");
		String wcet = String.valueOf(Time4Sys2MastServices.getNestedValue(step.getWorstCET()));
		String bcet = String.valueOf(Time4Sys2MastServices.getNestedValue(step.getBestCET()));
		List<SoftwareMutualExclusionResource> associatedMutexResources = getAssociatedMutexResources(step, mutex);
		mastWriter.write("Operation (\n");
		mastWriter.write("	Type						=> " + type + ",\n");
		mastWriter.write("	Name						=> " + name + ",\n");
		mastWriter.write("	Worst_Case_Execution_Time	=> " + wcet + ",\n");
		mastWriter.write("	Best_Case_Execution_Time	=> " + bcet);
		if (!associatedMutexResources.isEmpty()) {
			mastWriter.write(",\n	Shared_Resources_To_Lock	=> (");
			generateSharedResourcesFromMutex(mastWriter, associatedMutexResources);
			mastWriter.write("),\n");
			mastWriter.write("	Shared_Resources_To_Unlock	=> (");
			generateSharedResourcesFromMutex(mastWriter, associatedMutexResources);
		}
		mastWriter.write("\n);\n");
	}

	public static String getNameOrNull(NamedElement step) {
		if (step.getName() == null) {
			return "";
		} else {
			return step.getName();
		}
	}

	private void generateSharedResourcesFromMutex(FileWriter mastWriter,
			List<SoftwareMutualExclusionResource> resources) throws IOException {
		int i = 1;
		for (SoftwareMutualExclusionResource mt : resources) {
			mastWriter.write(mt.getName());
			if (resources.size() == i) {
				i++;
				mastWriter.write(", ");
			}
		}
	}

	private List<SoftwareMutualExclusionResource> getAssociatedMutexResources(Step step,
			List<SoftwareMutualExclusionResource> mutex) {
		return mutex.stream().filter(out -> out.getAccessTokenElements().contains(step)).collect(Collectors.toList());
	}

	private double getNestedValue(Duration worstCET) {
		return Time4Sys2MastServices.getNestedValue(worstCET);
	}

	private void generateSharedResources(FileWriter mastWriter, List<SoftwareMutualExclusionResource> mutex)
			throws IOException {
		for (SoftwareMutualExclusionResource smer : mutex) {
			generateSharedResource(mastWriter, smer);
		}
	}

	private void generateSharedResource(FileWriter mastWriter, SoftwareMutualExclusionResource mt) throws IOException {
		mastWriter.write("Shared_Resource (\n");
		MutualExclusionProtocol gestionProtocol = mt.getProtocol();
		ProtectProtocolKind protocolKind = gestionProtocol.getProtocol();
		if (protocolKind == ProtectProtocolKind.PRIORITY_CEILING) {
			mastWriter.write("Type					=> Immediate_Ceiling_Resource,\n");
			mastWriter.write("Name					=> " + mt.getName().replaceAll(" ", "") + ",\n");
			mastWriter.write("Ceiling					=> 32767\n");
			mastWriter.write("Preassigned 			=> NO\n");
		} else if (protocolKind == ProtectProtocolKind.PRIORITY_INHERITANCE) {
			mastWriter.write("Type					=> Priority_Inheritance_Resource,\n");
			mastWriter.write("Name					=> " + mt.getName().replaceAll(" ", "") + "\n");
		} else if (protocolKind == ProtectProtocolKind.STACK_BASED) {
			mastWriter.write("Type					=> SRP_Resource,\n");
			mastWriter.write("Name					=> " + mt.getName().replaceAll(" ", "") + "\n");
		} else {
			mastWriter.write("Error: No corresponding protocol found\n");
			mastWriter.write(");\n");
		}
	}

	private void generateSchedulingServers(FileWriter mastWriter,
			List<SoftwareSchedulableResource> softwareSchedulableResources) throws IOException {
		for (SoftwareSchedulableResource swResource : softwareSchedulableResources) {
			generateSchedulingServer(mastWriter, swResource);
		}
	}

	private void generateSchedulingServer(FileWriter mastWriter, SoftwareSchedulableResource swResource)
			throws IOException {
		Scheduler scheduler = swResource.getHost();

		mastWriter.write("Scheduling_Server (\n");
		// if (scheduler.getPolicy().getPolicy() ==
		// SchedPolicyKind.FIXED_PRIORITY) {
		mastWriter.write("	Type					=> Regular,\n");
		// } else if (scheduler.getPolicy().getPolicy() ==
		// SchedPolicyKind.EARLIEST_DEADLINE_FIRST) {
		// mastWriter.write(" Type => EDF_Policy,\n");
		// }
		mastWriter.write("	Name					=> Server_" + swResource.getName().replaceAll(" ", "") + ",\n");
		mastWriter.write("	Server_Sched_Parameters	=>\n");
		mastWriter.write("		(	Type 				=> " + getSchedParamPolicy(scheduler) + ",\n");
		if (scheduler.getPolicy().getPolicy() == SchedPolicyKind.FIXED_PRIORITY) {
			mastWriter.write("			The_Priority		=> "
					+ getSoftwareResourcePriority(swResource).replaceAll(" ", "") + ",\n");
		}
		mastWriter.write("			Preassigned			=> No),\n");
		mastWriter.write("	Scheduler				=> " + getNameOrMain(scheduler).replaceAll(" ", "") + ");\n");
	}

	private String getSchedParamPolicy(Scheduler scheduler) {
		if (scheduler.getPolicy().getPolicy() == SchedPolicyKind.FIXED_PRIORITY) {
			return "Fixed_Priority_Policy";
		}
		if (scheduler.getPolicy().getPolicy() == SchedPolicyKind.EARLIEST_DEADLINE_FIRST) {
			return "EDF_Policy";
		}
		return null;
	}

	private String getSoftwareResourcePriority(SoftwareSchedulableResource swResource) {
		List<SchedulingParameter> params = swResource.getSchedParams().stream()
				.filter(out -> out.getName().toLowerCase() == "fixedpriority").collect(Collectors.toList());
		if (params.size() > 0) {
			return "Fixed_Priority_Policy";
		}
		return "1";
	}

	private String getSchedPolicy(SoftwareSchedulableResource swResource) {
		return getSchedPolicyType(swResource.getScheduler());
	}

	private void generateTransactions(FileWriter mastWriter, List<WorkloadEvent> workloadEvents) throws IOException {
		List<BehaviorScenario> steps = workloadEvents.stream().map(out -> out.getEffect()).collect(Collectors.toList());
		for (BehaviorScenario step : steps) {
			generateTransaction(mastWriter, step.getCause(), step);
		}
	}

	private void generateTransaction(FileWriter mastWriter, List<WorkloadEvent> wes, BehaviorScenario bs)
			throws IOException {
		String transactionType = "Regular";
		String transactionName = generateTransactionName(bs);
		mastWriter.write("Transaction (\n");
		mastWriter.write("	Type					=> " + transactionType + ",\n");
		mastWriter.write("	Name					=> " + transactionName.replaceAll(" ", "") + ",\n");
		generateExternalEvents(mastWriter, wes);
		mastWriter.write("	Internal_Events			=> (\n");
		mastWriter.write("			" + generateInternalEvents(mastWriter, wes, bs) + "\n");
		mastWriter.write("	),\n");
		mastWriter.write("	Event_Handlers			=> (\n");
		mastWriter.write("			" + generateEventHandlers(mastWriter, wes, bs) + "\n");
		mastWriter.write("	)\n");
		mastWriter.write(");\n");

	}

	public static String generateTransactionName(BehaviorScenario bs) {
		return bs.getName();
	}

	private String generateEventHandlers(FileWriter mastWriter, List<WorkloadEvent> wes, BehaviorScenario bs) {
		return Time4Sys2MastServices.generateEventHandlers(wes, bs);
	}

	private String generateInternalEvents(FileWriter mastWriter, List<WorkloadEvent> wes, BehaviorScenario bs) {
		return Time4Sys2MastServices.generateInternalEvents(bs, design);
	}

	private void generateExternalEvents(FileWriter mastWriter, List<WorkloadEvent> wes) throws IOException {
		mastWriter.write("	External_Events			=> (\n");
		int i = 1;
		for (WorkloadEvent we : wes) {
			mastWriter.write("\t(");
			if (we.getPattern() instanceof PeriodicPattern) {
				PeriodicPattern periodicEvent = (PeriodicPattern) we.getPattern();
				String period = periodicEvent.getPeriod() != null
						? String.valueOf(getNestedValue(periodicEvent.getPeriod())) : "0.0";
				String jitter = periodicEvent.getJitter() != null
						? String.valueOf(getNestedValue(periodicEvent.getJitter())) : "0.0";
				String phase = periodicEvent.getPhase() != null
						? String.valueOf(getNestedValue(periodicEvent.getPhase())) : "0.0";
				mastWriter.write("	Type				=> Periodic,\n");
				mastWriter.write("		Name				=> ext_trigger_"
						+ we.getEffect().getName().replaceAll(" ", "").trim() + ",\n");
				mastWriter.write("		Period			=> " + period + ",\n");
				mastWriter.write("		Max_Jitter			=> " + jitter + ",\n");
				mastWriter.write("		Phase			=> " + phase + "\n");
			} else if (we.getPattern() instanceof SporadicPattern) {
				SporadicPattern sporadicEvent = (SporadicPattern) we.getPattern();
				String min_interarrival = sporadicEvent.getMinInterarrival() != null
						? sporadicEvent.getMinInterarrival().toString() : "0.0";
				mastWriter.write("		Type				=> Sporadic,\n");
				mastWriter.write("		Name				=> ext_trigger_"
						+ we.getEffect().getName().replaceAll(" ", "").trim() + ",\n");
				mastWriter.write("		Distribution		=> Uniform,\n");
				mastWriter.write("		Min_Interarrival	=> " + min_interarrival + "\n");
			} else if (we.getPattern() instanceof BurstPattern) {
				BurstPattern burstPattern = (BurstPattern) we.getPattern();
				mastWriter.write("		Type				=> Bursty,\n");
				mastWriter.write("		Name				=> ext_trigger_"
						+ we.getEffect().getName().replaceAll(" ", "").trim() + ",\n");
				mastWriter.write("		Avg_Interarrival	=> " + averageInterarrival(burstPattern) + ",\n");
				mastWriter.write("		Distribution		=> Uniform,\n");
				mastWriter.write("		Bound_Interval		=> " + boundInterval(burstPattern) + ",\n");
				mastWriter.write("		Max_Arrivals		=> " + burstPattern.getBurstSize() + ",\n");
			}
			mastWriter.write("	)");
			if (wes.size() > i) {
				i++;
				mastWriter.write("),\n");
			}
		}
		mastWriter.write("),\n");
	}

	private String averageInterarrival(BurstPattern bp) {
		double min = 0;
		double max = 0;
		if (bp.getMinEventInterval() == null) {
			min = bp.getMinEventInterval().getValue();
		}
		if (bp.getMaxInterarrival() == null) {
			max = bp.getMinEventInterval().getValue();
		}
		return String.valueOf((min + max) / 2);
	}

	private String boundInterval(BurstPattern bp) {
		double min = 0;
		double max = 0;
		if (bp.getMinEventInterval() == null) {
			min = bp.getMinEventInterval().getValue();
		}
		if (bp.getMaxInterarrival() == null) {
			max = bp.getMinEventInterval().getValue();
		}
		return String.valueOf(max - min);
	}

	private List<Step> getAllSteps(DesignModel design) {
		return getAllBehaviorScenarios(design.getWorkloadBehavior()).stream().map(out -> out.getSteps())
				.flatMap(Collection::stream).collect(Collectors.toList());
	}

	private List<BehaviorScenario> getAllBehaviorScenarios(WorkloadBehavior wb) {
		return wb.getBehavior();
	}

	private List<SoftwareMutualExclusionResource> getMutexResources(DesignModel design) {
		return design.getResourcePackage().getOwnedElement().stream()
				.filter(out -> out instanceof SoftwareMutualExclusionResource)
				.map(out -> (SoftwareMutualExclusionResource) out).collect(Collectors.toList());
	}

	private List<SoftwareSchedulableResource> getSchedulableResources(DesignModel design) {
		return getHardwareComputingResource(design).getOwnedResource().stream()
				.filter(out -> out instanceof SoftwareSchedulableResource).map(out -> (SoftwareSchedulableResource) out)
				.collect(Collectors.toList());
	}

	private HardwareComputingResource getHardwareComputingResource(DesignModel design) {

		List<HardwareComputingResource> hrList = getAllHardwareResources(design).stream()
				.filter(out -> out instanceof HardwareComputingResource).map(out -> (HardwareComputingResource) out)
				.collect(Collectors.toList());
		if (hrList.size() >= 1) {
			return hrList.get(0);
		}
		return null;
	}

	private List<HardwareComputingResource> getAllHardwareResources(DesignModel design) {
		return design.getResourcePackage().getOwnedElement().stream()
				.filter(out -> out instanceof HardwareComputingResource).map(out -> (HardwareComputingResource) out)
				.collect(Collectors.toList());
	}

	private void generateProcessingResource(FileWriter mastWriter, HardwareComputingResource hwProcessor)
			throws IOException {
		mastWriter.write("Processing_Resource (\n");
		mastWriter.write("	Type					=> Regular_Processor,\n");
		mastWriter.write("	Name					=> " + hwProcessor.getName().replaceAll(" ", "") + ",\n");
		mastWriter.write("	Max_Interrupt_Priority	=> " + getMaximumInterruptPriority(hwProcessor) + ",\n");
		mastWriter.write("	Min_Interrupt_Priority	=> " + getMinimumInterruptPriority(hwProcessor) + ",\n");
		mastWriter.write("	Worst_ISR_Switch		=> " + getWorstISRSwitch(hwProcessor) + ",\n");
		mastWriter.write("	Avg_ISR_Switch			=> " + getAverageISRSwitch(hwProcessor) + ",\n");
		mastWriter.write("	Best_ISR_Switch			=> " + getBestISRSwitch(hwProcessor) + ",\n");
		mastWriter.write("	Speed_Factor			=> " + getProcessorSpeedFactor(hwProcessor) + "\n");
		mastWriter.write(");\n");
	}

	/* doit on garder les clean d'acceleo ? */
	private void generateScheduler(FileWriter mastWriter, HardwareComputingResource hwProcessor) throws IOException {
		String processorName = hwProcessor.getName().replaceAll(" ", "");
		Scheduler mainScheduler = hwProcessor.getMainScheduler();
		mastWriter.write("Scheduler (\n");
		mastWriter.write("	Type					=> Primary_Scheduler,\n");
		mastWriter.write("	Name					=> " + getNameOrMain(mainScheduler).replaceAll(" ", "") + ",\n");
		mastWriter.write("	Host					=> " + processorName + ",\n");
		generateSchedPolicy(mastWriter, mainScheduler);
	}

	private void generateSchedPolicy(FileWriter mastWriter, Scheduler mainScheduler) throws IOException {
		mastWriter.write("	Policy					=> (\n");
		mastWriter.write("		Type					=> " + getSchedPolicy(mainScheduler));
		try {
			if (mainScheduler.getPolicy().getPolicy() == SchedPolicyKind.FIXED_PRIORITY) {
				mastWriter.write(",\n");
				mastWriter.write("		Worst_Context_Switch	=> " + getWorstContextSwitch(mainScheduler) + ",\n");
				mastWriter.write("		Avg_Context_Switch		=> " + getAvgContextSwitch(mainScheduler) + ",\n");
				mastWriter.write("		Best_Context_Switch		=> " + getBestContextSwitch(mainScheduler) + ",\n");
				mastWriter.write("		Max_Priority			=> " + getMaxPriority(mainScheduler) + ",\n");
				mastWriter.write("		Min_Priority			=> " + getMinPriority(mainScheduler));
			}
		} catch (NullPointerException e) {
			mastWriter.write("		Worst_Context_Switch	=> " + getWorstContextSwitch(mainScheduler) + ",\n");
			mastWriter.write("		Avg_Context_Switch		=> " + getAvgContextSwitch(mainScheduler) + ",\n");
			mastWriter.write("		Best_Context_Switch		=> " + getBestContextSwitch(mainScheduler) + ",\n");
			mastWriter.write("		Max_Priority			=> " + getMaxPriority(mainScheduler) + ",\n");
			mastWriter.write("		Min_Priority			=> " + getMinPriority(mainScheduler));
		}
		mastWriter.write("));\n");

	}

	private String getNameOrMain(Scheduler mainScheduler) {
		String res = mainScheduler.getName();
		if (res == null) {
			return "MainScheduler";
		} else
			return res;
	}

	private String getBestContextSwitch(Scheduler mainScheduler) {
		return "0.0";
	}

	private String getAvgContextSwitch(Scheduler mainScheduler) {
		return "0.0";
	}

	private String getWorstContextSwitch(Scheduler mainScheduler) {
		return "0.0";
	}

	private String getSchedPolicyType(Scheduler mainScheduler) {
		try {
			if (mainScheduler.getPolicy().getPolicy() == SchedPolicyKind.EARLIEST_DEADLINE_FIRST) {
				return "EDF";
			} else if (mainScheduler.getPolicy().getPolicy() == SchedPolicyKind.FIXED_PRIORITY) {
				return "Fixed_Priority_Policy";
			} else
				return "Fixed_Priority_Policy";
		} catch (NullPointerException e) {
			return "Fixed_Priority_Policy";
		}
	}

	private String getSchedPolicy(Scheduler mainScheduler) {
		try {
			if (mainScheduler.getPolicy().getPolicy() == SchedPolicyKind.EARLIEST_DEADLINE_FIRST) {
				return "EDF";
			} else if (mainScheduler.getPolicy().getPolicy() == SchedPolicyKind.FIXED_PRIORITY) {
				return "Fixed_Priority";
			} else
				return "Fixed_Priority";
		} catch (NullPointerException e) {
			return "Fixed_Priority";
		}
	}

	private String getMinPriority(Scheduler scheduler) {
		return "1";
	}

	private String getMaxPriority(Scheduler scheduler) {
		return "32767";
	}

	private String getMaximumInterruptPriority(HardwareComputingResource scheduler) {
		return "32767";
	}

	private String getMinimumInterruptPriority(HardwareComputingResource scheduler) {
		return "1";
	}

	private String getBestISRSwitch(HardwareComputingResource scheduler) {
		return "0.0";
	}

	private String getWorstISRSwitch(HardwareComputingResource scheduler) {
		return "0.0";
	}

	private String getAverageISRSwitch(HardwareComputingResource scheduler) {
		return "0.0";
	}

	private String getProcessorSpeedFactor(HardwareComputingResource hw) {
		if (hw.getSpeedFactor() > 0) {
			return String.valueOf(hw.getSpeedFactor());
		} else
			return "1.00";
	}

	public static TimeUnitKind getMinUnit() {
		return minUnit;
	}
}
