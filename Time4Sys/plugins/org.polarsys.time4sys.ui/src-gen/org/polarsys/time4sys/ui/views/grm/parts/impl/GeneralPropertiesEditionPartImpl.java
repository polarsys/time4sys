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
package org.polarsys.time4sys.ui.views.grm.parts.impl;

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
import org.polarsys.time4sys.ui.views.grm.parts.GeneralPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.grm.parts.GrmViewsRepository;
import org.polarsys.time4sys.ui.views.grm.providers.GrmMessages;

// End of user code

/**
 * 
 * 
 */
public class GeneralPropertiesEditionPartImpl extends CompositePropertiesEditionPart
		implements ISWTPropertiesEditionPart, GeneralPropertiesEditionPart {

	protected Text name;
	protected Button isPeriodic;
	protected Text value;
	protected Text elementSize;
	protected Text resMult;
	protected Text msgSize;
	protected Text packetSize;
	protected Text event;
	protected Text speedFactor;
	protected Button isProtected;
	protected Button isActive;
	protected Text otherProtocol;
	protected EMFComboViewer protocol;
	protected EMFComboViewer transmMode;
	protected EObjectFlatComboViewer start;
	protected EObjectFlatComboViewer set;
	protected EObjectFlatComboViewer get;
	protected EObjectFlatComboViewer reset;
	protected EObjectFlatComboViewer pause;
	protected EObjectFlatComboViewer scheduler;
	protected EObjectFlatComboViewer type;
	protected EObjectFlatComboViewer host;
	protected EObjectFlatComboViewer dependentScheduler;
	protected EObjectFlatComboViewer mainScheduler;
	protected EObjectFlatComboViewer sourcePort;
	protected EObjectFlatComboViewer targetPort;
	protected ReferencesTable usedBy;
	protected List<ViewerFilter> usedByBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> usedByFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable usedResource;
	protected List<ViewerFilter> usedResourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> usedResourceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable processingUnits;
	protected List<ViewerFilter> processingUnitsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> processingUnitsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable workload;
	protected List<ViewerFilter> workloadBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> workloadFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable brokedResource;
	protected List<ViewerFilter> brokedResourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> brokedResourceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable managedResource;
	protected List<ViewerFilter> managedResourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> managedResourceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable schedulableResource;
	protected List<ViewerFilter> schedulableResourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> schedulableResourceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable virtualProcessingUnit;
	protected List<ViewerFilter> virtualProcessingUnitBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> virtualProcessingUnitFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable protectParams;
	protected List<ViewerFilter> protectParamsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> protectParamsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable schedParams;
	protected List<ViewerFilter> schedParamsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> schedParamsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable requiredAmount;
	protected List<ViewerFilter> requiredAmountBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> requiredAmountFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedElement;
	protected List<ViewerFilter> ownedElementBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedElementFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedPort;
	protected List<ViewerFilter> ownedPortBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedPortFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedConnector;
	protected List<ViewerFilter> ownedConnectorBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedConnectorFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedResource;
	protected List<ViewerFilter> ownedResourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedResourceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ownedService;
	protected List<ViewerFilter> ownedServiceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedServiceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable usage;
	protected List<ViewerFilter> usageBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> usageFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable accCtrlPolicy;
	protected List<ViewerFilter> accCtrlPolicyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> accCtrlPolicyFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable resCtrlPolicy;
	protected List<ViewerFilter> resCtrlPolicyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resCtrlPolicyFilters = new ArrayList<ViewerFilter>();

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
		CompositionStep propertiesStep = generalStep.addStep(GrmViewsRepository.General.Properties.class);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.name);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.isPeriodic);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.value);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.elementSize);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.resMult);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.msgSize);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.packetSize);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.event);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.speedFactor);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.isProtected);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.isActive);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.otherProtocol);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.protocol);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.transmMode);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.start);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.set);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.get);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.reset);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.pause);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.scheduler);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.type);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.host);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.dependentScheduler);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.mainScheduler);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.sourcePort);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.targetPort);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.usedBy);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.usedResource);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.processingUnits);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.workload);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.brokedResource);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.managedResource);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.schedulableResource);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.virtualProcessingUnit);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.protectParams);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.schedParams);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.requiredAmount);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.ownedElement);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.ownedPort);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.ownedConnector);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.ownedResource);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.ownedService);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.usage);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.accCtrlPolicy);
		propertiesStep.addStep(GrmViewsRepository.General.Properties.resCtrlPolicy);

		composer = new PartComposer(generalStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == GrmViewsRepository.General.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == GrmViewsRepository.General.Properties.name) {
					return createNameText(parent);
				}
				if (key == GrmViewsRepository.General.Properties.isPeriodic) {
					return createIsPeriodicCheckbox(parent);
				}
				if (key == GrmViewsRepository.General.Properties.value) {
					return createValueText(parent);
				}
				if (key == GrmViewsRepository.General.Properties.elementSize) {
					return createElementSizeText(parent);
				}
				if (key == GrmViewsRepository.General.Properties.resMult) {
					return createResMultText(parent);
				}
				if (key == GrmViewsRepository.General.Properties.msgSize) {
					return createMsgSizeText(parent);
				}
				if (key == GrmViewsRepository.General.Properties.packetSize) {
					return createPacketSizeText(parent);
				}
				if (key == GrmViewsRepository.General.Properties.event) {
					return createEventText(parent);
				}
				if (key == GrmViewsRepository.General.Properties.speedFactor) {
					return createSpeedFactorText(parent);
				}
				if (key == GrmViewsRepository.General.Properties.isProtected) {
					return createIsProtectedCheckbox(parent);
				}
				if (key == GrmViewsRepository.General.Properties.isActive) {
					return createIsActiveCheckbox(parent);
				}
				if (key == GrmViewsRepository.General.Properties.otherProtocol) {
					return createOtherProtocolText(parent);
				}
				if (key == GrmViewsRepository.General.Properties.protocol) {
					return createProtocolEMFComboViewer(parent);
				}
				if (key == GrmViewsRepository.General.Properties.transmMode) {
					return createTransmModeEMFComboViewer(parent);
				}
				if (key == GrmViewsRepository.General.Properties.start) {
					return createStartFlatComboViewer(parent);
				}
				if (key == GrmViewsRepository.General.Properties.set) {
					return createSetFlatComboViewer(parent);
				}
				if (key == GrmViewsRepository.General.Properties.get) {
					return createGetFlatComboViewer(parent);
				}
				if (key == GrmViewsRepository.General.Properties.reset) {
					return createResetFlatComboViewer(parent);
				}
				if (key == GrmViewsRepository.General.Properties.pause) {
					return createPauseFlatComboViewer(parent);
				}
				if (key == GrmViewsRepository.General.Properties.scheduler) {
					return createSchedulerFlatComboViewer(parent);
				}
				if (key == GrmViewsRepository.General.Properties.type) {
					return createTypeFlatComboViewer(parent);
				}
				if (key == GrmViewsRepository.General.Properties.host) {
					return createHostFlatComboViewer(parent);
				}
				if (key == GrmViewsRepository.General.Properties.dependentScheduler) {
					return createDependentSchedulerFlatComboViewer(parent);
				}
				if (key == GrmViewsRepository.General.Properties.mainScheduler) {
					return createMainSchedulerFlatComboViewer(parent);
				}
				if (key == GrmViewsRepository.General.Properties.sourcePort) {
					return createSourcePortFlatComboViewer(parent);
				}
				if (key == GrmViewsRepository.General.Properties.targetPort) {
					return createTargetPortFlatComboViewer(parent);
				}
				if (key == GrmViewsRepository.General.Properties.usedBy) {
					return createUsedByAdvancedReferencesTable(parent);
				}
				if (key == GrmViewsRepository.General.Properties.usedResource) {
					return createUsedResourceAdvancedReferencesTable(parent);
				}
				if (key == GrmViewsRepository.General.Properties.processingUnits) {
					return createProcessingUnitsAdvancedReferencesTable(parent);
				}
				if (key == GrmViewsRepository.General.Properties.workload) {
					return createWorkloadAdvancedReferencesTable(parent);
				}
				if (key == GrmViewsRepository.General.Properties.brokedResource) {
					return createBrokedResourceAdvancedReferencesTable(parent);
				}
				if (key == GrmViewsRepository.General.Properties.managedResource) {
					return createManagedResourceAdvancedReferencesTable(parent);
				}
				if (key == GrmViewsRepository.General.Properties.schedulableResource) {
					return createSchedulableResourceAdvancedReferencesTable(parent);
				}
				if (key == GrmViewsRepository.General.Properties.virtualProcessingUnit) {
					return createVirtualProcessingUnitAdvancedReferencesTable(parent);
				}
				if (key == GrmViewsRepository.General.Properties.protectParams) {
					return createProtectParamsAdvancedTableComposition(parent);
				}
				if (key == GrmViewsRepository.General.Properties.schedParams) {
					return createSchedParamsAdvancedTableComposition(parent);
				}
				if (key == GrmViewsRepository.General.Properties.requiredAmount) {
					return createRequiredAmountAdvancedTableComposition(parent);
				}
				if (key == GrmViewsRepository.General.Properties.ownedElement) {
					return createOwnedElementAdvancedTableComposition(parent);
				}
				if (key == GrmViewsRepository.General.Properties.ownedPort) {
					return createOwnedPortAdvancedTableComposition(parent);
				}
				if (key == GrmViewsRepository.General.Properties.ownedConnector) {
					return createOwnedConnectorAdvancedTableComposition(parent);
				}
				if (key == GrmViewsRepository.General.Properties.ownedResource) {
					return createOwnedResourceAdvancedTableComposition(parent);
				}
				if (key == GrmViewsRepository.General.Properties.ownedService) {
					return createOwnedServiceAdvancedTableComposition(parent);
				}
				if (key == GrmViewsRepository.General.Properties.usage) {
					return createUsageAdvancedReferencesTable(parent);
				}
				if (key == GrmViewsRepository.General.Properties.accCtrlPolicy) {
					return createAccCtrlPolicyAdvancedTableComposition(parent);
				}
				if (key == GrmViewsRepository.General.Properties.resCtrlPolicy) {
					return createResCtrlPolicyAdvancedTableComposition(parent);
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
		propertiesGroup.setText(GrmMessages.GeneralPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	protected Composite createNameText(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.name,
				GrmMessages.GeneralPropertiesEditionPart_NameLabel);
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
							GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.name,
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
								GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.name,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, GrmViewsRepository.General.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.name, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	protected Composite createIsPeriodicCheckbox(Composite parent) {
		isPeriodic = new Button(parent, SWT.CHECK);
		isPeriodic.setText(getDescription(GrmViewsRepository.General.Properties.isPeriodic,
				GrmMessages.GeneralPropertiesEditionPart_IsPeriodicLabel));
		isPeriodic.addSelectionListener(new SelectionAdapter() {

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
									GrmViewsRepository.General.Properties.isPeriodic, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isPeriodic.getSelection())));
			}

		});
		GridData isPeriodicData = new GridData(GridData.FILL_HORIZONTAL);
		isPeriodicData.horizontalSpan = 2;
		isPeriodic.setLayoutData(isPeriodicData);
		EditingUtils.setID(isPeriodic, GrmViewsRepository.General.Properties.isPeriodic);
		EditingUtils.setEEFtype(isPeriodic, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.isPeriodic, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsPeriodicCheckbox

		// End of user code
		return parent;
	}

	protected Composite createValueText(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.value,
				GrmMessages.GeneralPropertiesEditionPart_ValueLabel);
		value = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {

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
							GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.value,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
			}

		});
		value.addKeyListener(new KeyAdapter() {

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
								GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.value,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}

		});
		EditingUtils.setID(value, GrmViewsRepository.General.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.value, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createValueText

		// End of user code
		return parent;
	}

	protected Composite createElementSizeText(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.elementSize,
				GrmMessages.GeneralPropertiesEditionPart_ElementSizeLabel);
		elementSize = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData elementSizeData = new GridData(GridData.FILL_HORIZONTAL);
		elementSize.setLayoutData(elementSizeData);
		elementSize.addFocusListener(new FocusAdapter() {

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
							GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.elementSize,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, elementSize.getText()));
			}

		});
		elementSize.addKeyListener(new KeyAdapter() {

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
								GrmViewsRepository.General.Properties.elementSize, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, elementSize.getText()));
				}
			}

		});
		EditingUtils.setID(elementSize, GrmViewsRepository.General.Properties.elementSize);
		EditingUtils.setEEFtype(elementSize, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.elementSize, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createElementSizeText

		// End of user code
		return parent;
	}

	protected Composite createResMultText(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.resMult,
				GrmMessages.GeneralPropertiesEditionPart_ResMultLabel);
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
							GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.resMult,
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
								GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.resMult,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resMult.getText()));
				}
			}

		});
		EditingUtils.setID(resMult, GrmViewsRepository.General.Properties.resMult);
		EditingUtils.setEEFtype(resMult, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.resMult, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createResMultText

		// End of user code
		return parent;
	}

	protected Composite createMsgSizeText(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.msgSize,
				GrmMessages.GeneralPropertiesEditionPart_MsgSizeLabel);
		msgSize = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData msgSizeData = new GridData(GridData.FILL_HORIZONTAL);
		msgSize.setLayoutData(msgSizeData);
		msgSize.addFocusListener(new FocusAdapter() {

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
							GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.msgSize,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, msgSize.getText()));
			}

		});
		msgSize.addKeyListener(new KeyAdapter() {

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
								GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.msgSize,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, msgSize.getText()));
				}
			}

		});
		EditingUtils.setID(msgSize, GrmViewsRepository.General.Properties.msgSize);
		EditingUtils.setEEFtype(msgSize, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.msgSize, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createMsgSizeText

		// End of user code
		return parent;
	}

	protected Composite createPacketSizeText(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.packetSize,
				GrmMessages.GeneralPropertiesEditionPart_PacketSizeLabel);
		packetSize = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData packetSizeData = new GridData(GridData.FILL_HORIZONTAL);
		packetSize.setLayoutData(packetSizeData);
		packetSize.addFocusListener(new FocusAdapter() {

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
							GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.packetSize,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packetSize.getText()));
			}

		});
		packetSize.addKeyListener(new KeyAdapter() {

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
								GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.packetSize,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packetSize.getText()));
				}
			}

		});
		EditingUtils.setID(packetSize, GrmViewsRepository.General.Properties.packetSize);
		EditingUtils.setEEFtype(packetSize, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.packetSize, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createPacketSizeText

		// End of user code
		return parent;
	}

	protected Composite createEventText(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.event,
				GrmMessages.GeneralPropertiesEditionPart_EventLabel);
		event = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData eventData = new GridData(GridData.FILL_HORIZONTAL);
		event.setLayoutData(eventData);
		event.addFocusListener(new FocusAdapter() {

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
							GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.event,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, event.getText()));
			}

		});
		event.addKeyListener(new KeyAdapter() {

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
								GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.event,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, event.getText()));
				}
			}

		});
		EditingUtils.setID(event, GrmViewsRepository.General.Properties.event);
		EditingUtils.setEEFtype(event, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.event, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createEventText

		// End of user code
		return parent;
	}

	protected Composite createSpeedFactorText(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.speedFactor,
				GrmMessages.GeneralPropertiesEditionPart_SpeedFactorLabel);
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
							GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.speedFactor,
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
								GrmViewsRepository.General.Properties.speedFactor, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, speedFactor.getText()));
				}
			}

		});
		EditingUtils.setID(speedFactor, GrmViewsRepository.General.Properties.speedFactor);
		EditingUtils.setEEFtype(speedFactor, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.speedFactor, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createSpeedFactorText

		// End of user code
		return parent;
	}

	protected Composite createIsProtectedCheckbox(Composite parent) {
		isProtected = new Button(parent, SWT.CHECK);
		isProtected.setText(getDescription(GrmViewsRepository.General.Properties.isProtected,
				GrmMessages.GeneralPropertiesEditionPart_IsProtectedLabel));
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
									GrmViewsRepository.General.Properties.isProtected, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isProtected.getSelection())));
			}

		});
		GridData isProtectedData = new GridData(GridData.FILL_HORIZONTAL);
		isProtectedData.horizontalSpan = 2;
		isProtected.setLayoutData(isProtectedData);
		EditingUtils.setID(isProtected, GrmViewsRepository.General.Properties.isProtected);
		EditingUtils.setEEFtype(isProtected, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.isProtected, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsProtectedCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsActiveCheckbox(Composite parent) {
		isActive = new Button(parent, SWT.CHECK);
		isActive.setText(getDescription(GrmViewsRepository.General.Properties.isActive,
				GrmMessages.GeneralPropertiesEditionPart_IsActiveLabel));
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
									GrmViewsRepository.General.Properties.isActive, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isActive.getSelection())));
			}

		});
		GridData isActiveData = new GridData(GridData.FILL_HORIZONTAL);
		isActiveData.horizontalSpan = 2;
		isActive.setLayoutData(isActiveData);
		EditingUtils.setID(isActive, GrmViewsRepository.General.Properties.isActive);
		EditingUtils.setEEFtype(isActive, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.isActive, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsActiveCheckbox

		// End of user code
		return parent;
	}

	protected Composite createOtherProtocolText(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.otherProtocol,
				GrmMessages.GeneralPropertiesEditionPart_OtherProtocolLabel);
		otherProtocol = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData otherProtocolData = new GridData(GridData.FILL_HORIZONTAL);
		otherProtocol.setLayoutData(otherProtocolData);
		otherProtocol.addFocusListener(new FocusAdapter() {

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
							GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.otherProtocol,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, otherProtocol.getText()));
			}

		});
		otherProtocol.addKeyListener(new KeyAdapter() {

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
								GrmViewsRepository.General.Properties.otherProtocol, PropertiesEditionEvent.COMMIT,
								PropertiesEditionEvent.SET, null, otherProtocol.getText()));
				}
			}

		});
		EditingUtils.setID(otherProtocol, GrmViewsRepository.General.Properties.otherProtocol);
		EditingUtils.setEEFtype(otherProtocol, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				GrmViewsRepository.General.Properties.otherProtocol, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createOtherProtocolText

		// End of user code
		return parent;
	}

	protected Composite createProtocolEMFComboViewer(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.protocol,
				GrmMessages.GeneralPropertiesEditionPart_ProtocolLabel);
		protocol = new EMFComboViewer(parent);
		protocol.setContentProvider(new ArrayContentProvider());
		protocol.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData protocolData = new GridData(GridData.FILL_HORIZONTAL);
		protocol.getCombo().setLayoutData(protocolData);
		protocol.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.protocol,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getProtocol()));
			}

		});
		protocol.setID(GrmViewsRepository.General.Properties.protocol);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.protocol, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createProtocolEMFComboViewer

		// End of user code
		return parent;
	}

	protected Composite createTransmModeEMFComboViewer(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.transmMode,
				GrmMessages.GeneralPropertiesEditionPart_TransmModeLabel);
		transmMode = new EMFComboViewer(parent);
		transmMode.setContentProvider(new ArrayContentProvider());
		transmMode.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData transmModeData = new GridData(GridData.FILL_HORIZONTAL);
		transmMode.getCombo().setLayoutData(transmModeData);
		transmMode.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.transmMode,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTransmMode()));
			}

		});
		transmMode.setID(GrmViewsRepository.General.Properties.transmMode);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.transmMode, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createTransmModeEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createStartFlatComboViewer(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.start,
				GrmMessages.GeneralPropertiesEditionPart_StartLabel);
		start = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GrmViewsRepository.General.Properties.start, GrmViewsRepository.SWT_KIND));
		start.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		start.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.start,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getStart()));
			}

		});
		GridData startData = new GridData(GridData.FILL_HORIZONTAL);
		start.setLayoutData(startData);
		start.setID(GrmViewsRepository.General.Properties.start);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.start, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createStartFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createSetFlatComboViewer(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.set,
				GrmMessages.GeneralPropertiesEditionPart_SetLabel);
		set = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GrmViewsRepository.General.Properties.set, GrmViewsRepository.SWT_KIND));
		set.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		set.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.set,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSet()));
			}

		});
		GridData setData = new GridData(GridData.FILL_HORIZONTAL);
		set.setLayoutData(setData);
		set.setID(GrmViewsRepository.General.Properties.set);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.set, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createSetFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createGetFlatComboViewer(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.get,
				GrmMessages.GeneralPropertiesEditionPart_GetLabel);
		get = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GrmViewsRepository.General.Properties.get, GrmViewsRepository.SWT_KIND));
		get.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		get.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.get,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getGet()));
			}

		});
		GridData getData = new GridData(GridData.FILL_HORIZONTAL);
		get.setLayoutData(getData);
		get.setID(GrmViewsRepository.General.Properties.get);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.get, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createGetFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createResetFlatComboViewer(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.reset,
				GrmMessages.GeneralPropertiesEditionPart_ResetLabel);
		reset = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GrmViewsRepository.General.Properties.reset, GrmViewsRepository.SWT_KIND));
		reset.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		reset.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.reset,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getReset()));
			}

		});
		GridData resetData = new GridData(GridData.FILL_HORIZONTAL);
		reset.setLayoutData(resetData);
		reset.setID(GrmViewsRepository.General.Properties.reset);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.reset, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createResetFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createPauseFlatComboViewer(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.pause,
				GrmMessages.GeneralPropertiesEditionPart_PauseLabel);
		pause = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GrmViewsRepository.General.Properties.pause, GrmViewsRepository.SWT_KIND));
		pause.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		pause.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.pause,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getPause()));
			}

		});
		GridData pauseData = new GridData(GridData.FILL_HORIZONTAL);
		pause.setLayoutData(pauseData);
		pause.setID(GrmViewsRepository.General.Properties.pause);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.pause, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createPauseFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createSchedulerFlatComboViewer(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.scheduler,
				GrmMessages.GeneralPropertiesEditionPart_SchedulerLabel);
		scheduler = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GrmViewsRepository.General.Properties.scheduler, GrmViewsRepository.SWT_KIND));
		scheduler.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		scheduler.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.scheduler,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getScheduler()));
			}

		});
		GridData schedulerData = new GridData(GridData.FILL_HORIZONTAL);
		scheduler.setLayoutData(schedulerData);
		scheduler.setID(GrmViewsRepository.General.Properties.scheduler);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.scheduler, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createSchedulerFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createTypeFlatComboViewer(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.type,
				GrmMessages.GeneralPropertiesEditionPart_TypeLabel);
		type = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GrmViewsRepository.General.Properties.type, GrmViewsRepository.SWT_KIND));
		type.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		type.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.type,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.setID(GrmViewsRepository.General.Properties.type);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.type, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createTypeFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createHostFlatComboViewer(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.host,
				GrmMessages.GeneralPropertiesEditionPart_HostLabel);
		host = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GrmViewsRepository.General.Properties.host, GrmViewsRepository.SWT_KIND));
		host.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		host.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.host,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getHost()));
			}

		});
		GridData hostData = new GridData(GridData.FILL_HORIZONTAL);
		host.setLayoutData(hostData);
		host.setID(GrmViewsRepository.General.Properties.host);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.host, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createHostFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createDependentSchedulerFlatComboViewer(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.dependentScheduler,
				GrmMessages.GeneralPropertiesEditionPart_DependentSchedulerLabel);
		dependentScheduler = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GrmViewsRepository.General.Properties.dependentScheduler, GrmViewsRepository.SWT_KIND));
		dependentScheduler.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		dependentScheduler.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.dependentScheduler,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDependentScheduler()));
			}

		});
		GridData dependentSchedulerData = new GridData(GridData.FILL_HORIZONTAL);
		dependentScheduler.setLayoutData(dependentSchedulerData);
		dependentScheduler.setID(GrmViewsRepository.General.Properties.dependentScheduler);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				GrmViewsRepository.General.Properties.dependentScheduler, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createDependentSchedulerFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createMainSchedulerFlatComboViewer(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.mainScheduler,
				GrmMessages.GeneralPropertiesEditionPart_MainSchedulerLabel);
		mainScheduler = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GrmViewsRepository.General.Properties.mainScheduler, GrmViewsRepository.SWT_KIND));
		mainScheduler.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		mainScheduler.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.mainScheduler,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getMainScheduler()));
			}

		});
		GridData mainSchedulerData = new GridData(GridData.FILL_HORIZONTAL);
		mainScheduler.setLayoutData(mainSchedulerData);
		mainScheduler.setID(GrmViewsRepository.General.Properties.mainScheduler);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				GrmViewsRepository.General.Properties.mainScheduler, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createMainSchedulerFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param parent
	 *            the parent composite
	 * 
	 */
	protected Composite createSourcePortFlatComboViewer(Composite parent) {
		createDescription(parent, GrmViewsRepository.General.Properties.sourcePort,
				GrmMessages.GeneralPropertiesEditionPart_SourcePortLabel);
		sourcePort = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GrmViewsRepository.General.Properties.sourcePort, GrmViewsRepository.SWT_KIND));
		sourcePort.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		sourcePort.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.sourcePort,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSourcePort()));
			}

		});
		GridData sourcePortData = new GridData(GridData.FILL_HORIZONTAL);
		sourcePort.setLayoutData(sourcePortData);
		sourcePort.setID(GrmViewsRepository.General.Properties.sourcePort);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.sourcePort, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
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
		createDescription(parent, GrmViewsRepository.General.Properties.targetPort,
				GrmMessages.GeneralPropertiesEditionPart_TargetPortLabel);
		targetPort = new EObjectFlatComboViewer(parent, !propertiesEditionComponent
				.isRequired(GrmViewsRepository.General.Properties.targetPort, GrmViewsRepository.SWT_KIND));
		targetPort.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		targetPort.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
						GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.targetPort,
						PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTargetPort()));
			}

		});
		GridData targetPortData = new GridData(GridData.FILL_HORIZONTAL);
		targetPort.setLayoutData(targetPortData);
		targetPort.setID(GrmViewsRepository.General.Properties.targetPort);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.targetPort, GrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createTargetPortFlatComboViewer

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createUsedByAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GrmViewsRepository.General.Properties.usedBy,
				GrmMessages.GeneralPropertiesEditionPart_UsedByLabel);
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
		this.usedBy.setHelpText(propertiesEditionComponent.getHelpContent(GrmViewsRepository.General.Properties.usedBy,
				GrmViewsRepository.SWT_KIND));
		this.usedBy.createControls(parent);
		this.usedBy.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.usedBy, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData usedByData = new GridData(GridData.FILL_HORIZONTAL);
		usedByData.horizontalSpan = 3;
		this.usedBy.setLayoutData(usedByData);
		this.usedBy.disableMove();
		usedBy.setID(GrmViewsRepository.General.Properties.usedBy);
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
							GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.usedBy,
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
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.usedBy,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		usedBy.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromUsedBy(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.usedBy,
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
	protected Composite createUsedResourceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GrmViewsRepository.General.Properties.usedResource,
				GrmMessages.GeneralPropertiesEditionPart_UsedResourceLabel);
		this.usedResource = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addUsedResource();
			}

			public void handleEdit(EObject element) {
				editUsedResource(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveUsedResource(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromUsedResource(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.usedResource.setHelpText(propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.usedResource, GrmViewsRepository.SWT_KIND));
		this.usedResource.createControls(parent);
		this.usedResource.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.usedResource, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData usedResourceData = new GridData(GridData.FILL_HORIZONTAL);
		usedResourceData.horizontalSpan = 3;
		this.usedResource.setLayoutData(usedResourceData);
		this.usedResource.disableMove();
		usedResource.setID(GrmViewsRepository.General.Properties.usedResource);
		usedResource.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addUsedResource() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(usedResource.getInput(),
				usedResourceFilters, usedResourceBusinessFilters, "usedResource",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.usedResource,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				usedResource.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveUsedResource(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.usedResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		usedResource.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromUsedResource(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.usedResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		usedResource.refresh();
	}

	/**
	 * 
	 */
	protected void editUsedResource(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				usedResource.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createProcessingUnitsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GrmViewsRepository.General.Properties.processingUnits,
				GrmMessages.GeneralPropertiesEditionPart_ProcessingUnitsLabel);
		this.processingUnits = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addProcessingUnits();
			}

			public void handleEdit(EObject element) {
				editProcessingUnits(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveProcessingUnits(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromProcessingUnits(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.processingUnits.setHelpText(propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.processingUnits, GrmViewsRepository.SWT_KIND));
		this.processingUnits.createControls(parent);
		this.processingUnits.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this,
							GrmViewsRepository.General.Properties.processingUnits, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData processingUnitsData = new GridData(GridData.FILL_HORIZONTAL);
		processingUnitsData.horizontalSpan = 3;
		this.processingUnits.setLayoutData(processingUnitsData);
		this.processingUnits.disableMove();
		processingUnits.setID(GrmViewsRepository.General.Properties.processingUnits);
		processingUnits.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addProcessingUnits() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(processingUnits.getInput(),
				processingUnitsFilters, processingUnitsBusinessFilters, "processingUnits",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.processingUnits,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				processingUnits.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveProcessingUnits(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.processingUnits,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processingUnits.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcessingUnits(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.processingUnits,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		processingUnits.refresh();
	}

	/**
	 * 
	 */
	protected void editProcessingUnits(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				processingUnits.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createWorkloadAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GrmViewsRepository.General.Properties.workload,
				GrmMessages.GeneralPropertiesEditionPart_WorkloadLabel);
		this.workload = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addWorkload();
			}

			public void handleEdit(EObject element) {
				editWorkload(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveWorkload(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromWorkload(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.workload.setHelpText(propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.workload, GrmViewsRepository.SWT_KIND));
		this.workload.createControls(parent);
		this.workload.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.workload, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData workloadData = new GridData(GridData.FILL_HORIZONTAL);
		workloadData.horizontalSpan = 3;
		this.workload.setLayoutData(workloadData);
		this.workload.disableMove();
		workload.setID(GrmViewsRepository.General.Properties.workload);
		workload.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addWorkload() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(workload.getInput(), workloadFilters,
				workloadBusinessFilters, "workload", propertiesEditionComponent.getEditingContext().getAdapterFactory(),
				current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.workload,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				workload.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveWorkload(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.workload,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		workload.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromWorkload(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.workload,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		workload.refresh();
	}

	/**
	 * 
	 */
	protected void editWorkload(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				workload.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createBrokedResourceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GrmViewsRepository.General.Properties.brokedResource,
				GrmMessages.GeneralPropertiesEditionPart_BrokedResourceLabel);
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
				.getHelpContent(GrmViewsRepository.General.Properties.brokedResource, GrmViewsRepository.SWT_KIND));
		this.brokedResource.createControls(parent);
		this.brokedResource.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.brokedResource, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData brokedResourceData = new GridData(GridData.FILL_HORIZONTAL);
		brokedResourceData.horizontalSpan = 3;
		this.brokedResource.setLayoutData(brokedResourceData);
		this.brokedResource.disableMove();
		brokedResource.setID(GrmViewsRepository.General.Properties.brokedResource);
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
							GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.brokedResource,
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
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.brokedResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		brokedResource.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromBrokedResource(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.brokedResource,
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
	 * 
	 */
	protected Composite createManagedResourceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GrmViewsRepository.General.Properties.managedResource,
				GrmMessages.GeneralPropertiesEditionPart_ManagedResourceLabel);
		this.managedResource = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addManagedResource();
			}

			public void handleEdit(EObject element) {
				editManagedResource(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveManagedResource(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromManagedResource(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.managedResource.setHelpText(propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.managedResource, GrmViewsRepository.SWT_KIND));
		this.managedResource.createControls(parent);
		this.managedResource.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this,
							GrmViewsRepository.General.Properties.managedResource, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData managedResourceData = new GridData(GridData.FILL_HORIZONTAL);
		managedResourceData.horizontalSpan = 3;
		this.managedResource.setLayoutData(managedResourceData);
		this.managedResource.disableMove();
		managedResource.setID(GrmViewsRepository.General.Properties.managedResource);
		managedResource.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addManagedResource() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(managedResource.getInput(),
				managedResourceFilters, managedResourceBusinessFilters, "managedResource",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.managedResource,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				managedResource.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveManagedResource(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.managedResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		managedResource.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromManagedResource(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.managedResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		managedResource.refresh();
	}

	/**
	 * 
	 */
	protected void editManagedResource(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				managedResource.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSchedulableResourceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GrmViewsRepository.General.Properties.schedulableResource,
				GrmMessages.GeneralPropertiesEditionPart_SchedulableResourceLabel);
		this.schedulableResource = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addSchedulableResource();
			}

			public void handleEdit(EObject element) {
				editSchedulableResource(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveSchedulableResource(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromSchedulableResource(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.schedulableResource.setHelpText(propertiesEditionComponent.getHelpContent(
				GrmViewsRepository.General.Properties.schedulableResource, GrmViewsRepository.SWT_KIND));
		this.schedulableResource.createControls(parent);
		this.schedulableResource.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this,
							GrmViewsRepository.General.Properties.schedulableResource, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData schedulableResourceData = new GridData(GridData.FILL_HORIZONTAL);
		schedulableResourceData.horizontalSpan = 3;
		this.schedulableResource.setLayoutData(schedulableResourceData);
		this.schedulableResource.disableMove();
		schedulableResource.setID(GrmViewsRepository.General.Properties.schedulableResource);
		schedulableResource.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSchedulableResource() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(schedulableResource.getInput(),
				schedulableResourceFilters, schedulableResourceBusinessFilters, "schedulableResource",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.schedulableResource,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				schedulableResource.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSchedulableResource(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.schedulableResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		schedulableResource.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSchedulableResource(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.schedulableResource,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		schedulableResource.refresh();
	}

	/**
	 * 
	 */
	protected void editSchedulableResource(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				schedulableResource.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createVirtualProcessingUnitAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GrmViewsRepository.General.Properties.virtualProcessingUnit,
				GrmMessages.GeneralPropertiesEditionPart_VirtualProcessingUnitLabel);
		this.virtualProcessingUnit = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addVirtualProcessingUnit();
			}

			public void handleEdit(EObject element) {
				editVirtualProcessingUnit(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveVirtualProcessingUnit(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromVirtualProcessingUnit(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.virtualProcessingUnit.setHelpText(propertiesEditionComponent.getHelpContent(
				GrmViewsRepository.General.Properties.virtualProcessingUnit, GrmViewsRepository.SWT_KIND));
		this.virtualProcessingUnit.createControls(parent);
		this.virtualProcessingUnit.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this,
							GrmViewsRepository.General.Properties.virtualProcessingUnit, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData virtualProcessingUnitData = new GridData(GridData.FILL_HORIZONTAL);
		virtualProcessingUnitData.horizontalSpan = 3;
		this.virtualProcessingUnit.setLayoutData(virtualProcessingUnitData);
		this.virtualProcessingUnit.disableMove();
		virtualProcessingUnit.setID(GrmViewsRepository.General.Properties.virtualProcessingUnit);
		virtualProcessingUnit.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addVirtualProcessingUnit() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(virtualProcessingUnit.getInput(),
				virtualProcessingUnitFilters, virtualProcessingUnitBusinessFilters, "virtualProcessingUnit",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.virtualProcessingUnit,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				virtualProcessingUnit.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveVirtualProcessingUnit(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.virtualProcessingUnit,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		virtualProcessingUnit.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromVirtualProcessingUnit(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.virtualProcessingUnit,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		virtualProcessingUnit.refresh();
	}

	/**
	 * 
	 */
	protected void editVirtualProcessingUnit(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				virtualProcessingUnit.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createProtectParamsAdvancedTableComposition(Composite parent) {
		this.protectParams = new ReferencesTable(getDescription(GrmViewsRepository.General.Properties.protectParams,
				GrmMessages.GeneralPropertiesEditionPart_ProtectParamsLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.protectParams,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						protectParams.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.protectParams,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						protectParams.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.protectParams,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						protectParams.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.protectParams,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						protectParams.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.protectParamsFilters) {
			this.protectParams.addFilter(filter);
		}
		this.protectParams.setHelpText(propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.protectParams, GrmViewsRepository.SWT_KIND));
		this.protectParams.createControls(parent);
		this.protectParams.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.protectParams, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData protectParamsData = new GridData(GridData.FILL_HORIZONTAL);
		protectParamsData.horizontalSpan = 3;
		this.protectParams.setLayoutData(protectParamsData);
		this.protectParams.setLowerBound(0);
		this.protectParams.setUpperBound(-1);
		protectParams.setID(GrmViewsRepository.General.Properties.protectParams);
		protectParams.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createProtectParamsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createSchedParamsAdvancedTableComposition(Composite parent) {
		this.schedParams = new ReferencesTable(getDescription(GrmViewsRepository.General.Properties.schedParams,
				GrmMessages.GeneralPropertiesEditionPart_SchedParamsLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.schedParams,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						schedParams.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.schedParams,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						schedParams.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.schedParams,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						schedParams.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.schedParams,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						schedParams.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.schedParamsFilters) {
			this.schedParams.addFilter(filter);
		}
		this.schedParams.setHelpText(propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.schedParams, GrmViewsRepository.SWT_KIND));
		this.schedParams.createControls(parent);
		this.schedParams.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.schedParams, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData schedParamsData = new GridData(GridData.FILL_HORIZONTAL);
		schedParamsData.horizontalSpan = 3;
		this.schedParams.setLayoutData(schedParamsData);
		this.schedParams.setLowerBound(0);
		this.schedParams.setUpperBound(-1);
		schedParams.setID(GrmViewsRepository.General.Properties.schedParams);
		schedParams.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createSchedParamsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createRequiredAmountAdvancedTableComposition(Composite parent) {
		this.requiredAmount = new ReferencesTable(getDescription(GrmViewsRepository.General.Properties.requiredAmount,
				GrmMessages.GeneralPropertiesEditionPart_RequiredAmountLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.requiredAmount,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						requiredAmount.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.requiredAmount,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						requiredAmount.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.requiredAmount,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						requiredAmount.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.requiredAmount,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						requiredAmount.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.requiredAmountFilters) {
			this.requiredAmount.addFilter(filter);
		}
		this.requiredAmount.setHelpText(propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.requiredAmount, GrmViewsRepository.SWT_KIND));
		this.requiredAmount.createControls(parent);
		this.requiredAmount.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.requiredAmount, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData requiredAmountData = new GridData(GridData.FILL_HORIZONTAL);
		requiredAmountData.horizontalSpan = 3;
		this.requiredAmount.setLayoutData(requiredAmountData);
		this.requiredAmount.setLowerBound(0);
		this.requiredAmount.setUpperBound(-1);
		requiredAmount.setID(GrmViewsRepository.General.Properties.requiredAmount);
		requiredAmount.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createRequiredAmountAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedElementAdvancedTableComposition(Composite parent) {
		this.ownedElement = new ReferencesTable(getDescription(GrmViewsRepository.General.Properties.ownedElement,
				GrmMessages.GeneralPropertiesEditionPart_OwnedElementLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.ownedElement,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedElement.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.ownedElement,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedElement.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.ownedElement,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedElement.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.ownedElement,
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
				.getHelpContent(GrmViewsRepository.General.Properties.ownedElement, GrmViewsRepository.SWT_KIND));
		this.ownedElement.createControls(parent);
		this.ownedElement.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.ownedElement, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedElementData = new GridData(GridData.FILL_HORIZONTAL);
		ownedElementData.horizontalSpan = 3;
		this.ownedElement.setLayoutData(ownedElementData);
		this.ownedElement.setLowerBound(0);
		this.ownedElement.setUpperBound(-1);
		ownedElement.setID(GrmViewsRepository.General.Properties.ownedElement);
		ownedElement.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedElementAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedPortAdvancedTableComposition(Composite parent) {
		this.ownedPort = new ReferencesTable(getDescription(GrmViewsRepository.General.Properties.ownedPort,
				GrmMessages.GeneralPropertiesEditionPart_OwnedPortLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.ownedPort,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedPort.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.ownedPort,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedPort.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.ownedPort,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedPort.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.ownedPort,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						ownedPort.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.ownedPortFilters) {
			this.ownedPort.addFilter(filter);
		}
		this.ownedPort.setHelpText(propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.ownedPort, GrmViewsRepository.SWT_KIND));
		this.ownedPort.createControls(parent);
		this.ownedPort.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.ownedPort, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedPortData = new GridData(GridData.FILL_HORIZONTAL);
		ownedPortData.horizontalSpan = 3;
		this.ownedPort.setLayoutData(ownedPortData);
		this.ownedPort.setLowerBound(0);
		this.ownedPort.setUpperBound(-1);
		ownedPort.setID(GrmViewsRepository.General.Properties.ownedPort);
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
		this.ownedConnector = new ReferencesTable(getDescription(GrmViewsRepository.General.Properties.ownedConnector,
				GrmMessages.GeneralPropertiesEditionPart_OwnedConnectorLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.ownedConnector,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedConnector.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.ownedConnector,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedConnector.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.ownedConnector,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedConnector.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.ownedConnector,
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
				.getHelpContent(GrmViewsRepository.General.Properties.ownedConnector, GrmViewsRepository.SWT_KIND));
		this.ownedConnector.createControls(parent);
		this.ownedConnector.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.ownedConnector, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedConnectorData = new GridData(GridData.FILL_HORIZONTAL);
		ownedConnectorData.horizontalSpan = 3;
		this.ownedConnector.setLayoutData(ownedConnectorData);
		this.ownedConnector.setLowerBound(0);
		this.ownedConnector.setUpperBound(-1);
		ownedConnector.setID(GrmViewsRepository.General.Properties.ownedConnector);
		ownedConnector.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedConnectorAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedResourceAdvancedTableComposition(Composite parent) {
		this.ownedResource = new ReferencesTable(getDescription(GrmViewsRepository.General.Properties.ownedResource,
				GrmMessages.GeneralPropertiesEditionPart_OwnedResourceLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.ownedResource,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedResource.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.ownedResource,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedResource.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.ownedResource,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedResource.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.ownedResource,
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
				.getHelpContent(GrmViewsRepository.General.Properties.ownedResource, GrmViewsRepository.SWT_KIND));
		this.ownedResource.createControls(parent);
		this.ownedResource.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.ownedResource, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedResourceData = new GridData(GridData.FILL_HORIZONTAL);
		ownedResourceData.horizontalSpan = 3;
		this.ownedResource.setLayoutData(ownedResourceData);
		this.ownedResource.setLowerBound(0);
		this.ownedResource.setUpperBound(-1);
		ownedResource.setID(GrmViewsRepository.General.Properties.ownedResource);
		ownedResource.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedResourceAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedServiceAdvancedTableComposition(Composite parent) {
		this.ownedService = new ReferencesTable(getDescription(GrmViewsRepository.General.Properties.ownedService,
				GrmMessages.GeneralPropertiesEditionPart_OwnedServiceLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.ownedService,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedService.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.ownedService,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedService.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.ownedService,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedService.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.ownedService,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						ownedService.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.ownedServiceFilters) {
			this.ownedService.addFilter(filter);
		}
		this.ownedService.setHelpText(propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.ownedService, GrmViewsRepository.SWT_KIND));
		this.ownedService.createControls(parent);
		this.ownedService.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.ownedService, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedServiceData = new GridData(GridData.FILL_HORIZONTAL);
		ownedServiceData.horizontalSpan = 3;
		this.ownedService.setLayoutData(ownedServiceData);
		this.ownedService.setLowerBound(0);
		this.ownedService.setUpperBound(-1);
		ownedService.setID(GrmViewsRepository.General.Properties.ownedService);
		ownedService.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedServiceAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createUsageAdvancedReferencesTable(Composite parent) {
		String label = getDescription(GrmViewsRepository.General.Properties.usage,
				GrmMessages.GeneralPropertiesEditionPart_UsageLabel);
		this.usage = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addUsage();
			}

			public void handleEdit(EObject element) {
				editUsage(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveUsage(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromUsage(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.usage.setHelpText(propertiesEditionComponent.getHelpContent(GrmViewsRepository.General.Properties.usage,
				GrmViewsRepository.SWT_KIND));
		this.usage.createControls(parent);
		this.usage.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.usage, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData usageData = new GridData(GridData.FILL_HORIZONTAL);
		usageData.horizontalSpan = 3;
		this.usage.setLayoutData(usageData);
		this.usage.disableMove();
		usage.setID(GrmViewsRepository.General.Properties.usage);
		usage.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addUsage() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(usage.getInput(), usageFilters,
				usageBusinessFilters, "usage", propertiesEditionComponent.getEditingContext().getAdapterFactory(),
				current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.usage,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				usage.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveUsage(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.usage,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		usage.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromUsage(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
				GeneralPropertiesEditionPartImpl.this, GrmViewsRepository.General.Properties.usage,
				PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		usage.refresh();
	}

	/**
	 * 
	 */
	protected void editUsage(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				usage.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAccCtrlPolicyAdvancedTableComposition(Composite parent) {
		this.accCtrlPolicy = new ReferencesTable(getDescription(GrmViewsRepository.General.Properties.accCtrlPolicy,
				GrmMessages.GeneralPropertiesEditionPart_AccCtrlPolicyLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.accCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						accCtrlPolicy.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.accCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						accCtrlPolicy.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.accCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						accCtrlPolicy.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.accCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						accCtrlPolicy.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.accCtrlPolicyFilters) {
			this.accCtrlPolicy.addFilter(filter);
		}
		this.accCtrlPolicy.setHelpText(propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.accCtrlPolicy, GrmViewsRepository.SWT_KIND));
		this.accCtrlPolicy.createControls(parent);
		this.accCtrlPolicy.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.accCtrlPolicy, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData accCtrlPolicyData = new GridData(GridData.FILL_HORIZONTAL);
		accCtrlPolicyData.horizontalSpan = 3;
		this.accCtrlPolicy.setLayoutData(accCtrlPolicyData);
		this.accCtrlPolicy.setLowerBound(0);
		this.accCtrlPolicy.setUpperBound(-1);
		accCtrlPolicy.setID(GrmViewsRepository.General.Properties.accCtrlPolicy);
		accCtrlPolicy.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAccCtrlPolicyAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createResCtrlPolicyAdvancedTableComposition(Composite parent) {
		this.resCtrlPolicy = new ReferencesTable(getDescription(GrmViewsRepository.General.Properties.resCtrlPolicy,
				GrmMessages.GeneralPropertiesEditionPart_ResCtrlPolicyLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.resCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						resCtrlPolicy.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.resCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						resCtrlPolicy.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.resCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						resCtrlPolicy.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent
								.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
										GrmViewsRepository.General.Properties.resCtrlPolicy,
										PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						resCtrlPolicy.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.resCtrlPolicyFilters) {
			this.resCtrlPolicy.addFilter(filter);
		}
		this.resCtrlPolicy.setHelpText(propertiesEditionComponent
				.getHelpContent(GrmViewsRepository.General.Properties.resCtrlPolicy, GrmViewsRepository.SWT_KIND));
		this.resCtrlPolicy.createControls(parent);
		this.resCtrlPolicy.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(GeneralPropertiesEditionPartImpl.this,
									GrmViewsRepository.General.Properties.resCtrlPolicy, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData resCtrlPolicyData = new GridData(GridData.FILL_HORIZONTAL);
		resCtrlPolicyData.horizontalSpan = 3;
		this.resCtrlPolicy.setLayoutData(resCtrlPolicyData);
		this.resCtrlPolicy.setLowerBound(0);
		this.resCtrlPolicy.setUpperBound(-1);
		resCtrlPolicy.setID(GrmViewsRepository.General.Properties.resCtrlPolicy);
		resCtrlPolicy.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createResCtrlPolicyAdvancedTableComposition

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
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setName(String
	 *      newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getIsPeriodic()
	 * 
	 */
	public Boolean getIsPeriodic() {
		return Boolean.valueOf(isPeriodic.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setIsPeriodic(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsPeriodic(Boolean newValue) {
		if (newValue != null) {
			isPeriodic.setSelection(newValue.booleanValue());
		} else {
			isPeriodic.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.isPeriodic);
		if (eefElementEditorReadOnlyState && isPeriodic.isEnabled()) {
			isPeriodic.setEnabled(false);
			isPeriodic.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isPeriodic.isEnabled()) {
			isPeriodic.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setValue(String
	 *      newValue)
	 * 
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.value);
		if (eefElementEditorReadOnlyState && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !value.isEnabled()) {
			value.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getElementSize()
	 * 
	 */
	public String getElementSize() {
		return elementSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setElementSize(String
	 *      newValue)
	 * 
	 */
	public void setElementSize(String newValue) {
		if (newValue != null) {
			elementSize.setText(newValue);
		} else {
			elementSize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.elementSize);
		if (eefElementEditorReadOnlyState && elementSize.isEnabled()) {
			elementSize.setEnabled(false);
			elementSize.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !elementSize.isEnabled()) {
			elementSize.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getResMult()
	 * 
	 */
	public String getResMult() {
		return resMult.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setResMult(String
	 *      newValue)
	 * 
	 */
	public void setResMult(String newValue) {
		if (newValue != null) {
			resMult.setText(newValue);
		} else {
			resMult.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.resMult);
		if (eefElementEditorReadOnlyState && resMult.isEnabled()) {
			resMult.setEnabled(false);
			resMult.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resMult.isEnabled()) {
			resMult.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getMsgSize()
	 * 
	 */
	public String getMsgSize() {
		return msgSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setMsgSize(String
	 *      newValue)
	 * 
	 */
	public void setMsgSize(String newValue) {
		if (newValue != null) {
			msgSize.setText(newValue);
		} else {
			msgSize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.msgSize);
		if (eefElementEditorReadOnlyState && msgSize.isEnabled()) {
			msgSize.setEnabled(false);
			msgSize.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !msgSize.isEnabled()) {
			msgSize.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getPacketSize()
	 * 
	 */
	public String getPacketSize() {
		return packetSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setPacketSize(String
	 *      newValue)
	 * 
	 */
	public void setPacketSize(String newValue) {
		if (newValue != null) {
			packetSize.setText(newValue);
		} else {
			packetSize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.packetSize);
		if (eefElementEditorReadOnlyState && packetSize.isEnabled()) {
			packetSize.setEnabled(false);
			packetSize.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !packetSize.isEnabled()) {
			packetSize.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getEvent()
	 * 
	 */
	public String getEvent() {
		return event.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setEvent(String
	 *      newValue)
	 * 
	 */
	public void setEvent(String newValue) {
		if (newValue != null) {
			event.setText(newValue);
		} else {
			event.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.event);
		if (eefElementEditorReadOnlyState && event.isEnabled()) {
			event.setEnabled(false);
			event.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !event.isEnabled()) {
			event.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getSpeedFactor()
	 * 
	 */
	public String getSpeedFactor() {
		return speedFactor.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setSpeedFactor(String
	 *      newValue)
	 * 
	 */
	public void setSpeedFactor(String newValue) {
		if (newValue != null) {
			speedFactor.setText(newValue);
		} else {
			speedFactor.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.speedFactor);
		if (eefElementEditorReadOnlyState && speedFactor.isEnabled()) {
			speedFactor.setEnabled(false);
			speedFactor.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !speedFactor.isEnabled()) {
			speedFactor.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getIsProtected()
	 * 
	 */
	public Boolean getIsProtected() {
		return Boolean.valueOf(isProtected.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setIsProtected(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsProtected(Boolean newValue) {
		if (newValue != null) {
			isProtected.setSelection(newValue.booleanValue());
		} else {
			isProtected.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.isProtected);
		if (eefElementEditorReadOnlyState && isProtected.isEnabled()) {
			isProtected.setEnabled(false);
			isProtected.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isProtected.isEnabled()) {
			isProtected.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getIsActive()
	 * 
	 */
	public Boolean getIsActive() {
		return Boolean.valueOf(isActive.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setIsActive(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsActive(Boolean newValue) {
		if (newValue != null) {
			isActive.setSelection(newValue.booleanValue());
		} else {
			isActive.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.isActive);
		if (eefElementEditorReadOnlyState && isActive.isEnabled()) {
			isActive.setEnabled(false);
			isActive.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isActive.isEnabled()) {
			isActive.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getOtherProtocol()
	 * 
	 */
	public String getOtherProtocol() {
		return otherProtocol.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setOtherProtocol(String
	 *      newValue)
	 * 
	 */
	public void setOtherProtocol(String newValue) {
		if (newValue != null) {
			otherProtocol.setText(newValue);
		} else {
			otherProtocol.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.otherProtocol);
		if (eefElementEditorReadOnlyState && otherProtocol.isEnabled()) {
			otherProtocol.setEnabled(false);
			otherProtocol.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !otherProtocol.isEnabled()) {
			otherProtocol.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getProtocol()
	 * 
	 */
	public Enumerator getProtocol() {
		Enumerator selection = (Enumerator) ((StructuredSelection) protocol.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initProtocol(Object
	 *      input, Enumerator current)
	 */
	public void initProtocol(Object input, Enumerator current) {
		protocol.setInput(input);
		protocol.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.protocol);
		if (eefElementEditorReadOnlyState && protocol.isEnabled()) {
			protocol.setEnabled(false);
			protocol.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !protocol.isEnabled()) {
			protocol.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setProtocol(Enumerator
	 *      newValue)
	 * 
	 */
	public void setProtocol(Enumerator newValue) {
		protocol.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.protocol);
		if (eefElementEditorReadOnlyState && protocol.isEnabled()) {
			protocol.setEnabled(false);
			protocol.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !protocol.isEnabled()) {
			protocol.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getTransmMode()
	 * 
	 */
	public Enumerator getTransmMode() {
		Enumerator selection = (Enumerator) ((StructuredSelection) transmMode.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initTransmMode(Object
	 *      input, Enumerator current)
	 */
	public void initTransmMode(Object input, Enumerator current) {
		transmMode.setInput(input);
		transmMode.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.transmMode);
		if (eefElementEditorReadOnlyState && transmMode.isEnabled()) {
			transmMode.setEnabled(false);
			transmMode.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transmMode.isEnabled()) {
			transmMode.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setTransmMode(Enumerator
	 *      newValue)
	 * 
	 */
	public void setTransmMode(Enumerator newValue) {
		transmMode.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.transmMode);
		if (eefElementEditorReadOnlyState && transmMode.isEnabled()) {
			transmMode.setEnabled(false);
			transmMode.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !transmMode.isEnabled()) {
			transmMode.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getStart()
	 * 
	 */
	public EObject getStart() {
		if (start.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) start.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initStart(EObjectFlatComboSettings)
	 */
	public void initStart(EObjectFlatComboSettings settings) {
		start.setInput(settings);
		if (current != null) {
			start.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.start);
		if (eefElementEditorReadOnlyState && start.isEnabled()) {
			start.setEnabled(false);
			start.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !start.isEnabled()) {
			start.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setStart(EObject
	 *      newValue)
	 * 
	 */
	public void setStart(EObject newValue) {
		if (newValue != null) {
			start.setSelection(new StructuredSelection(newValue));
		} else {
			start.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.start);
		if (eefElementEditorReadOnlyState && start.isEnabled()) {
			start.setEnabled(false);
			start.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !start.isEnabled()) {
			start.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setStartButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setStartButtonMode(ButtonsModeEnum newValue) {
		start.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterStart(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToStart(ViewerFilter filter) {
		start.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterStart(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToStart(ViewerFilter filter) {
		start.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getSet()
	 * 
	 */
	public EObject getSet() {
		if (set.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) set.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initSet(EObjectFlatComboSettings)
	 */
	public void initSet(EObjectFlatComboSettings settings) {
		set.setInput(settings);
		if (current != null) {
			set.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.set);
		if (eefElementEditorReadOnlyState && set.isEnabled()) {
			set.setEnabled(false);
			set.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !set.isEnabled()) {
			set.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setSet(EObject
	 *      newValue)
	 * 
	 */
	public void setSet(EObject newValue) {
		if (newValue != null) {
			set.setSelection(new StructuredSelection(newValue));
		} else {
			set.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.set);
		if (eefElementEditorReadOnlyState && set.isEnabled()) {
			set.setEnabled(false);
			set.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !set.isEnabled()) {
			set.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setSetButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setSetButtonMode(ButtonsModeEnum newValue) {
		set.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterSet(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSet(ViewerFilter filter) {
		set.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterSet(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSet(ViewerFilter filter) {
		set.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getGet()
	 * 
	 */
	public EObject getGet() {
		if (get.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) get.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initGet(EObjectFlatComboSettings)
	 */
	public void initGet(EObjectFlatComboSettings settings) {
		get.setInput(settings);
		if (current != null) {
			get.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.get);
		if (eefElementEditorReadOnlyState && get.isEnabled()) {
			get.setEnabled(false);
			get.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !get.isEnabled()) {
			get.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setGet(EObject
	 *      newValue)
	 * 
	 */
	public void setGet(EObject newValue) {
		if (newValue != null) {
			get.setSelection(new StructuredSelection(newValue));
		} else {
			get.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.get);
		if (eefElementEditorReadOnlyState && get.isEnabled()) {
			get.setEnabled(false);
			get.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !get.isEnabled()) {
			get.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setGetButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setGetButtonMode(ButtonsModeEnum newValue) {
		get.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterGet(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToGet(ViewerFilter filter) {
		get.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterGet(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToGet(ViewerFilter filter) {
		get.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getReset()
	 * 
	 */
	public EObject getReset() {
		if (reset.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) reset.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initReset(EObjectFlatComboSettings)
	 */
	public void initReset(EObjectFlatComboSettings settings) {
		reset.setInput(settings);
		if (current != null) {
			reset.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.reset);
		if (eefElementEditorReadOnlyState && reset.isEnabled()) {
			reset.setEnabled(false);
			reset.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !reset.isEnabled()) {
			reset.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setReset(EObject
	 *      newValue)
	 * 
	 */
	public void setReset(EObject newValue) {
		if (newValue != null) {
			reset.setSelection(new StructuredSelection(newValue));
		} else {
			reset.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.reset);
		if (eefElementEditorReadOnlyState && reset.isEnabled()) {
			reset.setEnabled(false);
			reset.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !reset.isEnabled()) {
			reset.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setResetButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setResetButtonMode(ButtonsModeEnum newValue) {
		reset.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterReset(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToReset(ViewerFilter filter) {
		reset.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterReset(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToReset(ViewerFilter filter) {
		reset.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getPause()
	 * 
	 */
	public EObject getPause() {
		if (pause.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) pause.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initPause(EObjectFlatComboSettings)
	 */
	public void initPause(EObjectFlatComboSettings settings) {
		pause.setInput(settings);
		if (current != null) {
			pause.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.pause);
		if (eefElementEditorReadOnlyState && pause.isEnabled()) {
			pause.setEnabled(false);
			pause.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !pause.isEnabled()) {
			pause.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setPause(EObject
	 *      newValue)
	 * 
	 */
	public void setPause(EObject newValue) {
		if (newValue != null) {
			pause.setSelection(new StructuredSelection(newValue));
		} else {
			pause.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.pause);
		if (eefElementEditorReadOnlyState && pause.isEnabled()) {
			pause.setEnabled(false);
			pause.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !pause.isEnabled()) {
			pause.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setPauseButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setPauseButtonMode(ButtonsModeEnum newValue) {
		pause.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterPause(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToPause(ViewerFilter filter) {
		pause.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterPause(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToPause(ViewerFilter filter) {
		pause.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getScheduler()
	 * 
	 */
	public EObject getScheduler() {
		if (scheduler.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) scheduler.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initScheduler(EObjectFlatComboSettings)
	 */
	public void initScheduler(EObjectFlatComboSettings settings) {
		scheduler.setInput(settings);
		if (current != null) {
			scheduler.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.scheduler);
		if (eefElementEditorReadOnlyState && scheduler.isEnabled()) {
			scheduler.setEnabled(false);
			scheduler.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scheduler.isEnabled()) {
			scheduler.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setScheduler(EObject
	 *      newValue)
	 * 
	 */
	public void setScheduler(EObject newValue) {
		if (newValue != null) {
			scheduler.setSelection(new StructuredSelection(newValue));
		} else {
			scheduler.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.scheduler);
		if (eefElementEditorReadOnlyState && scheduler.isEnabled()) {
			scheduler.setEnabled(false);
			scheduler.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scheduler.isEnabled()) {
			scheduler.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setSchedulerButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setSchedulerButtonMode(ButtonsModeEnum newValue) {
		scheduler.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterScheduler(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToScheduler(ViewerFilter filter) {
		scheduler.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterScheduler(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToScheduler(ViewerFilter filter) {
		scheduler.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getType()
	 * 
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
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initType(EObjectFlatComboSettings)
	 */
	public void initType(EObjectFlatComboSettings settings) {
		type.setInput(settings);
		if (current != null) {
			type.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setType(EObject
	 *      newValue)
	 * 
	 */
	public void setType(EObject newValue) {
		if (newValue != null) {
			type.setSelection(new StructuredSelection(newValue));
		} else {
			type.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setTypeButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setTypeButtonMode(ButtonsModeEnum newValue) {
		type.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterType(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToType(ViewerFilter filter) {
		type.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterType(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToType(ViewerFilter filter) {
		type.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getHost()
	 * 
	 */
	public EObject getHost() {
		if (host.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) host.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initHost(EObjectFlatComboSettings)
	 */
	public void initHost(EObjectFlatComboSettings settings) {
		host.setInput(settings);
		if (current != null) {
			host.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.host);
		if (eefElementEditorReadOnlyState && host.isEnabled()) {
			host.setEnabled(false);
			host.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !host.isEnabled()) {
			host.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setHost(EObject
	 *      newValue)
	 * 
	 */
	public void setHost(EObject newValue) {
		if (newValue != null) {
			host.setSelection(new StructuredSelection(newValue));
		} else {
			host.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.host);
		if (eefElementEditorReadOnlyState && host.isEnabled()) {
			host.setEnabled(false);
			host.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !host.isEnabled()) {
			host.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setHostButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setHostButtonMode(ButtonsModeEnum newValue) {
		host.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterHost(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToHost(ViewerFilter filter) {
		host.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterHost(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToHost(ViewerFilter filter) {
		host.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getDependentScheduler()
	 * 
	 */
	public EObject getDependentScheduler() {
		if (dependentScheduler.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) dependentScheduler.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initDependentScheduler(EObjectFlatComboSettings)
	 */
	public void initDependentScheduler(EObjectFlatComboSettings settings) {
		dependentScheduler.setInput(settings);
		if (current != null) {
			dependentScheduler.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.dependentScheduler);
		if (eefElementEditorReadOnlyState && dependentScheduler.isEnabled()) {
			dependentScheduler.setEnabled(false);
			dependentScheduler.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !dependentScheduler.isEnabled()) {
			dependentScheduler.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setDependentScheduler(EObject
	 *      newValue)
	 * 
	 */
	public void setDependentScheduler(EObject newValue) {
		if (newValue != null) {
			dependentScheduler.setSelection(new StructuredSelection(newValue));
		} else {
			dependentScheduler.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.dependentScheduler);
		if (eefElementEditorReadOnlyState && dependentScheduler.isEnabled()) {
			dependentScheduler.setEnabled(false);
			dependentScheduler.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !dependentScheduler.isEnabled()) {
			dependentScheduler.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setDependentSchedulerButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setDependentSchedulerButtonMode(ButtonsModeEnum newValue) {
		dependentScheduler.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterDependentScheduler(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToDependentScheduler(ViewerFilter filter) {
		dependentScheduler.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterDependentScheduler(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToDependentScheduler(ViewerFilter filter) {
		dependentScheduler.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getMainScheduler()
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
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initMainScheduler(EObjectFlatComboSettings)
	 */
	public void initMainScheduler(EObjectFlatComboSettings settings) {
		mainScheduler.setInput(settings);
		if (current != null) {
			mainScheduler.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.mainScheduler);
		if (eefElementEditorReadOnlyState && mainScheduler.isEnabled()) {
			mainScheduler.setEnabled(false);
			mainScheduler.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mainScheduler.isEnabled()) {
			mainScheduler.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setMainScheduler(EObject
	 *      newValue)
	 * 
	 */
	public void setMainScheduler(EObject newValue) {
		if (newValue != null) {
			mainScheduler.setSelection(new StructuredSelection(newValue));
		} else {
			mainScheduler.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.mainScheduler);
		if (eefElementEditorReadOnlyState && mainScheduler.isEnabled()) {
			mainScheduler.setEnabled(false);
			mainScheduler.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mainScheduler.isEnabled()) {
			mainScheduler.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setMainSchedulerButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setMainSchedulerButtonMode(ButtonsModeEnum newValue) {
		mainScheduler.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterMainScheduler(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToMainScheduler(ViewerFilter filter) {
		mainScheduler.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterMainScheduler(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToMainScheduler(ViewerFilter filter) {
		mainScheduler.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getSourcePort()
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
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initSourcePort(EObjectFlatComboSettings)
	 */
	public void initSourcePort(EObjectFlatComboSettings settings) {
		sourcePort.setInput(settings);
		if (current != null) {
			sourcePort.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.sourcePort);
		if (eefElementEditorReadOnlyState && sourcePort.isEnabled()) {
			sourcePort.setEnabled(false);
			sourcePort.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sourcePort.isEnabled()) {
			sourcePort.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setSourcePort(EObject
	 *      newValue)
	 * 
	 */
	public void setSourcePort(EObject newValue) {
		if (newValue != null) {
			sourcePort.setSelection(new StructuredSelection(newValue));
		} else {
			sourcePort.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.sourcePort);
		if (eefElementEditorReadOnlyState && sourcePort.isEnabled()) {
			sourcePort.setEnabled(false);
			sourcePort.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sourcePort.isEnabled()) {
			sourcePort.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setSourcePortButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setSourcePortButtonMode(ButtonsModeEnum newValue) {
		sourcePort.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterSourcePort(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSourcePort(ViewerFilter filter) {
		sourcePort.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterSourcePort(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSourcePort(ViewerFilter filter) {
		sourcePort.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#getTargetPort()
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
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initTargetPort(EObjectFlatComboSettings)
	 */
	public void initTargetPort(EObjectFlatComboSettings settings) {
		targetPort.setInput(settings);
		if (current != null) {
			targetPort.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.targetPort);
		if (eefElementEditorReadOnlyState && targetPort.isEnabled()) {
			targetPort.setEnabled(false);
			targetPort.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !targetPort.isEnabled()) {
			targetPort.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setTargetPort(EObject
	 *      newValue)
	 * 
	 */
	public void setTargetPort(EObject newValue) {
		if (newValue != null) {
			targetPort.setSelection(new StructuredSelection(newValue));
		} else {
			targetPort.setSelection(new StructuredSelection()); // $NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.targetPort);
		if (eefElementEditorReadOnlyState && targetPort.isEnabled()) {
			targetPort.setEnabled(false);
			targetPort.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !targetPort.isEnabled()) {
			targetPort.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#setTargetPortButtonMode(ButtonsModeEnum
	 *      newValue)
	 */
	public void setTargetPortButtonMode(ButtonsModeEnum newValue) {
		targetPort.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterTargetPort(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToTargetPort(ViewerFilter filter) {
		targetPort.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterTargetPort(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToTargetPort(ViewerFilter filter) {
		targetPort.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initUsedBy(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initUsedBy(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		usedBy.setContentProvider(contentProvider);
		usedBy.setInput(settings);
		usedByBusinessFilters.clear();
		usedByFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.usedBy);
		if (eefElementEditorReadOnlyState && usedBy.getTable().isEnabled()) {
			usedBy.setEnabled(false);
			usedBy.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usedBy.getTable().isEnabled()) {
			usedBy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateUsedBy()
	 * 
	 */
	public void updateUsedBy() {
		usedBy.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterUsedBy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToUsedBy(ViewerFilter filter) {
		usedByFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterUsedBy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToUsedBy(ViewerFilter filter) {
		usedByBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInUsedByTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInUsedByTable(EObject element) {
		return ((ReferencesTableSettings) usedBy.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initUsedResource(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initUsedResource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		usedResource.setContentProvider(contentProvider);
		usedResource.setInput(settings);
		usedResourceBusinessFilters.clear();
		usedResourceFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.usedResource);
		if (eefElementEditorReadOnlyState && usedResource.getTable().isEnabled()) {
			usedResource.setEnabled(false);
			usedResource.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usedResource.getTable().isEnabled()) {
			usedResource.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateUsedResource()
	 * 
	 */
	public void updateUsedResource() {
		usedResource.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterUsedResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToUsedResource(ViewerFilter filter) {
		usedResourceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterUsedResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToUsedResource(ViewerFilter filter) {
		usedResourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInUsedResourceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInUsedResourceTable(EObject element) {
		return ((ReferencesTableSettings) usedResource.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initProcessingUnits(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initProcessingUnits(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		processingUnits.setContentProvider(contentProvider);
		processingUnits.setInput(settings);
		processingUnitsBusinessFilters.clear();
		processingUnitsFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.processingUnits);
		if (eefElementEditorReadOnlyState && processingUnits.getTable().isEnabled()) {
			processingUnits.setEnabled(false);
			processingUnits.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !processingUnits.getTable().isEnabled()) {
			processingUnits.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateProcessingUnits()
	 * 
	 */
	public void updateProcessingUnits() {
		processingUnits.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterProcessingUnits(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToProcessingUnits(ViewerFilter filter) {
		processingUnitsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterProcessingUnits(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToProcessingUnits(ViewerFilter filter) {
		processingUnitsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInProcessingUnitsTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInProcessingUnitsTable(EObject element) {
		return ((ReferencesTableSettings) processingUnits.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initWorkload(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initWorkload(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		workload.setContentProvider(contentProvider);
		workload.setInput(settings);
		workloadBusinessFilters.clear();
		workloadFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.workload);
		if (eefElementEditorReadOnlyState && workload.getTable().isEnabled()) {
			workload.setEnabled(false);
			workload.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !workload.getTable().isEnabled()) {
			workload.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateWorkload()
	 * 
	 */
	public void updateWorkload() {
		workload.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterWorkload(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToWorkload(ViewerFilter filter) {
		workloadFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterWorkload(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToWorkload(ViewerFilter filter) {
		workloadBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInWorkloadTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInWorkloadTable(EObject element) {
		return ((ReferencesTableSettings) workload.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initBrokedResource(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initBrokedResource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		brokedResource.setContentProvider(contentProvider);
		brokedResource.setInput(settings);
		brokedResourceBusinessFilters.clear();
		brokedResourceFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.brokedResource);
		if (eefElementEditorReadOnlyState && brokedResource.getTable().isEnabled()) {
			brokedResource.setEnabled(false);
			brokedResource.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !brokedResource.getTable().isEnabled()) {
			brokedResource.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateBrokedResource()
	 * 
	 */
	public void updateBrokedResource() {
		brokedResource.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterBrokedResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToBrokedResource(ViewerFilter filter) {
		brokedResourceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterBrokedResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToBrokedResource(ViewerFilter filter) {
		brokedResourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInBrokedResourceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInBrokedResourceTable(EObject element) {
		return ((ReferencesTableSettings) brokedResource.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initManagedResource(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initManagedResource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		managedResource.setContentProvider(contentProvider);
		managedResource.setInput(settings);
		managedResourceBusinessFilters.clear();
		managedResourceFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.managedResource);
		if (eefElementEditorReadOnlyState && managedResource.getTable().isEnabled()) {
			managedResource.setEnabled(false);
			managedResource.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !managedResource.getTable().isEnabled()) {
			managedResource.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateManagedResource()
	 * 
	 */
	public void updateManagedResource() {
		managedResource.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterManagedResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToManagedResource(ViewerFilter filter) {
		managedResourceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterManagedResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToManagedResource(ViewerFilter filter) {
		managedResourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInManagedResourceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInManagedResourceTable(EObject element) {
		return ((ReferencesTableSettings) managedResource.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initSchedulableResource(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSchedulableResource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		schedulableResource.setContentProvider(contentProvider);
		schedulableResource.setInput(settings);
		schedulableResourceBusinessFilters.clear();
		schedulableResourceFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.schedulableResource);
		if (eefElementEditorReadOnlyState && schedulableResource.getTable().isEnabled()) {
			schedulableResource.setEnabled(false);
			schedulableResource.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !schedulableResource.getTable().isEnabled()) {
			schedulableResource.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateSchedulableResource()
	 * 
	 */
	public void updateSchedulableResource() {
		schedulableResource.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterSchedulableResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSchedulableResource(ViewerFilter filter) {
		schedulableResourceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterSchedulableResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSchedulableResource(ViewerFilter filter) {
		schedulableResourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInSchedulableResourceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInSchedulableResourceTable(EObject element) {
		return ((ReferencesTableSettings) schedulableResource.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initVirtualProcessingUnit(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initVirtualProcessingUnit(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		virtualProcessingUnit.setContentProvider(contentProvider);
		virtualProcessingUnit.setInput(settings);
		virtualProcessingUnitBusinessFilters.clear();
		virtualProcessingUnitFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.virtualProcessingUnit);
		if (eefElementEditorReadOnlyState && virtualProcessingUnit.getTable().isEnabled()) {
			virtualProcessingUnit.setEnabled(false);
			virtualProcessingUnit.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !virtualProcessingUnit.getTable().isEnabled()) {
			virtualProcessingUnit.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateVirtualProcessingUnit()
	 * 
	 */
	public void updateVirtualProcessingUnit() {
		virtualProcessingUnit.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterVirtualProcessingUnit(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToVirtualProcessingUnit(ViewerFilter filter) {
		virtualProcessingUnitFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterVirtualProcessingUnit(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToVirtualProcessingUnit(ViewerFilter filter) {
		virtualProcessingUnitBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInVirtualProcessingUnitTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInVirtualProcessingUnitTable(EObject element) {
		return ((ReferencesTableSettings) virtualProcessingUnit.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initProtectParams(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initProtectParams(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		protectParams.setContentProvider(contentProvider);
		protectParams.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.protectParams);
		if (eefElementEditorReadOnlyState && protectParams.isEnabled()) {
			protectParams.setEnabled(false);
			protectParams.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !protectParams.isEnabled()) {
			protectParams.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateProtectParams()
	 * 
	 */
	public void updateProtectParams() {
		protectParams.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterProtectParams(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToProtectParams(ViewerFilter filter) {
		protectParamsFilters.add(filter);
		if (this.protectParams != null) {
			this.protectParams.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterProtectParams(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToProtectParams(ViewerFilter filter) {
		protectParamsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInProtectParamsTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInProtectParamsTable(EObject element) {
		return ((ReferencesTableSettings) protectParams.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initSchedParams(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initSchedParams(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		schedParams.setContentProvider(contentProvider);
		schedParams.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.schedParams);
		if (eefElementEditorReadOnlyState && schedParams.isEnabled()) {
			schedParams.setEnabled(false);
			schedParams.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !schedParams.isEnabled()) {
			schedParams.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateSchedParams()
	 * 
	 */
	public void updateSchedParams() {
		schedParams.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterSchedParams(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSchedParams(ViewerFilter filter) {
		schedParamsFilters.add(filter);
		if (this.schedParams != null) {
			this.schedParams.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterSchedParams(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSchedParams(ViewerFilter filter) {
		schedParamsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInSchedParamsTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInSchedParamsTable(EObject element) {
		return ((ReferencesTableSettings) schedParams.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initRequiredAmount(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initRequiredAmount(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		requiredAmount.setContentProvider(contentProvider);
		requiredAmount.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.requiredAmount);
		if (eefElementEditorReadOnlyState && requiredAmount.isEnabled()) {
			requiredAmount.setEnabled(false);
			requiredAmount.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !requiredAmount.isEnabled()) {
			requiredAmount.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateRequiredAmount()
	 * 
	 */
	public void updateRequiredAmount() {
		requiredAmount.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterRequiredAmount(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToRequiredAmount(ViewerFilter filter) {
		requiredAmountFilters.add(filter);
		if (this.requiredAmount != null) {
			this.requiredAmount.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterRequiredAmount(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToRequiredAmount(ViewerFilter filter) {
		requiredAmountBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInRequiredAmountTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInRequiredAmountTable(EObject element) {
		return ((ReferencesTableSettings) requiredAmount.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initOwnedElement(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedElement(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedElement.setContentProvider(contentProvider);
		ownedElement.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.ownedElement);
		if (eefElementEditorReadOnlyState && ownedElement.isEnabled()) {
			ownedElement.setEnabled(false);
			ownedElement.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedElement.isEnabled()) {
			ownedElement.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateOwnedElement()
	 * 
	 */
	public void updateOwnedElement() {
		ownedElement.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterOwnedElement(ViewerFilter
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
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterOwnedElement(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedElement(ViewerFilter filter) {
		ownedElementBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInOwnedElementTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedElementTable(EObject element) {
		return ((ReferencesTableSettings) ownedElement.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initOwnedPort(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedPort(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedPort.setContentProvider(contentProvider);
		ownedPort.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.ownedPort);
		if (eefElementEditorReadOnlyState && ownedPort.isEnabled()) {
			ownedPort.setEnabled(false);
			ownedPort.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedPort.isEnabled()) {
			ownedPort.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateOwnedPort()
	 * 
	 */
	public void updateOwnedPort() {
		ownedPort.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterOwnedPort(ViewerFilter
	 *      filter)
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
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterOwnedPort(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedPort(ViewerFilter filter) {
		ownedPortBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInOwnedPortTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedPortTable(EObject element) {
		return ((ReferencesTableSettings) ownedPort.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initOwnedConnector(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedConnector(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedConnector.setContentProvider(contentProvider);
		ownedConnector.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.ownedConnector);
		if (eefElementEditorReadOnlyState && ownedConnector.isEnabled()) {
			ownedConnector.setEnabled(false);
			ownedConnector.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedConnector.isEnabled()) {
			ownedConnector.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateOwnedConnector()
	 * 
	 */
	public void updateOwnedConnector() {
		ownedConnector.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterOwnedConnector(ViewerFilter
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
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterOwnedConnector(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedConnector(ViewerFilter filter) {
		ownedConnectorBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInOwnedConnectorTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedConnectorTable(EObject element) {
		return ((ReferencesTableSettings) ownedConnector.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initOwnedResource(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedResource(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedResource.setContentProvider(contentProvider);
		ownedResource.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.ownedResource);
		if (eefElementEditorReadOnlyState && ownedResource.isEnabled()) {
			ownedResource.setEnabled(false);
			ownedResource.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedResource.isEnabled()) {
			ownedResource.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateOwnedResource()
	 * 
	 */
	public void updateOwnedResource() {
		ownedResource.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterOwnedResource(ViewerFilter
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
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterOwnedResource(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedResource(ViewerFilter filter) {
		ownedResourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInOwnedResourceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedResourceTable(EObject element) {
		return ((ReferencesTableSettings) ownedResource.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initOwnedService(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedService(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedService.setContentProvider(contentProvider);
		ownedService.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.ownedService);
		if (eefElementEditorReadOnlyState && ownedService.isEnabled()) {
			ownedService.setEnabled(false);
			ownedService.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedService.isEnabled()) {
			ownedService.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateOwnedService()
	 * 
	 */
	public void updateOwnedService() {
		ownedService.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterOwnedService(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToOwnedService(ViewerFilter filter) {
		ownedServiceFilters.add(filter);
		if (this.ownedService != null) {
			this.ownedService.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterOwnedService(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedService(ViewerFilter filter) {
		ownedServiceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInOwnedServiceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedServiceTable(EObject element) {
		return ((ReferencesTableSettings) ownedService.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initUsage(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initUsage(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		usage.setContentProvider(contentProvider);
		usage.setInput(settings);
		usageBusinessFilters.clear();
		usageFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.usage);
		if (eefElementEditorReadOnlyState && usage.getTable().isEnabled()) {
			usage.setEnabled(false);
			usage.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usage.getTable().isEnabled()) {
			usage.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateUsage()
	 * 
	 */
	public void updateUsage() {
		usage.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterUsage(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToUsage(ViewerFilter filter) {
		usageFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterUsage(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToUsage(ViewerFilter filter) {
		usageBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInUsageTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInUsageTable(EObject element) {
		return ((ReferencesTableSettings) usage.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initAccCtrlPolicy(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initAccCtrlPolicy(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		accCtrlPolicy.setContentProvider(contentProvider);
		accCtrlPolicy.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.accCtrlPolicy);
		if (eefElementEditorReadOnlyState && accCtrlPolicy.isEnabled()) {
			accCtrlPolicy.setEnabled(false);
			accCtrlPolicy.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !accCtrlPolicy.isEnabled()) {
			accCtrlPolicy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateAccCtrlPolicy()
	 * 
	 */
	public void updateAccCtrlPolicy() {
		accCtrlPolicy.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterAccCtrlPolicy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToAccCtrlPolicy(ViewerFilter filter) {
		accCtrlPolicyFilters.add(filter);
		if (this.accCtrlPolicy != null) {
			this.accCtrlPolicy.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterAccCtrlPolicy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToAccCtrlPolicy(ViewerFilter filter) {
		accCtrlPolicyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInAccCtrlPolicyTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInAccCtrlPolicyTable(EObject element) {
		return ((ReferencesTableSettings) accCtrlPolicy.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#initResCtrlPolicy(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initResCtrlPolicy(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resCtrlPolicy.setContentProvider(contentProvider);
		resCtrlPolicy.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(GrmViewsRepository.General.Properties.resCtrlPolicy);
		if (eefElementEditorReadOnlyState && resCtrlPolicy.isEnabled()) {
			resCtrlPolicy.setEnabled(false);
			resCtrlPolicy.setToolTipText(GrmMessages.General_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resCtrlPolicy.isEnabled()) {
			resCtrlPolicy.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#updateResCtrlPolicy()
	 * 
	 */
	public void updateResCtrlPolicy() {
		resCtrlPolicy.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addFilterResCtrlPolicy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToResCtrlPolicy(ViewerFilter filter) {
		resCtrlPolicyFilters.add(filter);
		if (this.resCtrlPolicy != null) {
			this.resCtrlPolicy.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#addBusinessFilterResCtrlPolicy(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToResCtrlPolicy(ViewerFilter filter) {
		resCtrlPolicyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.grm.parts.GeneralPropertiesEditionPart#isContainedInResCtrlPolicyTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInResCtrlPolicyTable(EObject element) {
		return ((ReferencesTableSettings) resCtrlPolicy.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return GrmMessages.General_Part_Title;
	}

	// Start of user code additional methods

	// End of user code

}
