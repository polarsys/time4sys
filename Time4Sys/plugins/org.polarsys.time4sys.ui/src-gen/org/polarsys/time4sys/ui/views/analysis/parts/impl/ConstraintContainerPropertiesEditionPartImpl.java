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
import org.polarsys.time4sys.ui.views.analysis.parts.ConstraintContainerPropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class ConstraintContainerPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ConstraintContainerPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable constraints;
	protected List<ViewerFilter> constraintsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> constraintsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer analyzedSystem;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public ConstraintContainerPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence constraintContainerStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = constraintContainerStep.addStep(AnalysisViewsRepository.ConstraintContainer.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.ConstraintContainer.Properties.name);
		propertiesStep.addStep(AnalysisViewsRepository.ConstraintContainer.Properties.constraints);
		propertiesStep.addStep(AnalysisViewsRepository.ConstraintContainer.Properties.analyzedSystem);
		
		
		composer = new PartComposer(constraintContainerStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.ConstraintContainer.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == AnalysisViewsRepository.ConstraintContainer.Properties.name) {
					return createNameText(parent);
				}
				if (key == AnalysisViewsRepository.ConstraintContainer.Properties.constraints) {
					return createConstraintsAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.ConstraintContainer.Properties.analyzedSystem) {
					return createAnalyzedSystemFlatComboViewer(parent);
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
		propertiesGroup.setText(AnalysisMessages.ConstraintContainerPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, AnalysisViewsRepository.ConstraintContainer.Properties.name, AnalysisMessages.ConstraintContainerPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintContainerPropertiesEditionPartImpl.this, AnalysisViewsRepository.ConstraintContainer.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintContainerPropertiesEditionPartImpl.this, AnalysisViewsRepository.ConstraintContainer.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, AnalysisViewsRepository.ConstraintContainer.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ConstraintContainer.Properties.name, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createConstraintsAdvancedTableComposition(Composite parent) {
		this.constraints = new ReferencesTable(getDescription(AnalysisViewsRepository.ConstraintContainer.Properties.constraints, AnalysisMessages.ConstraintContainerPropertiesEditionPart_ConstraintsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintContainerPropertiesEditionPartImpl.this, AnalysisViewsRepository.ConstraintContainer.Properties.constraints, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				constraints.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintContainerPropertiesEditionPartImpl.this, AnalysisViewsRepository.ConstraintContainer.Properties.constraints, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				constraints.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintContainerPropertiesEditionPartImpl.this, AnalysisViewsRepository.ConstraintContainer.Properties.constraints, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				constraints.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintContainerPropertiesEditionPartImpl.this, AnalysisViewsRepository.ConstraintContainer.Properties.constraints, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				constraints.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.constraintsFilters) {
			this.constraints.addFilter(filter);
		}
		this.constraints.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ConstraintContainer.Properties.constraints, AnalysisViewsRepository.SWT_KIND));
		this.constraints.createControls(parent);
		this.constraints.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintContainerPropertiesEditionPartImpl.this, AnalysisViewsRepository.ConstraintContainer.Properties.constraints, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData constraintsData = new GridData(GridData.FILL_HORIZONTAL);
		constraintsData.horizontalSpan = 3;
		this.constraints.setLayoutData(constraintsData);
		this.constraints.setLowerBound(0);
		this.constraints.setUpperBound(-1);
		constraints.setID(AnalysisViewsRepository.ConstraintContainer.Properties.constraints);
		constraints.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createConstraintsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createAnalyzedSystemFlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.ConstraintContainer.Properties.analyzedSystem, AnalysisMessages.ConstraintContainerPropertiesEditionPart_AnalyzedSystemLabel);
		analyzedSystem = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.ConstraintContainer.Properties.analyzedSystem, AnalysisViewsRepository.SWT_KIND));
		analyzedSystem.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		analyzedSystem.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConstraintContainerPropertiesEditionPartImpl.this, AnalysisViewsRepository.ConstraintContainer.Properties.analyzedSystem, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getAnalyzedSystem()));
			}

		});
		GridData analyzedSystemData = new GridData(GridData.FILL_HORIZONTAL);
		analyzedSystem.setLayoutData(analyzedSystemData);
		analyzedSystem.setID(AnalysisViewsRepository.ConstraintContainer.Properties.analyzedSystem);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ConstraintContainer.Properties.analyzedSystem, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createAnalyzedSystemFlatComboViewer

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
	 * @see org.polarsys.time4sys.ui.analysis.parts.ConstraintContainerPropertiesEditionPart#getName()
	 * @generated
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ConstraintContainerPropertiesEditionPart#setName(String newValue)
	 * @generated
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ConstraintContainer.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(AnalysisMessages.ConstraintContainer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ConstraintContainerPropertiesEditionPart#initConstraints(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initConstraints(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		constraints.setContentProvider(contentProvider);
		constraints.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ConstraintContainer.Properties.constraints);
		if (eefElementEditorReadOnlyState && constraints.isEnabled()) {
			constraints.setEnabled(false);
			constraints.setToolTipText(AnalysisMessages.ConstraintContainer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !constraints.isEnabled()) {
			constraints.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ConstraintContainerPropertiesEditionPart#updateConstraints()
	 * @generated
	 */
	public void updateConstraints() {
	constraints.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ConstraintContainerPropertiesEditionPart#addFilterConstraints(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToConstraints(ViewerFilter filter) {
		constraintsFilters.add(filter);
		if (this.constraints != null) {
			this.constraints.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ConstraintContainerPropertiesEditionPart#addBusinessFilterConstraints(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToConstraints(ViewerFilter filter) {
		constraintsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ConstraintContainerPropertiesEditionPart#isContainedInConstraintsTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInConstraintsTable(EObject element) {
		return ((ReferencesTableSettings)constraints.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ConstraintContainerPropertiesEditionPart#getAnalyzedSystem()
	 * @generated
	 */
	public EObject getAnalyzedSystem() {
		if (analyzedSystem.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) analyzedSystem.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ConstraintContainerPropertiesEditionPart#initAnalyzedSystem(EObjectFlatComboSettings)
	 */
	public void initAnalyzedSystem(EObjectFlatComboSettings settings) {
		analyzedSystem.setInput(settings);
		if (current != null) {
			analyzedSystem.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ConstraintContainer.Properties.analyzedSystem);
		if (eefElementEditorReadOnlyState && analyzedSystem.isEnabled()) {
			analyzedSystem.setEnabled(false);
			analyzedSystem.setToolTipText(AnalysisMessages.ConstraintContainer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !analyzedSystem.isEnabled()) {
			analyzedSystem.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ConstraintContainerPropertiesEditionPart#setAnalyzedSystem(EObject newValue)
	 * @generated
	 */
	public void setAnalyzedSystem(EObject newValue) {
		if (newValue != null) {
			analyzedSystem.setSelection(new StructuredSelection(newValue));
		} else {
			analyzedSystem.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ConstraintContainer.Properties.analyzedSystem);
		if (eefElementEditorReadOnlyState && analyzedSystem.isEnabled()) {
			analyzedSystem.setEnabled(false);
			analyzedSystem.setToolTipText(AnalysisMessages.ConstraintContainer_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !analyzedSystem.isEnabled()) {
			analyzedSystem.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ConstraintContainerPropertiesEditionPart#setAnalyzedSystemButtonMode(ButtonsModeEnum newValue)
	 */
	public void setAnalyzedSystemButtonMode(ButtonsModeEnum newValue) {
		analyzedSystem.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ConstraintContainerPropertiesEditionPart#addFilterAnalyzedSystem(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToAnalyzedSystem(ViewerFilter filter) {
		analyzedSystem.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ConstraintContainerPropertiesEditionPart#addBusinessFilterAnalyzedSystem(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToAnalyzedSystem(ViewerFilter filter) {
		analyzedSystem.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * @generated
	 */
	public String getTitle() {
		return AnalysisMessages.ConstraintContainer_Part_Title;
	}



}
