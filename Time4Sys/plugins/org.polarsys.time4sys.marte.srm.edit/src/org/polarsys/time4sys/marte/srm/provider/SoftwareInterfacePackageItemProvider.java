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
package org.polarsys.time4sys.marte.srm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.polarsys.time4sys.marte.grm.provider.ResourcePackageItemProvider;
import org.polarsys.time4sys.marte.srm.SoftwareInterfacePackage;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareInterfacePackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareInterfacePackageItemProvider extends ResourcePackageItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareInterfacePackageItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns SoftwareInterfacePackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SoftwareInterfacePackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SoftwareInterfacePackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SoftwareInterfacePackage_type") :
			getString("_UI_SoftwareInterfacePackage_type") + " " + label;
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
				(EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS,
				 EcoreFactory.eINSTANCE.createEAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareResource()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createInterruptResource()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createAlarm()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createDeviceBroker()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createMemoryBroker()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createMemoryPartition()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createMessageComResource()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createNotificationResource()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSharedDataComResource()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareInterface()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareInterfacePackage()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareMutualExclusionResource()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareResourcePackage()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareSchedulableResource()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(org.polarsys.time4sys.marte.nfp.coreelements.CoreElementsPackage.Literals.PACKAGE__OWNED_ELEMENT,
				 SrmFactory.eINSTANCE.createSoftwareTimerResource()));
	}

}
