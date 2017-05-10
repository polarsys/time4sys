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
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

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

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
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
import org.polarsys.time4sys.ui.views.analysis.parts.CommunicationPropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class CommunicationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CommunicationPropertiesEditionPart {

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
	protected EObjectFlatComboViewer bus;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public CommunicationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence communicationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = communicationStep.addStep(AnalysisViewsRepository.Communication.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.Communication.Properties.name);
		propertiesStep.addStep(AnalysisViewsRepository.Communication.Properties.ports);
		propertiesStep.addStep(AnalysisViewsRepository.Communication.Properties.behaviorKind);
		propertiesStep.addStep(AnalysisViewsRepository.Communication.Properties.parent_);
		propertiesStep.addStep(AnalysisViewsRepository.Communication.Properties.scheduledBy);
		propertiesStep.addStep(AnalysisViewsRepository.Communication.Properties.cET);
		propertiesStep.addStep(AnalysisViewsRepository.Communication.Properties.schedulingParameters);
		propertiesStep.addStep(AnalysisViewsRepository.Communication.Properties.originalName);
		propertiesStep.addStep(AnalysisViewsRepository.Communication.Properties.bus);
		
		
		composer = new PartComposer(communicationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.Communication.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.name) {
					return createNameText(parent);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.ports) {
					return createPortsAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.behaviorKind) {
					return createBehaviorKindEMFComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.parent_) {
					return createParent_FlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.scheduledBy) {
					return createScheduledByFlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.cET) {
					return createCETText(parent);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.schedulingParameters) {
					return createSchedulingParametersAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.originalName) {
					return createOriginalNameText(parent);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.bus) {
					return createBusFlatComboViewer(parent);
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
		propertiesGroup.setText(AnalysisMessages.CommunicationPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, AnalysisViewsRepository.Communication.Properties.name, AnalysisMessages.CommunicationPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, AnalysisViewsRepository.Communication.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.name, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createPortsAdvancedTableComposition(Composite parent) {
		this.ports = new ReferencesTable(getDescription(AnalysisViewsRepository.Communication.Properties.ports, AnalysisMessages.CommunicationPropertiesEditionPart_PortsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ports.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ports.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ports.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ports.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.portsFilters) {
			this.ports.addFilter(filter);
		}
		this.ports.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.ports, AnalysisViewsRepository.SWT_KIND));
		this.ports.createControls(parent);
		this.ports.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.ports, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData portsData = new GridData(GridData.FILL_HORIZONTAL);
		portsData.horizontalSpan = 3;
		this.ports.setLayoutData(portsData);
		this.ports.setLowerBound(0);
		this.ports.setUpperBound(-1);
		ports.setID(AnalysisViewsRepository.Communication.Properties.ports);
		ports.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPortsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createBehaviorKindEMFComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Communication.Properties.behaviorKind, AnalysisMessages.CommunicationPropertiesEditionPart_BehaviorKindLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.behaviorKind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBehaviorKind()));
			}

		});
		behaviorKind.setID(AnalysisViewsRepository.Communication.Properties.behaviorKind);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.behaviorKind, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createBehaviorKindEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createParent_FlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Communication.Properties.parent_, AnalysisMessages.CommunicationPropertiesEditionPart_Parent_Label);
		parent_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Communication.Properties.parent_, AnalysisViewsRepository.SWT_KIND));
		parent_.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parent_.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.parent_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParent_()));
			}

		});
		GridData parent_Data = new GridData(GridData.FILL_HORIZONTAL);
		parent_.setLayoutData(parent_Data);
		parent_.setID(AnalysisViewsRepository.Communication.Properties.parent_);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.parent_, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createParent_FlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createScheduledByFlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Communication.Properties.scheduledBy, AnalysisMessages.CommunicationPropertiesEditionPart_ScheduledByLabel);
		scheduledBy = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Communication.Properties.scheduledBy, AnalysisViewsRepository.SWT_KIND));
		scheduledBy.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		scheduledBy.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.scheduledBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getScheduledBy()));
			}

		});
		GridData scheduledByData = new GridData(GridData.FILL_HORIZONTAL);
		scheduledBy.setLayoutData(scheduledByData);
		scheduledBy.setID(AnalysisViewsRepository.Communication.Properties.scheduledBy);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.scheduledBy, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createScheduledByFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createCETText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Communication.Properties.cET, AnalysisMessages.CommunicationPropertiesEditionPart_CETLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.cET, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cET.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.cET, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cET.getText()));
				}
			}

		});
		EditingUtils.setID(cET, AnalysisViewsRepository.Communication.Properties.cET);
		EditingUtils.setEEFtype(cET, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.cET, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createCETText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createSchedulingParametersAdvancedTableComposition(Composite parent) {
		this.schedulingParameters = new ReferencesTable(getDescription(AnalysisViewsRepository.Communication.Properties.schedulingParameters, AnalysisMessages.CommunicationPropertiesEditionPart_SchedulingParametersLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.schedulingParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				schedulingParameters.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.schedulingParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				schedulingParameters.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.schedulingParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				schedulingParameters.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.schedulingParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				schedulingParameters.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.schedulingParametersFilters) {
			this.schedulingParameters.addFilter(filter);
		}
		this.schedulingParameters.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.schedulingParameters, AnalysisViewsRepository.SWT_KIND));
		this.schedulingParameters.createControls(parent);
		this.schedulingParameters.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.schedulingParameters, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData schedulingParametersData = new GridData(GridData.FILL_HORIZONTAL);
		schedulingParametersData.horizontalSpan = 3;
		this.schedulingParameters.setLayoutData(schedulingParametersData);
		this.schedulingParameters.setLowerBound(0);
		this.schedulingParameters.setUpperBound(-1);
		schedulingParameters.setID(AnalysisViewsRepository.Communication.Properties.schedulingParameters);
		schedulingParameters.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSchedulingParametersAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createOriginalNameText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Communication.Properties.originalName, AnalysisMessages.CommunicationPropertiesEditionPart_OriginalNameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.originalName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalName.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.originalName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalName.getText()));
				}
			}

		});
		EditingUtils.setID(originalName, AnalysisViewsRepository.Communication.Properties.originalName);
		EditingUtils.setEEFtype(originalName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.originalName, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOriginalNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createBusFlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Communication.Properties.bus, AnalysisMessages.CommunicationPropertiesEditionPart_BusLabel);
		bus = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Communication.Properties.bus, AnalysisViewsRepository.SWT_KIND));
		bus.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		bus.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartImpl.this, AnalysisViewsRepository.Communication.Properties.bus, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getBus()));
			}

		});
		GridData busData = new GridData(GridData.FILL_HORIZONTAL);
		bus.setLayoutData(busData);
		bus.setID(AnalysisViewsRepository.Communication.Properties.bus);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.bus, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createBusFlatComboViewer

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
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Communication.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(AnalysisMessages.Communication_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#initPorts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initPorts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ports.setContentProvider(contentProvider);
		ports.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Communication.Properties.ports);
		if (eefElementEditorReadOnlyState && ports.isEnabled()) {
			ports.setEnabled(false);
			ports.setToolTipText(AnalysisMessages.Communication_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ports.isEnabled()) {
			ports.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#updatePorts()
	 * @generated
	 */
	public void updatePorts() {
	ports.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#addFilterPorts(ViewerFilter filter)
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#addBusinessFilterPorts(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToPorts(ViewerFilter filter) {
		portsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#isContainedInPortsTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInPortsTable(EObject element) {
		return ((ReferencesTableSettings)ports.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#getBehaviorKind()
	 * @generated
	 */
	public Enumerator getBehaviorKind() {
		Enumerator selection = (Enumerator) ((StructuredSelection) behaviorKind.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#initBehaviorKind(Object input, Enumerator current)
	 */
	public void initBehaviorKind(Object input, Enumerator current) {
		behaviorKind.setInput(input);
		behaviorKind.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Communication.Properties.behaviorKind);
		if (eefElementEditorReadOnlyState && behaviorKind.isEnabled()) {
			behaviorKind.setEnabled(false);
			behaviorKind.setToolTipText(AnalysisMessages.Communication_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !behaviorKind.isEnabled()) {
			behaviorKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#setBehaviorKind(Enumerator newValue)
	 * @generated
	 */
	public void setBehaviorKind(Enumerator newValue) {
		behaviorKind.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Communication.Properties.behaviorKind);
		if (eefElementEditorReadOnlyState && behaviorKind.isEnabled()) {
			behaviorKind.setEnabled(false);
			behaviorKind.setToolTipText(AnalysisMessages.Communication_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !behaviorKind.isEnabled()) {
			behaviorKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#getParent_()
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#initParent_(EObjectFlatComboSettings)
	 */
	public void initParent_(EObjectFlatComboSettings settings) {
		parent_.setInput(settings);
		if (current != null) {
			parent_.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Communication.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.Communication_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#setParent_(EObject newValue)
	 * @generated
	 */
	public void setParent_(EObject newValue) {
		if (newValue != null) {
			parent_.setSelection(new StructuredSelection(newValue));
		} else {
			parent_.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Communication.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.Communication_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#setParent_ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue) {
		parent_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#addFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToParent_(ViewerFilter filter) {
		parent_.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#addBusinessFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToParent_(ViewerFilter filter) {
		parent_.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#getScheduledBy()
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#initScheduledBy(EObjectFlatComboSettings)
	 */
	public void initScheduledBy(EObjectFlatComboSettings settings) {
		scheduledBy.setInput(settings);
		if (current != null) {
			scheduledBy.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Communication.Properties.scheduledBy);
		if (eefElementEditorReadOnlyState && scheduledBy.isEnabled()) {
			scheduledBy.setEnabled(false);
			scheduledBy.setToolTipText(AnalysisMessages.Communication_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scheduledBy.isEnabled()) {
			scheduledBy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#setScheduledBy(EObject newValue)
	 * @generated
	 */
	public void setScheduledBy(EObject newValue) {
		if (newValue != null) {
			scheduledBy.setSelection(new StructuredSelection(newValue));
		} else {
			scheduledBy.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Communication.Properties.scheduledBy);
		if (eefElementEditorReadOnlyState && scheduledBy.isEnabled()) {
			scheduledBy.setEnabled(false);
			scheduledBy.setToolTipText(AnalysisMessages.Communication_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scheduledBy.isEnabled()) {
			scheduledBy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#setScheduledByButtonMode(ButtonsModeEnum newValue)
	 */
	public void setScheduledByButtonMode(ButtonsModeEnum newValue) {
		scheduledBy.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#addFilterScheduledBy(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToScheduledBy(ViewerFilter filter) {
		scheduledBy.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#addBusinessFilterScheduledBy(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToScheduledBy(ViewerFilter filter) {
		scheduledBy.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#getCET()
	 * @generated
	 */
	public String getCET() {
		return cET.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#setCET(String newValue)
	 * @generated
	 */
	public void setCET(String newValue) {
		if (newValue != null) {
			cET.setText(newValue);
		} else {
			cET.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Communication.Properties.cET);
		if (eefElementEditorReadOnlyState && cET.isEnabled()) {
			cET.setEnabled(false);
			cET.setToolTipText(AnalysisMessages.Communication_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !cET.isEnabled()) {
			cET.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#initSchedulingParameters(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSchedulingParameters(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		schedulingParameters.setContentProvider(contentProvider);
		schedulingParameters.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Communication.Properties.schedulingParameters);
		if (eefElementEditorReadOnlyState && schedulingParameters.isEnabled()) {
			schedulingParameters.setEnabled(false);
			schedulingParameters.setToolTipText(AnalysisMessages.Communication_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !schedulingParameters.isEnabled()) {
			schedulingParameters.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#updateSchedulingParameters()
	 * @generated
	 */
	public void updateSchedulingParameters() {
	schedulingParameters.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#addFilterSchedulingParameters(ViewerFilter filter)
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#addBusinessFilterSchedulingParameters(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToSchedulingParameters(ViewerFilter filter) {
		schedulingParametersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#isContainedInSchedulingParametersTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInSchedulingParametersTable(EObject element) {
		return ((ReferencesTableSettings)schedulingParameters.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#getOriginalName()
	 * @generated
	 */
	public String getOriginalName() {
		return originalName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#setOriginalName(String newValue)
	 * @generated
	 */
	public void setOriginalName(String newValue) {
		if (newValue != null) {
			originalName.setText(newValue);
		} else {
			originalName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Communication.Properties.originalName);
		if (eefElementEditorReadOnlyState && originalName.isEnabled()) {
			originalName.setEnabled(false);
			originalName.setToolTipText(AnalysisMessages.Communication_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !originalName.isEnabled()) {
			originalName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#getBus()
	 * @generated
	 */
	public EObject getBus() {
		if (bus.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) bus.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#initBus(EObjectFlatComboSettings)
	 */
	public void initBus(EObjectFlatComboSettings settings) {
		bus.setInput(settings);
		if (current != null) {
			bus.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Communication.Properties.bus);
		if (eefElementEditorReadOnlyState && bus.isEnabled()) {
			bus.setEnabled(false);
			bus.setToolTipText(AnalysisMessages.Communication_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !bus.isEnabled()) {
			bus.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#setBus(EObject newValue)
	 * @generated
	 */
	public void setBus(EObject newValue) {
		if (newValue != null) {
			bus.setSelection(new StructuredSelection(newValue));
		} else {
			bus.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Communication.Properties.bus);
		if (eefElementEditorReadOnlyState && bus.isEnabled()) {
			bus.setEnabled(false);
			bus.setToolTipText(AnalysisMessages.Communication_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !bus.isEnabled()) {
			bus.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#setBusButtonMode(ButtonsModeEnum newValue)
	 */
	public void setBusButtonMode(ButtonsModeEnum newValue) {
		bus.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#addFilterBus(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToBus(ViewerFilter filter) {
		bus.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationPropertiesEditionPart#addBusinessFilterBus(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToBus(ViewerFilter filter) {
		bus.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return AnalysisMessages.Communication_Part_Title;
	}



}
