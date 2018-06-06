/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 */
package org.polarsys.time4sys.marte.hrm;

import org.eclipse.emf.common.util.EList;
import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getArea <em>Area</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getPosX <em>Pos X</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getNbPins <em>Nb Pins</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getPrice <em>Price</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getRConditions <em>RConditions</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getOwnedPin <em>Owned Pin</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getOwnedWire <em>Owned Wire</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareComponent()
 * @model abstract="true"
 * @generated
 */
public interface HardwareComponent extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' attribute.
	 * @see #setDimension(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareComponent_Dimension()
	 * @model
	 * @generated
	 */
	int getDimension();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getDimension <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' attribute.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(int value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' attribute.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareComponent_Area()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	int getArea();

	/**
	 * Returns the value of the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos X</em>' attribute.
	 * @see #setPosX(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareComponent_PosX()
	 * @model
	 * @generated
	 */
	int getPosX();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getPosX <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos X</em>' attribute.
	 * @see #getPosX()
	 * @generated
	 */
	void setPosX(int value);

	/**
	 * Returns the value of the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Y</em>' attribute.
	 * @see #setPosY(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareComponent_PosY()
	 * @model
	 * @generated
	 */
	int getPosY();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getPosY <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Y</em>' attribute.
	 * @see #getPosY()
	 * @generated
	 */
	void setPosY(int value);

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' attribute.
	 * @see #setGrid(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareComponent_Grid()
	 * @model
	 * @generated
	 */
	int getGrid();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getGrid <em>Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' attribute.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(int value);

	/**
	 * Returns the value of the '<em><b>Nb Pins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Pins</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Pins</em>' attribute.
	 * @see #setNbPins(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareComponent_NbPins()
	 * @model
	 * @generated
	 */
	int getNbPins();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getNbPins <em>Nb Pins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Pins</em>' attribute.
	 * @see #getNbPins()
	 * @generated
	 */
	void setNbPins(int value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareComponent_Weight()
	 * @model
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(int)
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareComponent_Price()
	 * @model
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.hrm.HardwareComponent#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>RConditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.EnvCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RConditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RConditions</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareComponent_RConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvCondition> getRConditions();

	/**
	 * Returns the value of the '<em><b>Owned Pin</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwarePin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Pin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Pin</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareComponent_OwnedPin()
	 * @model containment="true"
	 * @generated
	 */
	EList<HardwarePin> getOwnedPin();

	/**
	 * Returns the value of the '<em><b>Owned Wire</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.hrm.HardwareWire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Wire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Wire</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.hrm.HrmPackage#getHardwareComponent_OwnedWire()
	 * @model containment="true"
	 * @generated
	 */
	EList<HardwareWire> getOwnedWire();

} // HardwareComponent
