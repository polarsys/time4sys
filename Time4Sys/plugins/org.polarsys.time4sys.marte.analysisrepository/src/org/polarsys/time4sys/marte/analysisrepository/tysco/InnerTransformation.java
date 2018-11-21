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
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getContextModel <em>Context Model</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getTurnTrue <em>Turn True</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getTurnFalse <em>Turn False</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getInnerTransformation()
 * @model
 * @generated
 */
public interface InnerTransformation extends EObject {
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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getInnerTransformation_ContextModel()
	 * @model required="true"
	 * @generated
	 */
	ContextModel getContextModel();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.InnerTransformation#getContextModel <em>Context Model</em>}' reference.
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

} // InnerTransformation
