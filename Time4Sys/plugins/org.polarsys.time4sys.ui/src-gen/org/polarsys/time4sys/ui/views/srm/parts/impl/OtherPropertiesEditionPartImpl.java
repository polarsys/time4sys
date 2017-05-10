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
package org.polarsys.time4sys.ui.views.srm.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.polarsys.time4sys.marte.srm.SrmPackage;
import org.polarsys.time4sys.ui.views.srm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;
import org.polarsys.time4sys.ui.views.srm.providers.SrmMessages;

// End of user code

/**
 * 
 * 
 */
public class OtherPropertiesEditionPartImpl extends CompositePropertiesEditionPart
		implements ISWTPropertiesEditionPart, OtherPropertiesEditionPart {

	protected Text packetSize;
	protected Button isMaskable;
	protected Button isStaticSchedulingFeature;
	protected Button isIntraMemoryPartitionInteraction;
	protected Text memoryBlockAddressElements;
	protected Button editMemoryBlockAddressElements;
	private EList memoryBlockAddressElementsList;
	protected Text stackSizeElements;
	protected Button editStackSizeElements;
	private EList stackSizeElementsList;
	protected Text heapSizeElements;
	protected Button editHeapSizeElements;
	private EList heapSizeElementsList;
	protected Text maskElements;
	protected Button editMaskElements;
	private EList maskElementsList;
	protected Text vectorElements;
	protected Button editVectorElements;
	private EList vectorElementsList;
	protected Text memoryBlockSizeElements;
	protected Button editMemoryBlockSizeElements;
	private EList memoryBlockSizeElementsList;
	protected ReferencesTable ownedService;
	protected List<ViewerFilter> ownedServiceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ownedServiceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable pInterface;
	protected List<ViewerFilter> pInterfaceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> pInterfaceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable rInterface;
	protected List<ViewerFilter> rInterfaceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> rInterfaceFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable pServices;
	protected List<ViewerFilter> pServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> pServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable rServices;
	protected List<ViewerFilter> rServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> rServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable createServices;
	protected List<ViewerFilter> createServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> createServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable deleteServices;
	protected List<ViewerFilter> deleteServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> deleteServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable initializeServices;
	protected List<ViewerFilter> initializeServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> initializeServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable activateServices;
	protected List<ViewerFilter> activateServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> activateServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable resumeServices;
	protected List<ViewerFilter> resumeServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resumeServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable suspendServices;
	protected List<ViewerFilter> suspendServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> suspendServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable enableConcurrencyServices;
	protected List<ViewerFilter> enableConcurrencyServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> enableConcurrencyServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable disableConcurrencyServices;
	protected List<ViewerFilter> disableConcurrencyServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> disableConcurrencyServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable forkServices;
	protected List<ViewerFilter> forkServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> forkServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable exitServices;
	protected List<ViewerFilter> exitServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> exitServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable memorySpaces;
	protected List<ViewerFilter> memorySpacesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> memorySpacesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable closeServices;
	protected List<ViewerFilter> closeServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> closeServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable openServices;
	protected List<ViewerFilter> openServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> openServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable acquireServices;
	protected List<ViewerFilter> acquireServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> acquireServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable releaseServices;
	protected List<ViewerFilter> releaseServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> releaseServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable controlServices;
	protected List<ViewerFilter> controlServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> controlServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable sendServices;
	protected List<ViewerFilter> sendServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sendServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable receiveServices;
	protected List<ViewerFilter> receiveServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> receiveServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable readServices;
	protected List<ViewerFilter> readServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> readServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable writeServices;
	protected List<ViewerFilter> writeServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> writeServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable flushServices;
	protected List<ViewerFilter> flushServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> flushServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable signalServices;
	protected List<ViewerFilter> signalServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> signalServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable waitServices;
	protected List<ViewerFilter> waitServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> waitServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable clearServices;
	protected List<ViewerFilter> clearServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> clearServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable lockServices;
	protected List<ViewerFilter> lockServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> lockServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable unlockServices;
	protected List<ViewerFilter> unlockServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> unlockServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable joinServices;
	protected List<ViewerFilter> joinServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> joinServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable yieldServices;
	protected List<ViewerFilter> yieldServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> yieldServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable delayServices;
	protected List<ViewerFilter> delayServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> delayServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable mapServices;
	protected List<ViewerFilter> mapServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> mapServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable unmapServices;
	protected List<ViewerFilter> unmapServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> unmapServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable terminateServices;
	protected List<ViewerFilter> terminateServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> terminateServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable routineConnectServices;
	protected List<ViewerFilter> routineConnectServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> routineConnectServicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable routineDisconnectServices;
	protected List<ViewerFilter> routineDisconnectServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> routineDisconnectServicesFilters = new ArrayList<ViewerFilter>();

	/**
	 * Default constructor
	 * 
	 * @param editionComponent
	 *            the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public OtherPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence otherStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = otherStep.addStep(SrmViewsRepository.Other.Properties.class);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.packetSize);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.isMaskable);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.isStaticSchedulingFeature);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.memoryBlockAddressElements);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.stackSizeElements);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.heapSizeElements);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.maskElements);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.vectorElements);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.memoryBlockSizeElements);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.ownedService);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.pInterface);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.rInterface);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.pServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.rServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.createServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.deleteServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.initializeServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.activateServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.resumeServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.suspendServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.enableConcurrencyServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.disableConcurrencyServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.forkServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.exitServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.memorySpaces);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.closeServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.openServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.acquireServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.releaseServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.controlServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.sendServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.receiveServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.readServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.writeServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.flushServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.signalServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.waitServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.clearServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.lockServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.unlockServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.joinServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.yieldServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.delayServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.mapServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.unmapServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.terminateServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.routineConnectServices);
		propertiesStep.addStep(SrmViewsRepository.Other.Properties.routineDisconnectServices);

		composer = new PartComposer(otherStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SrmViewsRepository.Other.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.packetSize) {
					return createPacketSizeText(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.isMaskable) {
					return createIsMaskableCheckbox(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.isStaticSchedulingFeature) {
					return createIsStaticSchedulingFeatureCheckbox(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction) {
					return createIsIntraMemoryPartitionInteractionCheckbox(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.memoryBlockAddressElements) {
					return createMemoryBlockAddressElementsMultiValuedEditor(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.stackSizeElements) {
					return createStackSizeElementsMultiValuedEditor(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.heapSizeElements) {
					return createHeapSizeElementsMultiValuedEditor(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.maskElements) {
					return createMaskElementsMultiValuedEditor(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.vectorElements) {
					return createVectorElementsMultiValuedEditor(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.memoryBlockSizeElements) {
					return createMemoryBlockSizeElementsMultiValuedEditor(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.ownedService) {
					return createOwnedServiceAdvancedTableComposition(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.pInterface) {
					return createPInterfaceAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.rInterface) {
					return createRInterfaceAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.pServices) {
					return createPServicesAdvancedTableComposition(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.rServices) {
					return createRServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.createServices) {
					return createCreateServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.deleteServices) {
					return createDeleteServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.initializeServices) {
					return createInitializeServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.activateServices) {
					return createActivateServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.resumeServices) {
					return createResumeServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.suspendServices) {
					return createSuspendServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.enableConcurrencyServices) {
					return createEnableConcurrencyServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.disableConcurrencyServices) {
					return createDisableConcurrencyServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.forkServices) {
					return createForkServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.exitServices) {
					return createExitServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.memorySpaces) {
					return createMemorySpacesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.closeServices) {
					return createCloseServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.openServices) {
					return createOpenServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.acquireServices) {
					return createAcquireServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.releaseServices) {
					return createReleaseServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.controlServices) {
					return createControlServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.sendServices) {
					return createSendServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.receiveServices) {
					return createReceiveServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.readServices) {
					return createReadServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.writeServices) {
					return createWriteServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.flushServices) {
					return createFlushServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.signalServices) {
					return createSignalServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.waitServices) {
					return createWaitServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.clearServices) {
					return createClearServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.lockServices) {
					return createLockServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.unlockServices) {
					return createUnlockServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.joinServices) {
					return createJoinServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.yieldServices) {
					return createYieldServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.delayServices) {
					return createDelayServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.mapServices) {
					return createMapServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.unmapServices) {
					return createUnmapServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.terminateServices) {
					return createTerminateServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.routineConnectServices) {
					return createRoutineConnectServicesAdvancedReferencesTable(parent);
				}
				if (key == SrmViewsRepository.Other.Properties.routineDisconnectServices) {
					return createRoutineDisconnectServicesAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(SrmMessages.OtherPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	protected Composite createPacketSizeText(Composite parent) {
		createDescription(parent, SrmViewsRepository.Other.Properties.packetSize,
				SrmMessages.OtherPropertiesEditionPart_PacketSizeLabel);
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
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.packetSize,
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
								OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.packetSize,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, packetSize.getText()));
				}
			}

		});
		EditingUtils.setID(packetSize, SrmViewsRepository.Other.Properties.packetSize);
		EditingUtils.setEEFtype(packetSize, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.packetSize, SrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createPacketSizeText

		// End of user code
		return parent;
	}

	protected Composite createIsMaskableCheckbox(Composite parent) {
		isMaskable = new Button(parent, SWT.CHECK);
		isMaskable.setText(getDescription(SrmViewsRepository.Other.Properties.isMaskable,
				SrmMessages.OtherPropertiesEditionPart_IsMaskableLabel));
		isMaskable.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.isMaskable, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new Boolean(isMaskable.getSelection())));
			}

		});
		GridData isMaskableData = new GridData(GridData.FILL_HORIZONTAL);
		isMaskableData.horizontalSpan = 2;
		isMaskable.setLayoutData(isMaskableData);
		EditingUtils.setID(isMaskable, SrmViewsRepository.Other.Properties.isMaskable);
		EditingUtils.setEEFtype(isMaskable, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.isMaskable, SrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsMaskableCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsStaticSchedulingFeatureCheckbox(Composite parent) {
		isStaticSchedulingFeature = new Button(parent, SWT.CHECK);
		isStaticSchedulingFeature.setText(getDescription(SrmViewsRepository.Other.Properties.isStaticSchedulingFeature,
				SrmMessages.OtherPropertiesEditionPart_IsStaticSchedulingFeatureLabel));
		isStaticSchedulingFeature.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.isStaticSchedulingFeature,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									new Boolean(isStaticSchedulingFeature.getSelection())));
			}

		});
		GridData isStaticSchedulingFeatureData = new GridData(GridData.FILL_HORIZONTAL);
		isStaticSchedulingFeatureData.horizontalSpan = 2;
		isStaticSchedulingFeature.setLayoutData(isStaticSchedulingFeatureData);
		EditingUtils.setID(isStaticSchedulingFeature, SrmViewsRepository.Other.Properties.isStaticSchedulingFeature);
		EditingUtils.setEEFtype(isStaticSchedulingFeature, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.Other.Properties.isStaticSchedulingFeature, SrmViewsRepository.SWT_KIND), null); // $NON-NLS-1$
		// Start of user code for createIsStaticSchedulingFeatureCheckbox

		// End of user code
		return parent;
	}

	protected Composite createIsIntraMemoryPartitionInteractionCheckbox(Composite parent) {
		isIntraMemoryPartitionInteraction = new Button(parent, SWT.CHECK);
		isIntraMemoryPartitionInteraction
				.setText(getDescription(SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction,
						SrmMessages.OtherPropertiesEditionPart_IsIntraMemoryPartitionInteractionLabel));
		isIntraMemoryPartitionInteraction.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									new Boolean(isIntraMemoryPartitionInteraction.getSelection())));
			}

		});
		GridData isIntraMemoryPartitionInteractionData = new GridData(GridData.FILL_HORIZONTAL);
		isIntraMemoryPartitionInteractionData.horizontalSpan = 2;
		isIntraMemoryPartitionInteraction.setLayoutData(isIntraMemoryPartitionInteractionData);
		EditingUtils.setID(isIntraMemoryPartitionInteraction,
				SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction);
		EditingUtils.setEEFtype(isIntraMemoryPartitionInteraction, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent,
				propertiesEditionComponent.getHelpContent(
						SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction,
						SrmViewsRepository.SWT_KIND),
				null); // $NON-NLS-1$
		// Start of user code for
		// createIsIntraMemoryPartitionInteractionCheckbox

		// End of user code
		return parent;
	}

	protected Composite createMemoryBlockAddressElementsMultiValuedEditor(Composite parent) {
		memoryBlockAddressElements = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData memoryBlockAddressElementsData = new GridData(GridData.FILL_HORIZONTAL);
		memoryBlockAddressElementsData.horizontalSpan = 2;
		memoryBlockAddressElements.setLayoutData(memoryBlockAddressElementsData);
		EditingUtils.setID(memoryBlockAddressElements, SrmViewsRepository.Other.Properties.memoryBlockAddressElements);
		EditingUtils.setEEFtype(memoryBlockAddressElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editMemoryBlockAddressElements = new Button(parent, SWT.NONE);
		editMemoryBlockAddressElements
				.setText(getDescription(SrmViewsRepository.Other.Properties.memoryBlockAddressElements,
						SrmMessages.OtherPropertiesEditionPart_MemoryBlockAddressElementsLabel));
		GridData editMemoryBlockAddressElementsData = new GridData();
		editMemoryBlockAddressElements.setLayoutData(editMemoryBlockAddressElementsData);
		editMemoryBlockAddressElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(memoryBlockAddressElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						memoryBlockAddressElementsList,
						SrmPackage.eINSTANCE.getMemoryBroker_MemoryBlockAddressElements().getEType(), null, false, true,
						null, null);
				if (dialog.open() == Window.OK) {
					memoryBlockAddressElementsList = dialog.getResult();
					if (memoryBlockAddressElementsList == null) {
						memoryBlockAddressElementsList = new BasicEList();
					}
					memoryBlockAddressElements.setText(memoryBlockAddressElementsList.toString());
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.memoryBlockAddressElements,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
									new BasicEList(memoryBlockAddressElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editMemoryBlockAddressElements,
				SrmViewsRepository.Other.Properties.memoryBlockAddressElements);
		EditingUtils.setEEFtype(editMemoryBlockAddressElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for
		// createMemoryBlockAddressElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	protected Composite createStackSizeElementsMultiValuedEditor(Composite parent) {
		stackSizeElements = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData stackSizeElementsData = new GridData(GridData.FILL_HORIZONTAL);
		stackSizeElementsData.horizontalSpan = 2;
		stackSizeElements.setLayoutData(stackSizeElementsData);
		EditingUtils.setID(stackSizeElements, SrmViewsRepository.Other.Properties.stackSizeElements);
		EditingUtils.setEEFtype(stackSizeElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editStackSizeElements = new Button(parent, SWT.NONE);
		editStackSizeElements.setText(getDescription(SrmViewsRepository.Other.Properties.stackSizeElements,
				SrmMessages.OtherPropertiesEditionPart_StackSizeElementsLabel));
		GridData editStackSizeElementsData = new GridData();
		editStackSizeElements.setLayoutData(editStackSizeElementsData);
		editStackSizeElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(stackSizeElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						stackSizeElementsList,
						SrmPackage.eINSTANCE.getSoftwareConcurrentResource_StackSizeElements().getEType(), null, false,
						true, null, null);
				if (dialog.open() == Window.OK) {
					stackSizeElementsList = dialog.getResult();
					if (stackSizeElementsList == null) {
						stackSizeElementsList = new BasicEList();
					}
					stackSizeElements.setText(stackSizeElementsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.stackSizeElements,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null,
							new BasicEList(stackSizeElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editStackSizeElements, SrmViewsRepository.Other.Properties.stackSizeElements);
		EditingUtils.setEEFtype(editStackSizeElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createStackSizeElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	protected Composite createHeapSizeElementsMultiValuedEditor(Composite parent) {
		heapSizeElements = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData heapSizeElementsData = new GridData(GridData.FILL_HORIZONTAL);
		heapSizeElementsData.horizontalSpan = 2;
		heapSizeElements.setLayoutData(heapSizeElementsData);
		EditingUtils.setID(heapSizeElements, SrmViewsRepository.Other.Properties.heapSizeElements);
		EditingUtils.setEEFtype(heapSizeElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editHeapSizeElements = new Button(parent, SWT.NONE);
		editHeapSizeElements.setText(getDescription(SrmViewsRepository.Other.Properties.heapSizeElements,
				SrmMessages.OtherPropertiesEditionPart_HeapSizeElementsLabel));
		GridData editHeapSizeElementsData = new GridData();
		editHeapSizeElements.setLayoutData(editHeapSizeElementsData);
		editHeapSizeElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(heapSizeElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						heapSizeElementsList,
						SrmPackage.eINSTANCE.getSoftwareConcurrentResource_HeapSizeElements().getEType(), null, false,
						true, null, null);
				if (dialog.open() == Window.OK) {
					heapSizeElementsList = dialog.getResult();
					if (heapSizeElementsList == null) {
						heapSizeElementsList = new BasicEList();
					}
					heapSizeElements.setText(heapSizeElementsList.toString());
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.heapSizeElements, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new BasicEList(heapSizeElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editHeapSizeElements, SrmViewsRepository.Other.Properties.heapSizeElements);
		EditingUtils.setEEFtype(editHeapSizeElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createHeapSizeElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	protected Composite createMaskElementsMultiValuedEditor(Composite parent) {
		maskElements = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData maskElementsData = new GridData(GridData.FILL_HORIZONTAL);
		maskElementsData.horizontalSpan = 2;
		maskElements.setLayoutData(maskElementsData);
		EditingUtils.setID(maskElements, SrmViewsRepository.Other.Properties.maskElements);
		EditingUtils.setEEFtype(maskElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editMaskElements = new Button(parent, SWT.NONE);
		editMaskElements.setText(getDescription(SrmViewsRepository.Other.Properties.maskElements,
				SrmMessages.OtherPropertiesEditionPart_MaskElementsLabel));
		GridData editMaskElementsData = new GridData();
		editMaskElements.setLayoutData(editMaskElementsData);
		editMaskElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(maskElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						maskElementsList, SrmPackage.eINSTANCE.getInterruptResource_MaskElements().getEType(), null,
						false, true, null, null);
				if (dialog.open() == Window.OK) {
					maskElementsList = dialog.getResult();
					if (maskElementsList == null) {
						maskElementsList = new BasicEList();
					}
					maskElements.setText(maskElementsList.toString());
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.maskElements, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new BasicEList(maskElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editMaskElements, SrmViewsRepository.Other.Properties.maskElements);
		EditingUtils.setEEFtype(editMaskElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createMaskElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	protected Composite createVectorElementsMultiValuedEditor(Composite parent) {
		vectorElements = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData vectorElementsData = new GridData(GridData.FILL_HORIZONTAL);
		vectorElementsData.horizontalSpan = 2;
		vectorElements.setLayoutData(vectorElementsData);
		EditingUtils.setID(vectorElements, SrmViewsRepository.Other.Properties.vectorElements);
		EditingUtils.setEEFtype(vectorElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editVectorElements = new Button(parent, SWT.NONE);
		editVectorElements.setText(getDescription(SrmViewsRepository.Other.Properties.vectorElements,
				SrmMessages.OtherPropertiesEditionPart_VectorElementsLabel));
		GridData editVectorElementsData = new GridData();
		editVectorElements.setLayoutData(editVectorElementsData);
		editVectorElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(vectorElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						vectorElementsList, SrmPackage.eINSTANCE.getInterruptResource_VectorElements().getEType(), null,
						false, true, null, null);
				if (dialog.open() == Window.OK) {
					vectorElementsList = dialog.getResult();
					if (vectorElementsList == null) {
						vectorElementsList = new BasicEList();
					}
					vectorElements.setText(vectorElementsList.toString());
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.vectorElements, PropertiesEditionEvent.COMMIT,
									PropertiesEditionEvent.SET, null, new BasicEList(vectorElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editVectorElements, SrmViewsRepository.Other.Properties.vectorElements);
		EditingUtils.setEEFtype(editVectorElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createVectorElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	protected Composite createMemoryBlockSizeElementsMultiValuedEditor(Composite parent) {
		memoryBlockSizeElements = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData memoryBlockSizeElementsData = new GridData(GridData.FILL_HORIZONTAL);
		memoryBlockSizeElementsData.horizontalSpan = 2;
		memoryBlockSizeElements.setLayoutData(memoryBlockSizeElementsData);
		EditingUtils.setID(memoryBlockSizeElements, SrmViewsRepository.Other.Properties.memoryBlockSizeElements);
		EditingUtils.setEEFtype(memoryBlockSizeElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editMemoryBlockSizeElements = new Button(parent, SWT.NONE);
		editMemoryBlockSizeElements.setText(getDescription(SrmViewsRepository.Other.Properties.memoryBlockSizeElements,
				SrmMessages.OtherPropertiesEditionPart_MemoryBlockSizeElementsLabel));
		GridData editMemoryBlockSizeElementsData = new GridData();
		editMemoryBlockSizeElements.setLayoutData(editMemoryBlockSizeElementsData);
		editMemoryBlockSizeElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(memoryBlockSizeElements.getShell(),
						"SoftwareTimerResource", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						memoryBlockSizeElementsList,
						SrmPackage.eINSTANCE.getMemoryBroker_MemoryBlockSizeElements().getEType(), null, false, true,
						null, null);
				if (dialog.open() == Window.OK) {
					memoryBlockSizeElementsList = dialog.getResult();
					if (memoryBlockSizeElementsList == null) {
						memoryBlockSizeElementsList = new BasicEList();
					}
					memoryBlockSizeElements.setText(memoryBlockSizeElementsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this,
							SrmViewsRepository.Other.Properties.memoryBlockSizeElements, PropertiesEditionEvent.COMMIT,
							PropertiesEditionEvent.SET, null, new BasicEList(memoryBlockSizeElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editMemoryBlockSizeElements, SrmViewsRepository.Other.Properties.memoryBlockSizeElements);
		EditingUtils.setEEFtype(editMemoryBlockSizeElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createMemoryBlockSizeElementsMultiValuedEditor

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOwnedServiceAdvancedTableComposition(Composite parent) {
		this.ownedService = new ReferencesTable(getDescription(SrmViewsRepository.Other.Properties.ownedService,
				SrmMessages.OtherPropertiesEditionPart_OwnedServiceLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.ownedService,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						ownedService.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.ownedService,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						ownedService.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.ownedService,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						ownedService.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.ownedService,
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
				.getHelpContent(SrmViewsRepository.Other.Properties.ownedService, SrmViewsRepository.SWT_KIND));
		this.ownedService.createControls(parent);
		this.ownedService.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.ownedService, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData ownedServiceData = new GridData(GridData.FILL_HORIZONTAL);
		ownedServiceData.horizontalSpan = 3;
		this.ownedService.setLayoutData(ownedServiceData);
		this.ownedService.setLowerBound(0);
		this.ownedService.setUpperBound(-1);
		ownedService.setID(SrmViewsRepository.Other.Properties.ownedService);
		ownedService.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOwnedServiceAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createPInterfaceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.pInterface,
				SrmMessages.OtherPropertiesEditionPart_PInterfaceLabel);
		this.pInterface = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addPInterface();
			}

			public void handleEdit(EObject element) {
				editPInterface(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				movePInterface(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromPInterface(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.pInterface.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.pInterface, SrmViewsRepository.SWT_KIND));
		this.pInterface.createControls(parent);
		this.pInterface.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.pInterface, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData pInterfaceData = new GridData(GridData.FILL_HORIZONTAL);
		pInterfaceData.horizontalSpan = 3;
		this.pInterface.setLayoutData(pInterfaceData);
		this.pInterface.disableMove();
		pInterface.setID(SrmViewsRepository.Other.Properties.pInterface);
		pInterface.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addPInterface() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(pInterface.getInput(),
				pInterfaceFilters, pInterfaceBusinessFilters, "pInterface",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.pInterface,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				pInterface.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void movePInterface(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.pInterface, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		pInterface.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromPInterface(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.pInterface, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		pInterface.refresh();
	}

	/**
	 * 
	 */
	protected void editPInterface(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				pInterface.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createRInterfaceAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.rInterface,
				SrmMessages.OtherPropertiesEditionPart_RInterfaceLabel);
		this.rInterface = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addRInterface();
			}

			public void handleEdit(EObject element) {
				editRInterface(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveRInterface(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromRInterface(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.rInterface.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.rInterface, SrmViewsRepository.SWT_KIND));
		this.rInterface.createControls(parent);
		this.rInterface.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.rInterface, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData rInterfaceData = new GridData(GridData.FILL_HORIZONTAL);
		rInterfaceData.horizontalSpan = 3;
		this.rInterface.setLayoutData(rInterfaceData);
		this.rInterface.disableMove();
		rInterface.setID(SrmViewsRepository.Other.Properties.rInterface);
		rInterface.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addRInterface() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(rInterface.getInput(),
				rInterfaceFilters, rInterfaceBusinessFilters, "rInterface",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.rInterface,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				rInterface.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveRInterface(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.rInterface, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		rInterface.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRInterface(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.rInterface, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		rInterface.refresh();
	}

	/**
	 * 
	 */
	protected void editRInterface(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				rInterface.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPServicesAdvancedTableComposition(Composite parent) {
		this.pServices = new ReferencesTable(getDescription(SrmViewsRepository.Other.Properties.pServices,
				SrmMessages.OtherPropertiesEditionPart_PServicesLabel), new ReferencesTableListener() {
					public void handleAdd() {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.pServices,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
						pServices.refresh();
					}

					public void handleEdit(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.pServices,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
						pServices.refresh();
					}

					public void handleMove(EObject element, int oldIndex, int newIndex) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.pServices,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
						pServices.refresh();
					}

					public void handleRemove(EObject element) {
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
								OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.pServices,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
						pServices.refresh();
					}

					public void navigateTo(EObject element) {
					}
				});
		for (ViewerFilter filter : this.pServicesFilters) {
			this.pServices.addFilter(filter);
		}
		this.pServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.pServices, SrmViewsRepository.SWT_KIND));
		this.pServices.createControls(parent);
		this.pServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.pServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData pServicesData = new GridData(GridData.FILL_HORIZONTAL);
		pServicesData.horizontalSpan = 3;
		this.pServices.setLayoutData(pServicesData);
		this.pServices.setLowerBound(0);
		this.pServices.setUpperBound(-1);
		pServices.setID(SrmViewsRepository.Other.Properties.pServices);
		pServices.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPServicesAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createRServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.rServices,
				SrmMessages.OtherPropertiesEditionPart_RServicesLabel);
		this.rServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addRServices();
			}

			public void handleEdit(EObject element) {
				editRServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveRServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromRServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.rServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.rServices, SrmViewsRepository.SWT_KIND));
		this.rServices.createControls(parent);
		this.rServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.rServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData rServicesData = new GridData(GridData.FILL_HORIZONTAL);
		rServicesData.horizontalSpan = 3;
		this.rServices.setLayoutData(rServicesData);
		this.rServices.disableMove();
		rServices.setID(SrmViewsRepository.Other.Properties.rServices);
		rServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addRServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(rServices.getInput(), rServicesFilters,
				rServicesBusinessFilters, "rServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.rServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				rServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveRServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.rServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		rServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.rServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		rServices.refresh();
	}

	/**
	 * 
	 */
	protected void editRServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				rServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createCreateServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.createServices,
				SrmMessages.OtherPropertiesEditionPart_CreateServicesLabel);
		this.createServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addCreateServices();
			}

			public void handleEdit(EObject element) {
				editCreateServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveCreateServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromCreateServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.createServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.createServices, SrmViewsRepository.SWT_KIND));
		this.createServices.createControls(parent);
		this.createServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.createServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData createServicesData = new GridData(GridData.FILL_HORIZONTAL);
		createServicesData.horizontalSpan = 3;
		this.createServices.setLayoutData(createServicesData);
		this.createServices.disableMove();
		createServices.setID(SrmViewsRepository.Other.Properties.createServices);
		createServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addCreateServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(createServices.getInput(),
				createServicesFilters, createServicesBusinessFilters, "createServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.createServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				createServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCreateServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.createServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		createServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCreateServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.createServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		createServices.refresh();
	}

	/**
	 * 
	 */
	protected void editCreateServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				createServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDeleteServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.deleteServices,
				SrmMessages.OtherPropertiesEditionPart_DeleteServicesLabel);
		this.deleteServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addDeleteServices();
			}

			public void handleEdit(EObject element) {
				editDeleteServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveDeleteServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromDeleteServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.deleteServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.deleteServices, SrmViewsRepository.SWT_KIND));
		this.deleteServices.createControls(parent);
		this.deleteServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.deleteServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData deleteServicesData = new GridData(GridData.FILL_HORIZONTAL);
		deleteServicesData.horizontalSpan = 3;
		this.deleteServices.setLayoutData(deleteServicesData);
		this.deleteServices.disableMove();
		deleteServices.setID(SrmViewsRepository.Other.Properties.deleteServices);
		deleteServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addDeleteServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(deleteServices.getInput(),
				deleteServicesFilters, deleteServicesBusinessFilters, "deleteServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.deleteServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				deleteServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveDeleteServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.deleteServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		deleteServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDeleteServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.deleteServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		deleteServices.refresh();
	}

	/**
	 * 
	 */
	protected void editDeleteServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				deleteServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createInitializeServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.initializeServices,
				SrmMessages.OtherPropertiesEditionPart_InitializeServicesLabel);
		this.initializeServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addInitializeServices();
			}

			public void handleEdit(EObject element) {
				editInitializeServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveInitializeServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromInitializeServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.initializeServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.initializeServices, SrmViewsRepository.SWT_KIND));
		this.initializeServices.createControls(parent);
		this.initializeServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.initializeServices,
							PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null,
							e.item.getData()));
				}
			}

		});
		GridData initializeServicesData = new GridData(GridData.FILL_HORIZONTAL);
		initializeServicesData.horizontalSpan = 3;
		this.initializeServices.setLayoutData(initializeServicesData);
		this.initializeServices.disableMove();
		initializeServices.setID(SrmViewsRepository.Other.Properties.initializeServices);
		initializeServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addInitializeServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(initializeServices.getInput(),
				initializeServicesFilters, initializeServicesBusinessFilters, "initializeServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.initializeServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				initializeServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveInitializeServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.initializeServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		initializeServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInitializeServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.initializeServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		initializeServices.refresh();
	}

	/**
	 * 
	 */
	protected void editInitializeServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				initializeServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createActivateServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.activateServices,
				SrmMessages.OtherPropertiesEditionPart_ActivateServicesLabel);
		this.activateServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addActivateServices();
			}

			public void handleEdit(EObject element) {
				editActivateServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveActivateServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromActivateServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.activateServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.activateServices, SrmViewsRepository.SWT_KIND));
		this.activateServices.createControls(parent);
		this.activateServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.activateServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData activateServicesData = new GridData(GridData.FILL_HORIZONTAL);
		activateServicesData.horizontalSpan = 3;
		this.activateServices.setLayoutData(activateServicesData);
		this.activateServices.disableMove();
		activateServices.setID(SrmViewsRepository.Other.Properties.activateServices);
		activateServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addActivateServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(activateServices.getInput(),
				activateServicesFilters, activateServicesBusinessFilters, "activateServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.activateServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				activateServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveActivateServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.activateServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		activateServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromActivateServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.activateServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		activateServices.refresh();
	}

	/**
	 * 
	 */
	protected void editActivateServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				activateServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createResumeServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.resumeServices,
				SrmMessages.OtherPropertiesEditionPart_ResumeServicesLabel);
		this.resumeServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addResumeServices();
			}

			public void handleEdit(EObject element) {
				editResumeServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveResumeServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromResumeServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.resumeServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.resumeServices, SrmViewsRepository.SWT_KIND));
		this.resumeServices.createControls(parent);
		this.resumeServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.resumeServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData resumeServicesData = new GridData(GridData.FILL_HORIZONTAL);
		resumeServicesData.horizontalSpan = 3;
		this.resumeServices.setLayoutData(resumeServicesData);
		this.resumeServices.disableMove();
		resumeServices.setID(SrmViewsRepository.Other.Properties.resumeServices);
		resumeServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addResumeServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(resumeServices.getInput(),
				resumeServicesFilters, resumeServicesBusinessFilters, "resumeServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.resumeServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				resumeServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveResumeServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.resumeServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		resumeServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromResumeServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.resumeServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		resumeServices.refresh();
	}

	/**
	 * 
	 */
	protected void editResumeServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				resumeServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSuspendServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.suspendServices,
				SrmMessages.OtherPropertiesEditionPart_SuspendServicesLabel);
		this.suspendServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addSuspendServices();
			}

			public void handleEdit(EObject element) {
				editSuspendServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveSuspendServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromSuspendServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.suspendServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.suspendServices, SrmViewsRepository.SWT_KIND));
		this.suspendServices.createControls(parent);
		this.suspendServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.suspendServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData suspendServicesData = new GridData(GridData.FILL_HORIZONTAL);
		suspendServicesData.horizontalSpan = 3;
		this.suspendServices.setLayoutData(suspendServicesData);
		this.suspendServices.disableMove();
		suspendServices.setID(SrmViewsRepository.Other.Properties.suspendServices);
		suspendServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSuspendServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(suspendServices.getInput(),
				suspendServicesFilters, suspendServicesBusinessFilters, "suspendServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.suspendServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				suspendServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSuspendServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.suspendServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		suspendServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSuspendServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.suspendServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		suspendServices.refresh();
	}

	/**
	 * 
	 */
	protected void editSuspendServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				suspendServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createEnableConcurrencyServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.enableConcurrencyServices,
				SrmMessages.OtherPropertiesEditionPart_EnableConcurrencyServicesLabel);
		this.enableConcurrencyServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addEnableConcurrencyServices();
			}

			public void handleEdit(EObject element) {
				editEnableConcurrencyServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveEnableConcurrencyServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromEnableConcurrencyServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.enableConcurrencyServices.setHelpText(propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.Other.Properties.enableConcurrencyServices, SrmViewsRepository.SWT_KIND));
		this.enableConcurrencyServices.createControls(parent);
		this.enableConcurrencyServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.enableConcurrencyServices,
									PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null,
									e.item.getData()));
				}
			}

		});
		GridData enableConcurrencyServicesData = new GridData(GridData.FILL_HORIZONTAL);
		enableConcurrencyServicesData.horizontalSpan = 3;
		this.enableConcurrencyServices.setLayoutData(enableConcurrencyServicesData);
		this.enableConcurrencyServices.disableMove();
		enableConcurrencyServices.setID(SrmViewsRepository.Other.Properties.enableConcurrencyServices);
		enableConcurrencyServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addEnableConcurrencyServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(enableConcurrencyServices.getInput(),
				enableConcurrencyServicesFilters, enableConcurrencyServicesBusinessFilters, "enableConcurrencyServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.enableConcurrencyServices,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				enableConcurrencyServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveEnableConcurrencyServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.enableConcurrencyServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		enableConcurrencyServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromEnableConcurrencyServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.enableConcurrencyServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		enableConcurrencyServices.refresh();
	}

	/**
	 * 
	 */
	protected void editEnableConcurrencyServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				enableConcurrencyServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDisableConcurrencyServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.disableConcurrencyServices,
				SrmMessages.OtherPropertiesEditionPart_DisableConcurrencyServicesLabel);
		this.disableConcurrencyServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addDisableConcurrencyServices();
			}

			public void handleEdit(EObject element) {
				editDisableConcurrencyServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveDisableConcurrencyServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromDisableConcurrencyServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.disableConcurrencyServices.setHelpText(propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.Other.Properties.disableConcurrencyServices, SrmViewsRepository.SWT_KIND));
		this.disableConcurrencyServices.createControls(parent);
		this.disableConcurrencyServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.disableConcurrencyServices,
									PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null,
									e.item.getData()));
				}
			}

		});
		GridData disableConcurrencyServicesData = new GridData(GridData.FILL_HORIZONTAL);
		disableConcurrencyServicesData.horizontalSpan = 3;
		this.disableConcurrencyServices.setLayoutData(disableConcurrencyServicesData);
		this.disableConcurrencyServices.disableMove();
		disableConcurrencyServices.setID(SrmViewsRepository.Other.Properties.disableConcurrencyServices);
		disableConcurrencyServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addDisableConcurrencyServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(disableConcurrencyServices.getInput(),
				disableConcurrencyServicesFilters, disableConcurrencyServicesBusinessFilters,
				"disableConcurrencyServices", propertiesEditionComponent.getEditingContext().getAdapterFactory(),
				current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.disableConcurrencyServices,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				disableConcurrencyServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveDisableConcurrencyServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.disableConcurrencyServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		disableConcurrencyServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDisableConcurrencyServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.disableConcurrencyServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		disableConcurrencyServices.refresh();
	}

	/**
	 * 
	 */
	protected void editDisableConcurrencyServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				disableConcurrencyServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createForkServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.forkServices,
				SrmMessages.OtherPropertiesEditionPart_ForkServicesLabel);
		this.forkServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addForkServices();
			}

			public void handleEdit(EObject element) {
				editForkServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveForkServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromForkServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.forkServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.forkServices, SrmViewsRepository.SWT_KIND));
		this.forkServices.createControls(parent);
		this.forkServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.forkServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData forkServicesData = new GridData(GridData.FILL_HORIZONTAL);
		forkServicesData.horizontalSpan = 3;
		this.forkServices.setLayoutData(forkServicesData);
		this.forkServices.disableMove();
		forkServices.setID(SrmViewsRepository.Other.Properties.forkServices);
		forkServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addForkServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(forkServices.getInput(),
				forkServicesFilters, forkServicesBusinessFilters, "forkServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.forkServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				forkServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveForkServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.forkServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		forkServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromForkServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.forkServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		forkServices.refresh();
	}

	/**
	 * 
	 */
	protected void editForkServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				forkServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createExitServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.exitServices,
				SrmMessages.OtherPropertiesEditionPart_ExitServicesLabel);
		this.exitServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addExitServices();
			}

			public void handleEdit(EObject element) {
				editExitServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveExitServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromExitServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.exitServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.exitServices, SrmViewsRepository.SWT_KIND));
		this.exitServices.createControls(parent);
		this.exitServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.exitServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData exitServicesData = new GridData(GridData.FILL_HORIZONTAL);
		exitServicesData.horizontalSpan = 3;
		this.exitServices.setLayoutData(exitServicesData);
		this.exitServices.disableMove();
		exitServices.setID(SrmViewsRepository.Other.Properties.exitServices);
		exitServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addExitServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(exitServices.getInput(),
				exitServicesFilters, exitServicesBusinessFilters, "exitServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.exitServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				exitServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveExitServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.exitServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		exitServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromExitServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.exitServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		exitServices.refresh();
	}

	/**
	 * 
	 */
	protected void editExitServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				exitServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createMemorySpacesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.memorySpaces,
				SrmMessages.OtherPropertiesEditionPart_MemorySpacesLabel);
		this.memorySpaces = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addMemorySpaces();
			}

			public void handleEdit(EObject element) {
				editMemorySpaces(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveMemorySpaces(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromMemorySpaces(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.memorySpaces.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.memorySpaces, SrmViewsRepository.SWT_KIND));
		this.memorySpaces.createControls(parent);
		this.memorySpaces.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.memorySpaces, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData memorySpacesData = new GridData(GridData.FILL_HORIZONTAL);
		memorySpacesData.horizontalSpan = 3;
		this.memorySpaces.setLayoutData(memorySpacesData);
		this.memorySpaces.disableMove();
		memorySpaces.setID(SrmViewsRepository.Other.Properties.memorySpaces);
		memorySpaces.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addMemorySpaces() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(memorySpaces.getInput(),
				memorySpacesFilters, memorySpacesBusinessFilters, "memorySpaces",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.memorySpaces,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				memorySpaces.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveMemorySpaces(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.memorySpaces, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		memorySpaces.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMemorySpaces(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.memorySpaces, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		memorySpaces.refresh();
	}

	/**
	 * 
	 */
	protected void editMemorySpaces(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				memorySpaces.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createCloseServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.closeServices,
				SrmMessages.OtherPropertiesEditionPart_CloseServicesLabel);
		this.closeServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addCloseServices();
			}

			public void handleEdit(EObject element) {
				editCloseServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveCloseServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromCloseServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.closeServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.closeServices, SrmViewsRepository.SWT_KIND));
		this.closeServices.createControls(parent);
		this.closeServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.closeServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData closeServicesData = new GridData(GridData.FILL_HORIZONTAL);
		closeServicesData.horizontalSpan = 3;
		this.closeServices.setLayoutData(closeServicesData);
		this.closeServices.disableMove();
		closeServices.setID(SrmViewsRepository.Other.Properties.closeServices);
		closeServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addCloseServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(closeServices.getInput(),
				closeServicesFilters, closeServicesBusinessFilters, "closeServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.closeServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				closeServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCloseServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.closeServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		closeServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCloseServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.closeServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		closeServices.refresh();
	}

	/**
	 * 
	 */
	protected void editCloseServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				closeServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOpenServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.openServices,
				SrmMessages.OtherPropertiesEditionPart_OpenServicesLabel);
		this.openServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addOpenServices();
			}

			public void handleEdit(EObject element) {
				editOpenServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveOpenServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromOpenServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.openServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.openServices, SrmViewsRepository.SWT_KIND));
		this.openServices.createControls(parent);
		this.openServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.openServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData openServicesData = new GridData(GridData.FILL_HORIZONTAL);
		openServicesData.horizontalSpan = 3;
		this.openServices.setLayoutData(openServicesData);
		this.openServices.disableMove();
		openServices.setID(SrmViewsRepository.Other.Properties.openServices);
		openServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOpenServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(openServices.getInput(),
				openServicesFilters, openServicesBusinessFilters, "openServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.openServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				openServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOpenServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.openServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		openServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOpenServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.openServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		openServices.refresh();
	}

	/**
	 * 
	 */
	protected void editOpenServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				openServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createAcquireServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.acquireServices,
				SrmMessages.OtherPropertiesEditionPart_AcquireServicesLabel);
		this.acquireServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addAcquireServices();
			}

			public void handleEdit(EObject element) {
				editAcquireServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveAcquireServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromAcquireServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.acquireServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.acquireServices, SrmViewsRepository.SWT_KIND));
		this.acquireServices.createControls(parent);
		this.acquireServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.acquireServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData acquireServicesData = new GridData(GridData.FILL_HORIZONTAL);
		acquireServicesData.horizontalSpan = 3;
		this.acquireServices.setLayoutData(acquireServicesData);
		this.acquireServices.disableMove();
		acquireServices.setID(SrmViewsRepository.Other.Properties.acquireServices);
		acquireServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addAcquireServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(acquireServices.getInput(),
				acquireServicesFilters, acquireServicesBusinessFilters, "acquireServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.acquireServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				acquireServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveAcquireServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.acquireServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		acquireServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromAcquireServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.acquireServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		acquireServices.refresh();
	}

	/**
	 * 
	 */
	protected void editAcquireServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				acquireServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createReleaseServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.releaseServices,
				SrmMessages.OtherPropertiesEditionPart_ReleaseServicesLabel);
		this.releaseServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addReleaseServices();
			}

			public void handleEdit(EObject element) {
				editReleaseServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveReleaseServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromReleaseServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.releaseServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.releaseServices, SrmViewsRepository.SWT_KIND));
		this.releaseServices.createControls(parent);
		this.releaseServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.releaseServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData releaseServicesData = new GridData(GridData.FILL_HORIZONTAL);
		releaseServicesData.horizontalSpan = 3;
		this.releaseServices.setLayoutData(releaseServicesData);
		this.releaseServices.disableMove();
		releaseServices.setID(SrmViewsRepository.Other.Properties.releaseServices);
		releaseServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addReleaseServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(releaseServices.getInput(),
				releaseServicesFilters, releaseServicesBusinessFilters, "releaseServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.releaseServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				releaseServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveReleaseServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.releaseServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		releaseServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromReleaseServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.releaseServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		releaseServices.refresh();
	}

	/**
	 * 
	 */
	protected void editReleaseServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				releaseServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createControlServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.controlServices,
				SrmMessages.OtherPropertiesEditionPart_ControlServicesLabel);
		this.controlServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addControlServices();
			}

			public void handleEdit(EObject element) {
				editControlServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveControlServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromControlServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.controlServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.controlServices, SrmViewsRepository.SWT_KIND));
		this.controlServices.createControls(parent);
		this.controlServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.controlServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData controlServicesData = new GridData(GridData.FILL_HORIZONTAL);
		controlServicesData.horizontalSpan = 3;
		this.controlServices.setLayoutData(controlServicesData);
		this.controlServices.disableMove();
		controlServices.setID(SrmViewsRepository.Other.Properties.controlServices);
		controlServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addControlServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(controlServices.getInput(),
				controlServicesFilters, controlServicesBusinessFilters, "controlServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.controlServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				controlServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveControlServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.controlServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		controlServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromControlServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.controlServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		controlServices.refresh();
	}

	/**
	 * 
	 */
	protected void editControlServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				controlServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSendServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.sendServices,
				SrmMessages.OtherPropertiesEditionPart_SendServicesLabel);
		this.sendServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addSendServices();
			}

			public void handleEdit(EObject element) {
				editSendServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveSendServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromSendServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.sendServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.sendServices, SrmViewsRepository.SWT_KIND));
		this.sendServices.createControls(parent);
		this.sendServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.sendServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData sendServicesData = new GridData(GridData.FILL_HORIZONTAL);
		sendServicesData.horizontalSpan = 3;
		this.sendServices.setLayoutData(sendServicesData);
		this.sendServices.disableMove();
		sendServices.setID(SrmViewsRepository.Other.Properties.sendServices);
		sendServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSendServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(sendServices.getInput(),
				sendServicesFilters, sendServicesBusinessFilters, "sendServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.sendServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				sendServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSendServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.sendServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		sendServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSendServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.sendServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		sendServices.refresh();
	}

	/**
	 * 
	 */
	protected void editSendServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				sendServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createReceiveServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.receiveServices,
				SrmMessages.OtherPropertiesEditionPart_ReceiveServicesLabel);
		this.receiveServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addReceiveServices();
			}

			public void handleEdit(EObject element) {
				editReceiveServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveReceiveServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromReceiveServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.receiveServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.receiveServices, SrmViewsRepository.SWT_KIND));
		this.receiveServices.createControls(parent);
		this.receiveServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.receiveServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData receiveServicesData = new GridData(GridData.FILL_HORIZONTAL);
		receiveServicesData.horizontalSpan = 3;
		this.receiveServices.setLayoutData(receiveServicesData);
		this.receiveServices.disableMove();
		receiveServices.setID(SrmViewsRepository.Other.Properties.receiveServices);
		receiveServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addReceiveServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(receiveServices.getInput(),
				receiveServicesFilters, receiveServicesBusinessFilters, "receiveServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.receiveServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				receiveServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveReceiveServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.receiveServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		receiveServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromReceiveServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.receiveServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		receiveServices.refresh();
	}

	/**
	 * 
	 */
	protected void editReceiveServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				receiveServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createReadServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.readServices,
				SrmMessages.OtherPropertiesEditionPart_ReadServicesLabel);
		this.readServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addReadServices();
			}

			public void handleEdit(EObject element) {
				editReadServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveReadServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromReadServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.readServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.readServices, SrmViewsRepository.SWT_KIND));
		this.readServices.createControls(parent);
		this.readServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.readServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData readServicesData = new GridData(GridData.FILL_HORIZONTAL);
		readServicesData.horizontalSpan = 3;
		this.readServices.setLayoutData(readServicesData);
		this.readServices.disableMove();
		readServices.setID(SrmViewsRepository.Other.Properties.readServices);
		readServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addReadServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(readServices.getInput(),
				readServicesFilters, readServicesBusinessFilters, "readServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.readServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				readServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveReadServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.readServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		readServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromReadServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.readServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		readServices.refresh();
	}

	/**
	 * 
	 */
	protected void editReadServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				readServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createWriteServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.writeServices,
				SrmMessages.OtherPropertiesEditionPart_WriteServicesLabel);
		this.writeServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addWriteServices();
			}

			public void handleEdit(EObject element) {
				editWriteServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveWriteServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromWriteServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.writeServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.writeServices, SrmViewsRepository.SWT_KIND));
		this.writeServices.createControls(parent);
		this.writeServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.writeServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData writeServicesData = new GridData(GridData.FILL_HORIZONTAL);
		writeServicesData.horizontalSpan = 3;
		this.writeServices.setLayoutData(writeServicesData);
		this.writeServices.disableMove();
		writeServices.setID(SrmViewsRepository.Other.Properties.writeServices);
		writeServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addWriteServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(writeServices.getInput(),
				writeServicesFilters, writeServicesBusinessFilters, "writeServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.writeServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				writeServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveWriteServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.writeServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		writeServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromWriteServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.writeServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		writeServices.refresh();
	}

	/**
	 * 
	 */
	protected void editWriteServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				writeServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createFlushServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.flushServices,
				SrmMessages.OtherPropertiesEditionPart_FlushServicesLabel);
		this.flushServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addFlushServices();
			}

			public void handleEdit(EObject element) {
				editFlushServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveFlushServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromFlushServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.flushServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.flushServices, SrmViewsRepository.SWT_KIND));
		this.flushServices.createControls(parent);
		this.flushServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.flushServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData flushServicesData = new GridData(GridData.FILL_HORIZONTAL);
		flushServicesData.horizontalSpan = 3;
		this.flushServices.setLayoutData(flushServicesData);
		this.flushServices.disableMove();
		flushServices.setID(SrmViewsRepository.Other.Properties.flushServices);
		flushServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addFlushServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(flushServices.getInput(),
				flushServicesFilters, flushServicesBusinessFilters, "flushServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.flushServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				flushServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveFlushServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.flushServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		flushServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromFlushServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.flushServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		flushServices.refresh();
	}

	/**
	 * 
	 */
	protected void editFlushServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				flushServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSignalServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.signalServices,
				SrmMessages.OtherPropertiesEditionPart_SignalServicesLabel);
		this.signalServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addSignalServices();
			}

			public void handleEdit(EObject element) {
				editSignalServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveSignalServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromSignalServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.signalServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.signalServices, SrmViewsRepository.SWT_KIND));
		this.signalServices.createControls(parent);
		this.signalServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.signalServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData signalServicesData = new GridData(GridData.FILL_HORIZONTAL);
		signalServicesData.horizontalSpan = 3;
		this.signalServices.setLayoutData(signalServicesData);
		this.signalServices.disableMove();
		signalServices.setID(SrmViewsRepository.Other.Properties.signalServices);
		signalServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSignalServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(signalServices.getInput(),
				signalServicesFilters, signalServicesBusinessFilters, "signalServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.signalServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				signalServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSignalServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.signalServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		signalServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSignalServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.signalServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		signalServices.refresh();
	}

	/**
	 * 
	 */
	protected void editSignalServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				signalServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createWaitServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.waitServices,
				SrmMessages.OtherPropertiesEditionPart_WaitServicesLabel);
		this.waitServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addWaitServices();
			}

			public void handleEdit(EObject element) {
				editWaitServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveWaitServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromWaitServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.waitServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.waitServices, SrmViewsRepository.SWT_KIND));
		this.waitServices.createControls(parent);
		this.waitServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.waitServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData waitServicesData = new GridData(GridData.FILL_HORIZONTAL);
		waitServicesData.horizontalSpan = 3;
		this.waitServices.setLayoutData(waitServicesData);
		this.waitServices.disableMove();
		waitServices.setID(SrmViewsRepository.Other.Properties.waitServices);
		waitServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addWaitServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(waitServices.getInput(),
				waitServicesFilters, waitServicesBusinessFilters, "waitServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.waitServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				waitServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveWaitServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.waitServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		waitServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromWaitServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.waitServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		waitServices.refresh();
	}

	/**
	 * 
	 */
	protected void editWaitServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				waitServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createClearServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.clearServices,
				SrmMessages.OtherPropertiesEditionPart_ClearServicesLabel);
		this.clearServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addClearServices();
			}

			public void handleEdit(EObject element) {
				editClearServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveClearServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromClearServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.clearServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.clearServices, SrmViewsRepository.SWT_KIND));
		this.clearServices.createControls(parent);
		this.clearServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.clearServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData clearServicesData = new GridData(GridData.FILL_HORIZONTAL);
		clearServicesData.horizontalSpan = 3;
		this.clearServices.setLayoutData(clearServicesData);
		this.clearServices.disableMove();
		clearServices.setID(SrmViewsRepository.Other.Properties.clearServices);
		clearServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addClearServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(clearServices.getInput(),
				clearServicesFilters, clearServicesBusinessFilters, "clearServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.clearServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				clearServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveClearServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.clearServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		clearServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromClearServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.clearServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		clearServices.refresh();
	}

	/**
	 * 
	 */
	protected void editClearServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				clearServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createLockServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.lockServices,
				SrmMessages.OtherPropertiesEditionPart_LockServicesLabel);
		this.lockServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addLockServices();
			}

			public void handleEdit(EObject element) {
				editLockServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveLockServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromLockServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.lockServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.lockServices, SrmViewsRepository.SWT_KIND));
		this.lockServices.createControls(parent);
		this.lockServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.lockServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData lockServicesData = new GridData(GridData.FILL_HORIZONTAL);
		lockServicesData.horizontalSpan = 3;
		this.lockServices.setLayoutData(lockServicesData);
		this.lockServices.disableMove();
		lockServices.setID(SrmViewsRepository.Other.Properties.lockServices);
		lockServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addLockServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(lockServices.getInput(),
				lockServicesFilters, lockServicesBusinessFilters, "lockServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.lockServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				lockServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveLockServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.lockServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		lockServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromLockServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.lockServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		lockServices.refresh();
	}

	/**
	 * 
	 */
	protected void editLockServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				lockServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createUnlockServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.unlockServices,
				SrmMessages.OtherPropertiesEditionPart_UnlockServicesLabel);
		this.unlockServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addUnlockServices();
			}

			public void handleEdit(EObject element) {
				editUnlockServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveUnlockServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromUnlockServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.unlockServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.unlockServices, SrmViewsRepository.SWT_KIND));
		this.unlockServices.createControls(parent);
		this.unlockServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.unlockServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData unlockServicesData = new GridData(GridData.FILL_HORIZONTAL);
		unlockServicesData.horizontalSpan = 3;
		this.unlockServices.setLayoutData(unlockServicesData);
		this.unlockServices.disableMove();
		unlockServices.setID(SrmViewsRepository.Other.Properties.unlockServices);
		unlockServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addUnlockServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(unlockServices.getInput(),
				unlockServicesFilters, unlockServicesBusinessFilters, "unlockServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.unlockServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				unlockServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveUnlockServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.unlockServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		unlockServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromUnlockServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.unlockServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		unlockServices.refresh();
	}

	/**
	 * 
	 */
	protected void editUnlockServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				unlockServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createJoinServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.joinServices,
				SrmMessages.OtherPropertiesEditionPart_JoinServicesLabel);
		this.joinServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addJoinServices();
			}

			public void handleEdit(EObject element) {
				editJoinServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveJoinServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromJoinServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.joinServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.joinServices, SrmViewsRepository.SWT_KIND));
		this.joinServices.createControls(parent);
		this.joinServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.joinServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData joinServicesData = new GridData(GridData.FILL_HORIZONTAL);
		joinServicesData.horizontalSpan = 3;
		this.joinServices.setLayoutData(joinServicesData);
		this.joinServices.disableMove();
		joinServices.setID(SrmViewsRepository.Other.Properties.joinServices);
		joinServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addJoinServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(joinServices.getInput(),
				joinServicesFilters, joinServicesBusinessFilters, "joinServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.joinServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				joinServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveJoinServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.joinServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		joinServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromJoinServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.joinServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		joinServices.refresh();
	}

	/**
	 * 
	 */
	protected void editJoinServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				joinServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createYieldServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.yieldServices,
				SrmMessages.OtherPropertiesEditionPart_YieldServicesLabel);
		this.yieldServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addYieldServices();
			}

			public void handleEdit(EObject element) {
				editYieldServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveYieldServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromYieldServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.yieldServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.yieldServices, SrmViewsRepository.SWT_KIND));
		this.yieldServices.createControls(parent);
		this.yieldServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.yieldServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData yieldServicesData = new GridData(GridData.FILL_HORIZONTAL);
		yieldServicesData.horizontalSpan = 3;
		this.yieldServices.setLayoutData(yieldServicesData);
		this.yieldServices.disableMove();
		yieldServices.setID(SrmViewsRepository.Other.Properties.yieldServices);
		yieldServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addYieldServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(yieldServices.getInput(),
				yieldServicesFilters, yieldServicesBusinessFilters, "yieldServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.yieldServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				yieldServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveYieldServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.yieldServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		yieldServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromYieldServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.yieldServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		yieldServices.refresh();
	}

	/**
	 * 
	 */
	protected void editYieldServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				yieldServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDelayServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.delayServices,
				SrmMessages.OtherPropertiesEditionPart_DelayServicesLabel);
		this.delayServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addDelayServices();
			}

			public void handleEdit(EObject element) {
				editDelayServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveDelayServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromDelayServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.delayServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.delayServices, SrmViewsRepository.SWT_KIND));
		this.delayServices.createControls(parent);
		this.delayServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.delayServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData delayServicesData = new GridData(GridData.FILL_HORIZONTAL);
		delayServicesData.horizontalSpan = 3;
		this.delayServices.setLayoutData(delayServicesData);
		this.delayServices.disableMove();
		delayServices.setID(SrmViewsRepository.Other.Properties.delayServices);
		delayServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addDelayServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(delayServices.getInput(),
				delayServicesFilters, delayServicesBusinessFilters, "delayServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.delayServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				delayServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveDelayServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.delayServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		delayServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDelayServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.delayServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		delayServices.refresh();
	}

	/**
	 * 
	 */
	protected void editDelayServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				delayServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createMapServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.mapServices,
				SrmMessages.OtherPropertiesEditionPart_MapServicesLabel);
		this.mapServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addMapServices();
			}

			public void handleEdit(EObject element) {
				editMapServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveMapServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromMapServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.mapServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.mapServices, SrmViewsRepository.SWT_KIND));
		this.mapServices.createControls(parent);
		this.mapServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.mapServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData mapServicesData = new GridData(GridData.FILL_HORIZONTAL);
		mapServicesData.horizontalSpan = 3;
		this.mapServices.setLayoutData(mapServicesData);
		this.mapServices.disableMove();
		mapServices.setID(SrmViewsRepository.Other.Properties.mapServices);
		mapServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addMapServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(mapServices.getInput(),
				mapServicesFilters, mapServicesBusinessFilters, "mapServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.mapServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				mapServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveMapServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.mapServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		mapServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMapServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.mapServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		mapServices.refresh();
	}

	/**
	 * 
	 */
	protected void editMapServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				mapServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createUnmapServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.unmapServices,
				SrmMessages.OtherPropertiesEditionPart_UnmapServicesLabel);
		this.unmapServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addUnmapServices();
			}

			public void handleEdit(EObject element) {
				editUnmapServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveUnmapServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromUnmapServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.unmapServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.unmapServices, SrmViewsRepository.SWT_KIND));
		this.unmapServices.createControls(parent);
		this.unmapServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.unmapServices, PropertiesEditionEvent.CHANGE,
									PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData unmapServicesData = new GridData(GridData.FILL_HORIZONTAL);
		unmapServicesData.horizontalSpan = 3;
		this.unmapServices.setLayoutData(unmapServicesData);
		this.unmapServices.disableMove();
		unmapServices.setID(SrmViewsRepository.Other.Properties.unmapServices);
		unmapServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addUnmapServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(unmapServices.getInput(),
				unmapServicesFilters, unmapServicesBusinessFilters, "unmapServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.unmapServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				unmapServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveUnmapServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.unmapServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		unmapServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromUnmapServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.unmapServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		unmapServices.refresh();
	}

	/**
	 * 
	 */
	protected void editUnmapServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				unmapServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createTerminateServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.terminateServices,
				SrmMessages.OtherPropertiesEditionPart_TerminateServicesLabel);
		this.terminateServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addTerminateServices();
			}

			public void handleEdit(EObject element) {
				editTerminateServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveTerminateServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromTerminateServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.terminateServices.setHelpText(propertiesEditionComponent
				.getHelpContent(SrmViewsRepository.Other.Properties.terminateServices, SrmViewsRepository.SWT_KIND));
		this.terminateServices.createControls(parent);
		this.terminateServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.terminateServices,
							PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null,
							e.item.getData()));
				}
			}

		});
		GridData terminateServicesData = new GridData(GridData.FILL_HORIZONTAL);
		terminateServicesData.horizontalSpan = 3;
		this.terminateServices.setLayoutData(terminateServicesData);
		this.terminateServices.disableMove();
		terminateServices.setID(SrmViewsRepository.Other.Properties.terminateServices);
		terminateServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addTerminateServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(terminateServices.getInput(),
				terminateServicesFilters, terminateServicesBusinessFilters, "terminateServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this, SrmViewsRepository.Other.Properties.terminateServices,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				terminateServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveTerminateServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.terminateServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		terminateServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromTerminateServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.terminateServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		terminateServices.refresh();
	}

	/**
	 * 
	 */
	protected void editTerminateServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				terminateServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createRoutineConnectServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.routineConnectServices,
				SrmMessages.OtherPropertiesEditionPart_RoutineConnectServicesLabel);
		this.routineConnectServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addRoutineConnectServices();
			}

			public void handleEdit(EObject element) {
				editRoutineConnectServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveRoutineConnectServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromRoutineConnectServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.routineConnectServices.setHelpText(propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.Other.Properties.routineConnectServices, SrmViewsRepository.SWT_KIND));
		this.routineConnectServices.createControls(parent);
		this.routineConnectServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							OtherPropertiesEditionPartImpl.this,
							SrmViewsRepository.Other.Properties.routineConnectServices, PropertiesEditionEvent.CHANGE,
							PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}

		});
		GridData routineConnectServicesData = new GridData(GridData.FILL_HORIZONTAL);
		routineConnectServicesData.horizontalSpan = 3;
		this.routineConnectServices.setLayoutData(routineConnectServicesData);
		this.routineConnectServices.disableMove();
		routineConnectServices.setID(SrmViewsRepository.Other.Properties.routineConnectServices);
		routineConnectServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addRoutineConnectServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(routineConnectServices.getInput(),
				routineConnectServicesFilters, routineConnectServicesBusinessFilters, "routineConnectServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.routineConnectServices,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				routineConnectServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveRoutineConnectServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.routineConnectServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		routineConnectServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRoutineConnectServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.routineConnectServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		routineConnectServices.refresh();
	}

	/**
	 * 
	 */
	protected void editRoutineConnectServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				routineConnectServices.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createRoutineDisconnectServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SrmViewsRepository.Other.Properties.routineDisconnectServices,
				SrmMessages.OtherPropertiesEditionPart_RoutineDisconnectServicesLabel);
		this.routineDisconnectServices = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() {
				addRoutineDisconnectServices();
			}

			public void handleEdit(EObject element) {
				editRoutineDisconnectServices(element);
			}

			public void handleMove(EObject element, int oldIndex, int newIndex) {
				moveRoutineDisconnectServices(element, oldIndex, newIndex);
			}

			public void handleRemove(EObject element) {
				removeFromRoutineDisconnectServices(element);
			}

			public void navigateTo(EObject element) {
			}
		});
		this.routineDisconnectServices.setHelpText(propertiesEditionComponent.getHelpContent(
				SrmViewsRepository.Other.Properties.routineDisconnectServices, SrmViewsRepository.SWT_KIND));
		this.routineDisconnectServices.createControls(parent);
		this.routineDisconnectServices.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.routineDisconnectServices,
									PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null,
									e.item.getData()));
				}
			}

		});
		GridData routineDisconnectServicesData = new GridData(GridData.FILL_HORIZONTAL);
		routineDisconnectServicesData.horizontalSpan = 3;
		this.routineDisconnectServices.setLayoutData(routineDisconnectServicesData);
		this.routineDisconnectServices.disableMove();
		routineDisconnectServices.setID(SrmViewsRepository.Other.Properties.routineDisconnectServices);
		routineDisconnectServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addRoutineDisconnectServices() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(routineDisconnectServices.getInput(),
				routineDisconnectServicesFilters, routineDisconnectServicesBusinessFilters, "routineDisconnectServices",
				propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
									SrmViewsRepository.Other.Properties.routineDisconnectServices,
									PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				routineDisconnectServices.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveRoutineDisconnectServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.routineDisconnectServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.MOVE, element, newIndex));
		routineDisconnectServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRoutineDisconnectServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(OtherPropertiesEditionPartImpl.this,
				SrmViewsRepository.Other.Properties.routineDisconnectServices, PropertiesEditionEvent.COMMIT,
				PropertiesEditionEvent.REMOVE, null, element));
		routineDisconnectServices.refresh();
	}

	/**
	 * 
	 */
	protected void editRoutineDisconnectServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(
				propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider) adapterFactory.adapt(element,
				PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				routineDisconnectServices.refresh();
			}
		}
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
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#getPacketSize()
	 * 
	 */
	public String getPacketSize() {
		return packetSize.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#setPacketSize(String
	 *      newValue)
	 * 
	 */
	public void setPacketSize(String newValue) {
		if (newValue != null) {
			packetSize.setText(newValue);
		} else {
			packetSize.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.packetSize);
		if (eefElementEditorReadOnlyState && packetSize.isEnabled()) {
			packetSize.setEnabled(false);
			packetSize.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !packetSize.isEnabled()) {
			packetSize.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#getIsMaskable()
	 * 
	 */
	public Boolean getIsMaskable() {
		return Boolean.valueOf(isMaskable.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#setIsMaskable(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsMaskable(Boolean newValue) {
		if (newValue != null) {
			isMaskable.setSelection(newValue.booleanValue());
		} else {
			isMaskable.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.isMaskable);
		if (eefElementEditorReadOnlyState && isMaskable.isEnabled()) {
			isMaskable.setEnabled(false);
			isMaskable.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isMaskable.isEnabled()) {
			isMaskable.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#getIsStaticSchedulingFeature()
	 * 
	 */
	public Boolean getIsStaticSchedulingFeature() {
		return Boolean.valueOf(isStaticSchedulingFeature.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#setIsStaticSchedulingFeature(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsStaticSchedulingFeature(Boolean newValue) {
		if (newValue != null) {
			isStaticSchedulingFeature.setSelection(newValue.booleanValue());
		} else {
			isStaticSchedulingFeature.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				SrmViewsRepository.Other.Properties.isStaticSchedulingFeature);
		if (eefElementEditorReadOnlyState && isStaticSchedulingFeature.isEnabled()) {
			isStaticSchedulingFeature.setEnabled(false);
			isStaticSchedulingFeature.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isStaticSchedulingFeature.isEnabled()) {
			isStaticSchedulingFeature.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#getIsIntraMemoryPartitionInteraction()
	 * 
	 */
	public Boolean getIsIntraMemoryPartitionInteraction() {
		return Boolean.valueOf(isIntraMemoryPartitionInteraction.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#setIsIntraMemoryPartitionInteraction(Boolean
	 *      newValue)
	 * 
	 */
	public void setIsIntraMemoryPartitionInteraction(Boolean newValue) {
		if (newValue != null) {
			isIntraMemoryPartitionInteraction.setSelection(newValue.booleanValue());
		} else {
			isIntraMemoryPartitionInteraction.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction);
		if (eefElementEditorReadOnlyState && isIntraMemoryPartitionInteraction.isEnabled()) {
			isIntraMemoryPartitionInteraction.setEnabled(false);
			isIntraMemoryPartitionInteraction.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !isIntraMemoryPartitionInteraction.isEnabled()) {
			isIntraMemoryPartitionInteraction.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#getMemoryBlockAddressElements()
	 * 
	 */
	public EList getMemoryBlockAddressElements() {
		return memoryBlockAddressElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#setMemoryBlockAddressElements(EList
	 *      newValue)
	 * 
	 */
	public void setMemoryBlockAddressElements(EList newValue) {
		memoryBlockAddressElementsList = newValue;
		if (newValue != null) {
			memoryBlockAddressElements.setText(memoryBlockAddressElementsList.toString());
		} else {
			memoryBlockAddressElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(
				SrmViewsRepository.Other.Properties.memoryBlockAddressElements);
		if (eefElementEditorReadOnlyState && memoryBlockAddressElements.isEnabled()) {
			memoryBlockAddressElements.setEnabled(false);
			memoryBlockAddressElements.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !memoryBlockAddressElements.isEnabled()) {
			memoryBlockAddressElements.setEnabled(true);
		}

	}

	public void addToMemoryBlockAddressElements(Object newValue) {
		memoryBlockAddressElementsList.add(newValue);
		if (newValue != null) {
			memoryBlockAddressElements.setText(memoryBlockAddressElementsList.toString());
		} else {
			memoryBlockAddressElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToMemoryBlockAddressElements(Object newValue) {
		memoryBlockAddressElementsList.remove(newValue);
		if (newValue != null) {
			memoryBlockAddressElements.setText(memoryBlockAddressElementsList.toString());
		} else {
			memoryBlockAddressElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#getStackSizeElements()
	 * 
	 */
	public EList getStackSizeElements() {
		return stackSizeElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#setStackSizeElements(EList
	 *      newValue)
	 * 
	 */
	public void setStackSizeElements(EList newValue) {
		stackSizeElementsList = newValue;
		if (newValue != null) {
			stackSizeElements.setText(stackSizeElementsList.toString());
		} else {
			stackSizeElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.stackSizeElements);
		if (eefElementEditorReadOnlyState && stackSizeElements.isEnabled()) {
			stackSizeElements.setEnabled(false);
			stackSizeElements.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !stackSizeElements.isEnabled()) {
			stackSizeElements.setEnabled(true);
		}

	}

	public void addToStackSizeElements(Object newValue) {
		stackSizeElementsList.add(newValue);
		if (newValue != null) {
			stackSizeElements.setText(stackSizeElementsList.toString());
		} else {
			stackSizeElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToStackSizeElements(Object newValue) {
		stackSizeElementsList.remove(newValue);
		if (newValue != null) {
			stackSizeElements.setText(stackSizeElementsList.toString());
		} else {
			stackSizeElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#getHeapSizeElements()
	 * 
	 */
	public EList getHeapSizeElements() {
		return heapSizeElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#setHeapSizeElements(EList
	 *      newValue)
	 * 
	 */
	public void setHeapSizeElements(EList newValue) {
		heapSizeElementsList = newValue;
		if (newValue != null) {
			heapSizeElements.setText(heapSizeElementsList.toString());
		} else {
			heapSizeElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.heapSizeElements);
		if (eefElementEditorReadOnlyState && heapSizeElements.isEnabled()) {
			heapSizeElements.setEnabled(false);
			heapSizeElements.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !heapSizeElements.isEnabled()) {
			heapSizeElements.setEnabled(true);
		}

	}

	public void addToHeapSizeElements(Object newValue) {
		heapSizeElementsList.add(newValue);
		if (newValue != null) {
			heapSizeElements.setText(heapSizeElementsList.toString());
		} else {
			heapSizeElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToHeapSizeElements(Object newValue) {
		heapSizeElementsList.remove(newValue);
		if (newValue != null) {
			heapSizeElements.setText(heapSizeElementsList.toString());
		} else {
			heapSizeElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#getMaskElements()
	 * 
	 */
	public EList getMaskElements() {
		return maskElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#setMaskElements(EList
	 *      newValue)
	 * 
	 */
	public void setMaskElements(EList newValue) {
		maskElementsList = newValue;
		if (newValue != null) {
			maskElements.setText(maskElementsList.toString());
		} else {
			maskElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.maskElements);
		if (eefElementEditorReadOnlyState && maskElements.isEnabled()) {
			maskElements.setEnabled(false);
			maskElements.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !maskElements.isEnabled()) {
			maskElements.setEnabled(true);
		}

	}

	public void addToMaskElements(Object newValue) {
		maskElementsList.add(newValue);
		if (newValue != null) {
			maskElements.setText(maskElementsList.toString());
		} else {
			maskElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToMaskElements(Object newValue) {
		maskElementsList.remove(newValue);
		if (newValue != null) {
			maskElements.setText(maskElementsList.toString());
		} else {
			maskElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#getVectorElements()
	 * 
	 */
	public EList getVectorElements() {
		return vectorElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#setVectorElements(EList
	 *      newValue)
	 * 
	 */
	public void setVectorElements(EList newValue) {
		vectorElementsList = newValue;
		if (newValue != null) {
			vectorElements.setText(vectorElementsList.toString());
		} else {
			vectorElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.vectorElements);
		if (eefElementEditorReadOnlyState && vectorElements.isEnabled()) {
			vectorElements.setEnabled(false);
			vectorElements.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !vectorElements.isEnabled()) {
			vectorElements.setEnabled(true);
		}

	}

	public void addToVectorElements(Object newValue) {
		vectorElementsList.add(newValue);
		if (newValue != null) {
			vectorElements.setText(vectorElementsList.toString());
		} else {
			vectorElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToVectorElements(Object newValue) {
		vectorElementsList.remove(newValue);
		if (newValue != null) {
			vectorElements.setText(vectorElementsList.toString());
		} else {
			vectorElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#getMemoryBlockSizeElements()
	 * 
	 */
	public EList getMemoryBlockSizeElements() {
		return memoryBlockSizeElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#setMemoryBlockSizeElements(EList
	 *      newValue)
	 * 
	 */
	public void setMemoryBlockSizeElements(EList newValue) {
		memoryBlockSizeElementsList = newValue;
		if (newValue != null) {
			memoryBlockSizeElements.setText(memoryBlockSizeElementsList.toString());
		} else {
			memoryBlockSizeElements.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.memoryBlockSizeElements);
		if (eefElementEditorReadOnlyState && memoryBlockSizeElements.isEnabled()) {
			memoryBlockSizeElements.setEnabled(false);
			memoryBlockSizeElements.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !memoryBlockSizeElements.isEnabled()) {
			memoryBlockSizeElements.setEnabled(true);
		}

	}

	public void addToMemoryBlockSizeElements(Object newValue) {
		memoryBlockSizeElementsList.add(newValue);
		if (newValue != null) {
			memoryBlockSizeElements.setText(memoryBlockSizeElementsList.toString());
		} else {
			memoryBlockSizeElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToMemoryBlockSizeElements(Object newValue) {
		memoryBlockSizeElementsList.remove(newValue);
		if (newValue != null) {
			memoryBlockSizeElements.setText(memoryBlockSizeElementsList.toString());
		} else {
			memoryBlockSizeElements.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initOwnedService(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initOwnedService(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ownedService.setContentProvider(contentProvider);
		ownedService.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.ownedService);
		if (eefElementEditorReadOnlyState && ownedService.isEnabled()) {
			ownedService.setEnabled(false);
			ownedService.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ownedService.isEnabled()) {
			ownedService.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateOwnedService()
	 * 
	 */
	public void updateOwnedService() {
		ownedService.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterOwnedService(ViewerFilter
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
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterOwnedService(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOwnedService(ViewerFilter filter) {
		ownedServiceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInOwnedServiceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOwnedServiceTable(EObject element) {
		return ((ReferencesTableSettings) ownedService.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initPInterface(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initPInterface(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		pInterface.setContentProvider(contentProvider);
		pInterface.setInput(settings);
		pInterfaceBusinessFilters.clear();
		pInterfaceFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.pInterface);
		if (eefElementEditorReadOnlyState && pInterface.getTable().isEnabled()) {
			pInterface.setEnabled(false);
			pInterface.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !pInterface.getTable().isEnabled()) {
			pInterface.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updatePInterface()
	 * 
	 */
	public void updatePInterface() {
		pInterface.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterPInterface(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToPInterface(ViewerFilter filter) {
		pInterfaceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterPInterface(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToPInterface(ViewerFilter filter) {
		pInterfaceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInPInterfaceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInPInterfaceTable(EObject element) {
		return ((ReferencesTableSettings) pInterface.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initRInterface(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRInterface(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		rInterface.setContentProvider(contentProvider);
		rInterface.setInput(settings);
		rInterfaceBusinessFilters.clear();
		rInterfaceFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.rInterface);
		if (eefElementEditorReadOnlyState && rInterface.getTable().isEnabled()) {
			rInterface.setEnabled(false);
			rInterface.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rInterface.getTable().isEnabled()) {
			rInterface.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateRInterface()
	 * 
	 */
	public void updateRInterface() {
		rInterface.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterRInterface(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToRInterface(ViewerFilter filter) {
		rInterfaceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterRInterface(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToRInterface(ViewerFilter filter) {
		rInterfaceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInRInterfaceTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInRInterfaceTable(EObject element) {
		return ((ReferencesTableSettings) rInterface.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initPServices(EObject
	 *      current, EReference containingFeature, EReference feature)
	 */
	public void initPServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		pServices.setContentProvider(contentProvider);
		pServices.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.pServices);
		if (eefElementEditorReadOnlyState && pServices.isEnabled()) {
			pServices.setEnabled(false);
			pServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !pServices.isEnabled()) {
			pServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updatePServices()
	 * 
	 */
	public void updatePServices() {
		pServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterPServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToPServices(ViewerFilter filter) {
		pServicesFilters.add(filter);
		if (this.pServices != null) {
			this.pServices.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterPServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToPServices(ViewerFilter filter) {
		pServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInPServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInPServicesTable(EObject element) {
		return ((ReferencesTableSettings) pServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initRServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		rServices.setContentProvider(contentProvider);
		rServices.setInput(settings);
		rServicesBusinessFilters.clear();
		rServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.rServices);
		if (eefElementEditorReadOnlyState && rServices.getTable().isEnabled()) {
			rServices.setEnabled(false);
			rServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !rServices.getTable().isEnabled()) {
			rServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateRServices()
	 * 
	 */
	public void updateRServices() {
		rServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterRServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToRServices(ViewerFilter filter) {
		rServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterRServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToRServices(ViewerFilter filter) {
		rServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInRServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInRServicesTable(EObject element) {
		return ((ReferencesTableSettings) rServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initCreateServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCreateServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		createServices.setContentProvider(contentProvider);
		createServices.setInput(settings);
		createServicesBusinessFilters.clear();
		createServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.createServices);
		if (eefElementEditorReadOnlyState && createServices.getTable().isEnabled()) {
			createServices.setEnabled(false);
			createServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !createServices.getTable().isEnabled()) {
			createServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateCreateServices()
	 * 
	 */
	public void updateCreateServices() {
		createServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterCreateServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToCreateServices(ViewerFilter filter) {
		createServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterCreateServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToCreateServices(ViewerFilter filter) {
		createServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInCreateServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInCreateServicesTable(EObject element) {
		return ((ReferencesTableSettings) createServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initDeleteServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initDeleteServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		deleteServices.setContentProvider(contentProvider);
		deleteServices.setInput(settings);
		deleteServicesBusinessFilters.clear();
		deleteServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.deleteServices);
		if (eefElementEditorReadOnlyState && deleteServices.getTable().isEnabled()) {
			deleteServices.setEnabled(false);
			deleteServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !deleteServices.getTable().isEnabled()) {
			deleteServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateDeleteServices()
	 * 
	 */
	public void updateDeleteServices() {
		deleteServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterDeleteServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToDeleteServices(ViewerFilter filter) {
		deleteServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterDeleteServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToDeleteServices(ViewerFilter filter) {
		deleteServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInDeleteServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInDeleteServicesTable(EObject element) {
		return ((ReferencesTableSettings) deleteServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initInitializeServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInitializeServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		initializeServices.setContentProvider(contentProvider);
		initializeServices.setInput(settings);
		initializeServicesBusinessFilters.clear();
		initializeServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.initializeServices);
		if (eefElementEditorReadOnlyState && initializeServices.getTable().isEnabled()) {
			initializeServices.setEnabled(false);
			initializeServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !initializeServices.getTable().isEnabled()) {
			initializeServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateInitializeServices()
	 * 
	 */
	public void updateInitializeServices() {
		initializeServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterInitializeServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToInitializeServices(ViewerFilter filter) {
		initializeServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterInitializeServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToInitializeServices(ViewerFilter filter) {
		initializeServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInInitializeServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInInitializeServicesTable(EObject element) {
		return ((ReferencesTableSettings) initializeServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initActivateServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initActivateServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		activateServices.setContentProvider(contentProvider);
		activateServices.setInput(settings);
		activateServicesBusinessFilters.clear();
		activateServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.activateServices);
		if (eefElementEditorReadOnlyState && activateServices.getTable().isEnabled()) {
			activateServices.setEnabled(false);
			activateServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !activateServices.getTable().isEnabled()) {
			activateServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateActivateServices()
	 * 
	 */
	public void updateActivateServices() {
		activateServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterActivateServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToActivateServices(ViewerFilter filter) {
		activateServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterActivateServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToActivateServices(ViewerFilter filter) {
		activateServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInActivateServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInActivateServicesTable(EObject element) {
		return ((ReferencesTableSettings) activateServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initResumeServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initResumeServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resumeServices.setContentProvider(contentProvider);
		resumeServices.setInput(settings);
		resumeServicesBusinessFilters.clear();
		resumeServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.resumeServices);
		if (eefElementEditorReadOnlyState && resumeServices.getTable().isEnabled()) {
			resumeServices.setEnabled(false);
			resumeServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !resumeServices.getTable().isEnabled()) {
			resumeServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateResumeServices()
	 * 
	 */
	public void updateResumeServices() {
		resumeServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterResumeServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToResumeServices(ViewerFilter filter) {
		resumeServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterResumeServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToResumeServices(ViewerFilter filter) {
		resumeServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInResumeServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInResumeServicesTable(EObject element) {
		return ((ReferencesTableSettings) resumeServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initSuspendServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSuspendServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		suspendServices.setContentProvider(contentProvider);
		suspendServices.setInput(settings);
		suspendServicesBusinessFilters.clear();
		suspendServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.suspendServices);
		if (eefElementEditorReadOnlyState && suspendServices.getTable().isEnabled()) {
			suspendServices.setEnabled(false);
			suspendServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !suspendServices.getTable().isEnabled()) {
			suspendServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateSuspendServices()
	 * 
	 */
	public void updateSuspendServices() {
		suspendServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterSuspendServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSuspendServices(ViewerFilter filter) {
		suspendServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterSuspendServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSuspendServices(ViewerFilter filter) {
		suspendServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInSuspendServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInSuspendServicesTable(EObject element) {
		return ((ReferencesTableSettings) suspendServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initEnableConcurrencyServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initEnableConcurrencyServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		enableConcurrencyServices.setContentProvider(contentProvider);
		enableConcurrencyServices.setInput(settings);
		enableConcurrencyServicesBusinessFilters.clear();
		enableConcurrencyServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(
				SrmViewsRepository.Other.Properties.enableConcurrencyServices);
		if (eefElementEditorReadOnlyState && enableConcurrencyServices.getTable().isEnabled()) {
			enableConcurrencyServices.setEnabled(false);
			enableConcurrencyServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !enableConcurrencyServices.getTable().isEnabled()) {
			enableConcurrencyServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateEnableConcurrencyServices()
	 * 
	 */
	public void updateEnableConcurrencyServices() {
		enableConcurrencyServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterEnableConcurrencyServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToEnableConcurrencyServices(ViewerFilter filter) {
		enableConcurrencyServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterEnableConcurrencyServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToEnableConcurrencyServices(ViewerFilter filter) {
		enableConcurrencyServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInEnableConcurrencyServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInEnableConcurrencyServicesTable(EObject element) {
		return ((ReferencesTableSettings) enableConcurrencyServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initDisableConcurrencyServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initDisableConcurrencyServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		disableConcurrencyServices.setContentProvider(contentProvider);
		disableConcurrencyServices.setInput(settings);
		disableConcurrencyServicesBusinessFilters.clear();
		disableConcurrencyServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(
				SrmViewsRepository.Other.Properties.disableConcurrencyServices);
		if (eefElementEditorReadOnlyState && disableConcurrencyServices.getTable().isEnabled()) {
			disableConcurrencyServices.setEnabled(false);
			disableConcurrencyServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !disableConcurrencyServices.getTable().isEnabled()) {
			disableConcurrencyServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateDisableConcurrencyServices()
	 * 
	 */
	public void updateDisableConcurrencyServices() {
		disableConcurrencyServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterDisableConcurrencyServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToDisableConcurrencyServices(ViewerFilter filter) {
		disableConcurrencyServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterDisableConcurrencyServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToDisableConcurrencyServices(ViewerFilter filter) {
		disableConcurrencyServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInDisableConcurrencyServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInDisableConcurrencyServicesTable(EObject element) {
		return ((ReferencesTableSettings) disableConcurrencyServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initForkServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initForkServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		forkServices.setContentProvider(contentProvider);
		forkServices.setInput(settings);
		forkServicesBusinessFilters.clear();
		forkServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.forkServices);
		if (eefElementEditorReadOnlyState && forkServices.getTable().isEnabled()) {
			forkServices.setEnabled(false);
			forkServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !forkServices.getTable().isEnabled()) {
			forkServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateForkServices()
	 * 
	 */
	public void updateForkServices() {
		forkServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterForkServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToForkServices(ViewerFilter filter) {
		forkServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterForkServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToForkServices(ViewerFilter filter) {
		forkServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInForkServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInForkServicesTable(EObject element) {
		return ((ReferencesTableSettings) forkServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initExitServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initExitServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		exitServices.setContentProvider(contentProvider);
		exitServices.setInput(settings);
		exitServicesBusinessFilters.clear();
		exitServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.exitServices);
		if (eefElementEditorReadOnlyState && exitServices.getTable().isEnabled()) {
			exitServices.setEnabled(false);
			exitServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !exitServices.getTable().isEnabled()) {
			exitServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateExitServices()
	 * 
	 */
	public void updateExitServices() {
		exitServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterExitServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToExitServices(ViewerFilter filter) {
		exitServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterExitServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToExitServices(ViewerFilter filter) {
		exitServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInExitServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInExitServicesTable(EObject element) {
		return ((ReferencesTableSettings) exitServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initMemorySpaces(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMemorySpaces(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		memorySpaces.setContentProvider(contentProvider);
		memorySpaces.setInput(settings);
		memorySpacesBusinessFilters.clear();
		memorySpacesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.memorySpaces);
		if (eefElementEditorReadOnlyState && memorySpaces.getTable().isEnabled()) {
			memorySpaces.setEnabled(false);
			memorySpaces.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !memorySpaces.getTable().isEnabled()) {
			memorySpaces.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateMemorySpaces()
	 * 
	 */
	public void updateMemorySpaces() {
		memorySpaces.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterMemorySpaces(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToMemorySpaces(ViewerFilter filter) {
		memorySpacesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterMemorySpaces(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToMemorySpaces(ViewerFilter filter) {
		memorySpacesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInMemorySpacesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInMemorySpacesTable(EObject element) {
		return ((ReferencesTableSettings) memorySpaces.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initCloseServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCloseServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		closeServices.setContentProvider(contentProvider);
		closeServices.setInput(settings);
		closeServicesBusinessFilters.clear();
		closeServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.closeServices);
		if (eefElementEditorReadOnlyState && closeServices.getTable().isEnabled()) {
			closeServices.setEnabled(false);
			closeServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !closeServices.getTable().isEnabled()) {
			closeServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateCloseServices()
	 * 
	 */
	public void updateCloseServices() {
		closeServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterCloseServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToCloseServices(ViewerFilter filter) {
		closeServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterCloseServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToCloseServices(ViewerFilter filter) {
		closeServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInCloseServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInCloseServicesTable(EObject element) {
		return ((ReferencesTableSettings) closeServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initOpenServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOpenServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		openServices.setContentProvider(contentProvider);
		openServices.setInput(settings);
		openServicesBusinessFilters.clear();
		openServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.openServices);
		if (eefElementEditorReadOnlyState && openServices.getTable().isEnabled()) {
			openServices.setEnabled(false);
			openServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !openServices.getTable().isEnabled()) {
			openServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateOpenServices()
	 * 
	 */
	public void updateOpenServices() {
		openServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterOpenServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToOpenServices(ViewerFilter filter) {
		openServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterOpenServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToOpenServices(ViewerFilter filter) {
		openServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInOpenServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInOpenServicesTable(EObject element) {
		return ((ReferencesTableSettings) openServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initAcquireServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initAcquireServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		acquireServices.setContentProvider(contentProvider);
		acquireServices.setInput(settings);
		acquireServicesBusinessFilters.clear();
		acquireServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.acquireServices);
		if (eefElementEditorReadOnlyState && acquireServices.getTable().isEnabled()) {
			acquireServices.setEnabled(false);
			acquireServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !acquireServices.getTable().isEnabled()) {
			acquireServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateAcquireServices()
	 * 
	 */
	public void updateAcquireServices() {
		acquireServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterAcquireServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToAcquireServices(ViewerFilter filter) {
		acquireServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterAcquireServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToAcquireServices(ViewerFilter filter) {
		acquireServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInAcquireServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInAcquireServicesTable(EObject element) {
		return ((ReferencesTableSettings) acquireServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initReleaseServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initReleaseServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		releaseServices.setContentProvider(contentProvider);
		releaseServices.setInput(settings);
		releaseServicesBusinessFilters.clear();
		releaseServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.releaseServices);
		if (eefElementEditorReadOnlyState && releaseServices.getTable().isEnabled()) {
			releaseServices.setEnabled(false);
			releaseServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !releaseServices.getTable().isEnabled()) {
			releaseServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateReleaseServices()
	 * 
	 */
	public void updateReleaseServices() {
		releaseServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterReleaseServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToReleaseServices(ViewerFilter filter) {
		releaseServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterReleaseServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToReleaseServices(ViewerFilter filter) {
		releaseServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInReleaseServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInReleaseServicesTable(EObject element) {
		return ((ReferencesTableSettings) releaseServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initControlServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initControlServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		controlServices.setContentProvider(contentProvider);
		controlServices.setInput(settings);
		controlServicesBusinessFilters.clear();
		controlServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.controlServices);
		if (eefElementEditorReadOnlyState && controlServices.getTable().isEnabled()) {
			controlServices.setEnabled(false);
			controlServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !controlServices.getTable().isEnabled()) {
			controlServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateControlServices()
	 * 
	 */
	public void updateControlServices() {
		controlServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterControlServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToControlServices(ViewerFilter filter) {
		controlServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterControlServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToControlServices(ViewerFilter filter) {
		controlServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInControlServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInControlServicesTable(EObject element) {
		return ((ReferencesTableSettings) controlServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initSendServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSendServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		sendServices.setContentProvider(contentProvider);
		sendServices.setInput(settings);
		sendServicesBusinessFilters.clear();
		sendServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.sendServices);
		if (eefElementEditorReadOnlyState && sendServices.getTable().isEnabled()) {
			sendServices.setEnabled(false);
			sendServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sendServices.getTable().isEnabled()) {
			sendServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateSendServices()
	 * 
	 */
	public void updateSendServices() {
		sendServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterSendServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSendServices(ViewerFilter filter) {
		sendServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterSendServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSendServices(ViewerFilter filter) {
		sendServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInSendServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInSendServicesTable(EObject element) {
		return ((ReferencesTableSettings) sendServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initReceiveServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initReceiveServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		receiveServices.setContentProvider(contentProvider);
		receiveServices.setInput(settings);
		receiveServicesBusinessFilters.clear();
		receiveServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.receiveServices);
		if (eefElementEditorReadOnlyState && receiveServices.getTable().isEnabled()) {
			receiveServices.setEnabled(false);
			receiveServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !receiveServices.getTable().isEnabled()) {
			receiveServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateReceiveServices()
	 * 
	 */
	public void updateReceiveServices() {
		receiveServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterReceiveServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToReceiveServices(ViewerFilter filter) {
		receiveServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterReceiveServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToReceiveServices(ViewerFilter filter) {
		receiveServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInReceiveServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInReceiveServicesTable(EObject element) {
		return ((ReferencesTableSettings) receiveServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initReadServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initReadServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		readServices.setContentProvider(contentProvider);
		readServices.setInput(settings);
		readServicesBusinessFilters.clear();
		readServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.readServices);
		if (eefElementEditorReadOnlyState && readServices.getTable().isEnabled()) {
			readServices.setEnabled(false);
			readServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !readServices.getTable().isEnabled()) {
			readServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateReadServices()
	 * 
	 */
	public void updateReadServices() {
		readServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterReadServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToReadServices(ViewerFilter filter) {
		readServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterReadServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToReadServices(ViewerFilter filter) {
		readServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInReadServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInReadServicesTable(EObject element) {
		return ((ReferencesTableSettings) readServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initWriteServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initWriteServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		writeServices.setContentProvider(contentProvider);
		writeServices.setInput(settings);
		writeServicesBusinessFilters.clear();
		writeServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.writeServices);
		if (eefElementEditorReadOnlyState && writeServices.getTable().isEnabled()) {
			writeServices.setEnabled(false);
			writeServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !writeServices.getTable().isEnabled()) {
			writeServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateWriteServices()
	 * 
	 */
	public void updateWriteServices() {
		writeServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterWriteServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToWriteServices(ViewerFilter filter) {
		writeServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterWriteServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToWriteServices(ViewerFilter filter) {
		writeServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInWriteServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInWriteServicesTable(EObject element) {
		return ((ReferencesTableSettings) writeServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initFlushServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initFlushServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		flushServices.setContentProvider(contentProvider);
		flushServices.setInput(settings);
		flushServicesBusinessFilters.clear();
		flushServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.flushServices);
		if (eefElementEditorReadOnlyState && flushServices.getTable().isEnabled()) {
			flushServices.setEnabled(false);
			flushServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !flushServices.getTable().isEnabled()) {
			flushServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateFlushServices()
	 * 
	 */
	public void updateFlushServices() {
		flushServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterFlushServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToFlushServices(ViewerFilter filter) {
		flushServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterFlushServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToFlushServices(ViewerFilter filter) {
		flushServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInFlushServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInFlushServicesTable(EObject element) {
		return ((ReferencesTableSettings) flushServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initSignalServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSignalServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		signalServices.setContentProvider(contentProvider);
		signalServices.setInput(settings);
		signalServicesBusinessFilters.clear();
		signalServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.signalServices);
		if (eefElementEditorReadOnlyState && signalServices.getTable().isEnabled()) {
			signalServices.setEnabled(false);
			signalServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !signalServices.getTable().isEnabled()) {
			signalServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateSignalServices()
	 * 
	 */
	public void updateSignalServices() {
		signalServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterSignalServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToSignalServices(ViewerFilter filter) {
		signalServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterSignalServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToSignalServices(ViewerFilter filter) {
		signalServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInSignalServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInSignalServicesTable(EObject element) {
		return ((ReferencesTableSettings) signalServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initWaitServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initWaitServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		waitServices.setContentProvider(contentProvider);
		waitServices.setInput(settings);
		waitServicesBusinessFilters.clear();
		waitServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.waitServices);
		if (eefElementEditorReadOnlyState && waitServices.getTable().isEnabled()) {
			waitServices.setEnabled(false);
			waitServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !waitServices.getTable().isEnabled()) {
			waitServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateWaitServices()
	 * 
	 */
	public void updateWaitServices() {
		waitServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterWaitServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToWaitServices(ViewerFilter filter) {
		waitServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterWaitServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToWaitServices(ViewerFilter filter) {
		waitServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInWaitServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInWaitServicesTable(EObject element) {
		return ((ReferencesTableSettings) waitServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initClearServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initClearServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		clearServices.setContentProvider(contentProvider);
		clearServices.setInput(settings);
		clearServicesBusinessFilters.clear();
		clearServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.clearServices);
		if (eefElementEditorReadOnlyState && clearServices.getTable().isEnabled()) {
			clearServices.setEnabled(false);
			clearServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !clearServices.getTable().isEnabled()) {
			clearServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateClearServices()
	 * 
	 */
	public void updateClearServices() {
		clearServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterClearServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToClearServices(ViewerFilter filter) {
		clearServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterClearServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToClearServices(ViewerFilter filter) {
		clearServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInClearServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInClearServicesTable(EObject element) {
		return ((ReferencesTableSettings) clearServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initLockServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initLockServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		lockServices.setContentProvider(contentProvider);
		lockServices.setInput(settings);
		lockServicesBusinessFilters.clear();
		lockServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.lockServices);
		if (eefElementEditorReadOnlyState && lockServices.getTable().isEnabled()) {
			lockServices.setEnabled(false);
			lockServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !lockServices.getTable().isEnabled()) {
			lockServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateLockServices()
	 * 
	 */
	public void updateLockServices() {
		lockServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterLockServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToLockServices(ViewerFilter filter) {
		lockServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterLockServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToLockServices(ViewerFilter filter) {
		lockServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInLockServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInLockServicesTable(EObject element) {
		return ((ReferencesTableSettings) lockServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initUnlockServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initUnlockServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		unlockServices.setContentProvider(contentProvider);
		unlockServices.setInput(settings);
		unlockServicesBusinessFilters.clear();
		unlockServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.unlockServices);
		if (eefElementEditorReadOnlyState && unlockServices.getTable().isEnabled()) {
			unlockServices.setEnabled(false);
			unlockServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !unlockServices.getTable().isEnabled()) {
			unlockServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateUnlockServices()
	 * 
	 */
	public void updateUnlockServices() {
		unlockServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterUnlockServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToUnlockServices(ViewerFilter filter) {
		unlockServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterUnlockServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToUnlockServices(ViewerFilter filter) {
		unlockServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInUnlockServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInUnlockServicesTable(EObject element) {
		return ((ReferencesTableSettings) unlockServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initJoinServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initJoinServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		joinServices.setContentProvider(contentProvider);
		joinServices.setInput(settings);
		joinServicesBusinessFilters.clear();
		joinServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.joinServices);
		if (eefElementEditorReadOnlyState && joinServices.getTable().isEnabled()) {
			joinServices.setEnabled(false);
			joinServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !joinServices.getTable().isEnabled()) {
			joinServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateJoinServices()
	 * 
	 */
	public void updateJoinServices() {
		joinServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterJoinServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToJoinServices(ViewerFilter filter) {
		joinServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterJoinServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToJoinServices(ViewerFilter filter) {
		joinServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInJoinServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInJoinServicesTable(EObject element) {
		return ((ReferencesTableSettings) joinServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initYieldServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initYieldServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		yieldServices.setContentProvider(contentProvider);
		yieldServices.setInput(settings);
		yieldServicesBusinessFilters.clear();
		yieldServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.yieldServices);
		if (eefElementEditorReadOnlyState && yieldServices.getTable().isEnabled()) {
			yieldServices.setEnabled(false);
			yieldServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !yieldServices.getTable().isEnabled()) {
			yieldServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateYieldServices()
	 * 
	 */
	public void updateYieldServices() {
		yieldServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterYieldServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToYieldServices(ViewerFilter filter) {
		yieldServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterYieldServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToYieldServices(ViewerFilter filter) {
		yieldServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInYieldServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInYieldServicesTable(EObject element) {
		return ((ReferencesTableSettings) yieldServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initDelayServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initDelayServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		delayServices.setContentProvider(contentProvider);
		delayServices.setInput(settings);
		delayServicesBusinessFilters.clear();
		delayServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.delayServices);
		if (eefElementEditorReadOnlyState && delayServices.getTable().isEnabled()) {
			delayServices.setEnabled(false);
			delayServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !delayServices.getTable().isEnabled()) {
			delayServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateDelayServices()
	 * 
	 */
	public void updateDelayServices() {
		delayServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterDelayServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToDelayServices(ViewerFilter filter) {
		delayServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterDelayServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToDelayServices(ViewerFilter filter) {
		delayServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInDelayServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInDelayServicesTable(EObject element) {
		return ((ReferencesTableSettings) delayServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initMapServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMapServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		mapServices.setContentProvider(contentProvider);
		mapServices.setInput(settings);
		mapServicesBusinessFilters.clear();
		mapServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.mapServices);
		if (eefElementEditorReadOnlyState && mapServices.getTable().isEnabled()) {
			mapServices.setEnabled(false);
			mapServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !mapServices.getTable().isEnabled()) {
			mapServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateMapServices()
	 * 
	 */
	public void updateMapServices() {
		mapServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterMapServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToMapServices(ViewerFilter filter) {
		mapServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterMapServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToMapServices(ViewerFilter filter) {
		mapServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInMapServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInMapServicesTable(EObject element) {
		return ((ReferencesTableSettings) mapServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initUnmapServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initUnmapServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		unmapServices.setContentProvider(contentProvider);
		unmapServices.setInput(settings);
		unmapServicesBusinessFilters.clear();
		unmapServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.unmapServices);
		if (eefElementEditorReadOnlyState && unmapServices.getTable().isEnabled()) {
			unmapServices.setEnabled(false);
			unmapServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !unmapServices.getTable().isEnabled()) {
			unmapServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateUnmapServices()
	 * 
	 */
	public void updateUnmapServices() {
		unmapServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterUnmapServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToUnmapServices(ViewerFilter filter) {
		unmapServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterUnmapServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToUnmapServices(ViewerFilter filter) {
		unmapServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInUnmapServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInUnmapServicesTable(EObject element) {
		return ((ReferencesTableSettings) unmapServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initTerminateServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initTerminateServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		terminateServices.setContentProvider(contentProvider);
		terminateServices.setInput(settings);
		terminateServicesBusinessFilters.clear();
		terminateServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.terminateServices);
		if (eefElementEditorReadOnlyState && terminateServices.getTable().isEnabled()) {
			terminateServices.setEnabled(false);
			terminateServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !terminateServices.getTable().isEnabled()) {
			terminateServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateTerminateServices()
	 * 
	 */
	public void updateTerminateServices() {
		terminateServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterTerminateServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToTerminateServices(ViewerFilter filter) {
		terminateServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterTerminateServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToTerminateServices(ViewerFilter filter) {
		terminateServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInTerminateServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInTerminateServicesTable(EObject element) {
		return ((ReferencesTableSettings) terminateServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initRoutineConnectServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRoutineConnectServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		routineConnectServices.setContentProvider(contentProvider);
		routineConnectServices.setInput(settings);
		routineConnectServicesBusinessFilters.clear();
		routineConnectServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(SrmViewsRepository.Other.Properties.routineConnectServices);
		if (eefElementEditorReadOnlyState && routineConnectServices.getTable().isEnabled()) {
			routineConnectServices.setEnabled(false);
			routineConnectServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !routineConnectServices.getTable().isEnabled()) {
			routineConnectServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateRoutineConnectServices()
	 * 
	 */
	public void updateRoutineConnectServices() {
		routineConnectServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterRoutineConnectServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToRoutineConnectServices(ViewerFilter filter) {
		routineConnectServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterRoutineConnectServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToRoutineConnectServices(ViewerFilter filter) {
		routineConnectServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInRoutineConnectServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInRoutineConnectServicesTable(EObject element) {
		return ((ReferencesTableSettings) routineConnectServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#initRoutineDisconnectServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRoutineDisconnectServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		routineDisconnectServices.setContentProvider(contentProvider);
		routineDisconnectServices.setInput(settings);
		routineDisconnectServicesBusinessFilters.clear();
		routineDisconnectServicesFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(
				SrmViewsRepository.Other.Properties.routineDisconnectServices);
		if (eefElementEditorReadOnlyState && routineDisconnectServices.getTable().isEnabled()) {
			routineDisconnectServices.setEnabled(false);
			routineDisconnectServices.setToolTipText(SrmMessages.Other_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !routineDisconnectServices.getTable().isEnabled()) {
			routineDisconnectServices.setEnabled(true);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#updateRoutineDisconnectServices()
	 * 
	 */
	public void updateRoutineDisconnectServices() {
		routineDisconnectServices.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addFilterRoutineDisconnectServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addFilterToRoutineDisconnectServices(ViewerFilter filter) {
		routineDisconnectServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#addBusinessFilterRoutineDisconnectServices(ViewerFilter
	 *      filter)
	 * 
	 */
	public void addBusinessFilterToRoutineDisconnectServices(ViewerFilter filter) {
		routineDisconnectServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.time4sys.ui.srm.parts.OtherPropertiesEditionPart#isContainedInRoutineDisconnectServicesTable(EObject
	 *      element)
	 * 
	 */
	public boolean isContainedInRoutineDisconnectServicesTable(EObject element) {
		return ((ReferencesTableSettings) routineDisconnectServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SrmMessages.Other_Part_Title;
	}

	// Start of user code additional methods

	// End of user code

}
