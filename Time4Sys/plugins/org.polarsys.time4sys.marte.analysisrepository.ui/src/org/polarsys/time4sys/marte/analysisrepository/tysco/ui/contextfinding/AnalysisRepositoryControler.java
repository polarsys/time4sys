package org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.core.internal.utils.FileUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel;
import org.polarsys.time4sys.marte.analysisrepository.tysco.EvaluationResultType;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ExpectedEvaluationValue;
import org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule;
import org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.RuleGroup;
import org.polarsys.time4sys.marte.analysisrepository.tysco.Test;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TruthType;
import org.polarsys.time4sys.marte.analysisrepository.tysco.common.CurrentAnalysisContext;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.utils.ArFunctionalUtils;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.utils.GraphModelUtils;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.utils.Result;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding.utils.WorkspaceUtils;
import org.polarsys.time4sys.marte.analysisrepository.tysco.util.AbstractExogenousTransformation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.util.LanguageValidatorUtils;
import org.polarsys.time4sys.simulation.commands.AbstractTransformationCommandHandler;
import org.polarsys.time4sys.simulation.commands.AutoRecordingCommand;
import org.polarsys.time4sys.simulation.commands.CommandRunner;

//import components.contextmodel.ContextModelGraph;
import eclipseview.polarsys.ui.components.Color;
import eclipseview.polarsys.ui.components.Connection;
import eclipseview.polarsys.ui.components.GraphModel;
import eclipseview.polarsys.ui.components.GraphModelFactory;
import eclipseview.polarsys.ui.components.GraphModelPackage;
import eclipseview.polarsys.ui.components.Node;
import eclipseview.polarsys.ui.graphmodel.PolarsysGraphView;

public class AnalysisRepositoryControler {

	/** Controler of User Interface **/
	private AnalysisRepository analysisRepository;
	private AnalysisRepositoryResultUI resultUI;
	private List<ContextModel> appropriateContexts;
	private List<List<Integer>> violatedGroupIdLists;
	private List<Result> results;
	// private static DesignModel design;
	private GraphModelFactory factory;

	private Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

	/**
	 * Constructeur avec param
	 * 
	 * @param ui
	 */
	public AnalysisRepositoryControler() {
		results = new ArrayList<Result>();
		appropriateContexts = new ArrayList<ContextModel>();
		violatedGroupIdLists = new ArrayList<List<Integer>>();
		GraphModelPackage.eINSTANCE.eClass();
		factory = GraphModelFactory.eINSTANCE;
	}

	/**
	 * check
	 */
	public void check(DesignModel time4SysModel) {
		CurrentAnalysisContext context = CurrentAnalysisContext.getInstance();
		context.setDesignModel(time4SysModel);
		final String repositoryLocation = AnalysisRepositoryPlugin.getDefault().getPreferenceStore()
				.getString("AnalysisRepositoryPath");

		if (repositoryLocation == null || repositoryLocation.trim().compareTo("") == 0) {
			return;
		}

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = reg.getExtensionToFactoryMap();
		map.put("tysco", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI("file:/" + repositoryLocation), true);
		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		analysisRepository = (AnalysisRepository) resource.getContents().get(0);
		if (analysisRepository == null) {
			// ui.setNotification("Cannot get Analysis Repository in selected
			// resource");
			return;
		}

		if (analysisRepository != null && time4SysModel != null) {
			// Close current window
			Result result;

			if (analysisRepository.getAllRules() != null) {
				for (IdentificationRule r : analysisRepository.getAllRules()) {
					String ruleContent = "";
					ruleContent = r.getContent();
					// rule in OCL
					if (ArFunctionalUtils.isOCLConstraint(ruleContent, time4SysModel)) {
						result = new Result();
						result.setRefId(r.getId());
						result.setEvaluatedResult(
								LanguageValidatorUtils.oclEvaluateInvariant(time4SysModel, ruleContent));
						results.add(result);
					}
				}
			}

			// show results
			// appropriateContexts =
			// ParadUtils.findAppropriateContexts(analysisRepository,results);
			appropriateContexts = ArFunctionalUtils.findAppropriateContexts(analysisRepository, results,
					violatedGroupIdLists);
			resultUI = new AnalysisRepositoryResultUI(shell, this);
			resultUI.open();
		}
	}

	/**
	 * Run Transformation
	 * 
	 * @param test
	 */
	public boolean runTransformation(Test test) {
		boolean fine = true;

		TestImplementation testImpl = test.getImplementations().get(0);

		// Clean output folder
		String outputFolderPath = WorkspaceUtils.getOutputFolderPath(getFolder(testImpl.getTestedFile()));
		fine &= WorkspaceUtils.cleanFolder(outputFolderPath);
		if (!fine) {
			return fine;
		}

		// Execute transformation
		Transformation transfo = testImpl.getTransformation();
		fine &= execTransfo(transfo, testImpl);

		// Refresh
		WorkspaceUtils.refreshProject();
		if (!fine)
			ArFunctionalUtils.errorMessage("Transformation failed");
		return fine;

	}

	/**
	 * Run Transformation
	 * 
	 * @param test
	 */
	public boolean runAnalysis(Test test) {

		// Launch the analysis here mast_analysis tool_name [options]
		TestImplementation testImpl = test.getImplementations().get(0);

		File newFile = null;
		boolean lock = true;
		int count = 0;
		String transformedFilePath = WorkspaceUtils.getOutputFolderPath(getFolder(testImpl.getTestedFile()));
		transformedFilePath += File.separator + getFileName(testImpl.getTestedFile());
		String resultPath = WorkspaceUtils.getOutputFolderPath(getFolder(testImpl.getTestResult()));
		resultPath += File.separator + getFileName(testImpl.getTestResult());

		while (lock) {

			newFile = new File(transformedFilePath);

			if (newFile.exists()) {
				lock = false;
			} else {
				try {
					Thread.sleep(500);
					count++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			if (count > 10) {
				ArFunctionalUtils.plainMessage("Transformed file not found in output folder");
				return false;
			}
		}
		// TODO:Ajouter dans la doc qu'il faut installer MAST et mettre dans le
		// PATH et redémarrer eclipse ou le PC.

		// String execPath = WorkspaceUtils.getOutputFolderPath("") +
		// testImpl.getAnalysisExecPath();
		List<String> args = new ArrayList<String>();
		args.addAll(Arrays.asList(testImpl.getAnalysisExecPath().split(" ")));
		args.add(transformedFilePath);
		FileWriter fr;
		try {
			fr = new FileWriter(resultPath);
			boolean transfoOk = execTransfo(args, fr);
			if (!transfoOk) {
				ArFunctionalUtils.errorMessage("Analysis failed");
			}
			fr.close();
			WorkspaceUtils.refreshProject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;

	}

	public static String getFolder(String testedFile) {
		// TODO Auto-generated method stub
		return testedFile.substring(0, testedFile.lastIndexOf(File.separator) + 1);
	}

	public static String getFileName(String testedFile) {
		// TODO Auto-generated method stub
		return testedFile.substring(testedFile.lastIndexOf(File.separator) + 1);
	}

	// public static String[] filePaths(String str) {
	// if (str == null || str.isEmpty()) {
	// return new String[] {};
	// }
	// return str.lastIndexOf()(File.separator);
	// }

	/**
	 * Trigger analysis
	 * 
	 * @param test
	 */
	public void runTransformationAndAnalysis(Test test) {
		runTransformation(test);
		runAnalysis(test);
	}

	public AnalysisRepository getAnalysisRepository() {
		return analysisRepository;
	}

	public void setAnalysisRepository(AnalysisRepository analysisRepository) {
		this.analysisRepository = analysisRepository;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public List<ContextModel> getAppropriateContexts() {
		return appropriateContexts;
	}

	public void setAppropriateContexts(List<ContextModel> appropriateContexts) {
		this.appropriateContexts = appropriateContexts;
	}

	public boolean executeInnerTransfo(InnerTransformation transfo) {

		ClassLoader classLoader = AbstractTransformationCommandHandler.class.getClassLoader();

		try {
			Class transfoClass = classLoader.loadClass(transfo.getClassPath());
			AbstractTransformationCommandHandler handler = (AbstractTransformationCommandHandler) transfoClass
					.newInstance();

			CurrentAnalysisContext context = CurrentAnalysisContext.getInstance();
			DesignModel design = context.getDesignModel();
			final CommandRunner cmdRunner = new CommandRunner(PlatformUI.getWorkbench().getActiveWorkbenchWindow(),
					design);
			AutoRecordingCommand arc = (AutoRecordingCommand) handler.createRecordingCommand(null, design);
			cmdRunner.execute(arc);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;

	}

	public static <T> List<T> getServices(Class<T> clazz) {
		Class<AbstractExogenousTransformation> classFromBundle = AbstractExogenousTransformation.class;
		BundleContext ctx = FrameworkUtil.getBundle(classFromBundle).getBundleContext();

		// ServiceTracker<?, ?> tracker = new ServiceTracker<>(ctx,
		// AbstractExogenousTransformation.class, null);
		// try {
		// tracker.open();
		// return tracker.getService();
		// } catch (Exception e) {
		// throw new RuntimeException(e);
		// } finally {
		// tracker.close();
		// }

		if (ctx != null) {
			ServiceTracker<T, T> tracker = new ServiceTracker<>(ctx, classFromBundle.getName(), null);
			try {
				tracker.open();
				@SuppressWarnings("unchecked")
				T[] services = tracker.getServices((T[]) Array.newInstance(clazz, 1));
				if (services.length == 1 && services[0] == null) {
					return new ArrayList<T>();
				}
				return Arrays.asList(services);
			} catch (Exception e) {
				throw new RuntimeException(e);
			} finally {
				tracker.close();
			}
		}
		return new ArrayList<T>();

	}

	/**
	 * 
	 * @param transfo
	 */
	public boolean execTransfo(Transformation transfo, TestImplementation testImpl) {
		if (transfo == null)
			return false;

		try {
			String transfoExecPath = transfo.getTransfoExecPath();
			List<AbstractExogenousTransformation> list = getServices(AbstractExogenousTransformation.class);
			for (AbstractExogenousTransformation aet : list) {
				if (aet.getClass().getName().equals(transfoExecPath)) {
					aet.transform(testImpl);
				}
			}
			// classLoader.loadClass(transfoExecPath);
			//
			// AbstractExogenousTransformation handler =
			// (AbstractExogenousTransformation) transfoClass.newInstance();
			//
			// handler.transform();
			// // Construct arguments to execute jar file
			// // List<String> args = new ArrayList<String>();
			// // String inputModelPath = WorkspaceUtils.getInputModelPath();
			// // String jarPath = transfo.getTransfoExecPath();
			// // String outputFolderPath =
			// WorkspaceUtils.getOutputFolderPath();
			// // args.add("java");
			// // args.add("-jar");
			// // args.add(jarPath);
			// // args.add(inputModelPath);
			// // args.add(outputFolderPath);
			//
			// // execute...
			// // return execTransfo(args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private static BufferedReader getOutput(Process p) {
		return new BufferedReader(new InputStreamReader(p.getInputStream()));
	}

	private static BufferedReader getError(Process p) {
		return new BufferedReader(new InputStreamReader(p.getErrorStream()));
	}

	public boolean execTransfo(List<String> args, FileWriter result) {
		ProcessBuilder processbuilder = new ProcessBuilder(args);
		try {
			Process process = processbuilder.start();
			BufferedReader ouput = getOutput(process);
			BufferedReader error = getError(process);
			String ligne = "";
			while ((ligne = ouput.readLine()) != null) {
				result.write(ligne);
				result.write("\n");
			}

			while ((ligne = error.readLine()) != null) {
				result.write(ligne);
				result.write("\n");
			}

			// refresh project
			WorkspaceUtils.refreshProject();

		} catch (IOException e) {
			System.out.println("error");
			e.printStackTrace();
			return false;
		}
		// ARUtils.plainMessage("Transformation finished");
		return true;
	}

	/*****************************
	 * Result UI associated methods
	 ****************************************/
	/**
	 * Fill the tab with evaluated rules
	 */
	public void fillRulesTab() {
		// Construct info for UI to display
		for (IdentificationRule rule : analysisRepository.getAllRules()) {
			String id = "" + rule.getId();
			String description = rule.getDescription();
			Result result = ArFunctionalUtils.getIdentificationRuleEvaluatedResultById(results, rule.getId());
			resultUI.addRuleToRulesTab(id, description, result.getEvaluatedResult().toString());
		}
	}

	/**
	 * Display appropriate contexts info
	 */
	public void fillMatchedContext() {
		// Construct info for UI to display
		for (ContextModel ctx : appropriateContexts) {
			String id = "" + ctx.getId();
			String name = ctx.getName();
			String description = ctx.getDescription();
			resultUI.addMatchedContext(id, name, description);
		}
	}

	/**
	 * Display appropriate contexts info
	 */
	public void fillInnerTransformations() {
		// Construct info for UI to display
		for (ContextModel ctx : appropriateContexts) {
			String id = "" + ctx.getId();
			String name = ctx.getName();
			String description = ctx.getDescription();
			resultUI.addMatchedContext(id, name, description);
		}
	}

	/**
	 * Display details contexts info
	 */
	public void fillContextModels() {
		// Construct info for UI to display
		for (ContextModel ctx : analysisRepository.getAllContextModels()) {
			if (isAccepted(ctx))
				resultUI.addAcceptedContextModelDetail(ctx);
			else {
				String matchedPercent = computeMatchedPercent(ctx);
				resultUI.addNotAcceptedContextModelDetail(ctx, matchedPercent);
			}
		}
	}

	public void fillInnerTransfos() {
		for (InnerTransformation ctx : analysisRepository.getAllInnerTransfos()) {
			resultUI.addInnerTransformationDetail(ctx);
		}

	}

	/**
	 * Compute matched percent
	 * 
	 * @param ctx
	 * @return
	 */
	public String computeMatchedPercent(ContextModel ctx) {
		RuleGroup rootGroup = ctx.getRootGroup();
		float matchedPercent = computeMatchedPercent(rootGroup);
		return "" + matchedPercent;
	}

	/**
	 * Compute matched percent
	 * 
	 * @param group
	 * @return
	 */
	public float computeMatchedPercent(RuleGroup group) {

		if (group == null)
			return 1;

		float matchedPercent = 0;
		int satisfiedRuleNumber = 0;
		int numberOfRules = getRuleNumber(group);

		List<ExpectedEvaluationValue> expectedValues = group.getExpectedRuleValues();
		for (ExpectedEvaluationValue expectedVal : expectedValues) {
			TruthType expectedTruthType = expectedVal.getValue();
			if (expectedTruthType == TruthType.NEUTRAL)
				satisfiedRuleNumber++;
			else if (expectedTruthType == TruthType.TRUE) {
				Result evaluatedResult = ArFunctionalUtils.getIdentificationRuleEvaluatedResultById(results,
						expectedVal.getAssociatedRule().getId());
				if (evaluatedResult.getEvaluatedResult() == EvaluationResultType.TRUE)
					satisfiedRuleNumber++;
			} else {
				Result evaluatedResult = ArFunctionalUtils.getIdentificationRuleEvaluatedResultById(results,
						expectedVal.getAssociatedRule().getId());
				if (evaluatedResult.getEvaluatedResult() == EvaluationResultType.FALSE)
					satisfiedRuleNumber++;
			}
		}

		/*
		 * if (group.getConjunctionType()==ConjunctionType.AND) { if
		 * (group.getSubGroups().size()==0) { matchedPercent =
		 * satisfiedRuleNumber/(float)group.getExpectedRuleValues().size(); }
		 * else { matchedPercent = } }
		 */

		matchedPercent = satisfiedRuleNumber / (float) numberOfRules;

		return matchedPercent;
	}

	/**
	 * get number of rules of a group
	 * 
	 * @param group
	 * @return
	 */
	private int getRuleNumber(RuleGroup group) {
		if (group == null) {
			return 0;
		}
		int directRuleNumber = group.getExpectedRuleValues().size();
		if (group.getSubGroups().size() == 0)
			return directRuleNumber;
		else {
			int ruleNumber = directRuleNumber;
			for (RuleGroup subGroup : group.getSubGroups()) {
				ruleNumber += getRuleNumber(subGroup);
			}

			System.out.println("number of rules: " + ruleNumber);

			return ruleNumber;
		}
	}

	/**
	 * Display details tests info
	 */
	public void fillTestsGroup() {

		// Construct info for UI to display
		for (ContextModel ctx : appropriateContexts) {
			for (Test test : ctx.getAnalysisTests()) {
				resultUI.addAvailableTestDetail(test);
			}
		}
	}

	public void displayScanResult(ContextModel ctx) {
		System.out.println("test");
	}

	public void executeAllTransfoAndAnalyse(ContextModel ctx) {
		System.out.println("test");
	}

	/**
	 * Generate graph corresponding to evaluation result of identification rules
	 * 
	 * @param ctx
	 */
	public void displayEvaluationResult(ContextModel ctx) {

		// Get Root node
		// RulesGroup rootGroup = ctx.getRuleGroups().get(0);
		RuleGroup rootGroup = ctx.getRootGroup();
		if (rootGroup == null)
			return;

		// Construct representation model
		List<Integer> violatedGroupIdList = violatedGroupIdLists
				.get(analysisRepository.getAllContextModels().indexOf(ctx));

		// Initiate graph
		// ContextModelGraph mxgraph = new ContextModelGraph();
		GraphModel graphModel = factory.createGraphModel();

		// Display group
		String type = rootGroup.getJunctionType().toString();
		// Object mxrootNode = mxgraph.addNode(type);
		Node rootNode = GraphModelUtils.createNode(type, graphModel, factory);

		// Coloring the node
		int idGroup = rootGroup.getId();
		coloringNode(rootNode, violatedGroupIdList, idGroup);
		fillGraph(rootGroup, graphModel, rootNode, violatedGroupIdList);

		// Visualize graph model
		PolarsysGraphView view = new PolarsysGraphView(shell);
		view.visualize(graphModel);
	}

	/**
	 * Color the node
	 * 
	 * @param graphModel
	 * @param rootNode
	 * @param violatedIdList
	 * @param idGroup
	 */
	private void coloringNode(Node rootNode, List<Integer> violatedIdList, int idGroup) {
		if (violatedIdList.contains(idGroup)) {
			rootNode.setColor(Color.RED);
		} else {
			rootNode.setColor(Color.BLUE);
		}
	}

	/**
	 * Fill graph
	 * 
	 * @param rootGroup
	 * @param graphModel
	 * @param rootNode
	 * @param violatedGroupIdList
	 */
	private void fillGraph(RuleGroup parentGroup, GraphModel graphModel, Node parentNode,
			List<Integer> violatedGroupIdList) {

		List<Node> ruleNodes = new ArrayList<Node>();
		List<Node> groupNodes = new ArrayList<Node>();
		List<Integer> violatedNodeIdList = new ArrayList<Integer>();

		// Add rule nodes
		for (ExpectedEvaluationValue val : parentGroup.getExpectedRuleValues()) {
			TruthType expectedVal = val.getValue();
			String rule = val.getAssociatedRule().getDescription();
			String nodeLabel = expectedVal + " rule: " + rule;
			int ruleId = val.getAssociatedRule().getId();

			// Create new rule node
			Node ruleNode = GraphModelUtils.createNode(nodeLabel, graphModel, factory);
			ruleNode.setRefId(ruleId);

			// Set color for node
			Result evaluatedResult = ArFunctionalUtils.getIdentificationRuleEvaluatedResultById(results,
					val.getAssociatedRule().getId());
			ruleNode.setTextColor(Color.BLACK);

			if (expectedVal == TruthType.NEUTRAL) {
				ruleNode.setColor(Color.GREEN);
			} else if (expectedVal == TruthType.TRUE) {
				if (evaluatedResult.getEvaluatedResult() == EvaluationResultType.TRUE)
					ruleNode.setColor(Color.GREEN);
				else {
					violatedNodeIdList.add(ruleNode.getRefId());
					ruleNode.setColor(Color.RED);
				}
			} else if (expectedVal == TruthType.FALSE) {
				if (evaluatedResult.getEvaluatedResult() == EvaluationResultType.FALSE)
					ruleNode.setColor(Color.GREEN);
				else {
					violatedNodeIdList.add(ruleNode.getRefId());
					ruleNode.setColor(Color.RED);
				}
			}

			// Add node to nodes list
			ruleNodes.add(ruleNode);
		}

		// Add group nodes
		for (RuleGroup gr : parentGroup.getSubGroups()) {
			String type = gr.getJunctionType().toString();
			Node grNode = GraphModelUtils.createNode(type, graphModel, factory);
			groupNodes.add(grNode);
			grNode.setRefId(gr.getId());

			coloringNode(grNode, violatedGroupIdList, gr.getId());
		}

		if (violatedGroupIdList.contains(parentGroup.getId())) {
			for (Node node : ruleNodes) {
				Connection edge = GraphModelUtils.createConnection("", graphModel, factory);
				edge.setSource(parentNode);
				edge.setTarget(node);
				if (violatedNodeIdList.contains(node.getRefId())) {
					edge.setColor(Color.RED);
				} else {
					edge.setColor(Color.BLUE);
				}
			}

			for (Node node : groupNodes) {
				Connection edge = GraphModelUtils.createConnection("", graphModel, factory);
				edge.setSource(parentNode);
				edge.setTarget(node);
				if (violatedGroupIdList.contains(node.getRefId())) {
					edge.setColor(Color.RED);
				} else {
					edge.setColor(Color.BLUE);
				}
			}
		} else {
			for (Node node : ruleNodes) {
				Connection edge = GraphModelUtils.createConnection("", graphModel, factory);
				edge.setSource(parentNode);
				edge.setTarget(node);
				edge.setColor(Color.BLUE);
			}

			for (Node node : groupNodes) {
				Connection edge = GraphModelUtils.createConnection("", graphModel, factory);
				edge.setSource(parentNode);
				edge.setTarget(node);
				edge.setColor(Color.BLUE);
			}
		}

		for (int i = 0; i < parentGroup.getSubGroups().size(); i++) {
			fillGraph(parentGroup.getSubGroups().get(i), graphModel, groupNodes.get(i), violatedGroupIdList);
		}
	}

	/**
	 * Check if a context is appropriate for the system
	 * 
	 * @param ctx
	 *            : context model
	 * @return
	 */
	public boolean isAccepted(ContextModel ctx) {
		return appropriateContexts.contains(ctx);
	}

}