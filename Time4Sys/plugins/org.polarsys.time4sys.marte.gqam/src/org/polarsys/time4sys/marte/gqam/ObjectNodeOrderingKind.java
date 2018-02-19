/**
 */
package org.polarsys.time4sys.marte.gqam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Node Ordering Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * ObjectNodeOrderingKind is an enumeration indicating queuing order for offering the tokens held by an ObjectNode.
 * from UML 2.5
 * <!-- end-model-doc -->
 * @see org.polarsys.time4sys.marte.gqam.GqamPackage#getObjectNodeOrderingKind()
 * @model
 * @generated
 */
public enum ObjectNodeOrderingKind implements Enumerator {
	/**
	 * The '<em><b>UNORDERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNORDERED_VALUE
	 * @generated
	 * @ordered
	 */
	UNORDERED(0, "UNORDERED", "UNORDERED"),

	/**
	 * The '<em><b>LIFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFO_VALUE
	 * @generated
	 * @ordered
	 */
	LIFO(1, "LIFO", "LIFO"),

	/**
	 * The '<em><b>FIFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIFO_VALUE
	 * @generated
	 * @ordered
	 */
	FIFO(2, "FIFO", "FIFO"),

	/**
	 * The '<em><b>ORDERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDERED_VALUE
	 * @generated
	 * @ordered
	 */
	ORDERED(3, "ORDERED", "ORDERED");

	/**
	 * The '<em><b>UNORDERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that tokens are unordered.
	 * <!-- end-model-doc -->
	 * @see #UNORDERED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNORDERED_VALUE = 0;

	/**
	 * The '<em><b>LIFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that tokens are queued in a last in, first out manner.
	 * <!-- end-model-doc -->
	 * @see #LIFO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIFO_VALUE = 1;

	/**
	 * The '<em><b>FIFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that tokens are queued in a first in, first out manner.
	 * <!-- end-model-doc -->
	 * @see #FIFO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIFO_VALUE = 2;

	/**
	 * The '<em><b>ORDERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that tokens are ordered.
	 * ORDERED means that an algorithm exists on how to choose the order but is not LIFO nor FIFO.
	 * For example, it could FIFO within a priority level.
	 * The ObjectNode.selection attribute shall point out a procedure for that.
	 * <!-- end-model-doc -->
	 * @see #ORDERED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORDERED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Object Node Ordering Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObjectNodeOrderingKind[] VALUES_ARRAY =
		new ObjectNodeOrderingKind[] {
			UNORDERED,
			LIFO,
			FIFO,
			ORDERED,
		};

	/**
	 * A public read-only list of all the '<em><b>Object Node Ordering Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObjectNodeOrderingKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Node Ordering Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectNodeOrderingKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectNodeOrderingKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Node Ordering Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectNodeOrderingKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectNodeOrderingKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Node Ordering Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectNodeOrderingKind get(int value) {
		switch (value) {
			case UNORDERED_VALUE: return UNORDERED;
			case LIFO_VALUE: return LIFO;
			case FIFO_VALUE: return FIFO;
			case ORDERED_VALUE: return ORDERED;
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
	private ObjectNodeOrderingKind(int value, String name, String literal) {
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
	
} //ObjectNodeOrderingKind
