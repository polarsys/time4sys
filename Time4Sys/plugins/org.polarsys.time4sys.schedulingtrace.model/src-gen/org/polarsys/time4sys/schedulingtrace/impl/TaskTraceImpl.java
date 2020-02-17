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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.polarsys.time4sys.schedulingtrace.Job;
import org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage;
import org.polarsys.time4sys.schedulingtrace.TaskTrace;

import org.polarsys.time4sys.trace.impl.SliceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.impl.TaskTraceImpl#getJobs <em>Jobs</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.impl.TaskTraceImpl#getJobWithMaxRT <em>Job With Max RT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskTraceImpl extends SliceImpl implements TaskTrace {
	/**
	 * The cached value of the '{@link #getJobs() <em>Jobs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> jobs;

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
	protected TaskTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulingtracePackage.Literals.TASK_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Job> getJobs() {
		if (jobs == null) {
			jobs = new EObjectContainmentWithInverseEList<Job>(Job.class, this, SchedulingtracePackage.TASK_TRACE__JOBS, SchedulingtracePackage.JOB__TASKTRACE);
		}
		return jobs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void addJob(Job job){
		getJobs().add(job);
		getOwnedSubSlices().add(job);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void removeJob(Job job){
		getJobs().remove(job);
		getOwnedSubSlices().remove(job);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulingtracePackage.TASK_TRACE__JOB_WITH_MAX_RT, oldJobWithMaxRT, jobWithMaxRT));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingtracePackage.TASK_TRACE__JOB_WITH_MAX_RT, oldJobWithMaxRT, jobWithMaxRT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulingtracePackage.TASK_TRACE__JOBS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJobs()).basicAdd(otherEnd, msgs);
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
			case SchedulingtracePackage.TASK_TRACE__JOBS:
				return ((InternalEList<?>)getJobs()).basicRemove(otherEnd, msgs);
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
			case SchedulingtracePackage.TASK_TRACE__JOBS:
				return getJobs();
			case SchedulingtracePackage.TASK_TRACE__JOB_WITH_MAX_RT:
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
			case SchedulingtracePackage.TASK_TRACE__JOBS:
				getJobs().clear();
				getJobs().addAll((Collection<? extends Job>)newValue);
				return;
			case SchedulingtracePackage.TASK_TRACE__JOB_WITH_MAX_RT:
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
			case SchedulingtracePackage.TASK_TRACE__JOBS:
				getJobs().clear();
				return;
			case SchedulingtracePackage.TASK_TRACE__JOB_WITH_MAX_RT:
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
			case SchedulingtracePackage.TASK_TRACE__JOBS:
				return jobs != null && !jobs.isEmpty();
			case SchedulingtracePackage.TASK_TRACE__JOB_WITH_MAX_RT:
				return jobWithMaxRT != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskTraceImpl
