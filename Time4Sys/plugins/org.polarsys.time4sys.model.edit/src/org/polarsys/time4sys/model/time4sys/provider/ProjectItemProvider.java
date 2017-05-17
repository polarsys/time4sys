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
package org.polarsys.time4sys.model.time4sys.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.time4sys.analysis.AnalysisFactory;
import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.mapping.MappingFactory;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Time4sysFactory;
import org.polarsys.time4sys.model.time4sys.Time4sysPackage;
import org.polarsys.time4sys.trace.TraceFactory;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.model.time4sys.Project} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectItemProvider 
	extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Project_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Project_name_feature", "_UI_Project_type"),
				 Time4sysPackage.Literals.PROJECT__NAME,
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
			childrenFeatures.add(Time4sysPackage.Literals.PROJECT__ANALYSIS);
			childrenFeatures.add(Time4sysPackage.Literals.PROJECT__DESIGN);
			childrenFeatures.add(Time4sysPackage.Literals.PROJECT__MAPPINGS);
			childrenFeatures.add(Time4sysPackage.Literals.PROJECT__TRACES);
			childrenFeatures.add(Time4sysPackage.Literals.PROJECT__DERIVATIONS);
			childrenFeatures.add(Time4sysPackage.Literals.PROJECT__TRANSFORMATIONS);
			childrenFeatures.add(Time4sysPackage.Literals.PROJECT__SIMULATIONS);
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
	 * This returns Project.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Project"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Project)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Project_type") :
			getString("_UI_Project_type") + " " + label;
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

		switch (notification.getFeatureID(Project.class)) {
			case Time4sysPackage.PROJECT__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Time4sysPackage.PROJECT__ANALYSIS:
			case Time4sysPackage.PROJECT__DESIGN:
			case Time4sysPackage.PROJECT__MAPPINGS:
			case Time4sysPackage.PROJECT__TRACES:
			case Time4sysPackage.PROJECT__DERIVATIONS:
			case Time4sysPackage.PROJECT__TRANSFORMATIONS:
			case Time4sysPackage.PROJECT__SIMULATIONS:
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
				(Time4sysPackage.Literals.PROJECT__ANALYSIS,
				 AnalysisFactory.eINSTANCE.createAnalyzedSystem()));

		newChildDescriptors.add
			(createChildParameter
				(Time4sysPackage.Literals.PROJECT__DESIGN,
				 DesignFactory.eINSTANCE.createDesignModel()));

		newChildDescriptors.add
			(createChildParameter
				(Time4sysPackage.Literals.PROJECT__MAPPINGS,
				 MappingFactory.eINSTANCE.createMapping()));

		newChildDescriptors.add
			(createChildParameter
				(Time4sysPackage.Literals.PROJECT__TRACES,
				 TraceFactory.eINSTANCE.createTrace()));

		newChildDescriptors.add
			(createChildParameter
				(Time4sysPackage.Literals.PROJECT__DERIVATIONS,
				 DesignFactory.eINSTANCE.createDesignModel()));

		newChildDescriptors.add
			(createChildParameter
				(Time4sysPackage.Literals.PROJECT__TRANSFORMATIONS,
				 Time4sysFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(Time4sysPackage.Literals.PROJECT__SIMULATIONS,
				 Time4sysFactory.eINSTANCE.createSimulation()));
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
			childFeature == Time4sysPackage.Literals.PROJECT__DESIGN ||
			childFeature == Time4sysPackage.Literals.PROJECT__DERIVATIONS;

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
		return Time4sysEditPlugin.INSTANCE;
	}

}
