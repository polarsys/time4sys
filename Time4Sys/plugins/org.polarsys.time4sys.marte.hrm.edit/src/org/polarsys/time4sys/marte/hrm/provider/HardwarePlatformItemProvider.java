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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.time4sys.marte.hrm.HardwarePlatform;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.hrm.HrmPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.marte.hrm.HardwarePlatform} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwarePlatformItemProvider extends HardwareResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePlatformItemProvider(AdapterFactory adapterFactory) {
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

			addDimensionPropertyDescriptor(object);
			addAreaPropertyDescriptor(object);
			addPosXPropertyDescriptor(object);
			addPosYPropertyDescriptor(object);
			addGridPropertyDescriptor(object);
			addNbPinsPropertyDescriptor(object);
			addWeightPropertyDescriptor(object);
			addPricePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dimension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDimensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareComponent_dimension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareComponent_dimension_feature", "_UI_HardwareComponent_type"),
				 HrmPackage.Literals.HARDWARE_COMPONENT__DIMENSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAreaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareComponent_area_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareComponent_area_feature", "_UI_HardwareComponent_type"),
				 HrmPackage.Literals.HARDWARE_COMPONENT__AREA,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareComponent_posX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareComponent_posX_feature", "_UI_HardwareComponent_type"),
				 HrmPackage.Literals.HARDWARE_COMPONENT__POS_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareComponent_posY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareComponent_posY_feature", "_UI_HardwareComponent_type"),
				 HrmPackage.Literals.HARDWARE_COMPONENT__POS_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGridPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareComponent_grid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareComponent_grid_feature", "_UI_HardwareComponent_type"),
				 HrmPackage.Literals.HARDWARE_COMPONENT__GRID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nb Pins feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNbPinsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareComponent_nbPins_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareComponent_nbPins_feature", "_UI_HardwareComponent_type"),
				 HrmPackage.Literals.HARDWARE_COMPONENT__NB_PINS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareComponent_weight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareComponent_weight_feature", "_UI_HardwareComponent_type"),
				 HrmPackage.Literals.HARDWARE_COMPONENT__WEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Price feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPricePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HardwareComponent_price_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HardwareComponent_price_feature", "_UI_HardwareComponent_type"),
				 HrmPackage.Literals.HARDWARE_COMPONENT__PRICE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(HrmPackage.Literals.HARDWARE_COMPONENT__RCONDITIONS);
			childrenFeatures.add(HrmPackage.Literals.HARDWARE_COMPONENT__OWNED_PIN);
			childrenFeatures.add(HrmPackage.Literals.HARDWARE_COMPONENT__OWNED_WIRE);
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
	 * This returns HardwarePlatform.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HardwarePlatform"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HardwarePlatform)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HardwarePlatform_type") :
			getString("_UI_HardwarePlatform_type") + " " + label;
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

		switch (notification.getFeatureID(HardwarePlatform.class)) {
			case HrmPackage.HARDWARE_PLATFORM__DIMENSION:
			case HrmPackage.HARDWARE_PLATFORM__AREA:
			case HrmPackage.HARDWARE_PLATFORM__POS_X:
			case HrmPackage.HARDWARE_PLATFORM__POS_Y:
			case HrmPackage.HARDWARE_PLATFORM__GRID:
			case HrmPackage.HARDWARE_PLATFORM__NB_PINS:
			case HrmPackage.HARDWARE_PLATFORM__WEIGHT:
			case HrmPackage.HARDWARE_PLATFORM__PRICE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HrmPackage.HARDWARE_PLATFORM__RCONDITIONS:
			case HrmPackage.HARDWARE_PLATFORM__OWNED_PIN:
			case HrmPackage.HARDWARE_PLATFORM__OWNED_WIRE:
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
				(HrmPackage.Literals.HARDWARE_COMPONENT__RCONDITIONS,
				 HrmFactory.eINSTANCE.createEnvCondition()));

		newChildDescriptors.add
			(createChildParameter
				(HrmPackage.Literals.HARDWARE_COMPONENT__OWNED_PIN,
				 HrmFactory.eINSTANCE.createHardwarePin()));

		newChildDescriptors.add
			(createChildParameter
				(HrmPackage.Literals.HARDWARE_COMPONENT__OWNED_WIRE,
				 HrmFactory.eINSTANCE.createHardwareWire()));
	}

}
