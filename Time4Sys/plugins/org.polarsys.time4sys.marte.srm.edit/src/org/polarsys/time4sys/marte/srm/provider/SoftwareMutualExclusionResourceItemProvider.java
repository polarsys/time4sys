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
import org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareMutualExclusionResourceItemProvider extends SoftwareSynchronizationResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareMutualExclusionResourceItemProvider(AdapterFactory adapterFactory) {
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

			addSchedulerPropertyDescriptor(object);
			addConcurrentAccessProtocolPropertyDescriptor(object);
			addMechanismPropertyDescriptor(object);
			addAcquireServicesPropertyDescriptor(object);
			addReleaseServicesPropertyDescriptor(object);
			addAccessTokenElementsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Scheduler feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchedulerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MutualExclusionResource_scheduler_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MutualExclusionResource_scheduler_feature", "_UI_MutualExclusionResource_type"),
				 GrmPackage.Literals.MUTUAL_EXCLUSION_RESOURCE__SCHEDULER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Concurrent Access Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConcurrentAccessProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareMutualExclusionResource_concurrentAccessProtocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareMutualExclusionResource_concurrentAccessProtocol_feature", "_UI_SoftwareMutualExclusionResource_type"),
				 SrmPackage.Literals.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__CONCURRENT_ACCESS_PROTOCOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mechanism feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMechanismPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareMutualExclusionResource_mechanism_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareMutualExclusionResource_mechanism_feature", "_UI_SoftwareMutualExclusionResource_type"),
				 SrmPackage.Literals.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__MECHANISM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Acquire Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAcquireServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareMutualExclusionResource_acquireServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareMutualExclusionResource_acquireServices_feature", "_UI_SoftwareMutualExclusionResource_type"),
				 SrmPackage.Literals.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACQUIRE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Release Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReleaseServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareMutualExclusionResource_releaseServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareMutualExclusionResource_releaseServices_feature", "_UI_SoftwareMutualExclusionResource_type"),
				 SrmPackage.Literals.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__RELEASE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Access Token Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessTokenElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareMutualExclusionResource_accessTokenElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareMutualExclusionResource_accessTokenElements_feature", "_UI_SoftwareMutualExclusionResource_type"),
				 SrmPackage.Literals.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__ACCESS_TOKEN_ELEMENTS,
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
			childrenFeatures.add(GrmPackage.Literals.MUTUAL_EXCLUSION_RESOURCE__PROTOCOL);
			childrenFeatures.add(GrmPackage.Literals.MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS);
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
	 * This returns SoftwareMutualExclusionResource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SoftwareMutualExclusionResource"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SoftwareMutualExclusionResource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SoftwareMutualExclusionResource_type") :
			getString("_UI_SoftwareMutualExclusionResource_type") + " " + label;
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

		switch (notification.getFeatureID(SoftwareMutualExclusionResource.class)) {
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__CONCURRENT_ACCESS_PROTOCOL:
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__MECHANISM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTOCOL:
			case SrmPackage.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS:
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
				(GrmPackage.Literals.MUTUAL_EXCLUSION_RESOURCE__PROTOCOL,
				 GrmFactory.eINSTANCE.createMutualExclusionProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.MUTUAL_EXCLUSION_RESOURCE__PROTECT_PARAMS,
				 GrmFactory.eINSTANCE.createProtectionParameter()));
	}

}
