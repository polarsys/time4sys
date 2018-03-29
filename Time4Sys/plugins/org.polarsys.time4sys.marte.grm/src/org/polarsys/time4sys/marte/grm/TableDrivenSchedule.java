/**
 */
package org.polarsys.time4sys.marte.grm;

import org.eclipse.emf.common.util.EList;

import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Driven Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.TableDrivenSchedule#getFrameCycleTime <em>Frame Cycle Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.TableDrivenSchedule#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTableDrivenSchedule()
 * @model
 * @generated
 */
public interface TableDrivenSchedule extends ScheduleSpecification {
	/**
	 * Returns the value of the '<em><b>Frame Cycle Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Cycle Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Cycle Time</em>' attribute.
	 * @see #setFrameCycleTime(Duration)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTableDrivenSchedule_FrameCycleTime()
	 * @model dataType="org.polarsys.time4sys.marte.grm.NFP_Duration"
	 * @generated
	 */
	Duration getFrameCycleTime();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.TableDrivenSchedule#getFrameCycleTime <em>Frame Cycle Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Cycle Time</em>' attribute.
	 * @see #getFrameCycleTime()
	 * @generated
	 */
	void setFrameCycleTime(Duration value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.grm.TableEntryType}.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.grm.TableEntryType#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' reference list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTableDrivenSchedule_Entries()
	 * @see org.polarsys.time4sys.marte.grm.TableEntryType#getSchedule
	 * @model opposite="schedule"
	 * @generated
	 */
	EList<TableEntryType> getEntries();

} // TableDrivenSchedule
