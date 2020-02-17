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
An implementation of the class ImportFunction

* The following features are implemented:
* - FunctionInstance
* - TID: task id
* - job : each function instance is assigned to a job
* - FSM: creating the FSM to parse the CTF and  doing actions according to the state of the FSM
* @author Khouloud
*
*/
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.schedulingtrace.FunctionInstance;
import org.polarsys.time4sys.schedulingtrace.Job;
import org.polarsys.time4sys.schedulingtrace.SchedulingtraceFactory;
import org.polarsys.time4sys.trace.SchedulingEvent;
import org.polarsys.time4sys.trace.SchedulingEventKind;
import org.polarsys.time4sys.trace.SliceKind;
import org.polarsys.time4sys.trace.Trace;
import org.polarsys.time4sys.trace.TraceFactory;

public class ImportFunction {
	
	private FunctionInstance fct = null;
	private Long TID;
	private Job job = null;
	private FiniteStateMachine fsm;
	
	 public ImportFunction(Job myjob, CTFUserLine line) {
		 
		    String name = line.getFunctionName();
		    line.getTaskName();
		    job = myjob;
		    TID = job.getId();
			fct = SchedulingtraceFactory.eINSTANCE.createFunctionInstance();
			fct.setName(name + "#" + TID.toString());
			fct.setKind(SliceKind.FUNCTION_INSTANCE);
			fct.setKindLabel(SliceKind.FUNCTION_INSTANCE.getName());
			fct.setId(TID);
			
			job.getFunctionInstances().add(fct);
		   job.getSubSlices().add(fct);  // to keep the compliance with Trace metamodel / slices
			
			// initialise the FSM
		    fsm = new FiniteStateMachine("Function");
		    
		 // Create the FSM
	        init_fsm();
	 }
	 
     public String getName() {
    	 return fct.getName();
     }
     
     public Long getTID() {
    	 return TID;
     }
     
  // CREATE Here your own FSM to parse the CTF 
  	 public void init_fsm() {
  	
  		 // Create all states
  		 State startState = new State("Start");
  		 State endState = new State("Terminated");
  		 fsm.setStartState(startState);
  	     fsm.setEndState(endState);
  		 
  	     State activated = new State("Activated");
  		 State running = new State("Running");
  		 State suspended = new State("Suspended");
  		 
  		 // Create all transitions
  		 Action a1 = new Action("Begin");
  		 Action a2 = new Action("Succ");
  		 Action a3 = new Action("Pred");
  		 Action a4 = new Action("End");

  		 // create links
  		 fsm.addState(startState, activated, a1);
  		 
  		 fsm.addState(activated, running, a1);
  		 
  		 fsm.addState(running, endState, a4);
  		 fsm.addState(running, suspended, a3);

  		 fsm.addState(suspended, running, a2);
  	 }
  	 
  // do actions according to the state of the FSM
  	 public void fsm_do_action(CTFLine myline) {
  		 
  		 if (myline instanceof CTFUserLine) { // check if it is a Kernel line
  			   
  			  CTFUserLine line = (CTFUserLine) myline; 
  			  
  			 // state == Activated
  			 if (fsm.getCurrentState().getStateDesc().equals("Activated")) {
  				 
  				    SchedulingEvent evt = TraceFactory.eINSTANCE.createSchedulingEvent();
  					Double t =  line.getTimeStamp();
  					
  					String val = t.toString() + "ns";
  					Duration d = NfpFactory.eINSTANCE.createDurationFromString(val);	
  					
  					//Set timeStamp of the Event
  					evt.setTimestamp(d);
  					evt.setKind(SchedulingEventKind.ACTIVATED);
  					evt.setTrace(TraceCTFImporterSchedulingTrace.trace);
  					TraceCTFImporterSchedulingTrace.trace.getEvents().add(evt);
  	
  					fct.getEvents().add(evt);
  					evt.getAbout().add(fct);	
  			 }
  			 
  			// state == Running
  			if (fsm.getCurrentState().getStateDesc().equals("Running")) {
  				SchedulingEvent evt = TraceFactory.eINSTANCE.createSchedulingEvent();
  				Double t =  line.getTimeStamp();
  				
  				String val = t.toString() + "ns";
  				Duration d = NfpFactory.eINSTANCE.createDurationFromString(val);	
  				
  				//Set timeStamp of the Event
  				evt.setTimestamp(d);
  				evt.setKind(SchedulingEventKind.RUNNING);
  				evt.setTrace(TraceCTFImporterSchedulingTrace.trace);
  				TraceCTFImporterSchedulingTrace.trace.getEvents().add(evt);

  				fct.getEvents().add(evt);
  				evt.getAbout().add(fct); 			 
  			}
  			
  			// state == Terminated
  			if (fsm.getCurrentState().getStateDesc().equals("Terminated")) {
  				SchedulingEvent evt = TraceFactory.eINSTANCE.createSchedulingEvent();
  				Double t =  line.getTimeStamp();
  				
  				String val = t.toString() + "ns";
  				Duration d = NfpFactory.eINSTANCE.createDurationFromString(val);	
  				
  				//Set timeStamp of the Event
  				evt.setTimestamp(d);
  				evt.setKind(SchedulingEventKind.TERMINATED);
  				evt.setTrace(TraceCTFImporterSchedulingTrace.trace);
  				TraceCTFImporterSchedulingTrace.trace.getEvents().add(evt);

  				fct.getEvents().add(evt);
  				evt.getAbout().add(fct);		 				 
  			}
  		 
  		 }
  		if (myline instanceof CTFKernelLine) { // check if it is a Kernel line
			   
			  CTFKernelLine line = (CTFKernelLine) myline; 
			  			 
			// state == Running
			if (fsm.getCurrentState().getStateDesc().equals("Running")) {
				SchedulingEvent evt = TraceFactory.eINSTANCE.createSchedulingEvent();
				Double t =  line.getTimeStamp();
				
				String val = t.toString() + "ns";
				Duration d = NfpFactory.eINSTANCE.createDurationFromString(val);	
				
				//Set timeStamp of the Event
				evt.setTimestamp(d);
				evt.setKind(SchedulingEventKind.RUNNING);
				evt.setTrace(TraceCTFImporterSchedulingTrace.trace);
				TraceCTFImporterSchedulingTrace.trace.getEvents().add(evt);

				fct.getEvents().add(evt);
				evt.getAbout().add(fct); 			 
			}
			
			// state == Suspended
			if (fsm.getCurrentState().getStateDesc().equals("Suspended")) {
				SchedulingEvent evt = TraceFactory.eINSTANCE.createSchedulingEvent();
				Double t =  line.getTimeStamp();
				
				String val = t.toString() + "ns";
				Duration d = NfpFactory.eINSTANCE.createDurationFromString(val);	
				
				//Set timeStamp of the Event
				evt.setTimestamp(d);
				evt.setKind(SchedulingEventKind.SUSPENDED);
				evt.setTrace(TraceCTFImporterSchedulingTrace.trace);
				TraceCTFImporterSchedulingTrace.trace.getEvents().add(evt);

				fct.getEvents().add(evt);
				evt.getAbout().add(fct);
			}
		 }
  	 }
  	 
     public void parse(CTFLine myline) {
    	 
    	 if (myline instanceof CTFUserLine) { // check if it is a User line
			  
		     CTFUserLine line = (CTFUserLine) myline; 
		     Boolean result = false;
		     Action a = null;
		     
	    	 String status = line.getStatus();
	    	 long line_tid = line.getTaskId().longValue();
	    	 
	    	 if (line_tid == 2117) {
	    		 int a1 =0;
	    		 a1++;
	    	 }
	    	
	    	 if ( ((status.equals("Begin")) ||  (status.equals("BeginC"))) && (line_tid ==TID.longValue())) {
	    		 if (fsm.getCurrentState().getStateDesc().equals("Start")) { // add automatically the activate event
					 a = new Action("Begin");
					 result = fsm.transit(a);
					 if (result) fsm_do_action(line);
				 }
				 a = new Action("Begin");				
	    		 
	    	 }
	    	 if ( ((status.equals("End")) || (status.equals("EndC"))) && (line_tid==TID.longValue())) {
	    		 a = new Action("End");
	    	 }
	    	 
	    	 
	    	 //call the transition
			 if (a != null) {
				 result = fsm.transit(a);
			     if (result)  {
			    	 fsm_do_action(line);
			     }
			     else {
			    	 System.out.println(" [\"" + fsm.getname() + "\":" + TID + "]"); 
			     }
			     //System.out.println(fsm.getCurrentState().getStateDesc());
		 	}
			 
	     } // End CTF User Line
    	 
    	 if (myline instanceof CTFKernelLine) { // check if it is a User line
			  
    		// treatment the KernelLine only if the Function as started and not terminated
		 	String currentState = fsm.getCurrentState().getStateDesc();
    		 
	    	if ( (currentState.equals("Running")) || (currentState.equals("Suspended")) ) {
	    			 
			     CTFKernelLine line = (CTFKernelLine) myline; 
			     Boolean result = false;
			     Action a = null;
			     
		    	 if (line.getCommand().equals(CTFReader.SCHED_SWITCH)) {
					 // check if the job is concern by the pred or succ
					 if (line.getTidPred() == job.getId()) { // it is a predecessor ==> Supended 
						 a = new Action("Pred");
					 }
					 
					 if (line.getTidSuc()== job.getId()) { // it is a successor ==> Running // or Activated
						 a = new Action("Succ");
					 }
				 }
				 
				 //call the transition
				 if (a != null) {
					 result = fsm.transit(a);
				     if (result) fsm_do_action(line);
				     else {
				    	 System.out.println(" [\"" + fsm.getname() + "\":" + TID + "]"); 
				     }
			 	}
			   
	    	 } // end "Running" or "Suspended"

	     } // End CTF kernel Line
     }
}
