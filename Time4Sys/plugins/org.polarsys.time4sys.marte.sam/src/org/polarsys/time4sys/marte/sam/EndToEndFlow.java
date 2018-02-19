/**
 */
package org.polarsys.time4sys.marte.sam;

import org.eclipse.emf.common.util.EList;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.FlowInvolvedElement;
import org.polarsys.time4sys.marte.gqam.TimedObserver;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.annotation.annotation.AnnotatedElement;
import org.polarsys.time4sys.marte.nfp.coreelements.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End To End Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * End-to-end flows describe a unit of processing work in the analyzed system, which contend for use of the processing
 * resources. This is a conceptual entity only, which is represented by its concrete elements: end-to-end stimuli and end-to-
 * end response.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getEndToEndStimuli <em>End To End Stimuli</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getEndToEndScenario <em>End To End Scenario</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#isIsSchedulable <em>Is Schedulable</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getSchedulabilitySlack <em>Schedulability Slack</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getEndToEndTime <em>End To End Time</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getEndToEndDeadline <em>End To End Deadline</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getTiming <em>Timing</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getInvolvedElement <em>Involved Element</em>}</li>
 * </ul>
 *
 * @see org.polarsys.time4sys.marte.sam.SamPackage#getEndToEndFlow()
 * @model
 * @generated
 */
public interface EndToEndFlow extends NamedElement, AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>End To End Stimuli</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.WorkloadEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End To End Stimuli</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End To End Stimuli</em>' reference list.
	 * @see org.polarsys.time4sys.marte.sam.SamPackage#getEndToEndFlow_EndToEndStimuli()
	 * @model
	 * @generated
	 */
	EList<WorkloadEvent> getEndToEndStimuli();

	/**
	 * Returns the value of the '<em><b>End To End Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End To End Scenario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End To End Scenario</em>' reference.
	 * @see #setEndToEndScenario(BehaviorScenario)
	 * @see org.polarsys.time4sys.marte.sam.SamPackage#getEndToEndFlow_EndToEndScenario()
	 * @model required="true"
	 * @generated
	 */
	BehaviorScenario getEndToEndScenario();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getEndToEndScenario <em>End To End Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End To End Scenario</em>' reference.
	 * @see #getEndToEndScenario()
	 * @generated
	 */
	void setEndToEndScenario(BehaviorScenario value);

	/**
	 * Returns the value of the '<em><b>Is Schedulable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Schedulable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Schedulable</em>' attribute.
	 * @see #setIsSchedulable(boolean)
	 * @see org.polarsys.time4sys.marte.sam.SamPackage#getEndToEndFlow_IsSchedulable()
	 * @model
	 * @generated
	 */
	boolean isIsSchedulable();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#isIsSchedulable <em>Is Schedulable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Schedulable</em>' attribute.
	 * @see #isIsSchedulable()
	 * @generated
	 */
	void setIsSchedulable(boolean value);

	/**
	 * Returns the value of the '<em><b>Schedulability Slack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedulability Slack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedulability Slack</em>' attribute.
	 * @see #setSchedulabilitySlack(double)
	 * @see org.polarsys.time4sys.marte.sam.SamPackage#getEndToEndFlow_SchedulabilitySlack()
	 * @model
	 * @generated
	 */
	double getSchedulabilitySlack();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getSchedulabilitySlack <em>Schedulability Slack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedulability Slack</em>' attribute.
	 * @see #getSchedulabilitySlack()
	 * @generated
	 */
	void setSchedulabilitySlack(double value);

	/**
	 * Returns the value of the '<em><b>End To End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End To End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End To End Time</em>' attribute.
	 * @see #setEndToEndTime(Duration)
	 * @see org.polarsys.time4sys.marte.sam.SamPackage#getEndToEndFlow_EndToEndTime()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration"
	 * @generated
	 */
	Duration getEndToEndTime();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getEndToEndTime <em>End To End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End To End Time</em>' attribute.
	 * @see #getEndToEndTime()
	 * @generated
	 */
	void setEndToEndTime(Duration value);

	/**
	 * Returns the value of the '<em><b>End To End Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End To End Deadline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End To End Deadline</em>' attribute.
	 * @see #setEndToEndDeadline(Duration)
	 * @see org.polarsys.time4sys.marte.sam.SamPackage#getEndToEndFlow_EndToEndDeadline()
	 * @model dataType="org.polarsys.time4sys.marte.gqam.NFP_Duration"
	 * @generated
	 */
	Duration getEndToEndDeadline();

	/**
	 * Sets the value of the '{@link org.polarsys.time4sys.marte.sam.EndToEndFlow#getEndToEndDeadline <em>End To End Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End To End Deadline</em>' attribute.
	 * @see #getEndToEndDeadline()
	 * @generated
	 */
	void setEndToEndDeadline(Duration value);

	/**
	 * Returns the value of the '<em><b>Timing</b></em>' containment reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.TimedObserver}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing</em>' containment reference list.
	 * @see org.polarsys.time4sys.marte.sam.SamPackage#getEndToEndFlow_Timing()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimedObserver> getTiming();

	/**
	 * Returns the value of the '<em><b>Involved Element</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.time4sys.marte.gqam.FlowInvolvedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements  involved in the specific path of interest in the context of the targeted performance analysis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Involved Element</em>' reference list.
	 * @see org.polarsys.time4sys.marte.sam.SamPackage#getEndToEndFlow_InvolvedElement()
	 * @model
	 * @generated
	 */
	EList<FlowInvolvedElement> getInvolvedElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return all steps and sub-BehaviorScenarios who are on the path from stimuli to response.
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<BehaviorScenario> findStepsOnPath();

} // EndToEndFlow
