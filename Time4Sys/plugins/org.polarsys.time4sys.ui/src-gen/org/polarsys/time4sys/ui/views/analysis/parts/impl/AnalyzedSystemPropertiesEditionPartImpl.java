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

import org.eclipse.emf.ecore.EObject;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

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
import org.polarsys.time4sys.ui.views.analysis.parts.AnalyzedSystemPropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class AnalyzedSystemPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AnalyzedSystemPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable schedulableElements;
	protected List<ViewerFilter> schedulableElementsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> schedulableElementsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable schedulers;
	protected List<ViewerFilter> schedulersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> schedulersFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable resources;
	protected List<ViewerFilter> resourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resourcesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable stimuli;
	protected List<ViewerFilter> stimuliBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> stimuliFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable delays;
	protected List<ViewerFilter> delaysBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> delaysFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable protectionProtocols;
	protected List<ViewerFilter> protectionProtocolsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> protectionProtocolsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable mutexes;
	protected List<ViewerFilter> mutexesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> mutexesFilters = new ArrayList<ViewerFilter>();
	protected Text status;
	protected ReferencesTable resultContainers;
	protected List<ViewerFilter> resultContainersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resultContainersFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable mappings;
	protected List<ViewerFilter> mappingsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> mappingsFilters = new ArrayList<ViewerFilter>();
	protected Text timeUnit;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public AnalyzedSystemPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence analyzedSystemStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = analyzedSystemStep.addStep(AnalysisViewsRepository.AnalyzedSystem.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.AnalyzedSystem.Properties.name);
		propertiesStep.addStep(AnalysisViewsRepository.AnalyzedSystem.Properties.schedulableElements);
		propertiesStep.addStep(AnalysisViewsRepository.AnalyzedSystem.Properties.schedulers);
		propertiesStep.addStep(AnalysisViewsRepository.AnalyzedSystem.Properties.resources);
		propertiesStep.addStep(AnalysisViewsRepository.AnalyzedSystem.Properties.stimuli);
		propertiesStep.addStep(AnalysisViewsRepository.AnalyzedSystem.Properties.delays);
		propertiesStep.addStep(AnalysisViewsRepository.AnalyzedSystem.Properties.protectionProtocols);
		propertiesStep.addStep(AnalysisViewsRepository.AnalyzedSystem.Properties.mutexes);
		propertiesStep.addStep(AnalysisViewsRepository.AnalyzedSystem.Properties.status);
		propertiesStep.addStep(AnalysisViewsRepository.AnalyzedSystem.Properties.resultContainers);
		propertiesStep.addStep(AnalysisViewsRepository.AnalyzedSystem.Properties.mappings);
		propertiesStep.addStep(AnalysisViewsRepository.AnalyzedSystem.Properties.timeUnit);
		
		
		composer = new PartComposer(analyzedSystemStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.AnalyzedSystem.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == AnalysisViewsRepository.AnalyzedSystem.Properties.name) {
					return createNameText(parent);
				}
				if (key == AnalysisViewsRepository.AnalyzedSystem.Properties.schedulableElements) {
					return createSchedulableElementsAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.AnalyzedSystem.Properties.schedulers) {
					return createSchedulersAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.AnalyzedSystem.Properties.resources) {
					return createResourcesAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.AnalyzedSystem.Properties.stimuli) {
					return createStimuliAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.AnalyzedSystem.Properties.delays) {
					return createDelaysAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.AnalyzedSystem.Properties.protectionProtocols) {
					return createProtectionProtocolsAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.AnalyzedSystem.Properties.mutexes) {
					return createMutexesAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.AnalyzedSystem.Properties.status) {
					return createStatusText(parent);
				}
				if (key == AnalysisViewsRepository.AnalyzedSystem.Properties.resultContainers) {
					return createResultContainersAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.AnalyzedSystem.Properties.mappings) {
					return createMappingsAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.AnalyzedSystem.Properties.timeUnit) {
					return createTimeUnitText(parent);
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
		propertiesGroup.setText(AnalysisMessages.AnalyzedSystemPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, AnalysisViewsRepository.AnalyzedSystem.Properties.name, AnalysisMessages.AnalyzedSystemPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, AnalysisViewsRepository.AnalyzedSystem.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.AnalyzedSystem.Properties.name, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createSchedulableElementsAdvancedTableComposition(Composite parent) {
		this.schedulableElements = new ReferencesTable(getDescription(AnalysisViewsRepository.AnalyzedSystem.Properties.schedulableElements, AnalysisMessages.AnalyzedSystemPropertiesEditionPart_SchedulableElementsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.schedulableElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				schedulableElements.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.schedulableElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				schedulableElements.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.schedulableElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				schedulableElements.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.schedulableElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				schedulableElements.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.schedulableElementsFilters) {
			this.schedulableElements.addFilter(filter);
		}
		this.schedulableElements.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.AnalyzedSystem.Properties.schedulableElements, AnalysisViewsRepository.SWT_KIND));
		this.schedulableElements.createControls(parent);
		this.schedulableElements.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.schedulableElements, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData schedulableElementsData = new GridData(GridData.FILL_HORIZONTAL);
		schedulableElementsData.horizontalSpan = 3;
		this.schedulableElements.setLayoutData(schedulableElementsData);
		this.schedulableElements.setLowerBound(0);
		this.schedulableElements.setUpperBound(-1);
		schedulableElements.setID(AnalysisViewsRepository.AnalyzedSystem.Properties.schedulableElements);
		schedulableElements.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSchedulableElementsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createSchedulersAdvancedTableComposition(Composite parent) {
		this.schedulers = new ReferencesTable(getDescription(AnalysisViewsRepository.AnalyzedSystem.Properties.schedulers, AnalysisMessages.AnalyzedSystemPropertiesEditionPart_SchedulersLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.schedulers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				schedulers.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.schedulers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				schedulers.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.schedulers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				schedulers.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.schedulers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				schedulers.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.schedulersFilters) {
			this.schedulers.addFilter(filter);
		}
		this.schedulers.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.AnalyzedSystem.Properties.schedulers, AnalysisViewsRepository.SWT_KIND));
		this.schedulers.createControls(parent);
		this.schedulers.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.schedulers, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData schedulersData = new GridData(GridData.FILL_HORIZONTAL);
		schedulersData.horizontalSpan = 3;
		this.schedulers.setLayoutData(schedulersData);
		this.schedulers.setLowerBound(0);
		this.schedulers.setUpperBound(-1);
		schedulers.setID(AnalysisViewsRepository.AnalyzedSystem.Properties.schedulers);
		schedulers.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSchedulersAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createResourcesAdvancedTableComposition(Composite parent) {
		this.resources = new ReferencesTable(getDescription(AnalysisViewsRepository.AnalyzedSystem.Properties.resources, AnalysisMessages.AnalyzedSystemPropertiesEditionPart_ResourcesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				resources.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				resources.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				resources.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				resources.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.resourcesFilters) {
			this.resources.addFilter(filter);
		}
		this.resources.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.AnalyzedSystem.Properties.resources, AnalysisViewsRepository.SWT_KIND));
		this.resources.createControls(parent);
		this.resources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.resources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resourcesData = new GridData(GridData.FILL_HORIZONTAL);
		resourcesData.horizontalSpan = 3;
		this.resources.setLayoutData(resourcesData);
		this.resources.setLowerBound(0);
		this.resources.setUpperBound(-1);
		resources.setID(AnalysisViewsRepository.AnalyzedSystem.Properties.resources);
		resources.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createResourcesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createStimuliAdvancedTableComposition(Composite parent) {
		this.stimuli = new ReferencesTable(getDescription(AnalysisViewsRepository.AnalyzedSystem.Properties.stimuli, AnalysisMessages.AnalyzedSystemPropertiesEditionPart_StimuliLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.stimuli, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				stimuli.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.stimuli, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				stimuli.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.stimuli, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				stimuli.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.stimuli, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				stimuli.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.stimuliFilters) {
			this.stimuli.addFilter(filter);
		}
		this.stimuli.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.AnalyzedSystem.Properties.stimuli, AnalysisViewsRepository.SWT_KIND));
		this.stimuli.createControls(parent);
		this.stimuli.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.stimuli, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData stimuliData = new GridData(GridData.FILL_HORIZONTAL);
		stimuliData.horizontalSpan = 3;
		this.stimuli.setLayoutData(stimuliData);
		this.stimuli.setLowerBound(0);
		this.stimuli.setUpperBound(-1);
		stimuli.setID(AnalysisViewsRepository.AnalyzedSystem.Properties.stimuli);
		stimuli.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createStimuliAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createDelaysAdvancedTableComposition(Composite parent) {
		this.delays = new ReferencesTable(getDescription(AnalysisViewsRepository.AnalyzedSystem.Properties.delays, AnalysisMessages.AnalyzedSystemPropertiesEditionPart_DelaysLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.delays, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				delays.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.delays, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				delays.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.delays, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				delays.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.delays, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				delays.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.delaysFilters) {
			this.delays.addFilter(filter);
		}
		this.delays.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.AnalyzedSystem.Properties.delays, AnalysisViewsRepository.SWT_KIND));
		this.delays.createControls(parent);
		this.delays.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.delays, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData delaysData = new GridData(GridData.FILL_HORIZONTAL);
		delaysData.horizontalSpan = 3;
		this.delays.setLayoutData(delaysData);
		this.delays.setLowerBound(0);
		this.delays.setUpperBound(-1);
		delays.setID(AnalysisViewsRepository.AnalyzedSystem.Properties.delays);
		delays.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createDelaysAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createProtectionProtocolsAdvancedTableComposition(Composite parent) {
		this.protectionProtocols = new ReferencesTable(getDescription(AnalysisViewsRepository.AnalyzedSystem.Properties.protectionProtocols, AnalysisMessages.AnalyzedSystemPropertiesEditionPart_ProtectionProtocolsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.protectionProtocols, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				protectionProtocols.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.protectionProtocols, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				protectionProtocols.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.protectionProtocols, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				protectionProtocols.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.protectionProtocols, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				protectionProtocols.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.protectionProtocolsFilters) {
			this.protectionProtocols.addFilter(filter);
		}
		this.protectionProtocols.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.AnalyzedSystem.Properties.protectionProtocols, AnalysisViewsRepository.SWT_KIND));
		this.protectionProtocols.createControls(parent);
		this.protectionProtocols.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.protectionProtocols, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData protectionProtocolsData = new GridData(GridData.FILL_HORIZONTAL);
		protectionProtocolsData.horizontalSpan = 3;
		this.protectionProtocols.setLayoutData(protectionProtocolsData);
		this.protectionProtocols.setLowerBound(0);
		this.protectionProtocols.setUpperBound(-1);
		protectionProtocols.setID(AnalysisViewsRepository.AnalyzedSystem.Properties.protectionProtocols);
		protectionProtocols.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createProtectionProtocolsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createMutexesAdvancedTableComposition(Composite parent) {
		this.mutexes = new ReferencesTable(getDescription(AnalysisViewsRepository.AnalyzedSystem.Properties.mutexes, AnalysisMessages.AnalyzedSystemPropertiesEditionPart_MutexesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.mutexes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				mutexes.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.mutexes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				mutexes.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.mutexes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				mutexes.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.mutexes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				mutexes.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.mutexesFilters) {
			this.mutexes.addFilter(filter);
		}
		this.mutexes.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.AnalyzedSystem.Properties.mutexes, AnalysisViewsRepository.SWT_KIND));
		this.mutexes.createControls(parent);
		this.mutexes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.mutexes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData mutexesData = new GridData(GridData.FILL_HORIZONTAL);
		mutexesData.horizontalSpan = 3;
		this.mutexes.setLayoutData(mutexesData);
		this.mutexes.setLowerBound(0);
		this.mutexes.setUpperBound(-1);
		mutexes.setID(AnalysisViewsRepository.AnalyzedSystem.Properties.mutexes);
		mutexes.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createMutexesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createStatusText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.AnalyzedSystem.Properties.status, AnalysisMessages.AnalyzedSystemPropertiesEditionPart_StatusLabel);
		status = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData statusData = new GridData(GridData.FILL_HORIZONTAL);
		status.setLayoutData(statusData);
		status.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.status, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, status.getText()));
			}

		});
		status.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.status, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, status.getText()));
				}
			}

		});
		EditingUtils.setID(status, AnalysisViewsRepository.AnalyzedSystem.Properties.status);
		EditingUtils.setEEFtype(status, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.AnalyzedSystem.Properties.status, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createStatusText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createResultContainersAdvancedTableComposition(Composite parent) {
		this.resultContainers = new ReferencesTable(getDescription(AnalysisViewsRepository.AnalyzedSystem.Properties.resultContainers, AnalysisMessages.AnalyzedSystemPropertiesEditionPart_ResultContainersLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.resultContainers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				resultContainers.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.resultContainers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				resultContainers.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.resultContainers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				resultContainers.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.resultContainers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				resultContainers.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.resultContainersFilters) {
			this.resultContainers.addFilter(filter);
		}
		this.resultContainers.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.AnalyzedSystem.Properties.resultContainers, AnalysisViewsRepository.SWT_KIND));
		this.resultContainers.createControls(parent);
		this.resultContainers.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.resultContainers, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resultContainersData = new GridData(GridData.FILL_HORIZONTAL);
		resultContainersData.horizontalSpan = 3;
		this.resultContainers.setLayoutData(resultContainersData);
		this.resultContainers.setLowerBound(0);
		this.resultContainers.setUpperBound(-1);
		resultContainers.setID(AnalysisViewsRepository.AnalyzedSystem.Properties.resultContainers);
		resultContainers.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createResultContainersAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createMappingsAdvancedTableComposition(Composite parent) {
		this.mappings = new ReferencesTable(getDescription(AnalysisViewsRepository.AnalyzedSystem.Properties.mappings, AnalysisMessages.AnalyzedSystemPropertiesEditionPart_MappingsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.mappings, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				mappings.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.mappings, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				mappings.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.mappings, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				mappings.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.mappings, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				mappings.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.mappingsFilters) {
			this.mappings.addFilter(filter);
		}
		this.mappings.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.AnalyzedSystem.Properties.mappings, AnalysisViewsRepository.SWT_KIND));
		this.mappings.createControls(parent);
		this.mappings.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.mappings, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData mappingsData = new GridData(GridData.FILL_HORIZONTAL);
		mappingsData.horizontalSpan = 3;
		this.mappings.setLayoutData(mappingsData);
		this.mappings.setLowerBound(0);
		this.mappings.setUpperBound(-1);
		mappings.setID(AnalysisViewsRepository.AnalyzedSystem.Properties.mappings);
		mappings.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createMappingsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createTimeUnitText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.AnalyzedSystem.Properties.timeUnit, AnalysisMessages.AnalyzedSystemPropertiesEditionPart_TimeUnitLabel);
		timeUnit = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData timeUnitData = new GridData(GridData.FILL_HORIZONTAL);
		timeUnit.setLayoutData(timeUnitData);
		timeUnit.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.timeUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, timeUnit.getText()));
			}

		});
		timeUnit.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalyzedSystemPropertiesEditionPartImpl.this, AnalysisViewsRepository.AnalyzedSystem.Properties.timeUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, timeUnit.getText()));
				}
			}

		});
		EditingUtils.setID(timeUnit, AnalysisViewsRepository.AnalyzedSystem.Properties.timeUnit);
		EditingUtils.setEEFtype(timeUnit, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.AnalyzedSystem.Properties.timeUnit, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTimeUnitText

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
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.AnalyzedSystem.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(AnalysisMessages.AnalyzedSystem_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#initSchedulableElements(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSchedulableElements(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		schedulableElements.setContentProvider(contentProvider);
		schedulableElements.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.AnalyzedSystem.Properties.schedulableElements);
		if (eefElementEditorReadOnlyState && schedulableElements.isEnabled()) {
			schedulableElements.setEnabled(false);
			schedulableElements.setToolTipText(AnalysisMessages.AnalyzedSystem_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !schedulableElements.isEnabled()) {
			schedulableElements.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#updateSchedulableElements()
	 * @generated
	 */
	public void updateSchedulableElements() {
	schedulableElements.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addFilterSchedulableElements(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToSchedulableElements(ViewerFilter filter) {
		schedulableElementsFilters.add(filter);
		if (this.schedulableElements != null) {
			this.schedulableElements.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addBusinessFilterSchedulableElements(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToSchedulableElements(ViewerFilter filter) {
		schedulableElementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#isContainedInSchedulableElementsTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInSchedulableElementsTable(EObject element) {
		return ((ReferencesTableSettings)schedulableElements.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#initSchedulers(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSchedulers(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		schedulers.setContentProvider(contentProvider);
		schedulers.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.AnalyzedSystem.Properties.schedulers);
		if (eefElementEditorReadOnlyState && schedulers.isEnabled()) {
			schedulers.setEnabled(false);
			schedulers.setToolTipText(AnalysisMessages.AnalyzedSystem_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !schedulers.isEnabled()) {
			schedulers.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#updateSchedulers()
	 * @generated
	 */
	public void updateSchedulers() {
	schedulers.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addFilterSchedulers(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToSchedulers(ViewerFilter filter) {
		schedulersFilters.add(filter);
		if (this.schedulers != null) {
			this.schedulers.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addBusinessFilterSchedulers(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToSchedulers(ViewerFilter filter) {
		schedulersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#isContainedInSchedulersTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInSchedulersTable(EObject element) {
		return ((ReferencesTableSettings)schedulers.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#initResources(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resources.setContentProvider(contentProvider);
		resources.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.AnalyzedSystem.Properties.resources);
		if (eefElementEditorReadOnlyState && resources.isEnabled()) {
			resources.setEnabled(false);
			resources.setToolTipText(AnalysisMessages.AnalyzedSystem_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resources.isEnabled()) {
			resources.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#updateResources()
	 * @generated
	 */
	public void updateResources() {
	resources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addFilterResources(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToResources(ViewerFilter filter) {
		resourcesFilters.add(filter);
		if (this.resources != null) {
			this.resources.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addBusinessFilterResources(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToResources(ViewerFilter filter) {
		resourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#isContainedInResourcesTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInResourcesTable(EObject element) {
		return ((ReferencesTableSettings)resources.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#initStimuli(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initStimuli(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		stimuli.setContentProvider(contentProvider);
		stimuli.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.AnalyzedSystem.Properties.stimuli);
		if (eefElementEditorReadOnlyState && stimuli.isEnabled()) {
			stimuli.setEnabled(false);
			stimuli.setToolTipText(AnalysisMessages.AnalyzedSystem_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !stimuli.isEnabled()) {
			stimuli.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#updateStimuli()
	 * @generated
	 */
	public void updateStimuli() {
	stimuli.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addFilterStimuli(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToStimuli(ViewerFilter filter) {
		stimuliFilters.add(filter);
		if (this.stimuli != null) {
			this.stimuli.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addBusinessFilterStimuli(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToStimuli(ViewerFilter filter) {
		stimuliBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#isContainedInStimuliTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInStimuliTable(EObject element) {
		return ((ReferencesTableSettings)stimuli.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#initDelays(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDelays(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		delays.setContentProvider(contentProvider);
		delays.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.AnalyzedSystem.Properties.delays);
		if (eefElementEditorReadOnlyState && delays.isEnabled()) {
			delays.setEnabled(false);
			delays.setToolTipText(AnalysisMessages.AnalyzedSystem_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !delays.isEnabled()) {
			delays.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#updateDelays()
	 * @generated
	 */
	public void updateDelays() {
	delays.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addFilterDelays(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToDelays(ViewerFilter filter) {
		delaysFilters.add(filter);
		if (this.delays != null) {
			this.delays.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addBusinessFilterDelays(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToDelays(ViewerFilter filter) {
		delaysBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#isContainedInDelaysTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInDelaysTable(EObject element) {
		return ((ReferencesTableSettings)delays.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#initProtectionProtocols(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProtectionProtocols(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		protectionProtocols.setContentProvider(contentProvider);
		protectionProtocols.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.AnalyzedSystem.Properties.protectionProtocols);
		if (eefElementEditorReadOnlyState && protectionProtocols.isEnabled()) {
			protectionProtocols.setEnabled(false);
			protectionProtocols.setToolTipText(AnalysisMessages.AnalyzedSystem_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !protectionProtocols.isEnabled()) {
			protectionProtocols.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#updateProtectionProtocols()
	 * @generated
	 */
	public void updateProtectionProtocols() {
	protectionProtocols.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addFilterProtectionProtocols(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToProtectionProtocols(ViewerFilter filter) {
		protectionProtocolsFilters.add(filter);
		if (this.protectionProtocols != null) {
			this.protectionProtocols.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addBusinessFilterProtectionProtocols(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToProtectionProtocols(ViewerFilter filter) {
		protectionProtocolsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#isContainedInProtectionProtocolsTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInProtectionProtocolsTable(EObject element) {
		return ((ReferencesTableSettings)protectionProtocols.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#initMutexes(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMutexes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		mutexes.setContentProvider(contentProvider);
		mutexes.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.AnalyzedSystem.Properties.mutexes);
		if (eefElementEditorReadOnlyState && mutexes.isEnabled()) {
			mutexes.setEnabled(false);
			mutexes.setToolTipText(AnalysisMessages.AnalyzedSystem_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mutexes.isEnabled()) {
			mutexes.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#updateMutexes()
	 * @generated
	 */
	public void updateMutexes() {
	mutexes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addFilterMutexes(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToMutexes(ViewerFilter filter) {
		mutexesFilters.add(filter);
		if (this.mutexes != null) {
			this.mutexes.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addBusinessFilterMutexes(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToMutexes(ViewerFilter filter) {
		mutexesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#isContainedInMutexesTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInMutexesTable(EObject element) {
		return ((ReferencesTableSettings)mutexes.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#getStatus()
	 * @generated
	 */
	public String getStatus() {
		return status.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#setStatus(String newValue)
	 * @generated
	 */
	public void setStatus(String newValue) {
		if (newValue != null) {
			status.setText(newValue);
		} else {
			status.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.AnalyzedSystem.Properties.status);
		if (eefElementEditorReadOnlyState && status.isEnabled()) {
			status.setEnabled(false);
			status.setToolTipText(AnalysisMessages.AnalyzedSystem_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !status.isEnabled()) {
			status.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#initResultContainers(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initResultContainers(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resultContainers.setContentProvider(contentProvider);
		resultContainers.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.AnalyzedSystem.Properties.resultContainers);
		if (eefElementEditorReadOnlyState && resultContainers.isEnabled()) {
			resultContainers.setEnabled(false);
			resultContainers.setToolTipText(AnalysisMessages.AnalyzedSystem_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resultContainers.isEnabled()) {
			resultContainers.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#updateResultContainers()
	 * @generated
	 */
	public void updateResultContainers() {
	resultContainers.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addFilterResultContainers(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToResultContainers(ViewerFilter filter) {
		resultContainersFilters.add(filter);
		if (this.resultContainers != null) {
			this.resultContainers.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addBusinessFilterResultContainers(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToResultContainers(ViewerFilter filter) {
		resultContainersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#isContainedInResultContainersTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInResultContainersTable(EObject element) {
		return ((ReferencesTableSettings)resultContainers.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#initMappings(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMappings(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		mappings.setContentProvider(contentProvider);
		mappings.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.AnalyzedSystem.Properties.mappings);
		if (eefElementEditorReadOnlyState && mappings.isEnabled()) {
			mappings.setEnabled(false);
			mappings.setToolTipText(AnalysisMessages.AnalyzedSystem_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mappings.isEnabled()) {
			mappings.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#updateMappings()
	 * @generated
	 */
	public void updateMappings() {
	mappings.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addFilterMappings(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToMappings(ViewerFilter filter) {
		mappingsFilters.add(filter);
		if (this.mappings != null) {
			this.mappings.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#addBusinessFilterMappings(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToMappings(ViewerFilter filter) {
		mappingsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#isContainedInMappingsTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInMappingsTable(EObject element) {
		return ((ReferencesTableSettings)mappings.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#getTimeUnit()
	 * @generated
	 */
	public String getTimeUnit() {
		return timeUnit.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.AnalyzedSystemPropertiesEditionPart#setTimeUnit(String newValue)
	 * @generated
	 */
	public void setTimeUnit(String newValue) {
		if (newValue != null) {
			timeUnit.setText(newValue);
		} else {
			timeUnit.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.AnalyzedSystem.Properties.timeUnit);
		if (eefElementEditorReadOnlyState && timeUnit.isEnabled()) {
			timeUnit.setEnabled(false);
			timeUnit.setToolTipText(AnalysisMessages.AnalyzedSystem_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !timeUnit.isEnabled()) {
			timeUnit.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return AnalysisMessages.AnalyzedSystem_Part_Title;
	}



}
