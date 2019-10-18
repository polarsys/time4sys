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
An implementation of the class ImportProcessor

* The following features are implemented:
* - processor
* - tasks : list of tasks for processor
* - jobMapping:the list of ImportJobs for each taskId
* 
* @author Khouloud
*
*/
import java.util.ArrayList;
import java.util.HashMap;

import org.polarsys.time4sys.schedulingtrace.Job;

import org.polarsys.time4sys.schedulingtrace.Processor;
import org.polarsys.time4sys.schedulingtrace.SchedulingtraceFactory;
import org.polarsys.time4sys.trace.SliceKind;

public class ImportProcessor {
	
	 private Processor processor = null;
	 private ArrayList<ImportTaskTrace> tasks;
	 private HashMap<Long, ImportJob> jobMapping = new HashMap<>();

	 public ImportProcessor(CTFLine line) {
		
		    
		    String mycpu = line.getCPU();
		    System.out.println("Found CPU= " + mycpu);
			processor = SchedulingtraceFactory.eINSTANCE.createProcessor();
			processor.setName(mycpu);
			processor.setKind(SliceKind.RESOURCE);
			processor.setKindLabel(SliceKind.RESOURCE.getName());
			TraceCTFImporterSchedulingTrace.trace.getProcessors().add(processor);
			
			tasks = new ArrayList<ImportTaskTrace>();

	 }
	 
	 public Processor  getProcessor() {
		 return processor;
	 }
	 
	 public String getName() {
		 return processor.getName();
	 }

	 public void addJob(ImportJob job) {
		 jobMapping.put(job.getTid(), job);
	 }
	 
	 public ImportJob getJob(Long tid) {
		  ImportJob job = null;
		 
		  job = jobMapping.get(tid);
		  return job;
	 }
	 
	 //PARSING THE CTF TRACE LINE 	 
	 public void parse(CTFLine line) {
		 
		 // check if the line concern the Processor
		 if (line.getCPU().equals(processor.getName())) {
		 
			 if (line instanceof CTFKernelLine) {
				 Job predJob = null;
				 Job succJob = null;
				 
				 CTFKernelLine myline = (CTFKernelLine) line;
				 
				 // check if prev task exists if not create it
				 String t = "";
				 boolean found = false;
				 int i = 0;
	             
				 String mytaskname = myline.getPredName(); 
				 String task_name = CTFReader.TaskMapping.get(myline.getTidPred());
			     
			      if (task_name !=null) {
			    	  mytaskname = mytaskname + "#" + task_name;
			      }
			      
				 ImportTaskTrace myITT = null;
				    
					// check if importTask already created
					while ( (i< tasks.size()) && (!found)) {
						t = tasks.get(i).getName();
						if (t.equals(mytaskname))  {
								found = true;
								myITT = tasks.get(i);
						}
						i++;
					}
					
					// if importTask is not found so create it
					if (!found)  {
						
						ImportJob myJob = jobMapping.get(myline.getTidPred());
						
						if (myJob!=null) { //job already created so task as well
							
							myITT = myJob.getImportTaskTrace();
						}
						else {
							ImportTaskTrace mytt = new ImportTaskTrace(myline.getPredName(), myline.getTidPred(), this);
							//System.out.println("Create Task Pred : " +  mytt.getName());
							tasks.add(mytt);					
							myITT = mytt;
						}
					}
					
			     // ask the ImporttraceTask to parse the line
					predJob = myITT.parse(line);
				 
			    // if command == SWITCH so we have to manage the Successor 
				ImportTaskTrace SucITT = null;
					
  			if (myline.getCommand().equals(CTFReader.SCHED_SWITCH)) {
					// check if succ task exists if not create it
						String my = "";
						Boolean found2 = false;
						int j = 0;
		
						String Suctaskname = myline.getSucName();
						
						String task_name2 = CTFReader.TaskMapping.get(myline.getTidSuc());
					     
					      if (task_name2 !=null) {
					    	  Suctaskname = Suctaskname + "#" + task_name2;
					      }
					      
						// check if importTask already created
						while ( (j< tasks.size() ) && (!found2)) {
							my = tasks.get(j).getName();
							if (my.equals(Suctaskname))  {
									found2 = true;
									SucITT = tasks.get(j);
							}
							j++;
						}
							
						// if importTask ot fund so create it
						if (!found2) {
							
							ImportJob myJob2 = jobMapping.get(myline.getTidSuc());
							
							if (myJob2!=null) { //job already created so task as well
								
								SucITT = myJob2.getImportTaskTrace();
							}
							else {
								
								ImportTaskTrace mytt = new ImportTaskTrace(myline.getSucName(), myline.getTidSuc(), this);
								//System.out.println("Create Task Succ : " +  mytt.getName());
								SucITT = mytt;
								tasks.add(SucITT);
							}
						}
						
						// ask the ImporttraceTask to parse the line (except it is the same task both Pred and Succ)
						if (myITT != SucITT) {
							succJob = SucITT.parse(myline);
						}
						
						
						//predJob.setPreemptedBy(succJob);
			 	  } 
			 } // end Kernel Line
			 
			 
			 if (line instanceof CTFUserLine) {
				 int i =0;
				 for (i=0; i<tasks.size(); i++) {
					 ImportTaskTrace mytask = tasks.get(i);
					 mytask.parse(line);
				 }
				
			 } // end CTF User Line
		 } // end test Processor 
	
	 }
	 
}
