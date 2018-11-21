/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.gqam.impl;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.time4sys.marte.gqam.ArrivalPattern;
import org.polarsys.time4sys.marte.gqam.FlowInvolvedElement;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.ObjectNode;
import org.polarsys.time4sys.marte.gqam.ObjectNodeOrderingKind;
import org.polarsys.time4sys.marte.gqam.Pin;

import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;
import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.PinImpl#getEAnnotations <em>EAnnotations</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.PinImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.PinImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.PinImpl#getTypename <em>Typename</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.PinImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.PinImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.PinImpl#isIsControl <em>Is Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PinImpl extends MultiplicityElementImpl implements Pin {
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
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectNodeOrderingKind ORDERING_EDEFAULT = ObjectNodeOrderingKind.UNORDERED;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected ObjectNodeOrderingKind ordering = ORDERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypename() <em>Typename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypename()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypename() <em>Typename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypename()
	 * @generated
	 * @ordered
	 */
	protected String typename = TYPENAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkloadEvent> cause;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected ArrivalPattern pattern;

	/**
	 * The default value of the '{@link #isIsControl() <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTROL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsControl() <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControl()
	 * @generated
	 * @ordered
	 */
	protected boolean isControl = IS_CONTROL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAnnotation> getEAnnotations() {
		if (eAnnotations == null) {
			eAnnotations = new EObjectContainmentWithInverseEList<EAnnotation>(EAnnotation.class, this, GqamPackage.PIN__EANNOTATIONS, EcorePackage.EANNOTATION__EMODEL_ELEMENT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.PIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind getOrdering() {
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(ObjectNodeOrderingKind newOrdering) {
		ObjectNodeOrderingKind oldOrdering = ordering;
		ordering = newOrdering == null ? ORDERING_EDEFAULT : newOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.PIN__ORDERING, oldOrdering, ordering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypename() {
		return typename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypename(String newTypename) {
		String oldTypename = typename;
		typename = newTypename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.PIN__TYPENAME, oldTypename, typename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkloadEvent> getCause() {
		if (cause == null) {
			cause = new EObjectWithInverseResolvingEList<WorkloadEvent>(WorkloadEvent.class, this, GqamPackage.PIN__CAUSE, GqamPackage.WORKLOAD_EVENT__EFFECT);
		}
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrivalPattern getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(ArrivalPattern newPattern, NotificationChain msgs) {
		ArrivalPattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GqamPackage.PIN__PATTERN, oldPattern, newPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(ArrivalPattern newPattern) {
		if (newPattern != pattern) {
			NotificationChain msgs = null;
			if (pattern != null)
				msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GqamPackage.PIN__PATTERN, null, msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GqamPackage.PIN__PATTERN, null, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.PIN__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsControl() {
		return isControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControl(boolean newIsControl) {
		boolean oldIsControl = isControl;
		isControl = newIsControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.PIN__IS_CONTROL, oldIsControl, isControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EAnnotation getEAnnotation(final String source) {
		if (source == null) {
			return null;
		}
		for(EAnnotation annot: getEAnnotations()) {
			if (source.equals(annot.getSource())) {
				return annot;
			}
		}
		return null;
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
			case GqamPackage.PIN__EANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEAnnotations()).basicAdd(otherEnd, msgs);
			case GqamPackage.PIN__CAUSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCause()).basicAdd(otherEnd, msgs);
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
			case GqamPackage.PIN__EANNOTATIONS:
				return ((InternalEList<?>)getEAnnotations()).basicRemove(otherEnd, msgs);
			case GqamPackage.PIN__CAUSE:
				return ((InternalEList<?>)getCause()).basicRemove(otherEnd, msgs);
			case GqamPackage.PIN__PATTERN:
				return basicSetPattern(null, msgs);
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
			case GqamPackage.PIN__EANNOTATIONS:
				return getEAnnotations();
			case GqamPackage.PIN__NAME:
				return getName();
			case GqamPackage.PIN__ORDERING:
				return getOrdering();
			case GqamPackage.PIN__TYPENAME:
				return getTypename();
			case GqamPackage.PIN__CAUSE:
				return getCause();
			case GqamPackage.PIN__PATTERN:
				return getPattern();
			case GqamPackage.PIN__IS_CONTROL:
				return isIsControl();
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
			case GqamPackage.PIN__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection<? extends EAnnotation>)newValue);
				return;
			case GqamPackage.PIN__NAME:
				setName((String)newValue);
				return;
			case GqamPackage.PIN__ORDERING:
				setOrdering((ObjectNodeOrderingKind)newValue);
				return;
			case GqamPackage.PIN__TYPENAME:
				setTypename((String)newValue);
				return;
			case GqamPackage.PIN__CAUSE:
				getCause().clear();
				getCause().addAll((Collection<? extends WorkloadEvent>)newValue);
				return;
			case GqamPackage.PIN__PATTERN:
				setPattern((ArrivalPattern)newValue);
				return;
			case GqamPackage.PIN__IS_CONTROL:
				setIsControl((Boolean)newValue);
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
			case GqamPackage.PIN__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case GqamPackage.PIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GqamPackage.PIN__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case GqamPackage.PIN__TYPENAME:
				setTypename(TYPENAME_EDEFAULT);
				return;
			case GqamPackage.PIN__CAUSE:
				getCause().clear();
				return;
			case GqamPackage.PIN__PATTERN:
				setPattern((ArrivalPattern)null);
				return;
			case GqamPackage.PIN__IS_CONTROL:
				setIsControl(IS_CONTROL_EDEFAULT);
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
			case GqamPackage.PIN__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case GqamPackage.PIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GqamPackage.PIN__ORDERING:
				return ordering != ORDERING_EDEFAULT;
			case GqamPackage.PIN__TYPENAME:
				return TYPENAME_EDEFAULT == null ? typename != null : !TYPENAME_EDEFAULT.equals(typename);
			case GqamPackage.PIN__CAUSE:
				return cause != null && !cause.isEmpty();
			case GqamPackage.PIN__PATTERN:
				return pattern != null;
			case GqamPackage.PIN__IS_CONTROL:
				return isControl != IS_CONTROL_EDEFAULT;
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
				case GqamPackage.PIN__EANNOTATIONS: return EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == ENamedElement.class) {
			switch (derivedFeatureID) {
				case GqamPackage.PIN__NAME: return EcorePackage.ENAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ObjectNode.class) {
			switch (derivedFeatureID) {
				case GqamPackage.PIN__ORDERING: return GqamPackage.OBJECT_NODE__ORDERING;
				case GqamPackage.PIN__TYPENAME: return GqamPackage.OBJECT_NODE__TYPENAME;
				default: return -1;
			}
		}
		if (baseClass == FlowInvolvedElement.class) {
			switch (derivedFeatureID) {
				case GqamPackage.PIN__CAUSE: return GqamPackage.FLOW_INVOLVED_ELEMENT__CAUSE;
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
				case EcorePackage.EMODEL_ELEMENT__EANNOTATIONS: return GqamPackage.PIN__EANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == ENamedElement.class) {
			switch (baseFeatureID) {
				case EcorePackage.ENAMED_ELEMENT__NAME: return GqamPackage.PIN__NAME;
				default: return -1;
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ObjectNode.class) {
			switch (baseFeatureID) {
				case GqamPackage.OBJECT_NODE__ORDERING: return GqamPackage.PIN__ORDERING;
				case GqamPackage.OBJECT_NODE__TYPENAME: return GqamPackage.PIN__TYPENAME;
				default: return -1;
			}
		}
		if (baseClass == FlowInvolvedElement.class) {
			switch (baseFeatureID) {
				case GqamPackage.FLOW_INVOLVED_ELEMENT__CAUSE: return GqamPackage.PIN__CAUSE;
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
				case EcorePackage.EMODEL_ELEMENT___GET_EANNOTATION__STRING: return GqamPackage.PIN___GET_EANNOTATION__STRING;
				default: return -1;
			}
		}
		if (baseClass == ENamedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ObjectNode.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == FlowInvolvedElement.class) {
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
			case GqamPackage.PIN___GET_EANNOTATION__STRING:
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
		result.append(", ordering: ");
		result.append(ordering);
		result.append(", typename: ");
		result.append(typename);
		result.append(", isControl: ");
		result.append(isControl);
		result.append(')');
		return result.toString();
	}

} //PinImpl
