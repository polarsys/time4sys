/*******************************************************************************
 * Copyright (c) 2017, 2018 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.nfp.impl;

import java.math.MathContext;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.marte.nfp.Bucket;
import org.polarsys.time4sys.marte.nfp.DiscreteDistribution;
import org.polarsys.time4sys.marte.nfp.DiscreteDistributionKind;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.DiscreteDistributionImpl#getBuckets <em>Buckets</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.impl.DiscreteDistributionImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteDistributionImpl extends ProbabilisticDurationImpl implements DiscreteDistribution {
	/**
	 * The cached value of the '{@link #getBuckets() <em>Buckets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuckets()
	 * @generated
	 * @ordered
	 */
	protected EList<Bucket> buckets;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DiscreteDistributionKind KIND_EDEFAULT = DiscreteDistributionKind.UNDEF;
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected DiscreteDistributionKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NfpPackage.Literals.DISCRETE_DISTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bucket> getBuckets() {
		if (buckets == null) {
			buckets = new EObjectContainmentEList<Bucket>(Bucket.class, this, NfpPackage.DISCRETE_DISTRIBUTION__BUCKETS);
		}
		return buckets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteDistributionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(DiscreteDistributionKind newKind) {
		DiscreteDistributionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.DISCRETE_DISTRIBUTION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NfpPackage.DISCRETE_DISTRIBUTION__BUCKETS:
				return ((InternalEList<?>)getBuckets()).basicRemove(otherEnd, msgs);
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
			case NfpPackage.DISCRETE_DISTRIBUTION__BUCKETS:
				return getBuckets();
			case NfpPackage.DISCRETE_DISTRIBUTION__KIND:
				return getKind();
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
			case NfpPackage.DISCRETE_DISTRIBUTION__BUCKETS:
				getBuckets().clear();
				getBuckets().addAll((Collection<? extends Bucket>)newValue);
				return;
			case NfpPackage.DISCRETE_DISTRIBUTION__KIND:
				setKind((DiscreteDistributionKind)newValue);
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
			case NfpPackage.DISCRETE_DISTRIBUTION__BUCKETS:
				getBuckets().clear();
				return;
			case NfpPackage.DISCRETE_DISTRIBUTION__KIND:
				setKind(KIND_EDEFAULT);
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
			case NfpPackage.DISCRETE_DISTRIBUTION__BUCKETS:
				return buckets != null && !buckets.isEmpty();
			case NfpPackage.DISCRETE_DISTRIBUTION__KIND:
				return kind != KIND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer();
		result.append("discrete(");
		result.append(getKind().toString().toLowerCase());
		result.append(", {");
		final Iterator<Bucket> itB = getBuckets().iterator();
		while(itB.hasNext()) {
			result.append(itB.next().toString());
			if (itB.hasNext()) {
				result.append(", ");
			}
		}
		result.append("})");
		return result.toString();
	}

	@Override
	public void addBucket(double probability, Duration value) {
		final Bucket b = NfpFactory.eINSTANCE.createBucket();
		b.setProbability(probability);
		b.setValue(value);
		getBuckets().add(b);
	}
	
	@Override
	public Duration convertToUnit(final TimeUnitKind target) {
		final DiscreteDistribution d = new DiscreteDistributionImpl();
		d.setKind(getKind());
		d.setUnit(target);
		for(Bucket b: getBuckets()) {
			final Duration converted = b.getValue().convertToUnit(target);
			assert(converted.getUnit() == target);
			d.addBucket(b.getProbability(), converted);
		}
		return d;
	}
	
	@Override
	public boolean isZero() {
		for(Bucket b: getBuckets()) {
			if (b.getValue().isZero()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public Duration multiply(final long other) {
		final DiscreteDistribution d = new DiscreteDistributionImpl();
		d.setKind(getKind());
		d.setUnit(getUnit());
		for(Bucket b: getBuckets()) {
			final Duration converted = b.getValue().multiply(other);
			d.addBucket(b.getProbability(), converted);
		}
		return d;
	}
	
	@Override
	public Duration divide(final long other) {
		final DiscreteDistribution d = new DiscreteDistributionImpl();
		d.setKind(getKind());
		d.setUnit(getUnit());
		for(Bucket b: getBuckets()) {
			final Duration converted = b.getValue().divide(other);
			d.addBucket(b.getProbability(), converted);
		}
		return d;
	}
	
	@Override
	public double div(final Duration other) {
		throw new UnsupportedOperationException("Unavailable");
	}
	
	@Override
	public double div(final Duration other, final MathContext ctx) {
		throw new UnsupportedOperationException("Unavailable");
	}
	
	@Override
	public double getWorst() {
		if (getBuckets().isEmpty()) {
			return 0.0;
		}
		return max(getBuckets().get(0).getValue()).getWorst();
	}
	
	@Override
	public double getBest() {
		if (getBuckets().isEmpty()) {
			return 0.0;
		}
		return min(getBuckets().get(0).getValue()).getBest();
	}
	
	@Override
	public Duration max(final Duration other) {
		if (other == null) {
			return this;
		}
		Duration worst = other;
		for(Bucket b: getBuckets()) {
			worst = b.getValue().max(worst);
		}
		return worst;
	}
	
	@Override
	public Duration min(final Duration other) {
		if (other == null) {
			return this;
		}
		Duration best = other;
		for(Bucket b: getBuckets()) {
			best = b.getValue().min(best);
		}
		return best;
	}
	
	@Override
	public Duration lcm(Duration v) {
		Duration lcm = v;
		for(Bucket b: getBuckets()) {
			lcm = lcm.lcm(b.getValue());
		}
		return lcm;
	}
	
} //DiscreteDistributionImpl
