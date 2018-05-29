/**
 */
package org.polarsys.time4sys.marte.analysisrepository.tysco.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.Transformation;
import org.polarsys.time4sys.marte.analysisrepository.tysco.TyscoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestImplementationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestImplementationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestImplementationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestImplementationImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestImplementationImpl#getAnalysisExecPath <em>Analysis Exec Path</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.analysisrepository.tysco.impl.TestImplementationImpl#getToolName <em>Tool Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestImplementationImpl extends MinimalEObjectImpl.Container implements TestImplementation {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected Transformation transformation;

	/**
	 * The default value of the '{@link #getAnalysisExecPath() <em>Analysis Exec Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisExecPath()
	 * @generated
	 * @ordered
	 */
	protected static final String ANALYSIS_EXEC_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnalysisExecPath() <em>Analysis Exec Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisExecPath()
	 * @generated
	 * @ordered
	 */
	protected String analysisExecPath = ANALYSIS_EXEC_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getToolName() <em>Tool Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolName()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToolName() <em>Tool Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolName()
	 * @generated
	 * @ordered
	 */
	protected String toolName = TOOL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyscoPackage.Literals.TEST_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.TEST_IMPLEMENTATION__ID, oldId, id));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.TEST_IMPLEMENTATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.TEST_IMPLEMENTATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(Transformation newTransformation, NotificationChain msgs) {
		Transformation oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TyscoPackage.TEST_IMPLEMENTATION__TRANSFORMATION, oldTransformation, newTransformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(Transformation newTransformation) {
		if (newTransformation != transformation) {
			NotificationChain msgs = null;
			if (transformation != null)
				msgs = ((InternalEObject)transformation).eInverseRemove(this, TyscoPackage.TRANSFORMATION__TEST_IMPLEMENTATION, Transformation.class, msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject)newTransformation).eInverseAdd(this, TyscoPackage.TRANSFORMATION__TEST_IMPLEMENTATION, Transformation.class, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.TEST_IMPLEMENTATION__TRANSFORMATION, newTransformation, newTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnalysisExecPath() {
		return analysisExecPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalysisExecPath(String newAnalysisExecPath) {
		String oldAnalysisExecPath = analysisExecPath;
		analysisExecPath = newAnalysisExecPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.TEST_IMPLEMENTATION__ANALYSIS_EXEC_PATH, oldAnalysisExecPath, analysisExecPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToolName() {
		return toolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolName(String newToolName) {
		String oldToolName = toolName;
		toolName = newToolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyscoPackage.TEST_IMPLEMENTATION__TOOL_NAME, oldToolName, toolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyscoPackage.TEST_IMPLEMENTATION__TRANSFORMATION:
				if (transformation != null)
					msgs = ((InternalEObject)transformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TyscoPackage.TEST_IMPLEMENTATION__TRANSFORMATION, null, msgs);
				return basicSetTransformation((Transformation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyscoPackage.TEST_IMPLEMENTATION__TRANSFORMATION:
				return basicSetTransformation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyscoPackage.TEST_IMPLEMENTATION__ID:
				return getId();
			case TyscoPackage.TEST_IMPLEMENTATION__NAME:
				return getName();
			case TyscoPackage.TEST_IMPLEMENTATION__DESCRIPTION:
				return getDescription();
			case TyscoPackage.TEST_IMPLEMENTATION__TRANSFORMATION:
				return getTransformation();
			case TyscoPackage.TEST_IMPLEMENTATION__ANALYSIS_EXEC_PATH:
				return getAnalysisExecPath();
			case TyscoPackage.TEST_IMPLEMENTATION__TOOL_NAME:
				return getToolName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TyscoPackage.TEST_IMPLEMENTATION__ID:
				setId((Integer)newValue);
				return;
			case TyscoPackage.TEST_IMPLEMENTATION__NAME:
				setName((String)newValue);
				return;
			case TyscoPackage.TEST_IMPLEMENTATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TyscoPackage.TEST_IMPLEMENTATION__TRANSFORMATION:
				setTransformation((Transformation)newValue);
				return;
			case TyscoPackage.TEST_IMPLEMENTATION__ANALYSIS_EXEC_PATH:
				setAnalysisExecPath((String)newValue);
				return;
			case TyscoPackage.TEST_IMPLEMENTATION__TOOL_NAME:
				setToolName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TyscoPackage.TEST_IMPLEMENTATION__ID:
				setId(ID_EDEFAULT);
				return;
			case TyscoPackage.TEST_IMPLEMENTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TyscoPackage.TEST_IMPLEMENTATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TyscoPackage.TEST_IMPLEMENTATION__TRANSFORMATION:
				setTransformation((Transformation)null);
				return;
			case TyscoPackage.TEST_IMPLEMENTATION__ANALYSIS_EXEC_PATH:
				setAnalysisExecPath(ANALYSIS_EXEC_PATH_EDEFAULT);
				return;
			case TyscoPackage.TEST_IMPLEMENTATION__TOOL_NAME:
				setToolName(TOOL_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TyscoPackage.TEST_IMPLEMENTATION__ID:
				return id != ID_EDEFAULT;
			case TyscoPackage.TEST_IMPLEMENTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TyscoPackage.TEST_IMPLEMENTATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TyscoPackage.TEST_IMPLEMENTATION__TRANSFORMATION:
				return transformation != null;
			case TyscoPackage.TEST_IMPLEMENTATION__ANALYSIS_EXEC_PATH:
				return ANALYSIS_EXEC_PATH_EDEFAULT == null ? analysisExecPath != null : !ANALYSIS_EXEC_PATH_EDEFAULT.equals(analysisExecPath);
			case TyscoPackage.TEST_IMPLEMENTATION__TOOL_NAME:
				return TOOL_NAME_EDEFAULT == null ? toolName != null : !TOOL_NAME_EDEFAULT.equals(toolName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", analysisExecPath: ");
		result.append(analysisExecPath);
		result.append(", toolName: ");
		result.append(toolName);
		result.append(')');
		return result.toString();
	}

} //TestImplementationImpl