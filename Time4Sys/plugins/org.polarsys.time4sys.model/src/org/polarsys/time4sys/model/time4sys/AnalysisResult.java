/**
 */
package org.polarsys.time4sys.model.time4sys;

import org.polarsys.time4sys.design.DesignModel;

import org.polarsys.time4sys.mapping.Mapping;

import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;

import org.polarsys.time4sys.results.results.ResultSetContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.AnalysisResult#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.AnalysisResult#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.AnalysisResult#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getAnalysisResult()
 * @model
 * @generated
 */
public interface AnalysisResult extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(Mapping)
	 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getAnalysisResult_Mapping()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Mapping getMapping();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.model.time4sys.AnalysisResult#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(Mapping value);

	/**
	 * Returns the value of the '<em><b>Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis</em>' containment reference.
	 * @see #setAnalysis(ResultSetContainer)
	 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getAnalysisResult_Analysis()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResultSetContainer getAnalysis();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.model.time4sys.AnalysisResult#getAnalysis <em>Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis</em>' containment reference.
	 * @see #getAnalysis()
	 * @generated
	 */
	void setAnalysis(ResultSetContainer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.polarsys.time4sys.model.time4sys.Time4sysPackage#getAnalysisResult_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.model.time4sys.AnalysisResult#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	DesignModel getDesignModel();

} // AnalysisResult
