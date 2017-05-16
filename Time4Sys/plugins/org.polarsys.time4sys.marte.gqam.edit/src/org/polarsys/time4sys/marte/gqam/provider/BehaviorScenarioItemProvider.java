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
package org.polarsys.time4sys.marte.gqam.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.GqamPackage;

import org.polarsys.time4sys.marte.grm.provider.NamedElementItemProvider;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.marte.gqam.BehaviorScenario} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorScenarioItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorScenarioItemProvider(AdapterFactory adapterFactory) {
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

			addCausePropertyDescriptor(object);
			addRootPropertyDescriptor(object);
			addParentStepPropertyDescriptor(object);
			addRespTimePropertyDescriptor(object);
			addBestCETPropertyDescriptor(object);
			addWorstCETPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cause feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCausePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehaviorScenario_cause_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehaviorScenario_cause_feature", "_UI_BehaviorScenario_type"),
				 GqamPackage.Literals.BEHAVIOR_SCENARIO__CAUSE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Root feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehaviorScenario_root_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehaviorScenario_root_feature", "_UI_BehaviorScenario_type"),
				 GqamPackage.Literals.BEHAVIOR_SCENARIO__ROOT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Step feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentStepPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehaviorScenario_parentStep_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehaviorScenario_parentStep_feature", "_UI_BehaviorScenario_type"),
				 GqamPackage.Literals.BEHAVIOR_SCENARIO__PARENT_STEP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resp Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRespTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehaviorScenario_respTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehaviorScenario_respTime_feature", "_UI_BehaviorScenario_type"),
				 GqamPackage.Literals.BEHAVIOR_SCENARIO__RESP_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Best CET feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBestCETPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehaviorScenario_bestCET_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehaviorScenario_bestCET_feature", "_UI_BehaviorScenario_type"),
				 GqamPackage.Literals.BEHAVIOR_SCENARIO__BEST_CET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Worst CET feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorstCETPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehaviorScenario_worstCET_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehaviorScenario_worstCET_feature", "_UI_BehaviorScenario_type"),
				 GqamPackage.Literals.BEHAVIOR_SCENARIO__WORST_CET,
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
			childrenFeatures.add(GqamPackage.Literals.BEHAVIOR_SCENARIO__STEPS);
			childrenFeatures.add(GqamPackage.Literals.BEHAVIOR_SCENARIO__CONNECTORS);
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
	 * This returns BehaviorScenario.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BehaviorScenario"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BehaviorScenario)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BehaviorScenario_type") :
			getString("_UI_BehaviorScenario_type") + " " + label;
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

		switch (notification.getFeatureID(BehaviorScenario.class)) {
			case GqamPackage.BEHAVIOR_SCENARIO__RESP_TIME:
			case GqamPackage.BEHAVIOR_SCENARIO__BEST_CET:
			case GqamPackage.BEHAVIOR_SCENARIO__WORST_CET:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GqamPackage.BEHAVIOR_SCENARIO__STEPS:
			case GqamPackage.BEHAVIOR_SCENARIO__CONNECTORS:
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
				(GqamPackage.Literals.BEHAVIOR_SCENARIO__STEPS,
				 GqamFactory.eINSTANCE.createStep()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.BEHAVIOR_SCENARIO__STEPS,
				 GqamFactory.eINSTANCE.createAcquireStep()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.BEHAVIOR_SCENARIO__STEPS,
				 GqamFactory.eINSTANCE.createCommunicationStep()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.BEHAVIOR_SCENARIO__STEPS,
				 GqamFactory.eINSTANCE.createExecutionStep()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.BEHAVIOR_SCENARIO__STEPS,
				 GqamFactory.eINSTANCE.createReleaseStep()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.BEHAVIOR_SCENARIO__STEPS,
				 GqamFactory.eINSTANCE.createRequestedService()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.BEHAVIOR_SCENARIO__STEPS,
				 GqamFactory.eINSTANCE.createDelay()));

		newChildDescriptors.add
			(createChildParameter
				(GqamPackage.Literals.BEHAVIOR_SCENARIO__CONNECTORS,
				 GqamFactory.eINSTANCE.createPrecedenceRelation()));
	}

}
