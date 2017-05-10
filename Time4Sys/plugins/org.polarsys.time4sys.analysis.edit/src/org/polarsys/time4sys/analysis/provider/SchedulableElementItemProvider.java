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
package org.polarsys.time4sys.analysis.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.time4sys.analysis.AnalysisFactory;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.SchedulableElement;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.analysis.SchedulableElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchedulableElementItemProvider extends EventModelContainerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulableElementItemProvider(AdapterFactory adapterFactory) {
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

			addBehaviorKindPropertyDescriptor(object);
			addScheduledByPropertyDescriptor(object);
			addCETPropertyDescriptor(object);
			addOriginalNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Behavior Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBehaviorKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PortContainer_behaviorKind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PortContainer_behaviorKind_feature", "_UI_PortContainer_type"),
				 AnalysisPackage.Literals.PORT_CONTAINER__BEHAVIOR_KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scheduled By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduledByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SchedulableElement_scheduledBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SchedulableElement_scheduledBy_feature", "_UI_SchedulableElement_type"),
				 AnalysisPackage.Literals.SCHEDULABLE_ELEMENT__SCHEDULED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the CET feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCETPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SchedulableElement_CET_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SchedulableElement_CET_feature", "_UI_SchedulableElement_type"),
				 AnalysisPackage.Literals.SCHEDULABLE_ELEMENT__CET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Original Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginalNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SchedulableElement_originalName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SchedulableElement_originalName_feature", "_UI_SchedulableElement_type"),
				 AnalysisPackage.Literals.SCHEDULABLE_ELEMENT__ORIGINAL_NAME,
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
			childrenFeatures.add(AnalysisPackage.Literals.PORT_CONTAINER__PORTS);
			childrenFeatures.add(AnalysisPackage.Literals.SCHEDULABLE_ELEMENT__SCHEDULING_PARAMETERS);
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
		String label = ((SchedulableElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SchedulableElement_type") :
			getString("_UI_SchedulableElement_type") + " " + label;
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

		switch (notification.getFeatureID(SchedulableElement.class)) {
			case AnalysisPackage.SCHEDULABLE_ELEMENT__BEHAVIOR_KIND:
			case AnalysisPackage.SCHEDULABLE_ELEMENT__CET:
			case AnalysisPackage.SCHEDULABLE_ELEMENT__ORIGINAL_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AnalysisPackage.SCHEDULABLE_ELEMENT__PORTS:
			case AnalysisPackage.SCHEDULABLE_ELEMENT__SCHEDULING_PARAMETERS:
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
				(AnalysisPackage.Literals.PORT_CONTAINER__PORTS,
				 AnalysisFactory.eINSTANCE.createInputPort()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.PORT_CONTAINER__PORTS,
				 AnalysisFactory.eINSTANCE.createOutputPort()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.SCHEDULABLE_ELEMENT__SCHEDULING_PARAMETERS,
				 AnalysisFactory.eINSTANCE.createSchedulerParameterValue()));
	}

}
