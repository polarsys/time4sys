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
package org.polarsys.time4sys.analysis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.analysis.AnalysisPackage;
import org.polarsys.time4sys.analysis.Communication;
import org.polarsys.time4sys.analysis.CommunicationResource;
import org.polarsys.time4sys.analysis.ComputingResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.CommunicationResourceImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.CommunicationResourceImpl#getCommunicationsAffectedOn <em>Communications Affected On</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.CommunicationResourceImpl#getProtocolName <em>Protocol Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.impl.CommunicationResourceImpl#getBandwidth <em>Bandwidth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationResourceImpl extends ResourceImpl implements CommunicationResource {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputingResource> links;

	/**
	 * The cached value of the '{@link #getCommunicationsAffectedOn() <em>Communications Affected On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationsAffectedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Communication> communicationsAffectedOn;

	/**
	 * The default value of the '{@link #getProtocolName() <em>Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolName() <em>Protocol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolName()
	 * @generated
	 * @ordered
	 */
	protected String protocolName = PROTOCOL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBandwidth() <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected static final double BANDWIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBandwidth() <em>Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected double bandwidth = BANDWIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.COMMUNICATION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComputingResource> getLinks() {
		if (links == null) {
			links = new EObjectWithInverseResolvingEList.ManyInverse<ComputingResource>(ComputingResource.class, this, AnalysisPackage.COMMUNICATION_RESOURCE__LINKS, AnalysisPackage.COMPUTING_RESOURCE__LINKED_BY);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Communication> getCommunicationsAffectedOn() {
		if (communicationsAffectedOn == null) {
			communicationsAffectedOn = new EObjectWithInverseResolvingEList<Communication>(Communication.class, this, AnalysisPackage.COMMUNICATION_RESOURCE__COMMUNICATIONS_AFFECTED_ON, AnalysisPackage.COMMUNICATION__BUS);
		}
		return communicationsAffectedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocolName() {
		return protocolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolName(String newProtocolName) {
		String oldProtocolName = protocolName;
		protocolName = newProtocolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.COMMUNICATION_RESOURCE__PROTOCOL_NAME, oldProtocolName, protocolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBandwidth() {
		return bandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandwidth(double newBandwidth) {
		double oldBandwidth = bandwidth;
		bandwidth = newBandwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.COMMUNICATION_RESOURCE__BANDWIDTH, oldBandwidth, bandwidth));
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
			case AnalysisPackage.COMMUNICATION_RESOURCE__LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinks()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.COMMUNICATION_RESOURCE__COMMUNICATIONS_AFFECTED_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommunicationsAffectedOn()).basicAdd(otherEnd, msgs);
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
			case AnalysisPackage.COMMUNICATION_RESOURCE__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.COMMUNICATION_RESOURCE__COMMUNICATIONS_AFFECTED_ON:
				return ((InternalEList<?>)getCommunicationsAffectedOn()).basicRemove(otherEnd, msgs);
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
			case AnalysisPackage.COMMUNICATION_RESOURCE__LINKS:
				return getLinks();
			case AnalysisPackage.COMMUNICATION_RESOURCE__COMMUNICATIONS_AFFECTED_ON:
				return getCommunicationsAffectedOn();
			case AnalysisPackage.COMMUNICATION_RESOURCE__PROTOCOL_NAME:
				return getProtocolName();
			case AnalysisPackage.COMMUNICATION_RESOURCE__BANDWIDTH:
				return getBandwidth();
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
			case AnalysisPackage.COMMUNICATION_RESOURCE__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends ComputingResource>)newValue);
				return;
			case AnalysisPackage.COMMUNICATION_RESOURCE__COMMUNICATIONS_AFFECTED_ON:
				getCommunicationsAffectedOn().clear();
				getCommunicationsAffectedOn().addAll((Collection<? extends Communication>)newValue);
				return;
			case AnalysisPackage.COMMUNICATION_RESOURCE__PROTOCOL_NAME:
				setProtocolName((String)newValue);
				return;
			case AnalysisPackage.COMMUNICATION_RESOURCE__BANDWIDTH:
				setBandwidth((Double)newValue);
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
			case AnalysisPackage.COMMUNICATION_RESOURCE__LINKS:
				getLinks().clear();
				return;
			case AnalysisPackage.COMMUNICATION_RESOURCE__COMMUNICATIONS_AFFECTED_ON:
				getCommunicationsAffectedOn().clear();
				return;
			case AnalysisPackage.COMMUNICATION_RESOURCE__PROTOCOL_NAME:
				setProtocolName(PROTOCOL_NAME_EDEFAULT);
				return;
			case AnalysisPackage.COMMUNICATION_RESOURCE__BANDWIDTH:
				setBandwidth(BANDWIDTH_EDEFAULT);
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
			case AnalysisPackage.COMMUNICATION_RESOURCE__LINKS:
				return links != null && !links.isEmpty();
			case AnalysisPackage.COMMUNICATION_RESOURCE__COMMUNICATIONS_AFFECTED_ON:
				return communicationsAffectedOn != null && !communicationsAffectedOn.isEmpty();
			case AnalysisPackage.COMMUNICATION_RESOURCE__PROTOCOL_NAME:
				return PROTOCOL_NAME_EDEFAULT == null ? protocolName != null : !PROTOCOL_NAME_EDEFAULT.equals(protocolName);
			case AnalysisPackage.COMMUNICATION_RESOURCE__BANDWIDTH:
				return bandwidth != BANDWIDTH_EDEFAULT;
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
		result.append(" (protocolName: ");
		result.append(protocolName);
		result.append(", bandwidth: ");
		result.append(bandwidth);
		result.append(')');
		return result.toString();
	}

} //CommunicationResourceImpl
