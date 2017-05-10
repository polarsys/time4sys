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
package org.polarsys.time4sys.ui.views.hrm.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
import org.polarsys.time4sys.ui.views.hrm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.hrm.parts.HrmViewsRepository;
import org.polarsys.time4sys.ui.views.hrm.providers.HrmMessages;

// End of user code

/**
 * 
 * 
 */
public class GeneralPropertiesEditionPartImpl extends CompositePropertiesEditionPart
		implements ISWTPropertiesEditionPart, GeneralPropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer type;
	protected Text family;
	protected EMFComboViewer status;
	protected Text description;
	protected Text speedFactor;
	protected Button memoryProtection;
	protected Text range;
	protected Button isActive;
	protected Button isProtected;
	protected Button isSynchronous;
	protected Button isSerial;
	protected Button isStatic;
	protected Button isNonVolatile;
	protected Text memorySize;
	protected Text addressSize;
	protected Text nbChannels;
	protected Text transferWidth;
	protected Text throughput;
	protected Text level;
	protected Text resMult;
	protected EObjectFlatComboViewer sourcePort;
	protected EObjectFlatComboViewer targetPort;
	protected EObjectFlatComboViewer mainScheduler;
	protected ReferencesTable usedBy;
	protected List<ViewerFilter> usedByBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> usedByFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable realizedBy;
	protected List<ViewerFilter> realizedByBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> realizedByFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable arbiters;
	protected List<ViewerFilter> arbitersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> arbitersFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable sides;
	protected List<ViewerFilter> sidesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sidesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable managedMemories;
	protected List<ViewerFilter> managedMemoriesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> managedMemoriesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable controlledMedia;
	protected List<ViewerFilter> controlledMediaBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> controlledMediaFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable drivenBy;
	protected List<ViewerFilter> drivenByBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> drivenByFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable brokedResource;
	protected List<ViewerFilter> brokedResourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> brokedResourceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedElement;
	protected List<ViewerFilter> ownedElementBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedElementFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedResource;
	protected List<ViewerFilter> ownedResourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedResourceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedConnector;
	protected List<ViewerFilter> ownedConnectorBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedConnectorFilters = new ArrayList<ViewerFilter>();

	/**
	 * Default constructor
	 * 
	 * @param editionComponent
	 *            the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GeneralPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 *      createFigure(org.eclipse.swt.widgets.Composite)
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
	 *      createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) {
		CompositionSequence generalStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = generalStep.addStep(HrmViewsRepository.General.Properties.class);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.name);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.type);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.family);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.status);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.description);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.speedFactor);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.memoryProtection);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.range);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.isActive);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.isProtected);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.isSynchronous);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.isSerial);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.isStatic);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.isNonVolatile);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.memorySize);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.addressSize);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.nbChannels);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.transferWidth);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.throughput);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.level);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.resMult);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.sourcePort);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.targetPort);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.mainScheduler);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.usedBy);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.realizedBy);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.arbiters);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.sides);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.managedMemories);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.controlledMedia);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.drivenBy);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.brokedResource);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.ownedElement);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.ownedResource);
		propertiesStep.addStep(HrmViewsRepository.General.Properties.ownedConnector);

		composer = new PartComposer(generalStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == HrmViewsRepository.General.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == HrmViewsRepository.General.Properties.name) {
					return createNameText(parent);
				}
				if (key == HrmViewsRepository.General.Properties.type) {
					return createTypeEMFComboViewer(parent);
				}
				if (key == HrmViewsRepository.General.Properties.family) {
					return createFamilyText(parent);
				}
				if (key == HrmViewsRepository.General.Properties.status) {
					return createStatusEMFComboViewer(parent);
				}
				if (key == HrmViewsRepository.General.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == HrmViewsRepository.General.Properties.speedFactor) {
					return createSpeedFactorText(parent);
				}
				if (key == HrmViewsRepository.General.Properties.memoryProtection) {
					return createMemoryProtectionCheckbox(parent);
				}
				if (key == HrmViewsRepository.General.Properties.range) {
					return createRangeText(parent);
				}
				if (key == HrmViewsRepository.General.Properties.isActive) {
					return createIsActiveCheckbox(parent);
				}
				if (key == HrmViewsRepository.General.Properties.isProtected) {
					return createIsProtectedCheckbox(parent);
				}
				if (key == HrmViewsRepository.General.Properties.isSynchronous) {
					return createIsSynchronousCheckbox(parent);
				}
				if (key == HrmViewsRepository.General.Properties.isSerial) {
					return createIsSerialCheckbox(parent);
				}
				if (key == HrmViewsRepository.General.Properties.isStatic) {
					return createIsStaticCheckbox(parent);
				}
				if (key == HrmViewsRepository.General.Properties.isNonVolatile) {
					return createIsNonVolatileCheckbox(parent);
				}
				if (key == HrmViewsRepository.General.Properties.memorySize) {
					return createMemorySizeText(parent);
				}
				if (key == HrmViewsRepository.General.Properties.addressSize) {
					return createAddressSizeText(parent);
				}
				if (key == HrmViewsRepository.General.Properties.nbChannels) {
					return createNbChannelsText(parent);
				}
				if (key == HrmViewsRepository.General.Properties.transferWidth) {
					return createTransferWidthText(parent);
				}
				if (key == HrmViewsRepository.General.Properties.throughput) {
					return createThroughputText(parent);
				}
				if (key == HrmViewsRepository.General.Properties.level) {
					return createLevelText(parent);
				}
				if (key == HrmViewsRepository.General.Properties.resMult) {
					return createResMultText(parent);
				}
				if (key == HrmViewsRepository.General.Properties.sourcePort) {
					return createSourcePortFlatComboViewer(parent);
				}
				if (key == HrmViewsRepository.General.Properties.targetPort) {
					return createTargetPortFlatComboViewer(parent);
				}
				if (key == HrmViewsRepository.General.Properties.mainScheduler) {
					return createMainSchedulerFlatComboViewer(parent);
				}
				if (key == HrmViewsRepository.General.Properties.usedBy) {
					return createUsedByAdvancedReferencesTable(parent);
				}
				if (key == HrmViewsRepository.General.Properties.realizedBy) {
					return createRealizedByAdvancedReferencesTable(parent);
				}
				if (key == HrmViewsRepository.General.Properties.arbiters) {
					return createArbitersAdvancedReferencesTable(parent);
				}
				if (key == HrmViewsRepository.General.Properties.sides) {
					return createSidesAdvancedReferencesTable(parent);
				}
				if (key == HrmViewsRepository.General.Properties.managedMemories) {
					return createManagedMemoriesAdvancedReferencesTable(parent);
				}
				if (key == HrmViewsRepository.General.Properties.controlledMedia) {
					return createControlledMediaAdvancedReferencesTable(parent);
				}
				if (key == HrmViewsRepository.General.Properties.drivenBy) {
					return createDrivenByAdvancedReferencesTable(parent);
				}
				if (key == HrmViewsRepository.General.Properties.brokedResource) {
					return createBrokedResourceAdvancedReferencesTable(parent);
				}
				if (key == HrmViewsRepository.General.Properties.ownedElement) {
					return createOwnedElementAdvancedTableComposition(parent);
				}
				if (key == HrmViewsRepository.General.Properties.ownedResource) {
					return createOwnedResourceAdvancedTableComposition(parent);
				}
				if (key == HrmViewsRepository.General.Properties.ownedConnector) {
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
		propertiesGroup.setText(HrmMessages.GeneralPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	protected Composite createNameText(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.name,
				HrmMessages.GeneralPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.name,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, HrmViewsRepository.General.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.name, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	protected Composite createTypeEMFComboViewer(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.type,
				HrmMessages.GeneralPropertiesEditionPart_TypeLabel);
		type = new EMFComboViewer(parent);
		type.setContentProvider(new ArrayContentProvider());
		type.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.getCombo().setLayoutData(typeData);
		type.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.type,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(HrmViewsRepository.General.Properties.type);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.type, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createTypeEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createFamilyText(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.family,
				HrmMessages.GeneralPropertiesEditionPart_FamilyLabel);
		family = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData familyData = new GridData(GridData.FILL_HORIZONTAL);
		family.setLayoutData(familyData);
		family.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.family,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, family.getText()));
			}

		});
		family.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.family,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, family.getText()));
				}
			}

		});
		EditingUtils.setID(family, HrmViewsRepository.General.Properties.family);
		EditingUtils.setEEFtype(family, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.family, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createFamilyText

		// End of user code
		return parent;
	}

	protected Composite createStatusEMFComboViewer(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.status,
				HrmMessages.GeneralPropertiesEditionPart_StatusLabel);
		status = new EMFComboViewer(parent);
		status.setContentProvider(new ArrayContentProvider());
		status.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData statusData = new GridData(GridData.FILL_HORIZONTAL);
		status.getCombo().setLayoutData(statusData);
		status.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.status,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getStatus()));
			}

		});
		status.setID(HrmViewsRepository.General.Properties.status);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.status, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createStatusEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.description,
				HrmMessages.GeneralPropertiesEditionPart_DescriptionLabel);
		description = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this,
								HrmViewsRepository.General.Properties.description, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, HrmViewsRepository.General.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.description, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	protected Composite createSpeedFactorText(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.speedFactor,
				HrmMessages.GeneralPropertiesEditionPart_SpeedFactorLabel);
		speedFactor = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData speedFactorData = new GridData(GridData.FILL_HORIZONTAL);
		speedFactor.setLayoutData(speedFactorData);
		speedFactor.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.speedFactor,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, speedFactor.getText()));
			}

		});
		speedFactor.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this,
								HrmViewsRepository.General.Properties.speedFactor, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, speedFactor.getText()));
				}
			}

		});
		EditingUtils.setID(speedFactor, HrmViewsRepository.General.Properties.speedFactor);
		EditingUtils.setEEFtype(speedFactor, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.speedFactor, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createSpeedFactorText

		// End of user code
		return parent;
	}

	protected Composite createMemoryProtectionCheckbox(Composite parent) {
		memoryProtection = new Button(parent, SWT.CHECK);
		memoryProtection.setText(getDescription(HrmViewsRepository.General.Properties.memoryProtection,
				HrmMessages.GeneralPropertiesEditionPart_MemoryProtectionLabel));
		memoryProtection.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this,
							HrmViewsRepository.General.Properties.memoryProtection, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, new Boolean(memoryProtection.getSelection())));
			}

		});
		GridData memoryProtectionData = new GridData(GridData.FILL_HORIZONTAL);
		memoryProtectionData.horizontalSpan = 2;
		memoryProtection.setLayoutData(memoryProtectionData);
		EditingUtils.setID(memoryProtection, HrmViewsRepository.General.Properties.memoryProtection);
		EditingUtils.setEEFtype(memoryProtection, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				HrmViewsRepository.General.Properties.memoryProtection, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createMemoryProtectionCheckbox

		// End of user code
		return parent;
	}

	protected Composite createRangeText(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.range,
				HrmMessages.GeneralPropertiesEditionPart_RangeLabel);
		range = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData rangeData = new GridData(GridData.FILL_HORIZONTAL);
		range.setLayoutData(rangeData);
		range.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.range,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, range.getText()));
			}

		});
		range.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.range,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, range.getText()));
				}
			}

		});
		EditingUtils.setID(range, HrmViewsRepository.General.Properties.range);
		EditingUtils.setEEFtype(range, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.range, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createRangeText

		// End of user code
		return parent;
	}

	protected Composite createIsActiveCheckbox(Composite parent) {
		isActive = new Button(parent, SWT.CHECK);
		isActive.setText(getDescription(HrmViewsRepository.General.Properties.isActive,
				HrmMessages.GeneralPropertiesEditionPart_IsActiveLabel));
		isActive.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.isActive, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isActive.getSelection())));
			}

		});
		GridData isActiveData = new GridData(GridData.FILL_HORIZONTAL);
		isActiveData.horizontalSpan = 2;
		isActive.setLayoutData(isActiveData);
		EditingUtils.setID(isActive, HrmViewsRepository.General.Properties.isActive);
		EditingUtils.setEEFtype(isActive, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.isActive, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsActiveCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsProtectedCheckbox(Composite parent) {
		isProtected = new Button(parent, SWT.CHECK);
		isProtected.setText(getDescription(HrmViewsRepository.General.Properties.isProtected,
				HrmMessages.GeneralPropertiesEditionPart_IsProtectedLabel));
		isProtected.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.isProtected, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isProtected.getSelection())));
			}

		});
		GridData isProtectedData = new GridData(GridData.FILL_HORIZONTAL);
		isProtectedData.horizontalSpan = 2;
		isProtected.setLayoutData(isProtectedData);
		EditingUtils.setID(isProtected, HrmViewsRepository.General.Properties.isProtected);
		EditingUtils.setEEFtype(isProtected, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.isProtected, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsProtectedCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsSynchronousCheckbox(Composite parent) {
		isSynchronous = new Button(parent, SWT.CHECK);
		isSynchronous.setText(getDescription(HrmViewsRepository.General.Properties.isSynchronous,
				HrmMessages.GeneralPropertiesEditionPart_IsSynchronousLabel));
		isSynchronous.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.isSynchronous, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isSynchronous.getSelection())));
			}

		});
		GridData isSynchronousData = new GridData(GridData.FILL_HORIZONTAL);
		isSynchronousData.horizontalSpan = 2;
		isSynchronous.setLayoutData(isSynchronousData);
		EditingUtils.setID(isSynchronous, HrmViewsRepository.General.Properties.isSynchronous);
		EditingUtils.setEEFtype(isSynchronous, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				HrmViewsRepository.General.Properties.isSynchronous, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsSynchronousCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsSerialCheckbox(Composite parent) {
		isSerial = new Button(parent, SWT.CHECK);
		isSerial.setText(getDescription(HrmViewsRepository.General.Properties.isSerial,
				HrmMessages.GeneralPropertiesEditionPart_IsSerialLabel));
		isSerial.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.isSerial, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isSerial.getSelection())));
			}

		});
		GridData isSerialData = new GridData(GridData.FILL_HORIZONTAL);
		isSerialData.horizontalSpan = 2;
		isSerial.setLayoutData(isSerialData);
		EditingUtils.setID(isSerial, HrmViewsRepository.General.Properties.isSerial);
		EditingUtils.setEEFtype(isSerial, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.isSerial, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsSerialCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsStaticCheckbox(Composite parent) {
		isStatic = new Button(parent, SWT.CHECK);
		isStatic.setText(getDescription(HrmViewsRepository.General.Properties.isStatic,
				HrmMessages.GeneralPropertiesEditionPart_IsStaticLabel));
		isStatic.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.isStatic, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isStatic.getSelection())));
			}

		});
		GridData isStaticData = new GridData(GridData.FILL_HORIZONTAL);
		isStaticData.horizontalSpan = 2;
		isStatic.setLayoutData(isStaticData);
		EditingUtils.setID(isStatic, HrmViewsRepository.General.Properties.isStatic);
		EditingUtils.setEEFtype(isStatic, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.isStatic, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsStaticCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsNonVolatileCheckbox(Composite parent) {
		isNonVolatile = new Button(parent, SWT.CHECK);
		isNonVolatile.setText(getDescription(HrmViewsRepository.General.Properties.isNonVolatile,
				HrmMessages.GeneralPropertiesEditionPart_IsNonVolatileLabel));
		isNonVolatile.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.isNonVolatile, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isNonVolatile.getSelection())));
			}

		});
		GridData isNonVolatileData = new GridData(GridData.FILL_HORIZONTAL);
		isNonVolatileData.horizontalSpan = 2;
		isNonVolatile.setLayoutData(isNonVolatileData);
		EditingUtils.setID(isNonVolatile, HrmViewsRepository.General.Properties.isNonVolatile);
		EditingUtils.setEEFtype(isNonVolatile, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				HrmViewsRepository.General.Properties.isNonVolatile, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsNonVolatileCheckbox

		// End of user code
		return parent;
	}

	protected Composite createMemorySizeText(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.memorySize,
				HrmMessages.GeneralPropertiesEditionPart_MemorySizeLabel);
		memorySize = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData memorySizeData = new GridData(GridData.FILL_HORIZONTAL);
		memorySize.setLayoutData(memorySizeData);
		memorySize.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.memorySize,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, memorySize.getText()));
			}

		});
		memorySize.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.memorySize,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, memorySize.getText()));
				}
			}

		});
		EditingUtils.setID(memorySize, HrmViewsRepository.General.Properties.memorySize);
		EditingUtils.setEEFtype(memorySize, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.memorySize, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createMemorySizeText

		// End of user code
		return parent;
	}

	protected Composite createAddressSizeText(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.addressSize,
				HrmMessages.GeneralPropertiesEditionPart_AddressSizeLabel);
		addressSize = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData addressSizeData = new GridData(GridData.FILL_HORIZONTAL);
		addressSize.setLayoutData(addressSizeData);
		addressSize.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.addressSize,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, addressSize.getText()));
			}

		});
		addressSize.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this,
								HrmViewsRepository.General.Properties.addressSize, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, addressSize.getText()));
				}
			}

		});
		EditingUtils.setID(addressSize, HrmViewsRepository.General.Properties.addressSize);
		EditingUtils.setEEFtype(addressSize, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.addressSize, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createAddressSizeText

		// End of user code
		return parent;
	}

	protected Composite createNbChannelsText(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.nbChannels,
				HrmMessages.GeneralPropertiesEditionPart_NbChannelsLabel);
		nbChannels = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nbChannelsData = new GridData(GridData.FILL_HORIZONTAL);
		nbChannels.setLayoutData(nbChannelsData);
		nbChannels.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.nbChannels,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbChannels.getText()));
			}

		});
		nbChannels.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.nbChannels,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbChannels.getText()));
				}
			}

		});
		EditingUtils.setID(nbChannels, HrmViewsRepository.General.Properties.nbChannels);
		EditingUtils.setEEFtype(nbChannels, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.nbChannels, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createNbChannelsText

		// End of user code
		return parent;
	}

	protected Composite createTransferWidthText(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.transferWidth,
				HrmMessages.GeneralPropertiesEditionPart_TransferWidthLabel);
		transferWidth = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData transferWidthData = new GridData(GridData.FILL_HORIZONTAL);
		transferWidth.setLayoutData(transferWidthData);
		transferWidth.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.transferWidth,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, transferWidth.getText()));
			}

		});
		transferWidth.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this,
								HrmViewsRepository.General.Properties.transferWidth, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, transferWidth.getText()));
				}
			}

		});
		EditingUtils.setID(transferWidth, HrmViewsRepository.General.Properties.transferWidth);
		EditingUtils.setEEFtype(transferWidth, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				HrmViewsRepository.General.Properties.transferWidth, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createTransferWidthText

		// End of user code
		return parent;
	}

	protected Composite createThroughputText(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.throughput,
				HrmMessages.GeneralPropertiesEditionPart_ThroughputLabel);
		throughput = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData throughputData = new GridData(GridData.FILL_HORIZONTAL);
		throughput.setLayoutData(throughputData);
		throughput.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.throughput,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, throughput.getText()));
			}

		});
		throughput.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.throughput,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, throughput.getText()));
				}
			}

		});
		EditingUtils.setID(throughput, HrmViewsRepository.General.Properties.throughput);
		EditingUtils.setEEFtype(throughput, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.throughput, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createThroughputText

		// End of user code
		return parent;
	}

	protected Composite createLevelText(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.level,
				HrmMessages.GeneralPropertiesEditionPart_LevelLabel);
		level = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData levelData = new GridData(GridData.FILL_HORIZONTAL);
		level.setLayoutData(levelData);
		level.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.level,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, level.getText()));
			}

		});
		level.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.level,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, level.getText()));
				}
			}

		});
		EditingUtils.setID(level, HrmViewsRepository.General.Properties.level);
		EditingUtils.setEEFtype(level, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.level, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createLevelText

		// End of user code
		return parent;
	}

	protected Composite createResMultText(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.resMult,
				HrmMessages.GeneralPropertiesEditionPart_ResMultLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.resMult,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resMult.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.resMult,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resMult.getText()));
				}
			}

		});
		EditingUtils.setID(resMult, HrmViewsRepository.General.Properties.resMult);
		EditingUtils.setEEFtype(resMult, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.resMult, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createResMultText

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createSourcePortFlatComboViewer(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.sourcePort,
				HrmMessages.GeneralPropertiesEditionPart_SourcePortLabel);
		sourcePort = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(HrmViewsRepository.General.Properties.sourcePort, HrmViewsRepository.SWT_KIND));
		sourcePort.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		sourcePort.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.sourcePort,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSourcePort()));
			}

		});
		GridData sourcePortData = new GridData(GridData.FILL_HORIZONTAL);
		sourcePort.setLayoutData(sourcePortData);
		sourcePort.setID(HrmViewsRepository.General.Properties.sourcePort);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.sourcePort, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createSourcePortFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createTargetPortFlatComboViewer(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.targetPort,
				HrmMessages.GeneralPropertiesEditionPart_TargetPortLabel);
		targetPort = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(HrmViewsRepository.General.Properties.targetPort, HrmViewsRepository.SWT_KIND));
		targetPort.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		targetPort.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.targetPort,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTargetPort()));
			}

		});
		GridData targetPortData = new GridData(GridData.FILL_HORIZONTAL);
		targetPort.setLayoutData(targetPortData);
		targetPort.setID(HrmViewsRepository.General.Properties.targetPort);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.targetPort, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createTargetPortFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createMainSchedulerFlatComboViewer(Composite parent) {
		createDescription(parent, HrmViewsRepository.General.Properties.mainScheduler,
				HrmMessages.GeneralPropertiesEditionPart_MainSchedulerLabel);
		mainScheduler = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(HrmViewsRepository.General.Properties.mainScheduler, HrmViewsRepository.SWT_KIND));
		mainScheduler.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		mainScheduler.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.mainScheduler,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getMainScheduler()));
			}

		});
		GridData mainSchedulerData = new GridData(GridData.FILL_HORIZONTAL);
		mainScheduler.setLayoutData(mainSchedulerData);
		mainScheduler.setID(HrmViewsRepository.General.Properties.mainScheduler);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				HrmViewsRepository.General.Properties.mainScheduler, HrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createMainSchedulerFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createUsedByAdvancedReferencesTable(Composite parent) {
		String label = getDescription(HrmViewsRepository.General.Properties.usedBy,
				HrmMessages.GeneralPropertiesEditionPart_UsedByLabel);
		this.usedBy = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addUsedBy();
			}

			public void handleEdit(EObject element) {
				editUsedBy(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveUsedBy(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromUsedBy(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.usedBy.setHelpText(propertiesEditionComponent.getHelpContent(HrmViewsRepository.General.Properties.usedBy,
				HrmViewsRepository.SWT_KIND));
		this.usedBy.createControls(parent);
		this.usedBy.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.usedBy, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData usedByData = new GridData(GridData.FILL_HORIZONTAL);
		usedByData.horizontalSpan = 3;
		this.usedBy.setLayoutData(usedByData);
		this.usedBy.disableMove();
		usedBy.setID(HrmViewsRepository.General.Properties.usedBy);
		usedBy.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addUsedBy() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(usedBy.getInput(), usedByFilters,
				usedByBusinessFilters, "usedBy", propertiesEditionComponent.getEditingContext().getAdapterFactory(),
				current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.usedBy,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.usedBy,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		usedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromUsedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.usedBy,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		usedBy.refresh();
	}

	/**
	 * 
	 */
	protected void editUsedBy(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
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
		String label = getDescription(HrmViewsRepository.General.Properties.realizedBy,
				HrmMessages.GeneralPropertiesEditionPart_RealizedByLabel);
		this.realizedBy = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addRealizedBy();
			}

			public void handleEdit(EObject element) {
				editRealizedBy(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveRealizedBy(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromRealizedBy(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.realizedBy.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.realizedBy, HrmViewsRepository.SWT_KIND));
		this.realizedBy.createControls(parent);
		this.realizedBy.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.realizedBy, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData realizedByData = new GridData(GridData.FILL_HORIZONTAL);
		realizedByData.horizontalSpan = 3;
		this.realizedBy.setLayoutData(realizedByData);
		this.realizedBy.disableMove();
		realizedBy.setID(HrmViewsRepository.General.Properties.realizedBy);
		realizedBy.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addRealizedBy() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(realizedBy.getInput(),
				realizedByFilters, realizedByBusinessFilters, "realizedBy",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.realizedBy,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.realizedBy,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		realizedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRealizedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.realizedBy,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		realizedBy.refresh();
	}

	/**
	 * 
	 */
	protected void editRealizedBy(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				realizedBy.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createArbitersAdvancedReferencesTable(Composite parent) {
		String label = getDescription(HrmViewsRepository.General.Properties.arbiters,
				HrmMessages.GeneralPropertiesEditionPart_ArbitersLabel);
		this.arbiters = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addArbiters();
			}

			public void handleEdit(EObject element) {
				editArbiters(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveArbiters(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromArbiters(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.arbiters.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.arbiters, HrmViewsRepository.SWT_KIND));
		this.arbiters.createControls(parent);
		this.arbiters.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.arbiters, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData arbitersData = new GridData(GridData.FILL_HORIZONTAL);
		arbitersData.horizontalSpan = 3;
		this.arbiters.setLayoutData(arbitersData);
		this.arbiters.disableMove();
		arbiters.setID(HrmViewsRepository.General.Properties.arbiters);
		arbiters.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addArbiters() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(arbiters.getInput(), arbitersFilters,
				arbitersBusinessFilters, "arbiters", propertiesEditionComponent.getEditingContext().getAdapterFactory(),
				current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.arbiters,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				arbiters.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveArbiters(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.arbiters,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		arbiters.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromArbiters(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.arbiters,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		arbiters.refresh();
	}

	/**
	 * 
	 */
	protected void editArbiters(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				arbiters.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSidesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(HrmViewsRepository.General.Properties.sides,
				HrmMessages.GeneralPropertiesEditionPart_SidesLabel);
		this.sides = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addSides();
			}

			public void handleEdit(EObject element) {
				editSides(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveSides(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromSides(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.sides.setHelpText(propertiesEditionComponent.getHelpContent(HrmViewsRepository.General.Properties.sides,
				HrmViewsRepository.SWT_KIND));
		this.sides.createControls(parent);
		this.sides.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.sides, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData sidesData = new GridData(GridData.FILL_HORIZONTAL);
		sidesData.horizontalSpan = 3;
		this.sides.setLayoutData(sidesData);
		this.sides.disableMove();
		sides.setID(HrmViewsRepository.General.Properties.sides);
		sides.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSides() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(sides.getInput(), sidesFilters,
				sidesBusinessFilters, "sides", propertiesEditionComponent.getEditingContext().getAdapterFactory(),
				current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.sides,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				sides.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSides(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.sides,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		sides.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSides(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.sides,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		sides.refresh();
	}

	/**
	 * 
	 */
	protected void editSides(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				sides.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createManagedMemoriesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(HrmViewsRepository.General.Properties.managedMemories,
				HrmMessages.GeneralPropertiesEditionPart_ManagedMemoriesLabel);
		this.managedMemories = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addManagedMemories();
			}

			public void handleEdit(EObject element) {
				editManagedMemories(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveManagedMemories(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromManagedMemories(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.managedMemories.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.managedMemories, HrmViewsRepository.SWT_KIND));
		this.managedMemories.createControls(parent);
		this.managedMemories.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this,
							HrmViewsRepository.General.Properties.managedMemories, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData managedMemoriesData = new GridData(GridData.FILL_HORIZONTAL);
		managedMemoriesData.horizontalSpan = 3;
		this.managedMemories.setLayoutData(managedMemoriesData);
		this.managedMemories.disableMove();
		managedMemories.setID(HrmViewsRepository.General.Properties.managedMemories);
		managedMemories.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addManagedMemories() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(managedMemories.getInput(),
				managedMemoriesFilters, managedMemoriesBusinessFilters, "managedMemories",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.managedMemories,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				managedMemories.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveManagedMemories(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.managedMemories,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		managedMemories.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromManagedMemories(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.managedMemories,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		managedMemories.refresh();
	}

	/**
	 * 
	 */
	protected void editManagedMemories(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				managedMemories.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createControlledMediaAdvancedReferencesTable(Composite parent) {
		String label = getDescription(HrmViewsRepository.General.Properties.controlledMedia,
				HrmMessages.GeneralPropertiesEditionPart_ControlledMediaLabel);
		this.controlledMedia = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addControlledMedia();
			}

			public void handleEdit(EObject element) {
				editControlledMedia(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveControlledMedia(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromControlledMedia(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.controlledMedia.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.controlledMedia, HrmViewsRepository.SWT_KIND));
		this.controlledMedia.createControls(parent);
		this.controlledMedia.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this,
							HrmViewsRepository.General.Properties.controlledMedia, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData controlledMediaData = new GridData(GridData.FILL_HORIZONTAL);
		controlledMediaData.horizontalSpan = 3;
		this.controlledMedia.setLayoutData(controlledMediaData);
		this.controlledMedia.disableMove();
		controlledMedia.setID(HrmViewsRepository.General.Properties.controlledMedia);
		controlledMedia.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addControlledMedia() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(controlledMedia.getInput(),
				controlledMediaFilters, controlledMediaBusinessFilters, "controlledMedia",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.controlledMedia,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				controlledMedia.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveControlledMedia(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.controlledMedia,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		controlledMedia.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromControlledMedia(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.controlledMedia,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		controlledMedia.refresh();
	}

	/**
	 * 
	 */
	protected void editControlledMedia(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				controlledMedia.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDrivenByAdvancedReferencesTable(Composite parent) {
		String label = getDescription(HrmViewsRepository.General.Properties.drivenBy,
				HrmMessages.GeneralPropertiesEditionPart_DrivenByLabel);
		this.drivenBy = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addDrivenBy();
			}

			public void handleEdit(EObject element) {
				editDrivenBy(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveDrivenBy(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromDrivenBy(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.drivenBy.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.drivenBy, HrmViewsRepository.SWT_KIND));
		this.drivenBy.createControls(parent);
		this.drivenBy.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.drivenBy, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData drivenByData = new GridData(GridData.FILL_HORIZONTAL);
		drivenByData.horizontalSpan = 3;
		this.drivenBy.setLayoutData(drivenByData);
		this.drivenBy.disableMove();
		drivenBy.setID(HrmViewsRepository.General.Properties.drivenBy);
		drivenBy.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addDrivenBy() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(drivenBy.getInput(), drivenByFilters,
				drivenByBusinessFilters, "drivenBy", propertiesEditionComponent.getEditingContext().getAdapterFactory(),
				current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.drivenBy,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				drivenBy.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveDrivenBy(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.drivenBy,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		drivenBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDrivenBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.drivenBy,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		drivenBy.refresh();
	}

	/**
	 * 
	 */
	protected void editDrivenBy(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				drivenBy.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createBrokedResourceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(HrmViewsRepository.General.Properties.brokedResource,
				HrmMessages.GeneralPropertiesEditionPart_BrokedResourceLabel);
		this.brokedResource = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addBrokedResource();
			}

			public void handleEdit(EObject element) {
				editBrokedResource(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveBrokedResource(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromBrokedResource(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.brokedResource.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.brokedResource, HrmViewsRepository.SWT_KIND));
		this.brokedResource.createControls(parent);
		this.brokedResource.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.brokedResource, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData brokedResourceData = new GridData(GridData.FILL_HORIZONTAL);
		brokedResourceData.horizontalSpan = 3;
		this.brokedResource.setLayoutData(brokedResourceData);
		this.brokedResource.disableMove();
		brokedResource.setID(HrmViewsRepository.General.Properties.brokedResource);
		brokedResource.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addBrokedResource() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(brokedResource.getInput(),
				brokedResourceFilters, brokedResourceBusinessFilters, "brokedResource",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.brokedResource,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				brokedResource.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveBrokedResource(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.brokedResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		brokedResource.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromBrokedResource(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, HrmViewsRepository.General.Properties.brokedResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		brokedResource.refresh();
	}

	/**
	 * 
	 */
	protected void editBrokedResource(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				brokedResource.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedElementAdvancedTableComposition(Composite parent) {
		this.ownedElement = new ReferencesTable(getDescription(HrmViewsRepository.General.Properties.ownedElement,
				HrmMessages.GeneralPropertiesEditionPart_OwnedElementLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										HrmViewsRepository.General.Properties.ownedElement,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedElement.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										HrmViewsRepository.General.Properties.ownedElement,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedElement.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										HrmViewsRepository.General.Properties.ownedElement,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedElement.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										HrmViewsRepository.General.Properties.ownedElement,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						ownedElement.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.ownedElementFilters) {
			this.ownedElement.addFilter(filter);
		}
		this.ownedElement.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.ownedElement, HrmViewsRepository.SWT_KIND));
		this.ownedElement.createControls(parent);
		this.ownedElement.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.ownedElement, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedElementData = new GridData(GridData.FILL_HORIZONTAL);
		ownedElementData.horizontalSpan = 3;
		this.ownedElement.setLayoutData(ownedElementData);
		this.ownedElement.setLowerBound(0);
		this.ownedElement.setUpperBound(-1);
		ownedElement.setID(HrmViewsRepository.General.Properties.ownedElement);
		ownedElement.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedElementAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedResourceAdvancedTableComposition(Composite parent) {
		this.ownedResource = new ReferencesTable(getDescription(HrmViewsRepository.General.Properties.ownedResource,
				HrmMessages.GeneralPropertiesEditionPart_OwnedResourceLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										HrmViewsRepository.General.Properties.ownedResource,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedResource.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										HrmViewsRepository.General.Properties.ownedResource,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedResource.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										HrmViewsRepository.General.Properties.ownedResource,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedResource.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										HrmViewsRepository.General.Properties.ownedResource,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						ownedResource.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.ownedResourceFilters) {
			this.ownedResource.addFilter(filter);
		}
		this.ownedResource.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.ownedResource, HrmViewsRepository.SWT_KIND));
		this.ownedResource.createControls(parent);
		this.ownedResource.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.ownedResource, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedResourceData = new GridData(GridData.FILL_HORIZONTAL);
		ownedResourceData.horizontalSpan = 3;
		this.ownedResource.setLayoutData(ownedResourceData);
		this.ownedResource.setLowerBound(0);
		this.ownedResource.setUpperBound(-1);
		ownedResource.setID(HrmViewsRepository.General.Properties.ownedResource);
		ownedResource.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedResourceAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedConnectorAdvancedTableComposition(Composite parent) {
		this.ownedConnector = new ReferencesTable(getDescription(HrmViewsRepository.General.Properties.ownedConnector,
				HrmMessages.GeneralPropertiesEditionPart_OwnedConnectorLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										HrmViewsRepository.General.Properties.ownedConnector,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedConnector.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										HrmViewsRepository.General.Properties.ownedConnector,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedConnector.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										HrmViewsRepository.General.Properties.ownedConnector,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedConnector.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										HrmViewsRepository.General.Properties.ownedConnector,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						ownedConnector.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.ownedConnectorFilters) {
			this.ownedConnector.addFilter(filter);
		}
		this.ownedConnector.setHelpText(propertiesEditionComponent
				.getHelpContent(HrmViewsRepository.General.Properties.ownedConnector, HrmViewsRepository.SWT_KIND));
		this.ownedConnector.createControls(parent);
		this.ownedConnector.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									HrmViewsRepository.General.Properties.ownedConnector, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedConnectorData = new GridData(GridData.FILL_HORIZONTAL);
		ownedConnectorData.horizontalSpan = 3;
		this.ownedConnector.setLayoutData(ownedConnectorData);
		this.ownedConnector.setLowerBound(0);
		this.ownedConnector.setUpperBound(-1);
		ownedConnector.setID(HrmViewsRepository.General.Properties.ownedConnector);
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
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setName(String
	 *      newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getType()
	 * 
	 */
	public Enumerator getType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) type.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#initType(Object
	 *      input, Enumerator current)
	 */
	public void initType(Object input, Enumerator current) {
		type.setInput(input);
		type.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setType(Enumerator
	 *      newValue)
	 * 
	 */
	public void setType(Enumerator newValue) {
		type.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getFamily()
	 * 
	 */
	public String getFamily() {
		return family.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setFamily(String
	 *      newValue)
	 * 
	 */
	public void setFamily(String newValue) {
		if (newValue != null) {
			family.setText(newValue);
		} else {
			family.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.family);
		if (eefElementEditorReadOnlyState && family.isEnabled()) {
			family.setEnabled(false);
			family.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !family.isEnabled()) {
			family.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getStatus()
	 * 
	 */
	public Enumerator getStatus() {
		Enumerator selection = (Enumerator) ((StructuredSelection) status.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#initStatus(Object
	 *      input, Enumerator current)
	 */
	public void initStatus(Object input, Enumerator current) {
		status.setInput(input);
		status.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.status);
		if (eefElementEditorReadOnlyState && status.isEnabled()) {
			status.setEnabled(false);
			status.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !status.isEnabled()) {
			status.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setStatus(Enumerator
	 *      newValue)
	 * 
	 */
	public void setStatus(Enumerator newValue) {
		status.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.status);
		if (eefElementEditorReadOnlyState && status.isEnabled()) {
			status.setEnabled(false);
			status.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !status.isEnabled()) {
			status.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setDescription(String
	 *      newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getSpeedFactor()
	 * 
	 */
	public String getSpeedFactor() {
		return speedFactor.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setSpeedFactor(String
	 *      newValue)
	 * 
	 */
	public void setSpeedFactor(String newValue) {
		if (newValue != null) {
			speedFactor.setText(newValue);
		} else {
			speedFactor.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.speedFactor);
		if (eefElementEditorReadOnlyState && speedFactor.isEnabled()) {
			speedFactor.setEnabled(false);
			speedFactor.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !speedFactor.isEnabled()) {
			speedFactor.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getMemoryProtection()
	 * 
	 */
	public Boolean getMemoryProtection() {
		return Boolean.valueOf(memoryProtection.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setMemoryProtection(Boolean
	 *      newValue)
	 * 
	 */
	public void setMemoryProtection(Boolean newValue) {
		if (newValue != null) {
			memoryProtection.setSelection(newValue.booleanValue());
		} else {
			memoryProtection.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.memoryProtection);
		if (eefElementEditorReadOnlyState && memoryProtection.isEnabled()) {
			memoryProtection.setEnabled(false);
			memoryProtection.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !memoryProtection.isEnabled()) {
			memoryProtection.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getRange()
	 * 
	 */
	public String getRange() {
		return range.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setRange(String
	 *      newValue)
	 * 
	 */
	public void setRange(String newValue) {
		if (newValue != null) {
			range.setText(newValue);
		} else {
			range.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.range);
		if (eefElementEditorReadOnlyState && range.isEnabled()) {
			range.setEnabled(false);
			range.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !range.isEnabled()) {
			range.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getIsActive()
	 * 
	 */
	public Boolean getIsActive() {
		return Boolean.valueOf(isActive.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setIsActive(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsActive(Boolean newValue) {
		if (newValue != null) {
			isActive.setSelection(newValue.booleanValue());
		} else {
			isActive.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.isActive);
		if (eefElementEditorReadOnlyState && isActive.isEnabled()) {
			isActive.setEnabled(false);
			isActive.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isActive.isEnabled()) {
			isActive.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getIsProtected()
	 * 
	 */
	public Boolean getIsProtected() {
		return Boolean.valueOf(isProtected.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setIsProtected(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsProtected(Boolean newValue) {
		if (newValue != null) {
			isProtected.setSelection(newValue.booleanValue());
		} else {
			isProtected.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.isProtected);
		if (eefElementEditorReadOnlyState && isProtected.isEnabled()) {
			isProtected.setEnabled(false);
			isProtected.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isProtected.isEnabled()) {
			isProtected.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getIsSynchronous()
	 * 
	 */
	public Boolean getIsSynchronous() {
		return Boolean.valueOf(isSynchronous.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setIsSynchronous(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsSynchronous(Boolean newValue) {
		if (newValue != null) {
			isSynchronous.setSelection(newValue.booleanValue());
		} else {
			isSynchronous.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.isSynchronous);
		if (eefElementEditorReadOnlyState && isSynchronous.isEnabled()) {
			isSynchronous.setEnabled(false);
			isSynchronous.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isSynchronous.isEnabled()) {
			isSynchronous.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getIsSerial()
	 * 
	 */
	public Boolean getIsSerial() {
		return Boolean.valueOf(isSerial.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setIsSerial(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsSerial(Boolean newValue) {
		if (newValue != null) {
			isSerial.setSelection(newValue.booleanValue());
		} else {
			isSerial.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.isSerial);
		if (eefElementEditorReadOnlyState && isSerial.isEnabled()) {
			isSerial.setEnabled(false);
			isSerial.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isSerial.isEnabled()) {
			isSerial.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getIsStatic()
	 * 
	 */
	public Boolean getIsStatic() {
		return Boolean.valueOf(isStatic.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setIsStatic(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsStatic(Boolean newValue) {
		if (newValue != null) {
			isStatic.setSelection(newValue.booleanValue());
		} else {
			isStatic.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.isStatic);
		if (eefElementEditorReadOnlyState && isStatic.isEnabled()) {
			isStatic.setEnabled(false);
			isStatic.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isStatic.isEnabled()) {
			isStatic.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getIsNonVolatile()
	 * 
	 */
	public Boolean getIsNonVolatile() {
		return Boolean.valueOf(isNonVolatile.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setIsNonVolatile(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsNonVolatile(Boolean newValue) {
		if (newValue != null) {
			isNonVolatile.setSelection(newValue.booleanValue());
		} else {
			isNonVolatile.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.isNonVolatile);
		if (eefElementEditorReadOnlyState && isNonVolatile.isEnabled()) {
			isNonVolatile.setEnabled(false);
			isNonVolatile.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isNonVolatile.isEnabled()) {
			isNonVolatile.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getMemorySize()
	 * 
	 */
	public String getMemorySize() {
		return memorySize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setMemorySize(String
	 *      newValue)
	 * 
	 */
	public void setMemorySize(String newValue) {
		if (newValue != null) {
			memorySize.setText(newValue);
		} else {
			memorySize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.memorySize);
		if (eefElementEditorReadOnlyState && memorySize.isEnabled()) {
			memorySize.setEnabled(false);
			memorySize.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !memorySize.isEnabled()) {
			memorySize.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getAddressSize()
	 * 
	 */
	public String getAddressSize() {
		return addressSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setAddressSize(String
	 *      newValue)
	 * 
	 */
	public void setAddressSize(String newValue) {
		if (newValue != null) {
			addressSize.setText(newValue);
		} else {
			addressSize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.addressSize);
		if (eefElementEditorReadOnlyState && addressSize.isEnabled()) {
			addressSize.setEnabled(false);
			addressSize.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !addressSize.isEnabled()) {
			addressSize.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getNbChannels()
	 * 
	 */
	public String getNbChannels() {
		return nbChannels.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setNbChannels(String
	 *      newValue)
	 * 
	 */
	public void setNbChannels(String newValue) {
		if (newValue != null) {
			nbChannels.setText(newValue);
		} else {
			nbChannels.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.nbChannels);
		if (eefElementEditorReadOnlyState && nbChannels.isEnabled()) {
			nbChannels.setEnabled(false);
			nbChannels.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !nbChannels.isEnabled()) {
			nbChannels.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getTransferWidth()
	 * 
	 */
	public String getTransferWidth() {
		return transferWidth.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setTransferWidth(String
	 *      newValue)
	 * 
	 */
	public void setTransferWidth(String newValue) {
		if (newValue != null) {
			transferWidth.setText(newValue);
		} else {
			transferWidth.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.transferWidth);
		if (eefElementEditorReadOnlyState && transferWidth.isEnabled()) {
			transferWidth.setEnabled(false);
			transferWidth.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transferWidth.isEnabled()) {
			transferWidth.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getThroughput()
	 * 
	 */
	public String getThroughput() {
		return throughput.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setThroughput(String
	 *      newValue)
	 * 
	 */
	public void setThroughput(String newValue) {
		if (newValue != null) {
			throughput.setText(newValue);
		} else {
			throughput.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.throughput);
		if (eefElementEditorReadOnlyState && throughput.isEnabled()) {
			throughput.setEnabled(false);
			throughput.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !throughput.isEnabled()) {
			throughput.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getLevel()
	 * 
	 */
	public String getLevel() {
		return level.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setLevel(String
	 *      newValue)
	 * 
	 */
	public void setLevel(String newValue) {
		if (newValue != null) {
			level.setText(newValue);
		} else {
			level.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.level);
		if (eefElementEditorReadOnlyState && level.isEnabled()) {
			level.setEnabled(false);
			level.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !level.isEnabled()) {
			level.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getResMult()
	 * 
	 */
	public String getResMult() {
		return resMult.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setResMult(String
	 *      newValue)
	 * 
	 */
	public void setResMult(String newValue) {
		if (newValue != null) {
			resMult.setText(newValue);
		} else {
			resMult.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.resMult);
		if (eefElementEditorReadOnlyState && resMult.isEnabled()) {
			resMult.setEnabled(false);
			resMult.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resMult.isEnabled()) {
			resMult.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getSourcePort()
	 * 
	 */
	public EObject getSourcePort() {
		if (sourcePort.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) sourcePort.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#initSourcePort(EObjectFlatComboSettings)
	 */
	public void initSourcePort(EObjectFlatComboSettings settings) {
		sourcePort.setInput(settings);
		if (current != null) {
			sourcePort.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.sourcePort);
		if (eefElementEditorReadOnlyState && sourcePort.isEnabled()) {
			sourcePort.setEnabled(false);
			sourcePort.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sourcePort.isEnabled()) {
			sourcePort.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setSourcePort(EObject
	 *      newValue)
	 * 
	 */
	public void setSourcePort(EObject newValue) {
		if (newValue != null) {
			sourcePort.setSelection(new StructuredSelection(newValue));
		} else {
			sourcePort.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.sourcePort);
		if (eefElementEditorReadOnlyState && sourcePort.isEnabled()) {
			sourcePort.setEnabled(false);
			sourcePort.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sourcePort.isEnabled()) {
			sourcePort.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setSourcePortButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setSourcePortButtonMode(ButtonsModeEnum newValue) {
		sourcePort.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addFilterSourcePort(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSourcePort(ViewerFilter filter) {
		sourcePort.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addBusinessFilterSourcePort(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSourcePort(ViewerFilter filter) {
		sourcePort.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getTargetPort()
	 * 
	 */
	public EObject getTargetPort() {
		if (targetPort.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) targetPort.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#initTargetPort(EObjectFlatComboSettings)
	 */
	public void initTargetPort(EObjectFlatComboSettings settings) {
		targetPort.setInput(settings);
		if (current != null) {
			targetPort.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.targetPort);
		if (eefElementEditorReadOnlyState && targetPort.isEnabled()) {
			targetPort.setEnabled(false);
			targetPort.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !targetPort.isEnabled()) {
			targetPort.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setTargetPort(EObject
	 *      newValue)
	 * 
	 */
	public void setTargetPort(EObject newValue) {
		if (newValue != null) {
			targetPort.setSelection(new StructuredSelection(newValue));
		} else {
			targetPort.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.targetPort);
		if (eefElementEditorReadOnlyState && targetPort.isEnabled()) {
			targetPort.setEnabled(false);
			targetPort.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !targetPort.isEnabled()) {
			targetPort.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setTargetPortButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setTargetPortButtonMode(ButtonsModeEnum newValue) {
		targetPort.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addFilterTargetPort(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToTargetPort(ViewerFilter filter) {
		targetPort.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addBusinessFilterTargetPort(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToTargetPort(ViewerFilter filter) {
		targetPort.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#getMainScheduler()
	 * 
	 */
	public EObject getMainScheduler() {
		if (mainScheduler.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) mainScheduler.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#initMainScheduler(EObjectFlatComboSettings)
	 */
	public void initMainScheduler(EObjectFlatComboSettings settings) {
		mainScheduler.setInput(settings);
		if (current != null) {
			mainScheduler.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.mainScheduler);
		if (eefElementEditorReadOnlyState && mainScheduler.isEnabled()) {
			mainScheduler.setEnabled(false);
			mainScheduler.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mainScheduler.isEnabled()) {
			mainScheduler.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setMainScheduler(EObject
	 *      newValue)
	 * 
	 */
	public void setMainScheduler(EObject newValue) {
		if (newValue != null) {
			mainScheduler.setSelection(new StructuredSelection(newValue));
		} else {
			mainScheduler.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.mainScheduler);
		if (eefElementEditorReadOnlyState && mainScheduler.isEnabled()) {
			mainScheduler.setEnabled(false);
			mainScheduler.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mainScheduler.isEnabled()) {
			mainScheduler.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#setMainSchedulerButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setMainSchedulerButtonMode(ButtonsModeEnum newValue) {
		mainScheduler.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addFilterMainScheduler(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToMainScheduler(ViewerFilter filter) {
		mainScheduler.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addBusinessFilterMainScheduler(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToMainScheduler(ViewerFilter filter) {
		mainScheduler.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#initUsedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initUsedBy(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		usedBy.setContentProvider(contentProvider);
		usedBy.setInput(settings);
		usedByBusinessFilters.clear();
		usedByFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.usedBy);
		if (eefElementEditorReadOnlyState && usedBy.getTable().isEnabled()) {
			usedBy.setEnabled(false);
			usedBy.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usedBy.getTable().isEnabled()) {
			usedBy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#updateUsedBy()
	 * 
	 */
	public void updateUsedBy() {
		usedBy.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addFilterUsedBy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToUsedBy(ViewerFilter filter) {
		usedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addBusinessFilterUsedBy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToUsedBy(ViewerFilter filter) {
		usedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#isContainedInUsedByTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInUsedByTable(EObject element) {
		return ((ReferencesTableSettings) usedBy.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#initRealizedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRealizedBy(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		realizedBy.setContentProvider(contentProvider);
		realizedBy.setInput(settings);
		realizedByBusinessFilters.clear();
		realizedByFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.realizedBy);
		if (eefElementEditorReadOnlyState && realizedBy.getTable().isEnabled()) {
			realizedBy.setEnabled(false);
			realizedBy.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !realizedBy.getTable().isEnabled()) {
			realizedBy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#updateRealizedBy()
	 * 
	 */
	public void updateRealizedBy() {
		realizedBy.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addFilterRealizedBy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToRealizedBy(ViewerFilter filter) {
		realizedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addBusinessFilterRealizedBy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToRealizedBy(ViewerFilter filter) {
		realizedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#isContainedInRealizedByTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInRealizedByTable(EObject element) {
		return ((ReferencesTableSettings) realizedBy.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#initArbiters(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initArbiters(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		arbiters.setContentProvider(contentProvider);
		arbiters.setInput(settings);
		arbitersBusinessFilters.clear();
		arbitersFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.arbiters);
		if (eefElementEditorReadOnlyState && arbiters.getTable().isEnabled()) {
			arbiters.setEnabled(false);
			arbiters.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !arbiters.getTable().isEnabled()) {
			arbiters.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#updateArbiters()
	 * 
	 */
	public void updateArbiters() {
		arbiters.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addFilterArbiters(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToArbiters(ViewerFilter filter) {
		arbitersFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addBusinessFilterArbiters(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToArbiters(ViewerFilter filter) {
		arbitersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#isContainedInArbitersTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInArbitersTable(EObject element) {
		return ((ReferencesTableSettings) arbiters.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#initSides(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSides(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		sides.setContentProvider(contentProvider);
		sides.setInput(settings);
		sidesBusinessFilters.clear();
		sidesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.sides);
		if (eefElementEditorReadOnlyState && sides.getTable().isEnabled()) {
			sides.setEnabled(false);
			sides.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sides.getTable().isEnabled()) {
			sides.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#updateSides()
	 * 
	 */
	public void updateSides() {
		sides.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addFilterSides(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSides(ViewerFilter filter) {
		sidesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addBusinessFilterSides(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSides(ViewerFilter filter) {
		sidesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#isContainedInSidesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInSidesTable(EObject element) {
		return ((ReferencesTableSettings) sides.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#initManagedMemories(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initManagedMemories(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		managedMemories.setContentProvider(contentProvider);
		managedMemories.setInput(settings);
		managedMemoriesBusinessFilters.clear();
		managedMemoriesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.managedMemories);
		if (eefElementEditorReadOnlyState && managedMemories.getTable().isEnabled()) {
			managedMemories.setEnabled(false);
			managedMemories.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !managedMemories.getTable().isEnabled()) {
			managedMemories.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#updateManagedMemories()
	 * 
	 */
	public void updateManagedMemories() {
		managedMemories.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addFilterManagedMemories(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToManagedMemories(ViewerFilter filter) {
		managedMemoriesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addBusinessFilterManagedMemories(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToManagedMemories(ViewerFilter filter) {
		managedMemoriesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#isContainedInManagedMemoriesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInManagedMemoriesTable(EObject element) {
		return ((ReferencesTableSettings) managedMemories.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#initControlledMedia(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initControlledMedia(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		controlledMedia.setContentProvider(contentProvider);
		controlledMedia.setInput(settings);
		controlledMediaBusinessFilters.clear();
		controlledMediaFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.controlledMedia);
		if (eefElementEditorReadOnlyState && controlledMedia.getTable().isEnabled()) {
			controlledMedia.setEnabled(false);
			controlledMedia.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !controlledMedia.getTable().isEnabled()) {
			controlledMedia.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#updateControlledMedia()
	 * 
	 */
	public void updateControlledMedia() {
		controlledMedia.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addFilterControlledMedia(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToControlledMedia(ViewerFilter filter) {
		controlledMediaFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addBusinessFilterControlledMedia(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToControlledMedia(ViewerFilter filter) {
		controlledMediaBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#isContainedInControlledMediaTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInControlledMediaTable(EObject element) {
		return ((ReferencesTableSettings) controlledMedia.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#initDrivenBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initDrivenBy(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		drivenBy.setContentProvider(contentProvider);
		drivenBy.setInput(settings);
		drivenByBusinessFilters.clear();
		drivenByFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.drivenBy);
		if (eefElementEditorReadOnlyState && drivenBy.getTable().isEnabled()) {
			drivenBy.setEnabled(false);
			drivenBy.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !drivenBy.getTable().isEnabled()) {
			drivenBy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#updateDrivenBy()
	 * 
	 */
	public void updateDrivenBy() {
		drivenBy.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addFilterDrivenBy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToDrivenBy(ViewerFilter filter) {
		drivenByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addBusinessFilterDrivenBy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToDrivenBy(ViewerFilter filter) {
		drivenByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#isContainedInDrivenByTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInDrivenByTable(EObject element) {
		return ((ReferencesTableSettings) drivenBy.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#initBrokedResource(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initBrokedResource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		brokedResource.setContentProvider(contentProvider);
		brokedResource.setInput(settings);
		brokedResourceBusinessFilters.clear();
		brokedResourceFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.brokedResource);
		if (eefElementEditorReadOnlyState && brokedResource.getTable().isEnabled()) {
			brokedResource.setEnabled(false);
			brokedResource.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !brokedResource.getTable().isEnabled()) {
			brokedResource.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#updateBrokedResource()
	 * 
	 */
	public void updateBrokedResource() {
		brokedResource.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addFilterBrokedResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToBrokedResource(ViewerFilter filter) {
		brokedResourceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addBusinessFilterBrokedResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToBrokedResource(ViewerFilter filter) {
		brokedResourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#isContainedInBrokedResourceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInBrokedResourceTable(EObject element) {
		return ((ReferencesTableSettings) brokedResource.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#initOwnedElement(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedElement(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedElement.setContentProvider(contentProvider);
		ownedElement.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.ownedElement);
		if (eefElementEditorReadOnlyState && ownedElement.isEnabled()) {
			ownedElement.setEnabled(false);
			ownedElement.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedElement.isEnabled()) {
			ownedElement.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#updateOwnedElement()
	 * 
	 */
	public void updateOwnedElement() {
		ownedElement.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addFilterOwnedElement(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToOwnedElement(ViewerFilter filter) {
		ownedElementFilters.add(filter);
		if (this.ownedElement != null) {
			this.ownedElement.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addBusinessFilterOwnedElement(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedElement(ViewerFilter filter) {
		ownedElementBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#isContainedInOwnedElementTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedElementTable(EObject element) {
		return ((ReferencesTableSettings) ownedElement.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#initOwnedResource(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedResource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedResource.setContentProvider(contentProvider);
		ownedResource.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.ownedResource);
		if (eefElementEditorReadOnlyState && ownedResource.isEnabled()) {
			ownedResource.setEnabled(false);
			ownedResource.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedResource.isEnabled()) {
			ownedResource.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#updateOwnedResource()
	 * 
	 */
	public void updateOwnedResource() {
		ownedResource.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addFilterOwnedResource(ViewerFilter
	 *      filter)
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
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addBusinessFilterOwnedResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedResource(ViewerFilter filter) {
		ownedResourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#isContainedInOwnedResourceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedResourceTable(EObject element) {
		return ((ReferencesTableSettings) ownedResource.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#initOwnedConnector(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedConnector(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedConnector.setContentProvider(contentProvider);
		ownedConnector.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(HrmViewsRepository.General.Properties.ownedConnector);
		if (eefElementEditorReadOnlyState && ownedConnector.isEnabled()) {
			ownedConnector.setEnabled(false);
			ownedConnector.setToolTipText(HrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedConnector.isEnabled()) {
			ownedConnector.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#updateOwnedConnector()
	 * 
	 */
	public void updateOwnedConnector() {
		ownedConnector.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addFilterOwnedConnector(ViewerFilter
	 *      filter)
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
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#addBusinessFilterOwnedConnector(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedConnector(ViewerFilter filter) {
		ownedConnectorBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.hrm.parts.GeneralPropertiesEditionPart#isContainedInOwnedConnectorTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedConnectorTable(EObject element) {
		return ((ReferencesTableSettings) ownedConnector.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return HrmMessages.General_Part_Title;
	}

	// Start of user code additional methods

	// End of user code

}
