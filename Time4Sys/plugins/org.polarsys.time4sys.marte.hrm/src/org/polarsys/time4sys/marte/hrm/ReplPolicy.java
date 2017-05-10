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
package org.polarsys.time4sys.marte.hrm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Repl Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getReplPolicy()
 * @model
 * @generated
 */
public enum ReplPolicy implements Enumerator {
	/**
	 * The '<em><b>Lru</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LRU_VALUE
	 * @generated
	 * @ordered
	 */
	LRU(0, "lru", "lru"),

	/**
	 * The '<em><b>Nfu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NFU_VALUE
	 * @generated
	 * @ordered
	 */
	NFU(1, "nfu", "nfu"),

	/**
	 * The '<em><b>Fifo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIFO_VALUE
	 * @generated
	 * @ordered
	 */
	FIFO(2, "fifo", "fifo"),

	/**
	 * The '<em><b>Random</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM(3, "random", "random"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "other", "other"),

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEF(5, "undef", "undef");

	/**
	 * The '<em><b>Lru</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lru</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LRU
	 * @model name="lru"
	 * @generated
	 * @ordered
	 */
	public static final int LRU_VALUE = 0;

	/**
	 * The '<em><b>Nfu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nfu</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NFU
	 * @model name="nfu"
	 * @generated
	 * @ordered
	 */
	public static final int NFU_VALUE = 1;

	/**
	 * The '<em><b>Fifo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fifo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIFO
	 * @model name="fifo"
	 * @generated
	 * @ordered
	 */
	public static final int FIFO_VALUE = 2;

	/**
	 * The '<em><b>Random</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Random</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RANDOM
	 * @model name="random"
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_VALUE = 3;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 4;

	/**
	 * The '<em><b>Undef</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undef</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEF
	 * @model name="undef"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEF_VALUE = 5;

	/**
	 * An array of all the '<em><b>Repl Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReplPolicy[] VALUES_ARRAY =
		new ReplPolicy[] {
			LRU,
			NFU,
			FIFO,
			RANDOM,
			OTHER,
			UNDEF,
		};

	/**
	 * A public read-only list of all the '<em><b>Repl Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReplPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Repl Policy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReplPolicy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReplPolicy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Repl Policy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReplPolicy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReplPolicy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Repl Policy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReplPolicy get(int value) {
		switch (value) {
			case LRU_VALUE: return LRU;
			case NFU_VALUE: return NFU;
			case FIFO_VALUE: return FIFO;
			case RANDOM_VALUE: return RANDOM;
			case OTHER_VALUE: return OTHER;
			case UNDEF_VALUE: return UNDEF;
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
	private ReplPolicy(int value, String name, String literal) {
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
	
} //ReplPolicy
