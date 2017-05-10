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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.OffsetPropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class OffsetPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, OffsetPropertiesEditionPart {

	protected EObjectFlatComboViewer eventModel;
	protected Text value;
	protected Text reference;



	/**
	 * For {@link ISection} use only.
	 */
	public OffsetPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public OffsetPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence offsetStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = offsetStep.addStep(AnalysisViewsRepository.Offset.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.Offset.Properties.eventModel);
		propertiesStep.addStep(AnalysisViewsRepository.Offset.Properties.value);
		propertiesStep.addStep(AnalysisViewsRepository.Offset.Properties.reference);
		
		
		composer = new PartComposer(offsetStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.Offset.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.Offset.Properties.eventModel) {
					return createEventModelFlatComboViewer(parent, widgetFactory);
				}
				if (key == AnalysisViewsRepository.Offset.Properties.value) {
					return createValueText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.Offset.Properties.reference) {
					return createReferenceText(widgetFactory, parent);
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
		propertiesSection.setText(AnalysisMessages.OffsetPropertiesEditionPart_PropertiesGroupLabel);
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
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createEventModelFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, AnalysisViewsRepository.Offset.Properties.eventModel, AnalysisMessages.OffsetPropertiesEditionPart_EventModelLabel);
		eventModel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Offset.Properties.eventModel, AnalysisViewsRepository.FORM_KIND));
		widgetFactory.adapt(eventModel);
		eventModel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData eventModelData = new GridData(GridData.FILL_HORIZONTAL);
		eventModel.setLayoutData(eventModelData);
		eventModel.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OffsetPropertiesEditionPartForm.this, AnalysisViewsRepository.Offset.Properties.eventModel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEventModel()));
			}

		});
		eventModel.setID(AnalysisViewsRepository.Offset.Properties.eventModel);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Offset.Properties.eventModel, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createEventModelFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createValueText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Offset.Properties.value, AnalysisMessages.OffsetPropertiesEditionPart_ValueLabel);
		value = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		value.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OffsetPropertiesEditionPartForm.this,
							AnalysisViewsRepository.Offset.Properties.value,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OffsetPropertiesEditionPartForm.this,
									AnalysisViewsRepository.Offset.Properties.value,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, value.getText()));
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
									OffsetPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		value.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OffsetPropertiesEditionPartForm.this, AnalysisViewsRepository.Offset.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}
		});
		EditingUtils.setID(value, AnalysisViewsRepository.Offset.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Offset.Properties.value, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createValueText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createReferenceText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Offset.Properties.reference, AnalysisMessages.OffsetPropertiesEditionPart_ReferenceLabel);
		reference = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		reference.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData referenceData = new GridData(GridData.FILL_HORIZONTAL);
		reference.setLayoutData(referenceData);
		reference.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OffsetPropertiesEditionPartForm.this,
							AnalysisViewsRepository.Offset.Properties.reference,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, reference.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									OffsetPropertiesEditionPartForm.this,
									AnalysisViewsRepository.Offset.Properties.reference,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, reference.getText()));
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
									OffsetPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		reference.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * @generated
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OffsetPropertiesEditionPartForm.this, AnalysisViewsRepository.Offset.Properties.reference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, reference.getText()));
				}
			}
		});
		EditingUtils.setID(reference, AnalysisViewsRepository.Offset.Properties.reference);
		EditingUtils.setEEFtype(reference, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Offset.Properties.reference, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createReferenceText

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
	 * @see org.polarsys.time4sys.ui.analysis.parts.OffsetPropertiesEditionPart#getEventModel()
	 * @generated
	 */
	public EObject getEventModel() {
		if (eventModel.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) eventModel.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.OffsetPropertiesEditionPart#initEventModel(EObjectFlatComboSettings)
	 */
	public void initEventModel(EObjectFlatComboSettings settings) {
		eventModel.setInput(settings);
		if (current != null) {
			eventModel.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Offset.Properties.eventModel);
		if (eefElementEditorReadOnlyState && eventModel.isEnabled()) {
			eventModel.setEnabled(false);
			eventModel.setToolTipText(AnalysisMessages.Offset_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !eventModel.isEnabled()) {
			eventModel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.OffsetPropertiesEditionPart#setEventModel(EObject newValue)
	 * @generated
	 */
	public void setEventModel(EObject newValue) {
		if (newValue != null) {
			eventModel.setSelection(new StructuredSelection(newValue));
		} else {
			eventModel.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Offset.Properties.eventModel);
		if (eefElementEditorReadOnlyState && eventModel.isEnabled()) {
			eventModel.setEnabled(false);
			eventModel.setToolTipText(AnalysisMessages.Offset_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !eventModel.isEnabled()) {
			eventModel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.OffsetPropertiesEditionPart#setEventModelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setEventModelButtonMode(ButtonsModeEnum newValue) {
		eventModel.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.OffsetPropertiesEditionPart#addFilterEventModel(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToEventModel(ViewerFilter filter) {
		eventModel.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.OffsetPropertiesEditionPart#addBusinessFilterEventModel(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToEventModel(ViewerFilter filter) {
		eventModel.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.OffsetPropertiesEditionPart#getValue()
	 * @generated
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.OffsetPropertiesEditionPart#setValue(String newValue)
	 * @generated
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Offset.Properties.value);
		if (eefElementEditorReadOnlyState && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(AnalysisMessages.Offset_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.OffsetPropertiesEditionPart#getReference()
	 * @generated
	 */
	public String getReference() {
		return reference.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.OffsetPropertiesEditionPart#setReference(String newValue)
	 * @generated
	 */
	public void setReference(String newValue) {
		if (newValue != null) {
			reference.setText(newValue);
		} else {
			reference.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.Offset.Properties.reference);
		if (eefElementEditorReadOnlyState && reference.isEnabled()) {
			reference.setEnabled(false);
			reference.setToolTipText(AnalysisMessages.Offset_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !reference.isEnabled()) {
			reference.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return AnalysisMessages.Offset_Part_Title;
	}



}
