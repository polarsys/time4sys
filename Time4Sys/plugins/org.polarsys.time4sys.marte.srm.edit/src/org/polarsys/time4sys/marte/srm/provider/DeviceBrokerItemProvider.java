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
package org.polarsys.time4sys.marte.srm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.GrmPackage;

import org.polarsys.time4sys.marte.grm.provider.ResourceBrokerItemProvider;

import org.polarsys.time4sys.marte.srm.DeviceBroker;
import org.polarsys.time4sys.marte.srm.SrmFactory;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.marte.srm.DeviceBroker} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceBrokerItemProvider extends ResourceBrokerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceBrokerItemProvider(AdapterFactory adapterFactory) {
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

			addManagedResourcePropertyDescriptor(object);
			addCreateServicesPropertyDescriptor(object);
			addDeleteServicesPropertyDescriptor(object);
			addInitializeServicesPropertyDescriptor(object);
			addMemorySizeFootprintPropertyDescriptor(object);
			addStateElementsPropertyDescriptor(object);
			addIdentifierElementsPropertyDescriptor(object);
			addDevicesPropertyDescriptor(object);
			addAccessPolicyPropertyDescriptor(object);
			addIsBufferedPropertyDescriptor(object);
			addCloseServicesPropertyDescriptor(object);
			addOpenServicesPropertyDescriptor(object);
			addControlServicesPropertyDescriptor(object);
			addReadServicesPropertyDescriptor(object);
			addWriteServicesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Managed Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManagedResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceManager_managedResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceManager_managedResource_feature", "_UI_ResourceManager_type"),
				 GrmPackage.Literals.RESOURCE_MANAGER__MANAGED_RESOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Create Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareResource_createServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareResource_createServices_feature", "_UI_SoftwareResource_type"),
				 SrmPackage.Literals.SOFTWARE_RESOURCE__CREATE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delete Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeleteServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareResource_deleteServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareResource_deleteServices_feature", "_UI_SoftwareResource_type"),
				 SrmPackage.Literals.SOFTWARE_RESOURCE__DELETE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initialize Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitializeServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareResource_initializeServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareResource_initializeServices_feature", "_UI_SoftwareResource_type"),
				 SrmPackage.Literals.SOFTWARE_RESOURCE__INITIALIZE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory Size Footprint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemorySizeFootprintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareResource_memorySizeFootprint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareResource_memorySizeFootprint_feature", "_UI_SoftwareResource_type"),
				 SrmPackage.Literals.SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStateElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareResource_stateElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareResource_stateElements_feature", "_UI_SoftwareResource_type"),
				 SrmPackage.Literals.SOFTWARE_RESOURCE__STATE_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Identifier Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentifierElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareResource_identifierElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareResource_identifierElements_feature", "_UI_SoftwareResource_type"),
				 SrmPackage.Literals.SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Devices feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDevicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_devices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_devices_feature", "_UI_DeviceBroker_type"),
				 SrmPackage.Literals.DEVICE_BROKER__DEVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Access Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessPolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_accessPolicy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_accessPolicy_feature", "_UI_DeviceBroker_type"),
				 SrmPackage.Literals.DEVICE_BROKER__ACCESS_POLICY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Buffered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsBufferedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_isBuffered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_isBuffered_feature", "_UI_DeviceBroker_type"),
				 SrmPackage.Literals.DEVICE_BROKER__IS_BUFFERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Close Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCloseServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_closeServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_closeServices_feature", "_UI_DeviceBroker_type"),
				 SrmPackage.Literals.DEVICE_BROKER__CLOSE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Open Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpenServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_openServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_openServices_feature", "_UI_DeviceBroker_type"),
				 SrmPackage.Literals.DEVICE_BROKER__OPEN_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Control Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_controlServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_controlServices_feature", "_UI_DeviceBroker_type"),
				 SrmPackage.Literals.DEVICE_BROKER__CONTROL_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Read Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_readServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_readServices_feature", "_UI_DeviceBroker_type"),
				 SrmPackage.Literals.DEVICE_BROKER__READ_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Write Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWriteServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceBroker_writeServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceBroker_writeServices_feature", "_UI_DeviceBroker_type"),
				 SrmPackage.Literals.DEVICE_BROKER__WRITE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GrmPackage.Literals.RESOURCE_MANAGER__RES_CTRL_POLICY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DeviceBroker.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DeviceBroker"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DeviceBroker)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DeviceBroker_type") :
			getString("_UI_DeviceBroker_type") + " " + label;
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

		switch (notification.getFeatureID(DeviceBroker.class)) {
			case SrmPackage.DEVICE_BROKER__MEMORY_SIZE_FOOTPRINT:
			case SrmPackage.DEVICE_BROKER__STATE_ELEMENTS:
			case SrmPackage.DEVICE_BROKER__IDENTIFIER_ELEMENTS:
			case SrmPackage.DEVICE_BROKER__ACCESS_POLICY:
			case SrmPackage.DEVICE_BROKER__IS_BUFFERED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SrmPackage.DEVICE_BROKER__RES_CTRL_POLICY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
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
				(GrmPackage.Literals.RESOURCE__PSERVICES,
				 SrmFactory.eINSTANCE.createSoftwareAccessService()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__PSERVICES,
				 SrmFactory.eINSTANCE.createSoftwareService()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_PORT,
				 SrmFactory.eINSTANCE.createSoftwarePort()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_CONNECTOR,
				 SrmFactory.eINSTANCE.createSoftwareConnector()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE_MANAGER__RES_CTRL_POLICY,
				 GrmFactory.eINSTANCE.createResourceControlPolicy()));
	}

}
