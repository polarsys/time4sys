/**
 */
package org.polarsys.time4sys.marte.nfp.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.time4sys.marte.nfp.CyclicDuration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.NfpPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.marte.nfp.CyclicDuration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CyclicDurationItemProvider extends DurationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyclicDurationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(NfpPackage.Literals.CYCLIC_DURATION__DURATIONS);
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
	 * This returns CyclicDuration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CyclicDuration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		CyclicDuration cyclicDuration = (CyclicDuration)object;
		return getString("_UI_CyclicDuration_type") + " " + cyclicDuration.getValue();
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

		switch (notification.getFeatureID(CyclicDuration.class)) {
			case NfpPackage.CYCLIC_DURATION__DURATIONS:
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
				(NfpPackage.Literals.CYCLIC_DURATION__DURATIONS,
				 NfpFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(NfpPackage.Literals.CYCLIC_DURATION__DURATIONS,
				 NfpFactory.eINSTANCE.createProbabilisticDuration()));

		newChildDescriptors.add
			(createChildParameter
				(NfpPackage.Literals.CYCLIC_DURATION__DURATIONS,
				 NfpFactory.eINSTANCE.createCompositeDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(NfpPackage.Literals.CYCLIC_DURATION__DURATIONS,
				 NfpFactory.eINSTANCE.createDiscreteDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(NfpPackage.Literals.CYCLIC_DURATION__DURATIONS,
				 NfpFactory.eINSTANCE.createGeneralizedExtremeValueDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(NfpPackage.Literals.CYCLIC_DURATION__DURATIONS,
				 NfpFactory.eINSTANCE.createNormalDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(NfpPackage.Literals.CYCLIC_DURATION__DURATIONS,
				 NfpFactory.eINSTANCE.createUniformDistribution()));

		newChildDescriptors.add
			(createChildParameter
				(NfpPackage.Literals.CYCLIC_DURATION__DURATIONS,
				 NfpFactory.eINSTANCE.createCyclicDuration()));
	}

}
