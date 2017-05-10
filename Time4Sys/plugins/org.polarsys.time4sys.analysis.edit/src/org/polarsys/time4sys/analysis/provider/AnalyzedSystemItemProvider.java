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
import org.polarsys.time4sys.analysis.AnalyzedSystem;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.analysis.AnalyzedSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalyzedSystemItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyzedSystemItemProvider(AdapterFactory adapterFactory) {
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

			addStatusPropertyDescriptor(object);
			addTimeUnitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalyzedSystem_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalyzedSystem_status_feature", "_UI_AnalyzedSystem_type"),
				 AnalysisPackage.Literals.ANALYZED_SYSTEM__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AnalyzedSystem_timeUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AnalyzedSystem_timeUnit_feature", "_UI_AnalyzedSystem_type"),
				 AnalysisPackage.Literals.ANALYZED_SYSTEM__TIME_UNIT,
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
			childrenFeatures.add(AnalysisPackage.Literals.ANALYZED_SYSTEM__SCHEDULABLE_ELEMENTS);
			childrenFeatures.add(AnalysisPackage.Literals.ANALYZED_SYSTEM__SCHEDULERS);
			childrenFeatures.add(AnalysisPackage.Literals.ANALYZED_SYSTEM__RESOURCES);
			childrenFeatures.add(AnalysisPackage.Literals.ANALYZED_SYSTEM__CONSTRAINT_CONTAINER);
			childrenFeatures.add(AnalysisPackage.Literals.ANALYZED_SYSTEM__STIMULI);
			childrenFeatures.add(AnalysisPackage.Literals.ANALYZED_SYSTEM__DELAYS);
			childrenFeatures.add(AnalysisPackage.Literals.ANALYZED_SYSTEM__PROTECTION_PROTOCOLS);
			childrenFeatures.add(AnalysisPackage.Literals.ANALYZED_SYSTEM__MUTEXES);
			childrenFeatures.add(AnalysisPackage.Literals.ANALYZED_SYSTEM__RESULT_CONTAINERS);
			childrenFeatures.add(AnalysisPackage.Literals.ANALYZED_SYSTEM__MAPPINGS);
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
	 * This returns AnalyzedSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AnalyzedSystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AnalyzedSystem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AnalyzedSystem_type") :
			getString("_UI_AnalyzedSystem_type") + " " + label;
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

		switch (notification.getFeatureID(AnalyzedSystem.class)) {
			case AnalysisPackage.ANALYZED_SYSTEM__STATUS:
			case AnalysisPackage.ANALYZED_SYSTEM__TIME_UNIT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AnalysisPackage.ANALYZED_SYSTEM__SCHEDULABLE_ELEMENTS:
			case AnalysisPackage.ANALYZED_SYSTEM__SCHEDULERS:
			case AnalysisPackage.ANALYZED_SYSTEM__RESOURCES:
			case AnalysisPackage.ANALYZED_SYSTEM__CONSTRAINT_CONTAINER:
			case AnalysisPackage.ANALYZED_SYSTEM__STIMULI:
			case AnalysisPackage.ANALYZED_SYSTEM__DELAYS:
			case AnalysisPackage.ANALYZED_SYSTEM__PROTECTION_PROTOCOLS:
			case AnalysisPackage.ANALYZED_SYSTEM__MUTEXES:
			case AnalysisPackage.ANALYZED_SYSTEM__RESULT_CONTAINERS:
			case AnalysisPackage.ANALYZED_SYSTEM__MAPPINGS:
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
				(AnalysisPackage.Literals.ANALYZED_SYSTEM__SCHEDULABLE_ELEMENTS,
				 AnalysisFactory.eINSTANCE.createCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.ANALYZED_SYSTEM__SCHEDULABLE_ELEMENTS,
				 AnalysisFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.ANALYZED_SYSTEM__SCHEDULERS,
				 AnalysisFactory.eINSTANCE.createScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.ANALYZED_SYSTEM__RESOURCES,
				 AnalysisFactory.eINSTANCE.createCommunicationResource()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.ANALYZED_SYSTEM__RESOURCES,
				 AnalysisFactory.eINSTANCE.createComputingResource()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.ANALYZED_SYSTEM__RESOURCES,
				 AnalysisFactory.eINSTANCE.createMemoryResource()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.ANALYZED_SYSTEM__CONSTRAINT_CONTAINER,
				 AnalysisFactory.eINSTANCE.createConstraintContainer()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.ANALYZED_SYSTEM__STIMULI,
				 AnalysisFactory.eINSTANCE.createInputStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.ANALYZED_SYSTEM__STIMULI,
				 AnalysisFactory.eINSTANCE.createOutputStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.ANALYZED_SYSTEM__DELAYS,
				 AnalysisFactory.eINSTANCE.createDelay()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.ANALYZED_SYSTEM__PROTECTION_PROTOCOLS,
				 AnalysisFactory.eINSTANCE.createProtectionProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.ANALYZED_SYSTEM__MUTEXES,
				 AnalysisFactory.eINSTANCE.createMutualExclusionResource()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.ANALYZED_SYSTEM__RESULT_CONTAINERS,
				 AnalysisFactory.eINSTANCE.createResultContainer()));
	}

}
