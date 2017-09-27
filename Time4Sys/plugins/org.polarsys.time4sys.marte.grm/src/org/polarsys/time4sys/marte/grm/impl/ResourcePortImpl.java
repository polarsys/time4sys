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
package org.polarsys.time4sys.marte.grm.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.ResourceInterface;
import org.polarsys.time4sys.marte.grm.ResourcePort;
import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourcePortImpl#getEAnnotations <em>EAnnotations</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourcePortImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourcePortImpl#getPInterface <em>PInterface</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.impl.ResourcePortImpl#getRInterface <em>RInterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourcePortImpl extends CommunicationEndPointImpl implements ResourcePort {
	/**
	 * The cached value of the '{@link #getEAnnotations() <em>EAnnotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<EAnnotation> eAnnotations;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPInterface() <em>PInterface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceInterface> pInterface;

	/**
	 * The cached value of the '{@link #getRInterface() <em>RInterface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceInterface> rInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrmPackage.Literals.RESOURCE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAnnotation> getEAnnotations() {
		if (eAnnotations == null) {
			eAnnotations = new EObjectContainmentWithInverseEList<EAnnotation>(EAnnotation.class, this, GrmPackage.RESOURCE_PORT__EANNOTATIONS, EcorePackage.EANNOTATION__EMODEL_ELEMENT);
		}
		return eAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrmPackage.RESOURCE_PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInterface> getPInterface() {
		if (pInterface == null) {
			pInterface = new EObjectResolvingEList<ResourceInterface>(ResourceInterface.class, this, GrmPackage.RESOURCE_PORT__PINTERFACE);
		}
		return pInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceInterface> getRInterface() {
		if (rInterface == null) {
			rInterface = new EObjectResolvingEList<ResourceInterface>(ResourceInterface.class, this, GrmPackage.RESOURCE_PORT__RINTERFACE);
		}
		return rInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getEAnnotation(String source) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrmPackage.RESOURCE_PORT__EANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEAnnotations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrmPackage.RESOURCE_PORT__EANNOTATIONS:
				return ((InternalEList<?>)getEAnnotations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrmPackage.RESOURCE_PORT__EANNOTATIONS:
				return getEAnnotations();
			case GrmPackage.RESOURCE_PORT__NAME:
				return getName();
			case GrmPackage.RESOURCE_PORT__PINTERFACE:
				return getPInterface();
			case GrmPackage.RESOURCE_PORT__RINTERFACE:
				return getRInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GrmPackage.RESOURCE_PORT__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection<? extends EAnnotation>)newValue);
				return;
			case GrmPackage.RESOURCE_PORT__NAME:
				setName((String)newValue);
				return;
			case GrmPackage.RESOURCE_PORT__PINTERFACE:
				getPInterface().clear();
				getPInterface().addAll((Collection<? extends ResourceInterface>)newValue);
				return;
			case GrmPackage.RESOURCE_PORT__RINTERFACE:
				getRInterface().clear();
				getRInterface().addAll((Collection<? extends ResourceInterface>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GrmPackage.RESOURCE_PORT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case GrmPackage.RESOURCE_PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GrmPackage.RESOURCE_PORT__PINTERFACE:
				getPInterface().clear();
				return;
			case GrmPackage.RESOURCE_PORT__RINTERFACE:
				getRInterface().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GrmPackage.RESOURCE_PORT__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case GrmPackage.RESOURCE_PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GrmPackage.RESOURCE_PORT__PINTERFACE:
				return pInterface != null && !pInterface.isEmpty();
			case GrmPackage.RESOURCE_PORT__RINTERFACE:
				return rInterface != null && !rInterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EModelElement.class) {
			switch (derivedFeatureID) {
				case GrmPackage.RESOURCE_PORT__EANNOTATIONS: return EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == ENamedElement.class) {
			switch (derivedFeatureID) {
				case GrmPackage.RESOURCE_PORT__NAME: return EcorePackage.ENAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == org.polarsys.time4sys.marte.nfp.coreelements.ModelElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EModelElement.class) {
			switch (baseFeatureID) {
				case EcorePackage.EMODEL_ELEMENT__EANNOTATIONS: return GrmPackage.RESOURCE_PORT__EANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == ENamedElement.class) {
			switch (baseFeatureID) {
				case EcorePackage.ENAMED_ELEMENT__NAME: return GrmPackage.RESOURCE_PORT__NAME;
				default: return -1;
			}
		}
		if (baseClass == org.polarsys.time4sys.marte.nfp.coreelements.ModelElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == EModelElement.class) {
			switch (baseOperationID) {
				case EcorePackage.EMODEL_ELEMENT___GET_EANNOTATION__STRING: return GrmPackage.RESOURCE_PORT___GET_EANNOTATION__STRING;
				default: return -1;
			}
		}
		if (baseClass == ENamedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == org.polarsys.time4sys.marte.nfp.coreelements.ModelElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GrmPackage.RESOURCE_PORT___GET_EANNOTATION__STRING:
				return getEAnnotation((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ResourcePortImpl
