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
import org.polarsys.time4sys.marte.grm.provider.CommunicationEndPointItemProvider;
import org.polarsys.time4sys.marte.srm.SoftwareInteractionResource;
import org.polarsys.time4sys.marte.srm.SrmFactory;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareInteractionResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareInteractionResourceItemProvider extends CommunicationEndPointItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareInteractionResourceItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addResMultPropertyDescriptor(object);
			addIsProtectedPropertyDescriptor(object);
			addIsActivePropertyDescriptor(object);
			addRServicesPropertyDescriptor(object);
			addUsedByPropertyDescriptor(object);
			addManagedResourcePropertyDescriptor(object);
			addCreateServicesPropertyDescriptor(object);
			addDeleteServicesPropertyDescriptor(object);
			addInitializeServicesPropertyDescriptor(object);
			addMemorySizeFootprintPropertyDescriptor(object);
			addStateElementsPropertyDescriptor(object);
			addIdentifierElementsPropertyDescriptor(object);
			addIsIntraMemoryPartitionInteractionPropertyDescriptor(object);
			addWaitingQueuePolicyPropertyDescriptor(object);
			addWaitingQueueCapacityPropertyDescriptor(object);
			addWaitingPolicyElementsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 GrmPackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Res Mult feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResMultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_resMult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_resMult_feature", "_UI_Resource_type"),
				 GrmPackage.Literals.RESOURCE__RES_MULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Protected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsProtectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_isProtected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_isProtected_feature", "_UI_Resource_type"),
				 GrmPackage.Literals.RESOURCE__IS_PROTECTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_isActive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_isActive_feature", "_UI_Resource_type"),
				 GrmPackage.Literals.RESOURCE__IS_ACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the RServices feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_rServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_rServices_feature", "_UI_Resource_type"),
				 GrmPackage.Literals.RESOURCE__RSERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Used By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Resource_usedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Resource_usedBy_feature", "_UI_Resource_type"),
				 GrmPackage.Literals.RESOURCE__USED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
	 * This adds a property descriptor for the Is Intra Memory Partition Interaction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsIntraMemoryPartitionInteractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareInteractionResource_isIntraMemoryPartitionInteraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareInteractionResource_isIntraMemoryPartitionInteraction_feature", "_UI_SoftwareInteractionResource_type"),
				 SrmPackage.Literals.SOFTWARE_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Waiting Queue Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWaitingQueuePolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareInteractionResource_waitingQueuePolicy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareInteractionResource_waitingQueuePolicy_feature", "_UI_SoftwareInteractionResource_type"),
				 SrmPackage.Literals.SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Waiting Queue Capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWaitingQueueCapacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareInteractionResource_waitingQueueCapacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareInteractionResource_waitingQueueCapacity_feature", "_UI_SoftwareInteractionResource_type"),
				 SrmPackage.Literals.SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Waiting Policy Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWaitingPolicyElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareInteractionResource_waitingPolicyElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareInteractionResource_waitingPolicyElements_feature", "_UI_SoftwareInteractionResource_type"),
				 SrmPackage.Literals.SOFTWARE_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE);
			childrenFeatures.add(GrmPackage.Literals.RESOURCE__PSERVICES);
			childrenFeatures.add(GrmPackage.Literals.RESOURCE__OWNED_PORT);
			childrenFeatures.add(GrmPackage.Literals.RESOURCE__OWNED_CONNECTOR);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SoftwareInteractionResource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SoftwareInteractionResource_type") :
			getString("_UI_SoftwareInteractionResource_type") + " " + label;
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

		switch (notification.getFeatureID(SoftwareInteractionResource.class)) {
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__NAME:
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_MULT:
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_PROTECTED:
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_ACTIVE:
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__MEMORY_SIZE_FOOTPRINT:
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__STATE_ELEMENTS:
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IDENTIFIER_ELEMENTS:
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__IS_INTRA_MEMORY_PARTITION_INTERACTION:
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_POLICY:
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_QUEUE_CAPACITY:
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__WAITING_POLICY_ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_RESOURCE:
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__PSERVICES:
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_PORT:
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__OWNED_CONNECTOR:
			case SrmPackage.SOFTWARE_INTERACTION_RESOURCE__RES_CTRL_POLICY:
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
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 GrmFactory.eINSTANCE.createClockResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 GrmFactory.eINSTANCE.createCommunicationMedia()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 GrmFactory.eINSTANCE.createComputingResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 GrmFactory.eINSTANCE.createConcurrencyResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 GrmFactory.eINSTANCE.createDeviceResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 GrmFactory.eINSTANCE.createSynchResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 GrmFactory.eINSTANCE.createMutualExclusionResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 GrmFactory.eINSTANCE.createResourceBroker()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 GrmFactory.eINSTANCE.createResourceManager()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 GrmFactory.eINSTANCE.createScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 GrmFactory.eINSTANCE.createSchedulableResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 GrmFactory.eINSTANCE.createSecondaryScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 GrmFactory.eINSTANCE.createStorageResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 GrmFactory.eINSTANCE.createTimerResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 GrmFactory.eINSTANCE.createUsageTypedAmount()));

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
				(GrmPackage.Literals.RESOURCE__PSERVICES,
				 GrmFactory.eINSTANCE.createResourceService()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_PORT,
				 SrmFactory.eINSTANCE.createSoftwarePort()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_PORT,
				 GrmFactory.eINSTANCE.createResourcePort()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_CONNECTOR,
				 SrmFactory.eINSTANCE.createSoftwareConnector()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_CONNECTOR,
				 GrmFactory.eINSTANCE.createResourceConnector()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE_MANAGER__RES_CTRL_POLICY,
				 GrmFactory.eINSTANCE.createResourceControlPolicy()));
	}

}
