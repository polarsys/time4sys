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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.time4sys.marte.grm.SchedulableResource;

import org.polarsys.time4sys.schedulingtrace.FunctionInstance;
import org.polarsys.time4sys.schedulingtrace.Job;
import org.polarsys.time4sys.schedulingtrace.PreemptedBy;
import org.polarsys.time4sys.schedulingtrace.SchedulingtracePackage;
import org.polarsys.time4sys.schedulingtrace.TaskTrace;

import org.polarsys.time4sys.trace.impl.SliceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.impl.JobImpl#getTasktrace <em>Tasktrace</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.impl.JobImpl#getFunctionInstances <em>Function Instances</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.impl.JobImpl#getSchedulableResource <em>Schedulable Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.impl.JobImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.polarsys.time4sys.schedulingtrace.impl.JobImpl#getListPreemptedBy <em>List Preempted By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends SliceImpl implements Job {
	/**
	 * The cached value of the '{@link #getFunctionInstances() <em>Function Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionInstance> functionInstances;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListPreemptedBy() <em>List Preempted By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListPreemptedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<PreemptedBy> listPreemptedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulingtracePackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskTrace getTasktrace() {
		if (eContainerFeatureID() != SchedulingtracePackage.JOB__TASKTRACE) return null;
		return (TaskTrace)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTasktrace(TaskTrace newTasktrace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTasktrace, SchedulingtracePackage.JOB__TASKTRACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTasktrace(TaskTrace newTasktrace) {
		if (newTasktrace != eInternalContainer() || (eContainerFeatureID() != SchedulingtracePackage.JOB__TASKTRACE && newTasktrace != null)) {
			if (EcoreUtil.isAncestor(this, newTasktrace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTasktrace != null)
				msgs = ((InternalEObject)newTasktrace).eInverseAdd(this, SchedulingtracePackage.TASK_TRACE__JOBS, TaskTrace.class, msgs);
			msgs = basicSetTasktrace(newTasktrace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingtracePackage.JOB__TASKTRACE, newTasktrace, newTasktrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionInstance> getFunctionInstances() {
		if (functionInstances == null) {
			functionInstances = new EObjectContainmentWithInverseEList<FunctionInstance>(FunctionInstance.class, this, SchedulingtracePackage.JOB__FUNCTION_INSTANCES, SchedulingtracePackage.FUNCTION_INSTANCE__JOB);
		}
		return functionInstances;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void addFunctionInstance(FunctionInstance func){
		getFunctionInstances().add(func);
		getOwnedSubSlices().add(func);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public void removeFunctionInstance(FunctionInstance func){
		getFunctionInstances().remove(func);
		getOwnedSubSlices().remove(func);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchedulingtracePackage.JOB__SCHEDULABLE_RESOURCE, oldSchedulableResource, schedulableResource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingtracePackage.JOB__SCHEDULABLE_RESOURCE, oldSchedulableResource, schedulableResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingtracePackage.JOB__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreemptedBy> getListPreemptedBy() {
		if (listPreemptedBy == null) {
			listPreemptedBy = new EObjectContainmentEList<PreemptedBy>(PreemptedBy.class, this, SchedulingtracePackage.JOB__LIST_PREEMPTED_BY);
		}
		return listPreemptedBy;
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
			case SchedulingtracePackage.JOB__TASKTRACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTasktrace((TaskTrace)otherEnd, msgs);
			case SchedulingtracePackage.JOB__FUNCTION_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFunctionInstances()).basicAdd(otherEnd, msgs);
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
			case SchedulingtracePackage.JOB__TASKTRACE:
				return basicSetTasktrace(null, msgs);
			case SchedulingtracePackage.JOB__FUNCTION_INSTANCES:
				return ((InternalEList<?>)getFunctionInstances()).basicRemove(otherEnd, msgs);
			case SchedulingtracePackage.JOB__LIST_PREEMPTED_BY:
				return ((InternalEList<?>)getListPreemptedBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SchedulingtracePackage.JOB__TASKTRACE:
				return eInternalContainer().eInverseRemove(this, SchedulingtracePackage.TASK_TRACE__JOBS, TaskTrace.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulingtracePackage.JOB__TASKTRACE:
				return getTasktrace();
			case SchedulingtracePackage.JOB__FUNCTION_INSTANCES:
				return getFunctionInstances();
			case SchedulingtracePackage.JOB__SCHEDULABLE_RESOURCE:
				if (resolve) return getSchedulableResource();
				return basicGetSchedulableResource();
			case SchedulingtracePackage.JOB__ID:
				return getId();
			case SchedulingtracePackage.JOB__LIST_PREEMPTED_BY:
				return getListPreemptedBy();
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
			case SchedulingtracePackage.JOB__TASKTRACE:
				setTasktrace((TaskTrace)newValue);
				return;
			case SchedulingtracePackage.JOB__FUNCTION_INSTANCES:
				getFunctionInstances().clear();
				getFunctionInstances().addAll((Collection<? extends FunctionInstance>)newValue);
				return;
			case SchedulingtracePackage.JOB__SCHEDULABLE_RESOURCE:
				setSchedulableResource((SchedulableResource)newValue);
				return;
			case SchedulingtracePackage.JOB__ID:
				setId((Long)newValue);
				return;
			case SchedulingtracePackage.JOB__LIST_PREEMPTED_BY:
				getListPreemptedBy().clear();
				getListPreemptedBy().addAll((Collection<? extends PreemptedBy>)newValue);
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
			case SchedulingtracePackage.JOB__TASKTRACE:
				setTasktrace((TaskTrace)null);
				return;
			case SchedulingtracePackage.JOB__FUNCTION_INSTANCES:
				getFunctionInstances().clear();
				return;
			case SchedulingtracePackage.JOB__SCHEDULABLE_RESOURCE:
				setSchedulableResource((SchedulableResource)null);
				return;
			case SchedulingtracePackage.JOB__ID:
				setId(ID_EDEFAULT);
				return;
			case SchedulingtracePackage.JOB__LIST_PREEMPTED_BY:
				getListPreemptedBy().clear();
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
			case SchedulingtracePackage.JOB__TASKTRACE:
				return getTasktrace() != null;
			case SchedulingtracePackage.JOB__FUNCTION_INSTANCES:
				return functionInstances != null && !functionInstances.isEmpty();
			case SchedulingtracePackage.JOB__SCHEDULABLE_RESOURCE:
				return schedulableResource != null;
			case SchedulingtracePackage.JOB__ID:
				return id != ID_EDEFAULT;
			case SchedulingtracePackage.JOB__LIST_PREEMPTED_BY:
				return listPreemptedBy != null && !listPreemptedBy.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //JobImpl
