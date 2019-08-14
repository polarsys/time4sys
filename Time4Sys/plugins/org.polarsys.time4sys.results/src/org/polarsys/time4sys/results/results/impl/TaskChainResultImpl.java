/**
 */
package org.polarsys.time4sys.results.results.impl;

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
import org.polarsys.time4sys.marte.grm.Resource;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.TimeInterval;

import org.polarsys.time4sys.marte.nfp.coreelements.impl.NamedElementImpl;

import org.polarsys.time4sys.results.results.AbstractResult;
import org.polarsys.time4sys.results.results.AtomicResult;
import org.polarsys.time4sys.results.results.Event;
import org.polarsys.time4sys.results.results.Parameter;
import org.polarsys.time4sys.results.results.ResultsPackage;
import org.polarsys.time4sys.results.results.TaskChainResult;
import org.polarsys.time4sys.results.results.TaskResult;

import org.polarsys.time4sys.schedulingtrace.SchedulingTrace;

import org.polarsys.time4sys.trace.Slice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Chain Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskChainResultImpl#getSubResults <em>Sub Results</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskChainResultImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskChainResultImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskChainResultImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskChainResultImpl#getSlack <em>Slack</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskChainResultImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskChainResultImpl#getNbOfSuspension <em>Nb Of Suspension</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskChainResultImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskChainResultImpl#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskChainResultImpl#getCet <em>Cet</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskChainResultImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskChainResultImpl#getSlice <em>Slice</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskChainResultImpl#getSchedulingTrace <em>Scheduling Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskChainResultImpl extends NamedElementImpl implements TaskChainResult {
	/**
	 * The cached value of the '{@link #getSubResults() <em>Sub Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubResults()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractResult> subResults;

	/**
	 * The default value of the '{@link #getLoad() <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected static final double LOAD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLoad() <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad()
	 * @generated
	 * @ordered
	 */
	protected double load = LOAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Event event;

	/**
	 * The default value of the '{@link #getSlack() <em>Slack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlack()
	 * @generated
	 * @ordered
	 */
	protected static final double SLACK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSlack() <em>Slack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlack()
	 * @generated
	 * @ordered
	 */
	protected double slack = SLACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbOfSuspension() <em>Nb Of Suspension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOfSuspension()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_OF_SUSPENSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbOfSuspension() <em>Nb Of Suspension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOfSuspension()
	 * @generated
	 * @ordered
	 */
	protected int nbOfSuspension = NB_OF_SUSPENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DEADLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected Duration deadline = DEADLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final TimeInterval RESPONSE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected TimeInterval responseTime = RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCet() <em>Cet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCet()
	 * @generated
	 * @ordered
	 */
	protected static final TimeInterval CET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCet() <em>Cet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCet()
	 * @generated
	 * @ordered
	 */
	protected TimeInterval cet = CET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * The cached value of the '{@link #getSlice() <em>Slice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlice()
	 * @generated
	 * @ordered
	 */
	protected Slice slice;

	/**
	 * The cached value of the '{@link #getSchedulingTrace() <em>Scheduling Trace</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<SchedulingTrace> schedulingTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskChainResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.TASK_CHAIN_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractResult> getSubResults() {
		if (subResults == null) {
			subResults = new EObjectContainmentEList<AbstractResult>(AbstractResult.class, this, ResultsPackage.TASK_CHAIN_RESULT__SUB_RESULTS);
		}
		return subResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLoad() {
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoad(double newLoad) {
		double oldLoad = load;
		load = newLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_CHAIN_RESULT__LOAD, oldLoad, load));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, ResultsPackage.TASK_CHAIN_RESULT__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(Event newEvent, NotificationChain msgs) {
		Event oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_CHAIN_RESULT__EVENT, oldEvent, newEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Event newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultsPackage.TASK_CHAIN_RESULT__EVENT, null, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultsPackage.TASK_CHAIN_RESULT__EVENT, null, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_CHAIN_RESULT__EVENT, newEvent, newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(Duration newDeadline) {
		Duration oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_CHAIN_RESULT__DEADLINE, oldDeadline, deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval getCet() {
		return cet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCet(TimeInterval newCet) {
		TimeInterval oldCet = cet;
		cet = newCet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_CHAIN_RESULT__CET, oldCet, cet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval getResponseTime() {
		return responseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseTime(TimeInterval newResponseTime) {
		TimeInterval oldResponseTime = responseTime;
		responseTime = newResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_CHAIN_RESULT__RESPONSE_TIME, oldResponseTime, responseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSlack() {
		return slack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlack(double newSlack) {
		double oldSlack = slack;
		slack = newSlack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_CHAIN_RESULT__SLACK, oldSlack, slack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_CHAIN_RESULT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbOfSuspension() {
		return nbOfSuspension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbOfSuspension(int newNbOfSuspension) {
		int oldNbOfSuspension = nbOfSuspension;
		nbOfSuspension = newNbOfSuspension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_CHAIN_RESULT__NB_OF_SUSPENSION, oldNbOfSuspension, nbOfSuspension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Resource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultsPackage.TASK_CHAIN_RESULT__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_CHAIN_RESULT__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slice getSlice() {
		if (slice != null && slice.eIsProxy()) {
			InternalEObject oldSlice = (InternalEObject)slice;
			slice = (Slice)eResolveProxy(oldSlice);
			if (slice != oldSlice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultsPackage.TASK_CHAIN_RESULT__SLICE, oldSlice, slice));
			}
		}
		return slice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slice basicGetSlice() {
		return slice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlice(Slice newSlice) {
		Slice oldSlice = slice;
		slice = newSlice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_CHAIN_RESULT__SLICE, oldSlice, slice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchedulingTrace> getSchedulingTrace() {
		if (schedulingTrace == null) {
			schedulingTrace = new EObjectResolvingEList<SchedulingTrace>(SchedulingTrace.class, this, ResultsPackage.TASK_CHAIN_RESULT__SCHEDULING_TRACE);
		}
		return schedulingTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultsPackage.TASK_CHAIN_RESULT__SUB_RESULTS:
				return ((InternalEList<?>)getSubResults()).basicRemove(otherEnd, msgs);
			case ResultsPackage.TASK_CHAIN_RESULT__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case ResultsPackage.TASK_CHAIN_RESULT__EVENT:
				return basicSetEvent(null, msgs);
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
			case ResultsPackage.TASK_CHAIN_RESULT__SUB_RESULTS:
				return getSubResults();
			case ResultsPackage.TASK_CHAIN_RESULT__LOAD:
				return getLoad();
			case ResultsPackage.TASK_CHAIN_RESULT__PARAMETER:
				return getParameter();
			case ResultsPackage.TASK_CHAIN_RESULT__EVENT:
				return getEvent();
			case ResultsPackage.TASK_CHAIN_RESULT__SLACK:
				return getSlack();
			case ResultsPackage.TASK_CHAIN_RESULT__PRIORITY:
				return getPriority();
			case ResultsPackage.TASK_CHAIN_RESULT__NB_OF_SUSPENSION:
				return getNbOfSuspension();
			case ResultsPackage.TASK_CHAIN_RESULT__DEADLINE:
				return getDeadline();
			case ResultsPackage.TASK_CHAIN_RESULT__RESPONSE_TIME:
				return getResponseTime();
			case ResultsPackage.TASK_CHAIN_RESULT__CET:
				return getCet();
			case ResultsPackage.TASK_CHAIN_RESULT__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case ResultsPackage.TASK_CHAIN_RESULT__SLICE:
				if (resolve) return getSlice();
				return basicGetSlice();
			case ResultsPackage.TASK_CHAIN_RESULT__SCHEDULING_TRACE:
				return getSchedulingTrace();
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
			case ResultsPackage.TASK_CHAIN_RESULT__SUB_RESULTS:
				getSubResults().clear();
				getSubResults().addAll((Collection<? extends AbstractResult>)newValue);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__LOAD:
				setLoad((Double)newValue);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__EVENT:
				setEvent((Event)newValue);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__SLACK:
				setSlack((Double)newValue);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__NB_OF_SUSPENSION:
				setNbOfSuspension((Integer)newValue);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__DEADLINE:
				setDeadline((Duration)newValue);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__RESPONSE_TIME:
				setResponseTime((TimeInterval)newValue);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__CET:
				setCet((TimeInterval)newValue);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__RESOURCE:
				setResource((Resource)newValue);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__SLICE:
				setSlice((Slice)newValue);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__SCHEDULING_TRACE:
				getSchedulingTrace().clear();
				getSchedulingTrace().addAll((Collection<? extends SchedulingTrace>)newValue);
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
			case ResultsPackage.TASK_CHAIN_RESULT__SUB_RESULTS:
				getSubResults().clear();
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__LOAD:
				setLoad(LOAD_EDEFAULT);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__PARAMETER:
				getParameter().clear();
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__EVENT:
				setEvent((Event)null);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__SLACK:
				setSlack(SLACK_EDEFAULT);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__NB_OF_SUSPENSION:
				setNbOfSuspension(NB_OF_SUSPENSION_EDEFAULT);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__DEADLINE:
				setDeadline(DEADLINE_EDEFAULT);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__RESPONSE_TIME:
				setResponseTime(RESPONSE_TIME_EDEFAULT);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__CET:
				setCet(CET_EDEFAULT);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__RESOURCE:
				setResource((Resource)null);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__SLICE:
				setSlice((Slice)null);
				return;
			case ResultsPackage.TASK_CHAIN_RESULT__SCHEDULING_TRACE:
				getSchedulingTrace().clear();
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
			case ResultsPackage.TASK_CHAIN_RESULT__SUB_RESULTS:
				return subResults != null && !subResults.isEmpty();
			case ResultsPackage.TASK_CHAIN_RESULT__LOAD:
				return load != LOAD_EDEFAULT;
			case ResultsPackage.TASK_CHAIN_RESULT__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case ResultsPackage.TASK_CHAIN_RESULT__EVENT:
				return event != null;
			case ResultsPackage.TASK_CHAIN_RESULT__SLACK:
				return slack != SLACK_EDEFAULT;
			case ResultsPackage.TASK_CHAIN_RESULT__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case ResultsPackage.TASK_CHAIN_RESULT__NB_OF_SUSPENSION:
				return nbOfSuspension != NB_OF_SUSPENSION_EDEFAULT;
			case ResultsPackage.TASK_CHAIN_RESULT__DEADLINE:
				return DEADLINE_EDEFAULT == null ? deadline != null : !DEADLINE_EDEFAULT.equals(deadline);
			case ResultsPackage.TASK_CHAIN_RESULT__RESPONSE_TIME:
				return RESPONSE_TIME_EDEFAULT == null ? responseTime != null : !RESPONSE_TIME_EDEFAULT.equals(responseTime);
			case ResultsPackage.TASK_CHAIN_RESULT__CET:
				return CET_EDEFAULT == null ? cet != null : !CET_EDEFAULT.equals(cet);
			case ResultsPackage.TASK_CHAIN_RESULT__RESOURCE:
				return resource != null;
			case ResultsPackage.TASK_CHAIN_RESULT__SLICE:
				return slice != null;
			case ResultsPackage.TASK_CHAIN_RESULT__SCHEDULING_TRACE:
				return schedulingTrace != null && !schedulingTrace.isEmpty();
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
		if (baseClass == AbstractResult.class) {
			switch (derivedFeatureID) {
				case ResultsPackage.TASK_CHAIN_RESULT__SUB_RESULTS: return ResultsPackage.ABSTRACT_RESULT__SUB_RESULTS;
				default: return -1;
			}
		}
		if (baseClass == AtomicResult.class) {
			switch (derivedFeatureID) {
				case ResultsPackage.TASK_CHAIN_RESULT__LOAD: return ResultsPackage.ATOMIC_RESULT__LOAD;
				case ResultsPackage.TASK_CHAIN_RESULT__PARAMETER: return ResultsPackage.ATOMIC_RESULT__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == TaskResult.class) {
			switch (derivedFeatureID) {
				case ResultsPackage.TASK_CHAIN_RESULT__EVENT: return ResultsPackage.TASK_RESULT__EVENT;
				case ResultsPackage.TASK_CHAIN_RESULT__SLACK: return ResultsPackage.TASK_RESULT__SLACK;
				case ResultsPackage.TASK_CHAIN_RESULT__PRIORITY: return ResultsPackage.TASK_RESULT__PRIORITY;
				case ResultsPackage.TASK_CHAIN_RESULT__NB_OF_SUSPENSION: return ResultsPackage.TASK_RESULT__NB_OF_SUSPENSION;
				case ResultsPackage.TASK_CHAIN_RESULT__DEADLINE: return ResultsPackage.TASK_RESULT__DEADLINE;
				case ResultsPackage.TASK_CHAIN_RESULT__RESPONSE_TIME: return ResultsPackage.TASK_RESULT__RESPONSE_TIME;
				case ResultsPackage.TASK_CHAIN_RESULT__CET: return ResultsPackage.TASK_RESULT__CET;
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
		if (baseClass == AbstractResult.class) {
			switch (baseFeatureID) {
				case ResultsPackage.ABSTRACT_RESULT__SUB_RESULTS: return ResultsPackage.TASK_CHAIN_RESULT__SUB_RESULTS;
				default: return -1;
			}
		}
		if (baseClass == AtomicResult.class) {
			switch (baseFeatureID) {
				case ResultsPackage.ATOMIC_RESULT__LOAD: return ResultsPackage.TASK_CHAIN_RESULT__LOAD;
				case ResultsPackage.ATOMIC_RESULT__PARAMETER: return ResultsPackage.TASK_CHAIN_RESULT__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == TaskResult.class) {
			switch (baseFeatureID) {
				case ResultsPackage.TASK_RESULT__EVENT: return ResultsPackage.TASK_CHAIN_RESULT__EVENT;
				case ResultsPackage.TASK_RESULT__SLACK: return ResultsPackage.TASK_CHAIN_RESULT__SLACK;
				case ResultsPackage.TASK_RESULT__PRIORITY: return ResultsPackage.TASK_CHAIN_RESULT__PRIORITY;
				case ResultsPackage.TASK_RESULT__NB_OF_SUSPENSION: return ResultsPackage.TASK_CHAIN_RESULT__NB_OF_SUSPENSION;
				case ResultsPackage.TASK_RESULT__DEADLINE: return ResultsPackage.TASK_CHAIN_RESULT__DEADLINE;
				case ResultsPackage.TASK_RESULT__RESPONSE_TIME: return ResultsPackage.TASK_CHAIN_RESULT__RESPONSE_TIME;
				case ResultsPackage.TASK_RESULT__CET: return ResultsPackage.TASK_CHAIN_RESULT__CET;
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
		result.append(" (load: ");
		result.append(load);
		result.append(", slack: ");
		result.append(slack);
		result.append(", priority: ");
		result.append(priority);
		result.append(", nbOfSuspension: ");
		result.append(nbOfSuspension);
		result.append(", deadline: ");
		result.append(deadline);
		result.append(", responseTime: ");
		result.append(responseTime);
		result.append(", cet: ");
		result.append(cet);
		result.append(')');
		return result.toString();
	}

} //TaskChainResultImpl
