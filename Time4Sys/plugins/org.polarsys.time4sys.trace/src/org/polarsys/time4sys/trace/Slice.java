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
package org.polarsys.time4sys.trace;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A slice is an aggregation of Events so as to group them together in a logical way.
 * For instance, it could be:
 * 
 * * the Gantt line view of a processor usage,
 * * an end-to-end dataflow,
 * * an end-to-end network packet travel,
 * * etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.trace.Slice#getEvents <em>Events</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Slice#getOwnedSubSlices <em>Owned Sub Slices</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Slice#getParent <em>Parent</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Slice#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Slice#getKind <em>Kind</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Slice#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Slice#getSubSlices <em>Sub Slices</em>}</li>
 *   <li>{@link org.polarsys.time4sys.trace.Slice#getKindLabel <em>Kind Label</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.trace.TracePackage#getSlice()
 * @model
 * @generated
 */
public interface Slice extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.trace.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see org.polarsys.time4sys.trace.TracePackage#getSlice_Events()
	 * @model
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Owned Sub Slices</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.trace.Slice}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.trace.Slice#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Sub Slices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Sub Slices</em>' containment reference list.
	 * @see org.polarsys.time4sys.trace.TracePackage#getSlice_OwnedSubSlices()
	 * @see org.polarsys.time4sys.trace.Slice#getParent
	 * @model opposite="parent" containment="true"
	 *        extendedMetaData="wildcards='' name=''"
	 * @generated
	 */
	EList<Slice> getOwnedSubSlices();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.trace.Slice#getOwnedSubSlices <em>Owned Sub Slices</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Slice)
	 * @see org.polarsys.time4sys.trace.TracePackage#getSlice_Parent()
	 * @see org.polarsys.time4sys.trace.Slice#getOwnedSubSlices
	 * @model opposite="ownedSubSlices" transient="false"
	 * @generated
	 */
	Slice getParent();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Slice#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Slice value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.polarsys.time4sys.trace.TracePackage#getSlice_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Slice#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.trace.SliceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.trace.SliceKind
	 * @see #setKind(SliceKind)
	 * @see org.polarsys.time4sys.trace.TracePackage#getSlice_Kind()
	 * @model required="true"
	 * @generated
	 */
	SliceKind getKind();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Slice#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.polarsys.time4sys.trace.SliceKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SliceKind value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(Properties)
	 * @see org.polarsys.time4sys.trace.TracePackage#getSlice_Properties()
	 * @model containment="true"
	 * @generated
	 */
	Properties getProperties();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Slice#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(Properties value);

	/**
	 * Returns the value of the '<em><b>Sub Slices</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.trace.Slice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Slices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Slices</em>' reference list.
	 * @see org.polarsys.time4sys.trace.TracePackage#getSlice_SubSlices()
	 * @model
	 * @generated
	 */
	EList<Slice> getSubSlices();

	/**
	 * Returns the value of the '<em><b>Kind Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Label</em>' attribute.
	 * @see #setKindLabel(String)
	 * @see org.polarsys.time4sys.trace.TracePackage#getSlice_KindLabel()
	 * @model
	 * @generated
	 */
	String getKindLabel();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.Slice#getKindLabel <em>Kind Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Label</em>' attribute.
	 * @see #getKindLabel()
	 * @generated
	 */
	void setKindLabel(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" separatorRequired="true"
	 * @generated
	 */
	String getHierarchicalName(String separator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Event> getAggregatedEvents();

	/**
	 * Filter aggregated events by type
	 * @param clz
	 * @return
	 * @generated NOT
	 */
	<T extends Event> List<T> getAggregatedEvents(Class<T> clz);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.polarsys.time4sys.trace.NFP_Duration"
	 * @generated
	 */
	Duration getLatestTimestamp();

} // Slice
