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
package org.polarsys.time4sys.trace;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Slice Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.trace.TracePackage#getSliceKind()
 * @model
 * @generated
 */
public enum SliceKind implements Enumerator {
	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(0, "OTHER", "OTHER"),

	/**
	 * The '<em><b>TASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_VALUE
	 * @generated
	 * @ordered
	 */
	TASK(1, "TASK", "TASK"),

	/**
	 * The '<em><b>JOB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOB_VALUE
	 * @generated
	 * @ordered
	 */
	JOB(2, "JOB", "JOB"),

	/**
	 * The '<em><b>FUNCTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION(3, "FUNCTION", "FUNCTION"),

	/**
	 * The '<em><b>FUNCTION INSTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_INSTANCE(4, "FUNCTION_INSTANCE", "FUNCTION_INSTANCE"),

	/**
	 * The '<em><b>PACKET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKET_VALUE
	 * @generated
	 * @ordered
	 */
	PACKET(5, "PACKET", "PACKET"),

	/**
	 * The '<em><b>FRAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRAME_VALUE
	 * @generated
	 * @ordered
	 */
	FRAME(6, "FRAME", "FRAME"),

	/**
	 * The '<em><b>LINK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINK_VALUE
	 * @generated
	 * @ordered
	 */
	LINK(7, "LINK", "LINK"),

	/**
	 * The '<em><b>RESOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE(9, "RESOURCE", "RESOURCE"),

	/**
	 * The '<em><b>STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_VALUE
	 * @generated
	 * @ordered
	 */
	STATE(9, "STATE", "STATE"),

	/**
	 * The '<em><b>AUTOMATON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOMATON_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOMATON(10, "AUTOMATON", "AUTOMATON"),

	/**
	 * The '<em><b>TEMPORAL CHAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPORAL_CHAIN_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPORAL_CHAIN(11, "TEMPORAL_CHAIN", "TEMPORAL_CHAIN");

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 0;

	/**
	 * The '<em><b>TASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TASK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TASK_VALUE = 1;

	/**
	 * The '<em><b>JOB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JOB_VALUE = 2;

	/**
	 * The '<em><b>FUNCTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUNCTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_VALUE = 3;

	/**
	 * The '<em><b>FUNCTION INSTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUNCTION INSTANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_INSTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_INSTANCE_VALUE = 4;

	/**
	 * The '<em><b>PACKET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PACKET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PACKET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PACKET_VALUE = 5;

	/**
	 * The '<em><b>FRAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FRAME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FRAME_VALUE = 6;

	/**
	 * The '<em><b>LINK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINK_VALUE = 7;

	/**
	 * The '<em><b>RESOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_VALUE = 9;

	/**
	 * The '<em><b>STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STATE_VALUE = 9;

	/**
	 * The '<em><b>AUTOMATON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTOMATON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTOMATON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTOMATON_VALUE = 10;

	/**
	 * The '<em><b>TEMPORAL CHAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEMPORAL CHAIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPORAL_CHAIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEMPORAL_CHAIN_VALUE = 11;

	/**
	 * An array of all the '<em><b>Slice Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SliceKind[] VALUES_ARRAY =
		new SliceKind[] {
			OTHER,
			TASK,
			JOB,
			FUNCTION,
			FUNCTION_INSTANCE,
			PACKET,
			FRAME,
			LINK,
			RESOURCE,
			STATE,
			AUTOMATON,
			TEMPORAL_CHAIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Slice Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SliceKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Slice Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SliceKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SliceKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Slice Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SliceKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SliceKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Slice Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SliceKind get(int value) {
		switch (value) {
			case OTHER_VALUE: return OTHER;
			case TASK_VALUE: return TASK;
			case JOB_VALUE: return JOB;
			case FUNCTION_VALUE: return FUNCTION;
			case FUNCTION_INSTANCE_VALUE: return FUNCTION_INSTANCE;
			case PACKET_VALUE: return PACKET;
			case FRAME_VALUE: return FRAME;
			case LINK_VALUE: return LINK;
			case RESOURCE_VALUE: return RESOURCE;
			case AUTOMATON_VALUE: return AUTOMATON;
			case TEMPORAL_CHAIN_VALUE: return TEMPORAL_CHAIN;
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
	private SliceKind(int value, String name, String literal) {
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
	
} //SliceKind
