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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.time4sys.marte.hrm.HardwareResource;

import org.polarsys.time4sys.schedulingtrace.Job;
import org.polarsys.time4sys.schedulingtrace.Partition;
import org.polarsys.time4sys.schedulingtrace.Processor;
import org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage;
import org.polarsys.time4sys.schedulingtrace.TaskTrace;

import org.polarsys.time4sys.trace.impl.SliceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.impl.ProcessorImpl#getTasktraces <em>Tasktraces</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.impl.ProcessorImpl#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.impl.ProcessorImpl#getHardwareResource <em>Hardware Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.impl.ProcessorImpl#getJobWithMaxRT <em>Job With Max RT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessorImpl extends SliceImpl implements Processor {
	/**
	 * The cached value of the '{@link #getTasktraces() <em>Tasktraces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasktraces()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskTrace> tasktraces;

	/**
	 * The cached value of the '{@link #getPartitions() <em>Partitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Partition> partitions;

	/**
	 * The cached value of the '{@link #getHardwareResource() <em>Hardware Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareResource()
	 * @generated
	 * @ordered
	 */
	protected HardwareResource hardwareResource;

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
	protected ProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulingtracePackage.Literals.PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskTrace> getTasktraces() {
		if (tasktraces == null) {
			tasktraces = new EObjectContainmentEList<TaskTrace>(TaskTrace.class, this, SchedulingtracePackage.PROCESSOR__TASKTRACES);
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
	public EList<Partition> getPartitions() {
		if (partitions == null) {
			partitions = new EObjectResolvingEList<Partition>(Partition.class, this, SchedulingtracePackage.PROCESSOR__PARTITIONS);
		}
		return partitions;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void addPartition(Partition part){
		getPartitions().add(part);
		getOwnedSubSlices().add(part);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void removePartition(Partition part){
		getPartitions().remove(part);
		getOwnedSubSlices().remove(part);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareResource getHardwareResource() {
		if (hardwareResource != null && hardwareResource.eIsProxy()) {
			InternalEObject oldHardwareResource = (InternalEObject)hardwareResource;
			hardwareResource = (HardwareResource)eResolveProxy(oldHardwareResource);
			if (hardwareResource != oldHardwareResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulingtracePackage.PROCESSOR__HARDWARE_RESOURCE, oldHardwareResource, hardwareResource));
			}
		}
		return hardwareResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareResource basicGetHardwareResource() {
		return hardwareResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareResource(HardwareResource newHardwareResource) {
		HardwareResource oldHardwareResource = hardwareResource;
		hardwareResource = newHardwareResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingtracePackage.PROCESSOR__HARDWARE_RESOURCE, oldHardwareResource, hardwareResource));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulingtracePackage.PROCESSOR__JOB_WITH_MAX_RT, oldJobWithMaxRT, jobWithMaxRT));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingtracePackage.PROCESSOR__JOB_WITH_MAX_RT, oldJobWithMaxRT, jobWithMaxRT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulingtracePackage.PROCESSOR__TASKTRACES:
				return ((InternalEList<?>)getTasktraces()).basicRemove(otherEnd, msgs);
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
			case SchedulingtracePackage.PROCESSOR__TASKTRACES:
				return getTasktraces();
			case SchedulingtracePackage.PROCESSOR__PARTITIONS:
				return getPartitions();
			case SchedulingtracePackage.PROCESSOR__HARDWARE_RESOURCE:
				if (resolve) return getHardwareResource();
				return basicGetHardwareResource();
			case SchedulingtracePackage.PROCESSOR__JOB_WITH_MAX_RT:
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
			case SchedulingtracePackage.PROCESSOR__TASKTRACES:
				getTasktraces().clear();
				getTasktraces().addAll((Collection<? extends TaskTrace>)newValue);
				return;
			case SchedulingtracePackage.PROCESSOR__PARTITIONS:
				getPartitions().clear();
				getPartitions().addAll((Collection<? extends Partition>)newValue);
				return;
			case SchedulingtracePackage.PROCESSOR__HARDWARE_RESOURCE:
				setHardwareResource((HardwareResource)newValue);
				return;
			case SchedulingtracePackage.PROCESSOR__JOB_WITH_MAX_RT:
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
			case SchedulingtracePackage.PROCESSOR__TASKTRACES:
				getTasktraces().clear();
				return;
			case SchedulingtracePackage.PROCESSOR__PARTITIONS:
				getPartitions().clear();
				return;
			case SchedulingtracePackage.PROCESSOR__HARDWARE_RESOURCE:
				setHardwareResource((HardwareResource)null);
				return;
			case SchedulingtracePackage.PROCESSOR__JOB_WITH_MAX_RT:
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
			case SchedulingtracePackage.PROCESSOR__TASKTRACES:
				return tasktraces != null && !tasktraces.isEmpty();
			case SchedulingtracePackage.PROCESSOR__PARTITIONS:
				return partitions != null && !partitions.isEmpty();
			case SchedulingtracePackage.PROCESSOR__HARDWARE_RESOURCE:
				return hardwareResource != null;
			case SchedulingtracePackage.PROCESSOR__JOB_WITH_MAX_RT:
				return jobWithMaxRT != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessorImpl
