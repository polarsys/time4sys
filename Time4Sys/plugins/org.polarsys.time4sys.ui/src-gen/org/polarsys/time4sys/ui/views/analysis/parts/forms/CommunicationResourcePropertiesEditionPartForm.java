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
package org.polarsys.time4sys.ui.views.analysis.parts.forms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

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
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.CommunicationResourcePropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class CommunicationResourcePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, CommunicationResourcePropertiesEditionPart {

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
	 * For {@link ISection} use only.
	 */
	public CommunicationResourcePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public CommunicationResourcePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * @generated
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
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
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.scheduler) {
					return createSchedulerFlatComboViewer(parent, widgetFactory);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.parent_) {
					return createParent_FlatComboViewer(parent, widgetFactory);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.speedFactor) {
					return createSpeedFactorText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.delay) {
					return createDelayText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.links) {
					return createLinksReferencesTable(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn) {
					return createCommunicationsAffectedOnReferencesTable(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.protocolName) {
					return createProtocolNameText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.CommunicationResource.Properties.bandwidth) {
					return createBandwidthText(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * @generated
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(AnalysisMessages.CommunicationResourcePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * @generated
	 */
	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.CommunicationResource.Properties.name, AnalysisMessages.CommunicationResourcePropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CommunicationResourcePropertiesEditionPartForm.this,
							AnalysisViewsRepository.CommunicationResource.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CommunicationResourcePropertiesEditionPartForm.this,
									AnalysisViewsRepository.CommunicationResource.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CommunicationResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.CommunicationResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, AnalysisViewsRepository.CommunicationResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.name, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createSchedulerFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, AnalysisViewsRepository.CommunicationResource.Properties.scheduler, AnalysisMessages.CommunicationResourcePropertiesEditionPart_SchedulerLabel);
		scheduler = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.CommunicationResource.Properties.scheduler, AnalysisViewsRepository.FORM_KIND));
		widgetFactory.adapt(scheduler);
		scheduler.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData schedulerData = new GridData(GridData.FILL_HORIZONTAL);
		scheduler.setLayoutData(schedulerData);
		scheduler.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.CommunicationResource.Properties.scheduler, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getScheduler()));
			}

		});
		scheduler.setID(AnalysisViewsRepository.CommunicationResource.Properties.scheduler);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.scheduler, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSchedulerFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createParent_FlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, AnalysisViewsRepository.CommunicationResource.Properties.parent_, AnalysisMessages.CommunicationResourcePropertiesEditionPart_Parent_Label);
		parent_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.CommunicationResource.Properties.parent_, AnalysisViewsRepository.FORM_KIND));
		widgetFactory.adapt(parent_);
		parent_.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData parent_Data = new GridData(GridData.FILL_HORIZONTAL);
		parent_.setLayoutData(parent_Data);
		parent_.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.CommunicationResource.Properties.parent_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getParent_()));
			}

		});
		parent_.setID(AnalysisViewsRepository.CommunicationResource.Properties.parent_);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.parent_, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createParent_FlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createSpeedFactorText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.CommunicationResource.Properties.speedFactor, AnalysisMessages.CommunicationResourcePropertiesEditionPart_SpeedFactorLabel);
		speedFactor = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		speedFactor.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData speedFactorData = new GridData(GridData.FILL_HORIZONTAL);
		speedFactor.setLayoutData(speedFactorData);
		speedFactor.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CommunicationResourcePropertiesEditionPartForm.this,
							AnalysisViewsRepository.CommunicationResource.Properties.speedFactor,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, speedFactor.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CommunicationResourcePropertiesEditionPartForm.this,
									AnalysisViewsRepository.CommunicationResource.Properties.speedFactor,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, speedFactor.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CommunicationResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		speedFactor.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.CommunicationResource.Properties.speedFactor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, speedFactor.getText()));
				}
			}
		});
		EditingUtils.setID(speedFactor, AnalysisViewsRepository.CommunicationResource.Properties.speedFactor);
		EditingUtils.setEEFtype(speedFactor, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.speedFactor, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSpeedFactorText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createDelayText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.CommunicationResource.Properties.delay, AnalysisMessages.CommunicationResourcePropertiesEditionPart_DelayLabel);
		delay = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		delay.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData delayData = new GridData(GridData.FILL_HORIZONTAL);
		delay.setLayoutData(delayData);
		delay.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CommunicationResourcePropertiesEditionPartForm.this,
							AnalysisViewsRepository.CommunicationResource.Properties.delay,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delay.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CommunicationResourcePropertiesEditionPartForm.this,
									AnalysisViewsRepository.CommunicationResource.Properties.delay,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, delay.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CommunicationResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		delay.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.CommunicationResource.Properties.delay, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, delay.getText()));
				}
			}
		});
		EditingUtils.setID(delay, AnalysisViewsRepository.CommunicationResource.Properties.delay);
		EditingUtils.setEEFtype(delay, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.delay, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDelayText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	protected Composite createLinksReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.links = new ReferencesTable(getDescription(AnalysisViewsRepository.CommunicationResource.Properties.links, AnalysisMessages.CommunicationResourcePropertiesEditionPart_LinksLabel), new ReferencesTableListener	() {
			public void handleAdd() { addLinks(); }
			public void handleEdit(EObject element) { editLinks(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveLinks(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromLinks(element); }
			public void navigateTo(EObject element) { }
		});
		this.links.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.links, AnalysisViewsRepository.FORM_KIND));
		this.links.createControls(parent, widgetFactory);
		this.links.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.CommunicationResource.Properties.links, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData linksData = new GridData(GridData.FILL_HORIZONTAL);
		linksData.horizontalSpan = 3;
		this.links.setLayoutData(linksData);
		this.links.disableMove();
		links.setID(AnalysisViewsRepository.CommunicationResource.Properties.links);
		links.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createLinksReferencesTable

		// End of user code
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.CommunicationResource.Properties.links,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.CommunicationResource.Properties.links, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		links.refresh();
	}

	/**
	 * @generated
	 */
	protected void removeFromLinks(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.CommunicationResource.Properties.links, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createCommunicationsAffectedOnReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.communicationsAffectedOn = new ReferencesTable(getDescription(AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn, AnalysisMessages.CommunicationResourcePropertiesEditionPart_CommunicationsAffectedOnLabel), new ReferencesTableListener	() {
			public void handleAdd() { addCommunicationsAffectedOn(); }
			public void handleEdit(EObject element) { editCommunicationsAffectedOn(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCommunicationsAffectedOn(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCommunicationsAffectedOn(element); }
			public void navigateTo(EObject element) { }
		});
		this.communicationsAffectedOn.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn, AnalysisViewsRepository.FORM_KIND));
		this.communicationsAffectedOn.createControls(parent, widgetFactory);
		this.communicationsAffectedOn.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData communicationsAffectedOnData = new GridData(GridData.FILL_HORIZONTAL);
		communicationsAffectedOnData.horizontalSpan = 3;
		this.communicationsAffectedOn.setLayoutData(communicationsAffectedOnData);
		this.communicationsAffectedOn.disableMove();
		communicationsAffectedOn.setID(AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn);
		communicationsAffectedOn.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createCommunicationsAffectedOnReferencesTable

		// End of user code
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		communicationsAffectedOn.refresh();
	}

	/**
	 * @generated
	 */
	protected void removeFromCommunicationsAffectedOn(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.CommunicationResource.Properties.communicationsAffectedOn, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	
	protected Composite createProtocolNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.CommunicationResource.Properties.protocolName, AnalysisMessages.CommunicationResourcePropertiesEditionPart_ProtocolNameLabel);
		protocolName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		protocolName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData protocolNameData = new GridData(GridData.FILL_HORIZONTAL);
		protocolName.setLayoutData(protocolNameData);
		protocolName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CommunicationResourcePropertiesEditionPartForm.this,
							AnalysisViewsRepository.CommunicationResource.Properties.protocolName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, protocolName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CommunicationResourcePropertiesEditionPartForm.this,
									AnalysisViewsRepository.CommunicationResource.Properties.protocolName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, protocolName.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CommunicationResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		protocolName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.CommunicationResource.Properties.protocolName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, protocolName.getText()));
				}
			}
		});
		EditingUtils.setID(protocolName, AnalysisViewsRepository.CommunicationResource.Properties.protocolName);
		EditingUtils.setEEFtype(protocolName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.protocolName, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createProtocolNameText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createBandwidthText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.CommunicationResource.Properties.bandwidth, AnalysisMessages.CommunicationResourcePropertiesEditionPart_BandwidthLabel);
		bandwidth = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		bandwidth.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData bandwidthData = new GridData(GridData.FILL_HORIZONTAL);
		bandwidth.setLayoutData(bandwidthData);
		bandwidth.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CommunicationResourcePropertiesEditionPartForm.this,
							AnalysisViewsRepository.CommunicationResource.Properties.bandwidth,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, bandwidth.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CommunicationResourcePropertiesEditionPartForm.this,
									AnalysisViewsRepository.CommunicationResource.Properties.bandwidth,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, bandwidth.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CommunicationResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		bandwidth.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationResourcePropertiesEditionPartForm.this, AnalysisViewsRepository.CommunicationResource.Properties.bandwidth, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, bandwidth.getText()));
				}
			}
		});
		EditingUtils.setID(bandwidth, AnalysisViewsRepository.CommunicationResource.Properties.bandwidth);
		EditingUtils.setEEFtype(bandwidth, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.CommunicationResource.Properties.bandwidth, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
