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
package org.polarsys.time4sys.marte.grm.provider;


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
import org.polarsys.time4sys.marte.grm.Resource;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.marte.grm.Resource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceItemProvider extends ResourcePackageableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceItemProvider(AdapterFactory adapterFactory) {
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

			addResMultPropertyDescriptor(object);
			addIsProtectedPropertyDescriptor(object);
			addIsActivePropertyDescriptor(object);
			addRServicesPropertyDescriptor(object);
			addUsedByPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(GrmPackage.Literals.RESOURCE__OWNED_PORT);
			childrenFeatures.add(GrmPackage.Literals.RESOURCE__OWNED_CONNECTOR);
			childrenFeatures.add(GrmPackage.Literals.RESOURCE__PSERVICES);
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
		String label = ((Resource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Resource_type") :
			getString("_UI_Resource_type") + " " + label;
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

		switch (notification.getFeatureID(Resource.class)) {
			case GrmPackage.RESOURCE__RES_MULT:
			case GrmPackage.RESOURCE__IS_PROTECTED:
			case GrmPackage.RESOURCE__IS_ACTIVE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GrmPackage.RESOURCE__OWNED_RESOURCE:
			case GrmPackage.RESOURCE__OWNED_PORT:
			case GrmPackage.RESOURCE__OWNED_CONNECTOR:
			case GrmPackage.RESOURCE__PSERVICES:
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
				(GrmPackage.Literals.RESOURCE__OWNED_PORT,
				 GrmFactory.eINSTANCE.createResourcePort()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_CONNECTOR,
				 GrmFactory.eINSTANCE.createResourceConnector()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__PSERVICES,
				 GrmFactory.eINSTANCE.createResourceService()));
	}

}
