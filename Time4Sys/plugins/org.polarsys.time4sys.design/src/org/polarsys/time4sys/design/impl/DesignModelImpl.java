/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.design.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.design.DesignPackage;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.WorkloadBehavior;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.ResourcePackage;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedModel;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotationPackage;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.Constraint;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.ModelingConcern;
import org.polarsys.time4sys.marte.nfp.coreelements.impl.PackageImpl;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.design.impl.DesignModelImpl#getOwns <em>Owns</em>}</li>
 *   <li>{@link org.polarsys.time4sys.design.impl.DesignModelImpl#getAnnotationConcern <em>Annotation Concern</em>}</li>
 *   <li>{@link org.polarsys.time4sys.design.impl.DesignModelImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link org.polarsys.time4sys.design.impl.DesignModelImpl#getWorkloadBehavior <em>Workload Behavior</em>}</li>
 *   <li>{@link org.polarsys.time4sys.design.impl.DesignModelImpl#getResourcePackage <em>Resource Package</em>}</li>
 *   <li>{@link org.polarsys.time4sys.design.impl.DesignModelImpl#getEndToEndFlows <em>End To End Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignModelImpl extends PackageImpl implements DesignModel {
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
	 * The cached value of the '{@link #getWorkloadBehavior() <em>Workload Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkloadBehavior()
	 * @generated
	 * @ordered
	 */
	protected WorkloadBehavior workloadBehavior;

	/**
	 * The cached value of the '{@link #getResourcePackage() <em>Resource Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcePackage()
	 * @generated
	 * @ordered
	 */
	protected ResourcePackage resourcePackage;

	/**
	 * The cached value of the '{@link #getEndToEndFlows() <em>End To End Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndToEndFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<EndToEndFlow> endToEndFlows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DesignModelImpl() {
		super();
		setResourcePackage(GrmFactory.eINSTANCE.createResourcePackage());
		setWorkloadBehavior(GqamFactory.eINSTANCE.createWorkloadBehavior());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DesignPackage.Literals.DESIGN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotatedElement> getOwns() {
		if (owns == null) {
			owns = new EObjectContainmentWithInverseEList<AnnotatedElement>(AnnotatedElement.class, this, DesignPackage.DESIGN_MODEL__OWNS, AnnotationPackage.ANNOTATED_ELEMENT__OWNER);
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
			annotationConcern = new EObjectResolvingEList<ModelingConcern>(ModelingConcern.class, this, DesignPackage.DESIGN_MODEL__ANNOTATION_CONCERN);
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
			ownedRule = new EObjectContainmentEList<Constraint>(Constraint.class, this, DesignPackage.DESIGN_MODEL__OWNED_RULE);
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkloadBehavior getWorkloadBehavior() {
		return workloadBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkloadBehavior(WorkloadBehavior newWorkloadBehavior, NotificationChain msgs) {
		WorkloadBehavior oldWorkloadBehavior = workloadBehavior;
		workloadBehavior = newWorkloadBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR, oldWorkloadBehavior, newWorkloadBehavior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkloadBehavior(WorkloadBehavior newWorkloadBehavior) {
		if (newWorkloadBehavior != workloadBehavior) {
			NotificationChain msgs = null;
			if (workloadBehavior != null)
				msgs = ((InternalEObject)workloadBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR, null, msgs);
			if (newWorkloadBehavior != null)
				msgs = ((InternalEObject)newWorkloadBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR, null, msgs);
			msgs = basicSetWorkloadBehavior(newWorkloadBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR, newWorkloadBehavior, newWorkloadBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePackage getResourcePackage() {
		return resourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourcePackage(ResourcePackage newResourcePackage, NotificationChain msgs) {
		ResourcePackage oldResourcePackage = resourcePackage;
		resourcePackage = newResourcePackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE, oldResourcePackage, newResourcePackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourcePackage(ResourcePackage newResourcePackage) {
		if (newResourcePackage != resourcePackage) {
			NotificationChain msgs = null;
			if (resourcePackage != null)
				msgs = ((InternalEObject)resourcePackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE, null, msgs);
			if (newResourcePackage != null)
				msgs = ((InternalEObject)newResourcePackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE, null, msgs);
			msgs = basicSetResourcePackage(newResourcePackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE, newResourcePackage, newResourcePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndToEndFlow> getEndToEndFlows() {
		if (endToEndFlows == null) {
			endToEndFlows = new EObjectContainmentEList<EndToEndFlow>(EndToEndFlow.class, this, DesignPackage.DESIGN_MODEL__END_TO_END_FLOWS);
		}
		return endToEndFlows;
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
			case DesignPackage.DESIGN_MODEL__OWNS:
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
			case DesignPackage.DESIGN_MODEL__OWNS:
				return ((InternalEList<?>)getOwns()).basicRemove(otherEnd, msgs);
			case DesignPackage.DESIGN_MODEL__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR:
				return basicSetWorkloadBehavior(null, msgs);
			case DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE:
				return basicSetResourcePackage(null, msgs);
			case DesignPackage.DESIGN_MODEL__END_TO_END_FLOWS:
				return ((InternalEList<?>)getEndToEndFlows()).basicRemove(otherEnd, msgs);
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
			case DesignPackage.DESIGN_MODEL__OWNS:
				return getOwns();
			case DesignPackage.DESIGN_MODEL__ANNOTATION_CONCERN:
				return getAnnotationConcern();
			case DesignPackage.DESIGN_MODEL__OWNED_RULE:
				return getOwnedRule();
			case DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR:
				return getWorkloadBehavior();
			case DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE:
				return getResourcePackage();
			case DesignPackage.DESIGN_MODEL__END_TO_END_FLOWS:
				return getEndToEndFlows();
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
			case DesignPackage.DESIGN_MODEL__OWNS:
				getOwns().clear();
				getOwns().addAll((Collection<? extends AnnotatedElement>)newValue);
				return;
			case DesignPackage.DESIGN_MODEL__ANNOTATION_CONCERN:
				getAnnotationConcern().clear();
				getAnnotationConcern().addAll((Collection<? extends ModelingConcern>)newValue);
				return;
			case DesignPackage.DESIGN_MODEL__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR:
				setWorkloadBehavior((WorkloadBehavior)newValue);
				return;
			case DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE:
				setResourcePackage((ResourcePackage)newValue);
				return;
			case DesignPackage.DESIGN_MODEL__END_TO_END_FLOWS:
				getEndToEndFlows().clear();
				getEndToEndFlows().addAll((Collection<? extends EndToEndFlow>)newValue);
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
			case DesignPackage.DESIGN_MODEL__OWNS:
				getOwns().clear();
				return;
			case DesignPackage.DESIGN_MODEL__ANNOTATION_CONCERN:
				getAnnotationConcern().clear();
				return;
			case DesignPackage.DESIGN_MODEL__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR:
				setWorkloadBehavior((WorkloadBehavior)null);
				return;
			case DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE:
				setResourcePackage((ResourcePackage)null);
				return;
			case DesignPackage.DESIGN_MODEL__END_TO_END_FLOWS:
				getEndToEndFlows().clear();
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
			case DesignPackage.DESIGN_MODEL__OWNS:
				return owns != null && !owns.isEmpty();
			case DesignPackage.DESIGN_MODEL__ANNOTATION_CONCERN:
				return annotationConcern != null && !annotationConcern.isEmpty();
			case DesignPackage.DESIGN_MODEL__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case DesignPackage.DESIGN_MODEL__WORKLOAD_BEHAVIOR:
				return workloadBehavior != null;
			case DesignPackage.DESIGN_MODEL__RESOURCE_PACKAGE:
				return resourcePackage != null;
			case DesignPackage.DESIGN_MODEL__END_TO_END_FLOWS:
				return endToEndFlows != null && !endToEndFlows.isEmpty();
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
		if (baseClass == AnnotatedModel.class) {
			switch (derivedFeatureID) {
				case DesignPackage.DESIGN_MODEL__OWNS: return AnnotationPackage.ANNOTATED_MODEL__OWNS;
				case DesignPackage.DESIGN_MODEL__ANNOTATION_CONCERN: return AnnotationPackage.ANNOTATED_MODEL__ANNOTATION_CONCERN;
				case DesignPackage.DESIGN_MODEL__OWNED_RULE: return AnnotationPackage.ANNOTATED_MODEL__OWNED_RULE;
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
		if (baseClass == AnnotatedModel.class) {
			switch (baseFeatureID) {
				case AnnotationPackage.ANNOTATED_MODEL__OWNS: return DesignPackage.DESIGN_MODEL__OWNS;
				case AnnotationPackage.ANNOTATED_MODEL__ANNOTATION_CONCERN: return DesignPackage.DESIGN_MODEL__ANNOTATION_CONCERN;
				case AnnotationPackage.ANNOTATED_MODEL__OWNED_RULE: return DesignPackage.DESIGN_MODEL__OWNED_RULE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DesignModelImpl
