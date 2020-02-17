/**
 */
package org.polarsys.time4sys.schedulingtrace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.time4sys.marte.grm.SchedulableResource;

import org.polarsys.time4sys.schedulingtrace.Job;
import org.polarsys.time4sys.schedulingtrace.Partition;
import org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage;
import org.polarsys.time4sys.schedulingtrace.TaskTrace;

import org.polarsys.time4sys.trace.impl.SliceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.impl.PartitionImpl#getTasktraces <em>Tasktraces</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.impl.PartitionImpl#getSchedulableResource <em>Schedulable Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.impl.PartitionImpl#getJobWithMaxRT <em>Job With Max RT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartitionImpl extends SliceImpl implements Partition {
	/**
	 * The cached value of the '{@link #getTasktraces() <em>Tasktraces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasktraces()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskTrace> tasktraces;

	/**
	 * The cached value of the '{@link #getSchedulableResource() <em>Schedulable Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulableResource()
	 * @generated
	 * @ordered
	 */
	protected SchedulableResource schedulableResource;

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
	protected PartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulingtracePackage.Literals.PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskTrace> getTasktraces() {
		if (tasktraces == null) {
			tasktraces = new EObjectResolvingEList<TaskTrace>(TaskTrace.class, this, SchedulingtracePackage.PARTITION__TASKTRACES);
		}
		return tasktraces;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void addTaskTrace(TaskTrace tasktrace){
		getTasktraces().add(tasktrace);
		getOwnedSubSlices().add(tasktrace);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void removeTaskTrace(TaskTrace tasktrace){
		getTasktraces().remove(tasktrace);
		getOwnedSubSlices().remove(tasktrace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulableResource getSchedulableResource() {
		if (schedulableResource != null && schedulableResource.eIsProxy()) {
			InternalEObject oldSchedulableResource = (InternalEObject)schedulableResource;
			schedulableResource = (SchedulableResource)eResolveProxy(oldSchedulableResource);
			if (schedulableResource != oldSchedulableResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulingtracePackage.PARTITION__SCHEDULABLE_RESOURCE, oldSchedulableResource, schedulableResource));
			}
		}
		return schedulableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulableResource basicGetSchedulableResource() {
		return schedulableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulableResource(SchedulableResource newSchedulableResource) {
		SchedulableResource oldSchedulableResource = schedulableResource;
		schedulableResource = newSchedulableResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingtracePackage.PARTITION__SCHEDULABLE_RESOURCE, oldSchedulableResource, schedulableResource));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulingtracePackage.PARTITION__JOB_WITH_MAX_RT, oldJobWithMaxRT, jobWithMaxRT));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingtracePackage.PARTITION__JOB_WITH_MAX_RT, oldJobWithMaxRT, jobWithMaxRT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulingtracePackage.PARTITION__TASKTRACES:
				return getTasktraces();
			case SchedulingtracePackage.PARTITION__SCHEDULABLE_RESOURCE:
				if (resolve) return getSchedulableResource();
				return basicGetSchedulableResource();
			case SchedulingtracePackage.PARTITION__JOB_WITH_MAX_RT:
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
			case SchedulingtracePackage.PARTITION__TASKTRACES:
				getTasktraces().clear();
				getTasktraces().addAll((Collection<? extends TaskTrace>)newValue);
				return;
			case SchedulingtracePackage.PARTITION__SCHEDULABLE_RESOURCE:
				setSchedulableResource((SchedulableResource)newValue);
				return;
			case SchedulingtracePackage.PARTITION__JOB_WITH_MAX_RT:
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
			case SchedulingtracePackage.PARTITION__TASKTRACES:
				getTasktraces().clear();
				return;
			case SchedulingtracePackage.PARTITION__SCHEDULABLE_RESOURCE:
				setSchedulableResource((SchedulableResource)null);
				return;
			case SchedulingtracePackage.PARTITION__JOB_WITH_MAX_RT:
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
			case SchedulingtracePackage.PARTITION__TASKTRACES:
				return tasktraces != null && !tasktraces.isEmpty();
			case SchedulingtracePackage.PARTITION__SCHEDULABLE_RESOURCE:
				return schedulableResource != null;
			case SchedulingtracePackage.PARTITION__JOB_WITH_MAX_RT:
				return jobWithMaxRT != null;
		}
		return super.eIsSet(featureID);
	}

} //PartitionImpl
