package org.polarsys.time4sys.mast.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
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
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.hrm.HardwareResource;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;
import org.polarsys.time4sys.marte.srm.SoftwareResource;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.mast.parser.trace.Message;
import org.polarsys.time4sys.mast.parser.trace.MessageType;
import org.polarsys.time4sys.mast.parser.trace.Source;
import org.polarsys.time4sys.mast.parser.trace.TRACEFILE;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Simulation;
import org.polarsys.time4sys.model.time4sys.Time4sysFactory;
import org.polarsys.time4sys.results.results.AbstractResult;
import org.polarsys.time4sys.results.results.AbstractResultSet;
import org.polarsys.time4sys.results.results.AnalysisResultSet;
import org.polarsys.time4sys.results.results.AtomicResult;
import org.polarsys.time4sys.results.results.ResultSetContainer;
import org.polarsys.time4sys.results.results.ResultsFactory;
import org.polarsys.time4sys.results.results.TaskResult;
import org.polarsys.time4sys.trace.SchedulingEvent;
import org.polarsys.time4sys.trace.SchedulingEventKind;
import org.polarsys.time4sys.trace.Slice;
import org.polarsys.time4sys.trace.SliceKind;
import org.polarsys.time4sys.trace.Trace;
import org.polarsys.time4sys.trace.TraceFactory;

import fr.ensma.lias.transformation.time4sys2mast.general.Time4Sys2EDFMastGenerator;
import fr.ensma.lias.transformation.time4sys2mast.general.Time4Sys2MastGenerator;

@Component
public class JSimMastResultParser implements AbstractResultParser {

	private static HashMap<Source, Slice> sourceSliceMapp = new HashMap<Source, Slice>();
	private static HashMap<Integer, Source> sourceNumber = new HashMap<Integer, Source>();

	private static HashMap<MessageType, SchedulingEventKind> messageTypeKind = new HashMap<MessageType, SchedulingEventKind>();
	private static HashMap<Integer, MessageType> typeNumber = new HashMap<Integer, MessageType>();

	private HashMap<String, String> mapp;
	XMLResource xmlRes;
	Mapping mapping;
	Trace trace;
	Simulation simu;
	Context context;

	public void parseResult(TestImplementation test) {

		try {
			JAXBContext jc = JAXBContext.newInstance("org.polarsys.time4sys.mast.parser.trace");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			File file = getResultFile(test);
			FileInputStream inputStream = new FileInputStream(file);

			waitCommandLineEnd(inputStream);

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
			TRACEFILE traceFile = (TRACEFILE) unmarshaller.unmarshal(inputBR);

			domain.getCommandStack().execute(new RecordingCommand(domain) {
				@Override
				protected void doExecute() {

					mapping = MappingFactory.eINSTANCE.createMapping();
					context = MappingFactory.eINSTANCE.createContext("JSimMast");

					simu = Time4sysFactory.eINSTANCE.createSimulation();
					simu.setMapping(mapping);

					trace = TraceFactory.eINSTANCE.createTrace();
					simu.setTrace(trace);

					proj.getSimulations().add(simu);
					mapping.getRules().add(context);
					for (MessageType message : traceFile.getMsgTypeList().getMsgType()) {
						addMessageType(message);
					}

					for (Source source : traceFile.getSrcList().getSrc()) {
						addSource(source);
					}

					for (Message message : traceFile.getMsgList().getMsg()) {
						addMessage(message);
					}

					for (Slice slice : trace.getSlices()) {
						addSubSlices(slice);
					}

				}

				private void addMessage(Message message) {
					SchedulingEvent event = TraceFactory.eINSTANCE.createSchedulingEvent();
					event.setTimestamp(NfpFactory.eINSTANCE.createDurationFromString(String.valueOf(message.getT())));
					Slice slice = getSlice(message.getS());
					slice.getEvents().add(event);
					trace.getEvents().add(event);
					SchedulingEventKind sek = getEventKind(message.getM());
					event.setKind(sek);
				}

				private SchedulingEventKind getEventKind(BigInteger bigInteger) {
					MessageType messageType = typeNumber.get(bigInteger);
					return messageTypeKind.get(messageType);
				}

				private Slice getSlice(int s) {
					Source source = sourceNumber.get(s);
					return sourceSliceMapp.get(source);
				}

				private void addMessageType(MessageType messageType) {
					messageTypeKind.put(messageType, convertMessageType(messageType));
				}

				private SchedulingEventKind convertMessageType(MessageType messageType) {
					// TODO Some Events kind could not be represented
					switch (messageType.getType()) {
					case "RegularProcessor/FREE":
						return SchedulingEventKind.TERMINATED;
					case "RegularProcessor/ATTENDING_TIMER":
						return SchedulingEventKind.ACTIVATED;
					case "RegularProcessor/ATTENDING_INTERRUPT":
						return SchedulingEventKind.ACTIVATED;
					case "RegularProcessor/ATTENDING_SCHEDULER":
						return SchedulingEventKind.ACTIVATED;
					case "RegularProcessor/ATTENDING_CONTEXTSWITCH":
						return SchedulingEventKind.ACTIVATED;
					case "RegularProcessor/ATTENDING_INTERRUPT_CONTEXTSWITCH":
						return SchedulingEventKind.ACTIVATED;
					case "RegularProcessor/LOCKING_RESOURCES":
						return SchedulingEventKind.RUNNING;
					case "PacketBasedNetwork/FREE":
						return SchedulingEventKind.TERMINATED;
					case "PacketBasedNetwork/TRANSMITING_PACKET":
						return SchedulingEventKind.ACTIVATED;
					case "Mutex/FREE":
						return SchedulingEventKind.TERMINATED;
					case "Mutex/ASSIGNED":
						return SchedulingEventKind.ACTIVATED;
					case "SegmentEndEvent":
						return SchedulingEventKind.TERMINATED;
					case "Segment_to_Free":
						return SchedulingEventKind.TERMINATED;
					case "Segment_to_Blocked":
						return SchedulingEventKind.BLOCKED;
					case "Segment_to_Suspended":
						return SchedulingEventKind.SUSPENDED;
					case "Workload event received":
						return SchedulingEventKind.ACTIVATED;
					case "Local deadline fail":
						return SchedulingEventKind.DEADLINE;
					case "Global deadline fail":
						return SchedulingEventKind.DEADLINE;
					case "Local deadline met":
						return SchedulingEventKind.DEADLINE;
					case "Global deadline met":
						return SchedulingEventKind.DEADLINE;

					default:
						break;
					}
					return null;
				}

				private void addSource(Source source) {
					Slice slice = TraceFactory.eINSTANCE.createSlice();
					sourceSliceMapp.put(source, slice);
					sourceNumber.put(source.getSid(), source);
					slice.setName(source.getName());
					slice.setKind(convertToKind(source.getType()));
					trace.getSlices().add(slice);

					Link link = MappingFactory.eINSTANCE.createLink(context, "source", searchSourceInMapp(source),
							"target", slice);
					mapping.getSubLinks().add(link);
				}

				private void addSubSlices(Slice slice) {
					for (Entry<Source, Slice> entry : sourceSliceMapp.entrySet()) {
						if (entry.getValue().equals(slice)) {
							Source key = entry.getKey();
							EObject source = searchSourceInMapp(key);
							if (source instanceof HardwareResource) {
								List<EObject> ownedResource = getSubResources(source);
								for (EObject res : ownedResource) {
									for (Link link : mapping.getSubLinks()) {
										if (link.getSources().stream().map(out -> out.getValue()).collect(Collectors.toList()).contains(res)) {
											for (EObject target : link.getTargets().stream().map(out -> out.getValue()).collect(Collectors.toList())) {
												if (target instanceof Slice) {
													slice.getSubSlices().add((Slice) target);
												}
											}
										}
									}
								}
							}
						}
					}
				}

				private List<EObject> getSubResources(EObject source) {
					List<EObject> res = new ArrayList();
					if (source instanceof HardwareResource) {
						List<Resource> ownedResource = ((HardwareResource) source).getOwnedResource();
						res.addAll(ownedResource);
						for (EObject obj : ownedResource) {
							res.addAll(getSubResources(obj));
						}
					}
					if (source instanceof SoftwareResource) {
						List<Resource> ownedResource = ((SoftwareResource) source).getOwnedResource();
						res.addAll(ownedResource);
						for (EObject obj : ownedResource) {
							res.addAll(getSubResources(obj));
						}
					}
					if (source instanceof SoftwareSchedulableResource) {
						Iterator<EObject> it = designModel.eAllContents();
						while (it.hasNext()) {
							EObject obj = it.next();
							if (obj instanceof Step) {
								res.add(obj);
							}
						}
					}
					return res;
				}

				private EObject searchSourceInMapp(Source source) {

					for (Entry<String, String> entry : mapp.entrySet()) {
						EObject originalObject = xmlRes.getEObject(entry.getValue());
						if (originalObject instanceof NamedElement) {
							NamedElement elem = (NamedElement) originalObject;
							if (elem.getName() != null
									&& source.getName().contains(elem.getName().replaceAll(" ", "").toLowerCase())) {
								return elem;
							}
						}
					}
					return null;
				}

				private SliceKind convertToKind(String type) {
					if (type.equals("ComputingResource")) {
						return SliceKind.RESOURCE;
					}
					if (type.equals("WorkloadEvent")) {
						return SliceKind.JOB;
					}
					if (type.equals("Segment")) {
						return SliceKind.TASK;
					}
					return null;
				}
			});

		} catch (JAXBException |

				IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void waitCommandLineEnd(FileInputStream inputStream) throws IOException {
		while (inputStream.available() == 0) {
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void addSubResult(Object mast_container, Message mast_obj) {
		// if (mast_obj instanceof TransactionResults) {
		// TransactionResults mastTransactionResults = (TransactionResults)
		// mast_obj;
		// TaskResult tr = ResultsFactory.eINSTANCE.createTaskResult();
		// tr.setName(mastTransactionResults.getName());
		// addResult(mast_container, tr);
		// for (Object mast_tt :
		// mastTransactionResults.getSlackOrTimingResultOrSimulationTimingResult())
		// {
		// if (mast_tt instanceof TimingResult) {
		// addSubResult(mast_tt, mast_obj, tr);
		// }
		// }
		// }
		//
		// else if (mast_obj instanceof Slack) {
		// TaskResult tr = ResultsFactory.eINSTANCE.createTaskResult();
		// Slack mast_slack = (Slack) mast_obj;
		// tr.setSlack(mast_slack.getValue());
		// addResult(mast_container, tr);
		// } else if (mast_obj instanceof SharedResourceResults) {
		// SharedResourceResults mast_sRR = (SharedResourceResults) mast_obj;
		// SharedResourceResult csrr =
		// ResultsFactory.eINSTANCE.createSharedResourceResult();
		// csrr.setName(mast_sRR.getName());
		// if (mast_sRR.getUtilization() != null) {
		// csrr.setUtilization(mast_sRR.getUtilization().getTotal());
		// }
		// addResult(mast_container, csrr);
		// } else if (mast_obj instanceof ProcessingResourceResults) {
		// ProcessingResourceResults mast_pRR = (ProcessingResourceResults)
		// mast_obj;
		// ComputingResourceResult crr =
		// ResultsFactory.eINSTANCE.createComputingResourceResult();
		// for (Object mast__utilization :
		// mast_pRR.getSlackOrDetailedUtilizationOrUtilization()) {
		// if (mast__utilization instanceof Utilization) {
		// crr.setLoad(((Utilization) mast__utilization).getTotal());
		// }
		// }
		// addResult(mast_container, crr);
		// } else if (mast_obj instanceof Trace) {
		// } else if (mast_obj instanceof SchedulingServerResults) {
		// }
	}

	private void addSubResult(Object mast_timing, Object mast_transaction, TaskResult tr) {
		// TODO Auto-generated method stub
		// if (mast_transaction instanceof TransactionResults) {
		// if (mast_timing instanceof TimingResult) {
		// TimingResult mast_timingRes = (TimingResult) mast_timing;
		// TaskResult taskRes = ResultsFactory.eINSTANCE.createTaskResult();
		// addResult(tr, taskRes);
		// String eventName = ((TimingResult) mast_timing).getEventName();
		// if (mapp.containsKey(eventName)) {
		// Link link = MappingFactory.eINSTANCE.createLink(context, "source",
		// xmlRes.getEObject(mapp.get(eventName)), "target", taskRes);
		// mapping.getSubLinks().add(link);
		// } else {
		// Link link = MappingFactory.eINSTANCE.createLink(context, "source",
		// null, "target", taskRes);
		// mapping.getSubLinks().add(link);
		// }
		//
		// float max =
		// Collections.max(mast_timingRes.getWorstGlobalResponseTimes().getGlobalResponseTime()
		// .stream().map(out ->
		// out.getTimeValue()).collect(Collectors.toList()));
		// float min =
		// Collections.min(mast_timingRes.getBestGlobalResponseTimes().getGlobalResponseTime().stream()
		// .map(out -> out.getTimeValue()).collect(Collectors.toList()));
		//
		// Duration minD =
		// NfpFactory.eINSTANCE.createDurationFromString(String.valueOf(min));
		// Duration maxD =
		// NfpFactory.eINSTANCE.createDurationFromString(String.valueOf(max));
		//
		// taskRes.setName(eventName);
		// taskRes.setBCET(minD);
		// taskRes.setWCET(maxD);
		//
		// mast_timingRes.getJitters();
		// SimplePeriodicEvent spe =
		// ResultsFactory.eINSTANCE.createSimplePeriodicEvent();
		// taskRes.setEvent(spe);
		//
		// // TODO:Add the good kind of event
		// taskRes.setNbOfSuspension(mast_timingRes.getNumOfSuspensions().intValue());
		// mast_timingRes.getWorstBlockingTime();
		// }
		// }
	}

	private void addResult(Object container, AbstractResult csrr) {
		if (container instanceof AbstractResultSet) {
			((AbstractResultSet) container).getResults().add(csrr);
		} else if (container instanceof AtomicResult) {
			AbstractResultSet ars = (AbstractResultSet) ((EObject) container).eContainer();
			ars.getResults().add(csrr);
			// ((AtomicResult) container).getSubResults().add(csrr);
		}
	}

	private AnalysisResultSet createResult(Project proj, DesignModel model, TRACEFILE rts) {
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
