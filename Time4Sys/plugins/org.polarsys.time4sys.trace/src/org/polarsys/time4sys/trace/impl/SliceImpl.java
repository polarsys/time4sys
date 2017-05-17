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
package org.polarsys.time4sys.trace.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.trace.Event;
import org.polarsys.time4sys.trace.Properties;
import org.polarsys.time4sys.trace.Slice;
import org.polarsys.time4sys.trace.SliceKind;
import org.polarsys.time4sys.trace.TracePackage;
import org.polarsys.time4sys.trace.util.EventTimestampComparator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.trace.impl.SliceImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.impl.SliceImpl#getOwnedSubSlices <em>Owned Sub Slices</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.impl.SliceImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.impl.SliceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.impl.SliceImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.impl.SliceImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.impl.SliceImpl#getSubSlices <em>Sub Slices</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.impl.SliceImpl#getKindLabel <em>Kind Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SliceImpl extends MinimalEObjectImpl.Container implements Slice {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getOwnedSubSlices() <em>Owned Sub Slices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubSlices()
	 * @generated
	 * @ordered
	 */
	protected EList<Slice> ownedSubSlices;

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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final SliceKind KIND_EDEFAULT = SliceKind.OTHER;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected SliceKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected Properties properties;

	/**
	 * The cached value of the '{@link #getSubSlices() <em>Sub Slices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSlices()
	 * @generated
	 * @ordered
	 */
	protected EList<Slice> subSlices;

	/**
	 * The default value of the '{@link #getKindLabel() <em>Kind Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKindLabel() <em>Kind Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindLabel()
	 * @generated
	 * @ordered
	 */
	protected String kindLabel = KIND_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SliceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.SLICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectResolvingEList<Event>(Event.class, this, TracePackage.SLICE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slice> getOwnedSubSlices() {
		if (ownedSubSlices == null) {
			ownedSubSlices = new EObjectContainmentWithInverseEList<Slice>(Slice.class, this, TracePackage.SLICE__OWNED_SUB_SLICES, TracePackage.SLICE__PARENT);
		}
		return ownedSubSlices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slice getParent() {
		if (eContainerFeatureID() != TracePackage.SLICE__PARENT) return null;
		return (Slice)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Slice newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, TracePackage.SLICE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Slice newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != TracePackage.SLICE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, TracePackage.SLICE__OWNED_SUB_SLICES, Slice.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.SLICE__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.SLICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SliceKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(SliceKind newKind) {
		SliceKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.SLICE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(Properties newProperties, NotificationChain msgs) {
		Properties oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracePackage.SLICE__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(Properties newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TracePackage.SLICE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TracePackage.SLICE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.SLICE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slice> getSubSlices() {
		if (subSlices == null) {
			subSlices = new EObjectResolvingEList<Slice>(Slice.class, this, TracePackage.SLICE__SUB_SLICES);
		}
		return subSlices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getKindLabel() {
		if (SliceKind.OTHER.equals(kind)) {
			return kindLabel;
		}
		return kind.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setKindLabel(String newKindLabel) {
		String oldKindLabel = kindLabel;
		SliceKind newKind = SliceKind.OTHER;
		if (newKindLabel != null) {
			final String newUpperKindLabel = newKindLabel.toUpperCase();
			for(SliceKind k: SliceKind.values()) {
				if (newUpperKindLabel.equals(k.toString())) {
					newKind = k;
					newKindLabel = null;
				}
			}
		}
		kindLabel = newKindLabel;
		setKind(newKind);
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.SLICE__KIND_LABEL, oldKindLabel, kindLabel));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getHierarchicalName(final String separator) {
		assert(separator != null);
		if (eIsSet(TracePackage.eINSTANCE.getSlice_Parent())) {
			return getParent().getHierarchicalName(separator) + separator + getName();
		} else {
			return getName();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Event> getAggregatedEvents() {
		final Set<Event> events = new LinkedHashSet<>();
		events.addAll(getEvents());
		if (subSlices != null) {
			for(Slice sub: subSlices) {
				events.addAll(sub.getAggregatedEvents());
			}
		}
		if (ownedSubSlices != null) {
			for(Slice sub: ownedSubSlices) {
				events.addAll(sub.getAggregatedEvents());
			}
		}
		final List<Event> evts = new LinkedList<>(events);
		Collections.sort(evts, EventTimestampComparator.INSTANCE);
		return new EcoreEList.UnmodifiableEList<Event>(this, TracePackage.Literals.SLICE__EVENTS, events.size(), evts.toArray());
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
			case TracePackage.SLICE__OWNED_SUB_SLICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedSubSlices()).basicAdd(otherEnd, msgs);
			case TracePackage.SLICE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Slice)otherEnd, msgs);
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
			case TracePackage.SLICE__OWNED_SUB_SLICES:
				return ((InternalEList<?>)getOwnedSubSlices()).basicRemove(otherEnd, msgs);
			case TracePackage.SLICE__PARENT:
				return basicSetParent(null, msgs);
			case TracePackage.SLICE__PROPERTIES:
				return basicSetProperties(null, msgs);
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
			case TracePackage.SLICE__PARENT:
				return eInternalContainer().eInverseRemove(this, TracePackage.SLICE__OWNED_SUB_SLICES, Slice.class, msgs);
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
			case TracePackage.SLICE__EVENTS:
				return getEvents();
			case TracePackage.SLICE__OWNED_SUB_SLICES:
				return getOwnedSubSlices();
			case TracePackage.SLICE__PARENT:
				return getParent();
			case TracePackage.SLICE__NAME:
				return getName();
			case TracePackage.SLICE__KIND:
				return getKind();
			case TracePackage.SLICE__PROPERTIES:
				return getProperties();
			case TracePackage.SLICE__SUB_SLICES:
				return getSubSlices();
			case TracePackage.SLICE__KIND_LABEL:
				return getKindLabel();
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
			case TracePackage.SLICE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case TracePackage.SLICE__OWNED_SUB_SLICES:
				getOwnedSubSlices().clear();
				getOwnedSubSlices().addAll((Collection<? extends Slice>)newValue);
				return;
			case TracePackage.SLICE__PARENT:
				setParent((Slice)newValue);
				return;
			case TracePackage.SLICE__NAME:
				setName((String)newValue);
				return;
			case TracePackage.SLICE__KIND:
				setKind((SliceKind)newValue);
				return;
			case TracePackage.SLICE__PROPERTIES:
				setProperties((Properties)newValue);
				return;
			case TracePackage.SLICE__SUB_SLICES:
				getSubSlices().clear();
				getSubSlices().addAll((Collection<? extends Slice>)newValue);
				return;
			case TracePackage.SLICE__KIND_LABEL:
				setKindLabel((String)newValue);
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
			case TracePackage.SLICE__EVENTS:
				getEvents().clear();
				return;
			case TracePackage.SLICE__OWNED_SUB_SLICES:
				getOwnedSubSlices().clear();
				return;
			case TracePackage.SLICE__PARENT:
				setParent((Slice)null);
				return;
			case TracePackage.SLICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TracePackage.SLICE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case TracePackage.SLICE__PROPERTIES:
				setProperties((Properties)null);
				return;
			case TracePackage.SLICE__SUB_SLICES:
				getSubSlices().clear();
				return;
			case TracePackage.SLICE__KIND_LABEL:
				setKindLabel(KIND_LABEL_EDEFAULT);
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
			case TracePackage.SLICE__EVENTS:
				return events != null && !events.isEmpty();
			case TracePackage.SLICE__OWNED_SUB_SLICES:
				return ownedSubSlices != null && !ownedSubSlices.isEmpty();
			case TracePackage.SLICE__PARENT:
				return getParent() != null;
			case TracePackage.SLICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TracePackage.SLICE__KIND:
				return kind != KIND_EDEFAULT;
			case TracePackage.SLICE__PROPERTIES:
				return properties != null;
			case TracePackage.SLICE__SUB_SLICES:
				return subSlices != null && !subSlices.isEmpty();
			case TracePackage.SLICE__KIND_LABEL:
				return KIND_LABEL_EDEFAULT == null ? kindLabel != null : !KIND_LABEL_EDEFAULT.equals(kindLabel);
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
			case TracePackage.SLICE___GET_HIERARCHICAL_NAME__STRING:
				return getHierarchicalName((String)arguments.get(0));
			case TracePackage.SLICE___GET_AGGREGATED_EVENTS:
				return getAggregatedEvents();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", kind: ");
		result.append(kind);
		result.append(", kindLabel: ");
		result.append(kindLabel);
		result.append(')');
		return result.toString();
	}

} //SliceImpl
