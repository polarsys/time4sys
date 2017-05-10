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
import org.polarsys.time4sys.ui.views.analysis.parts.TaskPropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class TaskPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TaskPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable ports;
	protected List<ViewerFilter> portsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> portsFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer behaviorKind;
	protected EObjectFlatComboViewer parent_;
	protected EObjectFlatComboViewer scheduledBy;
	protected Text cET;
	protected ReferencesTable schedulingParameters;
	protected List<ViewerFilter> schedulingParametersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> schedulingParametersFilters = new ArrayList<ViewerFilter>();
	protected Text originalName;
	protected ReferencesTable lockedMutexes;
	protected List<ViewerFilter> lockedMutexesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> lockedMutexesFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer mappedTo;
	protected ReferencesTable fragments;
	protected List<ViewerFilter> fragmentsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> fragmentsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer first;
	protected Text blockingTime;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public TaskPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence taskStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = taskStep.addStep(AnalysisViewsRepository.Task.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.Task.Properties.name);
		propertiesStep.addStep(AnalysisViewsRepository.Task.Properties.ports);
		propertiesStep.addStep(AnalysisViewsRepository.Task.Properties.behaviorKind);
		propertiesStep.addStep(AnalysisViewsRepository.Task.Properties.parent_);
		propertiesStep.addStep(AnalysisViewsRepository.Task.Properties.scheduledBy);
		propertiesStep.addStep(AnalysisViewsRepository.Task.Properties.cET);
		propertiesStep.addStep(AnalysisViewsRepository.Task.Properties.schedulingParameters);
		propertiesStep.addStep(AnalysisViewsRepository.Task.Properties.originalName);
		propertiesStep.addStep(AnalysisViewsRepository.Task.Properties.lockedMutexes);
		propertiesStep.addStep(AnalysisViewsRepository.Task.Properties.mappedTo);
		propertiesStep.addStep(AnalysisViewsRepository.Task.Properties.fragments);
		propertiesStep.addStep(AnalysisViewsRepository.Task.Properties.first);
		propertiesStep.addStep(AnalysisViewsRepository.Task.Properties.blockingTime);
		
		
		composer = new PartComposer(taskStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.Task.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == AnalysisViewsRepository.Task.Properties.name) {
					return createNameText(parent);
				}
				if (key == AnalysisViewsRepository.Task.Properties.ports) {
					return createPortsAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.Task.Properties.behaviorKind) {
					return createBehaviorKindEMFComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.Task.Properties.parent_) {
					return createParent_FlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.Task.Properties.scheduledBy) {
					return createScheduledByFlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.Task.Properties.cET) {
					return createCETText(parent);
				}
				if (key == AnalysisViewsRepository.Task.Properties.schedulingParameters) {
					return createSchedulingParametersAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.Task.Properties.originalName) {
					return createOriginalNameText(parent);
				}
				if (key == AnalysisViewsRepository.Task.Properties.lockedMutexes) {
					return createLockedMutexesAdvancedReferencesTable(parent);
				}
				if (key == AnalysisViewsRepository.Task.Properties.mappedTo) {
					return createMappedToFlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.Task.Properties.fragments) {
					return createFragmentsAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.Task.Properties.first) {
					return createFirstFlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.Task.Properties.blockingTime) {
					return createBlockingTimeText(parent);
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
		propertiesGroup.setText(AnalysisMessages.TaskPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, AnalysisViewsRepository.Task.Properties.name, AnalysisMessages.TaskPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, AnalysisViewsRepository.Task.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Task.Properties.name, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createPortsAdvancedTableComposition(Composite parent) {
		this.ports = new ReferencesTable(getDescription(AnalysisViewsRepository.Task.Properties.ports, AnalysisMessages.TaskPropertiesEditionPart_PortsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ports.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ports.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ports.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ports.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.portsFilters) {
			this.ports.addFilter(filter);
		}
		this.ports.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Task.Properties.ports, AnalysisViewsRepository.SWT_KIND));
		this.ports.createControls(parent);
		this.ports.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.ports, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData portsData = new GridData(GridData.FILL_HORIZONTAL);
		portsData.horizontalSpan = 3;
		this.ports.setLayoutData(portsData);
		this.ports.setLowerBound(0);
		this.ports.setUpperBound(-1);
		ports.setID(AnalysisViewsRepository.Task.Properties.ports);
		ports.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPortsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createBehaviorKindEMFComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Task.Properties.behaviorKind, AnalysisMessages.TaskPropertiesEditionPart_BehaviorKindLabel);
		behaviorKind = new EMFComboViewer(parent);
		behaviorKind.setContentProvider(new ArrayContentProvider());
		behaviorKind.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData behaviorKindData = new GridData(GridData.FILL_HORIZONTAL);
		behaviorKind.getCombo().setLayoutData(behaviorKindData);
		behaviorKind.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	@generated
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.behaviorKind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBehaviorKind()));
			}

		});
		behaviorKind.setID(AnalysisViewsRepository.Task.Properties.behaviorKind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Task.Properties.behaviorKind, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createBehaviorKindEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createParent_FlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Task.Properties.parent_, AnalysisMessages.TaskPropertiesEditionPart_Parent_Label);
		parent_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Task.Properties.parent_, AnalysisViewsRepository.SWT_KIND));
		parent_.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parent_.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.parent_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParent_()));
			}

		});
		GridData parent_Data = new GridData(GridData.FILL_HORIZONTAL);
		parent_.setLayoutData(parent_Data);
		parent_.setID(AnalysisViewsRepository.Task.Properties.parent_);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Task.Properties.parent_, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createParent_FlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createScheduledByFlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Task.Properties.scheduledBy, AnalysisMessages.TaskPropertiesEditionPart_ScheduledByLabel);
		scheduledBy = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Task.Properties.scheduledBy, AnalysisViewsRepository.SWT_KIND));
		scheduledBy.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		scheduledBy.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.scheduledBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getScheduledBy()));
			}

		});
		GridData scheduledByData = new GridData(GridData.FILL_HORIZONTAL);
		scheduledBy.setLayoutData(scheduledByData);
		scheduledBy.setID(AnalysisViewsRepository.Task.Properties.scheduledBy);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Task.Properties.scheduledBy, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createScheduledByFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createCETText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Task.Properties.cET, AnalysisMessages.TaskPropertiesEditionPart_CETLabel);
		cET = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData cETData = new GridData(GridData.FILL_HORIZONTAL);
		cET.setLayoutData(cETData);
		cET.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.cET, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cET.getText()));
			}

		});
		cET.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.cET, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cET.getText()));
				}
			}

		});
		EditingUtils.setID(cET, AnalysisViewsRepository.Task.Properties.cET);
		EditingUtils.setEEFtype(cET, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Task.Properties.cET, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCETText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createSchedulingParametersAdvancedTableComposition(Composite parent) {
		this.schedulingParameters = new ReferencesTable(getDescription(AnalysisViewsRepository.Task.Properties.schedulingParameters, AnalysisMessages.TaskPropertiesEditionPart_SchedulingParametersLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.schedulingParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				schedulingParameters.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.schedulingParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				schedulingParameters.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.schedulingParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				schedulingParameters.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.schedulingParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				schedulingParameters.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.schedulingParametersFilters) {
			this.schedulingParameters.addFilter(filter);
		}
		this.schedulingParameters.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Task.Properties.schedulingParameters, AnalysisViewsRepository.SWT_KIND));
		this.schedulingParameters.createControls(parent);
		this.schedulingParameters.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.schedulingParameters, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData schedulingParametersData = new GridData(GridData.FILL_HORIZONTAL);
		schedulingParametersData.horizontalSpan = 3;
		this.schedulingParameters.setLayoutData(schedulingParametersData);
		this.schedulingParameters.setLowerBound(0);
		this.schedulingParameters.setUpperBound(-1);
		schedulingParameters.setID(AnalysisViewsRepository.Task.Properties.schedulingParameters);
		schedulingParameters.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSchedulingParametersAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createOriginalNameText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Task.Properties.originalName, AnalysisMessages.TaskPropertiesEditionPart_OriginalNameLabel);
		originalName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData originalNameData = new GridData(GridData.FILL_HORIZONTAL);
		originalName.setLayoutData(originalNameData);
		originalName.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.originalName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalName.getText()));
			}

		});
		originalName.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.originalName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalName.getText()));
				}
			}

		});
		EditingUtils.setID(originalName, AnalysisViewsRepository.Task.Properties.originalName);
		EditingUtils.setEEFtype(originalName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Task.Properties.originalName, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOriginalNameText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	protected Composite createLockedMutexesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(AnalysisViewsRepository.Task.Properties.lockedMutexes, AnalysisMessages.TaskPropertiesEditionPart_LockedMutexesLabel);		 
		this.lockedMutexes = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addLockedMutexes(); }
			public void handleEdit(EObject element) { editLockedMutexes(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveLockedMutexes(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromLockedMutexes(element); }
			public void navigateTo(EObject element) { }
		});
		this.lockedMutexes.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Task.Properties.lockedMutexes, AnalysisViewsRepository.SWT_KIND));
		this.lockedMutexes.createControls(parent);
		this.lockedMutexes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.lockedMutexes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData lockedMutexesData = new GridData(GridData.FILL_HORIZONTAL);
		lockedMutexesData.horizontalSpan = 3;
		this.lockedMutexes.setLayoutData(lockedMutexesData);
		this.lockedMutexes.disableMove();
		lockedMutexes.setID(AnalysisViewsRepository.Task.Properties.lockedMutexes);
		lockedMutexes.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @generated
	 */
	protected void addLockedMutexes() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(lockedMutexes.getInput(), lockedMutexesFilters, lockedMutexesBusinessFilters,
		"lockedMutexes", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.lockedMutexes,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				lockedMutexes.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * @generated
	 */
	protected void moveLockedMutexes(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.lockedMutexes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		lockedMutexes.refresh();
	}

	/**
	 * @generated
	 */
	protected void removeFromLockedMutexes(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.lockedMutexes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		lockedMutexes.refresh();
	}

	/**
	 * @generated
	 */
	protected void editLockedMutexes(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				lockedMutexes.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createMappedToFlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Task.Properties.mappedTo, AnalysisMessages.TaskPropertiesEditionPart_MappedToLabel);
		mappedTo = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Task.Properties.mappedTo, AnalysisViewsRepository.SWT_KIND));
		mappedTo.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		mappedTo.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.mappedTo, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getMappedTo()));
			}

		});
		GridData mappedToData = new GridData(GridData.FILL_HORIZONTAL);
		mappedTo.setLayoutData(mappedToData);
		mappedTo.setID(AnalysisViewsRepository.Task.Properties.mappedTo);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Task.Properties.mappedTo, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMappedToFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createFragmentsAdvancedTableComposition(Composite parent) {
		this.fragments = new ReferencesTable(getDescription(AnalysisViewsRepository.Task.Properties.fragments, AnalysisMessages.TaskPropertiesEditionPart_FragmentsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.fragments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				fragments.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.fragments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				fragments.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.fragments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				fragments.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.fragments, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				fragments.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.fragmentsFilters) {
			this.fragments.addFilter(filter);
		}
		this.fragments.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Task.Properties.fragments, AnalysisViewsRepository.SWT_KIND));
		this.fragments.createControls(parent);
		this.fragments.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.fragments, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData fragmentsData = new GridData(GridData.FILL_HORIZONTAL);
		fragmentsData.horizontalSpan = 3;
		this.fragments.setLayoutData(fragmentsData);
		this.fragments.setLowerBound(1);
		this.fragments.setUpperBound(-1);
		fragments.setID(AnalysisViewsRepository.Task.Properties.fragments);
		fragments.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createFragmentsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createFirstFlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Task.Properties.first, AnalysisMessages.TaskPropertiesEditionPart_FirstLabel);
		first = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Task.Properties.first, AnalysisViewsRepository.SWT_KIND));
		first.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		first.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.first, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getFirst()));
			}

		});
		GridData firstData = new GridData(GridData.FILL_HORIZONTAL);
		first.setLayoutData(firstData);
		first.setID(AnalysisViewsRepository.Task.Properties.first);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Task.Properties.first, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFirstFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createBlockingTimeText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Task.Properties.blockingTime, AnalysisMessages.TaskPropertiesEditionPart_BlockingTimeLabel);
		blockingTime = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData blockingTimeData = new GridData(GridData.FILL_HORIZONTAL);
		blockingTime.setLayoutData(blockingTimeData);
		blockingTime.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.blockingTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, blockingTime.getText()));
			}

		});
		blockingTime.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaskPropertiesEditionPartImpl.this, AnalysisViewsRepository.Task.Properties.blockingTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, blockingTime.getText()));
				}
			}

		});
		EditingUtils.setID(blockingTime, AnalysisViewsRepository.Task.Properties.blockingTime);
		EditingUtils.setEEFtype(blockingTime, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Task.Properties.blockingTime, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createBlockingTimeText

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
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#initPorts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initPorts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ports.setContentProvider(contentProvider);
		ports.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.ports);
		if (eefElementEditorReadOnlyState && ports.isEnabled()) {
			ports.setEnabled(false);
			ports.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ports.isEnabled()) {
			ports.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#updatePorts()
	 * @generated
	 */
	public void updatePorts() {
	ports.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#addFilterPorts(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToPorts(ViewerFilter filter) {
		portsFilters.add(filter);
		if (this.ports != null) {
			this.ports.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#addBusinessFilterPorts(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToPorts(ViewerFilter filter) {
		portsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#isContainedInPortsTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInPortsTable(EObject element) {
		return ((ReferencesTableSettings)ports.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#getBehaviorKind()
	 * @generated
	 */
	public Enumerator getBehaviorKind() {
		Enumerator selection = (Enumerator) ((StructuredSelection) behaviorKind.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#initBehaviorKind(Object input, Enumerator current)
	 */
	public void initBehaviorKind(Object input, Enumerator current) {
		behaviorKind.setInput(input);
		behaviorKind.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.behaviorKind);
		if (eefElementEditorReadOnlyState && behaviorKind.isEnabled()) {
			behaviorKind.setEnabled(false);
			behaviorKind.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !behaviorKind.isEnabled()) {
			behaviorKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#setBehaviorKind(Enumerator newValue)
	 * @generated
	 */
	public void setBehaviorKind(Enumerator newValue) {
		behaviorKind.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.behaviorKind);
		if (eefElementEditorReadOnlyState && behaviorKind.isEnabled()) {
			behaviorKind.setEnabled(false);
			behaviorKind.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !behaviorKind.isEnabled()) {
			behaviorKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#getParent_()
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#initParent_(EObjectFlatComboSettings)
	 */
	public void initParent_(EObjectFlatComboSettings settings) {
		parent_.setInput(settings);
		if (current != null) {
			parent_.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#setParent_(EObject newValue)
	 * @generated
	 */
	public void setParent_(EObject newValue) {
		if (newValue != null) {
			parent_.setSelection(new StructuredSelection(newValue));
		} else {
			parent_.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#setParent_ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue) {
		parent_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#addFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToParent_(ViewerFilter filter) {
		parent_.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#addBusinessFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToParent_(ViewerFilter filter) {
		parent_.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#getScheduledBy()
	 * @generated
	 */
	public EObject getScheduledBy() {
		if (scheduledBy.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) scheduledBy.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#initScheduledBy(EObjectFlatComboSettings)
	 */
	public void initScheduledBy(EObjectFlatComboSettings settings) {
		scheduledBy.setInput(settings);
		if (current != null) {
			scheduledBy.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.scheduledBy);
		if (eefElementEditorReadOnlyState && scheduledBy.isEnabled()) {
			scheduledBy.setEnabled(false);
			scheduledBy.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scheduledBy.isEnabled()) {
			scheduledBy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#setScheduledBy(EObject newValue)
	 * @generated
	 */
	public void setScheduledBy(EObject newValue) {
		if (newValue != null) {
			scheduledBy.setSelection(new StructuredSelection(newValue));
		} else {
			scheduledBy.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.scheduledBy);
		if (eefElementEditorReadOnlyState && scheduledBy.isEnabled()) {
			scheduledBy.setEnabled(false);
			scheduledBy.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scheduledBy.isEnabled()) {
			scheduledBy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#setScheduledByButtonMode(ButtonsModeEnum newValue)
	 */
	public void setScheduledByButtonMode(ButtonsModeEnum newValue) {
		scheduledBy.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#addFilterScheduledBy(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToScheduledBy(ViewerFilter filter) {
		scheduledBy.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#addBusinessFilterScheduledBy(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToScheduledBy(ViewerFilter filter) {
		scheduledBy.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#getCET()
	 * @generated
	 */
	public String getCET() {
		return cET.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#setCET(String newValue)
	 * @generated
	 */
	public void setCET(String newValue) {
		if (newValue != null) {
			cET.setText(newValue);
		} else {
			cET.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.cET);
		if (eefElementEditorReadOnlyState && cET.isEnabled()) {
			cET.setEnabled(false);
			cET.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !cET.isEnabled()) {
			cET.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#initSchedulingParameters(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSchedulingParameters(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		schedulingParameters.setContentProvider(contentProvider);
		schedulingParameters.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.schedulingParameters);
		if (eefElementEditorReadOnlyState && schedulingParameters.isEnabled()) {
			schedulingParameters.setEnabled(false);
			schedulingParameters.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !schedulingParameters.isEnabled()) {
			schedulingParameters.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#updateSchedulingParameters()
	 * @generated
	 */
	public void updateSchedulingParameters() {
	schedulingParameters.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#addFilterSchedulingParameters(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToSchedulingParameters(ViewerFilter filter) {
		schedulingParametersFilters.add(filter);
		if (this.schedulingParameters != null) {
			this.schedulingParameters.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#addBusinessFilterSchedulingParameters(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToSchedulingParameters(ViewerFilter filter) {
		schedulingParametersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#isContainedInSchedulingParametersTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInSchedulingParametersTable(EObject element) {
		return ((ReferencesTableSettings)schedulingParameters.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#getOriginalName()
	 * @generated
	 */
	public String getOriginalName() {
		return originalName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#setOriginalName(String newValue)
	 * @generated
	 */
	public void setOriginalName(String newValue) {
		if (newValue != null) {
			originalName.setText(newValue);
		} else {
			originalName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.originalName);
		if (eefElementEditorReadOnlyState && originalName.isEnabled()) {
			originalName.setEnabled(false);
			originalName.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !originalName.isEnabled()) {
			originalName.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#initLockedMutexes(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initLockedMutexes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		lockedMutexes.setContentProvider(contentProvider);
		lockedMutexes.setInput(settings);
		lockedMutexesBusinessFilters.clear();
		lockedMutexesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.lockedMutexes);
		if (eefElementEditorReadOnlyState && lockedMutexes.getTable().isEnabled()) {
			lockedMutexes.setEnabled(false);
			lockedMutexes.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !lockedMutexes.getTable().isEnabled()) {
			lockedMutexes.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#updateLockedMutexes()
	 * @generated
	 */
	public void updateLockedMutexes() {
	lockedMutexes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#addFilterLockedMutexes(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToLockedMutexes(ViewerFilter filter) {
		lockedMutexesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#addBusinessFilterLockedMutexes(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToLockedMutexes(ViewerFilter filter) {
		lockedMutexesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#isContainedInLockedMutexesTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInLockedMutexesTable(EObject element) {
		return ((ReferencesTableSettings)lockedMutexes.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#getMappedTo()
	 * @generated
	 */
	public EObject getMappedTo() {
		if (mappedTo.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) mappedTo.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#initMappedTo(EObjectFlatComboSettings)
	 */
	public void initMappedTo(EObjectFlatComboSettings settings) {
		mappedTo.setInput(settings);
		if (current != null) {
			mappedTo.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.mappedTo);
		if (eefElementEditorReadOnlyState && mappedTo.isEnabled()) {
			mappedTo.setEnabled(false);
			mappedTo.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mappedTo.isEnabled()) {
			mappedTo.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#setMappedTo(EObject newValue)
	 * @generated
	 */
	public void setMappedTo(EObject newValue) {
		if (newValue != null) {
			mappedTo.setSelection(new StructuredSelection(newValue));
		} else {
			mappedTo.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.mappedTo);
		if (eefElementEditorReadOnlyState && mappedTo.isEnabled()) {
			mappedTo.setEnabled(false);
			mappedTo.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mappedTo.isEnabled()) {
			mappedTo.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#setMappedToButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMappedToButtonMode(ButtonsModeEnum newValue) {
		mappedTo.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#addFilterMappedTo(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToMappedTo(ViewerFilter filter) {
		mappedTo.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#addBusinessFilterMappedTo(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToMappedTo(ViewerFilter filter) {
		mappedTo.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#initFragments(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initFragments(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		fragments.setContentProvider(contentProvider);
		fragments.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.fragments);
		if (eefElementEditorReadOnlyState && fragments.isEnabled()) {
			fragments.setEnabled(false);
			fragments.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fragments.isEnabled()) {
			fragments.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#updateFragments()
	 * @generated
	 */
	public void updateFragments() {
	fragments.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#addFilterFragments(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToFragments(ViewerFilter filter) {
		fragmentsFilters.add(filter);
		if (this.fragments != null) {
			this.fragments.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#addBusinessFilterFragments(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToFragments(ViewerFilter filter) {
		fragmentsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#isContainedInFragmentsTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInFragmentsTable(EObject element) {
		return ((ReferencesTableSettings)fragments.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#getFirst()
	 * @generated
	 */
	public EObject getFirst() {
		if (first.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) first.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#initFirst(EObjectFlatComboSettings)
	 */
	public void initFirst(EObjectFlatComboSettings settings) {
		first.setInput(settings);
		if (current != null) {
			first.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.first);
		if (eefElementEditorReadOnlyState && first.isEnabled()) {
			first.setEnabled(false);
			first.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !first.isEnabled()) {
			first.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#setFirst(EObject newValue)
	 * @generated
	 */
	public void setFirst(EObject newValue) {
		if (newValue != null) {
			first.setSelection(new StructuredSelection(newValue));
		} else {
			first.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.first);
		if (eefElementEditorReadOnlyState && first.isEnabled()) {
			first.setEnabled(false);
			first.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !first.isEnabled()) {
			first.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#setFirstButtonMode(ButtonsModeEnum newValue)
	 */
	public void setFirstButtonMode(ButtonsModeEnum newValue) {
		first.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#addFilterFirst(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToFirst(ViewerFilter filter) {
		first.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#addBusinessFilterFirst(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToFirst(ViewerFilter filter) {
		first.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#getBlockingTime()
	 * @generated
	 */
	public String getBlockingTime() {
		return blockingTime.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.TaskPropertiesEditionPart#setBlockingTime(String newValue)
	 * @generated
	 */
	public void setBlockingTime(String newValue) {
		if (newValue != null) {
			blockingTime.setText(newValue);
		} else {
			blockingTime.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Task.Properties.blockingTime);
		if (eefElementEditorReadOnlyState && blockingTime.isEnabled()) {
			blockingTime.setEnabled(false);
			blockingTime.setToolTipText(AnalysisMessages.Task_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !blockingTime.isEnabled()) {
			blockingTime.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return AnalysisMessages.Task_Part_Title;
	}



}
