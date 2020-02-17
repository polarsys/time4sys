/**
 */
package org.polarsys.time4sys.results.results.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.time4sys.design.DesignModel;

import org.polarsys.time4sys.marte.nfp.coreelements.impl.ModelElementImpl;

import org.polarsys.time4sys.results.results.AbstractResultSet;
import org.polarsys.time4sys.results.results.ResultSetContainer;
import org.polarsys.time4sys.results.results.ResultsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Set Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.ResultSetContainerImpl#getResultSet <em>Result Set</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.ResultSetContainerImpl#getDesignModel <em>Design Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultSetContainerImpl extends ModelElementImpl implements ResultSetContainer {
	/**
	 * The cached value of the '{@link #getResultSet() <em>Result Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultSet()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractResultSet> resultSet;

	/**
	 * The cached value of the '{@link #getDesignModel() <em>Design Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignModel()
	 * @generated
	 * @ordered
	 */
	protected DesignModel designModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultSetContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.RESULT_SET_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractResultSet> getResultSet() {
		if (resultSet == null) {
			resultSet = new EObjectContainmentEList<AbstractResultSet>(AbstractResultSet.class, this, ResultsPackage.RESULT_SET_CONTAINER__RESULT_SET);
		}
		return resultSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignModel getDesignModel() {
		if (designModel != null && designModel.eIsProxy()) {
			InternalEObject oldDesignModel = (InternalEObject)designModel;
			designModel = (DesignModel)eResolveProxy(oldDesignModel);
			if (designModel != oldDesignModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultsPackage.RESULT_SET_CONTAINER__DESIGN_MODEL, oldDesignModel, designModel));
			}
		}
		return designModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignModel basicGetDesignModel() {
		return designModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignModel(DesignModel newDesignModel) {
		DesignModel oldDesignModel = designModel;
		designModel = newDesignModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.RESULT_SET_CONTAINER__DESIGN_MODEL, oldDesignModel, designModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultsPackage.RESULT_SET_CONTAINER__RESULT_SET:
				return ((InternalEList<?>)getResultSet()).basicRemove(otherEnd, msgs);
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
			case ResultsPackage.RESULT_SET_CONTAINER__RESULT_SET:
				return getResultSet();
			case ResultsPackage.RESULT_SET_CONTAINER__DESIGN_MODEL:
				if (resolve) return getDesignModel();
				return basicGetDesignModel();
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
			case ResultsPackage.RESULT_SET_CONTAINER__RESULT_SET:
				getResultSet().clear();
				getResultSet().addAll((Collection<? extends AbstractResultSet>)newValue);
				return;
			case ResultsPackage.RESULT_SET_CONTAINER__DESIGN_MODEL:
				setDesignModel((DesignModel)newValue);
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
			case ResultsPackage.RESULT_SET_CONTAINER__RESULT_SET:
				getResultSet().clear();
				return;
			case ResultsPackage.RESULT_SET_CONTAINER__DESIGN_MODEL:
				setDesignModel((DesignModel)null);
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
			case ResultsPackage.RESULT_SET_CONTAINER__RESULT_SET:
				return resultSet != null && !resultSet.isEmpty();
			case ResultsPackage.RESULT_SET_CONTAINER__DESIGN_MODEL:
				return designModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ResultSetContainerImpl
