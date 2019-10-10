package org.polarsys.time4sys.mast.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.osgi.service.component.annotations.Component;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Context;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.mapping.MappingFactory;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.AnalysisRepositoryControler;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.utils.WorkspaceUtils;
import org.polarsys.time4sys.marte.analysisrepository.tysco.util.AbstractResultParser;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.mast.parser.result.ProcessingResourceResults;
import org.polarsys.time4sys.mast.parser.result.REALTIMESITUATION;
import org.polarsys.time4sys.mast.parser.result.SchedulingServerResults;
import org.polarsys.time4sys.mast.parser.result.SharedResourceResults;
import org.polarsys.time4sys.mast.parser.result.Slack;
import org.polarsys.time4sys.mast.parser.result.TimingResult;
import org.polarsys.time4sys.mast.parser.result.Trace;
import org.polarsys.time4sys.mast.parser.result.TransactionResults;
import org.polarsys.time4sys.mast.parser.result.Utilization;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.results.results.AbstractResult;
import org.polarsys.time4sys.results.results.AbstractResultSet;
import org.polarsys.time4sys.results.results.AnalysisResultSet;
import org.polarsys.time4sys.results.results.AtomicResult;
import org.polarsys.time4sys.results.results.ComputingResourceResult;
import org.polarsys.time4sys.results.results.ResultSetContainer;
import org.polarsys.time4sys.results.results.ResultsFactory;
import org.polarsys.time4sys.results.results.SharedResourceResult;
import org.polarsys.time4sys.results.results.SimplePeriodicEvent;
import org.polarsys.time4sys.results.results.TaskResult;

import fr.ensma.lias.transformation.time4sys2mast.general.Time4Sys2EDFMastGenerator;
import fr.ensma.lias.transformation.time4sys2mast.general.Time4Sys2MastGenerator;

@Component
public class MastResultParser implements AbstractResultParser {

	private HashMap<String, String> mapp;
	XMLResource xmlRes;
	Mapping mapping;
	Context context;

	public void parseResult(TestImplementation test) {

		try {
			JAXBContext jc = JAXBContext.newInstance("org.polarsys.time4sys.mast.parser.result");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			File file = getResultFile(test);
			FileInputStream inputStream = new FileInputStream(file);
			BufferedReader inputBR = new BufferedReader(new InputStreamReader(inputStream));
			String ligne = "";

			while ((ligne = inputBR.readLine()) != null && !ligne.startsWith("<")) {
			}
			DesignModel designModel = WorkspaceUtils.getDesign();
			Project proj = (Project) designModel.eContainer();
			mapp = Time4Sys2MastGenerator.getMapp();
			if (mapp.values().size() == 0) {
				mapp = Time4Sys2EDFMastGenerator.getMapp();
			}
			xmlRes = (XMLResource) proj.eResource();
			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(proj);
			REALTIMESITUATION mast_rts = (REALTIMESITUATION) unmarshaller.unmarshal(inputBR);

			domain.getCommandStack().execute(new RecordingCommand(domain) {
				@Override
				protected void doExecute() {
					AnalysisResultSet analysisResult = createResult(proj, designModel, mast_rts);
					mapping = MappingFactory.eINSTANCE.createMapping();
					context = MappingFactory.eINSTANCE.createContext("MastAnalysis");
					analysisResult.setMapping(mapping);
					mapping.getRules().add(context);
					for (Object mast_obj : mast_rts.getSystemSlackOrTraceOrTransaction()) {
						addSubResult(analysisResult, mast_obj);
					}
				}
			});

		} catch (JAXBException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void addSubResult(Object mast_container, Object mast_obj) {
		if (mast_obj instanceof TransactionResults) {
			TransactionResults mastTransactionResults = (TransactionResults) mast_obj;
			TaskResult tr = ResultsFactory.eINSTANCE.createTaskResult();
			tr.setName(mastTransactionResults.getName());
			addResult(mast_container, tr);
			for (Object mast_tt : mastTransactionResults.getSlackOrTimingResultOrSimulationTimingResult()) {
				if (mast_tt instanceof TimingResult) {
					addSubResult(mast_tt, mast_obj, tr);
				}
			}
		}

		else if (mast_obj instanceof Slack) {
			TaskResult tr = ResultsFactory.eINSTANCE.createTaskResult();
			Slack mast_slack = (Slack) mast_obj;
			tr.setSlack(mast_slack.getValue());
			addResult(mast_container, tr);
		} else if (mast_obj instanceof SharedResourceResults) {
			SharedResourceResults mast_sRR = (SharedResourceResults) mast_obj;
			SharedResourceResult csrr = ResultsFactory.eINSTANCE.createSharedResourceResult();
			csrr.setName(mast_sRR.getName());
			if (mast_sRR.getUtilization() != null) {
				csrr.setUtilization(mast_sRR.getUtilization().getTotal());
			}
			addResult(mast_container, csrr);
		} else if (mast_obj instanceof ProcessingResourceResults) {
			ProcessingResourceResults mast_pRR = (ProcessingResourceResults) mast_obj;
			ComputingResourceResult crr = ResultsFactory.eINSTANCE.createComputingResourceResult();
			for (Object mast__utilization : mast_pRR.getSlackOrDetailedUtilizationOrUtilization()) {
				if (mast__utilization instanceof Utilization) {
					crr.setLoad(((Utilization) mast__utilization).getTotal());
				}
			}
			addResult(mast_container, crr);
		} else if (mast_obj instanceof Trace) {
			// Trace trace = (Trace) obj;
			// trace.getPathname();
			// addSubResult(, trace);
		} else if (mast_obj instanceof SchedulingServerResults) {
			// SchedulingServerResults schedulingServerResults =
			// (SchedulingServerResults) obj;
			// schedulingServerResults.getFixedPriorityPolicy();
			// schedulingServerResults.getInterruptFPPolicy();
			// schedulingServerResults.getName();
			// schedulingServerResults.getNonPreemptibleFPPolicy();
			// schedulingServerResults.getPollingPolicy();
			// schedulingServerResults.getSporadicServerPolicy();
		}
	}

	private void addSubResult(Object mast_timing, Object mast_transaction, TaskResult tr) {
		// TODO Auto-generated method stub
		if (mast_transaction instanceof TransactionResults) {
			if (mast_timing instanceof TimingResult) {
				TimingResult mast_timingRes = (TimingResult) mast_timing;
				TaskResult taskRes=ResultsFactory.eINSTANCE.createTaskResult();
				addResult(tr,taskRes);
				String eventName = ((TimingResult)mast_timing).getEventName();
				if (mapp.containsKey(eventName)) {
					Link link = MappingFactory.eINSTANCE.createLink(context, "source",
							xmlRes.getEObject(mapp.get(eventName)), "target", taskRes);
					mapping.getSubLinks().add(link);
				} else {
					Link link = MappingFactory.eINSTANCE.createLink(context, "source", null, "target", taskRes);
					mapping.getSubLinks().add(link);
				}

				float max = Collections.max(mast_timingRes.getWorstGlobalResponseTimes().getGlobalResponseTime()
						.stream().map(out -> out.getTimeValue()).collect(Collectors.toList()));
				float min = Collections.min(mast_timingRes.getBestGlobalResponseTimes().getGlobalResponseTime().stream()
						.map(out -> out.getTimeValue()).collect(Collectors.toList()));

				Duration minD = NfpFactory.eINSTANCE.createDurationFromString(String.valueOf(min));
				Duration maxD = NfpFactory.eINSTANCE.createDurationFromString(String.valueOf(max));

				taskRes.setName(eventName);
				taskRes.setBCET(minD); 
				taskRes.setWCET(maxD);

				mast_timingRes.getJitters();
				SimplePeriodicEvent spe = ResultsFactory.eINSTANCE.createSimplePeriodicEvent();
				taskRes.setEvent(spe);
				
				// TODO:Add the good kind of event
				taskRes.setNbOfSuspension(mast_timingRes.getNumOfSuspensions().intValue());
				mast_timingRes.getWorstBlockingTime();
			}
		}
	}

	private void addResult(Object container, AbstractResult csrr) {
		if (container instanceof AbstractResultSet) {
			((AbstractResultSet) container).getResults().add(csrr);
		} else if (container instanceof AtomicResult) {
			AbstractResultSet ars = (AbstractResultSet) ((EObject)container).eContainer();
			ars.getResults().add(csrr);
//			((AtomicResult) container).getSubResults().add(csrr);
		}
	}

	private AnalysisResultSet createResult(Project proj, DesignModel model, REALTIMESITUATION rts) {
		ResultSetContainer rsc = ResultsFactory.eINSTANCE.createResultSetContainer();
		AnalysisResultSet rs = ResultsFactory.eINSTANCE.createAnalysisResultSet();
		proj.getResults().add(rsc);
		rsc.getResultSet().add(rs);
		rsc.setDesignModel(model);

		rs.setToolName(rts.getGenerationTool().toString());
		rs.setDate(rts.getGenerationDate().toGregorianCalendar().getTime());

		return rs;
	}

	private File getResultFile(TestImplementation test) {
		IProject currentProject = WorkspaceUtils.getProject();
		IFolder folder = WorkspaceUtils.createFolder(currentProject,
				AnalysisRepositoryControler.getFolder(test.getTestResult()));
		String outputFolderPath = folder.getLocation().toOSString() + File.separator
				+ AnalysisRepositoryControler.getFileName(test.getTestResult());
		return new File(outputFolderPath);
	}
}
