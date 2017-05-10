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
 * A representation of the literals of the enumeration '<em><b>Rom Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getRomType()
 * @model
 * @generated
 */
public enum RomType implements Enumerator {
	/**
	 * The '<em><b>Masked Rom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASKED_ROM_VALUE
	 * @generated
	 * @ordered
	 */
	MASKED_ROM(0, "maskedRom", "maskedRom"),

	/**
	 * The '<em><b>Eprom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPROM_VALUE
	 * @generated
	 * @ordered
	 */
	EPROM(1, "eprom", "eprom"),

	/**
	 * The '<em><b>Otp Eprom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTP_EPROM_VALUE
	 * @generated
	 * @ordered
	 */
	OTP_EPROM(2, "otpEprom", "otpEprom"),

	/**
	 * The '<em><b>Eeprom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EEPROM_VALUE
	 * @generated
	 * @ordered
	 */
	EEPROM(3, "eeprom", "eeprom"),

	/**
	 * The '<em><b>Flash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLASH_VALUE
	 * @generated
	 * @ordered
	 */
	FLASH(4, "flash", "flash"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(5, "other", "other"),

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEF(6, "undef", "undef");

	/**
	 * The '<em><b>Masked Rom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Masked Rom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASKED_ROM
	 * @model name="maskedRom"
	 * @generated
	 * @ordered
	 */
	public static final int MASKED_ROM_VALUE = 0;

	/**
	 * The '<em><b>Eprom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eprom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EPROM
	 * @model name="eprom"
	 * @generated
	 * @ordered
	 */
	public static final int EPROM_VALUE = 1;

	/**
	 * The '<em><b>Otp Eprom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Otp Eprom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTP_EPROM
	 * @model name="otpEprom"
	 * @generated
	 * @ordered
	 */
	public static final int OTP_EPROM_VALUE = 2;

	/**
	 * The '<em><b>Eeprom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eeprom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EEPROM
	 * @model name="eeprom"
	 * @generated
	 * @ordered
	 */
	public static final int EEPROM_VALUE = 3;

	/**
	 * The '<em><b>Flash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLASH
	 * @model name="flash"
	 * @generated
	 * @ordered
	 */
	public static final int FLASH_VALUE = 4;

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
	public static final int OTHER_VALUE = 5;

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
	public static final int UNDEF_VALUE = 6;

	/**
	 * An array of all the '<em><b>Rom Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RomType[] VALUES_ARRAY =
		new RomType[] {
			MASKED_ROM,
			EPROM,
			OTP_EPROM,
			EEPROM,
			FLASH,
			OTHER,
			UNDEF,
		};

	/**
	 * A public read-only list of all the '<em><b>Rom Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RomType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rom Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RomType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RomType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rom Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RomType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RomType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rom Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RomType get(int value) {
		switch (value) {
			case MASKED_ROM_VALUE: return MASKED_ROM;
			case EPROM_VALUE: return EPROM;
			case OTP_EPROM_VALUE: return OTP_EPROM;
			case EEPROM_VALUE: return EEPROM;
			case FLASH_VALUE: return FLASH;
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
	private RomType(int value, String name, String literal) {
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
	
} //RomType
