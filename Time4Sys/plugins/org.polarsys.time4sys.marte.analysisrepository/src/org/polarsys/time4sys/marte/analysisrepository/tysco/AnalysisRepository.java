/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getAllContextModels <em>All Context Models</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getAllRules <em>All Rules</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getAllTests <em>All Tests</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getAnalysisRepository()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IdCompliance_inv1 IdCompliance_inv2 IdCompliance_inv3'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IdCompliance_inv1='Tuple {\n\tmessage : String = \'Ids conflicts: there are at least 2 context models whose id is the same\',\n\tstatus : Boolean = allContextModels->forAll(ct1,ct2|ct1 <> ct2 implies ct1.id <> ct2.id)\n}.status' IdCompliance_inv2='Tuple {\n\tmessage : String = \'Ids conflicts: there are at least 2 identification rules whose id is the same\',\n\tstatus : Boolean = allRules->forAll(ir1,ir2|ir1 <> ir2 implies ir1.id <> ir2.id)\n}.status' IdCompliance_inv3='Tuple {\n\tmessage : String = \'Ids conflicts: there are at least 2 tests whose id is the same\',\n\tstatus : Boolean = allTests->forAll(t1,t2|t1 <> t2 implies t1.id <> t2.id)\n}.status'"
 * @generated
 */
public interface AnalysisRepository extends EObject {
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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getAnalysisRepository_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getName <em>Name</em>}' attribute.
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
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getAnalysisRepository_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.analysisrepository.tysco.AnalysisRepository#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>All Context Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.ContextModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Context Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Context Models</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getAnalysisRepository_AllContextModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextModel> getAllContextModels();

	/**
	 * Returns the value of the '<em><b>All Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.IdentificationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Rules</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getAnalysisRepository_AllRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<IdentificationRule> getAllRules();

	/**
	 * Returns the value of the '<em><b>All Tests</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.analysisrepository.tysco.Test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Tests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Tests</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage#getAnalysisRepository_AllTests()
	 * @model containment="true"
	 * @generated
	 */
	EList<Test> getAllTests();

} // AnalysisRepository
