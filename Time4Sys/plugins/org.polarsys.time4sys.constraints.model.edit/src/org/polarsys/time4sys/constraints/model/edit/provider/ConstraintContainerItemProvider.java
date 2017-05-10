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
package org.polarsys.time4sys.constraints.model.edit.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer;
import org.polarsys.time4sys.constraints.model.constraints.ConstraintsFactory;
import org.polarsys.time4sys.constraints.model.constraints.ConstraintsPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.constraints.model.constraints.ConstraintContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintContainerItemProvider extends org.polarsys.time4sys.analysis.provider.ConstraintContainerItemProvider {
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
			childrenFeatures.add(ConstraintsPackage.Literals.CONSTRAINT_CONTAINER__TWCA_CONSTRAINTS);
			childrenFeatures.add(ConstraintsPackage.Literals.CONSTRAINT_CONTAINER__LATENCY_CONSTRAINTS);
			childrenFeatures.add(ConstraintsPackage.Literals.CONSTRAINT_CONTAINER__JITTER_CONSTRAINTS);
			childrenFeatures.add(ConstraintsPackage.Literals.CONSTRAINT_CONTAINER__LOAD_CONSTRAINTS);
			childrenFeatures.add(ConstraintsPackage.Literals.CONSTRAINT_CONTAINER__ANALYSIS_PARAMETERS);
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
			case ConstraintsPackage.CONSTRAINT_CONTAINER__TWCA_CONSTRAINTS:
			case ConstraintsPackage.CONSTRAINT_CONTAINER__LATENCY_CONSTRAINTS:
			case ConstraintsPackage.CONSTRAINT_CONTAINER__JITTER_CONSTRAINTS:
			case ConstraintsPackage.CONSTRAINT_CONTAINER__LOAD_CONSTRAINTS:
			case ConstraintsPackage.CONSTRAINT_CONTAINER__ANALYSIS_PARAMETERS:
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
				 ConstraintsFactory.eINSTANCE.createTwcaConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 ConstraintsFactory.eINSTANCE.createLatencyConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 ConstraintsFactory.eINSTANCE.createJitterConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 ConstraintsFactory.eINSTANCE.createLoadConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 ConstraintsFactory.eINSTANCE.createConstraintContainer()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS,
				 ConstraintsFactory.eINSTANCE.createAnalysisParameter()));

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

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.CONSTRAINT_CONTAINER__TWCA_CONSTRAINTS,
				 ConstraintsFactory.eINSTANCE.createTwcaConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.CONSTRAINT_CONTAINER__LATENCY_CONSTRAINTS,
				 ConstraintsFactory.eINSTANCE.createLatencyConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.CONSTRAINT_CONTAINER__JITTER_CONSTRAINTS,
				 ConstraintsFactory.eINSTANCE.createJitterConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.CONSTRAINT_CONTAINER__LOAD_CONSTRAINTS,
				 ConstraintsFactory.eINSTANCE.createLoadConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.CONSTRAINT_CONTAINER__ANALYSIS_PARAMETERS,
				 ConstraintsFactory.eINSTANCE.createAnalysisParameter()));
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
			childFeature == AnalysisPackage.Literals.CONSTRAINT_CONTAINER__CONSTRAINTS ||
			childFeature == ConstraintsPackage.Literals.CONSTRAINT_CONTAINER__TWCA_CONSTRAINTS ||
			childFeature == ConstraintsPackage.Literals.CONSTRAINT_CONTAINER__LATENCY_CONSTRAINTS ||
			childFeature == ConstraintsPackage.Literals.CONSTRAINT_CONTAINER__JITTER_CONSTRAINTS ||
			childFeature == ConstraintsPackage.Literals.CONSTRAINT_CONTAINER__LOAD_CONSTRAINTS ||
			childFeature == ConstraintsPackage.Literals.CONSTRAINT_CONTAINER__ANALYSIS_PARAMETERS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ConstraintsEditPlugin.INSTANCE;
	}

}
