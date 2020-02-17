/**
 */
package org.polarsys.time4sys.results.results.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.marte.nfp.coreelements.impl.NamedElementImpl;

import org.polarsys.time4sys.results.results.AbstractResult;
import org.polarsys.time4sys.results.results.AbstractResultSet;
import org.polarsys.time4sys.results.results.AnalysisResultSet;
import org.polarsys.time4sys.results.results.ResultsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Result Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.AnalysisResultSetImpl#getToolName <em>Tool Name</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.AnalysisResultSetImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.AnalysisResultSetImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.AnalysisResultSetImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.AnalysisResultSetImpl#getNbOfIterations <em>Nb Of Iterations</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.AnalysisResultSetImpl#isHasConverged <em>Has Converged</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisResultSetImpl extends NamedElementImpl implements AnalysisResultSet {
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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractResult> results;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected Mapping mapping;

	/**
	 * The default value of the '{@link #getNbOfIterations() <em>Nb Of Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOfIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_OF_ITERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbOfIterations() <em>Nb Of Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOfIterations()
	 * @generated
	 * @ordered
	 */
	protected int nbOfIterations = NB_OF_ITERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasConverged() <em>Has Converged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasConverged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_CONVERGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasConverged() <em>Has Converged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasConverged()
	 * @generated
	 * @ordered
	 */
	protected boolean hasConverged = HAS_CONVERGED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisResultSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.ANALYSIS_RESULT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.ANALYSIS_RESULT_SET__DATE, oldDate, date));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.ANALYSIS_RESULT_SET__TOOL_NAME, oldToolName, toolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractResult> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<AbstractResult>(AbstractResult.class, this, ResultsPackage.ANALYSIS_RESULT_SET__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapping(Mapping newMapping, NotificationChain msgs) {
		Mapping oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultsPackage.ANALYSIS_RESULT_SET__MAPPING, oldMapping, newMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(Mapping newMapping) {
		if (newMapping != mapping) {
			NotificationChain msgs = null;
			if (mapping != null)
				msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultsPackage.ANALYSIS_RESULT_SET__MAPPING, null, msgs);
			if (newMapping != null)
				msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultsPackage.ANALYSIS_RESULT_SET__MAPPING, null, msgs);
			msgs = basicSetMapping(newMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.ANALYSIS_RESULT_SET__MAPPING, newMapping, newMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbOfIterations() {
		return nbOfIterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbOfIterations(int newNbOfIterations) {
		int oldNbOfIterations = nbOfIterations;
		nbOfIterations = newNbOfIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.ANALYSIS_RESULT_SET__NB_OF_ITERATIONS, oldNbOfIterations, nbOfIterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasConverged() {
		return hasConverged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasConverged(boolean newHasConverged) {
		boolean oldHasConverged = hasConverged;
		hasConverged = newHasConverged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.ANALYSIS_RESULT_SET__HAS_CONVERGED, oldHasConverged, hasConverged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultsPackage.ANALYSIS_RESULT_SET__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
			case ResultsPackage.ANALYSIS_RESULT_SET__MAPPING:
				return basicSetMapping(null, msgs);
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
			case ResultsPackage.ANALYSIS_RESULT_SET__TOOL_NAME:
				return getToolName();
			case ResultsPackage.ANALYSIS_RESULT_SET__DATE:
				return getDate();
			case ResultsPackage.ANALYSIS_RESULT_SET__RESULTS:
				return getResults();
			case ResultsPackage.ANALYSIS_RESULT_SET__MAPPING:
				return getMapping();
			case ResultsPackage.ANALYSIS_RESULT_SET__NB_OF_ITERATIONS:
				return getNbOfIterations();
			case ResultsPackage.ANALYSIS_RESULT_SET__HAS_CONVERGED:
				return isHasConverged();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResultsPackage.ANALYSIS_RESULT_SET__TOOL_NAME:
				setToolName((String)newValue);
				return;
			case ResultsPackage.ANALYSIS_RESULT_SET__DATE:
				setDate((Date)newValue);
				return;
			case ResultsPackage.ANALYSIS_RESULT_SET__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends AbstractResult>)newValue);
				return;
			case ResultsPackage.ANALYSIS_RESULT_SET__MAPPING:
				setMapping((Mapping)newValue);
				return;
			case ResultsPackage.ANALYSIS_RESULT_SET__NB_OF_ITERATIONS:
				setNbOfIterations((Integer)newValue);
				return;
			case ResultsPackage.ANALYSIS_RESULT_SET__HAS_CONVERGED:
				setHasConverged((Boolean)newValue);
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
			case ResultsPackage.ANALYSIS_RESULT_SET__TOOL_NAME:
				setToolName(TOOL_NAME_EDEFAULT);
				return;
			case ResultsPackage.ANALYSIS_RESULT_SET__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ResultsPackage.ANALYSIS_RESULT_SET__RESULTS:
				getResults().clear();
				return;
			case ResultsPackage.ANALYSIS_RESULT_SET__MAPPING:
				setMapping((Mapping)null);
				return;
			case ResultsPackage.ANALYSIS_RESULT_SET__NB_OF_ITERATIONS:
				setNbOfIterations(NB_OF_ITERATIONS_EDEFAULT);
				return;
			case ResultsPackage.ANALYSIS_RESULT_SET__HAS_CONVERGED:
				setHasConverged(HAS_CONVERGED_EDEFAULT);
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
			case ResultsPackage.ANALYSIS_RESULT_SET__TOOL_NAME:
				return TOOL_NAME_EDEFAULT == null ? toolName != null : !TOOL_NAME_EDEFAULT.equals(toolName);
			case ResultsPackage.ANALYSIS_RESULT_SET__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ResultsPackage.ANALYSIS_RESULT_SET__RESULTS:
				return results != null && !results.isEmpty();
			case ResultsPackage.ANALYSIS_RESULT_SET__MAPPING:
				return mapping != null;
			case ResultsPackage.ANALYSIS_RESULT_SET__NB_OF_ITERATIONS:
				return nbOfIterations != NB_OF_ITERATIONS_EDEFAULT;
			case ResultsPackage.ANALYSIS_RESULT_SET__HAS_CONVERGED:
				return hasConverged != HAS_CONVERGED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractResultSet.class) {
			switch (derivedFeatureID) {
				case ResultsPackage.ANALYSIS_RESULT_SET__TOOL_NAME: return ResultsPackage.ABSTRACT_RESULT_SET__TOOL_NAME;
				case ResultsPackage.ANALYSIS_RESULT_SET__DATE: return ResultsPackage.ABSTRACT_RESULT_SET__DATE;
				case ResultsPackage.ANALYSIS_RESULT_SET__RESULTS: return ResultsPackage.ABSTRACT_RESULT_SET__RESULTS;
				case ResultsPackage.ANALYSIS_RESULT_SET__MAPPING: return ResultsPackage.ABSTRACT_RESULT_SET__MAPPING;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractResultSet.class) {
			switch (baseFeatureID) {
				case ResultsPackage.ABSTRACT_RESULT_SET__TOOL_NAME: return ResultsPackage.ANALYSIS_RESULT_SET__TOOL_NAME;
				case ResultsPackage.ABSTRACT_RESULT_SET__DATE: return ResultsPackage.ANALYSIS_RESULT_SET__DATE;
				case ResultsPackage.ABSTRACT_RESULT_SET__RESULTS: return ResultsPackage.ANALYSIS_RESULT_SET__RESULTS;
				case ResultsPackage.ABSTRACT_RESULT_SET__MAPPING: return ResultsPackage.ANALYSIS_RESULT_SET__MAPPING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (toolName: ");
		result.append(toolName);
		result.append(", date: ");
		result.append(date);
		result.append(", nbOfIterations: ");
		result.append(nbOfIterations);
		result.append(", hasConverged: ");
		result.append(hasConverged);
		result.append(')');
		return result.toString();
	}

} //AnalysisResultSetImpl
