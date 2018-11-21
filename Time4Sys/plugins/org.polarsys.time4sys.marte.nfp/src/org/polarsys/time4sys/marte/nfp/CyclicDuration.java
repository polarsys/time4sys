/**
 */
package org.polarsys.time4sys.marte.nfp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cyclic Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.nfp.CyclicDuration#getDurations <em>Durations</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getCyclicDuration()
 * @model
 * @generated
 */
public interface CyclicDuration extends Duration {
	/**
	 * Returns the value of the '<em><b>Durations</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.nfp.Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Durations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durations</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#getCyclicDuration_Durations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Duration> getDurations();

} // CyclicDuration
