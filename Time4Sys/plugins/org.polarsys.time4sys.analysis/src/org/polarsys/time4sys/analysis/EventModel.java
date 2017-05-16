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
package org.polarsys.time4sys.analysis;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.EventModel#getOffsets <em>Offsets</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.EventModel#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.EventModel#getJitter <em>Jitter</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.EventModel#getDmin <em>Dmin</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.EventModel#getParent <em>Parent</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.EventModel#isIsSporadic <em>Is Sporadic</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getEventModel()
 * @model
 * @generated
 */
public interface EventModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Offsets</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.analysis.Offset}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.Offset#getEventModel <em>Event Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offsets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offsets</em>' containment reference list.
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getEventModel_Offsets()
	 * @see org.polarsys.time4sys.analysis.Offset#getEventModel
	 * @model opposite="eventModel" containment="true"
	 * @generated
	 */
	EList<Offset> getOffsets();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(Duration)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getEventModel_Period()
	 * @model dataType="org.polarsys.time4sys.analysis.NFP_Duration"
	 * @generated
	 */
	Duration getPeriod();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.EventModel#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Duration value);

	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitter</em>' attribute.
	 * @see #setJitter(Duration)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getEventModel_Jitter()
	 * @model dataType="org.polarsys.time4sys.analysis.NFP_Duration"
	 * @generated
	 */
	Duration getJitter();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.EventModel#getJitter <em>Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' attribute.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(Duration value);

	/**
	 * Returns the value of the '<em><b>Dmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmin</em>' attribute.
	 * @see #setDmin(Duration)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getEventModel_Dmin()
	 * @model dataType="org.polarsys.time4sys.analysis.NFP_Duration"
	 * @generated
	 */
	Duration getDmin();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.EventModel#getDmin <em>Dmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmin</em>' attribute.
	 * @see #getDmin()
	 * @generated
	 */
	void setDmin(Duration value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.EventModelContainer#getEventModel <em>Event Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(EventModelContainer)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getEventModel_Parent()
	 * @see org.polarsys.time4sys.analysis.EventModelContainer#getEventModel
	 * @model opposite="eventModel" transient="false"
	 * @generated
	 */
	EventModelContainer getParent();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.EventModel#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(EventModelContainer value);

	/**
	 * Returns the value of the '<em><b>Is Sporadic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Sporadic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sporadic</em>' attribute.
	 * @see #setIsSporadic(boolean)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getEventModel_IsSporadic()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsSporadic();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.EventModel#isIsSporadic <em>Is Sporadic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sporadic</em>' attribute.
	 * @see #isIsSporadic()
	 * @generated
	 */
	void setIsSporadic(boolean value);

} // EventModel
