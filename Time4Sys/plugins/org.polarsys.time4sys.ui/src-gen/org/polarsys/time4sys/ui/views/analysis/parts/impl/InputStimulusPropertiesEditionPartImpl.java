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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import org.polarsys.time4sys.ui.views.analysis.parts.AnalysisViewsRepository;
import org.polarsys.time4sys.ui.views.analysis.parts.InputStimulusPropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class InputStimulusPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, InputStimulusPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer parent_;
	protected ReferencesTable outputPorts;
	protected List<ViewerFilter> outputPortsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outputPortsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public InputStimulusPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence inputStimulusStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = inputStimulusStep.addStep(AnalysisViewsRepository.InputStimulus.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.InputStimulus.Properties.name);
		propertiesStep.addStep(AnalysisViewsRepository.InputStimulus.Properties.parent_);
		propertiesStep.addStep(AnalysisViewsRepository.InputStimulus.Properties.outputPorts);
		
		
		composer = new PartComposer(inputStimulusStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.InputStimulus.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == AnalysisViewsRepository.InputStimulus.Properties.name) {
					return createNameText(parent);
				}
				if (key == AnalysisViewsRepository.InputStimulus.Properties.parent_) {
					return createParent_FlatComboViewer(parent);
				}
				if (key == AnalysisViewsRepository.InputStimulus.Properties.outputPorts) {
					return createOutputPortsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(AnalysisMessages.InputStimulusPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, AnalysisViewsRepository.InputStimulus.Properties.name, AnalysisMessages.InputStimulusPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputStimulusPropertiesEditionPartImpl.this, AnalysisViewsRepository.InputStimulus.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputStimulusPropertiesEditionPartImpl.this, AnalysisViewsRepository.InputStimulus.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, AnalysisViewsRepository.InputStimulus.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.InputStimulus.Properties.name, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createParent_FlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.InputStimulus.Properties.parent_, AnalysisMessages.InputStimulusPropertiesEditionPart_Parent_Label);
		parent_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.InputStimulus.Properties.parent_, AnalysisViewsRepository.SWT_KIND));
		parent_.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parent_.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputStimulusPropertiesEditionPartImpl.this, AnalysisViewsRepository.InputStimulus.Properties.parent_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParent_()));
			}

		});
		GridData parent_Data = new GridData(GridData.FILL_HORIZONTAL);
		parent_.setLayoutData(parent_Data);
		parent_.setID(AnalysisViewsRepository.InputStimulus.Properties.parent_);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.InputStimulus.Properties.parent_, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createParent_FlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createOutputPortsAdvancedTableComposition(Composite parent) {
		this.outputPorts = new ReferencesTable(getDescription(AnalysisViewsRepository.InputStimulus.Properties.outputPorts, AnalysisMessages.InputStimulusPropertiesEditionPart_OutputPortsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputStimulusPropertiesEditionPartImpl.this, AnalysisViewsRepository.InputStimulus.Properties.outputPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				outputPorts.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputStimulusPropertiesEditionPartImpl.this, AnalysisViewsRepository.InputStimulus.Properties.outputPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				outputPorts.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputStimulusPropertiesEditionPartImpl.this, AnalysisViewsRepository.InputStimulus.Properties.outputPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				outputPorts.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputStimulusPropertiesEditionPartImpl.this, AnalysisViewsRepository.InputStimulus.Properties.outputPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				outputPorts.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.outputPortsFilters) {
			this.outputPorts.addFilter(filter);
		}
		this.outputPorts.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.InputStimulus.Properties.outputPorts, AnalysisViewsRepository.SWT_KIND));
		this.outputPorts.createControls(parent);
		this.outputPorts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InputStimulusPropertiesEditionPartImpl.this, AnalysisViewsRepository.InputStimulus.Properties.outputPorts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outputPortsData = new GridData(GridData.FILL_HORIZONTAL);
		outputPortsData.horizontalSpan = 3;
		this.outputPorts.setLayoutData(outputPortsData);
		this.outputPorts.setLowerBound(0);
		this.outputPorts.setUpperBound(-1);
		outputPorts.setID(AnalysisViewsRepository.InputStimulus.Properties.outputPorts);
		outputPorts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOutputPortsAdvancedTableComposition

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
	 * @see org.polarsys.time4sys.ui.analysis.parts.InputStimulusPropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.InputStimulusPropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.InputStimulus.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(AnalysisMessages.InputStimulus_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.InputStimulusPropertiesEditionPart#getParent_()
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.InputStimulusPropertiesEditionPart#initParent_(EObjectFlatComboSettings)
	 */
	public void initParent_(EObjectFlatComboSettings settings) {
		parent_.setInput(settings);
		if (current != null) {
			parent_.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.InputStimulus.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.InputStimulus_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.InputStimulusPropertiesEditionPart#setParent_(EObject newValue)
	 * @generated
	 */
	public void setParent_(EObject newValue) {
		if (newValue != null) {
			parent_.setSelection(new StructuredSelection(newValue));
		} else {
			parent_.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.InputStimulus.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.InputStimulus_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.InputStimulusPropertiesEditionPart#setParent_ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue) {
		parent_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.InputStimulusPropertiesEditionPart#addFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToParent_(ViewerFilter filter) {
		parent_.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.InputStimulusPropertiesEditionPart#addBusinessFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToParent_(ViewerFilter filter) {
		parent_.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.InputStimulusPropertiesEditionPart#initOutputPorts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOutputPorts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outputPorts.setContentProvider(contentProvider);
		outputPorts.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.InputStimulus.Properties.outputPorts);
		if (eefElementEditorReadOnlyState && outputPorts.isEnabled()) {
			outputPorts.setEnabled(false);
			outputPorts.setToolTipText(AnalysisMessages.InputStimulus_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !outputPorts.isEnabled()) {
			outputPorts.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.InputStimulusPropertiesEditionPart#updateOutputPorts()
	 * @generated
	 */
	public void updateOutputPorts() {
	outputPorts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.InputStimulusPropertiesEditionPart#addFilterOutputPorts(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToOutputPorts(ViewerFilter filter) {
		outputPortsFilters.add(filter);
		if (this.outputPorts != null) {
			this.outputPorts.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.InputStimulusPropertiesEditionPart#addBusinessFilterOutputPorts(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToOutputPorts(ViewerFilter filter) {
		outputPortsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.InputStimulusPropertiesEditionPart#isContainedInOutputPortsTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInOutputPortsTable(EObject element) {
		return ((ReferencesTableSettings)outputPorts.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return AnalysisMessages.InputStimulus_Part_Title;
	}



}
