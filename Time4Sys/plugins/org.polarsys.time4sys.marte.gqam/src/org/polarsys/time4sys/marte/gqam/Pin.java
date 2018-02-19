/**
 */
package org.polarsys.time4sys.marte.gqam;

import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The concept is from UML 2.5 Pin
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.Pin#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.Pin#isIsControl <em>Is Control</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getPin()
 * @model abstract="true"
 * @generated
 */
public interface Pin extends MultiplicityElement, NamedElement, ObjectNode {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(ArrivalPattern)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getPin_Pattern()
	 * @model containment="true"
	 * @generated
	 */
	ArrivalPattern getPattern();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.Pin#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(ArrivalPattern value);

	/**
	 * Returns the value of the '<em><b>Is Control</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contrary to UML specification, default is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Control</em>' attribute.
	 * @see #setIsControl(boolean)
	 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getPin_IsControl()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsControl();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.gqam.Pin#isIsControl <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Control</em>' attribute.
	 * @see #isIsControl()
	 * @generated
	 */
	void setIsControl(boolean value);

} // Pin
