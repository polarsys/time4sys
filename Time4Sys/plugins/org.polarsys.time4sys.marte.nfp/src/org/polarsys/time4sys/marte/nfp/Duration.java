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

import java.math.MathContext;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#getBest <em>Best</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#getWorst <em>Worst</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#getClock <em>Clock</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.Duration#getPrecision <em>Precision</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getDuration()
 * @model
 * @generated NOT
 */
public interface Duration extends EObject, ValueWithUnit<TimeUnitKind> {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getDuration_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.Duration#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>"millisecond"</code>.
	 * The literals are from the enumeration {@link org.polarsys.time4sys.marte.nfp.TimeUnitKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.polarsys.time4sys.marte.nfp.TimeUnitKind
	 * @see #setUnit(TimeUnitKind)
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getDuration_Unit()
	 * @model default="millisecond" required="true"
	 * @generated
	 */
	TimeUnitKind getUnit();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.Duration#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.polarsys.time4sys.marte.nfp.TimeUnitKind
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnitKind value);

	/**
	 * Returns the value of the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Best</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Best</em>' attribute.
	 * @see #setBest(double)
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getDuration_Best()
	 * @model
	 * @generated
	 */
	double getBest();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.Duration#getBest <em>Best</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best</em>' attribute.
	 * @see #getBest()
	 * @generated
	 */
	void setBest(double value);

	/**
	 * Returns the value of the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worst</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worst</em>' attribute.
	 * @see #setWorst(double)
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getDuration_Worst()
	 * @model
	 * @generated
	 */
	double getWorst();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.Duration#getWorst <em>Worst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst</em>' attribute.
	 * @see #getWorst()
	 * @generated
	 */
	void setWorst(double value);

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' attribute.
	 * @see #setClock(String)
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getDuration_Clock()
	 * @model
	 * @generated
	 */
	String getClock();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.Duration#getClock <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' attribute.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(String value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(double)
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getDuration_Precision()
	 * @model
	 * @generated
	 */
	double getPrecision();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.nfp.Duration#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vRequired="true"
	 * @generated
	 */
	Duration add(Duration v);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" unitRequired="true"
	 * @generated
	 */
	Duration convertToUnit(TimeUnitKind unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Duration simplify();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" vRequired="true"
	 * @generated
	 */
	Duration sub(Duration v);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	int compareTo(Duration anotherDuration);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isZero();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean notZero();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Duration max(Duration other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Duration min(Duration other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" vRequired="true"
	 * @generated
	 */
	Duration multiply(long v);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" vRequired="true"
	 * @generated
	 */
	Duration lcm(Duration v);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vRequired="true"
	 * @generated
	 */
	double div(Duration v);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vRequired="true" mcDataType="org.polarsys.time4sys.marte.nfp.MathContext"
	 * @generated
	 */
	double div(Duration v, MathContext mc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model vRequired="true"
	 * @generated
	 */
	long divide(Duration v);

} // Duration
