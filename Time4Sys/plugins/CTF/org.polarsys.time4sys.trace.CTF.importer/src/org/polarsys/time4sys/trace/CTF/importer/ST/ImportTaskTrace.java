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
An implementation of the class ImportTaskTrace

* The following features are implemented:
* - taskTrace
* - processor
* - jobs: list of import jobs for task
* 
* @author Khouloud
*
*/
import java.util.ArrayList;

import org.polarsys.time4sys.schedulingtrace.Job;
import org.polarsys.time4sys.schedulingtrace.Partition;
import org.polarsys.time4sys.schedulingtrace.PreemptedBy;
import org.polarsys.time4sys.schedulingtrace.Processor;
import org.polarsys.time4sys.schedulingtrace.SchedulingTrace;
import org.polarsys.time4sys.schedulingtrace.SchedulingtraceFactory;
import org.polarsys.time4sys.schedulingtrace.TaskTrace;
import org.polarsys.time4sys.trace.Slice;
import org.polarsys.time4sys.trace.SliceKind;

public class ImportTaskTrace {
	
	 private TaskTrace task = null;
	 private ImportProcessor processor = null;
	 private ArrayList<ImportJob> jobs;

	 public ImportTaskTrace(String name, Long TID, ImportProcessor proc) {
		
		    processor = proc;
			task = SchedulingtraceFactory.eINSTANCE.createTaskTrace();
			String User_Task = CTFReader.TaskMapping.get(TID);
			if (User_Task !=null) {
				task.setName(name + "#" + User_Task);
			}
			else task.setName(name);
			task.setKind(SliceKind.TASK);
			task.setKindLabel(SliceKind.TASK.getName());	
			proc.getProcessor().getTasktraces().add(task);
			proc.getProcessor().getSubSlices().add(task); // to keep the compliance with Trace metamodel / slices
			
			jobs = new ArrayList<ImportJob>();
	 }
	 
	 public ImportProcessor  getProcessor() {
		 return processor;
	 }
	 
	 public TaskTrace  getTaskTrace() {
		 return task;
	 }
	 
	 public String getName() {
		 return task.getName();
	 }

	 
	 //PARSING THE CTF TRACE LINE 	 
	 public Job parse(CTFLine myline) {
		   
		 	ImportJob myimportJob = null;
		 	ImportJob myimportJob2 = null;		
			
		 
		   if (myline instanceof CTFKernelLine) { // check if it is a Kernel line
			   
			  CTFKernelLine line = (CTFKernelLine) myline; 
			
			      String linename = line.getPredName();
			      
			      String task_name = CTFReader.TaskMapping.get(line.getTidPred());
			     
			      if (task_name !=null) {
			    	  linename = linename + "#" + task_name;
			      }
			      		      
			      if (linename.equals( task.getName()) ) { // check if the Pred concern the task 
			  
					  // find the job 
					  boolean found = false;
					  int i =0;
					  
					  while ((i<jobs.size()) && (!found)) {
						  myimportJob = jobs.get(i);
						  if  (line.getTidPred().longValue()== myimportJob.getTid().longValue() ) {
							  found = true;
						  }
						  i++;
					  }
			          
					  if (!found) { // if job do not exist so create the job
						  
						  // check if the job is not already created for another task
						  ImportJob myJob = processor.getJob(line.getTidPred());
						  
						  if ((myJob!=null)) {					  
								  myimportJob = myJob;
						  }
						  else { // do not exist at processor level and at task level so create it
							  ImportJob myjob = new ImportJob(line.getTidPred(), this);
							  //System.out.println("Create Job Pred Init : " +  myjob.getName());
							  myimportJob = myjob;
							  jobs.add(myimportJob);
							  processor.addJob(myimportJob);
						  }
					  }		
					  
					  /* (myimportJob.getImportTaskTrace().task.getName().equals(line.getPredName())) */
					  
	                // check of the task is concerned by the line 
					if (myimportJob!=null) {
						    myimportJob.parse(line);
					}
			  		
			   } // end check the name of Pred 
			      
	   	       if (line.getCommand().equals(CTFReader.SCHED_SWITCH)) {  	    	
	   	    	      
	   	    	// compute the name of the task 
	   	    	String lineSuccname = line.getSucName();  
	   	    	
	   	    	String task_name2 = CTFReader.TaskMapping.get(line.getTidSuc());
	   	    	
	   	    	if (task_name2 != null) {
	   	    		lineSuccname  = lineSuccname + "#" + task_name2;
	   	    	}
			      
                 if (lineSuccname.equals(task.getName()) ) {
                	 
	  	    	// find the job 
					  boolean found2 = false;
					  int j =0;
					  
					  while ((j<jobs.size()) && (!found2)) {
						  myimportJob2 = jobs.get(j);
						  if  (line.getTidSuc().longValue() == myimportJob2.getTid().longValue()) {
							  found2 = true;			  
						  }
						  j++;
					  }

					  
					  if (!found2)  { // if job do not exist so create the job && Name == current task name
						  // check if the job is not already created for another task
						  ImportJob myJob2 = processor.getJob(line.getTidSuc());
						  
						  if ((myJob2!=null)) {		// already exists at processor level so it is already linked to another task	  
							  myimportJob2 = myJob2;
							  }
						  else { // do not exist at processor level and at task level so create it
							  ImportJob myjob2 = new ImportJob(line.getTidSuc(), this);
							 // System.out.println("Create Job Succ Init : " +  myjob2.getName());
							  myimportJob2 = myjob2;
							  jobs.add(myimportJob2);
							  processor.addJob(myimportJob2);
						  }
					  }  
	   	    	
				   	  if (myimportJob2!=null) {
							  myimportJob2.parse(line);
					   } 
				   	  
				   	   // set the preemptedby attribute by the Pred ImportJob
				       ImportJob myjobpred = processor.getJob(line.getTidPred());
				   	   if (myjobpred != null) {
				   			PreemptedBy PB_job = SchedulingtraceFactory.eINSTANCE.createPreemptedBy();
				   			PB_job.setJob(myimportJob2.getJob());
				   			
				   			PB_job.setTimeStamp(myjobpred.getJob().getLatestTimestamp());
				   			myjobpred .getJob().getListPreemptedBy().add(PB_job); 
				   	   }
                 }
			  } // end Switch command
		} // end Kernel Line
		   
		if (myline instanceof CTFUserLine) { // check if it is a User line
			   
			CTFUserLine line = (CTFUserLine) myline;
			for (int i =0; i < jobs.size(); i++) {
				 ImportJob myjob = jobs.get(i);
				 myjob.parse(line);
			 }	  
		 }
		Job myjob = null;
		
		if (myimportJob !=null) myjob = myimportJob.getJob();
		if (myimportJob2 != null) myjob =  myimportJob2.getJob();
		return myjob;
	 }
	 
	 
}
