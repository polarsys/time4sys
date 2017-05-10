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

import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.marte.nfp.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.analysis.Offset#getEventModel <em>Event Model</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.Offset#getValue <em>Value</em>}</li>
 *   <li>{@link org.polarsys.time4sys.analysis.Offset#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getOffset()
 * @model
 * @generated
 */
public interface Offset extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.analysis.EventModel#getOffsets <em>Offsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Model</em>' container reference.
	 * @see #setEventModel(EventModel)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getOffset_EventModel()
	 * @see org.polarsys.time4sys.analysis.EventModel#getOffsets
	 * @model opposite="offsets" required="true" transient="false"
	 * @generated
	 */
	EventModel getEventModel();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Offset#getEventModel <em>Event Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Model</em>' container reference.
	 * @see #getEventModel()
	 * @generated
	 */
	void setEventModel(EventModel value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Duration)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getOffset_Value()
	 * @model dataType="org.polarsys.time4sys.analysis.NFP_Duration" required="true"
	 * @generated
	 */
	Duration getValue();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Offset#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Duration value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see org.polarsys.time4sys.analysis.AnalysisPackage#getOffset_Reference()
	 * @model
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.analysis.Offset#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

} // Offset
