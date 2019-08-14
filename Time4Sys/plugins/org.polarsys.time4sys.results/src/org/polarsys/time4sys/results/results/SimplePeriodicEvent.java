/**
 */
package org.polarsys.time4sys.results.results;

import org.polarsys.time4sys.marte.nfp.Duration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Periodic Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.SimplePeriodicEvent#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getSimplePeriodicEvent()
 * @model
 * @generated
 */
public interface SimplePeriodicEvent extends Event {
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
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getSimplePeriodicEvent_Period()
	 * @model dataType="org.polarsys.time4sys.marte.nfp.NFP_Duration"
	 * @generated
	 */
	Duration getPeriod();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.SimplePeriodicEvent#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Duration value);

} // SimplePeriodicEvent
