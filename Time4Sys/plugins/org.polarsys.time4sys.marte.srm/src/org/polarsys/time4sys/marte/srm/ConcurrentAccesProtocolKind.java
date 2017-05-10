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
package org.polarsys.time4sys.marte.srm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Concurrent Acces Protocol Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.srm.SrmPackage#getConcurrentAccesProtocolKind()
 * @model
 * @generated
 */
public enum ConcurrentAccesProtocolKind implements Enumerator {
	/**
	 * The '<em><b>PCP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PCP_VALUE
	 * @generated
	 * @ordered
	 */
	PCP(0, "PCP", "PCP"),

	/**
	 * The '<em><b>PIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIP_VALUE
	 * @generated
	 * @ordered
	 */
	PIP(1, "PIP", "PIP"),

	/**
	 * The '<em><b>No Preemption</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_PREEMPTION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_PREEMPTION(2, "NoPreemption", "NoPreemption"),

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEF(3, "Undef", "Undef"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "Other", "Other");

	/**
	 * The '<em><b>PCP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PCP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PCP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PCP_VALUE = 0;

	/**
	 * The '<em><b>PIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIP_VALUE = 1;

	/**
	 * The '<em><b>No Preemption</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Preemption</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_PREEMPTION
	 * @model name="NoPreemption"
	 * @generated
	 * @ordered
	 */
	public static final int NO_PREEMPTION_VALUE = 2;

	/**
	 * The '<em><b>Undef</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undef</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEF
	 * @model name="Undef"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEF_VALUE = 3;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Concurrent Acces Protocol Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConcurrentAccesProtocolKind[] VALUES_ARRAY =
		new ConcurrentAccesProtocolKind[] {
			PCP,
			PIP,
			NO_PREEMPTION,
			UNDEF,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Concurrent Acces Protocol Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConcurrentAccesProtocolKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Concurrent Acces Protocol Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConcurrentAccesProtocolKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConcurrentAccesProtocolKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concurrent Acces Protocol Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConcurrentAccesProtocolKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConcurrentAccesProtocolKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concurrent Acces Protocol Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConcurrentAccesProtocolKind get(int value) {
		switch (value) {
			case PCP_VALUE: return PCP;
			case PIP_VALUE: return PIP;
			case NO_PREEMPTION_VALUE: return NO_PREEMPTION;
			case UNDEF_VALUE: return UNDEF;
			case OTHER_VALUE: return OTHER;
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
	private ConcurrentAccesProtocolKind(int value, String name, String literal) {
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
	
} //ConcurrentAccesProtocolKind
