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
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EcoreAdapterFactory;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

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
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.CommunicationPropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class CommunicationPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, CommunicationPropertiesEditionPart {

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
	 * For {@link ISection} use only.
	 */
	public CommunicationPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public CommunicationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.ports) {
					return createPortsTableComposition(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.behaviorKind) {
					return createBehaviorKindEMFComboViewer(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.parent_) {
					return createParent_FlatComboViewer(parent, widgetFactory);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.scheduledBy) {
					return createScheduledByFlatComboViewer(parent, widgetFactory);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.cET) {
					return createCETText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.schedulingParameters) {
					return createSchedulingParametersTableComposition(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.originalName) {
					return createOriginalNameText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.Communication.Properties.bus) {
					return createBusFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(AnalysisMessages.CommunicationPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, AnalysisViewsRepository.Communication.Properties.name, AnalysisMessages.CommunicationPropertiesEditionPart_NameLabel);
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
							CommunicationPropertiesEditionPartForm.this,
							AnalysisViewsRepository.Communication.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CommunicationPropertiesEditionPartForm.this,
									AnalysisViewsRepository.Communication.Properties.name,
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
									CommunicationPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, AnalysisViewsRepository.Communication.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.name, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createPortsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ports = new ReferencesTable(getDescription(AnalysisViewsRepository.Communication.Properties.ports, AnalysisMessages.CommunicationPropertiesEditionPart_PortsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ports.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ports.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ports.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ports.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.portsFilters) {
			this.ports.addFilter(filter);
		}
		this.ports.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.ports, AnalysisViewsRepository.FORM_KIND));
		this.ports.createControls(parent, widgetFactory);
		this.ports.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.ports, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		// Start of user code for createPortsTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createBehaviorKindEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.behaviorKind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBehaviorKind()));
			}

		});
		behaviorKind.setID(AnalysisViewsRepository.Communication.Properties.behaviorKind);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.behaviorKind, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createBehaviorKindEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createParent_FlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, AnalysisViewsRepository.Communication.Properties.parent_, AnalysisMessages.CommunicationPropertiesEditionPart_Parent_Label);
		parent_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Communication.Properties.parent_, AnalysisViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.parent_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getParent_()));
			}

		});
		parent_.setID(AnalysisViewsRepository.Communication.Properties.parent_);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.parent_, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createParent_FlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createScheduledByFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, AnalysisViewsRepository.Communication.Properties.scheduledBy, AnalysisMessages.CommunicationPropertiesEditionPart_ScheduledByLabel);
		scheduledBy = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Communication.Properties.scheduledBy, AnalysisViewsRepository.FORM_KIND));
		widgetFactory.adapt(scheduledBy);
		scheduledBy.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData scheduledByData = new GridData(GridData.FILL_HORIZONTAL);
		scheduledBy.setLayoutData(scheduledByData);
		scheduledBy.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.scheduledBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getScheduledBy()));
			}

		});
		scheduledBy.setID(AnalysisViewsRepository.Communication.Properties.scheduledBy);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.scheduledBy, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createScheduledByFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createCETText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Communication.Properties.cET, AnalysisMessages.CommunicationPropertiesEditionPart_CETLabel);
		cET = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		cET.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData cETData = new GridData(GridData.FILL_HORIZONTAL);
		cET.setLayoutData(cETData);
		cET.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CommunicationPropertiesEditionPartForm.this,
							AnalysisViewsRepository.Communication.Properties.cET,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cET.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CommunicationPropertiesEditionPartForm.this,
									AnalysisViewsRepository.Communication.Properties.cET,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, cET.getText()));
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
									CommunicationPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		cET.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.cET, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cET.getText()));
				}
			}
		});
		EditingUtils.setID(cET, AnalysisViewsRepository.Communication.Properties.cET);
		EditingUtils.setEEFtype(cET, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.cET, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createCETText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createSchedulingParametersTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.schedulingParameters = new ReferencesTable(getDescription(AnalysisViewsRepository.Communication.Properties.schedulingParameters, AnalysisMessages.CommunicationPropertiesEditionPart_SchedulingParametersLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.schedulingParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				schedulingParameters.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.schedulingParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				schedulingParameters.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.schedulingParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				schedulingParameters.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.schedulingParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				schedulingParameters.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.schedulingParametersFilters) {
			this.schedulingParameters.addFilter(filter);
		}
		this.schedulingParameters.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.schedulingParameters, AnalysisViewsRepository.FORM_KIND));
		this.schedulingParameters.createControls(parent, widgetFactory);
		this.schedulingParameters.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.schedulingParameters, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		// Start of user code for createSchedulingParametersTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createOriginalNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Communication.Properties.originalName, AnalysisMessages.CommunicationPropertiesEditionPart_OriginalNameLabel);
		originalName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		originalName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData originalNameData = new GridData(GridData.FILL_HORIZONTAL);
		originalName.setLayoutData(originalNameData);
		originalName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							CommunicationPropertiesEditionPartForm.this,
							AnalysisViewsRepository.Communication.Properties.originalName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									CommunicationPropertiesEditionPartForm.this,
									AnalysisViewsRepository.Communication.Properties.originalName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, originalName.getText()));
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
									CommunicationPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		originalName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.originalName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, originalName.getText()));
				}
			}
		});
		EditingUtils.setID(originalName, AnalysisViewsRepository.Communication.Properties.originalName);
		EditingUtils.setEEFtype(originalName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.originalName, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createOriginalNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createBusFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, AnalysisViewsRepository.Communication.Properties.bus, AnalysisMessages.CommunicationPropertiesEditionPart_BusLabel);
		bus = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Communication.Properties.bus, AnalysisViewsRepository.FORM_KIND));
		widgetFactory.adapt(bus);
		bus.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData busData = new GridData(GridData.FILL_HORIZONTAL);
		bus.setLayoutData(busData);
		bus.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommunicationPropertiesEditionPartForm.this, AnalysisViewsRepository.Communication.Properties.bus, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBus()));
			}

		});
		bus.setID(AnalysisViewsRepository.Communication.Properties.bus);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Communication.Properties.bus, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
