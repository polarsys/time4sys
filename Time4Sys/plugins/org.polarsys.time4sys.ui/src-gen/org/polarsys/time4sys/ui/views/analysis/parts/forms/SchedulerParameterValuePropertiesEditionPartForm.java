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
import org.polarsys.time4sys.ui.views.analysis.parts.SchedulerParameterValuePropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class SchedulerParameterValuePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SchedulerParameterValuePropertiesEditionPart {

	protected EObjectFlatComboViewer type;
	protected Text value;
	protected EObjectFlatComboViewer parent_;



	/**
	 * For {@link ISection} use only.
	 */
	public SchedulerParameterValuePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public SchedulerParameterValuePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence schedulerParameterValueStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = schedulerParameterValueStep.addStep(AnalysisViewsRepository.SchedulerParameterValue.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.SchedulerParameterValue.Properties.type);
		propertiesStep.addStep(AnalysisViewsRepository.SchedulerParameterValue.Properties.value);
		propertiesStep.addStep(AnalysisViewsRepository.SchedulerParameterValue.Properties.parent_);
		
		
		composer = new PartComposer(schedulerParameterValueStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.SchedulerParameterValue.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.SchedulerParameterValue.Properties.type) {
					return createTypeFlatComboViewer(parent, widgetFactory);
				}
				if (key == AnalysisViewsRepository.SchedulerParameterValue.Properties.value) {
					return createValueText(widgetFactory, parent);
				}
				if (key == AnalysisViewsRepository.SchedulerParameterValue.Properties.parent_) {
					return createParent_FlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(AnalysisMessages.SchedulerParameterValuePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createTypeFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, AnalysisViewsRepository.SchedulerParameterValue.Properties.type, AnalysisMessages.SchedulerParameterValuePropertiesEditionPart_TypeLabel);
		type = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.SchedulerParameterValue.Properties.type, AnalysisViewsRepository.FORM_KIND));
		widgetFactory.adapt(type);
		type.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerParameterValuePropertiesEditionPartForm.this, AnalysisViewsRepository.SchedulerParameterValue.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(AnalysisViewsRepository.SchedulerParameterValue.Properties.type);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.SchedulerParameterValue.Properties.type, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createValueText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, AnalysisViewsRepository.SchedulerParameterValue.Properties.value, AnalysisMessages.SchedulerParameterValuePropertiesEditionPart_ValueLabel);
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
							SchedulerParameterValuePropertiesEditionPartForm.this,
							AnalysisViewsRepository.SchedulerParameterValue.Properties.value,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SchedulerParameterValuePropertiesEditionPartForm.this,
									AnalysisViewsRepository.SchedulerParameterValue.Properties.value,
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
									SchedulerParameterValuePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerParameterValuePropertiesEditionPartForm.this, AnalysisViewsRepository.SchedulerParameterValue.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}
		});
		EditingUtils.setID(value, AnalysisViewsRepository.SchedulerParameterValue.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.SchedulerParameterValue.Properties.value, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createValueText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * @generated
	 */
	protected Composite createParent_FlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, AnalysisViewsRepository.SchedulerParameterValue.Properties.parent_, AnalysisMessages.SchedulerParameterValuePropertiesEditionPart_Parent_Label);
		parent_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.SchedulerParameterValue.Properties.parent_, AnalysisViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SchedulerParameterValuePropertiesEditionPartForm.this, AnalysisViewsRepository.SchedulerParameterValue.Properties.parent_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getParent_()));
			}

		});
		parent_.setID(AnalysisViewsRepository.SchedulerParameterValue.Properties.parent_);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.SchedulerParameterValue.Properties.parent_, AnalysisViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createParent_FlatComboViewer

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
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerParameterValuePropertiesEditionPart#getType()
	 * @generated
	 */
	public EObject getType() {
		if (type.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) type.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerParameterValuePropertiesEditionPart#initType(EObjectFlatComboSettings)
	 */
	public void initType(EObjectFlatComboSettings settings) {
		type.setInput(settings);
		if (current != null) {
			type.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.SchedulerParameterValue.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(AnalysisMessages.SchedulerParameterValue_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerParameterValuePropertiesEditionPart#setType(EObject newValue)
	 * @generated
	 */
	public void setType(EObject newValue) {
		if (newValue != null) {
			type.setSelection(new StructuredSelection(newValue));
		} else {
			type.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.SchedulerParameterValue.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(AnalysisMessages.SchedulerParameterValue_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerParameterValuePropertiesEditionPart#setTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTypeButtonMode(ButtonsModeEnum newValue) {
		type.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerParameterValuePropertiesEditionPart#addFilterType(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToType(ViewerFilter filter) {
		type.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerParameterValuePropertiesEditionPart#addBusinessFilterType(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToType(ViewerFilter filter) {
		type.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerParameterValuePropertiesEditionPart#getValue()
	 * @generated
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerParameterValuePropertiesEditionPart#setValue(String newValue)
	 * @generated
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.SchedulerParameterValue.Properties.value);
		if (eefElementEditorReadOnlyState && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(AnalysisMessages.SchedulerParameterValue_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerParameterValuePropertiesEditionPart#getParent_()
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerParameterValuePropertiesEditionPart#initParent_(EObjectFlatComboSettings)
	 */
	public void initParent_(EObjectFlatComboSettings settings) {
		parent_.setInput(settings);
		if (current != null) {
			parent_.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.SchedulerParameterValue.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.SchedulerParameterValue_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerParameterValuePropertiesEditionPart#setParent_(EObject newValue)
	 * @generated
	 */
	public void setParent_(EObject newValue) {
		if (newValue != null) {
			parent_.setSelection(new StructuredSelection(newValue));
		} else {
			parent_.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.SchedulerParameterValue.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.SchedulerParameterValue_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerParameterValuePropertiesEditionPart#setParent_ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue) {
		parent_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerParameterValuePropertiesEditionPart#addFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToParent_(ViewerFilter filter) {
		parent_.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.SchedulerParameterValuePropertiesEditionPart#addBusinessFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToParent_(ViewerFilter filter) {
		parent_.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return AnalysisMessages.SchedulerParameterValue_Part_Title;
	}



}
