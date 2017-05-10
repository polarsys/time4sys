/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 * Generated with Acceleo
 */
package org.polarsys.time4sys.ui.views.gqam.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.polarsys.time4sys.ui.views.gqam.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.gqam.parts.GqamViewsRepository;
import org.polarsys.time4sys.ui.views.gqam.providers.GqamMessages;

// End of user code

/**
 * 
 * 
 */
public class GeneralPropertiesEditionPartImpl extends CompositePropertiesEditionPart
		implements ISWTPropertiesEditionPart, GeneralPropertiesEditionPart {

	protected Text name;
	protected Text msgSize;
	protected Text referenceName;
	protected Button isSchedulable;
	protected Button isAtomic;
	protected EMFComboViewer connectorKind;
	protected Text repetitions;
	protected Text probability;
	protected Text priority;
	protected Text occurences;
	protected Text schedulabilitySlack;
	protected Text serviceCount;
	protected Text resUnits;
	protected EObjectFlatComboViewer root;
	protected EObjectFlatComboViewer parentStep;
	protected EObjectFlatComboViewer reference;
	protected EObjectFlatComboViewer relRes;
	protected EObjectFlatComboViewer scenario;
	protected EObjectFlatComboViewer childScenario;
	protected EObjectFlatComboViewer parent_;
	protected EObjectFlatComboViewer inputRel;
	protected EObjectFlatComboViewer outputRel;
	protected EObjectFlatComboViewer endToEndScenario;
	protected EObjectFlatComboViewer acqRes;
	protected EObjectFlatComboViewer concurRes;
	protected EObjectFlatComboViewer effect;
	protected EObjectFlatComboViewer comRes;
	protected ReferencesTable predec;
	protected List<ViewerFilter> predecBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> predecFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable succes;
	protected List<ViewerFilter> succesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> succesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable steps;
	protected List<ViewerFilter> stepsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> stepsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable connectors;
	protected List<ViewerFilter> connectorsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> connectorsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable cause;
	protected List<ViewerFilter> causeBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> causeFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable endToEndStimuli;
	protected List<ViewerFilter> endToEndStimuliBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> endToEndStimuliFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable behavior;
	protected List<ViewerFilter> behaviorBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> behaviorFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable demand;
	protected List<ViewerFilter> demandBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> demandFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable references;
	protected List<ViewerFilter> referencesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> referencesFilters = new ArrayList<ViewerFilter>();

	/**
	 * Default constructor
	 * 
	 * @param editionComponent
	 *            the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GeneralPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 *      createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 *      createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) {
		CompositionSequence generalStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = generalStep.addStep(GqamViewsRepository.General.Properties.class);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.name);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.msgSize);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.referenceName);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.isSchedulable);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.isAtomic);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.connectorKind);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.repetitions);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.probability);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.priority);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.occurences);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.schedulabilitySlack);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.serviceCount);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.resUnits);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.root);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.parentStep);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.reference);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.relRes);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.scenario);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.childScenario);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.parent_);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.inputRel);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.outputRel);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.endToEndScenario);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.acqRes);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.concurRes);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.effect);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.comRes);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.predec);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.succes);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.steps);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.connectors);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.cause);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.endToEndStimuli);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.behavior);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.demand);
		propertiesStep.addStep(GqamViewsRepository.General.Properties.references);

		composer = new PartComposer(generalStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == GqamViewsRepository.General.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == GqamViewsRepository.General.Properties.name) {
					return createNameText(parent);
				}
				if (key == GqamViewsRepository.General.Properties.msgSize) {
					return createMsgSizeText(parent);
				}
				if (key == GqamViewsRepository.General.Properties.referenceName) {
					return createReferenceNameText(parent);
				}
				if (key == GqamViewsRepository.General.Properties.isSchedulable) {
					return createIsSchedulableCheckbox(parent);
				}
				if (key == GqamViewsRepository.General.Properties.isAtomic) {
					return createIsAtomicCheckbox(parent);
				}
				if (key == GqamViewsRepository.General.Properties.connectorKind) {
					return createConnectorKindEMFComboViewer(parent);
				}
				if (key == GqamViewsRepository.General.Properties.repetitions) {
					return createRepetitionsText(parent);
				}
				if (key == GqamViewsRepository.General.Properties.probability) {
					return createProbabilityText(parent);
				}
				if (key == GqamViewsRepository.General.Properties.priority) {
					return createPriorityText(parent);
				}
				if (key == GqamViewsRepository.General.Properties.occurences) {
					return createOccurencesText(parent);
				}
				if (key == GqamViewsRepository.General.Properties.schedulabilitySlack) {
					return createSchedulabilitySlackText(parent);
				}
				if (key == GqamViewsRepository.General.Properties.serviceCount) {
					return createServiceCountText(parent);
				}
				if (key == GqamViewsRepository.General.Properties.resUnits) {
					return createResUnitsText(parent);
				}
				if (key == GqamViewsRepository.General.Properties.root) {
					return createRootFlatComboViewer(parent);
				}
				if (key == GqamViewsRepository.General.Properties.parentStep) {
					return createParentStepFlatComboViewer(parent);
				}
				if (key == GqamViewsRepository.General.Properties.reference) {
					return createReferenceFlatComboViewer(parent);
				}
				if (key == GqamViewsRepository.General.Properties.relRes) {
					return createRelResFlatComboViewer(parent);
				}
				if (key == GqamViewsRepository.General.Properties.scenario) {
					return createScenarioFlatComboViewer(parent);
				}
				if (key == GqamViewsRepository.General.Properties.childScenario) {
					return createChildScenarioFlatComboViewer(parent);
				}
				if (key == GqamViewsRepository.General.Properties.parent_) {
					return createParent_FlatComboViewer(parent);
				}
				if (key == GqamViewsRepository.General.Properties.inputRel) {
					return createInputRelFlatComboViewer(parent);
				}
				if (key == GqamViewsRepository.General.Properties.outputRel) {
					return createOutputRelFlatComboViewer(parent);
				}
				if (key == GqamViewsRepository.General.Properties.endToEndScenario) {
					return createEndToEndScenarioFlatComboViewer(parent);
				}
				if (key == GqamViewsRepository.General.Properties.acqRes) {
					return createAcqResFlatComboViewer(parent);
				}
				if (key == GqamViewsRepository.General.Properties.concurRes) {
					return createConcurResFlatComboViewer(parent);
				}
				if (key == GqamViewsRepository.General.Properties.effect) {
					return createEffectFlatComboViewer(parent);
				}
				if (key == GqamViewsRepository.General.Properties.comRes) {
					return createComResFlatComboViewer(parent);
				}
				if (key == GqamViewsRepository.General.Properties.predec) {
					return createPredecAdvancedReferencesTable(parent);
				}
				if (key == GqamViewsRepository.General.Properties.succes) {
					return createSuccesAdvancedReferencesTable(parent);
				}
				if (key == GqamViewsRepository.General.Properties.steps) {
					return createStepsAdvancedTableComposition(parent);
				}
				if (key == GqamViewsRepository.General.Properties.connectors) {
					return createConnectorsAdvancedTableComposition(parent);
				}
				if (key == GqamViewsRepository.General.Properties.cause) {
					return createCauseAdvancedReferencesTable(parent);
				}
				if (key == GqamViewsRepository.General.Properties.endToEndStimuli) {
					return createEndToEndStimuliAdvancedReferencesTable(parent);
				}
				if (key == GqamViewsRepository.General.Properties.behavior) {
					return createBehaviorAdvancedTableComposition(parent);
				}
				if (key == GqamViewsRepository.General.Properties.demand) {
					return createDemandAdvancedTableComposition(parent);
				}
				if (key == GqamViewsRepository.General.Properties.references) {
					return createReferencesAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(GqamMessages.GeneralPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	protected Composite createNameText(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.name,
				GqamMessages.GeneralPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.name,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, GqamViewsRepository.General.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.name, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	protected Composite createMsgSizeText(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.msgSize,
				GqamMessages.GeneralPropertiesEditionPart_MsgSizeLabel);
		msgSize = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData msgSizeData = new GridData(GridData.FILL_HORIZONTAL);
		msgSize.setLayoutData(msgSizeData);
		msgSize.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.msgSize,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, msgSize.getText()));
			}

		});
		msgSize.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.msgSize,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, msgSize.getText()));
				}
			}

		});
		EditingUtils.setID(msgSize, GqamViewsRepository.General.Properties.msgSize);
		EditingUtils.setEEFtype(msgSize, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.msgSize, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createMsgSizeText

		// End of user code
		return parent;
	}

	protected Composite createReferenceNameText(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.referenceName,
				GqamMessages.GeneralPropertiesEditionPart_ReferenceNameLabel);
		referenceName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData referenceNameData = new GridData(GridData.FILL_HORIZONTAL);
		referenceName.setLayoutData(referenceNameData);
		referenceName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.referenceName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, referenceName.getText()));
			}

		});
		referenceName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this,
								GqamViewsRepository.General.Properties.referenceName, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, referenceName.getText()));
				}
			}

		});
		EditingUtils.setID(referenceName, GqamViewsRepository.General.Properties.referenceName);
		EditingUtils.setEEFtype(referenceName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				GqamViewsRepository.General.Properties.referenceName, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createReferenceNameText

		// End of user code
		return parent;
	}

	protected Composite createIsSchedulableCheckbox(Composite parent) {
		isSchedulable = new Button(parent, SWT.CHECK);
		isSchedulable.setText(getDescription(GqamViewsRepository.General.Properties.isSchedulable,
				GqamMessages.GeneralPropertiesEditionPart_IsSchedulableLabel));
		isSchedulable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GqamViewsRepository.General.Properties.isSchedulable, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isSchedulable.getSelection())));
			}

		});
		GridData isSchedulableData = new GridData(GridData.FILL_HORIZONTAL);
		isSchedulableData.horizontalSpan = 2;
		isSchedulable.setLayoutData(isSchedulableData);
		EditingUtils.setID(isSchedulable, GqamViewsRepository.General.Properties.isSchedulable);
		EditingUtils.setEEFtype(isSchedulable, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				GqamViewsRepository.General.Properties.isSchedulable, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsSchedulableCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsAtomicCheckbox(Composite parent) {
		isAtomic = new Button(parent, SWT.CHECK);
		isAtomic.setText(getDescription(GqamViewsRepository.General.Properties.isAtomic,
				GqamMessages.GeneralPropertiesEditionPart_IsAtomicLabel));
		isAtomic.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GqamViewsRepository.General.Properties.isAtomic, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isAtomic.getSelection())));
			}

		});
		GridData isAtomicData = new GridData(GridData.FILL_HORIZONTAL);
		isAtomicData.horizontalSpan = 2;
		isAtomic.setLayoutData(isAtomicData);
		EditingUtils.setID(isAtomic, GqamViewsRepository.General.Properties.isAtomic);
		EditingUtils.setEEFtype(isAtomic, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.isAtomic, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsAtomicCheckbox

		// End of user code
		return parent;
	}

	protected Composite createConnectorKindEMFComboViewer(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.connectorKind,
				GqamMessages.GeneralPropertiesEditionPart_ConnectorKindLabel);
		connectorKind = new EMFComboViewer(parent);
		connectorKind.setContentProvider(new ArrayContentProvider());
		connectorKind
				.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData connectorKindData = new GridData(GridData.FILL_HORIZONTAL);
		connectorKind.getCombo().setLayoutData(connectorKindData);
		connectorKind.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.connectorKind,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getConnectorKind()));
			}

		});
		connectorKind.setID(GqamViewsRepository.General.Properties.connectorKind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				GqamViewsRepository.General.Properties.connectorKind, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createConnectorKindEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createRepetitionsText(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.repetitions,
				GqamMessages.GeneralPropertiesEditionPart_RepetitionsLabel);
		repetitions = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData repetitionsData = new GridData(GridData.FILL_HORIZONTAL);
		repetitions.setLayoutData(repetitionsData);
		repetitions.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.repetitions,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, repetitions.getText()));
			}

		});
		repetitions.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this,
								GqamViewsRepository.General.Properties.repetitions, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, repetitions.getText()));
				}
			}

		});
		EditingUtils.setID(repetitions, GqamViewsRepository.General.Properties.repetitions);
		EditingUtils.setEEFtype(repetitions, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				GqamViewsRepository.General.Properties.repetitions, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createRepetitionsText

		// End of user code
		return parent;
	}

	protected Composite createProbabilityText(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.probability,
				GqamMessages.GeneralPropertiesEditionPart_ProbabilityLabel);
		probability = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData probabilityData = new GridData(GridData.FILL_HORIZONTAL);
		probability.setLayoutData(probabilityData);
		probability.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.probability,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, probability.getText()));
			}

		});
		probability.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this,
								GqamViewsRepository.General.Properties.probability, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, probability.getText()));
				}
			}

		});
		EditingUtils.setID(probability, GqamViewsRepository.General.Properties.probability);
		EditingUtils.setEEFtype(probability, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				GqamViewsRepository.General.Properties.probability, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createProbabilityText

		// End of user code
		return parent;
	}

	protected Composite createPriorityText(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.priority,
				GqamMessages.GeneralPropertiesEditionPart_PriorityLabel);
		priority = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData priorityData = new GridData(GridData.FILL_HORIZONTAL);
		priority.setLayoutData(priorityData);
		priority.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.priority,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, priority.getText()));
			}

		});
		priority.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.priority,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, priority.getText()));
				}
			}

		});
		EditingUtils.setID(priority, GqamViewsRepository.General.Properties.priority);
		EditingUtils.setEEFtype(priority, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.priority, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createPriorityText

		// End of user code
		return parent;
	}

	protected Composite createOccurencesText(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.occurences,
				GqamMessages.GeneralPropertiesEditionPart_OccurencesLabel);
		occurences = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData occurencesData = new GridData(GridData.FILL_HORIZONTAL);
		occurences.setLayoutData(occurencesData);
		occurences.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.occurences,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, occurences.getText()));
			}

		});
		occurences.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this,
								GqamViewsRepository.General.Properties.occurences, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, occurences.getText()));
				}
			}

		});
		EditingUtils.setID(occurences, GqamViewsRepository.General.Properties.occurences);
		EditingUtils.setEEFtype(occurences, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.occurences, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createOccurencesText

		// End of user code
		return parent;
	}

	protected Composite createSchedulabilitySlackText(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.schedulabilitySlack,
				GqamMessages.GeneralPropertiesEditionPart_SchedulabilitySlackLabel);
		schedulabilitySlack = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData schedulabilitySlackData = new GridData(GridData.FILL_HORIZONTAL);
		schedulabilitySlack.setLayoutData(schedulabilitySlackData);
		schedulabilitySlack.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this,
							GqamViewsRepository.General.Properties.schedulabilitySlack, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, schedulabilitySlack.getText()));
			}

		});
		schedulabilitySlack.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GqamViewsRepository.General.Properties.schedulabilitySlack,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
										schedulabilitySlack.getText()));
				}
			}

		});
		EditingUtils.setID(schedulabilitySlack, GqamViewsRepository.General.Properties.schedulabilitySlack);
		EditingUtils.setEEFtype(schedulabilitySlack, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				GqamViewsRepository.General.Properties.schedulabilitySlack, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createSchedulabilitySlackText

		// End of user code
		return parent;
	}

	protected Composite createServiceCountText(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.serviceCount,
				GqamMessages.GeneralPropertiesEditionPart_ServiceCountLabel);
		serviceCount = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData serviceCountData = new GridData(GridData.FILL_HORIZONTAL);
		serviceCount.setLayoutData(serviceCountData);
		serviceCount.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.serviceCount,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, serviceCount.getText()));
			}

		});
		serviceCount.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this,
								GqamViewsRepository.General.Properties.serviceCount, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, serviceCount.getText()));
				}
			}

		});
		EditingUtils.setID(serviceCount, GqamViewsRepository.General.Properties.serviceCount);
		EditingUtils.setEEFtype(serviceCount, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				GqamViewsRepository.General.Properties.serviceCount, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createServiceCountText

		// End of user code
		return parent;
	}

	protected Composite createResUnitsText(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.resUnits,
				GqamMessages.GeneralPropertiesEditionPart_ResUnitsLabel);
		resUnits = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData resUnitsData = new GridData(GridData.FILL_HORIZONTAL);
		resUnits.setLayoutData(resUnitsData);
		resUnits.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.resUnits,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resUnits.getText()));
			}

		});
		resUnits.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.resUnits,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resUnits.getText()));
				}
			}

		});
		EditingUtils.setID(resUnits, GqamViewsRepository.General.Properties.resUnits);
		EditingUtils.setEEFtype(resUnits, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.resUnits, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createResUnitsText

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createRootFlatComboViewer(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.root,
				GqamMessages.GeneralPropertiesEditionPart_RootLabel);
		root = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GqamViewsRepository.General.Properties.root, GqamViewsRepository.SWT_KIND));
		root.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		root.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.root,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRoot()));
			}

		});
		GridData rootData = new GridData(GridData.FILL_HORIZONTAL);
		root.setLayoutData(rootData);
		root.setID(GqamViewsRepository.General.Properties.root);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.root, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createRootFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createParentStepFlatComboViewer(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.parentStep,
				GqamMessages.GeneralPropertiesEditionPart_ParentStepLabel);
		parentStep = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GqamViewsRepository.General.Properties.parentStep, GqamViewsRepository.SWT_KIND));
		parentStep.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parentStep.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.parentStep,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParentStep()));
			}

		});
		GridData parentStepData = new GridData(GridData.FILL_HORIZONTAL);
		parentStep.setLayoutData(parentStepData);
		parentStep.setID(GqamViewsRepository.General.Properties.parentStep);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.parentStep, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createParentStepFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createReferenceFlatComboViewer(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.reference,
				GqamMessages.GeneralPropertiesEditionPart_ReferenceLabel);
		reference = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GqamViewsRepository.General.Properties.reference, GqamViewsRepository.SWT_KIND));
		reference.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		reference.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.reference,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getReference()));
			}

		});
		GridData referenceData = new GridData(GridData.FILL_HORIZONTAL);
		reference.setLayoutData(referenceData);
		reference.setID(GqamViewsRepository.General.Properties.reference);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.reference, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createReferenceFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createRelResFlatComboViewer(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.relRes,
				GqamMessages.GeneralPropertiesEditionPart_RelResLabel);
		relRes = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GqamViewsRepository.General.Properties.relRes, GqamViewsRepository.SWT_KIND));
		relRes.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		relRes.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.relRes,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRelRes()));
			}

		});
		GridData relResData = new GridData(GridData.FILL_HORIZONTAL);
		relRes.setLayoutData(relResData);
		relRes.setID(GqamViewsRepository.General.Properties.relRes);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.relRes, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createRelResFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createScenarioFlatComboViewer(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.scenario,
				GqamMessages.GeneralPropertiesEditionPart_ScenarioLabel);
		scenario = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GqamViewsRepository.General.Properties.scenario, GqamViewsRepository.SWT_KIND));
		scenario.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		scenario.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.scenario,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getScenario()));
			}

		});
		GridData scenarioData = new GridData(GridData.FILL_HORIZONTAL);
		scenario.setLayoutData(scenarioData);
		scenario.setID(GqamViewsRepository.General.Properties.scenario);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.scenario, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createScenarioFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createChildScenarioFlatComboViewer(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.childScenario,
				GqamMessages.GeneralPropertiesEditionPart_ChildScenarioLabel);
		childScenario = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GqamViewsRepository.General.Properties.childScenario, GqamViewsRepository.SWT_KIND));
		childScenario.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		childScenario.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.childScenario,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getChildScenario()));
			}

		});
		GridData childScenarioData = new GridData(GridData.FILL_HORIZONTAL);
		childScenario.setLayoutData(childScenarioData);
		childScenario.setID(GqamViewsRepository.General.Properties.childScenario);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				GqamViewsRepository.General.Properties.childScenario, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createChildScenarioFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createParent_FlatComboViewer(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.parent_,
				GqamMessages.GeneralPropertiesEditionPart_Parent_Label);
		parent_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GqamViewsRepository.General.Properties.parent_, GqamViewsRepository.SWT_KIND));
		parent_.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parent_.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.parent_,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParent_()));
			}

		});
		GridData parent_Data = new GridData(GridData.FILL_HORIZONTAL);
		parent_.setLayoutData(parent_Data);
		parent_.setID(GqamViewsRepository.General.Properties.parent_);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.parent_, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createParent_FlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createInputRelFlatComboViewer(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.inputRel,
				GqamMessages.GeneralPropertiesEditionPart_InputRelLabel);
		inputRel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GqamViewsRepository.General.Properties.inputRel, GqamViewsRepository.SWT_KIND));
		inputRel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		inputRel.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.inputRel,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getInputRel()));
			}

		});
		GridData inputRelData = new GridData(GridData.FILL_HORIZONTAL);
		inputRel.setLayoutData(inputRelData);
		inputRel.setID(GqamViewsRepository.General.Properties.inputRel);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.inputRel, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createInputRelFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createOutputRelFlatComboViewer(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.outputRel,
				GqamMessages.GeneralPropertiesEditionPart_OutputRelLabel);
		outputRel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GqamViewsRepository.General.Properties.outputRel, GqamViewsRepository.SWT_KIND));
		outputRel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		outputRel.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.outputRel,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOutputRel()));
			}

		});
		GridData outputRelData = new GridData(GridData.FILL_HORIZONTAL);
		outputRel.setLayoutData(outputRelData);
		outputRel.setID(GqamViewsRepository.General.Properties.outputRel);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.outputRel, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createOutputRelFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createEndToEndScenarioFlatComboViewer(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.endToEndScenario,
				GqamMessages.GeneralPropertiesEditionPart_EndToEndScenarioLabel);
		endToEndScenario = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GqamViewsRepository.General.Properties.endToEndScenario, GqamViewsRepository.SWT_KIND));
		endToEndScenario.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		endToEndScenario.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.endToEndScenario,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getEndToEndScenario()));
			}

		});
		GridData endToEndScenarioData = new GridData(GridData.FILL_HORIZONTAL);
		endToEndScenario.setLayoutData(endToEndScenarioData);
		endToEndScenario.setID(GqamViewsRepository.General.Properties.endToEndScenario);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				GqamViewsRepository.General.Properties.endToEndScenario, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createEndToEndScenarioFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createAcqResFlatComboViewer(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.acqRes,
				GqamMessages.GeneralPropertiesEditionPart_AcqResLabel);
		acqRes = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GqamViewsRepository.General.Properties.acqRes, GqamViewsRepository.SWT_KIND));
		acqRes.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		acqRes.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.acqRes,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getAcqRes()));
			}

		});
		GridData acqResData = new GridData(GridData.FILL_HORIZONTAL);
		acqRes.setLayoutData(acqResData);
		acqRes.setID(GqamViewsRepository.General.Properties.acqRes);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.acqRes, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createAcqResFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createConcurResFlatComboViewer(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.concurRes,
				GqamMessages.GeneralPropertiesEditionPart_ConcurResLabel);
		concurRes = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GqamViewsRepository.General.Properties.concurRes, GqamViewsRepository.SWT_KIND));
		concurRes.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		concurRes.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.concurRes,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getConcurRes()));
			}

		});
		GridData concurResData = new GridData(GridData.FILL_HORIZONTAL);
		concurRes.setLayoutData(concurResData);
		concurRes.setID(GqamViewsRepository.General.Properties.concurRes);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.concurRes, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createConcurResFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createEffectFlatComboViewer(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.effect,
				GqamMessages.GeneralPropertiesEditionPart_EffectLabel);
		effect = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GqamViewsRepository.General.Properties.effect, GqamViewsRepository.SWT_KIND));
		effect.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		effect.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.effect,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getEffect()));
			}

		});
		GridData effectData = new GridData(GridData.FILL_HORIZONTAL);
		effect.setLayoutData(effectData);
		effect.setID(GqamViewsRepository.General.Properties.effect);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.effect, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createEffectFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createComResFlatComboViewer(Composite parent) {
		createDescription(parent, GqamViewsRepository.General.Properties.comRes,
				GqamMessages.GeneralPropertiesEditionPart_ComResLabel);
		comRes = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GqamViewsRepository.General.Properties.comRes, GqamViewsRepository.SWT_KIND));
		comRes.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		comRes.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.comRes,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getComRes()));
			}

		});
		GridData comResData = new GridData(GridData.FILL_HORIZONTAL);
		comRes.setLayoutData(comResData);
		comRes.setID(GqamViewsRepository.General.Properties.comRes);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.comRes, GqamViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createComResFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createPredecAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GqamViewsRepository.General.Properties.predec,
				GqamMessages.GeneralPropertiesEditionPart_PredecLabel);
		this.predec = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addPredec();
			}

			public void handleEdit(EObject element) {
				editPredec(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				movePredec(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromPredec(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.predec.setHelpText(propertiesEditionComponent.getHelpContent(GqamViewsRepository.General.Properties.predec,
				GqamViewsRepository.SWT_KIND));
		this.predec.createControls(parent);
		this.predec.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GqamViewsRepository.General.Properties.predec, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData predecData = new GridData(GridData.FILL_HORIZONTAL);
		predecData.horizontalSpan = 3;
		this.predec.setLayoutData(predecData);
		this.predec.disableMove();
		predec.setID(GqamViewsRepository.General.Properties.predec);
		predec.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addPredec() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(predec.getInput(), predecFilters,
				predecBusinessFilters, "predec", propertiesEditionComponent.getEditingContext().getAdapterFactory(),
				current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.predec,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				predec.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void movePredec(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.predec,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		predec.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromPredec(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.predec,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		predec.refresh();
	}

	/**
	 * 
	 */
	protected void editPredec(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				predec.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSuccesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GqamViewsRepository.General.Properties.succes,
				GqamMessages.GeneralPropertiesEditionPart_SuccesLabel);
		this.succes = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addSucces();
			}

			public void handleEdit(EObject element) {
				editSucces(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveSucces(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromSucces(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.succes.setHelpText(propertiesEditionComponent.getHelpContent(GqamViewsRepository.General.Properties.succes,
				GqamViewsRepository.SWT_KIND));
		this.succes.createControls(parent);
		this.succes.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GqamViewsRepository.General.Properties.succes, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData succesData = new GridData(GridData.FILL_HORIZONTAL);
		succesData.horizontalSpan = 3;
		this.succes.setLayoutData(succesData);
		this.succes.disableMove();
		succes.setID(GqamViewsRepository.General.Properties.succes);
		succes.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSucces() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(succes.getInput(), succesFilters,
				succesBusinessFilters, "succes", propertiesEditionComponent.getEditingContext().getAdapterFactory(),
				current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.succes,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				succes.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSucces(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.succes,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		succes.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSucces(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.succes,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		succes.refresh();
	}

	/**
	 * 
	 */
	protected void editSucces(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				succes.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createStepsAdvancedTableComposition(Composite parent) {
		this.steps = new ReferencesTable(getDescription(GqamViewsRepository.General.Properties.steps,
				GqamMessages.GeneralPropertiesEditionPart_StepsLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.steps,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						steps.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.steps,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						steps.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.steps,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						steps.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.steps,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						steps.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.stepsFilters) {
			this.steps.addFilter(filter);
		}
		this.steps.setHelpText(propertiesEditionComponent.getHelpContent(GqamViewsRepository.General.Properties.steps,
				GqamViewsRepository.SWT_KIND));
		this.steps.createControls(parent);
		this.steps.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GqamViewsRepository.General.Properties.steps, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData stepsData = new GridData(GridData.FILL_HORIZONTAL);
		stepsData.horizontalSpan = 3;
		this.steps.setLayoutData(stepsData);
		this.steps.setLowerBound(0);
		this.steps.setUpperBound(10);
		steps.setID(GqamViewsRepository.General.Properties.steps);
		steps.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createStepsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createConnectorsAdvancedTableComposition(Composite parent) {
		this.connectors = new ReferencesTable(getDescription(GqamViewsRepository.General.Properties.connectors,
				GqamMessages.GeneralPropertiesEditionPart_ConnectorsLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GqamViewsRepository.General.Properties.connectors,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						connectors.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GqamViewsRepository.General.Properties.connectors,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						connectors.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GqamViewsRepository.General.Properties.connectors,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						connectors.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GqamViewsRepository.General.Properties.connectors,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						connectors.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.connectorsFilters) {
			this.connectors.addFilter(filter);
		}
		this.connectors.setHelpText(propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.connectors, GqamViewsRepository.SWT_KIND));
		this.connectors.createControls(parent);
		this.connectors.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GqamViewsRepository.General.Properties.connectors, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData connectorsData = new GridData(GridData.FILL_HORIZONTAL);
		connectorsData.horizontalSpan = 3;
		this.connectors.setLayoutData(connectorsData);
		this.connectors.setLowerBound(0);
		this.connectors.setUpperBound(10);
		connectors.setID(GqamViewsRepository.General.Properties.connectors);
		connectors.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createConnectorsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createCauseAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GqamViewsRepository.General.Properties.cause,
				GqamMessages.GeneralPropertiesEditionPart_CauseLabel);
		this.cause = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addCause();
			}

			public void handleEdit(EObject element) {
				editCause(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveCause(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromCause(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.cause.setHelpText(propertiesEditionComponent.getHelpContent(GqamViewsRepository.General.Properties.cause,
				GqamViewsRepository.SWT_KIND));
		this.cause.createControls(parent);
		this.cause.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GqamViewsRepository.General.Properties.cause, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData causeData = new GridData(GridData.FILL_HORIZONTAL);
		causeData.horizontalSpan = 3;
		this.cause.setLayoutData(causeData);
		this.cause.disableMove();
		cause.setID(GqamViewsRepository.General.Properties.cause);
		cause.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addCause() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(cause.getInput(), causeFilters,
				causeBusinessFilters, "cause", propertiesEditionComponent.getEditingContext().getAdapterFactory(),
				current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.cause,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				cause.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCause(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.cause,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		cause.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCause(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.cause,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		cause.refresh();
	}

	/**
	 * 
	 */
	protected void editCause(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				cause.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createEndToEndStimuliAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GqamViewsRepository.General.Properties.endToEndStimuli,
				GqamMessages.GeneralPropertiesEditionPart_EndToEndStimuliLabel);
		this.endToEndStimuli = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addEndToEndStimuli();
			}

			public void handleEdit(EObject element) {
				editEndToEndStimuli(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveEndToEndStimuli(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromEndToEndStimuli(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.endToEndStimuli.setHelpText(propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.endToEndStimuli, GqamViewsRepository.SWT_KIND));
		this.endToEndStimuli.createControls(parent);
		this.endToEndStimuli.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this,
							GqamViewsRepository.General.Properties.endToEndStimuli, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData endToEndStimuliData = new GridData(GridData.FILL_HORIZONTAL);
		endToEndStimuliData.horizontalSpan = 3;
		this.endToEndStimuli.setLayoutData(endToEndStimuliData);
		this.endToEndStimuli.disableMove();
		endToEndStimuli.setID(GqamViewsRepository.General.Properties.endToEndStimuli);
		endToEndStimuli.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addEndToEndStimuli() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(endToEndStimuli.getInput(),
				endToEndStimuliFilters, endToEndStimuliBusinessFilters, "endToEndStimuli",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GqamViewsRepository.General.Properties.endToEndStimuli,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				endToEndStimuli.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveEndToEndStimuli(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.endToEndStimuli,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		endToEndStimuli.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromEndToEndStimuli(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.endToEndStimuli,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		endToEndStimuli.refresh();
	}

	/**
	 * 
	 */
	protected void editEndToEndStimuli(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				endToEndStimuli.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createBehaviorAdvancedTableComposition(Composite parent) {
		this.behavior = new ReferencesTable(getDescription(GqamViewsRepository.General.Properties.behavior,
				GqamMessages.GeneralPropertiesEditionPart_BehaviorLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.behavior,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						behavior.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.behavior,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						behavior.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.behavior,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						behavior.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.behavior,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						behavior.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.behaviorFilters) {
			this.behavior.addFilter(filter);
		}
		this.behavior.setHelpText(propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.behavior, GqamViewsRepository.SWT_KIND));
		this.behavior.createControls(parent);
		this.behavior.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GqamViewsRepository.General.Properties.behavior, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData behaviorData = new GridData(GridData.FILL_HORIZONTAL);
		behaviorData.horizontalSpan = 3;
		this.behavior.setLayoutData(behaviorData);
		this.behavior.setLowerBound(1);
		this.behavior.setUpperBound(-1);
		behavior.setID(GqamViewsRepository.General.Properties.behavior);
		behavior.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createBehaviorAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDemandAdvancedTableComposition(Composite parent) {
		this.demand = new ReferencesTable(getDescription(GqamViewsRepository.General.Properties.demand,
				GqamMessages.GeneralPropertiesEditionPart_DemandLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.demand,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						demand.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.demand,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						demand.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.demand,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						demand.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GqamViewsRepository.General.Properties.demand,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						demand.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.demandFilters) {
			this.demand.addFilter(filter);
		}
		this.demand.setHelpText(propertiesEditionComponent.getHelpContent(GqamViewsRepository.General.Properties.demand,
				GqamViewsRepository.SWT_KIND));
		this.demand.createControls(parent);
		this.demand.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GqamViewsRepository.General.Properties.demand, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData demandData = new GridData(GridData.FILL_HORIZONTAL);
		demandData.horizontalSpan = 3;
		this.demand.setLayoutData(demandData);
		this.demand.setLowerBound(1);
		this.demand.setUpperBound(-1);
		demand.setID(GqamViewsRepository.General.Properties.demand);
		demand.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createDemandAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createReferencesAdvancedTableComposition(Composite parent) {
		this.references = new ReferencesTable(getDescription(GqamViewsRepository.General.Properties.references,
				GqamMessages.GeneralPropertiesEditionPart_ReferencesLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GqamViewsRepository.General.Properties.references,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						references.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GqamViewsRepository.General.Properties.references,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						references.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GqamViewsRepository.General.Properties.references,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						references.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GqamViewsRepository.General.Properties.references,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						references.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.referencesFilters) {
			this.references.addFilter(filter);
		}
		this.references.setHelpText(propertiesEditionComponent
				.getHelpContent(GqamViewsRepository.General.Properties.references, GqamViewsRepository.SWT_KIND));
		this.references.createControls(parent);
		this.references.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GqamViewsRepository.General.Properties.references, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData referencesData = new GridData(GridData.FILL_HORIZONTAL);
		referencesData.horizontalSpan = 3;
		this.references.setLayoutData(referencesData);
		this.references.setLowerBound(0);
		this.references.setUpperBound(-1);
		references.setID(GqamViewsRepository.General.Properties.references);
		references.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createReferencesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization

		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setName(String
	 *      newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getMsgSize()
	 * 
	 */
	public String getMsgSize() {
		return msgSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setMsgSize(String
	 *      newValue)
	 * 
	 */
	public void setMsgSize(String newValue) {
		if (newValue != null) {
			msgSize.setText(newValue);
		} else {
			msgSize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.msgSize);
		if (eefElementEditorReadOnlyState && msgSize.isEnabled()) {
			msgSize.setEnabled(false);
			msgSize.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !msgSize.isEnabled()) {
			msgSize.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getReferenceName()
	 * 
	 */
	public String getReferenceName() {
		return referenceName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setReferenceName(String
	 *      newValue)
	 * 
	 */
	public void setReferenceName(String newValue) {
		if (newValue != null) {
			referenceName.setText(newValue);
		} else {
			referenceName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.referenceName);
		if (eefElementEditorReadOnlyState && referenceName.isEnabled()) {
			referenceName.setEnabled(false);
			referenceName.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !referenceName.isEnabled()) {
			referenceName.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getIsSchedulable()
	 * 
	 */
	public Boolean getIsSchedulable() {
		return Boolean.valueOf(isSchedulable.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setIsSchedulable(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsSchedulable(Boolean newValue) {
		if (newValue != null) {
			isSchedulable.setSelection(newValue.booleanValue());
		} else {
			isSchedulable.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.isSchedulable);
		if (eefElementEditorReadOnlyState && isSchedulable.isEnabled()) {
			isSchedulable.setEnabled(false);
			isSchedulable.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isSchedulable.isEnabled()) {
			isSchedulable.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getIsAtomic()
	 * 
	 */
	public Boolean getIsAtomic() {
		return Boolean.valueOf(isAtomic.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setIsAtomic(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsAtomic(Boolean newValue) {
		if (newValue != null) {
			isAtomic.setSelection(newValue.booleanValue());
		} else {
			isAtomic.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.isAtomic);
		if (eefElementEditorReadOnlyState && isAtomic.isEnabled()) {
			isAtomic.setEnabled(false);
			isAtomic.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isAtomic.isEnabled()) {
			isAtomic.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getConnectorKind()
	 * 
	 */
	public Enumerator getConnectorKind() {
		Enumerator selection = (Enumerator) ((StructuredSelection) connectorKind.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initConnectorKind(Object
	 *      input, Enumerator current)
	 */
	public void initConnectorKind(Object input, Enumerator current) {
		connectorKind.setInput(input);
		connectorKind.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.connectorKind);
		if (eefElementEditorReadOnlyState && connectorKind.isEnabled()) {
			connectorKind.setEnabled(false);
			connectorKind.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectorKind.isEnabled()) {
			connectorKind.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setConnectorKind(Enumerator
	 *      newValue)
	 * 
	 */
	public void setConnectorKind(Enumerator newValue) {
		connectorKind.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.connectorKind);
		if (eefElementEditorReadOnlyState && connectorKind.isEnabled()) {
			connectorKind.setEnabled(false);
			connectorKind.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectorKind.isEnabled()) {
			connectorKind.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getRepetitions()
	 * 
	 */
	public String getRepetitions() {
		return repetitions.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setRepetitions(String
	 *      newValue)
	 * 
	 */
	public void setRepetitions(String newValue) {
		if (newValue != null) {
			repetitions.setText(newValue);
		} else {
			repetitions.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.repetitions);
		if (eefElementEditorReadOnlyState && repetitions.isEnabled()) {
			repetitions.setEnabled(false);
			repetitions.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !repetitions.isEnabled()) {
			repetitions.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getProbability()
	 * 
	 */
	public String getProbability() {
		return probability.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setProbability(String
	 *      newValue)
	 * 
	 */
	public void setProbability(String newValue) {
		if (newValue != null) {
			probability.setText(newValue);
		} else {
			probability.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.probability);
		if (eefElementEditorReadOnlyState && probability.isEnabled()) {
			probability.setEnabled(false);
			probability.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !probability.isEnabled()) {
			probability.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getPriority()
	 * 
	 */
	public String getPriority() {
		return priority.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setPriority(String
	 *      newValue)
	 * 
	 */
	public void setPriority(String newValue) {
		if (newValue != null) {
			priority.setText(newValue);
		} else {
			priority.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.priority);
		if (eefElementEditorReadOnlyState && priority.isEnabled()) {
			priority.setEnabled(false);
			priority.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !priority.isEnabled()) {
			priority.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getOccurences()
	 * 
	 */
	public String getOccurences() {
		return occurences.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setOccurences(String
	 *      newValue)
	 * 
	 */
	public void setOccurences(String newValue) {
		if (newValue != null) {
			occurences.setText(newValue);
		} else {
			occurences.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.occurences);
		if (eefElementEditorReadOnlyState && occurences.isEnabled()) {
			occurences.setEnabled(false);
			occurences.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !occurences.isEnabled()) {
			occurences.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getSchedulabilitySlack()
	 * 
	 */
	public String getSchedulabilitySlack() {
		return schedulabilitySlack.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setSchedulabilitySlack(String
	 *      newValue)
	 * 
	 */
	public void setSchedulabilitySlack(String newValue) {
		if (newValue != null) {
			schedulabilitySlack.setText(newValue);
		} else {
			schedulabilitySlack.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.schedulabilitySlack);
		if (eefElementEditorReadOnlyState && schedulabilitySlack.isEnabled()) {
			schedulabilitySlack.setEnabled(false);
			schedulabilitySlack.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !schedulabilitySlack.isEnabled()) {
			schedulabilitySlack.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getServiceCount()
	 * 
	 */
	public String getServiceCount() {
		return serviceCount.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setServiceCount(String
	 *      newValue)
	 * 
	 */
	public void setServiceCount(String newValue) {
		if (newValue != null) {
			serviceCount.setText(newValue);
		} else {
			serviceCount.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.serviceCount);
		if (eefElementEditorReadOnlyState && serviceCount.isEnabled()) {
			serviceCount.setEnabled(false);
			serviceCount.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !serviceCount.isEnabled()) {
			serviceCount.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getResUnits()
	 * 
	 */
	public String getResUnits() {
		return resUnits.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setResUnits(String
	 *      newValue)
	 * 
	 */
	public void setResUnits(String newValue) {
		if (newValue != null) {
			resUnits.setText(newValue);
		} else {
			resUnits.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.resUnits);
		if (eefElementEditorReadOnlyState && resUnits.isEnabled()) {
			resUnits.setEnabled(false);
			resUnits.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resUnits.isEnabled()) {
			resUnits.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getRoot()
	 * 
	 */
	public EObject getRoot() {
		if (root.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) root.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initRoot(EObjectFlatComboSettings)
	 */
	public void initRoot(EObjectFlatComboSettings settings) {
		root.setInput(settings);
		if (current != null) {
			root.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.root);
		if (eefElementEditorReadOnlyState && root.isEnabled()) {
			root.setEnabled(false);
			root.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !root.isEnabled()) {
			root.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setRoot(EObject
	 *      newValue)
	 * 
	 */
	public void setRoot(EObject newValue) {
		if (newValue != null) {
			root.setSelection(new StructuredSelection(newValue));
		} else {
			root.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.root);
		if (eefElementEditorReadOnlyState && root.isEnabled()) {
			root.setEnabled(false);
			root.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !root.isEnabled()) {
			root.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setRootButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setRootButtonMode(ButtonsModeEnum newValue) {
		root.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterRoot(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToRoot(ViewerFilter filter) {
		root.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterRoot(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToRoot(ViewerFilter filter) {
		root.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getParentStep()
	 * 
	 */
	public EObject getParentStep() {
		if (parentStep.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) parentStep.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initParentStep(EObjectFlatComboSettings)
	 */
	public void initParentStep(EObjectFlatComboSettings settings) {
		parentStep.setInput(settings);
		if (current != null) {
			parentStep.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.parentStep);
		if (eefElementEditorReadOnlyState && parentStep.isEnabled()) {
			parentStep.setEnabled(false);
			parentStep.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentStep.isEnabled()) {
			parentStep.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setParentStep(EObject
	 *      newValue)
	 * 
	 */
	public void setParentStep(EObject newValue) {
		if (newValue != null) {
			parentStep.setSelection(new StructuredSelection(newValue));
		} else {
			parentStep.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.parentStep);
		if (eefElementEditorReadOnlyState && parentStep.isEnabled()) {
			parentStep.setEnabled(false);
			parentStep.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parentStep.isEnabled()) {
			parentStep.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setParentStepButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setParentStepButtonMode(ButtonsModeEnum newValue) {
		parentStep.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterParentStep(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToParentStep(ViewerFilter filter) {
		parentStep.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterParentStep(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToParentStep(ViewerFilter filter) {
		parentStep.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getReference()
	 * 
	 */
	public EObject getReference() {
		if (reference.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) reference.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initReference(EObjectFlatComboSettings)
	 */
	public void initReference(EObjectFlatComboSettings settings) {
		reference.setInput(settings);
		if (current != null) {
			reference.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.reference);
		if (eefElementEditorReadOnlyState && reference.isEnabled()) {
			reference.setEnabled(false);
			reference.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !reference.isEnabled()) {
			reference.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setReference(EObject
	 *      newValue)
	 * 
	 */
	public void setReference(EObject newValue) {
		if (newValue != null) {
			reference.setSelection(new StructuredSelection(newValue));
		} else {
			reference.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.reference);
		if (eefElementEditorReadOnlyState && reference.isEnabled()) {
			reference.setEnabled(false);
			reference.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !reference.isEnabled()) {
			reference.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setReferenceButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setReferenceButtonMode(ButtonsModeEnum newValue) {
		reference.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterReference(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToReference(ViewerFilter filter) {
		reference.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterReference(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToReference(ViewerFilter filter) {
		reference.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getRelRes()
	 * 
	 */
	public EObject getRelRes() {
		if (relRes.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) relRes.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initRelRes(EObjectFlatComboSettings)
	 */
	public void initRelRes(EObjectFlatComboSettings settings) {
		relRes.setInput(settings);
		if (current != null) {
			relRes.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.relRes);
		if (eefElementEditorReadOnlyState && relRes.isEnabled()) {
			relRes.setEnabled(false);
			relRes.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !relRes.isEnabled()) {
			relRes.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setRelRes(EObject
	 *      newValue)
	 * 
	 */
	public void setRelRes(EObject newValue) {
		if (newValue != null) {
			relRes.setSelection(new StructuredSelection(newValue));
		} else {
			relRes.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.relRes);
		if (eefElementEditorReadOnlyState && relRes.isEnabled()) {
			relRes.setEnabled(false);
			relRes.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !relRes.isEnabled()) {
			relRes.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setRelResButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setRelResButtonMode(ButtonsModeEnum newValue) {
		relRes.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterRelRes(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToRelRes(ViewerFilter filter) {
		relRes.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterRelRes(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToRelRes(ViewerFilter filter) {
		relRes.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getScenario()
	 * 
	 */
	public EObject getScenario() {
		if (scenario.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) scenario.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initScenario(EObjectFlatComboSettings)
	 */
	public void initScenario(EObjectFlatComboSettings settings) {
		scenario.setInput(settings);
		if (current != null) {
			scenario.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.scenario);
		if (eefElementEditorReadOnlyState && scenario.isEnabled()) {
			scenario.setEnabled(false);
			scenario.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scenario.isEnabled()) {
			scenario.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setScenario(EObject
	 *      newValue)
	 * 
	 */
	public void setScenario(EObject newValue) {
		if (newValue != null) {
			scenario.setSelection(new StructuredSelection(newValue));
		} else {
			scenario.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.scenario);
		if (eefElementEditorReadOnlyState && scenario.isEnabled()) {
			scenario.setEnabled(false);
			scenario.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scenario.isEnabled()) {
			scenario.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setScenarioButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setScenarioButtonMode(ButtonsModeEnum newValue) {
		scenario.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterScenario(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToScenario(ViewerFilter filter) {
		scenario.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterScenario(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToScenario(ViewerFilter filter) {
		scenario.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getChildScenario()
	 * 
	 */
	public EObject getChildScenario() {
		if (childScenario.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) childScenario.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initChildScenario(EObjectFlatComboSettings)
	 */
	public void initChildScenario(EObjectFlatComboSettings settings) {
		childScenario.setInput(settings);
		if (current != null) {
			childScenario.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.childScenario);
		if (eefElementEditorReadOnlyState && childScenario.isEnabled()) {
			childScenario.setEnabled(false);
			childScenario.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !childScenario.isEnabled()) {
			childScenario.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setChildScenario(EObject
	 *      newValue)
	 * 
	 */
	public void setChildScenario(EObject newValue) {
		if (newValue != null) {
			childScenario.setSelection(new StructuredSelection(newValue));
		} else {
			childScenario.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.childScenario);
		if (eefElementEditorReadOnlyState && childScenario.isEnabled()) {
			childScenario.setEnabled(false);
			childScenario.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !childScenario.isEnabled()) {
			childScenario.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setChildScenarioButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setChildScenarioButtonMode(ButtonsModeEnum newValue) {
		childScenario.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterChildScenario(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToChildScenario(ViewerFilter filter) {
		childScenario.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterChildScenario(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToChildScenario(ViewerFilter filter) {
		childScenario.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getParent_()
	 * 
	 */
	public EObject getParent_() {
		if (parent_.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) parent_.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initParent_(EObjectFlatComboSettings)
	 */
	public void initParent_(EObjectFlatComboSettings settings) {
		parent_.setInput(settings);
		if (current != null) {
			parent_.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setParent_(EObject
	 *      newValue)
	 * 
	 */
	public void setParent_(EObject newValue) {
		if (newValue != null) {
			parent_.setSelection(new StructuredSelection(newValue));
		} else {
			parent_.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setParent_ButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue) {
		parent_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterParent_(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToParent_(ViewerFilter filter) {
		parent_.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterParent_(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToParent_(ViewerFilter filter) {
		parent_.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getInputRel()
	 * 
	 */
	public EObject getInputRel() {
		if (inputRel.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) inputRel.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initInputRel(EObjectFlatComboSettings)
	 */
	public void initInputRel(EObjectFlatComboSettings settings) {
		inputRel.setInput(settings);
		if (current != null) {
			inputRel.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.inputRel);
		if (eefElementEditorReadOnlyState && inputRel.isEnabled()) {
			inputRel.setEnabled(false);
			inputRel.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inputRel.isEnabled()) {
			inputRel.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setInputRel(EObject
	 *      newValue)
	 * 
	 */
	public void setInputRel(EObject newValue) {
		if (newValue != null) {
			inputRel.setSelection(new StructuredSelection(newValue));
		} else {
			inputRel.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.inputRel);
		if (eefElementEditorReadOnlyState && inputRel.isEnabled()) {
			inputRel.setEnabled(false);
			inputRel.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inputRel.isEnabled()) {
			inputRel.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setInputRelButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setInputRelButtonMode(ButtonsModeEnum newValue) {
		inputRel.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterInputRel(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToInputRel(ViewerFilter filter) {
		inputRel.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterInputRel(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToInputRel(ViewerFilter filter) {
		inputRel.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getOutputRel()
	 * 
	 */
	public EObject getOutputRel() {
		if (outputRel.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) outputRel.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initOutputRel(EObjectFlatComboSettings)
	 */
	public void initOutputRel(EObjectFlatComboSettings settings) {
		outputRel.setInput(settings);
		if (current != null) {
			outputRel.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.outputRel);
		if (eefElementEditorReadOnlyState && outputRel.isEnabled()) {
			outputRel.setEnabled(false);
			outputRel.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !outputRel.isEnabled()) {
			outputRel.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setOutputRel(EObject
	 *      newValue)
	 * 
	 */
	public void setOutputRel(EObject newValue) {
		if (newValue != null) {
			outputRel.setSelection(new StructuredSelection(newValue));
		} else {
			outputRel.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.outputRel);
		if (eefElementEditorReadOnlyState && outputRel.isEnabled()) {
			outputRel.setEnabled(false);
			outputRel.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !outputRel.isEnabled()) {
			outputRel.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setOutputRelButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setOutputRelButtonMode(ButtonsModeEnum newValue) {
		outputRel.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterOutputRel(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToOutputRel(ViewerFilter filter) {
		outputRel.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterOutputRel(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOutputRel(ViewerFilter filter) {
		outputRel.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getEndToEndScenario()
	 * 
	 */
	public EObject getEndToEndScenario() {
		if (endToEndScenario.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) endToEndScenario.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initEndToEndScenario(EObjectFlatComboSettings)
	 */
	public void initEndToEndScenario(EObjectFlatComboSettings settings) {
		endToEndScenario.setInput(settings);
		if (current != null) {
			endToEndScenario.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.endToEndScenario);
		if (eefElementEditorReadOnlyState && endToEndScenario.isEnabled()) {
			endToEndScenario.setEnabled(false);
			endToEndScenario.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !endToEndScenario.isEnabled()) {
			endToEndScenario.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setEndToEndScenario(EObject
	 *      newValue)
	 * 
	 */
	public void setEndToEndScenario(EObject newValue) {
		if (newValue != null) {
			endToEndScenario.setSelection(new StructuredSelection(newValue));
		} else {
			endToEndScenario.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.endToEndScenario);
		if (eefElementEditorReadOnlyState && endToEndScenario.isEnabled()) {
			endToEndScenario.setEnabled(false);
			endToEndScenario.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !endToEndScenario.isEnabled()) {
			endToEndScenario.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setEndToEndScenarioButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setEndToEndScenarioButtonMode(ButtonsModeEnum newValue) {
		endToEndScenario.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterEndToEndScenario(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToEndToEndScenario(ViewerFilter filter) {
		endToEndScenario.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterEndToEndScenario(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToEndToEndScenario(ViewerFilter filter) {
		endToEndScenario.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getAcqRes()
	 * 
	 */
	public EObject getAcqRes() {
		if (acqRes.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) acqRes.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initAcqRes(EObjectFlatComboSettings)
	 */
	public void initAcqRes(EObjectFlatComboSettings settings) {
		acqRes.setInput(settings);
		if (current != null) {
			acqRes.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.acqRes);
		if (eefElementEditorReadOnlyState && acqRes.isEnabled()) {
			acqRes.setEnabled(false);
			acqRes.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !acqRes.isEnabled()) {
			acqRes.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setAcqRes(EObject
	 *      newValue)
	 * 
	 */
	public void setAcqRes(EObject newValue) {
		if (newValue != null) {
			acqRes.setSelection(new StructuredSelection(newValue));
		} else {
			acqRes.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.acqRes);
		if (eefElementEditorReadOnlyState && acqRes.isEnabled()) {
			acqRes.setEnabled(false);
			acqRes.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !acqRes.isEnabled()) {
			acqRes.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setAcqResButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setAcqResButtonMode(ButtonsModeEnum newValue) {
		acqRes.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterAcqRes(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToAcqRes(ViewerFilter filter) {
		acqRes.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterAcqRes(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToAcqRes(ViewerFilter filter) {
		acqRes.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getConcurRes()
	 * 
	 */
	public EObject getConcurRes() {
		if (concurRes.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) concurRes.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initConcurRes(EObjectFlatComboSettings)
	 */
	public void initConcurRes(EObjectFlatComboSettings settings) {
		concurRes.setInput(settings);
		if (current != null) {
			concurRes.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.concurRes);
		if (eefElementEditorReadOnlyState && concurRes.isEnabled()) {
			concurRes.setEnabled(false);
			concurRes.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !concurRes.isEnabled()) {
			concurRes.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setConcurRes(EObject
	 *      newValue)
	 * 
	 */
	public void setConcurRes(EObject newValue) {
		if (newValue != null) {
			concurRes.setSelection(new StructuredSelection(newValue));
		} else {
			concurRes.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.concurRes);
		if (eefElementEditorReadOnlyState && concurRes.isEnabled()) {
			concurRes.setEnabled(false);
			concurRes.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !concurRes.isEnabled()) {
			concurRes.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setConcurResButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setConcurResButtonMode(ButtonsModeEnum newValue) {
		concurRes.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterConcurRes(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToConcurRes(ViewerFilter filter) {
		concurRes.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterConcurRes(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToConcurRes(ViewerFilter filter) {
		concurRes.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getEffect()
	 * 
	 */
	public EObject getEffect() {
		if (effect.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) effect.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initEffect(EObjectFlatComboSettings)
	 */
	public void initEffect(EObjectFlatComboSettings settings) {
		effect.setInput(settings);
		if (current != null) {
			effect.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.effect);
		if (eefElementEditorReadOnlyState && effect.isEnabled()) {
			effect.setEnabled(false);
			effect.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !effect.isEnabled()) {
			effect.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setEffect(EObject
	 *      newValue)
	 * 
	 */
	public void setEffect(EObject newValue) {
		if (newValue != null) {
			effect.setSelection(new StructuredSelection(newValue));
		} else {
			effect.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.effect);
		if (eefElementEditorReadOnlyState && effect.isEnabled()) {
			effect.setEnabled(false);
			effect.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !effect.isEnabled()) {
			effect.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setEffectButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setEffectButtonMode(ButtonsModeEnum newValue) {
		effect.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterEffect(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToEffect(ViewerFilter filter) {
		effect.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterEffect(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToEffect(ViewerFilter filter) {
		effect.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#getComRes()
	 * 
	 */
	public EObject getComRes() {
		if (comRes.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) comRes.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initComRes(EObjectFlatComboSettings)
	 */
	public void initComRes(EObjectFlatComboSettings settings) {
		comRes.setInput(settings);
		if (current != null) {
			comRes.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.comRes);
		if (eefElementEditorReadOnlyState && comRes.isEnabled()) {
			comRes.setEnabled(false);
			comRes.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !comRes.isEnabled()) {
			comRes.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setComRes(EObject
	 *      newValue)
	 * 
	 */
	public void setComRes(EObject newValue) {
		if (newValue != null) {
			comRes.setSelection(new StructuredSelection(newValue));
		} else {
			comRes.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.comRes);
		if (eefElementEditorReadOnlyState && comRes.isEnabled()) {
			comRes.setEnabled(false);
			comRes.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !comRes.isEnabled()) {
			comRes.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#setComResButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setComResButtonMode(ButtonsModeEnum newValue) {
		comRes.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterComRes(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToComRes(ViewerFilter filter) {
		comRes.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterComRes(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToComRes(ViewerFilter filter) {
		comRes.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initPredec(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initPredec(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		predec.setContentProvider(contentProvider);
		predec.setInput(settings);
		predecBusinessFilters.clear();
		predecFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.predec);
		if (eefElementEditorReadOnlyState && predec.getTable().isEnabled()) {
			predec.setEnabled(false);
			predec.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !predec.getTable().isEnabled()) {
			predec.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#updatePredec()
	 * 
	 */
	public void updatePredec() {
		predec.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterPredec(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToPredec(ViewerFilter filter) {
		predecFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterPredec(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToPredec(ViewerFilter filter) {
		predecBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#isContainedInPredecTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInPredecTable(EObject element) {
		return ((ReferencesTableSettings) predec.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initSucces(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSucces(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		succes.setContentProvider(contentProvider);
		succes.setInput(settings);
		succesBusinessFilters.clear();
		succesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.succes);
		if (eefElementEditorReadOnlyState && succes.getTable().isEnabled()) {
			succes.setEnabled(false);
			succes.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !succes.getTable().isEnabled()) {
			succes.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#updateSucces()
	 * 
	 */
	public void updateSucces() {
		succes.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterSucces(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSucces(ViewerFilter filter) {
		succesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterSucces(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSucces(ViewerFilter filter) {
		succesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#isContainedInSuccesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInSuccesTable(EObject element) {
		return ((ReferencesTableSettings) succes.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initSteps(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initSteps(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		steps.setContentProvider(contentProvider);
		steps.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.steps);
		if (eefElementEditorReadOnlyState && steps.isEnabled()) {
			steps.setEnabled(false);
			steps.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !steps.isEnabled()) {
			steps.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#updateSteps()
	 * 
	 */
	public void updateSteps() {
		steps.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterSteps(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSteps(ViewerFilter filter) {
		stepsFilters.add(filter);
		if (this.steps != null) {
			this.steps.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterSteps(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSteps(ViewerFilter filter) {
		stepsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#isContainedInStepsTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInStepsTable(EObject element) {
		return ((ReferencesTableSettings) steps.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initConnectors(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initConnectors(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		connectors.setContentProvider(contentProvider);
		connectors.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.connectors);
		if (eefElementEditorReadOnlyState && connectors.isEnabled()) {
			connectors.setEnabled(false);
			connectors.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !connectors.isEnabled()) {
			connectors.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#updateConnectors()
	 * 
	 */
	public void updateConnectors() {
		connectors.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterConnectors(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToConnectors(ViewerFilter filter) {
		connectorsFilters.add(filter);
		if (this.connectors != null) {
			this.connectors.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterConnectors(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToConnectors(ViewerFilter filter) {
		connectorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#isContainedInConnectorsTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInConnectorsTable(EObject element) {
		return ((ReferencesTableSettings) connectors.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initCause(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCause(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		cause.setContentProvider(contentProvider);
		cause.setInput(settings);
		causeBusinessFilters.clear();
		causeFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.cause);
		if (eefElementEditorReadOnlyState && cause.getTable().isEnabled()) {
			cause.setEnabled(false);
			cause.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !cause.getTable().isEnabled()) {
			cause.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#updateCause()
	 * 
	 */
	public void updateCause() {
		cause.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterCause(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToCause(ViewerFilter filter) {
		causeFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterCause(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToCause(ViewerFilter filter) {
		causeBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#isContainedInCauseTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInCauseTable(EObject element) {
		return ((ReferencesTableSettings) cause.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initEndToEndStimuli(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initEndToEndStimuli(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		endToEndStimuli.setContentProvider(contentProvider);
		endToEndStimuli.setInput(settings);
		endToEndStimuliBusinessFilters.clear();
		endToEndStimuliFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.endToEndStimuli);
		if (eefElementEditorReadOnlyState && endToEndStimuli.getTable().isEnabled()) {
			endToEndStimuli.setEnabled(false);
			endToEndStimuli.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !endToEndStimuli.getTable().isEnabled()) {
			endToEndStimuli.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#updateEndToEndStimuli()
	 * 
	 */
	public void updateEndToEndStimuli() {
		endToEndStimuli.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterEndToEndStimuli(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToEndToEndStimuli(ViewerFilter filter) {
		endToEndStimuliFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterEndToEndStimuli(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToEndToEndStimuli(ViewerFilter filter) {
		endToEndStimuliBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#isContainedInEndToEndStimuliTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInEndToEndStimuliTable(EObject element) {
		return ((ReferencesTableSettings) endToEndStimuli.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initBehavior(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initBehavior(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		behavior.setContentProvider(contentProvider);
		behavior.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.behavior);
		if (eefElementEditorReadOnlyState && behavior.isEnabled()) {
			behavior.setEnabled(false);
			behavior.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !behavior.isEnabled()) {
			behavior.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#updateBehavior()
	 * 
	 */
	public void updateBehavior() {
		behavior.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterBehavior(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToBehavior(ViewerFilter filter) {
		behaviorFilters.add(filter);
		if (this.behavior != null) {
			this.behavior.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterBehavior(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToBehavior(ViewerFilter filter) {
		behaviorBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#isContainedInBehaviorTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInBehaviorTable(EObject element) {
		return ((ReferencesTableSettings) behavior.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initDemand(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initDemand(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		demand.setContentProvider(contentProvider);
		demand.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.demand);
		if (eefElementEditorReadOnlyState && demand.isEnabled()) {
			demand.setEnabled(false);
			demand.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !demand.isEnabled()) {
			demand.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#updateDemand()
	 * 
	 */
	public void updateDemand() {
		demand.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterDemand(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToDemand(ViewerFilter filter) {
		demandFilters.add(filter);
		if (this.demand != null) {
			this.demand.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterDemand(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToDemand(ViewerFilter filter) {
		demandBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#isContainedInDemandTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInDemandTable(EObject element) {
		return ((ReferencesTableSettings) demand.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#initReferences(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initReferences(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		references.setContentProvider(contentProvider);
		references.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GqamViewsRepository.General.Properties.references);
		if (eefElementEditorReadOnlyState && references.isEnabled()) {
			references.setEnabled(false);
			references.setToolTipText(GqamMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !references.isEnabled()) {
			references.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#updateReferences()
	 * 
	 */
	public void updateReferences() {
		references.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addFilterReferences(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToReferences(ViewerFilter filter) {
		referencesFilters.add(filter);
		if (this.references != null) {
			this.references.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#addBusinessFilterReferences(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToReferences(ViewerFilter filter) {
		referencesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.gqam.parts.GeneralPropertiesEditionPart#isContainedInReferencesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInReferencesTable(EObject element) {
		return ((ReferencesTableSettings) references.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return GqamMessages.General_Part_Title;
	}

	// Start of user code additional methods

	// End of user code

}
