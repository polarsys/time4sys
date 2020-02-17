/**
 */
package org.polarsys.time4sys.results.results;

import org.polarsys.time4sys.marte.nfp.Duration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Sporadic Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.SimpleSporadicEvent#getDMin <em>DMin</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getSimpleSporadicEvent()
 * @model
 * @generated
 */
public interface SimpleSporadicEvent extends Event {
	/**
	 * Returns the value of the '<em><b>DMin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DMin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DMin</em>' attribute.
	 * @see #setDMin(Duration)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getSimpleSporadicEvent_DMin()
	 * @model dataType="org.polarsys.time4sys.marte.nfp.NFP_Duration"
	 * @generated
	 */
	Duration getDMin();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.SimpleSporadicEvent#getDMin <em>DMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMin</em>' attribute.
	 * @see #getDMin()
	 * @generated
	 */
	void setDMin(Duration value);

} // SimpleSporadicEvent
