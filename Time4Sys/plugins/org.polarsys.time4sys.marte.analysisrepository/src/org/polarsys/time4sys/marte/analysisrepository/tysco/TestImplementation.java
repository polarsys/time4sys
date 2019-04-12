/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getAnalysisExecPath <em>Analysis Exec Path</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getToolName <em>Tool Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getTestedFile <em>Tested File</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getTestResult <em>Test Result</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTestImplementation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TransformationUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TransformationUnique='self.transformation->size()<2'"
 * @generated
 */
public interface TestImplementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTestImplementation_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTestImplementation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTestImplementation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getTestImplementation <em>Test Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(Transformation)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTestImplementation_Transformation()
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getTestImplementation
	 * @model opposite="testImplementation" containment="true"
	 * @generated
	 */
	Transformation getTransformation();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation value);

	/**
	 * Returns the value of the '<em><b>Analysis Exec Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Exec Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Exec Path</em>' attribute.
	 * @see #setAnalysisExecPath(String)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTestImplementation_AnalysisExecPath()
	 * @model
	 * @generated
	 */
	String getAnalysisExecPath();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getAnalysisExecPath <em>Analysis Exec Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Exec Path</em>' attribute.
	 * @see #getAnalysisExecPath()
	 * @generated
	 */
	void setAnalysisExecPath(String value);

	/**
	 * Returns the value of the '<em><b>Tool Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Name</em>' attribute.
	 * @see #setToolName(String)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTestImplementation_ToolName()
	 * @model
	 * @generated
	 */
	String getToolName();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getToolName <em>Tool Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Name</em>' attribute.
	 * @see #getToolName()
	 * @generated
	 */
	void setToolName(String value);

	/**
	 * Returns the value of the '<em><b>Tested File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tested File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tested File</em>' attribute.
	 * @see #setTestedFile(String)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTestImplementation_TestedFile()
	 * @model
	 * @generated
	 */
	String getTestedFile();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getTestedFile <em>Tested File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tested File</em>' attribute.
	 * @see #getTestedFile()
	 * @generated
	 */
	void setTestedFile(String value);

	/**
	 * Returns the value of the '<em><b>Test Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Result</em>' attribute.
	 * @see #setTestResult(String)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTestImplementation_TestResult()
	 * @model
	 * @generated
	 */
	String getTestResult();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getTestResult <em>Test Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Result</em>' attribute.
	 * @see #getTestResult()
	 * @generated
	 */
	void setTestResult(String value);

} // TestImplementation
