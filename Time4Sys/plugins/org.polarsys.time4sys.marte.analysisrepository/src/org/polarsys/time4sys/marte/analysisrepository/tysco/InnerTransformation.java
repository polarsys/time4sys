/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inner Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getRequiredContext <em>Required Context</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getTurnTrue <em>Turn True</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getTurnFalse <em>Turn False</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getClassPath <em>Class Path</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getInnerTransformation()
 * @model
 * @generated
 */
public interface InnerTransformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Context</em>' reference.
	 * @see #setRequiredContext(ContextModel)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getInnerTransformation_RequiredContext()
	 * @model required="true"
	 * @generated
	 */
	ContextModel getRequiredContext();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getRequiredContext <em>Required Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Context</em>' reference.
	 * @see #getRequiredContext()
	 * @generated
	 */
	void setRequiredContext(ContextModel value);

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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getInnerTransformation_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Turn True</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turn True</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turn True</em>' reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getInnerTransformation_TurnTrue()
	 * @model
	 * @generated
	 */
	EList<IdentificationRule> getTurnTrue();

	/**
	 * Returns the value of the '<em><b>Turn False</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turn False</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turn False</em>' reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getInnerTransformation_TurnFalse()
	 * @model
	 * @generated
	 */
	EList<IdentificationRule> getTurnFalse();

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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getInnerTransformation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getName <em>Name</em>}' attribute.
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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getInnerTransformation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Path</em>' attribute.
	 * @see #setClassPath(String)
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getInnerTransformation_ClassPath()
	 * @model
	 * @generated
	 */
	String getClassPath();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getClassPath <em>Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Path</em>' attribute.
	 * @see #getClassPath()
	 * @generated
	 */
	void setClassPath(String value);

} // InnerTransformation
