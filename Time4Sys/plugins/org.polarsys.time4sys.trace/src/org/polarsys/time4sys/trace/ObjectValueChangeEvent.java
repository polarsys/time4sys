/**
 */
package org.polarsys.time4sys.trace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Value Change Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.trace.ObjectValueChangeEvent#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.trace.TracePackage#getObjectValueChangeEvent()
 * @model
 * @generated
 */
public interface ObjectValueChangeEvent extends ValueChangeEvent {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(EObject)
	 * @see org.polarsys.time4sys.trace.TracePackage#getObjectValueChangeEvent_Value()
	 * @model required="true"
	 * @generated
	 */
	EObject getValue();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.ObjectValueChangeEvent#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EObject value);

} // ObjectValueChangeEvent
