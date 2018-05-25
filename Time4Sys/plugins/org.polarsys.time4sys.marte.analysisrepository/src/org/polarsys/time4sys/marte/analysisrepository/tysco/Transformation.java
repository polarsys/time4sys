/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getContextModel <em>Context Model</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getTestImplementation <em>Test Implementation</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getTransfoExecPath <em>Transfo Exec Path</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTransformation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='contextRelatedCompliance'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot contextRelatedCompliance='Tuple {\n\tmessage : String = \'The context model specified is irrelevant\',\n\tstatus : Boolean = self.contextModel.analysisTests.implementations.transformation->includes(self)\n}.status'"
 * @generated
 */
public interface Transformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Context Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Model</em>' reference.
	 * @see #setContextModel(ContextModel)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTransformation_ContextModel()
	 * @model required="true"
	 * @generated
	 */
	ContextModel getContextModel();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getContextModel <em>Context Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Model</em>' reference.
	 * @see #getContextModel()
	 * @generated
	 */
	void setContextModel(ContextModel value);

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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTransformation_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Test Implementation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Implementation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Implementation</em>' container reference.
	 * @see #setTestImplementation(TestImplementation)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTransformation_TestImplementation()
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation#getTransformation
	 * @model opposite="transformation" transient="false" derived="true"
	 * @generated
	 */
	TestImplementation getTestImplementation();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getTestImplementation <em>Test Implementation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Implementation</em>' container reference.
	 * @see #getTestImplementation()
	 * @generated
	 */
	void setTestImplementation(TestImplementation value);

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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTransformation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Transfo Exec Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfo Exec Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfo Exec Path</em>' attribute.
	 * @see #setTransfoExecPath(String)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getTransformation_TransfoExecPath()
	 * @model
	 * @generated
	 */
	String getTransfoExecPath();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation#getTransfoExecPath <em>Transfo Exec Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfo Exec Path</em>' attribute.
	 * @see #getTransfoExecPath()
	 * @generated
	 */
	void setTransfoExecPath(String value);

} // Transformation
