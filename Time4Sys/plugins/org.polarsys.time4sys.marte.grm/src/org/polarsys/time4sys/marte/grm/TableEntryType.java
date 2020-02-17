/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.grm;

import org.eclipse.emf.common.util.EList;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.grm.TableEntryType#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.TableEntryType#getTimeSlot <em>Time Slot</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.TableEntryType#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.TableEntryType#getInitialBudget <em>Initial Budget</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.grm.TableEntryType#getActivation <em>Activation</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTableEntryType()
 * @model
 * @generated
 */
public interface TableEntryType extends SchedulingParameter {
	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.grm.TableDrivenSchedule#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' reference.
	 * @see #setSchedule(TableDrivenSchedule)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTableEntryType_Schedule()
	 * @see org.polarsys.time4sys.marte.grm.TableDrivenSchedule#getEntries
	 * @model opposite="entries"
	 * @generated
	 */
	TableDrivenSchedule getSchedule();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.TableEntryType#getSchedule <em>Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(TableDrivenSchedule value);

	/**
	 * Returns the value of the '<em><b>Time Slot</b></em>' attribute list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.nfp.Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Slot</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Slot</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTableEntryType_TimeSlot()
	 * @model unique="false" dataType="org.polarsys.time4sys.marte.grm.NFP_Duration" required="true"
	 * @generated
	 */
	EList<Duration> getTimeSlot();

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.nfp.Duration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTableEntryType_Offset()
	 * @model dataType="org.polarsys.time4sys.marte.grm.NFP_Duration"
	 * @generated
	 */
	EList<Duration> getOffset();

	/**
	 * Returns the value of the '<em><b>Initial Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Budget</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Budget</em>' attribute.
	 * @see #setInitialBudget(Duration)
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTableEntryType_InitialBudget()
	 * @model dataType="org.polarsys.time4sys.marte.grm.NFP_Duration"
	 * @generated
	 */
	Duration getInitialBudget();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.grm.TableEntryType#getInitialBudget <em>Initial Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Budget</em>' attribute.
	 * @see #getInitialBudget()
	 * @generated
	 */
	void setInitialBudget(Duration value);

	/**
	 * Returns the value of the '<em><b>Activation</b></em>' attribute list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.nfp.TimeInterval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' attribute list.
	 * @see org.polarsys.time4sys.marte.grm.GrmPackage#getTableEntryType_Activation()
	 * @model dataType="org.polarsys.time4sys.marte.grm.NFP_TimeInterval" derived="true"
	 * @generated
	 */
	EList<TimeInterval> getActivation();

} // TableEntryType
