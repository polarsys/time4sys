/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Yassine OUHAMMOU- initial API and implementation
 * Aurelien DIDIER- add inner transformation
 *******************************************************************************/
package org.polarsys.time4sys.marte.analysisrepository.tysco.ui.contextfinding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel;
import org.polarsys.time4sys.marte.analysisrepository.tysco.Deadline_Sustainability;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ExecutionTime_Sustainability;
import org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.Jitter_Sustainability;
import org.polarsys.time4sys.marte.analysisrepository.tysco.NecessaryCondition;
import org.polarsys.time4sys.marte.analysisrepository.tysco.Period_Sustainability;
import org.polarsys.time4sys.marte.analysisrepository.tysco.SufficientCondition;
import org.polarsys.time4sys.marte.analysisrepository.tysco.Test;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TestCharacteristicType;

public class AnalysisRepositoryResultUI extends TitleAreaDialog {

	/** Composants de l'interface **/
	private TabFolder tabFolder;
	private Table rulesTable;
	private Text matchedContextsText;
	// private Shell parent;
	private TabItem tab1, tab2, tab3, tab4, tab5;
	private Composite compoTab1, compoTab2, compoTab3, compoTab4, compoTab5;

	/** Controleur **/
	private AnalysisRepositoryControler ctrl;

	/** Colors **/
	// private static final Color green = new Color(null,193,255,193);
	// private static final Color yellow = new Color(null,255,246,143);
	// private static Color red = new Color(null,255,99,71);
	// private static Color darkGreen = new Color(null,34,139,34);

	/**
	 * Le constructeur avec params
	 * 
	 * @param parentShell
	 */
	public AnalysisRepositoryResultUI(Shell parentShell, AnalysisRepositoryControler ctrl) {
		super(parentShell);
		// parent = parentShell;
		this.ctrl = ctrl;
		// red = new Color(null,255,99,71);
		// darkGreen = new Color(null,34,139,34);

	}

	@Override
	public void create() {
		super.create();
		setTitle("Result of scheduling analysis ability (Identification process)");
		setMessage("This is a recapitulatif of the identification process", IMessageProvider.INFORMATION);
	}

	@Override
	protected Control createDialogArea(Composite parent) {

		parent.setSize(500, 750);

		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.None);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		container.setLayout(new GridLayout(1, true));

		tabFolder = new TabFolder(container, SWT.NONE);
		GridData grid = new GridData(SWT.FILL, SWT.FILL, true, true);
		grid.horizontalSpan = 1;
		tabFolder.setLayoutData(grid);
		tabFolder.setLayout(new GridLayout(1, true));
		
		ScrolledComposite scroll=null;
		
		/***************** Tab 4 : Schedulability tests *****************/
		tab4 = new TabItem(tabFolder, SWT.NONE);
		tab4.setText("Available Analysis Tests");
		
		scroll = new ScrolledComposite(tabFolder, SWT.V_SCROLL | SWT.H_SCROLL);
		scroll.setExpandHorizontal(true);
		scroll.setExpandVertical(true);
		
		grid = new GridData(SWT.FILL, SWT.FILL, false, true);
		scroll.setLayoutData(grid);
		
		compoTab4 = new Composite(scroll, SWT.NONE);
		grid = new GridData(SWT.FILL, SWT.FILL, false, true);
		compoTab4.setLayoutData(grid);
		compoTab4.setLayout(new GridLayout());
		ctrl.fillTestsGroup();
		
		scroll.setMinSize(compoTab4.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		scroll.setContent(compoTab4);
		tab4.setControl(scroll);

		/*****************
		 * Tab 1 : Identification Rules Evaluation
		 *****************/
		tab1 = new TabItem(tabFolder, SWT.None);
		tab1.setText("Context Characteristics");

		compoTab1 = new Composite(tabFolder, SWT.NONE);
		grid = new GridData(SWT.FILL, SWT.FILL, true, true);
		grid.horizontalSpan = 1;
		compoTab1.setLayoutData(grid);
		compoTab1.setLayout(new GridLayout(1, true));

		// Table of identificationrules and analysis results
		rulesTable = new Table(compoTab1, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		rulesTable.setHeaderVisible(true);
		rulesTable.setLinesVisible(true);
		grid = new GridData(GridData.FILL_BOTH);
		grid.heightHint = 250;
		rulesTable.setLayoutData(grid);
		rulesTable.pack();

		TableColumn colonneRuleId, colonneRuleDescription, colonneRuleEvaluation;
		colonneRuleId = new TableColumn(rulesTable, SWT.NONE);
		colonneRuleId.setText("Rule Id");
		colonneRuleId.pack();

		colonneRuleDescription = new TableColumn(rulesTable, SWT.NONE);
		colonneRuleDescription.setText("Description");
		colonneRuleDescription.pack();

		colonneRuleEvaluation = new TableColumn(rulesTable, SWT.NONE);
		colonneRuleEvaluation.setText("Evaluation");
		colonneRuleEvaluation.pack();

		// Contexts matched analysis results
		Group matchedContextsGroup = new Group(compoTab1, SWT.NONE);
		grid = new GridData(SWT.FILL, SWT.FILL, true, true);
		grid.horizontalSpan = 1;
		matchedContextsGroup.setLayoutData(grid);
		matchedContextsGroup.setLayout(new GridLayout(1, true));
		matchedContextsGroup.setText("Matched Contexts");

		matchedContextsText = new Text(matchedContextsGroup,
				SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.READ_ONLY);
		matchedContextsText.setBackground(new Color(null, 255, 255, 255));
		grid = new GridData(SWT.FILL, SWT.FILL, true, true);
		grid.horizontalSpan = 1;
		matchedContextsText.setLayoutData(grid);
		matchedContextsText.setText("");

		// Fill informations
		ctrl.fillRulesTab();
		ctrl.fillMatchedContext();
		tab1.setControl(compoTab1);

		/***************** Tab 2 : Context Models ******************/
		tab2 = new TabItem(tabFolder, SWT.None);
		tab2.setText("Accepted Context Models");

		// ScrolledComposite scroll = new
		// ScrolledComposite(tabFolder,SWT.V_SCROLL|SWT.H_SCROLL|SWT.BORDER);
		scroll = new ScrolledComposite(tabFolder, SWT.V_SCROLL | SWT.H_SCROLL);
		scroll.setExpandHorizontal(true);
		scroll.setExpandVertical(true);
		grid = new GridData(SWT.FILL, SWT.FILL, false, true);
		scroll.setLayoutData(grid);

		compoTab2 = new Composite(scroll, SWT.NONE);
		grid = new GridData(SWT.FILL, SWT.FILL, false, true);
		compoTab2.setLayoutData(grid);
		compoTab2.setLayout(new GridLayout(2, false));

		// ctrl.fillContextModels();

		scroll.setMinSize(compoTab2.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		scroll.setContent(compoTab2);
		tab2.setControl(scroll);

		/***************** Tab 3 : Not Accepted Context *****************/
		tab3 = new TabItem(tabFolder, SWT.None);
		tab3.setText("Not Accepted Context Models");

		ScrolledComposite scroll1 = new ScrolledComposite(tabFolder, SWT.V_SCROLL | SWT.H_SCROLL);
		scroll1.setExpandHorizontal(true);
		scroll1.setExpandVertical(true);
		grid = new GridData(SWT.FILL, SWT.FILL, false, true);
		scroll1.setLayoutData(grid);

		compoTab3 = new Composite(scroll1, SWT.NONE);
		grid = new GridData(SWT.FILL, SWT.FILL, false, true);
		compoTab3.setLayoutData(grid);
		compoTab3.setLayout(new GridLayout(2, false));

		ctrl.fillContextModels();

		scroll1.setMinSize(compoTab3.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		scroll1.setContent(compoTab3);
		tab3.setControl(scroll1);


		/***************** Tab 5 : Inner transfo tests *****************/
		tab5 = new TabItem(tabFolder, SWT.None);
		tab5.setText("Inner transformation tests");

		ScrolledComposite scroll2 = new ScrolledComposite(tabFolder, SWT.V_SCROLL | SWT.H_SCROLL);
		scroll2.setExpandHorizontal(true);
		scroll2.setExpandVertical(true);
		grid = new GridData(SWT.FILL, SWT.FILL, false, true);
		scroll2.setLayoutData(grid);

		compoTab5 = new Composite(scroll2, SWT.NONE);
		grid = new GridData(SWT.FILL, SWT.FILL, false, true);
		compoTab5.setLayoutData(grid);
		compoTab5.setLayout(new GridLayout(2, false));

		ctrl.fillInnerTransfos();

		scroll2.setMinSize(compoTab5.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		scroll2.setContent(compoTab5);
		tab5.setControl(scroll2);

		return area;
	}

	/************************** TAB1 **********************************/
	/**
	 * Add rule info to rules table (tab1)
	 * 
	 * @param id
	 * @param description
	 * @param result
	 */
	public void addRuleToRulesTab(String id, String description, String result) {
		TableItem item = new TableItem(rulesTable, SWT.NONE);
		item.setText(0, id);
		item.setText(1, description);
		item.setText(2, result);
		rulesTable.pack();
	}

	/**
	 * Add a context info to matched contexts text zone (tab1)
	 * 
	 * @param id
	 * @param name
	 * @param description
	 */
	public void addMatchedContext(String id, String name, String description) {

		String mess = "";
		mess += "*****************************************************\n";
		mess += "Id: " + id + "\n";
		mess += "Context's name: " + name + "\n";
		mess += "Description: " + description + "\n";
		mess += "*****************************************************\n\n";
		matchedContextsText.append(mess);
	}

	/************************** TAB2 **********************************/

	/**
	 * Add a context's info
	 * 
	 * @param id
	 * @param ctxName
	 * @param description
	 * @param references
	 * @param associatedTestsName
	 */
	public void addAcceptedContextModelDetail(ContextModel ctx) {

		// Displayed info
		String id = "" + ctx.getId();
		String ctxName = ctx.getName();
		String description = ctx.getDescription();

		List<String> references = ctx.getReferences();
		List<String> associatedTestsName = new ArrayList<String>();
		for (Test test : ctx.getAnalysisTests()) {
			associatedTestsName.add(test.getName());
		}

		Group group = new Group(compoTab2, SWT.NONE);
		FontDescriptor boldDescriptor = FontDescriptor.createFrom(group.getFont()).setStyle(SWT.BOLD);
		Font boldFont = boldDescriptor.createFont(group.getDisplay());
		group.setFont(boldFont);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.horizontalSpan = 2;
		group.setLayoutData(gridData);
		group.setLayout(new GridLayout(2, false));

		group.setText(ctxName);

		// Id
		Label label = new Label(group, SWT.NONE);
		label.setText("Id");
		Text idTextZone = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
		idTextZone.setText(id);

		// Description
		label = new Label(group, SWT.NONE);
		label.setText("Description");
		Text descriptionTextZone = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
		descriptionTextZone.setText(description);

		// References
		if (references != null && references.size() > 0) {
			label = new Label(group, SWT.NONE);
			label.setText("References");
			Text referencesTextZone = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
			gridData = new GridData(SWT.FILL, SWT.FILL, true, true);

			referencesTextZone.setText("");
			for (String ref : references) {
				referencesTextZone.append(ref + "\n");
			}
		}

		// Display result evaluation result on context
		label = new Label(group, SWT.NONE);
		label.setText("Evaluation Result");
		Button displayBut = new Button(group, SWT.PUSH);
		displayBut.setText("Display");
		displayBut.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				ctrl.displayEvaluationResult(ctx);
			}
		});

		// Associated Tests
		if (associatedTestsName != null && associatedTestsName.size() > 0) {
			label = new Label(group, SWT.NONE);
			label.setText("Available schedulability tests");
			Text availTestsTextZone = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
			gridData = new GridData(SWT.FILL, SWT.FILL, true, true);

			availTestsTextZone.setText("");
			for (String test : associatedTestsName) {
				availTestsTextZone.append(test + "\n");
			}
		}

	}

	/************************** TAB3 **********************************/
	/**
	 * Add a context's info
	 * 
	 * @param id
	 * @param ctxName
	 * @param description
	 * @param references
	 * @param associatedTestsName
	 */
	public void addNotAcceptedContextModelDetail(ContextModel ctx, String matchedPercent) {

		// Displayed info
		String id = "" + ctx.getId();
		String ctxName = ctx.getName();
		String description = ctx.getDescription();
		// String matchedPercent =
		// computeMatchedPercent(ctx.getRootGroup(),results);

		List<String> references = ctx.getReferences();
		List<String> associatedTestsName = new ArrayList<String>();
		for (Test test : ctx.getAnalysisTests()) {
			associatedTestsName.add(test.getName());
		}

		Group group = new Group(compoTab3, SWT.NONE);
		FontDescriptor boldDescriptor = FontDescriptor.createFrom(group.getFont()).setStyle(SWT.BOLD);
		Font boldFont = boldDescriptor.createFont(group.getDisplay());
		group.setFont(boldFont);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.horizontalSpan = 2;
		group.setLayoutData(gridData);
		group.setLayout(new GridLayout(2, false));
		group.setText(ctxName);

		// Id
		Label label = new Label(group, SWT.NONE);
		label.setText("Id");
		Text idTextZone = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
		idTextZone.setText(id);

		// Description
		label = new Label(group, SWT.NONE);
		label.setText("Description");
		Text descriptionTextZone = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
		descriptionTextZone.setText(description);

		// References
		if (references != null && references.size() > 0) {
			label = new Label(group, SWT.NONE);
			label.setText("References");
			Text referencesTextZone = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
			gridData = new GridData(SWT.FILL, SWT.FILL, true, true);

			referencesTextZone.setText("");
			for (String ref : references) {
				referencesTextZone.append(ref + "\n");
			}
		}

		label = new Label(group, SWT.NONE);
		label.setText("Matched percent");
		Text matchedPercentField = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
		matchedPercentField.setText(matchedPercent);

		// Display result evaluation result on context
		label = new Label(group, SWT.NONE);
		label.setText("Evaluation Result");
		Button displayBut = new Button(group, SWT.PUSH);
		displayBut.setText("Display");
		displayBut.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				ctrl.displayEvaluationResult(ctx);
			}
		});

		// Associated Tests
		if (associatedTestsName != null && associatedTestsName.size() > 0) {
			label = new Label(group, SWT.NONE);
			label.setText("Available schedulability tests");
			Text availTestsTextZone = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
			gridData = new GridData(SWT.FILL, SWT.FILL, true, true);

			availTestsTextZone.setText("");
			for (String test : associatedTestsName) {
				availTestsTextZone.append(test + "\n");
			}
		}
	}

	/*
	 * private float computeMatchedPercent(RuleGroup rootGroup,List<Result>
	 * results) {
	 * 
	 * float matchedPercent = 0;
	 * 
	 * if (rootGroup.getConjunctionType() == ConjunctionType.AND) { int
	 * numberOfRules = rootGroup.getExpectedRuleValues().size(); int
	 * numberOfSubGroups = rootGroup.getSubGroups().size();
	 * 
	 * int numberOfSatisfiedRules = 0; for () }
	 * 
	 * return matchedPercent;
	 * 
	 * }
	 */

	/************************** TAB4 **********************************/
	public void addAvailableTestDetail(Test test) {

		Group group = new Group(compoTab4, SWT.NONE);
		FontDescriptor boldDescriptor = FontDescriptor.createFrom(group.getFont()).setStyle(SWT.BOLD);
		Font boldFont = boldDescriptor.createFont(group.getDisplay());
		group.setFont(boldFont);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.horizontalSpan = 2;
		group.setLayoutData(gridData);
		group.setLayout(new GridLayout(4, false));

		// Display name
		Label label = new Label(group, SWT.NONE);
		gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.horizontalSpan = 1;
		label.setLayoutData(gridData);
		label.setText("Test Name");

		String name = test.getName();
		gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.horizontalSpan = 3;
		Text nameTextZone = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
		nameTextZone.setText(name);
		nameTextZone.setLayoutData(gridData);

		// Description
		label = new Label(group, SWT.NONE);
		gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.horizontalSpan = 1;
		label.setLayoutData(gridData);
		label.setText("Description");

		String description = test.getDescription();
		Text descriptionTextZone = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
		descriptionTextZone.setText(description);
		gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.horizontalSpan = 3;
		descriptionTextZone.setLayoutData(gridData);

		// References
		List<String> references = test.getReferences();
		if (references != null && references.size() > 0) {
			label = new Label(group, SWT.NONE);
			label.setText("References");
			gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
			gridData.horizontalSpan = 1;
			label.setLayoutData(gridData);

			Text referencesTextZone = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
			gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
			gridData.horizontalSpan = 3;
			referencesTextZone.setLayoutData(gridData);
			referencesTextZone.setText("");
			for (String ref : references) {
				referencesTextZone.append(ref + "\n");
			}
		}

		// Characteristics
		List<TestCharacteristicType> characteristics = test.getCharacteristics();
		if (characteristics != null && characteristics.size() > 0) {
			label = new Label(group, SWT.NONE);
			label.setText("Characteristics");
			gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
			gridData.horizontalSpan = 1;
			label.setLayoutData(gridData);

			Text characteristicsTextZone = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
			gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
			gridData.horizontalSpan = 3;
			characteristicsTextZone.setLayoutData(gridData);
			characteristicsTextZone.setText("");

			for (TestCharacteristicType characType : characteristics) {
				String type = getCharacteristicName(characType);
				List<ContextModel> associatedContexts = characType.getReferencedContexts();

				String mess = type + " in context: ";
				if (!associatedContexts.isEmpty()) {
					for (ContextModel ctx : associatedContexts) {
						if (ctrl.isAccepted(ctx))
							mess += ctx.getName() + ", ";
					}
				}

				characteristicsTextZone.append(mess + "\n");

				// for (ContextModel ctx : associatedContexts) {
				// mess += ctx.getName() +", ";
				// }
				// characteristicsTextZone.append(mess);
			}
		}

		// Run analysis
		label = new Label(group, SWT.NONE);
		label.setText("Run");
		gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.horizontalSpan = 1;
		label.setLayoutData(gridData);

		Button runTransformationButton = new Button(group, SWT.PUSH);
		runTransformationButton.setText("Transformation");
		runTransformationButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				ctrl.runTransformation(test);
			}
		});

		Button runAnalysisButton = new Button(group, SWT.PUSH);
		runAnalysisButton.setText("Analysis");
		runAnalysisButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				ctrl.runAnalysis(test);
			}
		});

		Button runTransformationAndAnalysisButton = new Button(group, SWT.PUSH);
		runTransformationAndAnalysisButton.setText("Transformation and Analysis");
		runTransformationAndAnalysisButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				ctrl.runTransformationAndAnalysis(test);
			}
		});
	}

	/************************** TAB5 **********************************/

	/**
	 * Add a context's info
	 * 
	 * @param id
	 * @param ctxName
	 * @param description
	 * @param references
	 * @param associatedTestsName
	 */
	public void addInnerTransformationDetail(InnerTransformation transfo) {

		// Displayed info
		String id = "" + transfo.getId();
		String ctxName = transfo.getName();
		String description = transfo.getDescription();

		List<String> turnTrueRules = transfo.getTurnTrue().stream().map(out -> out.getDescription())
				.collect(Collectors.toList());
		List<String> turnFalseRules = transfo.getTurnFalse().stream().map(out -> out.getDescription())
				.collect(Collectors.toList());

		Group group = new Group(compoTab5, SWT.NONE);
		FontDescriptor boldDescriptor = FontDescriptor.createFrom(group.getFont()).setStyle(SWT.BOLD);
		Font boldFont = boldDescriptor.createFont(group.getDisplay());
		group.setFont(boldFont);
		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		gridData.horizontalSpan = 2;
		group.setLayoutData(gridData);
		group.setLayout(new GridLayout(2, false));

		group.setText(ctxName);

		// Id
		Label label = new Label(group, SWT.NONE);
		label.setText("Id");
		Text idTextZone = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
		idTextZone.setText(id);

		// Description
		label = new Label(group, SWT.NONE);
		label.setText("Description");
		Text descriptionTextZone = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
		descriptionTextZone.setText(description);

		// Turn true rules
		if (turnTrueRules != null && turnTrueRules.size() > 0) {
			label = new Label(group, SWT.NONE);
			label.setText("Turn true rules");
			Text referencesTextZone = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
			gridData = new GridData(SWT.FILL, SWT.FILL, true, true);

			referencesTextZone.setText("");
			for (String ref : turnTrueRules) {
				referencesTextZone.append(ref + "\n");
			}
		}

		// Turn true rules
		if (turnFalseRules != null && turnFalseRules.size() > 0) {
			label = new Label(group, SWT.NONE);
			label.setText("Turn true rules");
			Text referencesTextZone = new Text(group, SWT.READ_ONLY | SWT.WRAP | SWT.MULTI | SWT.BORDER);
			gridData = new GridData(SWT.FILL, SWT.FILL, true, true);

			referencesTextZone.setText("");
			for (String ref : turnFalseRules) {
				referencesTextZone.append(ref + "\n");
			}
		}

		// Scan Inner Transformation rules

		label = new Label(group, SWT.NONE);
		label.setText("Scan inner transformation");
		gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		Button scan = new Button(group, SWT.PUSH);
		scan.setText("Scan");
		// scan.addListener(SWT.Selection, new Listener() {
		//
		// @Override
		// public void handleEvent(Event event) {
		// ctrl.displayScanResult(ctx);
		// }
		// });
		label = new Label(group, SWT.NONE);
		label.setText("Transform model");

		Button execute = new Button(group, SWT.PUSH);
		execute.setText("Execute transfo");
		execute.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				ctrl.executeInnerTransfo(transfo);
			}
		});

	}

	private String getCharacteristicName(TestCharacteristicType characType) {
		if (characType instanceof NecessaryCondition)
			return "Necessary";
		else if (characType instanceof SufficientCondition)
			return "Sufficient";
		else if (characType instanceof Period_Sustainability)
			return "Period Sustainable";
		else if (characType instanceof Deadline_Sustainability)
			return "Deadline Sustainable";
		else if (characType instanceof ExecutionTime_Sustainability)
			return "Execution-Time Sustainable";
		else if (characType instanceof Jitter_Sustainability)
			return "Jitter Sustainable";
		return "";
	}

	@Override
	protected boolean isResizable() {
		return true;
	}
}