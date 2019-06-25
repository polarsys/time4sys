/*******************************************************************************
 * Copyright (c) 2018-2019 LIAS and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Yassine OUHAMMOU- initial API and implementation
 *
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TransformationImpl#getContextModel <em>Context Model</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TransformationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TransformationImpl#getTestImplementation <em>Test Implementation</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TransformationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TransformationImpl#getTransfoExecPath <em>Transfo Exec Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationImpl extends MinimalEObjectImpl.Container implements Transformation {
	/**
	 * The cached value of the '{@link #getContextModel() <em>Context Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextModel()
	 * @generated
	 * @ordered
	 */
	protected ContextModel contextModel;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransfoExecPath() <em>Transfo Exec Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfoExecPath()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFO_EXEC_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransfoExecPath() <em>Transfo Exec Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfoExecPath()
	 * @generated
	 * @ordered
	 */
	protected String transfoExecPath = TRANSFO_EXEC_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyscoPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel getContextModel() {
		if (contextModel != null && contextModel.eIsProxy()) {
			InternalEObject oldContextModel = (InternalEObject)contextModel;
			contextModel = (ContextModel)eResolveProxy(oldContextModel);
			if (contextModel != oldContextModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyscoPackage.TRANSFORMATION__CONTEXT_MODEL, oldContextModel, contextModel));
			}
		}
		return contextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel basicGetContextModel() {
		return contextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextModel(ContextModel newContextModel) {
		ContextModel oldContextModel = contextModel;
		contextModel = newContextModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.TRANSFORMATION__CONTEXT_MODEL, oldContextModel, contextModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.TRANSFORMATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestImplementation getTestImplementation() {
		if (eContainerFeatureID() != TyscoPackage.TRANSFORMATION__TEST_IMPLEMENTATION) return null;
		return (TestImplementation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestImplementation(TestImplementation newTestImplementation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTestImplementation, TyscoPackage.TRANSFORMATION__TEST_IMPLEMENTATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestImplementation(TestImplementation newTestImplementation) {
		if (newTestImplementation != eInternalContainer() || (eContainerFeatureID() != TyscoPackage.TRANSFORMATION__TEST_IMPLEMENTATION && newTestImplementation != null)) {
			if (EcoreUtil.isAncestor(this, newTestImplementation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTestImplementation != null)
				msgs = ((InternalEObject)newTestImplementation).eInverseAdd(this, TyscoPackage.TEST_IMPLEMENTATION__TRANSFORMATION, TestImplementation.class, msgs);
			msgs = basicSetTestImplementation(newTestImplementation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.TRANSFORMATION__TEST_IMPLEMENTATION, newTestImplementation, newTestImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.TRANSFORMATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransfoExecPath() {
		return transfoExecPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransfoExecPath(String newTransfoExecPath) {
		String oldTransfoExecPath = transfoExecPath;
		transfoExecPath = newTransfoExecPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.TRANSFORMATION__TRANSFO_EXEC_PATH, oldTransfoExecPath, transfoExecPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyscoPackage.TRANSFORMATION__TEST_IMPLEMENTATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTestImplementation((TestImplementation)otherEnd, msgs);
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
			case TyscoPackage.TRANSFORMATION__TEST_IMPLEMENTATION:
				return basicSetTestImplementation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TyscoPackage.TRANSFORMATION__TEST_IMPLEMENTATION:
				return eInternalContainer().eInverseRemove(this, TyscoPackage.TEST_IMPLEMENTATION__TRANSFORMATION, TestImplementation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyscoPackage.TRANSFORMATION__CONTEXT_MODEL:
				if (resolve) return getContextModel();
				return basicGetContextModel();
			case TyscoPackage.TRANSFORMATION__ID:
				return getId();
			case TyscoPackage.TRANSFORMATION__TEST_IMPLEMENTATION:
				return getTestImplementation();
			case TyscoPackage.TRANSFORMATION__DESCRIPTION:
				return getDescription();
			case TyscoPackage.TRANSFORMATION__TRANSFO_EXEC_PATH:
				return getTransfoExecPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TyscoPackage.TRANSFORMATION__CONTEXT_MODEL:
				setContextModel((ContextModel)newValue);
				return;
			case TyscoPackage.TRANSFORMATION__ID:
				setId((Integer)newValue);
				return;
			case TyscoPackage.TRANSFORMATION__TEST_IMPLEMENTATION:
				setTestImplementation((TestImplementation)newValue);
				return;
			case TyscoPackage.TRANSFORMATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TyscoPackage.TRANSFORMATION__TRANSFO_EXEC_PATH:
				setTransfoExecPath((String)newValue);
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
			case TyscoPackage.TRANSFORMATION__CONTEXT_MODEL:
				setContextModel((ContextModel)null);
				return;
			case TyscoPackage.TRANSFORMATION__ID:
				setId(ID_EDEFAULT);
				return;
			case TyscoPackage.TRANSFORMATION__TEST_IMPLEMENTATION:
				setTestImplementation((TestImplementation)null);
				return;
			case TyscoPackage.TRANSFORMATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TyscoPackage.TRANSFORMATION__TRANSFO_EXEC_PATH:
				setTransfoExecPath(TRANSFO_EXEC_PATH_EDEFAULT);
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
			case TyscoPackage.TRANSFORMATION__CONTEXT_MODEL:
				return contextModel != null;
			case TyscoPackage.TRANSFORMATION__ID:
				return id != ID_EDEFAULT;
			case TyscoPackage.TRANSFORMATION__TEST_IMPLEMENTATION:
				return getTestImplementation() != null;
			case TyscoPackage.TRANSFORMATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TyscoPackage.TRANSFORMATION__TRANSFO_EXEC_PATH:
				return TRANSFO_EXEC_PATH_EDEFAULT == null ? transfoExecPath != null : !TRANSFO_EXEC_PATH_EDEFAULT.equals(transfoExecPath);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(", transfoExecPath: ");
		result.append(transfoExecPath);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
