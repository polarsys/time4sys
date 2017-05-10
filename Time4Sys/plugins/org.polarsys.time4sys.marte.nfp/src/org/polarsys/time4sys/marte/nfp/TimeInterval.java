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
package org.polarsys.time4sys.marte.nfp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.TimeInterval#getMin <em>Min</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.TimeInterval#getMax <em>Max</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.TimeInterval#isMinOpen <em>Min Open</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.TimeInterval#isMaxOpen <em>Max Open</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getTimeInterval()
 * @model
 * @generated
 */
public interface TimeInterval extends EObject {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' reference.
	 * @see #setMin(Duration)
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getTimeInterval_Min()
	 * @model required="true"
	 * @generated
	 */
	Duration getMin();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#getMin <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Duration value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' reference.
	 * @see #setMax(Duration)
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getTimeInterval_Max()
	 * @model required="true"
	 * @generated
	 */
	Duration getMax();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#getMax <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Duration value);

	/**
	 * Returns the value of the '<em><b>Min Open</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Open</em>' attribute.
	 * @see #setMinOpen(boolean)
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getTimeInterval_MinOpen()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isMinOpen();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#isMinOpen <em>Min Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Open</em>' attribute.
	 * @see #isMinOpen()
	 * @generated
	 */
	void setMinOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Open</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Open</em>' attribute.
	 * @see #setMaxOpen(boolean)
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getTimeInterval_MaxOpen()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isMaxOpen();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.TimeInterval#isMaxOpen <em>Max Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Open</em>' attribute.
	 * @see #isMaxOpen()
	 * @generated
	 */
	void setMaxOpen(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Duration computeLength();

} // TimeInterval
