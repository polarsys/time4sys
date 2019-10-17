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
An implementation of the class ImportJob

* The following features are implemented:
* - job
* - task : each job is assigned to task
* - FSM: creating the FSM to parse the CTF and  doing actions according to the state of the FSM
* @author Khouloud
*
*/
import java.util.ArrayList;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.schedulingtrace.Job;
import org.polarsys.time4sys.schedulingtrace.SchedulingtraceFactory;
import org.polarsys.time4sys.schedulingtrace.TaskTrace;
import org.polarsys.time4sys.trace.SchedulingEvent;
import org.polarsys.time4sys.trace.SchedulingEventKind;
import org.polarsys.time4sys.trace.SliceKind;
import org.polarsys.time4sys.trace.TraceFactory;

public class ImportJob {
	private Job job = null;
	private ImportTaskTrace task = null;
	private FiniteStateMachine fsm;
	
	private ArrayList<ImportFunction> fcts;

	 public ImportJob(Long Tid, ImportTaskTrace  mytask) {
		
		    task = mytask;
			job = SchedulingtraceFactory.eINSTANCE.createJob();
			job.setName(mytask.getName()+"#"+Tid.toString());
			job.setKind(SliceKind.JOB);
			job.setKindLabel(SliceKind.JOB.getName());
			job.setId(Tid);
			task.getTaskTrace().getJobs().add(job);
			task.getTaskTrace().getSubSlices().add(job);  // to keep the compliance with Trace metamodel / slices
			
		    fcts  = new ArrayList<ImportFunction>();
		    
		    // initialise the FSM
		    fsm = new FiniteStateMachine("JOB");
	        
	        // Create the FSM
	        init_fsm();
	 }
	 
	 public ImportTaskTrace   getImportTaskTrace() {
		 return task;
	 }
	 
	 public Job getJob() {
		 return job;
	 }
	 
	 public String getName() {
		 return job.getName();
	 }

	 public Long getTid() {
		 return job.getId();
	 }

	 // CREATE Here your own FSM to parse the CTF 
	 public void init_fsm() {
		 
		// System.out.println("Init FSM : " + job.getId());
	
		 // Create all states
		 State startState = new State("Start");
		 State endState = new State("Terminated");
		 fsm.setStartState(startState);
	     fsm.setEndState(endState);
		 
	     State activated = new State("Activated");
		 State running = new State("Running");
		 State suspended = new State("Suspended");
		 
		 // Create all transitions
		 Action a1 = new Action("Wakeup");
		 Action a2 = new Action("Succ");
		 Action a3 = new Action("Pred");
		 Action a4 = new Action("Free");
		 
		 // create links
		 fsm.addState(startState, activated, a1);
		 fsm.addState(startState, suspended, a3);
		 fsm.addState(startState, running, a2);
		 
		 fsm.addState(activated, endState, a4);
		 fsm.addState(activated, running, a2);
		 
		 fsm.addState(running, endState, a4);
		 fsm.addState(running, suspended, a3);
		 
		 fsm.addState(suspended, endState, a4);
		 fsm.addState(suspended, running, a2);
	 }
	 
	 // do actions according to the state of the FSM
	 public void fsm_do_action(CTFLine myline) {
		 
		 if (myline instanceof CTFKernelLine) { // check if it is a Kernel line
			   
			  CTFKernelLine line = (CTFKernelLine) myline; 
			  
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
	
					job.getEvents().add(evt);
					evt.getAbout().add(job);	
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

				job.getEvents().add(evt);
				evt.getAbout().add(job); 			 
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

				job.getEvents().add(evt);
				evt.getAbout().add(job);
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

				job.getEvents().add(evt);
				evt.getAbout().add(job);		 				 
			}
		 
		 }
	 }
	 
	 //PARSING THE CTF TRACE LINE 
	 public void parse(CTFLine myline) {
		 
		 if (myline instanceof CTFKernelLine) { // check if it is a Kernel line
			   
			  CTFKernelLine line = (CTFKernelLine) myline; 
		 
			  Action a = null;
			  Boolean result= false;
			  
			 if (line.getCommand().equals(CTFReader.SCHED_WAKEUP_NEW)) {
				 if (line.getTidPred() == job.getId()) { 
					 a = new Action("Wakeup");
				 }
			 }
			 
			 if (line.getCommand().equals(CTFReader.SCHED_PROCESS_FREE)) {
				 if (line.getTidPred() == job.getId()) { 
					 a = new Action("Free");
				 }
			 }
			 
			 if (line.getCommand().equals(CTFReader.SCHED_SWITCH)) {
				 // check if the job is concern by the pred or succ
				 if (line.getTidPred() == job.getId()) { // it is a predecessor ==> Supended 
					 a = new Action("Pred");
				 }
				 
				 if (line.getTidSuc()== job.getId()) { // it is a successor ==> Running // or Activated
					 
					/* if (fsm.getCurrentState().getStateDesc().equals("Start")) { // add automatically the activate event
						 a = new Action("Wakeup");
						 result = fsm.transit(a);
						 if (!result) System.out.println("ERROR1 ");
						 fsm_do_action(line); 

					 } */
					 a = new Action("Succ");
				 }
			 }
			 
			 //call the transition
			 if (a != null) {
				 result = fsm.transit(a);		    		 
		    		if (!result) {
		    			System.out.println(" [\"" + fsm.getname() + "\":" + job.getId() + "]"); 
		    		} 

		    	 
			      fsm_do_action(line);

			     //System.out.println(fsm.getCurrentState().getStateDesc());
		 	}
			 
			 
			 // parse the line to functions Instance
			 for(int i=0; i< fcts.size(); i++) {
				 ImportFunction myfct = fcts.get(i);
				 myfct.parse(line);
			 }
		     
		 } // end kernel Line 
		 
		 if (myline instanceof CTFUserLine) { // check if it is a User line
			  
			     CTFUserLine line = (CTFUserLine) myline; 
				 boolean found = false;
				 int i =0;
				 ImportFunction myfct = null;
				 String s = line.getFunctionName() + "#" + line.getTaskId().toString();
				 
				 while ((i<fcts.size()) && (!found)) {
					 myfct = fcts.get(i);
					 String fctname = myfct.getName();
					 
					 if  (fctname.equals(s) ) {
						 found = true;
					 }
					 i++;
				 }
				 if (found) {
					 myfct.parse(line);
				 }
				 else {
					 // Not found and related to the job so create the function and parse the line 
					 if (job.getId() == line.getTaskId()) {
						 myfct = new ImportFunction(job, line);
						 fcts.add(myfct);
						 myfct.parse(line);
					 }
				 }	 
			 }
	 }
	 
}
