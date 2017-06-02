/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.hrm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.polarsys.time4sys.marte.grm.GrmPackage;

import org.polarsys.time4sys.marte.grm.provider.ResourceItemProvider;

import org.polarsys.time4sys.marte.hrm.HardwareResource;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.hrm.HrmPackage;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.marte.hrm.HardwareResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareResourceItemProvider extends ResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareResourceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addClockPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Clock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareResource_clock_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareResource_clock_feature", "_UI_HardwareResource_type"),
				 HrmPackage.Literals.HARDWARE_RESOURCE__CLOCK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HardwareResource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HardwareResource_type") :
			getString("_UI_HardwareResource_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createFirmwareArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareDevice()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareIo()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareActuator()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareCommunicationResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareArbiter()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareComputingResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareAsic()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareBranchPredictor()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareMedia()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareBridge()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareBus()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareMemory()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareCache()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareTimingResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareClock()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareStorageManager()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareDma()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareDrive()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareIpBlock()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareIsa()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareMmu()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwarePlatform()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwarePld()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareRam()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareRom()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareSensor()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareSupport()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareTimer()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 HrmFactory.eINSTANCE.createHardwareWatchdog()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createSoftwareResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createInterruptResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createAlarm()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createDeviceBroker()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createMemoryBroker()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createMemoryPartition()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createMessageComResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createNotificationResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createSharedDataComResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createSoftwareArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createSoftwareMutualExclusionResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createSoftwareSchedulableResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createSoftwareScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createSoftwareTimerResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_PORT,
				 HrmFactory.eINSTANCE.createHardwarePort()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_PORT,
				 SrmFactory.eINSTANCE.createSoftwarePort()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_CONNECTOR,
				 HrmFactory.eINSTANCE.createHardwareConnector()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_CONNECTOR,
				 SrmFactory.eINSTANCE.createSoftwareConnector()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__PSERVICES,
				 HrmFactory.eINSTANCE.createHardwareService()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__PSERVICES,
				 SrmFactory.eINSTANCE.createSoftwareAccessService()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__PSERVICES,
				 SrmFactory.eINSTANCE.createSoftwareService()));
	}

}
