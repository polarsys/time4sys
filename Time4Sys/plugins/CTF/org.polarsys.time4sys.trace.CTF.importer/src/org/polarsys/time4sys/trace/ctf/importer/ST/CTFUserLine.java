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
An implementation of the class CTFUserLine: 
*There is 2 types of CTFLine: 
* - CTFKernelLine
* - CTFUserLine

* The following features are implemented:
* - TaskId
* - TaskName
* - FunctionName
* - Status

* 
* @author Khouloud
*
*/
public class CTFUserLine extends CTFLine {
	

	
	private Long TaskId;
	private String TaskName;
	private String FunctionName;
	private String Status;
	
	public CTFUserLine(String line) {
		super(line);
		decode(line);
		//display();
	}
	
	// decoding CTF Line
	public void decode(String line) {
		String[] tokens = line.split(" ");
		
		/* Get TASKID (ie. Num of the Thread) */
		String tmp = tokens[12];
		String ID = tmp.substring(0, tmp.length()-1);
		TaskId = Long.valueOf(ID);
		
		/* Get Task Name  */
		tmp = tokens[15];
		TaskName = tmp.substring(1, tmp.length()-2);
		
		/* Get Function Name  */
		tmp = tokens[18];
		FunctionName = tmp.substring(1, tmp.length()-2);
		
		/* Get Function Name  */
		tmp = tokens[21];
		Status = tmp.substring(1, tmp.length()-1);
	}
	
	public Long getTaskId() {
		return TaskId;
	}
	
	public String getTaskName() {
		return TaskName;
	}
	
	public String getFunctionName(){
		return FunctionName;
	}
	
	public String getStatus(){
		return Status;
	}
	
	public void display() {
		display();
		System.out.println("--- User Body ---");
		System.out.print("  TaskID = " + TaskId);
		System.out.print(" || TaskName = " + TaskName);
		System.out.print(" || FunctionName = " + FunctionName);
		System.out.println(" ||  Status = " + Status);
	}
}