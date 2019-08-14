/**
 */
package org.polarsys.time4sys.results.results;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tindell Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.TindellEvent#getBurstSize <em>Burst Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.TindellEvent#getInnerPeriod <em>Inner Period</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.TindellEvent#getOuterPeriod <em>Outer Period</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.results.results.ResultsPackage#getTindellEvent()
 * @model
 * @generated
 */
public interface TindellEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Burst Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Burst Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Burst Size</em>' attribute.
	 * @see #setBurstSize(int)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getTindellEvent_BurstSize()
	 * @model
	 * @generated
	 */
	int getBurstSize();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.TindellEvent#getBurstSize <em>Burst Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Burst Size</em>' attribute.
	 * @see #getBurstSize()
	 * @generated
	 */
	void setBurstSize(int value);

	/**
	 * Returns the value of the '<em><b>Inner Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Period</em>' attribute.
	 * @see #setInnerPeriod(int)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getTindellEvent_InnerPeriod()
	 * @model
	 * @generated
	 */
	int getInnerPeriod();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.TindellEvent#getInnerPeriod <em>Inner Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Period</em>' attribute.
	 * @see #getInnerPeriod()
	 * @generated
	 */
	void setInnerPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Outer Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Period</em>' attribute.
	 * @see #setOuterPeriod(int)
	 * @see org.polarsys.time4sys.results.results.ResultsPackage#getTindellEvent_OuterPeriod()
	 * @model
	 * @generated
	 */
	int getOuterPeriod();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.results.results.TindellEvent#getOuterPeriod <em>Outer Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Period</em>' attribute.
	 * @see #getOuterPeriod()
	 * @generated
	 */
	void setOuterPeriod(int value);

} // TindellEvent
