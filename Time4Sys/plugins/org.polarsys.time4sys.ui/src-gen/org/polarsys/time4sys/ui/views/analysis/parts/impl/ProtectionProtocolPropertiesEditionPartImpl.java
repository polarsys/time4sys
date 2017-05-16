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
import org.polarsys.time4sys.ui.views.analysis.parts.ProtectionProtocolPropertiesEditionPart;

import org.polarsys.time4sys.ui.views.analysis.providers.AnalysisMessages;


/**
 * 
 * @generated
 */
public class ProtectionProtocolPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ProtectionProtocolPropertiesEditionPart {

	protected Text protocolName;
	protected ReferencesTable mutexes;
	protected List<ViewerFilter> mutexesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> mutexesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable requiredParameters;
	protected List<ViewerFilter> requiredParametersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> requiredParametersFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable resourceParameterValue;
	protected List<ViewerFilter> resourceParameterValueBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resourceParameterValueFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer parent_;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * @generated
	 */
	public ProtectionProtocolPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence protectionProtocolStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = protectionProtocolStep.addStep(AnalysisViewsRepository.ProtectionProtocol.Properties.class);
		propertiesStep.addStep(AnalysisViewsRepository.ProtectionProtocol.Properties.protocolName);
		propertiesStep.addStep(AnalysisViewsRepository.ProtectionProtocol.Properties.mutexes);
		propertiesStep.addStep(AnalysisViewsRepository.ProtectionProtocol.Properties.requiredParameters);
		propertiesStep.addStep(AnalysisViewsRepository.ProtectionProtocol.Properties.resourceParameterValue);
		propertiesStep.addStep(AnalysisViewsRepository.ProtectionProtocol.Properties.parent_);
		
		
		composer = new PartComposer(protectionProtocolStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AnalysisViewsRepository.ProtectionProtocol.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == AnalysisViewsRepository.ProtectionProtocol.Properties.protocolName) {
					return createProtocolNameText(parent);
				}
				if (key == AnalysisViewsRepository.ProtectionProtocol.Properties.mutexes) {
					return createMutexesAdvancedReferencesTable(parent);
				}
				if (key == AnalysisViewsRepository.ProtectionProtocol.Properties.requiredParameters) {
					return createRequiredParametersAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.ProtectionProtocol.Properties.resourceParameterValue) {
					return createResourceParameterValueAdvancedTableComposition(parent);
				}
				if (key == AnalysisViewsRepository.ProtectionProtocol.Properties.parent_) {
					return createParent_FlatComboViewer(parent);
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
		propertiesGroup.setText(AnalysisMessages.ProtectionProtocolPropertiesEditionPart_PropertiesGroupLabel);
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
	
	protected Composite createProtocolNameText(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.ProtectionProtocol.Properties.protocolName, AnalysisMessages.ProtectionProtocolPropertiesEditionPart_ProtocolNameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.protocolName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, protocolName.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.protocolName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, protocolName.getText()));
				}
			}

		});
		EditingUtils.setID(protocolName, AnalysisViewsRepository.ProtectionProtocol.Properties.protocolName);
		EditingUtils.setEEFtype(protocolName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ProtectionProtocol.Properties.protocolName, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createProtocolNameText

		// End of user code
		return parent;
	}

	/**
	 * @generated
	 */
	protected Composite createMutexesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(AnalysisViewsRepository.ProtectionProtocol.Properties.mutexes, AnalysisMessages.ProtectionProtocolPropertiesEditionPart_MutexesLabel);		 
		this.mutexes = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addMutexes(); }
			public void handleEdit(EObject element) { editMutexes(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMutexes(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMutexes(element); }
			public void navigateTo(EObject element) { }
		});
		this.mutexes.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ProtectionProtocol.Properties.mutexes, AnalysisViewsRepository.SWT_KIND));
		this.mutexes.createControls(parent);
		this.mutexes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.mutexes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData mutexesData = new GridData(GridData.FILL_HORIZONTAL);
		mutexesData.horizontalSpan = 3;
		this.mutexes.setLayoutData(mutexesData);
		this.mutexes.disableMove();
		mutexes.setID(AnalysisViewsRepository.ProtectionProtocol.Properties.mutexes);
		mutexes.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @generated
	 */
	protected void addMutexes() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(mutexes.getInput(), mutexesFilters, mutexesBusinessFilters,
		"mutexes", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.mutexes,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				mutexes.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * @generated
	 */
	protected void moveMutexes(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.mutexes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		mutexes.refresh();
	}

	/**
	 * @generated
	 */
	protected void removeFromMutexes(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.mutexes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		mutexes.refresh();
	}

	/**
	 * @generated
	 */
	protected void editMutexes(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				mutexes.refresh();
			}
		}
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createRequiredParametersAdvancedTableComposition(Composite parent) {
		this.requiredParameters = new ReferencesTable(getDescription(AnalysisViewsRepository.ProtectionProtocol.Properties.requiredParameters, AnalysisMessages.ProtectionProtocolPropertiesEditionPart_RequiredParametersLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.requiredParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				requiredParameters.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.requiredParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				requiredParameters.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.requiredParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				requiredParameters.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.requiredParameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				requiredParameters.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.requiredParametersFilters) {
			this.requiredParameters.addFilter(filter);
		}
		this.requiredParameters.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ProtectionProtocol.Properties.requiredParameters, AnalysisViewsRepository.SWT_KIND));
		this.requiredParameters.createControls(parent);
		this.requiredParameters.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.requiredParameters, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData requiredParametersData = new GridData(GridData.FILL_HORIZONTAL);
		requiredParametersData.horizontalSpan = 3;
		this.requiredParameters.setLayoutData(requiredParametersData);
		this.requiredParameters.setLowerBound(0);
		this.requiredParameters.setUpperBound(-1);
		requiredParameters.setID(AnalysisViewsRepository.ProtectionProtocol.Properties.requiredParameters);
		requiredParameters.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createRequiredParametersAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * @generated
	 */
	protected Composite createResourceParameterValueAdvancedTableComposition(Composite parent) {
		this.resourceParameterValue = new ReferencesTable(getDescription(AnalysisViewsRepository.ProtectionProtocol.Properties.resourceParameterValue, AnalysisMessages.ProtectionProtocolPropertiesEditionPart_ResourceParameterValueLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.resourceParameterValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				resourceParameterValue.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.resourceParameterValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				resourceParameterValue.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.resourceParameterValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				resourceParameterValue.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.resourceParameterValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				resourceParameterValue.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.resourceParameterValueFilters) {
			this.resourceParameterValue.addFilter(filter);
		}
		this.resourceParameterValue.setHelpText(propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ProtectionProtocol.Properties.resourceParameterValue, AnalysisViewsRepository.SWT_KIND));
		this.resourceParameterValue.createControls(parent);
		this.resourceParameterValue.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.resourceParameterValue, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resourceParameterValueData = new GridData(GridData.FILL_HORIZONTAL);
		resourceParameterValueData.horizontalSpan = 3;
		this.resourceParameterValue.setLayoutData(resourceParameterValueData);
		this.resourceParameterValue.setLowerBound(0);
		this.resourceParameterValue.setUpperBound(-1);
		resourceParameterValue.setID(AnalysisViewsRepository.ProtectionProtocol.Properties.resourceParameterValue);
		resourceParameterValue.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createResourceParameterValueAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @generated
	 */
	protected Composite createParent_FlatComboViewer(Composite parent) {
		createDescription(parent, AnalysisViewsRepository.ProtectionProtocol.Properties.parent_, AnalysisMessages.ProtectionProtocolPropertiesEditionPart_Parent_Label);
		parent_ = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(AnalysisViewsRepository.ProtectionProtocol.Properties.parent_, AnalysisViewsRepository.SWT_KIND));
		parent_.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		parent_.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ProtectionProtocolPropertiesEditionPartImpl.this, AnalysisViewsRepository.ProtectionProtocol.Properties.parent_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getParent_()));
			}

		});
		GridData parent_Data = new GridData(GridData.FILL_HORIZONTAL);
		parent_.setLayoutData(parent_Data);
		parent_.setID(AnalysisViewsRepository.ProtectionProtocol.Properties.parent_);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AnalysisViewsRepository.ProtectionProtocol.Properties.parent_, AnalysisViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#getProtocolName()
	 * @generated
	 */
	public String getProtocolName() {
		return protocolName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#setProtocolName(String newValue)
	 * @generated
	 */
	public void setProtocolName(String newValue) {
		if (newValue != null) {
			protocolName.setText(newValue);
		} else {
			protocolName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ProtectionProtocol.Properties.protocolName);
		if (eefElementEditorReadOnlyState && protocolName.isEnabled()) {
			protocolName.setEnabled(false);
			protocolName.setToolTipText(AnalysisMessages.ProtectionProtocol_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !protocolName.isEnabled()) {
			protocolName.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#initMutexes(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMutexes(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		mutexes.setContentProvider(contentProvider);
		mutexes.setInput(settings);
		mutexesBusinessFilters.clear();
		mutexesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ProtectionProtocol.Properties.mutexes);
		if (eefElementEditorReadOnlyState && mutexes.getTable().isEnabled()) {
			mutexes.setEnabled(false);
			mutexes.setToolTipText(AnalysisMessages.ProtectionProtocol_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mutexes.getTable().isEnabled()) {
			mutexes.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#updateMutexes()
	 * @generated
	 */
	public void updateMutexes() {
	mutexes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#addFilterMutexes(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToMutexes(ViewerFilter filter) {
		mutexesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#addBusinessFilterMutexes(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToMutexes(ViewerFilter filter) {
		mutexesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#isContainedInMutexesTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInMutexesTable(EObject element) {
		return ((ReferencesTableSettings)mutexes.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#initRequiredParameters(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initRequiredParameters(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		requiredParameters.setContentProvider(contentProvider);
		requiredParameters.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ProtectionProtocol.Properties.requiredParameters);
		if (eefElementEditorReadOnlyState && requiredParameters.isEnabled()) {
			requiredParameters.setEnabled(false);
			requiredParameters.setToolTipText(AnalysisMessages.ProtectionProtocol_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !requiredParameters.isEnabled()) {
			requiredParameters.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#updateRequiredParameters()
	 * @generated
	 */
	public void updateRequiredParameters() {
	requiredParameters.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#addFilterRequiredParameters(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToRequiredParameters(ViewerFilter filter) {
		requiredParametersFilters.add(filter);
		if (this.requiredParameters != null) {
			this.requiredParameters.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#addBusinessFilterRequiredParameters(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToRequiredParameters(ViewerFilter filter) {
		requiredParametersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#isContainedInRequiredParametersTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInRequiredParametersTable(EObject element) {
		return ((ReferencesTableSettings)requiredParameters.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#initResourceParameterValue(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initResourceParameterValue(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resourceParameterValue.setContentProvider(contentProvider);
		resourceParameterValue.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ProtectionProtocol.Properties.resourceParameterValue);
		if (eefElementEditorReadOnlyState && resourceParameterValue.isEnabled()) {
			resourceParameterValue.setEnabled(false);
			resourceParameterValue.setToolTipText(AnalysisMessages.ProtectionProtocol_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resourceParameterValue.isEnabled()) {
			resourceParameterValue.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#updateResourceParameterValue()
	 * @generated
	 */
	public void updateResourceParameterValue() {
	resourceParameterValue.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#addFilterResourceParameterValue(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToResourceParameterValue(ViewerFilter filter) {
		resourceParameterValueFilters.add(filter);
		if (this.resourceParameterValue != null) {
			this.resourceParameterValue.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#addBusinessFilterResourceParameterValue(ViewerFilter filter)
	 * @generated
	 */
	public void addBusinessFilterToResourceParameterValue(ViewerFilter filter) {
		resourceParameterValueBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#isContainedInResourceParameterValueTable(EObject element)
	 * @generated
	 */
	public boolean isContainedInResourceParameterValueTable(EObject element) {
		return ((ReferencesTableSettings)resourceParameterValue.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#getParent_()
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
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#initParent_(EObjectFlatComboSettings)
	 */
	public void initParent_(EObjectFlatComboSettings settings) {
		parent_.setInput(settings);
		if (current != null) {
			parent_.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ProtectionProtocol.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.ProtectionProtocol_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#setParent_(EObject newValue)
	 * @generated
	 */
	public void setParent_(EObject newValue) {
		if (newValue != null) {
			parent_.setSelection(new StructuredSelection(newValue));
		} else {
			parent_.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(AnalysisViewsRepository.ProtectionProtocol.Properties.parent_);
		if (eefElementEditorReadOnlyState && parent_.isEnabled()) {
			parent_.setEnabled(false);
			parent_.setToolTipText(AnalysisMessages.ProtectionProtocol_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !parent_.isEnabled()) {
			parent_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#setParent_ButtonMode(ButtonsModeEnum newValue)
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue) {
		parent_.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#addFilterParent_(ViewerFilter filter)
	 * @generated
	 */
	public void addFilterToParent_(ViewerFilter filter) {
		parent_.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.analysis.parts.ProtectionProtocolPropertiesEditionPart#addBusinessFilterParent_(ViewerFilter filter)
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
		return AnalysisMessages.ProtectionProtocol_Part_Title;
	}



}
