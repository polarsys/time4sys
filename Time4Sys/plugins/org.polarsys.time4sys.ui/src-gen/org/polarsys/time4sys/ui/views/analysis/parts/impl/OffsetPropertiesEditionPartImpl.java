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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.OffsetPropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class OffsetPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, OffsetPropertiesEditionPart {

	protected EObjectFlatComboViewer eventModel;
	protected Text value;
	protected Text reference;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public OffsetPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence offsetStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = offsetStep.addStep(AnalysisViewsRepository.Offset.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.Offset.Properties.eventModel);
		propertiesStep.addStep(AnalysisViewsRepository.Offset.Properties.value);
		propertiesStep.addStep(AnalysisViewsRepository.Offset.Properties.reference);
		
		
		composer = new PartComposer(offsetStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.Offset.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == AnalysisViewsRepository.Offset.Properties.eventModel) {
					return createEventModelFlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.Offset.Properties.value) {
					return createValueText(parent);
				}
				if (key == AnalysisViewsRepository.Offset.Properties.reference) {
					return createReferenceText(parent);
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
		propertiesGroup.setText(AnalysisMessages.OffsetPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createEventModelFlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Offset.Properties.eventModel, AnalysisMessages.OffsetPropertiesEditionPart_EventModelLabel);
		eventModel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.Offset.Properties.eventModel, AnalysisViewsRepository.SWT_KIND));
		eventModel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		eventModel.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OffsetPropertiesEditionPartImpl.this, AnalysisViewsRepository.Offset.Properties.eventModel, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getEventModel()));
			}

		});
		GridData eventModelData = new GridData(GridData.FILL_HORIZONTAL);
		eventModel.setLayoutData(eventModelData);
		eventModel.setID(AnalysisViewsRepository.Offset.Properties.eventModel);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Offset.Properties.eventModel, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createEventModelFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createValueText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Offset.Properties.value, AnalysisMessages.OffsetPropertiesEditionPart_ValueLabel);
		value = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OffsetPropertiesEditionPartImpl.this, AnalysisViewsRepository.Offset.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
			}

		});
		value.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OffsetPropertiesEditionPartImpl.this, AnalysisViewsRepository.Offset.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}

		});
		EditingUtils.setID(value, AnalysisViewsRepository.Offset.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Offset.Properties.value, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createValueText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	
	protected Composite createReferenceText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.Offset.Properties.reference, AnalysisMessages.OffsetPropertiesEditionPart_ReferenceLabel);
		reference = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData referenceData = new GridData(GridData.FILL_HORIZONTAL);
		reference.setLayoutData(referenceData);
		reference.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OffsetPropertiesEditionPartImpl.this, AnalysisViewsRepository.Offset.Properties.reference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, reference.getText()));
			}

		});
		reference.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OffsetPropertiesEditionPartImpl.this, AnalysisViewsRepository.Offset.Properties.reference, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, reference.getText()));
				}
			}

		});
		EditingUtils.setID(reference, AnalysisViewsRepository.Offset.Properties.reference);
		EditingUtils.setEEFtype(reference, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.Offset.Properties.reference, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
