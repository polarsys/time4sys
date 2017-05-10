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
import org.polarsys.time4sys.ui.views.analysis.parts.ProtectionParameterValuePropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class ProtectionParameterValuePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ProtectionParameterValuePropertiesEditionPart {

	protected Text value;
	protected EObjectFlatComboViewer type;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public ProtectionParameterValuePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence protectionParameterValueStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = protectionParameterValueStep.addStep(AnalysisViewsRepository.ProtectionParameterValue.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.ProtectionParameterValue.Properties.value);
		propertiesStep.addStep(AnalysisViewsRepository.ProtectionParameterValue.Properties.type);
		
		
		composer = new PartComposer(protectionParameterValueStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.ProtectionParameterValue.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == AnalysisViewsRepository.ProtectionParameterValue.Properties.value) {
					return createValueText(parent);
				}
				if (key == AnalysisViewsRepository.ProtectionParameterValue.Properties.type) {
					return createTypeFlatComboViewer(parent);
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
		propertiesGroup.setText(AnalysisMessages.ProtectionParameterValuePropertiesEditionPart_PropertiesGroupLabel);
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
	
	protected Composite createValueText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.ProtectionParameterValue.Properties.value, AnalysisMessages.ProtectionParameterValuePropertiesEditionPart_ValueLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionParameterValuePropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionParameterValue.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionParameterValuePropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionParameterValue.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}

		});
		EditingUtils.setID(value, AnalysisViewsRepository.ProtectionParameterValue.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ProtectionParameterValue.Properties.value, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createValueText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createTypeFlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.ProtectionParameterValue.Properties.type, AnalysisMessages.ProtectionParameterValuePropertiesEditionPart_TypeLabel);
		type = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.ProtectionParameterValue.Properties.type, AnalysisViewsRepository.SWT_KIND));
		type.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		type.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionParameterValuePropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionParameterValue.Properties.type, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.setID(AnalysisViewsRepository.ProtectionParameterValue.Properties.type);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ProtectionParameterValue.Properties.type, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeFlatComboViewer

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
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionParameterValuePropertiesEditionPart#getValue()
	 * @generated
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionParameterValuePropertiesEditionPart#setValue(String newValue)
	 * @generated
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ProtectionParameterValue.Properties.value);
		if (eefElementEditorReadOnlyState && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(AnalysisMessages.ProtectionParameterValue_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionParameterValuePropertiesEditionPart#getType()
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionParameterValuePropertiesEditionPart#initType(EObjectFlatComboSettings)
	 */
	public void initType(EObjectFlatComboSettings settings) {
		type.setInput(settings);
		if (current != null) {
			type.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ProtectionParameterValue.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(AnalysisMessages.ProtectionParameterValue_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionParameterValuePropertiesEditionPart#setType(EObject newValue)
	 * @generated
	 */
	public void setType(EObject newValue) {
		if (newValue != null) {
			type.setSelection(new StructuredSelection(newValue));
		} else {
			type.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ProtectionParameterValue.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(AnalysisMessages.ProtectionParameterValue_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionParameterValuePropertiesEditionPart#setTypeButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTypeButtonMode(ButtonsModeEnum newValue) {
		type.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionParameterValuePropertiesEditionPart#addFilterType(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToType(ViewerFilter filter) {
		type.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionParameterValuePropertiesEditionPart#addBusinessFilterType(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToType(ViewerFilter filter) {
		type.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return AnalysisMessages.ProtectionParameterValue_Part_Title;
	}



}
