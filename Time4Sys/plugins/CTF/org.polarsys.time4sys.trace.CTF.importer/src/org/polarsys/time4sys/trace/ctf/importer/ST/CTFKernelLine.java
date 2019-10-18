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
An implementation of the class ctfKernelLine: 
*There is 2 types of ctfLine: 
* - ctfKernelLine
* - ctfUserLine

* The following features are implemented:
* - TidPred : id of Predecessor task
* - PredName : name of Predecessor task
* - PredPrio : priority of Predecessor task

* - TidSuc : id of Successor task
* - SucName : name of Successor task
* - SucPrio : priority of Successor task

* - Command: decoding types  CTFReader.SCHED_SWITCH / CTFReader.SCHED_WAKEUP_NEW / CTFReader.SCHED_PROCESS_FREE
* 
* @author Khouloud
*
*/
public class CTFKernelLine extends CTFLine {
	
	
	private Long TidPred;
	private String PredName;
	private Integer PredPrio;
	
	private Long TidSuc;
	private String SucName;
	private Integer SucPrio;
	
	private String Command="";
	
	
	public CTFKernelLine(String line) {
		super(line);
		
	}
	
	//init kerenl line depending on type: 
	//- decode a sched_wakeup_new line
	//- decode a sched_switch line 
	//- decode a sched_process_free line
	public CTFKernelLine(String line, String type) {
		super(line);
		
		if (type.equals(CTFReader.SCHED_SWITCH))	decode_switch(line);
		if (type.equals(CTFReader.SCHED_WAKEUP_NEW))	decode_wakeup(line);
		if (type.equals(CTFReader.SCHED_PROCESS_FREE))	decode_free(line);
		//display();
	}
	
	
	public String getCommand() {
		return Command;
	}
	
	public Long getTidPred() {
		return TidPred;
	}
	
	
	public String getPredName() {
		return PredName;
	}
	
	public Integer PredPrio() {
		return PredPrio;
	}
	
	public Long getTidSuc(){
		return TidSuc;
	}
	
	public String getSucName() {
		return SucName;
	}
 	
	public Integer getSucPrio(){
		return SucPrio;
	}
	
	// decode a sched_switch line 
	public void decode_switch(String line) {
		
		Command  = CTFReader.SCHED_SWITCH;
		String[] tokens = line.split("=");
			
		String body = tokens[3];
		
		// Get TID Predecessor (i.e num thread / process)
		String[] tmps = body.split(",");
		String ID = tmps[0].substring(1, tmps[0].length());;
		TidPred = Long.valueOf(ID); 
		
		// get Predecessor Name of the kernel thread / process
		body = tokens[2];
		tmps = body.split(",");
		PredName = tmps[0].substring(2, tmps[0].length()-1);

		// Get TID Predecessor PRIO 
		body = tokens[4];
		tmps = body.split(",");
		ID = tmps[0].substring(1, tmps[0].length());;
		PredPrio = Integer.valueOf(ID); 
	
		/* Get TID  Successor (ie. Num of the Thread) */
		body = tokens[7];
		String[] tmp2s = body.split(",");
		ID = tmp2s[0].substring(1, tmp2s[0].length());
		TidSuc= Long.valueOf(ID);
		
		// get Predecessor Name of the kernel thread / process
		body = tokens[6];
		tmps = body.split(",");
		SucName = tmps[0].substring(2, tmps[0].length()-1);
		
		// Get TID Successor PRIO 
		body = tokens[8];
		tmps = body.split(",");
		ID = tmps[0].substring(1, tmps[0].length()-2);;
		SucPrio = Integer.valueOf(ID); 
	}
	
	// decode a sched_wakeup_new line 
	public void decode_wakeup(String line) {
		Command  = CTFReader.SCHED_WAKEUP_NEW;
		
		String[] tokens = line.split("=");
		
		String body = tokens[3];
		
		// Get TID of the thread Created (i.e num thread / process)
		String[] tmps = body.split(",");
		String ID = tmps[0].substring(1, tmps[0].length());;
		TidPred = Long.valueOf(ID);
		
		// get Predecessor Name of the kernel thread / process
		body = tokens[2];
		tmps = body.split(",");
		PredName = tmps[0].substring(2, tmps[0].length()-1);

		// Get TID Predecessor PRIO 
		body = tokens[4];
		tmps = body.split(",");
		ID = tmps[0].substring(1, tmps[0].length());;
		PredPrio = Integer.valueOf(ID); 
		
		TidSuc = -1L;
		SucName="";
		SucPrio=0;	
		//System.out.println("COMMAND= " + Command + ":  TID_Pred = " + TidPred);
		
	}
	
	// decode a sched_process_free line
	public void decode_free(String line) {
		Command  = CTFReader.SCHED_PROCESS_FREE;
		
		String[] tokens = line.split("=");
		
		String body = tokens[3];
		
		// Get TID of the thread Created (i.e num thread / process)
		String[] tmps = body.split(",");
		String ID = tmps[0].substring(1, tmps[0].length());;
		TidPred = Long.valueOf(ID);
		
		// get Predecessor Name of the kernel thread / process
		body = tokens[2];
		tmps = body.split(",");
		PredName = tmps[0].substring(2, tmps[0].length()-1);

		// Get TID Predecessor PRIO 
		body = tokens[4];
		tmps = body.split(" ");
		ID = tmps[1].substring(1, tmps[1].length());;
		PredPrio = Integer.valueOf(ID); 
		
		TidSuc = -1L;
		SucName="";
		SucPrio=0;	
		//System.out.println("COMMAND= " + Command + ":  TID_Pred = " + TidPred + " PRIO = " + PredPrio );
	
	}
	
	public void display() {
		//super.display();
		//System.out.println("--- Kernel Body ---");
		if (Command.equals(CTFReader.SCHED_SWITCH)) {
			System.out.print(Command + ":  TID_Pred = " + TidPred + " | PredName = "+ PredName + " | PredPrio= " + PredPrio);
			System.out.println(" ||  TID_Succ = " + TidSuc + " | SucName = " + SucName + " | SucPrio = " + SucPrio);
		}
		else  {
			System.out.print(Command + ":  TID_Pred = " + TidPred);
		} 
	}
	
}
