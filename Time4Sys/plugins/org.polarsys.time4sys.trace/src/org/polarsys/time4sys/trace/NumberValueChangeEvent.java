/**
 */
package org.polarsys.time4sys.trace;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Value Change Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.trace.NumberValueChangeEvent#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.trace.TracePackage#getNumberValueChangeEvent()
 * @model
 * @generated
 */
public interface NumberValueChangeEvent extends ValueChangeEvent {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Number)
	 * @see org.polarsys.time4sys.trace.TracePackage#getNumberValueChangeEvent_Value()
	 * @model dataType="org.polarsys.time4sys.trace.ENumber" required="true"
	 * @generated
	 */
	Number getValue();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.trace.NumberValueChangeEvent#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Number value);

} // NumberValueChangeEvent
