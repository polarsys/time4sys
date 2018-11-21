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
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.InnerTransformationImpl#getContextModel <em>Context Model</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.InnerTransformationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.InnerTransformationImpl#getTurnTrue <em>Turn True</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.InnerTransformationImpl#getTurnFalse <em>Turn False</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InnerTransformationImpl extends MinimalEObjectImpl.Container implements InnerTransformation {
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
	public ContextModel getContextModel() {
		if (contextModel != null && contextModel.eIsProxy()) {
			InternalEObject oldContextModel = (InternalEObject)contextModel;
			contextModel = (ContextModel)eResolveProxy(oldContextModel);
			if (contextModel != oldContextModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyscoPackage.INNER_TRANSFORMATION__CONTEXT_MODEL, oldContextModel, contextModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.INNER_TRANSFORMATION__CONTEXT_MODEL, oldContextModel, contextModel));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyscoPackage.INNER_TRANSFORMATION__CONTEXT_MODEL:
				if (resolve) return getContextModel();
				return basicGetContextModel();
			case TyscoPackage.INNER_TRANSFORMATION__ID:
				return getId();
			case TyscoPackage.INNER_TRANSFORMATION__TURN_TRUE:
				return getTurnTrue();
			case TyscoPackage.INNER_TRANSFORMATION__TURN_FALSE:
				return getTurnFalse();
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
			case TyscoPackage.INNER_TRANSFORMATION__CONTEXT_MODEL:
				setContextModel((ContextModel)newValue);
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
			case TyscoPackage.INNER_TRANSFORMATION__CONTEXT_MODEL:
				setContextModel((ContextModel)null);
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
			case TyscoPackage.INNER_TRANSFORMATION__CONTEXT_MODEL:
				return contextModel != null;
			case TyscoPackage.INNER_TRANSFORMATION__ID:
				return id != ID_EDEFAULT;
			case TyscoPackage.INNER_TRANSFORMATION__TURN_TRUE:
				return turnTrue != null && !turnTrue.isEmpty();
			case TyscoPackage.INNER_TRANSFORMATION__TURN_FALSE:
				return turnFalse != null && !turnFalse.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //InnerTransformationImpl
