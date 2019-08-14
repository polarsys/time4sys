/**
 */
package org.polarsys.time4sys.results.results;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.Event#getJitter <em>Jitter</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.Event#getMinDist <em>Min Dist</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.Event#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitter</em>' attribute.
	 * @see #setJitter(int)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getEvent_Jitter()
	 * @model
	 * @generated
	 */
	int getJitter();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.Event#getJitter <em>Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' attribute.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(int value);

	/**
	 * Returns the value of the '<em><b>Min Dist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Dist</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Dist</em>' attribute.
	 * @see #setMinDist(int)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getEvent_MinDist()
	 * @model
	 * @generated
	 */
	int getMinDist();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.Event#getMinDist <em>Min Dist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Dist</em>' attribute.
	 * @see #getMinDist()
	 * @generated
	 */
	void setMinDist(int value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(Offset)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getEvent_Offset()
	 * @model containment="true"
	 * @generated
	 */
	Offset getOffset();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.Event#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Offset value);

} // Event
