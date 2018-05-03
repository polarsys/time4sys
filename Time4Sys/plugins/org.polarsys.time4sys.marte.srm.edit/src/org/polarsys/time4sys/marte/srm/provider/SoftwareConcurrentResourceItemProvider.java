/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareConcurrentResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareConcurrentResourceItemProvider extends SoftwareResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareConcurrentResourceItemProvider(AdapterFactory adapterFactory) {
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

			addActivateServicesPropertyDescriptor(object);
			addResumeServicesPropertyDescriptor(object);
			addSuspendServicesPropertyDescriptor(object);
			addEnableConcurrencyServicesPropertyDescriptor(object);
			addDisableConcurrencyServicesPropertyDescriptor(object);
			addTerminateServicesPropertyDescriptor(object);
			addPeriodElementsPropertyDescriptor(object);
			addActivationCapacityPropertyDescriptor(object);
			addPriorityElementsPropertyDescriptor(object);
			addStackSizeElementsPropertyDescriptor(object);
			addHeapSizeElementsPropertyDescriptor(object);
			addSharedDataResourcesPropertyDescriptor(object);
			addMessageResourcesPropertyDescriptor(object);
			addMutualExclusionResourcesPropertyDescriptor(object);
			addNotificationResourcesPropertyDescriptor(object);
			addEntryPointsPropertyDescriptor(object);
			addArrivalPatternPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Activate Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivateServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_activateServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_activateServices_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resume Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResumeServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_resumeServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_resumeServices_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__RESUME_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Suspend Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuspendServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_suspendServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_suspendServices_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__SUSPEND_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Concurrency Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableConcurrencyServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_enableConcurrencyServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_enableConcurrencyServices_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disable Concurrency Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisableConcurrencyServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_disableConcurrencyServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_disableConcurrencyServices_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Terminate Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTerminateServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_terminateServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_terminateServices_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__TERMINATE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Period Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeriodElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_periodElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_periodElements_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__PERIOD_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activation Capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivationCapacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_activationCapacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_activationCapacity_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_priorityElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_priorityElements_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stack Size Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStackSizeElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_stackSizeElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_stackSizeElements_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heap Size Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeapSizeElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_heapSizeElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_heapSizeElements_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shared Data Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSharedDataResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_sharedDataResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_sharedDataResources_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__SHARED_DATA_RESOURCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_messageResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_messageResources_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__MESSAGE_RESOURCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mutual Exclusion Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMutualExclusionResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_mutualExclusionResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_mutualExclusionResources_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notification Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotificationResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_notificationResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_notificationResources_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Entry Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntryPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_entryPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_entryPoints_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__ENTRY_POINTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Arrival Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArrivalPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_arrivalPattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_arrivalPattern_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__ARRIVAL_PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
		String label = ((SoftwareConcurrentResource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SoftwareConcurrentResource_type") :
			getString("_UI_SoftwareConcurrentResource_type") + " " + label;
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

		switch (notification.getFeatureID(SoftwareConcurrentResource.class)) {
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__PERIOD_ELEMENTS:
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY:
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS:
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS:
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS:
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ENTRY_POINTS:
			case SrmPackage.SOFTWARE_CONCURRENT_RESOURCE__ARRIVAL_PATTERN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == GrmPackage.Literals.RESOURCE__OWNED_RESOURCE ||
			childFeature == GrmPackage.Literals.RESOURCE__OWNED_PORT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
