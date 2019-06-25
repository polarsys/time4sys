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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel;
import org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule;
import org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inner Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.InnerTransformationImpl#getRequiredContext <em>Required Context</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.InnerTransformationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.InnerTransformationImpl#getTurnTrue <em>Turn True</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.InnerTransformationImpl#getTurnFalse <em>Turn False</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.InnerTransformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.InnerTransformationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.InnerTransformationImpl#getClassPath <em>Class Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InnerTransformationImpl extends MinimalEObjectImpl.Container implements InnerTransformation {
	/**
	 * The cached value of the '{@link #getRequiredContext() <em>Required Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredContext()
	 * @generated
	 * @ordered
	 */
	protected ContextModel requiredContext;

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
	 * The cached value of the '{@link #getTurnTrue() <em>Turn True</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnTrue()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationRule> turnTrue;

	/**
	 * The cached value of the '{@link #getTurnFalse() <em>Turn False</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnFalse()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationRule> turnFalse;

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
	 * The default value of the '{@link #getClassPath() <em>Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassPath() <em>Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassPath()
	 * @generated
	 * @ordered
	 */
	protected String classPath = CLASS_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InnerTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyscoPackage.Literals.INNER_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel getRequiredContext() {
		if (requiredContext != null && requiredContext.eIsProxy()) {
			InternalEObject oldRequiredContext = (InternalEObject)requiredContext;
			requiredContext = (ContextModel)eResolveProxy(oldRequiredContext);
			if (requiredContext != oldRequiredContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyscoPackage.INNER_TRANSFORMATION__REQUIRED_CONTEXT, oldRequiredContext, requiredContext));
			}
		}
		return requiredContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel basicGetRequiredContext() {
		return requiredContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredContext(ContextModel newRequiredContext) {
		ContextModel oldRequiredContext = requiredContext;
		requiredContext = newRequiredContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.INNER_TRANSFORMATION__REQUIRED_CONTEXT, oldRequiredContext, requiredContext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.INNER_TRANSFORMATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationRule> getTurnTrue() {
		if (turnTrue == null) {
			turnTrue = new EObjectResolvingEList<IdentificationRule>(IdentificationRule.class, this, TyscoPackage.INNER_TRANSFORMATION__TURN_TRUE);
		}
		return turnTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationRule> getTurnFalse() {
		if (turnFalse == null) {
			turnFalse = new EObjectResolvingEList<IdentificationRule>(IdentificationRule.class, this, TyscoPackage.INNER_TRANSFORMATION__TURN_FALSE);
		}
		return turnFalse;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.INNER_TRANSFORMATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.INNER_TRANSFORMATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassPath() {
		return classPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassPath(String newClassPath) {
		String oldClassPath = classPath;
		classPath = newClassPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.INNER_TRANSFORMATION__CLASS_PATH, oldClassPath, classPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyscoPackage.INNER_TRANSFORMATION__REQUIRED_CONTEXT:
				if (resolve) return getRequiredContext();
				return basicGetRequiredContext();
			case TyscoPackage.INNER_TRANSFORMATION__ID:
				return getId();
			case TyscoPackage.INNER_TRANSFORMATION__TURN_TRUE:
				return getTurnTrue();
			case TyscoPackage.INNER_TRANSFORMATION__TURN_FALSE:
				return getTurnFalse();
			case TyscoPackage.INNER_TRANSFORMATION__NAME:
				return getName();
			case TyscoPackage.INNER_TRANSFORMATION__DESCRIPTION:
				return getDescription();
			case TyscoPackage.INNER_TRANSFORMATION__CLASS_PATH:
				return getClassPath();
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
			case TyscoPackage.INNER_TRANSFORMATION__REQUIRED_CONTEXT:
				setRequiredContext((ContextModel)newValue);
				return;
			case TyscoPackage.INNER_TRANSFORMATION__ID:
				setId((Integer)newValue);
				return;
			case TyscoPackage.INNER_TRANSFORMATION__TURN_TRUE:
				getTurnTrue().clear();
				getTurnTrue().addAll((Collection<? extends IdentificationRule>)newValue);
				return;
			case TyscoPackage.INNER_TRANSFORMATION__TURN_FALSE:
				getTurnFalse().clear();
				getTurnFalse().addAll((Collection<? extends IdentificationRule>)newValue);
				return;
			case TyscoPackage.INNER_TRANSFORMATION__NAME:
				setName((String)newValue);
				return;
			case TyscoPackage.INNER_TRANSFORMATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TyscoPackage.INNER_TRANSFORMATION__CLASS_PATH:
				setClassPath((String)newValue);
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
			case TyscoPackage.INNER_TRANSFORMATION__REQUIRED_CONTEXT:
				setRequiredContext((ContextModel)null);
				return;
			case TyscoPackage.INNER_TRANSFORMATION__ID:
				setId(ID_EDEFAULT);
				return;
			case TyscoPackage.INNER_TRANSFORMATION__TURN_TRUE:
				getTurnTrue().clear();
				return;
			case TyscoPackage.INNER_TRANSFORMATION__TURN_FALSE:
				getTurnFalse().clear();
				return;
			case TyscoPackage.INNER_TRANSFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TyscoPackage.INNER_TRANSFORMATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TyscoPackage.INNER_TRANSFORMATION__CLASS_PATH:
				setClassPath(CLASS_PATH_EDEFAULT);
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
			case TyscoPackage.INNER_TRANSFORMATION__REQUIRED_CONTEXT:
				return requiredContext != null;
			case TyscoPackage.INNER_TRANSFORMATION__ID:
				return id != ID_EDEFAULT;
			case TyscoPackage.INNER_TRANSFORMATION__TURN_TRUE:
				return turnTrue != null && !turnTrue.isEmpty();
			case TyscoPackage.INNER_TRANSFORMATION__TURN_FALSE:
				return turnFalse != null && !turnFalse.isEmpty();
			case TyscoPackage.INNER_TRANSFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TyscoPackage.INNER_TRANSFORMATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TyscoPackage.INNER_TRANSFORMATION__CLASS_PATH:
				return CLASS_PATH_EDEFAULT == null ? classPath != null : !CLASS_PATH_EDEFAULT.equals(classPath);
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
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", classPath: ");
		result.append(classPath);
		result.append(')');
		return result.toString();
	}

} //InnerTransformationImpl
