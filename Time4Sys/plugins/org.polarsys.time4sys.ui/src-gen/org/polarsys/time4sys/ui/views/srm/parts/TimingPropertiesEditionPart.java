/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 * Generated with Acceleo
 */
package org.polarsys.time4sys.ui.views.srm.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface TimingPropertiesEditionPart {

	/**
	 * @return the capacity
	 * 
	 */
	public String getCapacity();

	/**
	 * Defines a new capacity
	 * @param newValue the new capacity to set
	 * 
	 */
	public void setCapacity(String newValue);


	/**
	 * @return the isPeriodic
	 * 
	 */
	public Boolean getIsPeriodic();

	/**
	 * Defines a new isPeriodic
	 * @param newValue the new isPeriodic to set
	 * 
	 */
	public void setIsPeriodic(Boolean newValue);


	/**
	 * @return the isPreemptable
	 * 
	 */
	public Boolean getIsPreemptable();

	/**
	 * Defines a new isPreemptable
	 * @param newValue the new isPreemptable to set
	 * 
	 */
	public void setIsPreemptable(Boolean newValue);


	/**
	 * @return the isFixedMessageSize
	 * 
	 */
	public Boolean getIsFixedMessageSize();

	/**
	 * Defines a new isFixedMessageSize
	 * @param newValue the new isFixedMessageSize to set
	 * 
	 */
	public void setIsFixedMessageSize(Boolean newValue);


	/**
	 * @return the duration
	 * 
	 */
	public String getDuration();

	/**
	 * Defines a new duration
	 * @param newValue the new duration to set
	 * 
	 */
	public void setDuration(String newValue);


	/**
	 * @return the arrivalPattern
	 * 
	 */
	public String getArrivalPattern();

	/**
	 * Defines a new arrivalPattern
	 * @param newValue the new arrivalPattern to set
	 * 
	 */
	public void setArrivalPattern(String newValue);


	/**
	 * @return the packetTime
	 * 
	 */
	public String getPacketTime();

	/**
	 * Defines a new packetTime
	 * @param newValue the new packetTime to set
	 * 
	 */
	public void setPacketTime(String newValue);


	/**
	 * @return the blockingTime
	 * 
	 */
	public String getBlockingTime();

	/**
	 * Defines a new blockingTime
	 * @param newValue the new blockingTime to set
	 * 
	 */
	public void setBlockingTime(String newValue);


	/**
	 * @return the waitingQueueCapacity
	 * 
	 */
	public String getWaitingQueueCapacity();

	/**
	 * Defines a new waitingQueueCapacity
	 * @param newValue the new waitingQueueCapacity to set
	 * 
	 */
	public void setWaitingQueueCapacity(String newValue);


	/**
	 * @return the waitingQueuePolicy
	 * 
	 */
	public Enumerator getWaitingQueuePolicy();

	/**
	 * Init the waitingQueuePolicy
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initWaitingQueuePolicy(Object input, Enumerator current);

	/**
	 * Defines a new waitingQueuePolicy
	 * @param newValue the new waitingQueuePolicy to set
	 * 
	 */
	public void setWaitingQueuePolicy(Enumerator newValue);


	/**
	 * @return the policy
	 * 
	 */
	public Enumerator getPolicy();

	/**
	 * Init the policy
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initPolicy(Object input, Enumerator current);

	/**
	 * Defines a new policy
	 * @param newValue the new policy to set
	 * 
	 */
	public void setPolicy(Enumerator newValue);


	/**
	 * @return the messageQueuePolicy
	 * 
	 */
	public Enumerator getMessageQueuePolicy();

	/**
	 * Init the messageQueuePolicy
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initMessageQueuePolicy(Object input, Enumerator current);

	/**
	 * Defines a new messageQueuePolicy
	 * @param newValue the new messageQueuePolicy to set
	 * 
	 */
	public void setMessageQueuePolicy(Enumerator newValue);


	/**
	 * @return the mechanism
	 * 
	 */
	public Enumerator getMechanism();

	/**
	 * Init the mechanism
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initMechanism(Object input, Enumerator current);

	/**
	 * Defines a new mechanism
	 * @param newValue the new mechanism to set
	 * 
	 */
	public void setMechanism(Enumerator newValue);


	/**
	 * @return the transmMode
	 * 
	 */
	public Enumerator getTransmMode();

	/**
	 * Init the transmMode
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initTransmMode(Object input, Enumerator current);

	/**
	 * Defines a new transmMode
	 * @param newValue the new transmMode to set
	 * 
	 */
	public void setTransmMode(Enumerator newValue);


	/**
	 * @return the concurrentAccessProtocol
	 * 
	 */
	public Enumerator getConcurrentAccessProtocol();

	/**
	 * Init the concurrentAccessProtocol
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initConcurrentAccessProtocol(Object input, Enumerator current);

	/**
	 * Defines a new concurrentAccessProtocol
	 * @param newValue the new concurrentAccessProtocol to set
	 * 
	 */
	public void setConcurrentAccessProtocol(Enumerator newValue);


	/**
	 * @return the accessPolicy
	 * 
	 */
	public Enumerator getAccessPolicy();

	/**
	 * Init the accessPolicy
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initAccessPolicy(Object input, Enumerator current);

	/**
	 * Defines a new accessPolicy
	 * @param newValue the new accessPolicy to set
	 * 
	 */
	public void setAccessPolicy(Enumerator newValue);


	/**
	 * @return the durationElements
	 * 
	 */
	public EList getDurationElements();

	/**
	 * Defines a new durationElements
	 * @param newValue the new durationElements to set
	 * 
	 */
	public void setDurationElements(EList newValue);

	/**
	 * Add a value to the durationElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToDurationElements(Object newValue);

	/**
	 * Remove a value to the durationElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToDurationElements(Object newValue);


	/**
	 * @return the messageQueueCapacityElements
	 * 
	 */
	public EList getMessageQueueCapacityElements();

	/**
	 * Defines a new messageQueueCapacityElements
	 * @param newValue the new messageQueueCapacityElements to set
	 * 
	 */
	public void setMessageQueueCapacityElements(EList newValue);

	/**
	 * Add a value to the messageQueueCapacityElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToMessageQueueCapacityElements(Object newValue);

	/**
	 * Remove a value to the messageQueueCapacityElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToMessageQueueCapacityElements(Object newValue);


	/**
	 * @return the priorityElements
	 * 
	 */
	public EList getPriorityElements();

	/**
	 * Defines a new priorityElements
	 * @param newValue the new priorityElements to set
	 * 
	 */
	public void setPriorityElements(EList newValue);

	/**
	 * Add a value to the priorityElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToPriorityElements(Object newValue);

	/**
	 * Remove a value to the priorityElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToPriorityElements(Object newValue);


	/**
	 * @return the messageSizeElements
	 * 
	 */
	public EList getMessageSizeElements();

	/**
	 * Defines a new messageSizeElements
	 * @param newValue the new messageSizeElements to set
	 * 
	 */
	public void setMessageSizeElements(EList newValue);

	/**
	 * Add a value to the messageSizeElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToMessageSizeElements(Object newValue);

	/**
	 * Remove a value to the messageSizeElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToMessageSizeElements(Object newValue);


	/**
	 * @return the occurenceCountElements
	 * 
	 */
	public EList getOccurenceCountElements();

	/**
	 * Defines a new occurenceCountElements
	 * @param newValue the new occurenceCountElements to set
	 * 
	 */
	public void setOccurenceCountElements(EList newValue);

	/**
	 * Add a value to the occurenceCountElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToOccurenceCountElements(Object newValue);

	/**
	 * Remove a value to the occurenceCountElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToOccurenceCountElements(Object newValue);


	/**
	 * @return the waitingPolicyElements
	 * 
	 */
	public EList getWaitingPolicyElements();

	/**
	 * Defines a new waitingPolicyElements
	 * @param newValue the new waitingPolicyElements to set
	 * 
	 */
	public void setWaitingPolicyElements(EList newValue);

	/**
	 * Add a value to the waitingPolicyElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToWaitingPolicyElements(Object newValue);

	/**
	 * Remove a value to the waitingPolicyElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToWaitingPolicyElements(Object newValue);


	/**
	 * @return the deadlineElements
	 * 
	 */
	public EList getDeadlineElements();

	/**
	 * Defines a new deadlineElements
	 * @param newValue the new deadlineElements to set
	 * 
	 */
	public void setDeadlineElements(EList newValue);

	/**
	 * Add a value to the deadlineElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToDeadlineElements(Object newValue);

	/**
	 * Remove a value to the deadlineElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToDeadlineElements(Object newValue);


	/**
	 * @return the deadlineTypeElements
	 * 
	 */
	public EList getDeadlineTypeElements();

	/**
	 * Defines a new deadlineTypeElements
	 * @param newValue the new deadlineTypeElements to set
	 * 
	 */
	public void setDeadlineTypeElements(EList newValue);

	/**
	 * Add a value to the deadlineTypeElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToDeadlineTypeElements(Object newValue);

	/**
	 * Remove a value to the deadlineTypeElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToDeadlineTypeElements(Object newValue);


	/**
	 * @return the timeSliceElements
	 * 
	 */
	public EList getTimeSliceElements();

	/**
	 * Defines a new timeSliceElements
	 * @param newValue the new timeSliceElements to set
	 * 
	 */
	public void setTimeSliceElements(EList newValue);

	/**
	 * Add a value to the timeSliceElements multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToTimeSliceElements(Object newValue);

	/**
	 * Remove a value to the timeSliceElements multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToTimeSliceElements(Object newValue);




	/**
	 * Init the accCtrlPolicy
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAccCtrlPolicy(ReferencesTableSettings settings);

	/**
	 * Update the accCtrlPolicy
	 * @param newValue the accCtrlPolicy to update
	 * 
	 */
	public void updateAccCtrlPolicy();

	/**
	 * Adds the given filter to the accCtrlPolicy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAccCtrlPolicy(ViewerFilter filter);

	/**
	 * Adds the given filter to the accCtrlPolicy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAccCtrlPolicy(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the accCtrlPolicy table
	 * 
	 */
	public boolean isContainedInAccCtrlPolicyTable(EObject element);




	/**
	 * Init the resCtrlPolicy
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initResCtrlPolicy(ReferencesTableSettings settings);

	/**
	 * Update the resCtrlPolicy
	 * @param newValue the resCtrlPolicy to update
	 * 
	 */
	public void updateResCtrlPolicy();

	/**
	 * Adds the given filter to the resCtrlPolicy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResCtrlPolicy(ViewerFilter filter);

	/**
	 * Adds the given filter to the resCtrlPolicy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResCtrlPolicy(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the resCtrlPolicy table
	 * 
	 */
	public boolean isContainedInResCtrlPolicyTable(EObject element);




	/**
	 * Init the accessTokenElements
	 * @param settings settings for the accessTokenElements ReferencesTable 
	 */
	public void initAccessTokenElements(ReferencesTableSettings settings);

	/**
	 * Update the accessTokenElements
	 * @param newValue the accessTokenElements to update
	 * 
	 */
	public void updateAccessTokenElements();

	/**
	 * Adds the given filter to the accessTokenElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAccessTokenElements(ViewerFilter filter);

	/**
	 * Adds the given filter to the accessTokenElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAccessTokenElements(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the accessTokenElements table
	 * 
	 */
	public boolean isContainedInAccessTokenElementsTable(EObject element);




	/**
	 * Init the mutualExclusionResources
	 * @param settings settings for the mutualExclusionResources ReferencesTable 
	 */
	public void initMutualExclusionResources(ReferencesTableSettings settings);

	/**
	 * Update the mutualExclusionResources
	 * @param newValue the mutualExclusionResources to update
	 * 
	 */
	public void updateMutualExclusionResources();

	/**
	 * Adds the given filter to the mutualExclusionResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMutualExclusionResources(ViewerFilter filter);

	/**
	 * Adds the given filter to the mutualExclusionResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMutualExclusionResources(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the mutualExclusionResources table
	 * 
	 */
	public boolean isContainedInMutualExclusionResourcesTable(EObject element);




	/**
	 * Init the timers
	 * @param settings settings for the timers ReferencesTable 
	 */
	public void initTimers(ReferencesTableSettings settings);

	/**
	 * Update the timers
	 * @param newValue the timers to update
	 * 
	 */
	public void updateTimers();

	/**
	 * Adds the given filter to the timers edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTimers(ViewerFilter filter);

	/**
	 * Adds the given filter to the timers edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTimers(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the timers table
	 * 
	 */
	public boolean isContainedInTimersTable(EObject element);




	/**
	 * Init the protectParams
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initProtectParams(ReferencesTableSettings settings);

	/**
	 * Update the protectParams
	 * @param newValue the protectParams to update
	 * 
	 */
	public void updateProtectParams();

	/**
	 * Adds the given filter to the protectParams edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProtectParams(ViewerFilter filter);

	/**
	 * Adds the given filter to the protectParams edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProtectParams(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the protectParams table
	 * 
	 */
	public boolean isContainedInProtectParamsTable(EObject element);




	/**
	 * Init the concurrentResources
	 * @param settings settings for the concurrentResources ReferencesTable 
	 */
	public void initConcurrentResources(ReferencesTableSettings settings);

	/**
	 * Update the concurrentResources
	 * @param newValue the concurrentResources to update
	 * 
	 */
	public void updateConcurrentResources();

	/**
	 * Adds the given filter to the concurrentResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToConcurrentResources(ViewerFilter filter);

	/**
	 * Adds the given filter to the concurrentResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToConcurrentResources(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the concurrentResources table
	 * 
	 */
	public boolean isContainedInConcurrentResourcesTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
