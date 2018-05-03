/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies, RealTime-at-Work, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *     Loïc Fejoz - initial simple report generation
 *******************************************************************************/
package org.polarsys.time4sys.activity.explorer.activity;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.AbstractHyperlinkAdapter;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.marte.gqam.ArrivalPattern;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.transformations.ToPeriodicDerivation;

public class DesignSimpleReport extends AbstractHyperlinkAdapter {

	
	public static void generateReport(final DesignModel model, final IFile output, final IProgressMonitor monitor) {
		try {
			final ByteArrayOutputStream data = new ByteArrayOutputStream();
			final OutputStreamWriter writer = new OutputStreamWriter(data);
			generateReport(model, writer);
			writer.close();
			final ByteArrayInputStream source = new ByteArrayInputStream(data.toByteArray());
			if (output.exists()) {
				output.setContents(source, true, true, monitor);
			} else {
				output.create(source, true, monitor);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	public static void generateReport(final DesignModel model, final Writer w) throws IOException {

		w.write("Simple Report for ");
		String modelName = model.getName();
		if (modelName == null) {
			modelName = "untitled";
		}
		w.write(modelName);
		w.write("\n");
		w.write("==================");
		for (int i = 0; i < modelName.length(); ++i) {
			w.write("=");
		}
		w.write("\n");
		w.write("Time4Sys tool <https://www.polarsys.org/projects/polarsys.time4sys>\n");
		w.write(":data-uri:\n");
		w.write(":mathjax:\n");
		w.write(":icons:\n");
		w.write("\n");

		w.write("Problem summary\n");
		w.write("---------------\n");
		w.write("\n");
		final EList<BehaviorScenario> scenarii = model.getWorkloadBehavior().getBehavior();
		if (scenarii.size() != 1) {
			w.write("It is expected to have only one scenarw. We cannot proceed further.\n");
			return;
		}
		final BehaviorScenario main = scenarii.get(0);
		final EList<Step> steps = main.getSteps();
		w.write("Number of tasks:: ");
		w.write(Integer.toString(steps.size()));
		w.write("\n");

		Duration maxPeriod = NfpFactory.eINSTANCE.createDurationFromString("0ms");
		Duration maxWcet = NfpFactory.eINSTANCE.createDurationFromString("0ms");
		Duration maxOffset = NfpFactory.eINSTANCE.createDurationFromString("0ms");
		long nbOffsets = 0;
		long nbDependencies = 0;
		for (Step step : steps) {
			final EList<WorkloadEvent> causes = step.getCause();
			if (causes.size() != 1) {
				w.write("It is expected that each step have one and only one arrival pattern. We cannot proceed further.\n");
				w.write("It is not the case for " + step.getName() + "\n");
				return;
			}
			final WorkloadEvent evt = causes.get(0);
			final ArrivalPattern pat = evt.getPattern();
			if (!(pat instanceof PeriodicPattern)) {
				w.write("It is expected to only have Periodic pattern.\nIt is not the case for ");
				w.write(step.getName());
				w.write("\n");
			}
			final PeriodicPattern pattern = (PeriodicPattern) pat;
			maxPeriod = maxPeriod.max(pattern.getPeriod());
			if (pattern.getPhase() != null) {
				nbOffsets++;
				maxOffset = maxOffset.max(pattern.getPhase());
			}
			maxWcet = maxWcet.max(step.getWorstCET());
			nbDependencies += (step.getOutputRel() == null ? 0 : 1) + step.getOutputPin().size()
					+ step.getInputPin().size();
		}

		w.write("Maximum period::\nmax P~i~:: ");
		w.write(NfpFactory.eINSTANCE.convertDurationToString(maxPeriod));
		w.write("\n");
		w.write("Maximum WCET::\nmax C~i~:: ");
		w.write(NfpFactory.eINSTANCE.convertDurationToString(maxWcet));
		w.write("\n");
		w.write("Number of offset::\n#O~i~:: ");
		w.write(Long.toString(nbOffsets));
		w.write("\n");
		if (nbOffsets > 0) {
			w.write("Maximum offset::\nmax O~i~:: ");
			w.write(NfpFactory.eINSTANCE.convertDurationToString(maxOffset));
			w.write("\n");
		}
		w.write("Number of dependency:: ");
		w.write(Long.toString(nbDependencies));
		w.write("\n");

		if (nbDependencies != 0) {
			w.write("WARNING: Following computations does not handle dependencies.\n");
		}

		double utilizationFactorOnPeriod = 0.0;
		Duration hyperperiod = null;
		w.write("[options=\"header\"]\n");
		w.write("|=======================================\n");
		w.write("|&#964;~i~\t|P~i~\t|C~i~\t|O~i~\t|D~i~\t|Priority\t|U~i~\t|Utilization on deadline\n");
		for (Step step : steps) {
			final PeriodicPattern pattern = (PeriodicPattern) step.getCause().get(0).getPattern();
			final double utilizationPeriod = step.getWorstCET().div(pattern.getPeriod());
			// final double utilizationDeadline =
			// step.getWorstCET().div(step.getDeadline());
			utilizationFactorOnPeriod += utilizationPeriod;
			if (hyperperiod == null) {
				hyperperiod = pattern.getPeriod();
			} else {
				hyperperiod = hyperperiod.lcm(pattern.getPeriod());
			}

			w.write("|");
			w.write(step.getName());
			w.write("\t|");
			w.write(NfpFactory.eINSTANCE.convertDurationToString(pattern.getPeriod()));
			w.write("\t|");
			w.write(NfpFactory.eINSTANCE.convertDurationToString(step.getWorstCET()));
			w.write("\t|");
			if (pattern.eIsSet(GqamPackage.eINSTANCE.getArrivalPattern_Phase())) {
				w.write(NfpFactory.eINSTANCE.convertDurationToString(pattern.getPhase()));
			}
			w.write("\t|");
			// w.write(t.deadline);
			w.write("\t|");
			/*
			 * if (t.priority ~= nil) { w.write(t.priority); }
			 */
			w.write("\t|");
			w.write(String.format("%.5f", utilizationPeriod));
			w.write("\t|");
			// w.write(String.format('%.5f', utilizationDeadline));
			w.write("\n");
		}
		w.write("|=======================================\n\n");

		w.write("\n\nSimple analysis\n");
		w.write("---------------\n");
		w.write("\n");
		w.write("Hyper period without offset nor dependency::\nH::\n ");
		w.write(NfpFactory.eINSTANCE.convertDurationToString(hyperperiod));
		w.write("\n");
		w.write("Processor utilization factor with period without offset::\nU::\n ");
		w.write(Double.toString(utilizationFactorOnPeriod));
		w.write("\n");
		w.write("Processor utilization factor with deadline without offset::\n ");
		w.write("TBD");// w.write(Double.toString(utilizationFactorOnDeadline));
		w.write("\n");
		if (utilizationFactorOnPeriod < 1.0) {
			w.write("<<<george,George et al.>>>' busy period bound::\nL~U~::\n ");
			w.write("TBD");// w.write(tasks_factors.L_U);
			w.write("\n");
			w.write("<<<ripoll,Ripoll et al.>>>' busy period bound::\nL^");
			w.write("TBD");// w.write(tasks_factors.L_R_a.a);
			w.write("^~R~::\n ");
			w.write("TBD");// w.write(tasks_factors.L_R_a.L_R);
			w.write("\n");
		} else {
			w.write("\nBusy period bounds not computed because U > 1.");
		}

		w.write("\n\n:numbered!:\n");

		w.write("\n[appendix]\n");
		w.write("Notations and Symbols\n");
		w.write("---------------------\n\n");
		w.write("[horizontal]\n");
		w.write("C~i~::\n Worst case computation time of task &#964;~i~\n");
		w.write("D~i~::\n Relative deadline of task &#964;~i~\n");
		w.write("H::\n Hyper period (aka Major cycle or scheduling period)\n");
		w.write("O~i~::\n Offset of task &#964;~i~, aka release date\n");
		w.write("T~i~::\n Period of task &#964;~i~\n");
		w.write("U~i~::\n Processor utilization factor of task &#964;~i~ (= C~i~ / T~i~)\n");
		w.write("U::\n Processor utilization factor (= &#931; u~i~)\n");
		w.write("\n");

		w.write("\n[appendix]\n[bibliography]\nReferences\n------------\n\n");
		w.write("\n[bibliography]\n");
		w.write("- [[[george]]] L. George, N. Rivierre, and M. Spuri. 'Preemptive and non-preemptive real-time uni-processor scheduling'. Technical Report 2966, Institut National de Recherche et Informatique et en Automatique (INRIA), France, 1996.\n");
		w.write("- [[[ripoll]]] I. Ripoll, A. Crespo, and A. K. Mok. 'Improvement in feasibility testing for real-time tasks'. Real-Time Sytstems, 11(1):19–39, July 1996.\n");
	}

	/**
	 * Default constructor
	 */
	public DesignSimpleReport() {
		super(ActivityExplorerManager.INSTANCE.getRootSemanticModel());
	}

	/**
	 * Constructor with parameters
	 * 
	 * @param root
	 *            the root model element ({@link EObject})
	 * @param session
	 *            the associated {@link Session} with the activity explorer
	 */
	public DesignSimpleReport(EObject root) {
		super(root);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.
	 * AbstractHyperlinkAdapter#linkPressed(org.eclipse.ui.forms.events.
	 * HyperlinkEvent, org.eclipse.emf.ecore.EObject,
	 * org.eclipse.sirius.business.api.session.Session)
	 */
	@Override
	protected void linkPressed(final HyperlinkEvent event, final EObject project_p, final Session session) {
		if (project_p instanceof Project) {
			generateSimpleReport(project_p);
		}
	}

	public static void generateSimpleReport(final EObject project_p) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(project_p);
		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				final Project prj = ((Project) project_p);
				final Mapping mapping = ToPeriodicDerivation.getOrApply(prj).getMapping();
				final DesignModel toBeAnalysedModel = (DesignModel) mapping.getSubLinks().get(0).getUniqueTargetValue("copy");
				final URI uri = prj.eResource().getURI();
				IPath path = new Path(uri.toPlatformString(true));
				final String filename = path.lastSegment().replaceAll(".time4sys", "-report.asciidoc");
				path = path.removeLastSegments(1);
				path = path.append(filename);
				IWorkspaceRoot wrkspc = ResourcesPlugin.getWorkspace().getRoot();
				final IFile output = wrkspc.getFile(path);
				generateReport(toBeAnalysedModel, output, null);
			}
		});
	}
}