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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

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
import org.polarsys.time4sys.ui.views.analysis.parts.ComputingResourcePropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class ComputingResourcePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ComputingResourcePropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer scheduler;
	protected EObjectFlatComboViewer parent_;
	protected Text speedFactor;
	protected Text delay;
	protected ReferencesTable tasksAffectedOn;
	protected List<ViewerFilter> tasksAffectedOnBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> tasksAffectedOnFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable linkedBy;
	protected List<ViewerFilter> linkedByBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> linkedByFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public ComputingResourcePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence computingResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = computingResourceStep.addStep(AnalysisViewsRepository.ComputingResource.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.ComputingResource.Properties.name);
		propertiesStep.addStep(AnalysisViewsRepository.ComputingResource.Properties.scheduler);
		propertiesStep.addStep(AnalysisViewsRepository.ComputingResource.Properties.parent_);
		propertiesStep.addStep(AnalysisViewsRepository.ComputingResource.Properties.speedFactor);
		propertiesStep.addStep(AnalysisViewsRepository.ComputingResource.Properties.delay);
		propertiesStep.addStep(AnalysisViewsRepository.ComputingResource.Properties.tasksAffectedOn);
		propertiesStep.addStep(AnalysisViewsRepository.ComputingResource.Properties.linkedBy);
		
		
		composer = new PartComposer(computingResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.ComputingResource.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == AnalysisViewsRepository.ComputingResource.Properties.name) {
					return createNameText(parent);
				}
				if (key == AnalysisViewsRepository.ComputingResource.Properties.scheduler) {
					return createSchedulerFlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.ComputingResource.Properties.parent_) {
					return createParent_FlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.ComputingResource.Properties.speedFactor) {
					return createSpeedFactorText(parent);
				}
				if (key == AnalysisViewsRepository.ComputingResource.Properties.delay) {
					return createDelayText(parent);
				}
				if (key == AnalysisViewsRepository.ComputingResource.Properties.tasksAffectedOn) {
					return createTasksAffectedOnAdvancedReferencesTable(parent);
				}
				if (key == AnalysisViewsRepository.ComputingResource.Properties.linkedBy) {
					return createLinkedByAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(AnalysisMessages.ComputingResourcePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, AnalysisViewsRepository.ComputingResource.Properties.name, AnalysisMessages.ComputingResourcePropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComputingResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.ComputingResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComputingResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.ComputingResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, AnalysisViewsRepository.ComputingResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ComputingResource.Properties.name, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createSchedulerFlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.ComputingResource.Properties.scheduler, AnalysisMessages.ComputingResourcePropertiesEditionPart_SchedulerLabel);
		scheduler = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.ComputingResource.Properties.scheduler, AnalysisViewsRepository.SWT_KIND));
		scheduler.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		scheduler.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComputingResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.ComputingResource.Properties.scheduler, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getScheduler()));
			}

		});
		GridData schedulerData = new GridData(GridData.FILL_HORIZONTAL);
		scheduler.setLayoutData(schedulerData);
		scheduler.setID(AnalysisViewsRepository.ComputingResource.Properties.scheduler);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ComputingResource.Properties.scheduler, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSchedulerFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createParent_FlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.ComputingResource.Properties.parent_, AnalysisMessages.ComputingResourcePropertiesEditionPart_Parent_Label);
		parent_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.ComputingResource.Properties.parent_, AnalysisViewsRepository.SWT_KIND));
		parent_.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parent_.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComputingResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.ComputingResource.Properties.parent_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParent_()));
			}

		});
		GridData parent_Data = new GridData(GridData.FILL_HORIZONTAL);
		parent_.setLayoutData(parent_Data);
		parent_.setID(AnalysisViewsRepository.ComputingResource.Properties.parent_);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ComputingResource.Properties.parent_, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createParent_FlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createSpeedFactorText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.ComputingResource.Properties.speedFactor, AnalysisMessages.ComputingResourcePropertiesEditionPart_SpeedFactorLabel);
		speedFactor = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData speedFactorData = new GridData(GridData.FILL_HORIZONTAL);
		speedFactor.setLayoutData(speedFactorData);
		speedFactor.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComputingResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.ComputingResource.Properties.speedFactor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, speedFactor.getText()));
			}

		});
		speedFactor.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComputingResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.ComputingResource.Properties.speedFactor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, speedFactor.getText()));
				}
			}

		});
		EditingUtils.setID(speedFactor, AnalysisViewsRepository.ComputingResource.Properties.speedFactor);
		EditingUtils.setEEFtype(speedFactor, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ComputingResource.Properties.speedFactor, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSpeedFactorText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createDelayText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.ComputingResource.Properties.delay, AnalysisMessages.ComputingResourcePropertiesEditionPart_DelayLabel);
		delay = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData delayData = new GridData(GridData.FILL_HORIZONTAL);
		delay.setLayoutData(delayData);
		delay.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComputingResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.ComputingResource.Properties.delay, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delay.getText()));
			}

		});
		delay.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComputingResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.ComputingResource.Properties.delay, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delay.getText()));
				}
			}

		});
		EditingUtils.setID(delay, AnalysisViewsRepository.ComputingResource.Properties.delay);
		EditingUtils.setEEFtype(delay, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ComputingResource.Properties.delay, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDelayText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	protected Composite createTasksAffectedOnAdvancedReferencesTable(Composite parent) {
		String label = getDescription(AnalysisViewsRepository.ComputingResource.Properties.tasksAffectedOn, AnalysisMessages.ComputingResourcePropertiesEditionPart_TasksAffectedOnLabel);		 
		this.tasksAffectedOn = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addTasksAffectedOn(); }
			public void handleEdit(EObject element) { editTasksAffectedOn(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveTasksAffectedOn(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromTasksAffectedOn(element); }
			public void navigateTo(EObject element) { }
		});
		this.tasksAffectedOn.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ComputingResource.Properties.tasksAffectedOn, AnalysisViewsRepository.SWT_KIND));
		this.tasksAffectedOn.createControls(parent);
		this.tasksAffectedOn.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComputingResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.ComputingResource.Properties.tasksAffectedOn, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData tasksAffectedOnData = new GridData(GridData.FILL_HORIZONTAL);
		tasksAffectedOnData.horizontalSpan = 3;
		this.tasksAffectedOn.setLayoutData(tasksAffectedOnData);
		this.tasksAffectedOn.disableMove();
		tasksAffectedOn.setID(AnalysisViewsRepository.ComputingResource.Properties.tasksAffectedOn);
		tasksAffectedOn.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @generated
	 */
	protected void addTasksAffectedOn() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(tasksAffectedOn.getInput(), tasksAffectedOnFilters, tasksAffectedOnBusinessFilters,
		"tasksAffectedOn", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComputingResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.ComputingResource.Properties.tasksAffectedOn,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				tasksAffectedOn.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * @generated
	 */
	protected void moveTasksAffectedOn(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComputingResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.ComputingResource.Properties.tasksAffectedOn, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		tasksAffectedOn.refresh();
	}

	/**
	 * @generated
	 */
	protected void removeFromTasksAffectedOn(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComputingResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.ComputingResource.Properties.tasksAffectedOn, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		tasksAffectedOn.refresh();
	}

	/**
	 * @generated
	 */
	protected void editTasksAffectedOn(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				tasksAffectedOn.refresh();
			}
		}
	}

	/**
	 * @generated
	 */
	protected Composite createLinkedByAdvancedReferencesTable(Composite parent) {
		String label = getDescription(AnalysisViewsRepository.ComputingResource.Properties.linkedBy, AnalysisMessages.ComputingResourcePropertiesEditionPart_LinkedByLabel);		 
		this.linkedBy = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addLinkedBy(); }
			public void handleEdit(EObject element) { editLinkedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveLinkedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromLinkedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.linkedBy.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ComputingResource.Properties.linkedBy, AnalysisViewsRepository.SWT_KIND));
		this.linkedBy.createControls(parent);
		this.linkedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComputingResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.ComputingResource.Properties.linkedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData linkedByData = new GridData(GridData.FILL_HORIZONTAL);
		linkedByData.horizontalSpan = 3;
		this.linkedBy.setLayoutData(linkedByData);
		this.linkedBy.disableMove();
		linkedBy.setID(AnalysisViewsRepository.ComputingResource.Properties.linkedBy);
		linkedBy.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @generated
	 */
	protected void addLinkedBy() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(linkedBy.getInput(), linkedByFilters, linkedByBusinessFilters,
		"linkedBy", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComputingResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.ComputingResource.Properties.linkedBy,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				linkedBy.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * @generated
	 */
	protected void moveLinkedBy(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComputingResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.ComputingResource.Properties.linkedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		linkedBy.refresh();
	}

	/**
	 * @generated
	 */
	protected void removeFromLinkedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ComputingResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.ComputingResource.Properties.linkedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		linkedBy.refresh();
	}

	/**
	 * @generated
	 */
	protected void editLinkedBy(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				linkedBy.refresh();
			}
		}
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ComputingResource.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(AnalysisMessages.ComputingResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#getScheduler()
	 * @generated
	 */
	public EObject getScheduler() {
		if (scheduler.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) scheduler.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#initScheduler(EObjectFlatComboSettings)
	 */
	public void initScheduler(EObjectFlatComboSettings settings) {
		scheduler.setInput(settings);
		if (current != null) {
			scheduler.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ComputingResource.Properties.scheduler);
		if (eefElementEditorReadOnlyState && scheduler.isEnabled()) {
			scheduler.setEnabled(false);
			scheduler.setToolTipText(AnalysisMessages.ComputingResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scheduler.isEnabled()) {
			scheduler.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#setScheduler(EObject newValue)
	 * @generated
	 */
	public void setScheduler(EObject newValue) {
		if (newValue != null) {
			scheduler.setSelection(new StructuredSelection(newValue));
		} else {
			scheduler.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ComputingResource.Properties.scheduler);
		if (eefElementEditorReadOnlyState && scheduler.isEnabled()) {
			scheduler.setEnabled(false);
			scheduler.setToolTipText(AnalysisMessages.ComputingResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scheduler.isEnabled()) {
			scheduler.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#setSchedulerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSchedulerButtonMode(ButtonsModeEnum newValue) {
		scheduler.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#addFilterScheduler(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToScheduler(ViewerFilter filter) {
		scheduler.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#addBusinessFilterScheduler(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToScheduler(ViewerFilter filter) {
		scheduler.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#getParent_()
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#initParent_(EObjectFlatComboSettings)
	 */
	public void initParent_(EObjectFlatComboSettings settings) {
		parent_.setInput(settings);
		if (current != null) {
			parent_.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ComputingResource.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.ComputingResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#setParent_(EObject newValue)
	 * @generated
	 */
	public void setParent_(EObject newValue) {
		if (newValue != null) {
			parent_.setSelection(new StructuredSelection(newValue));
		} else {
			parent_.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ComputingResource.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.ComputingResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#setParent_ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue) {
		parent_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#addFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToParent_(ViewerFilter filter) {
		parent_.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#addBusinessFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToParent_(ViewerFilter filter) {
		parent_.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#getSpeedFactor()
	 * @generated
	 */
	public String getSpeedFactor() {
		return speedFactor.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#setSpeedFactor(String newValue)
	 * @generated
	 */
	public void setSpeedFactor(String newValue) {
		if (newValue != null) {
			speedFactor.setText(newValue);
		} else {
			speedFactor.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ComputingResource.Properties.speedFactor);
		if (eefElementEditorReadOnlyState && speedFactor.isEnabled()) {
			speedFactor.setEnabled(false);
			speedFactor.setToolTipText(AnalysisMessages.ComputingResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !speedFactor.isEnabled()) {
			speedFactor.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#getDelay()
	 * @generated
	 */
	public String getDelay() {
		return delay.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#setDelay(String newValue)
	 * @generated
	 */
	public void setDelay(String newValue) {
		if (newValue != null) {
			delay.setText(newValue);
		} else {
			delay.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ComputingResource.Properties.delay);
		if (eefElementEditorReadOnlyState && delay.isEnabled()) {
			delay.setEnabled(false);
			delay.setToolTipText(AnalysisMessages.ComputingResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !delay.isEnabled()) {
			delay.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#initTasksAffectedOn(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initTasksAffectedOn(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		tasksAffectedOn.setContentProvider(contentProvider);
		tasksAffectedOn.setInput(settings);
		tasksAffectedOnBusinessFilters.clear();
		tasksAffectedOnFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ComputingResource.Properties.tasksAffectedOn);
		if (eefElementEditorReadOnlyState && tasksAffectedOn.getTable().isEnabled()) {
			tasksAffectedOn.setEnabled(false);
			tasksAffectedOn.setToolTipText(AnalysisMessages.ComputingResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !tasksAffectedOn.getTable().isEnabled()) {
			tasksAffectedOn.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#updateTasksAffectedOn()
	 * @generated
	 */
	public void updateTasksAffectedOn() {
	tasksAffectedOn.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#addFilterTasksAffectedOn(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToTasksAffectedOn(ViewerFilter filter) {
		tasksAffectedOnFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#addBusinessFilterTasksAffectedOn(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToTasksAffectedOn(ViewerFilter filter) {
		tasksAffectedOnBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#isContainedInTasksAffectedOnTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInTasksAffectedOnTable(EObject element) {
		return ((ReferencesTableSettings)tasksAffectedOn.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#initLinkedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initLinkedBy(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		linkedBy.setContentProvider(contentProvider);
		linkedBy.setInput(settings);
		linkedByBusinessFilters.clear();
		linkedByFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ComputingResource.Properties.linkedBy);
		if (eefElementEditorReadOnlyState && linkedBy.getTable().isEnabled()) {
			linkedBy.setEnabled(false);
			linkedBy.setToolTipText(AnalysisMessages.ComputingResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !linkedBy.getTable().isEnabled()) {
			linkedBy.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#updateLinkedBy()
	 * @generated
	 */
	public void updateLinkedBy() {
	linkedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#addFilterLinkedBy(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToLinkedBy(ViewerFilter filter) {
		linkedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#addBusinessFilterLinkedBy(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToLinkedBy(ViewerFilter filter) {
		linkedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ComputingResourcePropertiesEditionPart#isContainedInLinkedByTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInLinkedByTable(EObject element) {
		return ((ReferencesTableSettings)linkedBy.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return AnalysisMessages.ComputingResource_Part_Title;
	}



}
