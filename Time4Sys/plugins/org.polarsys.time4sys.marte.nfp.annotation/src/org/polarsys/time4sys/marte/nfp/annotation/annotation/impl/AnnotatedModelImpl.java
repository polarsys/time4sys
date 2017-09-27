/**
 */
package org.polarsys.time4sys.marte.nfp.annotation.annotation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.ModelingConcern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotated Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotatedModelImpl#getOwns <em>Owns</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotatedModelImpl#getAnnotationConcern <em>Annotation Concern</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.annotation.annotation.impl.AnnotatedModelImpl#getOwnedRule <em>Owned Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnnotatedModelImpl extends MinimalEObjectImpl.Container implements AnnotatedModel {
	/**
	 * The cached value of the '{@link #getOwns() <em>Owns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwns()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotatedElement> owns;

	/**
	 * The cached value of the '{@link #getAnnotationConcern() <em>Annotation Concern</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationConcern()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelingConcern> annotationConcern;

	/**
	 * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotatedModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationPackage.Literals.ANNOTATED_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotatedElement> getOwns() {
		if (owns == null) {
			owns = new EObjectContainmentWithInverseEList<AnnotatedElement>(AnnotatedElement.class, this, AnnotationPackage.ANNOTATED_MODEL__OWNS, AnnotationPackage.ANNOTATED_ELEMENT__OWNER);
		}
		return owns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelingConcern> getAnnotationConcern() {
		if (annotationConcern == null) {
			annotationConcern = new EObjectResolvingEList<ModelingConcern>(ModelingConcern.class, this, AnnotationPackage.ANNOTATED_MODEL__ANNOTATION_CONCERN);
		}
		return annotationConcern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getOwnedRule() {
		if (ownedRule == null) {
			ownedRule = new EObjectContainmentEList<Constraint>(Constraint.class, this, AnnotationPackage.ANNOTATED_MODEL__OWNED_RULE);
		}
		return ownedRule;
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
			case AnnotationPackage.ANNOTATED_MODEL__OWNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwns()).basicAdd(otherEnd, msgs);
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
			case AnnotationPackage.ANNOTATED_MODEL__OWNS:
				return ((InternalEList<?>)getOwns()).basicRemove(otherEnd, msgs);
			case AnnotationPackage.ANNOTATED_MODEL__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
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
			case AnnotationPackage.ANNOTATED_MODEL__OWNS:
				return getOwns();
			case AnnotationPackage.ANNOTATED_MODEL__ANNOTATION_CONCERN:
				return getAnnotationConcern();
			case AnnotationPackage.ANNOTATED_MODEL__OWNED_RULE:
				return getOwnedRule();
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
			case AnnotationPackage.ANNOTATED_MODEL__OWNS:
				getOwns().clear();
				getOwns().addAll((Collection<? extends AnnotatedElement>)newValue);
				return;
			case AnnotationPackage.ANNOTATED_MODEL__ANNOTATION_CONCERN:
				getAnnotationConcern().clear();
				getAnnotationConcern().addAll((Collection<? extends ModelingConcern>)newValue);
				return;
			case AnnotationPackage.ANNOTATED_MODEL__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
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
			case AnnotationPackage.ANNOTATED_MODEL__OWNS:
				getOwns().clear();
				return;
			case AnnotationPackage.ANNOTATED_MODEL__ANNOTATION_CONCERN:
				getAnnotationConcern().clear();
				return;
			case AnnotationPackage.ANNOTATED_MODEL__OWNED_RULE:
				getOwnedRule().clear();
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
			case AnnotationPackage.ANNOTATED_MODEL__OWNS:
				return owns != null && !owns.isEmpty();
			case AnnotationPackage.ANNOTATED_MODEL__ANNOTATION_CONCERN:
				return annotationConcern != null && !annotationConcern.isEmpty();
			case AnnotationPackage.ANNOTATED_MODEL__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnnotatedModelImpl
