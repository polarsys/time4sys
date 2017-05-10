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
import org.polarsys.time4sys.ui.views.analysis.parts.CommunicationResourcePropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class CommunicationResourcePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CommunicationResourcePropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer scheduler;
	protected EObjectFlatComboViewer parent_;
	protected Text speedFactor;
	protected Text delay;
	protected ReferencesTable links;
	protected List<ViewerFilter> linksBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> linksFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable communicationsAffectedOn;
	protected List<ViewerFilter> communicationsAffectedOnBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> communicationsAffectedOnFilters = new ArrayList<ViewerFilter>();
	protected Text protocolName;
	protected Text bandwidth;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public CommunicationResourcePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence communicationResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = communicationResourceStep.addStep(AnalysisViewsRepository.CommunicationResource.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.CommunicationResource.Properties.name);
		propertiesStep.addStep(AnalysisViewsRepository.CommunicationResource.Properties.scheduler);
		propertiesStep.addStep(AnalysisViewsRepository.CommunicationResource.Properties.parent_);
		propertiesStep.addStep(AnalysisViewsRepository.CommunicationResource.Properties.speedFactor);
		propertiesStep.addStep(AnalysisViewsRepository.CommunicationResource.Properties.delay);
		propertiesStep.addStep(AnalysisViewsRepository.CommunicationResource.Properties.links);
		propertiesStep.addStep(AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn);
		propertiesStep.addStep(AnalysisViewsRepository.CommunicationResource.Properties.protocolName);
		propertiesStep.addStep(AnalysisViewsRepository.CommunicationResource.Properties.bandwidth);
		
		
		composer = new PartComposer(communicationResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.name) {
					return createNameText(parent);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.scheduler) {
					return createSchedulerFlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.parent_) {
					return createParent_FlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.speedFactor) {
					return createSpeedFactorText(parent);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.delay) {
					return createDelayText(parent);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.links) {
					return createLinksAdvancedReferencesTable(parent);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn) {
					return createCommunicationsAffectedOnAdvancedReferencesTable(parent);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.protocolName) {
					return createProtocolNameText(parent);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.bandwidth) {
					return createBandwidthText(parent);
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
		propertiesGroup.setText(AnalysisMessages.CommunicationResourcePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, AnalysisViewsRepository.CommunicationResource.Properties.name, AnalysisMessages.CommunicationResourcePropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, AnalysisViewsRepository.CommunicationResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.name, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createSchedulerFlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.CommunicationResource.Properties.scheduler, AnalysisMessages.CommunicationResourcePropertiesEditionPart_SchedulerLabel);
		scheduler = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.CommunicationResource.Properties.scheduler, AnalysisViewsRepository.SWT_KIND));
		scheduler.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		scheduler.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.scheduler, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getScheduler()));
			}

		});
		GridData schedulerData = new GridData(GridData.FILL_HORIZONTAL);
		scheduler.setLayoutData(schedulerData);
		scheduler.setID(AnalysisViewsRepository.CommunicationResource.Properties.scheduler);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.scheduler, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSchedulerFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createParent_FlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.CommunicationResource.Properties.parent_, AnalysisMessages.CommunicationResourcePropertiesEditionPart_Parent_Label);
		parent_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.CommunicationResource.Properties.parent_, AnalysisViewsRepository.SWT_KIND));
		parent_.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parent_.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.parent_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParent_()));
			}

		});
		GridData parent_Data = new GridData(GridData.FILL_HORIZONTAL);
		parent_.setLayoutData(parent_Data);
		parent_.setID(AnalysisViewsRepository.CommunicationResource.Properties.parent_);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.parent_, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createParent_FlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createSpeedFactorText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.CommunicationResource.Properties.speedFactor, AnalysisMessages.CommunicationResourcePropertiesEditionPart_SpeedFactorLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.speedFactor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, speedFactor.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.speedFactor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, speedFactor.getText()));
				}
			}

		});
		EditingUtils.setID(speedFactor, AnalysisViewsRepository.CommunicationResource.Properties.speedFactor);
		EditingUtils.setEEFtype(speedFactor, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.speedFactor, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSpeedFactorText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createDelayText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.CommunicationResource.Properties.delay, AnalysisMessages.CommunicationResourcePropertiesEditionPart_DelayLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.delay, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delay.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.delay, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delay.getText()));
				}
			}

		});
		EditingUtils.setID(delay, AnalysisViewsRepository.CommunicationResource.Properties.delay);
		EditingUtils.setEEFtype(delay, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.delay, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDelayText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	protected Composite createLinksAdvancedReferencesTable(Composite parent) {
		String label = getDescription(AnalysisViewsRepository.CommunicationResource.Properties.links, AnalysisMessages.CommunicationResourcePropertiesEditionPart_LinksLabel);		 
		this.links = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addLinks(); }
			public void handleEdit(EObject element) { editLinks(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveLinks(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromLinks(element); }
			public void navigateTo(EObject element) { }
		});
		this.links.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.links, AnalysisViewsRepository.SWT_KIND));
		this.links.createControls(parent);
		this.links.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.links, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData linksData = new GridData(GridData.FILL_HORIZONTAL);
		linksData.horizontalSpan = 3;
		this.links.setLayoutData(linksData);
		this.links.disableMove();
		links.setID(AnalysisViewsRepository.CommunicationResource.Properties.links);
		links.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @generated
	 */
	protected void addLinks() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(links.getInput(), linksFilters, linksBusinessFilters,
		"links", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.links,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				links.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * @generated
	 */
	protected void moveLinks(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.links, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		links.refresh();
	}

	/**
	 * @generated
	 */
	protected void removeFromLinks(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.links, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		links.refresh();
	}

	/**
	 * @generated
	 */
	protected void editLinks(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				links.refresh();
			}
		}
	}

	/**
	 * @generated
	 */
	protected Composite createCommunicationsAffectedOnAdvancedReferencesTable(Composite parent) {
		String label = getDescription(AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn, AnalysisMessages.CommunicationResourcePropertiesEditionPart_CommunicationsAffectedOnLabel);		 
		this.communicationsAffectedOn = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addCommunicationsAffectedOn(); }
			public void handleEdit(EObject element) { editCommunicationsAffectedOn(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCommunicationsAffectedOn(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCommunicationsAffectedOn(element); }
			public void navigateTo(EObject element) { }
		});
		this.communicationsAffectedOn.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn, AnalysisViewsRepository.SWT_KIND));
		this.communicationsAffectedOn.createControls(parent);
		this.communicationsAffectedOn.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData communicationsAffectedOnData = new GridData(GridData.FILL_HORIZONTAL);
		communicationsAffectedOnData.horizontalSpan = 3;
		this.communicationsAffectedOn.setLayoutData(communicationsAffectedOnData);
		this.communicationsAffectedOn.disableMove();
		communicationsAffectedOn.setID(AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn);
		communicationsAffectedOn.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @generated
	 */
	protected void addCommunicationsAffectedOn() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(communicationsAffectedOn.getInput(), communicationsAffectedOnFilters, communicationsAffectedOnBusinessFilters,
		"communicationsAffectedOn", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				communicationsAffectedOn.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * @generated
	 */
	protected void moveCommunicationsAffectedOn(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		communicationsAffectedOn.refresh();
	}

	/**
	 * @generated
	 */
	protected void removeFromCommunicationsAffectedOn(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		communicationsAffectedOn.refresh();
	}

	/**
	 * @generated
	 */
	protected void editCommunicationsAffectedOn(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				communicationsAffectedOn.refresh();
			}
		}
	}

	/**
	 * @generated
	 */
	
	protected Composite createProtocolNameText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.CommunicationResource.Properties.protocolName, AnalysisMessages.CommunicationResourcePropertiesEditionPart_ProtocolNameLabel);
		protocolName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData protocolNameData = new GridData(GridData.FILL_HORIZONTAL);
		protocolName.setLayoutData(protocolNameData);
		protocolName.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.protocolName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, protocolName.getText()));
			}

		});
		protocolName.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.protocolName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, protocolName.getText()));
				}
			}

		});
		EditingUtils.setID(protocolName, AnalysisViewsRepository.CommunicationResource.Properties.protocolName);
		EditingUtils.setEEFtype(protocolName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.protocolName, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createProtocolNameText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createBandwidthText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.CommunicationResource.Properties.bandwidth, AnalysisMessages.CommunicationResourcePropertiesEditionPart_BandwidthLabel);
		bandwidth = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData bandwidthData = new GridData(GridData.FILL_HORIZONTAL);
		bandwidth.setLayoutData(bandwidthData);
		bandwidth.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.bandwidth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, bandwidth.getText()));
			}

		});
		bandwidth.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartImpl.this, AnalysisViewsRepository.CommunicationResource.Properties.bandwidth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, bandwidth.getText()));
				}
			}

		});
		EditingUtils.setID(bandwidth, AnalysisViewsRepository.CommunicationResource.Properties.bandwidth);
		EditingUtils.setEEFtype(bandwidth, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.bandwidth, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createBandwidthText

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
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.CommunicationResource.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(AnalysisMessages.CommunicationResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#getScheduler()
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#initScheduler(EObjectFlatComboSettings)
	 */
	public void initScheduler(EObjectFlatComboSettings settings) {
		scheduler.setInput(settings);
		if (current != null) {
			scheduler.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.CommunicationResource.Properties.scheduler);
		if (eefElementEditorReadOnlyState && scheduler.isEnabled()) {
			scheduler.setEnabled(false);
			scheduler.setToolTipText(AnalysisMessages.CommunicationResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scheduler.isEnabled()) {
			scheduler.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#setScheduler(EObject newValue)
	 * @generated
	 */
	public void setScheduler(EObject newValue) {
		if (newValue != null) {
			scheduler.setSelection(new StructuredSelection(newValue));
		} else {
			scheduler.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.CommunicationResource.Properties.scheduler);
		if (eefElementEditorReadOnlyState && scheduler.isEnabled()) {
			scheduler.setEnabled(false);
			scheduler.setToolTipText(AnalysisMessages.CommunicationResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scheduler.isEnabled()) {
			scheduler.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#setSchedulerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSchedulerButtonMode(ButtonsModeEnum newValue) {
		scheduler.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#addFilterScheduler(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToScheduler(ViewerFilter filter) {
		scheduler.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#addBusinessFilterScheduler(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToScheduler(ViewerFilter filter) {
		scheduler.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#getParent_()
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#initParent_(EObjectFlatComboSettings)
	 */
	public void initParent_(EObjectFlatComboSettings settings) {
		parent_.setInput(settings);
		if (current != null) {
			parent_.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.CommunicationResource.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.CommunicationResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#setParent_(EObject newValue)
	 * @generated
	 */
	public void setParent_(EObject newValue) {
		if (newValue != null) {
			parent_.setSelection(new StructuredSelection(newValue));
		} else {
			parent_.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.CommunicationResource.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.CommunicationResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#setParent_ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue) {
		parent_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#addFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToParent_(ViewerFilter filter) {
		parent_.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#addBusinessFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToParent_(ViewerFilter filter) {
		parent_.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#getSpeedFactor()
	 * @generated
	 */
	public String getSpeedFactor() {
		return speedFactor.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#setSpeedFactor(String newValue)
	 * @generated
	 */
	public void setSpeedFactor(String newValue) {
		if (newValue != null) {
			speedFactor.setText(newValue);
		} else {
			speedFactor.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.CommunicationResource.Properties.speedFactor);
		if (eefElementEditorReadOnlyState && speedFactor.isEnabled()) {
			speedFactor.setEnabled(false);
			speedFactor.setToolTipText(AnalysisMessages.CommunicationResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !speedFactor.isEnabled()) {
			speedFactor.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#getDelay()
	 * @generated
	 */
	public String getDelay() {
		return delay.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#setDelay(String newValue)
	 * @generated
	 */
	public void setDelay(String newValue) {
		if (newValue != null) {
			delay.setText(newValue);
		} else {
			delay.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.CommunicationResource.Properties.delay);
		if (eefElementEditorReadOnlyState && delay.isEnabled()) {
			delay.setEnabled(false);
			delay.setToolTipText(AnalysisMessages.CommunicationResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !delay.isEnabled()) {
			delay.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#initLinks(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initLinks(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		links.setContentProvider(contentProvider);
		links.setInput(settings);
		linksBusinessFilters.clear();
		linksFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.CommunicationResource.Properties.links);
		if (eefElementEditorReadOnlyState && links.getTable().isEnabled()) {
			links.setEnabled(false);
			links.setToolTipText(AnalysisMessages.CommunicationResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !links.getTable().isEnabled()) {
			links.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#updateLinks()
	 * @generated
	 */
	public void updateLinks() {
	links.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#addFilterLinks(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToLinks(ViewerFilter filter) {
		linksFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#addBusinessFilterLinks(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToLinks(ViewerFilter filter) {
		linksBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#isContainedInLinksTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInLinksTable(EObject element) {
		return ((ReferencesTableSettings)links.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#initCommunicationsAffectedOn(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCommunicationsAffectedOn(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		communicationsAffectedOn.setContentProvider(contentProvider);
		communicationsAffectedOn.setInput(settings);
		communicationsAffectedOnBusinessFilters.clear();
		communicationsAffectedOnFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn);
		if (eefElementEditorReadOnlyState && communicationsAffectedOn.getTable().isEnabled()) {
			communicationsAffectedOn.setEnabled(false);
			communicationsAffectedOn.setToolTipText(AnalysisMessages.CommunicationResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !communicationsAffectedOn.getTable().isEnabled()) {
			communicationsAffectedOn.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#updateCommunicationsAffectedOn()
	 * @generated
	 */
	public void updateCommunicationsAffectedOn() {
	communicationsAffectedOn.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#addFilterCommunicationsAffectedOn(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToCommunicationsAffectedOn(ViewerFilter filter) {
		communicationsAffectedOnFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#addBusinessFilterCommunicationsAffectedOn(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToCommunicationsAffectedOn(ViewerFilter filter) {
		communicationsAffectedOnBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#isContainedInCommunicationsAffectedOnTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInCommunicationsAffectedOnTable(EObject element) {
		return ((ReferencesTableSettings)communicationsAffectedOn.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#getProtocolName()
	 * @generated
	 */
	public String getProtocolName() {
		return protocolName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#setProtocolName(String newValue)
	 * @generated
	 */
	public void setProtocolName(String newValue) {
		if (newValue != null) {
			protocolName.setText(newValue);
		} else {
			protocolName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.CommunicationResource.Properties.protocolName);
		if (eefElementEditorReadOnlyState && protocolName.isEnabled()) {
			protocolName.setEnabled(false);
			protocolName.setToolTipText(AnalysisMessages.CommunicationResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !protocolName.isEnabled()) {
			protocolName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#getBandwidth()
	 * @generated
	 */
	public String getBandwidth() {
		return bandwidth.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.CommunicationResourcePropertiesEditionPart#setBandwidth(String newValue)
	 * @generated
	 */
	public void setBandwidth(String newValue) {
		if (newValue != null) {
			bandwidth.setText(newValue);
		} else {
			bandwidth.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.CommunicationResource.Properties.bandwidth);
		if (eefElementEditorReadOnlyState && bandwidth.isEnabled()) {
			bandwidth.setEnabled(false);
			bandwidth.setToolTipText(AnalysisMessages.CommunicationResource_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !bandwidth.isEnabled()) {
			bandwidth.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return AnalysisMessages.CommunicationResource_Part_Title;
	}



}
