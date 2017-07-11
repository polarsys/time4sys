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
package org.polarsys.time4sys.ui.views.library.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.polarsys.time4sys.library.LibraryPackage;
import org.polarsys.time4sys.ui.views.library.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.library.parts.LibraryViewsRepository;
import org.polarsys.time4sys.ui.views.library.providers.LibraryMessages;

// End of user code

/**
 * 
 * 
 */
public class GeneralPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, GeneralPropertiesEditionPart {

	protected Text name;
	protected Button isSynchronous;
	protected Button isProtected;
	protected Button isActive;
	protected Text resMult;
	protected EMFComboViewer policy;
	protected Text otherSchedPolicy;
	protected Text slot;
	protected Button editSlot;
	private EList slotList;
	protected EObjectFlatComboViewer clock;
	protected ReferencesTable usedBy;
	protected List<ViewerFilter> usedByBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> usedByFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable realizedBy;
	protected List<ViewerFilter> realizedByBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> realizedByFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedResource;
	protected List<ViewerFilter> ownedResourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedResourceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedPort;
	protected List<ViewerFilter> ownedPortBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedPortFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedConnector;
	protected List<ViewerFilter> ownedConnectorBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedConnectorFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GeneralPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
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
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence generalStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = generalStep.addStep(LibraryViewsRepository.General.Properties.class);
		propertiesStep.addStep(LibraryViewsRepository.General.Properties.name);
		propertiesStep.addStep(LibraryViewsRepository.General.Properties.isSynchronous);
		propertiesStep.addStep(LibraryViewsRepository.General.Properties.isProtected);
		propertiesStep.addStep(LibraryViewsRepository.General.Properties.isActive);
		propertiesStep.addStep(LibraryViewsRepository.General.Properties.resMult);
		propertiesStep.addStep(LibraryViewsRepository.General.Properties.policy);
		propertiesStep.addStep(LibraryViewsRepository.General.Properties.otherSchedPolicy);
		propertiesStep.addStep(LibraryViewsRepository.General.Properties.slot);
		propertiesStep.addStep(LibraryViewsRepository.General.Properties.clock);
		propertiesStep.addStep(LibraryViewsRepository.General.Properties.usedBy);
		propertiesStep.addStep(LibraryViewsRepository.General.Properties.realizedBy);
		propertiesStep.addStep(LibraryViewsRepository.General.Properties.ownedResource);
		propertiesStep.addStep(LibraryViewsRepository.General.Properties.ownedPort);
		propertiesStep.addStep(LibraryViewsRepository.General.Properties.ownedConnector);
		
		
		composer = new PartComposer(generalStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == LibraryViewsRepository.General.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == LibraryViewsRepository.General.Properties.name) {
					return createNameText(parent);
				}
				if (key == LibraryViewsRepository.General.Properties.isSynchronous) {
					return createIsSynchronousCheckbox(parent);
				}
				if (key == LibraryViewsRepository.General.Properties.isProtected) {
					return createIsProtectedCheckbox(parent);
				}
				if (key == LibraryViewsRepository.General.Properties.isActive) {
					return createIsActiveCheckbox(parent);
				}
				if (key == LibraryViewsRepository.General.Properties.resMult) {
					return createResMultText(parent);
				}
				if (key == LibraryViewsRepository.General.Properties.policy) {
					return createPolicyEMFComboViewer(parent);
				}
				if (key == LibraryViewsRepository.General.Properties.otherSchedPolicy) {
					return createOtherSchedPolicyText(parent);
				}
				if (key == LibraryViewsRepository.General.Properties.slot) {
					return createSlotMultiValuedEditor(parent);
				}
				if (key == LibraryViewsRepository.General.Properties.clock) {
					return createClockFlatComboViewer(parent);
				}
				if (key == LibraryViewsRepository.General.Properties.usedBy) {
					return createUsedByAdvancedReferencesTable(parent);
				}
				if (key == LibraryViewsRepository.General.Properties.realizedBy) {
					return createRealizedByAdvancedReferencesTable(parent);
				}
				if (key == LibraryViewsRepository.General.Properties.ownedResource) {
					return createOwnedResourceAdvancedTableComposition(parent);
				}
				if (key == LibraryViewsRepository.General.Properties.ownedPort) {
					return createOwnedPortAdvancedTableComposition(parent);
				}
				if (key == LibraryViewsRepository.General.Properties.ownedConnector) {
					return createOwnedConnectorAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(LibraryMessages.GeneralPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, LibraryViewsRepository.General.Properties.name, LibraryMessages.GeneralPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, LibraryViewsRepository.General.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.General.Properties.name, LibraryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createIsSynchronousCheckbox(Composite parent) {
		isSynchronous = new Button(parent, SWT.CHECK);
		isSynchronous.setText(getDescription(LibraryViewsRepository.General.Properties.isSynchronous, LibraryMessages.GeneralPropertiesEditionPart_IsSynchronousLabel));
		isSynchronous.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.isSynchronous, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isSynchronous.getSelection())));
			}

		});
		GridData isSynchronousData = new GridData(GridData.FILL_HORIZONTAL);
		isSynchronousData.horizontalSpan = 2;
		isSynchronous.setLayoutData(isSynchronousData);
		EditingUtils.setID(isSynchronous, LibraryViewsRepository.General.Properties.isSynchronous);
		EditingUtils.setEEFtype(isSynchronous, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.General.Properties.isSynchronous, LibraryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsSynchronousCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createIsProtectedCheckbox(Composite parent) {
		isProtected = new Button(parent, SWT.CHECK);
		isProtected.setText(getDescription(LibraryViewsRepository.General.Properties.isProtected, LibraryMessages.GeneralPropertiesEditionPart_IsProtectedLabel));
		isProtected.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.isProtected, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isProtected.getSelection())));
			}

		});
		GridData isProtectedData = new GridData(GridData.FILL_HORIZONTAL);
		isProtectedData.horizontalSpan = 2;
		isProtected.setLayoutData(isProtectedData);
		EditingUtils.setID(isProtected, LibraryViewsRepository.General.Properties.isProtected);
		EditingUtils.setEEFtype(isProtected, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.General.Properties.isProtected, LibraryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsProtectedCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createIsActiveCheckbox(Composite parent) {
		isActive = new Button(parent, SWT.CHECK);
		isActive.setText(getDescription(LibraryViewsRepository.General.Properties.isActive, LibraryMessages.GeneralPropertiesEditionPart_IsActiveLabel));
		isActive.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.isActive, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isActive.getSelection())));
			}

		});
		GridData isActiveData = new GridData(GridData.FILL_HORIZONTAL);
		isActiveData.horizontalSpan = 2;
		isActive.setLayoutData(isActiveData);
		EditingUtils.setID(isActive, LibraryViewsRepository.General.Properties.isActive);
		EditingUtils.setEEFtype(isActive, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.General.Properties.isActive, LibraryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createIsActiveCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createResMultText(Composite parent) {
		createDescription(parent, LibraryViewsRepository.General.Properties.resMult, LibraryMessages.GeneralPropertiesEditionPart_ResMultLabel);
		resMult = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData resMultData = new GridData(GridData.FILL_HORIZONTAL);
		resMult.setLayoutData(resMultData);
		resMult.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.resMult, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resMult.getText()));
			}

		});
		resMult.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.resMult, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resMult.getText()));
				}
			}

		});
		EditingUtils.setID(resMult, LibraryViewsRepository.General.Properties.resMult);
		EditingUtils.setEEFtype(resMult, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.General.Properties.resMult, LibraryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createResMultText

		// End of user code
		return parent;
	}

	
	protected Composite createPolicyEMFComboViewer(Composite parent) {
		createDescription(parent, LibraryViewsRepository.General.Properties.policy, LibraryMessages.GeneralPropertiesEditionPart_PolicyLabel);
		policy = new EMFComboViewer(parent);
		policy.setContentProvider(new ArrayContentProvider());
		policy.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData policyData = new GridData(GridData.FILL_HORIZONTAL);
		policy.getCombo().setLayoutData(policyData);
		policy.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.policy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPolicy()));
			}

		});
		policy.setID(LibraryViewsRepository.General.Properties.policy);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.General.Properties.policy, LibraryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPolicyEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createOtherSchedPolicyText(Composite parent) {
		createDescription(parent, LibraryViewsRepository.General.Properties.otherSchedPolicy, LibraryMessages.GeneralPropertiesEditionPart_OtherSchedPolicyLabel);
		otherSchedPolicy = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData otherSchedPolicyData = new GridData(GridData.FILL_HORIZONTAL);
		otherSchedPolicy.setLayoutData(otherSchedPolicyData);
		otherSchedPolicy.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.otherSchedPolicy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, otherSchedPolicy.getText()));
			}

		});
		otherSchedPolicy.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.otherSchedPolicy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, otherSchedPolicy.getText()));
				}
			}

		});
		EditingUtils.setID(otherSchedPolicy, LibraryViewsRepository.General.Properties.otherSchedPolicy);
		EditingUtils.setEEFtype(otherSchedPolicy, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.General.Properties.otherSchedPolicy, LibraryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createOtherSchedPolicyText

		// End of user code
		return parent;
	}

	protected Composite createSlotMultiValuedEditor(Composite parent) {
		slot = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData slotData = new GridData(GridData.FILL_HORIZONTAL);
		slotData.horizontalSpan = 2;
		slot.setLayoutData(slotData);
		EditingUtils.setID(slot, LibraryViewsRepository.General.Properties.slot);
		EditingUtils.setEEFtype(slot, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editSlot = new Button(parent, SWT.NONE);
		editSlot.setText(getDescription(LibraryViewsRepository.General.Properties.slot, LibraryMessages.GeneralPropertiesEditionPart_SlotLabel));
		GridData editSlotData = new GridData();
		editSlot.setLayoutData(editSlotData);
		editSlot.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						slot.getShell(), "HardwareCANBus", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						slotList, LibraryPackage.eINSTANCE.getTDMA_Slot().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					slotList = dialog.getResult();
					if (slotList == null) {
						slotList = new BasicEList();
					}
					slot.setText(slotList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.slot, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(slotList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editSlot, LibraryViewsRepository.General.Properties.slot);
		EditingUtils.setEEFtype(editSlot, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createSlotMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createClockFlatComboViewer(Composite parent) {
		createDescription(parent, LibraryViewsRepository.General.Properties.clock, LibraryMessages.GeneralPropertiesEditionPart_ClockLabel);
		clock = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(LibraryViewsRepository.General.Properties.clock, LibraryViewsRepository.SWT_KIND));
		clock.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		clock.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.clock, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getClock()));
			}

		});
		GridData clockData = new GridData(GridData.FILL_HORIZONTAL);
		clock.setLayoutData(clockData);
		clock.setID(LibraryViewsRepository.General.Properties.clock);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(LibraryViewsRepository.General.Properties.clock, LibraryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createClockFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createUsedByAdvancedReferencesTable(Composite parent) {
		String label = getDescription(LibraryViewsRepository.General.Properties.usedBy, LibraryMessages.GeneralPropertiesEditionPart_UsedByLabel);		 
		this.usedBy = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addUsedBy(); }
			public void handleEdit(EObject element) { editUsedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveUsedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromUsedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.usedBy.setHelpText(propertiesEditionComponent.getHelpContent(LibraryViewsRepository.General.Properties.usedBy, LibraryViewsRepository.SWT_KIND));
		this.usedBy.createControls(parent);
		this.usedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.usedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData usedByData = new GridData(GridData.FILL_HORIZONTAL);
		usedByData.horizontalSpan = 3;
		this.usedBy.setLayoutData(usedByData);
		this.usedBy.disableMove();
		usedBy.setID(LibraryViewsRepository.General.Properties.usedBy);
		usedBy.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addUsedBy() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(usedBy.getInput(), usedByFilters, usedByBusinessFilters,
		"usedBy", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.usedBy,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				usedBy.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveUsedBy(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.usedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		usedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromUsedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.usedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		usedBy.refresh();
	}

	/**
	 * 
	 */
	protected void editUsedBy(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				usedBy.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createRealizedByAdvancedReferencesTable(Composite parent) {
		String label = getDescription(LibraryViewsRepository.General.Properties.realizedBy, LibraryMessages.GeneralPropertiesEditionPart_RealizedByLabel);		 
		this.realizedBy = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addRealizedBy(); }
			public void handleEdit(EObject element) { editRealizedBy(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveRealizedBy(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromRealizedBy(element); }
			public void navigateTo(EObject element) { }
		});
		this.realizedBy.setHelpText(propertiesEditionComponent.getHelpContent(LibraryViewsRepository.General.Properties.realizedBy, LibraryViewsRepository.SWT_KIND));
		this.realizedBy.createControls(parent);
		this.realizedBy.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.realizedBy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData realizedByData = new GridData(GridData.FILL_HORIZONTAL);
		realizedByData.horizontalSpan = 3;
		this.realizedBy.setLayoutData(realizedByData);
		this.realizedBy.disableMove();
		realizedBy.setID(LibraryViewsRepository.General.Properties.realizedBy);
		realizedBy.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addRealizedBy() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(realizedBy.getInput(), realizedByFilters, realizedByBusinessFilters,
		"realizedBy", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.realizedBy,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				realizedBy.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveRealizedBy(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.realizedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		realizedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRealizedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.realizedBy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		realizedBy.refresh();
	}

	/**
	 * 
	 */
	protected void editRealizedBy(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				realizedBy.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedResourceAdvancedTableComposition(Composite parent) {
		this.ownedResource = new ReferencesTable(getDescription(LibraryViewsRepository.General.Properties.ownedResource, LibraryMessages.GeneralPropertiesEditionPart_OwnedResourceLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.ownedResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedResource.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.ownedResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedResource.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.ownedResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedResource.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.ownedResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedResource.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedResourceFilters) {
			this.ownedResource.addFilter(filter);
		}
		this.ownedResource.setHelpText(propertiesEditionComponent.getHelpContent(LibraryViewsRepository.General.Properties.ownedResource, LibraryViewsRepository.SWT_KIND));
		this.ownedResource.createControls(parent);
		this.ownedResource.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.ownedResource, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedResourceData = new GridData(GridData.FILL_HORIZONTAL);
		ownedResourceData.horizontalSpan = 3;
		this.ownedResource.setLayoutData(ownedResourceData);
		this.ownedResource.setLowerBound(0);
		this.ownedResource.setUpperBound(-1);
		ownedResource.setID(LibraryViewsRepository.General.Properties.ownedResource);
		ownedResource.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedResourceAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedPortAdvancedTableComposition(Composite parent) {
		this.ownedPort = new ReferencesTable(getDescription(LibraryViewsRepository.General.Properties.ownedPort, LibraryMessages.GeneralPropertiesEditionPart_OwnedPortLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.ownedPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedPort.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.ownedPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedPort.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.ownedPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedPort.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.ownedPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedPort.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedPortFilters) {
			this.ownedPort.addFilter(filter);
		}
		this.ownedPort.setHelpText(propertiesEditionComponent.getHelpContent(LibraryViewsRepository.General.Properties.ownedPort, LibraryViewsRepository.SWT_KIND));
		this.ownedPort.createControls(parent);
		this.ownedPort.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.ownedPort, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedPortData = new GridData(GridData.FILL_HORIZONTAL);
		ownedPortData.horizontalSpan = 3;
		this.ownedPort.setLayoutData(ownedPortData);
		this.ownedPort.setLowerBound(0);
		this.ownedPort.setUpperBound(-1);
		ownedPort.setID(LibraryViewsRepository.General.Properties.ownedPort);
		ownedPort.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedPortAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedConnectorAdvancedTableComposition(Composite parent) {
		this.ownedConnector = new ReferencesTable(getDescription(LibraryViewsRepository.General.Properties.ownedConnector, LibraryMessages.GeneralPropertiesEditionPart_OwnedConnectorLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.ownedConnector, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				ownedConnector.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.ownedConnector, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				ownedConnector.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.ownedConnector, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				ownedConnector.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.ownedConnector, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				ownedConnector.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.ownedConnectorFilters) {
			this.ownedConnector.addFilter(filter);
		}
		this.ownedConnector.setHelpText(propertiesEditionComponent.getHelpContent(LibraryViewsRepository.General.Properties.ownedConnector, LibraryViewsRepository.SWT_KIND));
		this.ownedConnector.createControls(parent);
		this.ownedConnector.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this, LibraryViewsRepository.General.Properties.ownedConnector, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ownedConnectorData = new GridData(GridData.FILL_HORIZONTAL);
		ownedConnectorData.horizontalSpan = 3;
		this.ownedConnector.setLayoutData(ownedConnectorData);
		this.ownedConnector.setLowerBound(0);
		this.ownedConnector.setUpperBound(-1);
		ownedConnector.setID(LibraryViewsRepository.General.Properties.ownedConnector);
		ownedConnector.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedConnectorAdvancedTableComposition

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.General.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(LibraryMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#getIsSynchronous()
	 * 
	 */
	public Boolean getIsSynchronous() {
		return Boolean.valueOf(isSynchronous.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#setIsSynchronous(Boolean newValue)
	 * 
	 */
	public void setIsSynchronous(Boolean newValue) {
		if (newValue != null) {
			isSynchronous.setSelection(newValue.booleanValue());
		} else {
			isSynchronous.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.General.Properties.isSynchronous);
		if (eefElementEditorReadOnlyState && isSynchronous.isEnabled()) {
			isSynchronous.setEnabled(false);
			isSynchronous.setToolTipText(LibraryMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isSynchronous.isEnabled()) {
			isSynchronous.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#getIsProtected()
	 * 
	 */
	public Boolean getIsProtected() {
		return Boolean.valueOf(isProtected.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#setIsProtected(Boolean newValue)
	 * 
	 */
	public void setIsProtected(Boolean newValue) {
		if (newValue != null) {
			isProtected.setSelection(newValue.booleanValue());
		} else {
			isProtected.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.General.Properties.isProtected);
		if (eefElementEditorReadOnlyState && isProtected.isEnabled()) {
			isProtected.setEnabled(false);
			isProtected.setToolTipText(LibraryMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isProtected.isEnabled()) {
			isProtected.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#getIsActive()
	 * 
	 */
	public Boolean getIsActive() {
		return Boolean.valueOf(isActive.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#setIsActive(Boolean newValue)
	 * 
	 */
	public void setIsActive(Boolean newValue) {
		if (newValue != null) {
			isActive.setSelection(newValue.booleanValue());
		} else {
			isActive.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.General.Properties.isActive);
		if (eefElementEditorReadOnlyState && isActive.isEnabled()) {
			isActive.setEnabled(false);
			isActive.setToolTipText(LibraryMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isActive.isEnabled()) {
			isActive.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#getResMult()
	 * 
	 */
	public String getResMult() {
		return resMult.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#setResMult(String newValue)
	 * 
	 */
	public void setResMult(String newValue) {
		if (newValue != null) {
			resMult.setText(newValue);
		} else {
			resMult.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.General.Properties.resMult);
		if (eefElementEditorReadOnlyState && resMult.isEnabled()) {
			resMult.setEnabled(false);
			resMult.setToolTipText(LibraryMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resMult.isEnabled()) {
			resMult.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#getPolicy()
	 * 
	 */
	public Enumerator getPolicy() {
		Enumerator selection = (Enumerator) ((StructuredSelection) policy.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#initPolicy(Object input, Enumerator current)
	 */
	public void initPolicy(Object input, Enumerator current) {
		policy.setInput(input);
		policy.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.General.Properties.policy);
		if (eefElementEditorReadOnlyState && policy.isEnabled()) {
			policy.setEnabled(false);
			policy.setToolTipText(LibraryMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !policy.isEnabled()) {
			policy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#setPolicy(Enumerator newValue)
	 * 
	 */
	public void setPolicy(Enumerator newValue) {
		policy.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.General.Properties.policy);
		if (eefElementEditorReadOnlyState && policy.isEnabled()) {
			policy.setEnabled(false);
			policy.setToolTipText(LibraryMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !policy.isEnabled()) {
			policy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#getOtherSchedPolicy()
	 * 
	 */
	public String getOtherSchedPolicy() {
		return otherSchedPolicy.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#setOtherSchedPolicy(String newValue)
	 * 
	 */
	public void setOtherSchedPolicy(String newValue) {
		if (newValue != null) {
			otherSchedPolicy.setText(newValue);
		} else {
			otherSchedPolicy.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.General.Properties.otherSchedPolicy);
		if (eefElementEditorReadOnlyState && otherSchedPolicy.isEnabled()) {
			otherSchedPolicy.setEnabled(false);
			otherSchedPolicy.setToolTipText(LibraryMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !otherSchedPolicy.isEnabled()) {
			otherSchedPolicy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#getSlot()
	 * 
	 */
	public EList getSlot() {
		return slotList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#setSlot(EList newValue)
	 * 
	 */
	public void setSlot(EList newValue) {
		slotList = newValue;
		if (newValue != null) {
			slot.setText(slotList.toString());
		} else {
			slot.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.General.Properties.slot);
		if (eefElementEditorReadOnlyState && slot.isEnabled()) {
			slot.setEnabled(false);
			slot.setToolTipText(LibraryMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !slot.isEnabled()) {
			slot.setEnabled(true);
		}	
		
	}

	public void addToSlot(Object newValue) {
		slotList.add(newValue);
		if (newValue != null) {
			slot.setText(slotList.toString());
		} else {
			slot.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToSlot(Object newValue) {
		slotList.remove(newValue);
		if (newValue != null) {
			slot.setText(slotList.toString());
		} else {
			slot.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#getClock()
	 * 
	 */
	public EObject getClock() {
		if (clock.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) clock.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#initClock(EObjectFlatComboSettings)
	 */
	public void initClock(EObjectFlatComboSettings settings) {
		clock.setInput(settings);
		if (current != null) {
			clock.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.General.Properties.clock);
		if (eefElementEditorReadOnlyState && clock.isEnabled()) {
			clock.setEnabled(false);
			clock.setToolTipText(LibraryMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !clock.isEnabled()) {
			clock.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#setClock(EObject newValue)
	 * 
	 */
	public void setClock(EObject newValue) {
		if (newValue != null) {
			clock.setSelection(new StructuredSelection(newValue));
		} else {
			clock.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.General.Properties.clock);
		if (eefElementEditorReadOnlyState && clock.isEnabled()) {
			clock.setEnabled(false);
			clock.setToolTipText(LibraryMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !clock.isEnabled()) {
			clock.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#setClockButtonMode(ButtonsModeEnum newValue)
	 */
	public void setClockButtonMode(ButtonsModeEnum newValue) {
		clock.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#addFilterClock(ViewerFilter filter)
	 * 
	 */
	public void addFilterToClock(ViewerFilter filter) {
		clock.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#addBusinessFilterClock(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToClock(ViewerFilter filter) {
		clock.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#initUsedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initUsedBy(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		usedBy.setContentProvider(contentProvider);
		usedBy.setInput(settings);
		usedByBusinessFilters.clear();
		usedByFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.General.Properties.usedBy);
		if (eefElementEditorReadOnlyState && usedBy.getTable().isEnabled()) {
			usedBy.setEnabled(false);
			usedBy.setToolTipText(LibraryMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usedBy.getTable().isEnabled()) {
			usedBy.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#updateUsedBy()
	 * 
	 */
	public void updateUsedBy() {
	usedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#addFilterUsedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToUsedBy(ViewerFilter filter) {
		usedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#addBusinessFilterUsedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToUsedBy(ViewerFilter filter) {
		usedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#isContainedInUsedByTable(EObject element)
	 * 
	 */
	public boolean isContainedInUsedByTable(EObject element) {
		return ((ReferencesTableSettings)usedBy.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#initRealizedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRealizedBy(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		realizedBy.setContentProvider(contentProvider);
		realizedBy.setInput(settings);
		realizedByBusinessFilters.clear();
		realizedByFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.General.Properties.realizedBy);
		if (eefElementEditorReadOnlyState && realizedBy.getTable().isEnabled()) {
			realizedBy.setEnabled(false);
			realizedBy.setToolTipText(LibraryMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !realizedBy.getTable().isEnabled()) {
			realizedBy.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#updateRealizedBy()
	 * 
	 */
	public void updateRealizedBy() {
	realizedBy.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#addFilterRealizedBy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRealizedBy(ViewerFilter filter) {
		realizedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#addBusinessFilterRealizedBy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRealizedBy(ViewerFilter filter) {
		realizedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#isContainedInRealizedByTable(EObject element)
	 * 
	 */
	public boolean isContainedInRealizedByTable(EObject element) {
		return ((ReferencesTableSettings)realizedBy.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#initOwnedResource(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedResource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedResource.setContentProvider(contentProvider);
		ownedResource.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.General.Properties.ownedResource);
		if (eefElementEditorReadOnlyState && ownedResource.isEnabled()) {
			ownedResource.setEnabled(false);
			ownedResource.setToolTipText(LibraryMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedResource.isEnabled()) {
			ownedResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#updateOwnedResource()
	 * 
	 */
	public void updateOwnedResource() {
	ownedResource.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#addFilterOwnedResource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnedResource(ViewerFilter filter) {
		ownedResourceFilters.add(filter);
		if (this.ownedResource != null) {
			this.ownedResource.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#addBusinessFilterOwnedResource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedResource(ViewerFilter filter) {
		ownedResourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#isContainedInOwnedResourceTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedResourceTable(EObject element) {
		return ((ReferencesTableSettings)ownedResource.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#initOwnedPort(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedPort(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedPort.setContentProvider(contentProvider);
		ownedPort.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.General.Properties.ownedPort);
		if (eefElementEditorReadOnlyState && ownedPort.isEnabled()) {
			ownedPort.setEnabled(false);
			ownedPort.setToolTipText(LibraryMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedPort.isEnabled()) {
			ownedPort.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#updateOwnedPort()
	 * 
	 */
	public void updateOwnedPort() {
	ownedPort.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#addFilterOwnedPort(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnedPort(ViewerFilter filter) {
		ownedPortFilters.add(filter);
		if (this.ownedPort != null) {
			this.ownedPort.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#addBusinessFilterOwnedPort(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedPort(ViewerFilter filter) {
		ownedPortBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#isContainedInOwnedPortTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedPortTable(EObject element) {
		return ((ReferencesTableSettings)ownedPort.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#initOwnedConnector(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedConnector(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedConnector.setContentProvider(contentProvider);
		ownedConnector.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(LibraryViewsRepository.General.Properties.ownedConnector);
		if (eefElementEditorReadOnlyState && ownedConnector.isEnabled()) {
			ownedConnector.setEnabled(false);
			ownedConnector.setToolTipText(LibraryMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedConnector.isEnabled()) {
			ownedConnector.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#updateOwnedConnector()
	 * 
	 */
	public void updateOwnedConnector() {
	ownedConnector.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#addFilterOwnedConnector(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwnedConnector(ViewerFilter filter) {
		ownedConnectorFilters.add(filter);
		if (this.ownedConnector != null) {
			this.ownedConnector.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#addBusinessFilterOwnedConnector(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwnedConnector(ViewerFilter filter) {
		ownedConnectorBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.library.parts.GeneralPropertiesEditionPart#isContainedInOwnedConnectorTable(EObject element)
	 * 
	 */
	public boolean isContainedInOwnedConnectorTable(EObject element) {
		return ((ReferencesTableSettings)ownedConnector.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return LibraryMessages.General_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
