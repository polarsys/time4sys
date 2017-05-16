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
package org.polarsys.time4sys.marte.gqam.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.time4sys.marte.gqam.ConnectorKind;
import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;
import org.polarsys.time4sys.marte.gqam.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precedence Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.PrecedenceRelationImpl#getPredec <em>Predec</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.PrecedenceRelationImpl#getSucces <em>Succes</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.PrecedenceRelationImpl#getConnectorKind <em>Connector Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrecedenceRelationImpl extends MinimalEObjectImpl.Container implements PrecedenceRelation {
	/**
	 * The cached value of the '{@link #getPredec() <em>Predec</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredec()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> predec;

	/**
	 * The cached value of the '{@link #getSucces() <em>Succes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucces()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> succes;

	/**
	 * The default value of the '{@link #getConnectorKind() <em>Connector Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorKind()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectorKind CONNECTOR_KIND_EDEFAULT = ConnectorKind.SEQUENCE;

	/**
	 * The cached value of the '{@link #getConnectorKind() <em>Connector Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorKind()
	 * @generated
	 * @ordered
	 */
	protected ConnectorKind connectorKind = CONNECTOR_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecedenceRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.PRECEDENCE_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getPredec() {
		if (predec == null) {
			predec = new EObjectWithInverseResolvingEList<Step>(Step.class, this, GqamPackage.PRECEDENCE_RELATION__PREDEC, GqamPackage.STEP__OUTPUT_REL);
		}
		return predec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getSucces() {
		if (succes == null) {
			succes = new EObjectWithInverseResolvingEList<Step>(Step.class, this, GqamPackage.PRECEDENCE_RELATION__SUCCES, GqamPackage.STEP__INPUT_REL);
		}
		return succes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorKind getConnectorKind() {
		return connectorKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorKind(ConnectorKind newConnectorKind) {
		ConnectorKind oldConnectorKind = connectorKind;
		connectorKind = newConnectorKind == null ? CONNECTOR_KIND_EDEFAULT : newConnectorKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.PRECEDENCE_RELATION__CONNECTOR_KIND, oldConnectorKind, connectorKind));
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
			case GqamPackage.PRECEDENCE_RELATION__PREDEC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPredec()).basicAdd(otherEnd, msgs);
			case GqamPackage.PRECEDENCE_RELATION__SUCCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSucces()).basicAdd(otherEnd, msgs);
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
			case GqamPackage.PRECEDENCE_RELATION__PREDEC:
				return ((InternalEList<?>)getPredec()).basicRemove(otherEnd, msgs);
			case GqamPackage.PRECEDENCE_RELATION__SUCCES:
				return ((InternalEList<?>)getSucces()).basicRemove(otherEnd, msgs);
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
			case GqamPackage.PRECEDENCE_RELATION__PREDEC:
				return getPredec();
			case GqamPackage.PRECEDENCE_RELATION__SUCCES:
				return getSucces();
			case GqamPackage.PRECEDENCE_RELATION__CONNECTOR_KIND:
				return getConnectorKind();
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
			case GqamPackage.PRECEDENCE_RELATION__PREDEC:
				getPredec().clear();
				getPredec().addAll((Collection<? extends Step>)newValue);
				return;
			case GqamPackage.PRECEDENCE_RELATION__SUCCES:
				getSucces().clear();
				getSucces().addAll((Collection<? extends Step>)newValue);
				return;
			case GqamPackage.PRECEDENCE_RELATION__CONNECTOR_KIND:
				setConnectorKind((ConnectorKind)newValue);
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
			case GqamPackage.PRECEDENCE_RELATION__PREDEC:
				getPredec().clear();
				return;
			case GqamPackage.PRECEDENCE_RELATION__SUCCES:
				getSucces().clear();
				return;
			case GqamPackage.PRECEDENCE_RELATION__CONNECTOR_KIND:
				setConnectorKind(CONNECTOR_KIND_EDEFAULT);
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
			case GqamPackage.PRECEDENCE_RELATION__PREDEC:
				return predec != null && !predec.isEmpty();
			case GqamPackage.PRECEDENCE_RELATION__SUCCES:
				return succes != null && !succes.isEmpty();
			case GqamPackage.PRECEDENCE_RELATION__CONNECTOR_KIND:
				return connectorKind != CONNECTOR_KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (connectorKind: ");
		result.append(connectorKind);
		result.append(')');
		return result.toString();
	}

} //PrecedenceRelationImpl
