/*******************************************************************************
 * Copyright (c) 2019 Link Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Khouloud BOUDHHIR / Oualid KHAYATI - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.trace.ctf.importer.ST;
/**
An implementation of the class State

* Associate State to Action : add / remove Transition 
* 
* @author Khouloud
*
*/
import java.util.HashMap;
import java.util.Map;

public class State {

	    private HashMap<String, State> mMapping = new HashMap<>();
	    private String mStateName;

	    public State(String stateName) {
	        mStateName = stateName;
	    }


	    public Map<String, State> getAdjacentStates() {
	        return mMapping;
	    }


	    public String getStateDesc() {
	        return mStateName;
	    }


	    public void addTransit(Action action, State state) {
	        mMapping.put(action.toString(), state);
	    }

	
	    public void removeTransit(String targetStateDesc) {
	        // get action which directs to target state
	        String targetAction = null;
	        for (Map.Entry<String, State> entry : mMapping.entrySet()) {
	            State state = entry.getValue();
	            if (state.getStateDesc().equals(targetStateDesc)) {
	                targetAction = entry.getKey();
	            }
	        }
	        mMapping.remove(targetAction);
	    }

	}
