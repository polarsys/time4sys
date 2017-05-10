/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.analysis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Scheduler Policy Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getSchedulerPolicyKind()
 * @model
 * @generated
 */
public enum SchedulerPolicyKind implements Enumerator {
	/**
	 * The '<em><b>No Contention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CONTENTION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CONTENTION(0, "NoContention", "NoContention"),

	/**
	 * The '<em><b>Fixed Priority</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_PRIORITY_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED_PRIORITY(1, "FixedPriority", "FixedPriority"),

	/**
	 * The '<em><b>EDF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDF_VALUE
	 * @generated
	 * @ordered
	 */
	EDF(2, "EDF", "EDF"),

	/**
	 * The '<em><b>FIFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIFO_VALUE
	 * @generated
	 * @ordered
	 */
	FIFO(3, "FIFO", "FIFO"),

	/**
	 * The '<em><b>TDMA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TDMA_VALUE
	 * @generated
	 * @ordered
	 */
	TDMA(4, "TDMA", "TDMA"),

	/**
	 * The '<em><b>Round Robin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUND_ROBIN_VALUE
	 * @generated
	 * @ordered
	 */
	ROUND_ROBIN(5, "RoundRobin", "RoundRobin");

	/**
	 * The '<em><b>No Contention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Contention</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_CONTENTION
	 * @model name="NoContention"
	 * @generated
	 * @ordered
	 */
	public static final int NO_CONTENTION_VALUE = 0;

	/**
	 * The '<em><b>Fixed Priority</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fixed Priority</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIXED_PRIORITY
	 * @model name="FixedPriority"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_PRIORITY_VALUE = 1;

	/**
	 * The '<em><b>EDF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EDF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EDF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EDF_VALUE = 2;

	/**
	 * The '<em><b>FIFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIFO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIFO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIFO_VALUE = 3;

	/**
	 * The '<em><b>TDMA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TDMA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TDMA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TDMA_VALUE = 4;

	/**
	 * The '<em><b>Round Robin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Round Robin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROUND_ROBIN
	 * @model name="RoundRobin"
	 * @generated
	 * @ordered
	 */
	public static final int ROUND_ROBIN_VALUE = 5;

	/**
	 * An array of all the '<em><b>Scheduler Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SchedulerPolicyKind[] VALUES_ARRAY =
		new SchedulerPolicyKind[] {
			NO_CONTENTION,
			FIXED_PRIORITY,
			EDF,
			FIFO,
			TDMA,
			ROUND_ROBIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Scheduler Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SchedulerPolicyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scheduler Policy Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchedulerPolicyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchedulerPolicyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scheduler Policy Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchedulerPolicyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchedulerPolicyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scheduler Policy Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchedulerPolicyKind get(int value) {
		switch (value) {
			case NO_CONTENTION_VALUE: return NO_CONTENTION;
			case FIXED_PRIORITY_VALUE: return FIXED_PRIORITY;
			case EDF_VALUE: return EDF;
			case FIFO_VALUE: return FIFO;
			case TDMA_VALUE: return TDMA;
			case ROUND_ROBIN_VALUE: return ROUND_ROBIN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SchedulerPolicyKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SchedulerPolicyKind
