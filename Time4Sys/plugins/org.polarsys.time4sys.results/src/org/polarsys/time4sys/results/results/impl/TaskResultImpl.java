/**
 */
package org.polarsys.time4sys.results.results.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.TimeInterval;

import org.polarsys.time4sys.results.results.Event;
import org.polarsys.time4sys.results.results.ResultsPackage;
import org.polarsys.time4sys.results.results.TaskResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskResultImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskResultImpl#getSlack <em>Slack</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskResultImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskResultImpl#getNbOfSuspension <em>Nb Of Suspension</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskResultImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskResultImpl#getBCET <em>BCET</em>}</li>
 *   <li>{@link org.polarsys.time4sys.results.results.impl.TaskResultImpl#getWCET <em>WCET</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskResultImpl extends AtomicResultImpl implements TaskResult {
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
	 * The default value of the '{@link #getBCET() <em>BCET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCET()
	 * @generated
	 * @ordered
	 */
	protected static final Duration BCET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBCET() <em>BCET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCET()
	 * @generated
	 * @ordered
	 */
	protected Duration bcet = BCET_EDEFAULT;

	/**
	 * The default value of the '{@link #getWCET() <em>WCET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWCET()
	 * @generated
	 * @ordered
	 */
	protected static final Duration WCET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWCET() <em>WCET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWCET()
	 * @generated
	 * @ordered
	 */
	protected Duration wcet = WCET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.TASK_RESULT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_RESULT__EVENT, oldEvent, newEvent);
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
				msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultsPackage.TASK_RESULT__EVENT, null, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultsPackage.TASK_RESULT__EVENT, null, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_RESULT__EVENT, newEvent, newEvent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_RESULT__DEADLINE, oldDeadline, deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getBCET() {
		return bcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBCET(Duration newBCET) {
		Duration oldBCET = bcet;
		bcet = newBCET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_RESULT__BCET, oldBCET, bcet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getWCET() {
		return wcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWCET(Duration newWCET) {
		Duration oldWCET = wcet;
		wcet = newWCET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_RESULT__WCET, oldWCET, wcet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_RESULT__SLACK, oldSlack, slack));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_RESULT__PRIORITY, oldPriority, priority));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.TASK_RESULT__NB_OF_SUSPENSION, oldNbOfSuspension, nbOfSuspension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultsPackage.TASK_RESULT__EVENT:
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
			case ResultsPackage.TASK_RESULT__EVENT:
				return getEvent();
			case ResultsPackage.TASK_RESULT__SLACK:
				return getSlack();
			case ResultsPackage.TASK_RESULT__PRIORITY:
				return getPriority();
			case ResultsPackage.TASK_RESULT__NB_OF_SUSPENSION:
				return getNbOfSuspension();
			case ResultsPackage.TASK_RESULT__DEADLINE:
				return getDeadline();
			case ResultsPackage.TASK_RESULT__BCET:
				return getBCET();
			case ResultsPackage.TASK_RESULT__WCET:
				return getWCET();
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
			case ResultsPackage.TASK_RESULT__EVENT:
				setEvent((Event)newValue);
				return;
			case ResultsPackage.TASK_RESULT__SLACK:
				setSlack((Double)newValue);
				return;
			case ResultsPackage.TASK_RESULT__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case ResultsPackage.TASK_RESULT__NB_OF_SUSPENSION:
				setNbOfSuspension((Integer)newValue);
				return;
			case ResultsPackage.TASK_RESULT__DEADLINE:
				setDeadline((Duration)newValue);
				return;
			case ResultsPackage.TASK_RESULT__BCET:
				setBCET((Duration)newValue);
				return;
			case ResultsPackage.TASK_RESULT__WCET:
				setWCET((Duration)newValue);
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
			case ResultsPackage.TASK_RESULT__EVENT:
				setEvent((Event)null);
				return;
			case ResultsPackage.TASK_RESULT__SLACK:
				setSlack(SLACK_EDEFAULT);
				return;
			case ResultsPackage.TASK_RESULT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case ResultsPackage.TASK_RESULT__NB_OF_SUSPENSION:
				setNbOfSuspension(NB_OF_SUSPENSION_EDEFAULT);
				return;
			case ResultsPackage.TASK_RESULT__DEADLINE:
				setDeadline(DEADLINE_EDEFAULT);
				return;
			case ResultsPackage.TASK_RESULT__BCET:
				setBCET(BCET_EDEFAULT);
				return;
			case ResultsPackage.TASK_RESULT__WCET:
				setWCET(WCET_EDEFAULT);
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
			case ResultsPackage.TASK_RESULT__EVENT:
				return event != null;
			case ResultsPackage.TASK_RESULT__SLACK:
				return slack != SLACK_EDEFAULT;
			case ResultsPackage.TASK_RESULT__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case ResultsPackage.TASK_RESULT__NB_OF_SUSPENSION:
				return nbOfSuspension != NB_OF_SUSPENSION_EDEFAULT;
			case ResultsPackage.TASK_RESULT__DEADLINE:
				return DEADLINE_EDEFAULT == null ? deadline != null : !DEADLINE_EDEFAULT.equals(deadline);
			case ResultsPackage.TASK_RESULT__BCET:
				return BCET_EDEFAULT == null ? bcet != null : !BCET_EDEFAULT.equals(bcet);
			case ResultsPackage.TASK_RESULT__WCET:
				return WCET_EDEFAULT == null ? wcet != null : !WCET_EDEFAULT.equals(wcet);
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
		result.append(" (slack: ");
		result.append(slack);
		result.append(", priority: ");
		result.append(priority);
		result.append(", nbOfSuspension: ");
		result.append(nbOfSuspension);
		result.append(", deadline: ");
		result.append(deadline);
		result.append(", BCET: ");
		result.append(bcet);
		result.append(", WCET: ");
		result.append(wcet);
		result.append(')');
		return result.toString();
	}

} //TaskResultImpl
