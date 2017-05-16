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
import org.eclipse.emf.ecore.EcoreFactory;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.time4sys.analysis.AnalysisFactory;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.ConstraintContainer;
import org.polarsys.time4sys.marte.nfp.NfpFactory;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.analysis.ConstraintContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintContainerItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintContainerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS);
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
	 * This returns ConstraintContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConstraintContainer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConstraintContainer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ConstraintContainer_type") :
			getString("_UI_ConstraintContainer_type") + " " + label;
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

		switch (notification.getFeatureID(ConstraintContainer.class)) {
			case AnalysisPackage.CONSTRAINT_CONTAINER__CONSTRAINTS:
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
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createAnalyzedSystem()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createCommunicationResource()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createComputingResource()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createConstraintContainer()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createDelay()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createEventModel()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createFragment()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createInputPort()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createInputStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createMemoryResource()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createMutualExclusionResource()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createOffset()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createOutputPort()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createOutputStimulus()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createProtectionParameterValue()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createProtectionProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createRequiredProtectionParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createRequiredSchedulingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createResourceSchedulingParameterValue()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createResultContainer()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createSchedulerParameterValue()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createResourceProtectionParameterValue()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 AnalysisFactory.eINSTANCE.createTwcaEventModel()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 NfpFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 NfpFactory.eINSTANCE.createTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 EcoreFactory.eINSTANCE.createEEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 EcoreFactory.eINSTANCE.createEFactory()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 EcoreFactory.eINSTANCE.createEOperation()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 EcoreFactory.eINSTANCE.createEPackage()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 EcoreFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 EcoreFactory.eINSTANCE.createEReference()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 EcoreFactory.eINSTANCE.createEGenericType()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 EcoreFactory.eINSTANCE.createETypeParameter()));
	}

}
