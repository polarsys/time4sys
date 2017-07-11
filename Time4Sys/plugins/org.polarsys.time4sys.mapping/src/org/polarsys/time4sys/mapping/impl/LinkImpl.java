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
package org.polarsys.time4sys.mapping.impl;

import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.mapping.Context;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.MappableArtefact;
import org.polarsys.time4sys.mapping.MappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.mapping.impl.LinkImpl#getSubLinks <em>Sub Links</em>}</li>
 *   <li>{@link org.polarsys.time4sys.mapping.impl.LinkImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.polarsys.time4sys.mapping.impl.LinkImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.polarsys.time4sys.mapping.impl.LinkImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link {
	/**
	 * The cached value of the '{@link #getSubLinks() <em>Sub Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> subLinks;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected Context rationale;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<MappableArtefact> sources;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<MappableArtefact> targets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getSubLinks() {
		if (subLinks == null) {
			subLinks = new EObjectContainmentEList<Link>(Link.class, this, MappingPackage.LINK__SUB_LINKS);
		}
		return subLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getRationale() {
		if (rationale != null && rationale.eIsProxy()) {
			InternalEObject oldRationale = (InternalEObject)rationale;
			rationale = (Context)eResolveProxy(oldRationale);
			if (rationale != oldRationale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.LINK__RATIONALE, oldRationale, rationale));
			}
		}
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationale(Context newRationale) {
		Context oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.LINK__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappableArtefact> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<MappableArtefact>(MappableArtefact.class, this, MappingPackage.LINK__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappableArtefact> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<MappableArtefact>(MappableArtefact.class, this, MappingPackage.LINK__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject getUniqueSourceValue(final String role) {
		if (role == null) {
			throw new IllegalArgumentException("role must not be null");
		}
		for(MappableArtefact artefact: getSources()) {
			if (role.equals(artefact.getName())) {
				return artefact.getValue();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject getUniqueTargetValue(String role) {
		if (role == null) {
			throw new IllegalArgumentException("role must not be null");
		}
		for(MappableArtefact artefact: getTargets()) {
			if (role.equals(artefact.getName())) {
				return artefact.getValue();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EObject> getSources(final String role) {
		if (role == null) {
			throw new IllegalArgumentException("role must not be null");
		}
		final BasicEList<EObject> result = new BasicEList<>();
		for(MappableArtefact artefact: getSources()) {
			if (role.equals(artefact.getName())) {
				result.add(artefact.getValue());
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EObject> getTargets(String role) {
		if (role == null) {
			throw new IllegalArgumentException("role must not be null");
		}
		final BasicEList<EObject> result = new BasicEList<>();
		for(MappableArtefact artefact: getTargets()) {
			if (role.equals(artefact.getName())) {
				result.add(artefact.getValue());
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.LINK__SUB_LINKS:
				return ((InternalEList<?>)getSubLinks()).basicRemove(otherEnd, msgs);
			case MappingPackage.LINK__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case MappingPackage.LINK__TARGETS:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
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
			case MappingPackage.LINK__SUB_LINKS:
				return getSubLinks();
			case MappingPackage.LINK__RATIONALE:
				if (resolve) return getRationale();
				return basicGetRationale();
			case MappingPackage.LINK__SOURCES:
				return getSources();
			case MappingPackage.LINK__TARGETS:
				return getTargets();
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
			case MappingPackage.LINK__SUB_LINKS:
				getSubLinks().clear();
				getSubLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case MappingPackage.LINK__RATIONALE:
				setRationale((Context)newValue);
				return;
			case MappingPackage.LINK__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends MappableArtefact>)newValue);
				return;
			case MappingPackage.LINK__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends MappableArtefact>)newValue);
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
			case MappingPackage.LINK__SUB_LINKS:
				getSubLinks().clear();
				return;
			case MappingPackage.LINK__RATIONALE:
				setRationale((Context)null);
				return;
			case MappingPackage.LINK__SOURCES:
				getSources().clear();
				return;
			case MappingPackage.LINK__TARGETS:
				getTargets().clear();
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
			case MappingPackage.LINK__SUB_LINKS:
				return subLinks != null && !subLinks.isEmpty();
			case MappingPackage.LINK__RATIONALE:
				return rationale != null;
			case MappingPackage.LINK__SOURCES:
				return sources != null && !sources.isEmpty();
			case MappingPackage.LINK__TARGETS:
				return targets != null && !targets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MappingPackage.LINK___GET_UNIQUE_SOURCE_VALUE__STRING:
				return getUniqueSourceValue((String)arguments.get(0));
			case MappingPackage.LINK___GET_UNIQUE_TARGET_VALUE__STRING:
				return getUniqueTargetValue((String)arguments.get(0));
			case MappingPackage.LINK___GET_SOURCES__STRING:
				return getSources((String)arguments.get(0));
			case MappingPackage.LINK___GET_TARGETS__STRING:
				return getTargets((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	
	@Override
	public String toString() {
		StringWriter w = new StringWriter();
		w.write("(");
		w.write("sources[");
		for(MappableArtefact s: getSources()) {
			w.write(s.getName());
			w.write(": ");
			w.write(s.getValue().toString());
		}
		w.write("]");
		w.write(", targets[");
		for(MappableArtefact s: getTargets()) {
			w.write(s.getName());
			w.write(": ");
			w.write(s.getValue().toString());
		}
		w.write("]");
		w.write(")");
		return w.toString();
	}
} //LinkImpl
