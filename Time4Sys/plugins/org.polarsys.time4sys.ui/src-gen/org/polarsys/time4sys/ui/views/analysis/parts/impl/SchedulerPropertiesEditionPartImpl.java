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
package org.polarsys.time4sys.ui.views.analysis.parts.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

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

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.SchedulerPropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class SchedulerPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SchedulerPropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer policyKind;
	protected ReferencesTable scheduledElements;
	protected List<ViewerFilter> scheduledElementsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> scheduledElementsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer usedBy;
	protected ReferencesTable requiredParameters;
	protected List<ViewerFilter> requiredParametersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> requiredParametersFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer parent_;
	protected ReferencesTable resourceParameterValue;
	protected List<ViewerFilter> resourceParameterValueBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resourceParameterValueFilters = new ArrayList<ViewerFilter>();
	protected Text preferredPolicy;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public SchedulerPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * @generated
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
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
	public void createControls(Composite view) { 
		CompositionSequence schedulerStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = schedulerStep.addStep(AnalysisViewsRepository.Scheduler.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.Scheduler.Properties.name);
		propertiesStep.addStep(AnalysisViewsRepository.Scheduler.Properties.policyKind);
		propertiesStep.addStep(AnalysisViewsRepository.Scheduler.Properties.scheduledElements);
		propertiesStep.addStep(AnalysisViewsRepository.Scheduler.Properties.usedBy);
		propertiesStep.addStep(AnalysisViewsRepository.Scheduler.Properties.requiredParameters);
		propertiesStep.addStep(AnalysisViewsRepository.Scheduler.Properties.parent_);
		propertiesStep.addStep(AnalysisViewsRepository.Scheduler.Properties.resourceParameterValue);
		propertiesStep.addStep(AnalysisViewsRepository.Scheduler.Properties.preferredPolicy);
		
		
		composer = new PartComposer(schedulerStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.Scheduler.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == AnalysisViewsRepository.Scheduler.Properties.name) {
					return createNameText(parent);
				}
				if (key == AnalysisViewsRepository.Scheduler.Properties.policyKind) {
					return createPolicyKindEMFComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.Scheduler.Properties.scheduledElements) {
					return createScheduledElementsAdvancedReferencesTable(parent);
				}
				if (key == AnalysisViewsRepository.Scheduler.Properties.usedBy) {
					return createUsedByFlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.Scheduler.Properties.requiredParameters) {
					return createRequiredParametersAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.Scheduler.Properties.parent_) {
					return createParent_FlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.Scheduler.Properties.resourceParameterValue) {
					return createResourceParameterValueAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.Scheduler.Properties.preferredPolicy) {
					return createPreferredPolicyText(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * @generated
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(AnalysisMessages.SchedulerPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @generated
	 */
	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Scheduler.Properties.name, AnalysisMessages.SchedulerPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, AnalysisViewsRepository.Scheduler.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Scheduler.Properties.name, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createPolicyKindEMFComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Scheduler.Properties.policyKind, AnalysisMessages.SchedulerPropertiesEditionPart_PolicyKindLabel);
		policyKind = new EMFComboViewer(parent);
		policyKind.setContentProvider(new ArrayContentProvider());
		policyKind.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData policyKindData = new GridData(GridData.FILL_HORIZONTAL);
		policyKind.getCombo().setLayoutData(policyKindData);
		policyKind.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	@generated
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.policyKind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPolicyKind()));
			}

		});
		policyKind.setID(AnalysisViewsRepository.Scheduler.Properties.policyKind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Scheduler.Properties.policyKind, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPolicyKindEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	protected Composite createScheduledElementsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(AnalysisViewsRepository.Scheduler.Properties.scheduledElements, AnalysisMessages.SchedulerPropertiesEditionPart_ScheduledElementsLabel);		 
		this.scheduledElements = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addScheduledElements(); }
			public void handleEdit(EObject element) { editScheduledElements(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveScheduledElements(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromScheduledElements(element); }
			public void navigateTo(EObject element) { }
		});
		this.scheduledElements.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Scheduler.Properties.scheduledElements, AnalysisViewsRepository.SWT_KIND));
		this.scheduledElements.createControls(parent);
		this.scheduledElements.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.scheduledElements, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData scheduledElementsData = new GridData(GridData.FILL_HORIZONTAL);
		scheduledElementsData.horizontalSpan = 3;
		this.scheduledElements.setLayoutData(scheduledElementsData);
		this.scheduledElements.disableMove();
		scheduledElements.setID(AnalysisViewsRepository.Scheduler.Properties.scheduledElements);
		scheduledElements.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @generated
	 */
	protected void addScheduledElements() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(scheduledElements.getInput(), scheduledElementsFilters, scheduledElementsBusinessFilters,
		"scheduledElements", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.scheduledElements,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				scheduledElements.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * @generated
	 */
	protected void moveScheduledElements(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.scheduledElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		scheduledElements.refresh();
	}

	/**
	 * @generated
	 */
	protected void removeFromScheduledElements(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.scheduledElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		scheduledElements.refresh();
	}

	/**
	 * @generated
	 */
	protected void editScheduledElements(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				scheduledElements.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createUsedByFlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Scheduler.Properties.usedBy, AnalysisMessages.SchedulerPropertiesEditionPart_UsedByLabel);
		usedBy = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Scheduler.Properties.usedBy, AnalysisViewsRepository.SWT_KIND));
		usedBy.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		usedBy.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.usedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getUsedBy()));
			}

		});
		GridData usedByData = new GridData(GridData.FILL_HORIZONTAL);
		usedBy.setLayoutData(usedByData);
		usedBy.setID(AnalysisViewsRepository.Scheduler.Properties.usedBy);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Scheduler.Properties.usedBy, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createUsedByFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createRequiredParametersAdvancedTableComposition(Composite parent) {
		this.requiredParameters = new ReferencesTable(getDescription(AnalysisViewsRepository.Scheduler.Properties.requiredParameters, AnalysisMessages.SchedulerPropertiesEditionPart_RequiredParametersLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.requiredParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				requiredParameters.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.requiredParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				requiredParameters.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.requiredParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				requiredParameters.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.requiredParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				requiredParameters.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.requiredParametersFilters) {
			this.requiredParameters.addFilter(filter);
		}
		this.requiredParameters.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Scheduler.Properties.requiredParameters, AnalysisViewsRepository.SWT_KIND));
		this.requiredParameters.createControls(parent);
		this.requiredParameters.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.requiredParameters, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData requiredParametersData = new GridData(GridData.FILL_HORIZONTAL);
		requiredParametersData.horizontalSpan = 3;
		this.requiredParameters.setLayoutData(requiredParametersData);
		this.requiredParameters.setLowerBound(0);
		this.requiredParameters.setUpperBound(-1);
		requiredParameters.setID(AnalysisViewsRepository.Scheduler.Properties.requiredParameters);
		requiredParameters.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createRequiredParametersAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createParent_FlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Scheduler.Properties.parent_, AnalysisMessages.SchedulerPropertiesEditionPart_Parent_Label);
		parent_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Scheduler.Properties.parent_, AnalysisViewsRepository.SWT_KIND));
		parent_.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parent_.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.parent_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParent_()));
			}

		});
		GridData parent_Data = new GridData(GridData.FILL_HORIZONTAL);
		parent_.setLayoutData(parent_Data);
		parent_.setID(AnalysisViewsRepository.Scheduler.Properties.parent_);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Scheduler.Properties.parent_, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createParent_FlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createResourceParameterValueAdvancedTableComposition(Composite parent) {
		this.resourceParameterValue = new ReferencesTable(getDescription(AnalysisViewsRepository.Scheduler.Properties.resourceParameterValue, AnalysisMessages.SchedulerPropertiesEditionPart_ResourceParameterValueLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.resourceParameterValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				resourceParameterValue.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.resourceParameterValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				resourceParameterValue.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.resourceParameterValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				resourceParameterValue.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.resourceParameterValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				resourceParameterValue.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.resourceParameterValueFilters) {
			this.resourceParameterValue.addFilter(filter);
		}
		this.resourceParameterValue.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Scheduler.Properties.resourceParameterValue, AnalysisViewsRepository.SWT_KIND));
		this.resourceParameterValue.createControls(parent);
		this.resourceParameterValue.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.resourceParameterValue, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resourceParameterValueData = new GridData(GridData.FILL_HORIZONTAL);
		resourceParameterValueData.horizontalSpan = 3;
		this.resourceParameterValue.setLayoutData(resourceParameterValueData);
		this.resourceParameterValue.setLowerBound(0);
		this.resourceParameterValue.setUpperBound(-1);
		resourceParameterValue.setID(AnalysisViewsRepository.Scheduler.Properties.resourceParameterValue);
		resourceParameterValue.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createResourceParameterValueAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createPreferredPolicyText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Scheduler.Properties.preferredPolicy, AnalysisMessages.SchedulerPropertiesEditionPart_PreferredPolicyLabel);
		preferredPolicy = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData preferredPolicyData = new GridData(GridData.FILL_HORIZONTAL);
		preferredPolicy.setLayoutData(preferredPolicyData);
		preferredPolicy.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.preferredPolicy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, preferredPolicy.getText()));
			}

		});
		preferredPolicy.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerPropertiesEditionPartImpl.this, AnalysisViewsRepository.Scheduler.Properties.preferredPolicy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, preferredPolicy.getText()));
				}
			}

		});
		EditingUtils.setID(preferredPolicy, AnalysisViewsRepository.Scheduler.Properties.preferredPolicy);
		EditingUtils.setEEFtype(preferredPolicy, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Scheduler.Properties.preferredPolicy, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPreferredPolicyText

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * @generated
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Scheduler.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(AnalysisMessages.Scheduler_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#getPolicyKind()
	 * @generated
	 */
	public Enumerator getPolicyKind() {
		Enumerator selection = (Enumerator) ((StructuredSelection) policyKind.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#initPolicyKind(Object input, Enumerator current)
	 */
	public void initPolicyKind(Object input, Enumerator current) {
		policyKind.setInput(input);
		policyKind.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Scheduler.Properties.policyKind);
		if (eefElementEditorReadOnlyState && policyKind.isEnabled()) {
			policyKind.setEnabled(false);
			policyKind.setToolTipText(AnalysisMessages.Scheduler_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !policyKind.isEnabled()) {
			policyKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#setPolicyKind(Enumerator newValue)
	 * @generated
	 */
	public void setPolicyKind(Enumerator newValue) {
		policyKind.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Scheduler.Properties.policyKind);
		if (eefElementEditorReadOnlyState && policyKind.isEnabled()) {
			policyKind.setEnabled(false);
			policyKind.setToolTipText(AnalysisMessages.Scheduler_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !policyKind.isEnabled()) {
			policyKind.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#initScheduledElements(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initScheduledElements(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		scheduledElements.setContentProvider(contentProvider);
		scheduledElements.setInput(settings);
		scheduledElementsBusinessFilters.clear();
		scheduledElementsFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Scheduler.Properties.scheduledElements);
		if (eefElementEditorReadOnlyState && scheduledElements.getTable().isEnabled()) {
			scheduledElements.setEnabled(false);
			scheduledElements.setToolTipText(AnalysisMessages.Scheduler_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scheduledElements.getTable().isEnabled()) {
			scheduledElements.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#updateScheduledElements()
	 * @generated
	 */
	public void updateScheduledElements() {
	scheduledElements.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#addFilterScheduledElements(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToScheduledElements(ViewerFilter filter) {
		scheduledElementsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#addBusinessFilterScheduledElements(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToScheduledElements(ViewerFilter filter) {
		scheduledElementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#isContainedInScheduledElementsTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInScheduledElementsTable(EObject element) {
		return ((ReferencesTableSettings)scheduledElements.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#getUsedBy()
	 * @generated
	 */
	public EObject getUsedBy() {
		if (usedBy.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) usedBy.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#initUsedBy(EObjectFlatComboSettings)
	 */
	public void initUsedBy(EObjectFlatComboSettings settings) {
		usedBy.setInput(settings);
		if (current != null) {
			usedBy.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Scheduler.Properties.usedBy);
		if (eefElementEditorReadOnlyState && usedBy.isEnabled()) {
			usedBy.setEnabled(false);
			usedBy.setToolTipText(AnalysisMessages.Scheduler_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usedBy.isEnabled()) {
			usedBy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#setUsedBy(EObject newValue)
	 * @generated
	 */
	public void setUsedBy(EObject newValue) {
		if (newValue != null) {
			usedBy.setSelection(new StructuredSelection(newValue));
		} else {
			usedBy.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Scheduler.Properties.usedBy);
		if (eefElementEditorReadOnlyState && usedBy.isEnabled()) {
			usedBy.setEnabled(false);
			usedBy.setToolTipText(AnalysisMessages.Scheduler_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usedBy.isEnabled()) {
			usedBy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#setUsedByButtonMode(ButtonsModeEnum newValue)
	 */
	public void setUsedByButtonMode(ButtonsModeEnum newValue) {
		usedBy.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#addFilterUsedBy(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToUsedBy(ViewerFilter filter) {
		usedBy.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#addBusinessFilterUsedBy(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToUsedBy(ViewerFilter filter) {
		usedBy.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#initRequiredParameters(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initRequiredParameters(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		requiredParameters.setContentProvider(contentProvider);
		requiredParameters.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Scheduler.Properties.requiredParameters);
		if (eefElementEditorReadOnlyState && requiredParameters.isEnabled()) {
			requiredParameters.setEnabled(false);
			requiredParameters.setToolTipText(AnalysisMessages.Scheduler_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !requiredParameters.isEnabled()) {
			requiredParameters.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#updateRequiredParameters()
	 * @generated
	 */
	public void updateRequiredParameters() {
	requiredParameters.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#addFilterRequiredParameters(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToRequiredParameters(ViewerFilter filter) {
		requiredParametersFilters.add(filter);
		if (this.requiredParameters != null) {
			this.requiredParameters.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#addBusinessFilterRequiredParameters(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToRequiredParameters(ViewerFilter filter) {
		requiredParametersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#isContainedInRequiredParametersTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInRequiredParametersTable(EObject element) {
		return ((ReferencesTableSettings)requiredParameters.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#getParent_()
	 * @generated
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#initParent_(EObjectFlatComboSettings)
	 */
	public void initParent_(EObjectFlatComboSettings settings) {
		parent_.setInput(settings);
		if (current != null) {
			parent_.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Scheduler.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.Scheduler_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#setParent_(EObject newValue)
	 * @generated
	 */
	public void setParent_(EObject newValue) {
		if (newValue != null) {
			parent_.setSelection(new StructuredSelection(newValue));
		} else {
			parent_.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Scheduler.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.Scheduler_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#setParent_ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue) {
		parent_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#addFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToParent_(ViewerFilter filter) {
		parent_.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#addBusinessFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToParent_(ViewerFilter filter) {
		parent_.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#initResourceParameterValue(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initResourceParameterValue(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resourceParameterValue.setContentProvider(contentProvider);
		resourceParameterValue.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Scheduler.Properties.resourceParameterValue);
		if (eefElementEditorReadOnlyState && resourceParameterValue.isEnabled()) {
			resourceParameterValue.setEnabled(false);
			resourceParameterValue.setToolTipText(AnalysisMessages.Scheduler_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resourceParameterValue.isEnabled()) {
			resourceParameterValue.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#updateResourceParameterValue()
	 * @generated
	 */
	public void updateResourceParameterValue() {
	resourceParameterValue.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#addFilterResourceParameterValue(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToResourceParameterValue(ViewerFilter filter) {
		resourceParameterValueFilters.add(filter);
		if (this.resourceParameterValue != null) {
			this.resourceParameterValue.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#addBusinessFilterResourceParameterValue(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToResourceParameterValue(ViewerFilter filter) {
		resourceParameterValueBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#isContainedInResourceParameterValueTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInResourceParameterValueTable(EObject element) {
		return ((ReferencesTableSettings)resourceParameterValue.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#getPreferredPolicy()
	 * @generated
	 */
	public String getPreferredPolicy() {
		return preferredPolicy.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerPropertiesEditionPart#setPreferredPolicy(String newValue)
	 * @generated
	 */
	public void setPreferredPolicy(String newValue) {
		if (newValue != null) {
			preferredPolicy.setText(newValue);
		} else {
			preferredPolicy.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Scheduler.Properties.preferredPolicy);
		if (eefElementEditorReadOnlyState && preferredPolicy.isEnabled()) {
			preferredPolicy.setEnabled(false);
			preferredPolicy.setToolTipText(AnalysisMessages.Scheduler_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !preferredPolicy.isEnabled()) {
			preferredPolicy.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return AnalysisMessages.Scheduler_Part_Title;
	}



}
