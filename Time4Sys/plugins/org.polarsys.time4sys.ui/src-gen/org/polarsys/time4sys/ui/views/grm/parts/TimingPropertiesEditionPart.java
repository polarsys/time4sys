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
package org.polarsys.time4sys.ui.views.grm.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;


// End of user code

/**
 * 
 * 
 */
public interface TimingPropertiesEditionPart {

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
	 * @return the otherSchedPolicy
	 * 
	 */
	public String getOtherSchedPolicy();

	/**
	 * Defines a new otherSchedPolicy
	 * @param newValue the new otherSchedPolicy to set
	 * 
	 */
	public void setOtherSchedPolicy(String newValue);


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
	 * @return the priorityCeiling
	 * 
	 */
	public String getPriorityCeiling();

	/**
	 * Defines a new priorityCeiling
	 * @param newValue the new priorityCeiling to set
	 * 
	 */
	public void setPriorityCeiling(String newValue);


	/**
	 * @return the preemptionLevel
	 * 
	 */
	public String getPreemptionLevel();

	/**
	 * Defines a new preemptionLevel
	 * @param newValue the new preemptionLevel to set
	 * 
	 */
	public void setPreemptionLevel(String newValue);


	/**
	 * @return the execTime
	 * 
	 */
	public String getExecTime();

	/**
	 * Defines a new execTime
	 * @param newValue the new execTime to set
	 * 
	 */
	public void setExecTime(String newValue);





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
