/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
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
package org.polarsys.time4sys.marte.gqam.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.WorkloadBehavior;
import org.polarsys.time4sys.marte.nfp.coreelements.provider.NamedElementItemProvider;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.marte.gqam.WorkloadBehavior} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkloadBehaviorItemProvider 
	extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadBehaviorItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(GqamPackage.Literals.WORKLOAD_BEHAVIOR__BEHAVIOR);
			childrenFeatures.add(GqamPackage.Literals.WORKLOAD_BEHAVIOR__DEMAND);
			childrenFeatures.add(GqamPackage.Literals.WORKLOAD_BEHAVIOR__REFERENCES);
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
	 * This returns WorkloadBehavior.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WorkloadBehavior"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_WorkloadBehavior_type");
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

		switch (notification.getFeatureID(WorkloadBehavior.class)) {
			case GqamPackage.WORKLOAD_BEHAVIOR__BEHAVIOR:
			case GqamPackage.WORKLOAD_BEHAVIOR__DEMAND:
			case GqamPackage.WORKLOAD_BEHAVIOR__REFERENCES:
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
				(GqamPackage.Literals.WORKLOAD_BEHAVIOR__BEHAVIOR,
				 GqamFactory.eINSTANCE.createBehaviorScenario()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.WORKLOAD_BEHAVIOR__BEHAVIOR,
				 GqamFactory.eINSTANCE.createStep()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.WORKLOAD_BEHAVIOR__BEHAVIOR,
				 GqamFactory.eINSTANCE.createAcquireStep()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.WORKLOAD_BEHAVIOR__BEHAVIOR,
				 GqamFactory.eINSTANCE.createCommunicationStep()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.WORKLOAD_BEHAVIOR__BEHAVIOR,
				 GqamFactory.eINSTANCE.createDelay()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.WORKLOAD_BEHAVIOR__BEHAVIOR,
				 GqamFactory.eINSTANCE.createExecutionStep()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.WORKLOAD_BEHAVIOR__BEHAVIOR,
				 GqamFactory.eINSTANCE.createReleaseStep()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.WORKLOAD_BEHAVIOR__BEHAVIOR,
				 GqamFactory.eINSTANCE.createRequestedService()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.WORKLOAD_BEHAVIOR__BEHAVIOR,
				 GqamFactory.eINSTANCE.createResourceServiceExcecution()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.WORKLOAD_BEHAVIOR__DEMAND,
				 GqamFactory.eINSTANCE.createWorkloadEvent()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.WORKLOAD_BEHAVIOR__REFERENCES,
				 GqamFactory.eINSTANCE.createReference()));
	}

}
