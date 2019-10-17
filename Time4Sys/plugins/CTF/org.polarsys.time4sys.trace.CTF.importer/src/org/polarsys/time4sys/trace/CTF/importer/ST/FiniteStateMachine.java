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
package org.polarsys.time4sys.trace.CTF.importer.ST;
/**
An implementation of the class FiniteStateMachine: 

* The following features are implemented:
* - StartState
* -	EndState
* -	CurrentState
* - AllStates* 
* @author Khouloud
*
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FiniteStateMachine {
    private State mStartState;
    private State mEndState;
    private State mCurrentState;
    private ArrayList<State> mAllStates = new ArrayList<>();
    private HashMap<String, ArrayList<State>> mMapForAllStates = new HashMap<>();
    private String name = null;

    public FiniteStateMachine() { }
  
    public FiniteStateMachine(String fsmname) {
		name = fsmname;
	}

	public void setStartState(State startState) {
        mStartState = startState;
        mCurrentState = startState;
        mAllStates.add(startState);
        // todo: might have some value
        mMapForAllStates.put(startState.getStateDesc(), new ArrayList<State>());
    }

    public String getname() {
    	return name;
    }

    public void setEndState(State endState) {
        mEndState = endState;
        mAllStates.add(endState);
        mMapForAllStates.put(endState.getStateDesc(), new ArrayList<State>());
    }

 
    public void addState(State startState, State newState, Action action) {
        // validate startState, newState and action

        // update mapping in finite state machine
        mAllStates.add(newState);
        final String startStateDesc = startState.getStateDesc();
        final String newStateDesc = newState.getStateDesc();
        mMapForAllStates.put(newStateDesc, new ArrayList<State>());
        ArrayList<State> adjacentStateList = null;
        if (mMapForAllStates.containsKey(startStateDesc)) {
            adjacentStateList = mMapForAllStates.get(startStateDesc);
            adjacentStateList.add(newState);
        } else {
            mAllStates.add(startState);
            adjacentStateList = new ArrayList<>();
            adjacentStateList.add(newState);
        }
        mMapForAllStates.put(startStateDesc, adjacentStateList);

        // update mapping in startState
        for (State state : mAllStates) {
            boolean isStartState = state.getStateDesc().equals(startState.getStateDesc());
            if (isStartState) {
                startState.addTransit(action, newState);
            }
        }
    }


    public void removeState(String targetStateDesc) {
        // validate state
        if (!mMapForAllStates.containsKey(targetStateDesc)) {
            throw new RuntimeException("Don't have state: " + targetStateDesc);
        } else {
            // remove from mapping
            mMapForAllStates.remove(targetStateDesc);
        }

        // update all state
        State targetState = null;
        for (State state : mAllStates) {
            if (state.getStateDesc().equals(targetStateDesc)) {
                targetState = state;
            } else {
                state.removeTransit(targetStateDesc);
            }
        }

        mAllStates.remove(targetState);

    }


    public State getCurrentState() {
        return mCurrentState;
    }


    public boolean transit(Action action) {
    	boolean  status = false;
    	
        if (mCurrentState == null) {
        	System.out.println("Error FSM: \"" + name + "\" - Please setup start state");
        }
        Map<String, State> localMapping = mCurrentState.getAdjacentStates();
        if (localMapping.containsKey(action.toString())) {
            mCurrentState = localMapping.get(action.toString());
            status = true;
        } else {
        	 System.out.print("Warning no action : \"" + action.toString()+ "\" from state: \"" + mCurrentState.getStateDesc()+"\"");
            //throw new RuntimeException("No action start from current state");
        }
        return status;
    }

    public State getStartState() {
        return mStartState;
    }

    public State getEndState() {
        return mEndState;
    }
}