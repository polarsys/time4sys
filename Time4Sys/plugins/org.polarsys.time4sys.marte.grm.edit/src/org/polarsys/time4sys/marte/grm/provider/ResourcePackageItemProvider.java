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
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.ResourcePackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.marte.grm.ResourcePackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourcePackageItemProvider extends org.polarsys.time4sys.marte.nfp.coreelements.provider.PackageItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePackageItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns ResourcePackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResourcePackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ResourcePackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ResourcePackage_type") :
			getString("_UI_ResourcePackage_type") + " " + label;
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
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createClockResource()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createCommunicationMedia()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createComputingResource()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createConcurrencyResource()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createDeviceResource()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createSynchResource()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createMutualExclusionResource()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createResourceBroker()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createResourceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createResourceInterface()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createResourceManager()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createResourcePackage()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createSchedulableResource()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createSecondaryScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createStorageResource()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createTimerResource()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 GrmFactory.eINSTANCE.createUsageTypedAmount()));
	}

}
