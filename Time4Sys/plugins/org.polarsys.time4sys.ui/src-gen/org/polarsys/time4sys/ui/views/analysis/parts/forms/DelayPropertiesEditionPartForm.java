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
import org.polarsys.time4sys.ui.views.analysis.parts.DelayPropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class DelayPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, DelayPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable ports;
	protected List<ViewerFilter> portsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> portsFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer behaviorKind;
	protected EObjectFlatComboViewer parent_;
	protected EObjectFlatComboViewer referencedEvent;
	protected Text duration;



	/**
	 * For {@link ISection} use only.
	 */
	public DelayPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public DelayPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence delayStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = delayStep.addStep(AnalysisViewsRepository.Delay.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.Delay.Properties.name);
		propertiesStep.addStep(AnalysisViewsRepository.Delay.Properties.ports);
		propertiesStep.addStep(AnalysisViewsRepository.Delay.Properties.behaviorKind);
		propertiesStep.addStep(AnalysisViewsRepository.Delay.Properties.parent_);
		propertiesStep.addStep(AnalysisViewsRepository.Delay.Properties.referencedEvent);
		propertiesStep.addStep(AnalysisViewsRepository.Delay.Properties.duration);
		
		
		composer = new PartComposer(delayStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.Delay.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.Delay.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.Delay.Properties.ports) {
					return createPortsTableComposition(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.Delay.Properties.behaviorKind) {
					return createBehaviorKindEMFComboViewer(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.Delay.Properties.parent_) {
					return createParent_FlatComboViewer(parent, widgetFactory);
				}
				if (key == AnalysisViewsRepository.Delay.Properties.referencedEvent) {
					return createReferencedEventFlatComboViewer(parent, widgetFactory);
				}
				if (key == AnalysisViewsRepository.Delay.Properties.duration) {
					return createDurationText(widgetFactory, parent);
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
		propertiesSection.setText(AnalysisMessages.DelayPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, AnalysisViewsRepository.Delay.Properties.name, AnalysisMessages.DelayPropertiesEditionPart_NameLabel);
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
							DelayPropertiesEditionPartForm.this,
							AnalysisViewsRepository.Delay.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DelayPropertiesEditionPartForm.this,
									AnalysisViewsRepository.Delay.Properties.name,
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
									DelayPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelayPropertiesEditionPartForm.this, AnalysisViewsRepository.Delay.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, AnalysisViewsRepository.Delay.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Delay.Properties.name, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createPortsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.ports = new ReferencesTable(getDescription(AnalysisViewsRepository.Delay.Properties.ports, AnalysisMessages.DelayPropertiesEditionPart_PortsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelayPropertiesEditionPartForm.this, AnalysisViewsRepository.Delay.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ports.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelayPropertiesEditionPartForm.this, AnalysisViewsRepository.Delay.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ports.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelayPropertiesEditionPartForm.this, AnalysisViewsRepository.Delay.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ports.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelayPropertiesEditionPartForm.this, AnalysisViewsRepository.Delay.Properties.ports, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ports.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.portsFilters) {
			this.ports.addFilter(filter);
		}
		this.ports.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Delay.Properties.ports, AnalysisViewsRepository.FORM_KIND));
		this.ports.createControls(parent, widgetFactory);
		this.ports.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelayPropertiesEditionPartForm.this, AnalysisViewsRepository.Delay.Properties.ports, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData portsData = new GridData(GridData.FILL_HORIZONTAL);
		portsData.horizontalSpan = 3;
		this.ports.setLayoutData(portsData);
		this.ports.setLowerBound(0);
		this.ports.setUpperBound(-1);
		ports.setID(AnalysisViewsRepository.Delay.Properties.ports);
		ports.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPortsTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createBehaviorKindEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Delay.Properties.behaviorKind, AnalysisMessages.DelayPropertiesEditionPart_BehaviorKindLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelayPropertiesEditionPartForm.this, AnalysisViewsRepository.Delay.Properties.behaviorKind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBehaviorKind()));
			}

		});
		behaviorKind.setID(AnalysisViewsRepository.Delay.Properties.behaviorKind);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Delay.Properties.behaviorKind, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
		createDescription(parent, AnalysisViewsRepository.Delay.Properties.parent_, AnalysisMessages.DelayPropertiesEditionPart_Parent_Label);
		parent_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Delay.Properties.parent_, AnalysisViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelayPropertiesEditionPartForm.this, AnalysisViewsRepository.Delay.Properties.parent_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getParent_()));
			}

		});
		parent_.setID(AnalysisViewsRepository.Delay.Properties.parent_);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Delay.Properties.parent_, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createParent_FlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createReferencedEventFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, AnalysisViewsRepository.Delay.Properties.referencedEvent, AnalysisMessages.DelayPropertiesEditionPart_ReferencedEventLabel);
		referencedEvent = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Delay.Properties.referencedEvent, AnalysisViewsRepository.FORM_KIND));
		widgetFactory.adapt(referencedEvent);
		referencedEvent.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData referencedEventData = new GridData(GridData.FILL_HORIZONTAL);
		referencedEvent.setLayoutData(referencedEventData);
		referencedEvent.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelayPropertiesEditionPartForm.this, AnalysisViewsRepository.Delay.Properties.referencedEvent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getReferencedEvent()));
			}

		});
		referencedEvent.setID(AnalysisViewsRepository.Delay.Properties.referencedEvent);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Delay.Properties.referencedEvent, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createReferencedEventFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createDurationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Delay.Properties.duration, AnalysisMessages.DelayPropertiesEditionPart_DurationLabel);
		duration = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		duration.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData durationData = new GridData(GridData.FILL_HORIZONTAL);
		duration.setLayoutData(durationData);
		duration.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							DelayPropertiesEditionPartForm.this,
							AnalysisViewsRepository.Delay.Properties.duration,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, duration.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									DelayPropertiesEditionPartForm.this,
									AnalysisViewsRepository.Delay.Properties.duration,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, duration.getText()));
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
									DelayPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		duration.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DelayPropertiesEditionPartForm.this, AnalysisViewsRepository.Delay.Properties.duration, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, duration.getText()));
				}
			}
		});
		EditingUtils.setID(duration, AnalysisViewsRepository.Delay.Properties.duration);
		EditingUtils.setEEFtype(duration, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Delay.Properties.duration, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createDurationText

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
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Delay.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(AnalysisMessages.Delay_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#initPorts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initPorts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ports.setContentProvider(contentProvider);
		ports.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Delay.Properties.ports);
		if (eefElementEditorReadOnlyState && ports.isEnabled()) {
			ports.setEnabled(false);
			ports.setToolTipText(AnalysisMessages.Delay_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ports.isEnabled()) {
			ports.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#updatePorts()
	 * @generated
	 */
	public void updatePorts() {
	ports.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#addFilterPorts(ViewerFilter filter)
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#addBusinessFilterPorts(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToPorts(ViewerFilter filter) {
		portsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#isContainedInPortsTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInPortsTable(EObject element) {
		return ((ReferencesTableSettings)ports.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#getBehaviorKind()
	 * @generated
	 */
	public Enumerator getBehaviorKind() {
		Enumerator selection = (Enumerator) ((StructuredSelection) behaviorKind.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#initBehaviorKind(Object input, Enumerator current)
	 */
	public void initBehaviorKind(Object input, Enumerator current) {
		behaviorKind.setInput(input);
		behaviorKind.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Delay.Properties.behaviorKind);
		if (eefElementEditorReadOnlyState && behaviorKind.isEnabled()) {
			behaviorKind.setEnabled(false);
			behaviorKind.setToolTipText(AnalysisMessages.Delay_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !behaviorKind.isEnabled()) {
			behaviorKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#setBehaviorKind(Enumerator newValue)
	 * @generated
	 */
	public void setBehaviorKind(Enumerator newValue) {
		behaviorKind.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Delay.Properties.behaviorKind);
		if (eefElementEditorReadOnlyState && behaviorKind.isEnabled()) {
			behaviorKind.setEnabled(false);
			behaviorKind.setToolTipText(AnalysisMessages.Delay_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !behaviorKind.isEnabled()) {
			behaviorKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#getParent_()
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#initParent_(EObjectFlatComboSettings)
	 */
	public void initParent_(EObjectFlatComboSettings settings) {
		parent_.setInput(settings);
		if (current != null) {
			parent_.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Delay.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.Delay_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#setParent_(EObject newValue)
	 * @generated
	 */
	public void setParent_(EObject newValue) {
		if (newValue != null) {
			parent_.setSelection(new StructuredSelection(newValue));
		} else {
			parent_.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Delay.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.Delay_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#setParent_ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue) {
		parent_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#addFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToParent_(ViewerFilter filter) {
		parent_.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#addBusinessFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToParent_(ViewerFilter filter) {
		parent_.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#getReferencedEvent()
	 * @generated
	 */
	public EObject getReferencedEvent() {
		if (referencedEvent.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) referencedEvent.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#initReferencedEvent(EObjectFlatComboSettings)
	 */
	public void initReferencedEvent(EObjectFlatComboSettings settings) {
		referencedEvent.setInput(settings);
		if (current != null) {
			referencedEvent.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Delay.Properties.referencedEvent);
		if (eefElementEditorReadOnlyState && referencedEvent.isEnabled()) {
			referencedEvent.setEnabled(false);
			referencedEvent.setToolTipText(AnalysisMessages.Delay_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !referencedEvent.isEnabled()) {
			referencedEvent.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#setReferencedEvent(EObject newValue)
	 * @generated
	 */
	public void setReferencedEvent(EObject newValue) {
		if (newValue != null) {
			referencedEvent.setSelection(new StructuredSelection(newValue));
		} else {
			referencedEvent.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Delay.Properties.referencedEvent);
		if (eefElementEditorReadOnlyState && referencedEvent.isEnabled()) {
			referencedEvent.setEnabled(false);
			referencedEvent.setToolTipText(AnalysisMessages.Delay_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !referencedEvent.isEnabled()) {
			referencedEvent.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#setReferencedEventButtonMode(ButtonsModeEnum newValue)
	 */
	public void setReferencedEventButtonMode(ButtonsModeEnum newValue) {
		referencedEvent.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#addFilterReferencedEvent(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToReferencedEvent(ViewerFilter filter) {
		referencedEvent.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#addBusinessFilterReferencedEvent(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToReferencedEvent(ViewerFilter filter) {
		referencedEvent.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#getDuration()
	 * @generated
	 */
	public String getDuration() {
		return duration.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.DelayPropertiesEditionPart#setDuration(String newValue)
	 * @generated
	 */
	public void setDuration(String newValue) {
		if (newValue != null) {
			duration.setText(newValue);
		} else {
			duration.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Delay.Properties.duration);
		if (eefElementEditorReadOnlyState && duration.isEnabled()) {
			duration.setEnabled(false);
			duration.setToolTipText(AnalysisMessages.Delay_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !duration.isEnabled()) {
			duration.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return AnalysisMessages.Delay_Part_Title;
	}



}
