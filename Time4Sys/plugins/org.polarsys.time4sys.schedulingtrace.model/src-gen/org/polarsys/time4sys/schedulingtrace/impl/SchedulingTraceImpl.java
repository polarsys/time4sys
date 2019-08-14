/**
 */
package org.polarsys.time4sys.schedulingtrace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.time4sys.schedulingtrace.Job;
import org.polarsys.time4sys.schedulingtrace.Processor;
import org.polarsys.time4sys.schedulingtrace.SchedulingTrace;
import org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage;
import org.polarsys.time4sys.trace.impl.TraceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.impl.SchedulingTraceImpl#getProcessors <em>Processors</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.impl.SchedulingTraceImpl#getJobWithMaxRT <em>Job With Max RT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulingTraceImpl extends TraceImpl implements SchedulingTrace {
	/**
	 * The cached value of the '{@link #getProcessors() <em>Processors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> processors;

	/**
	 * The cached value of the '{@link #getJobWithMaxRT() <em>Job With Max RT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobWithMaxRT()
	 * @generated
	 * @ordered
	 */
	protected Job jobWithMaxRT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulingtracePackage.Literals.SCHEDULING_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getProcessors() {
		if (processors == null) {
			processors = new EObjectContainmentEList<Processor>(Processor.class, this, SchedulingtracePackage.SCHEDULING_TRACE__PROCESSORS);
		}
		return processors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void addProcessor(Processor proc){
		getProcessors().add(proc);
		getSlices().add(proc);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void removeProcessor(Processor proc){
		getProcessors().remove(proc);
		getSlices().remove(proc);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job getJobWithMaxRT() {
		if (jobWithMaxRT != null && jobWithMaxRT.eIsProxy()) {
			InternalEObject oldJobWithMaxRT = (InternalEObject)jobWithMaxRT;
			jobWithMaxRT = (Job)eResolveProxy(oldJobWithMaxRT);
			if (jobWithMaxRT != oldJobWithMaxRT) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulingtracePackage.SCHEDULING_TRACE__JOB_WITH_MAX_RT, oldJobWithMaxRT, jobWithMaxRT));
			}
		}
		return jobWithMaxRT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job basicGetJobWithMaxRT() {
		return jobWithMaxRT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobWithMaxRT(Job newJobWithMaxRT) {
		Job oldJobWithMaxRT = jobWithMaxRT;
		jobWithMaxRT = newJobWithMaxRT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingtracePackage.SCHEDULING_TRACE__JOB_WITH_MAX_RT, oldJobWithMaxRT, jobWithMaxRT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulingtracePackage.SCHEDULING_TRACE__PROCESSORS:
				return ((InternalEList<?>)getProcessors()).basicRemove(otherEnd, msgs);
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
			case SchedulingtracePackage.SCHEDULING_TRACE__PROCESSORS:
				return getProcessors();
			case SchedulingtracePackage.SCHEDULING_TRACE__JOB_WITH_MAX_RT:
				if (resolve) return getJobWithMaxRT();
				return basicGetJobWithMaxRT();
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
			case SchedulingtracePackage.SCHEDULING_TRACE__PROCESSORS:
				getProcessors().clear();
				getProcessors().addAll((Collection<? extends Processor>)newValue);
				return;
			case SchedulingtracePackage.SCHEDULING_TRACE__JOB_WITH_MAX_RT:
				setJobWithMaxRT((Job)newValue);
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
			case SchedulingtracePackage.SCHEDULING_TRACE__PROCESSORS:
				getProcessors().clear();
				return;
			case SchedulingtracePackage.SCHEDULING_TRACE__JOB_WITH_MAX_RT:
				setJobWithMaxRT((Job)null);
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
			case SchedulingtracePackage.SCHEDULING_TRACE__PROCESSORS:
				return processors != null && !processors.isEmpty();
			case SchedulingtracePackage.SCHEDULING_TRACE__JOB_WITH_MAX_RT:
				return jobWithMaxRT != null;
		}
		return super.eIsSet(featureID);
	}

} //SchedulingTraceImpl
