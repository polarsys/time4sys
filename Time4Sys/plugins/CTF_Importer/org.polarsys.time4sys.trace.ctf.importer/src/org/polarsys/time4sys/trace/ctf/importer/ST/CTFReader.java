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
An implementation of the class CTFReader: 

* The following features are implemented:
* - ArrayList<CTFKernelLine> Kernel
* -	ArrayList<CTFUserLine> User
* -	ArrayList<CTFLine> CTFlines : CTFKernelLine and  CTFUserLine

* 
* @author Khouloud
*
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


/****************************/
/* CLASS CTF file READER 	*/
/****************************/

public class CTFReader {
	
	// ATTRIBUTES
	ArrayList<CTFKernelLine> Kernel;
	ArrayList<CTFUserLine> User;
	ArrayList<CTFLine> CTFlines;
	public final static HashMap<Long, String> TaskMapping = new HashMap<>(); // store link between TaskName in the user line and The Thread ID (TID)
	
	public final static String SCHED_SWITCH = "sched_switch";
	public final static String SCHED_WAKEUP_NEW = "sched_wakeup_new";
	public final static String SCHED_PROCESS_FREE = "sched_process_free";
	
  // CONSTRUCTOR: READ THE WHOLE CTF FILE
	public CTFReader(String filePath) {
		// TODO Auto-generated constructor stub

		System.out.println("file = " + filePath);	

	    User = new ArrayList<CTFUserLine>();
	    Kernel = new ArrayList<CTFKernelLine>();
	    CTFlines = new ArrayList<CTFLine>();
		
		try {
			
			// Read All lines
			File file = new File(filePath);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			int j = 0;
			int linetype = 0;
			System.out.print("Loading ... ");
			
			while ((line = bufferedReader.readLine()) != null) {
			
		
				j++;
	
				
				// identify Kernel or User Trace Line
			
				linetype = LineKind(line);
				CTFKernelLine KL;
				
				switch (linetype) {
			       		    // OTHER 
					case 0:  //System.out.print(" OTHER");
							 break;
					
							// USer Tracepoint line 
		            case 1:  CTFUserLine UL = new CTFUserLine(line);
		                     CTFlines.add(UL); 
							 User.add(UL);
							 break;
							
							 // KERNEL LINE sched_switch 
					case 2:  KL = new CTFKernelLine(line, CTFReader.SCHED_SWITCH); 
					 		 CTFlines.add(KL); 
					 		 Kernel.add(KL);
					 		 break;
					 		 
							 // KERNEL LINE sched_switch 
					case 3:  KL = new CTFKernelLine(line, CTFReader.SCHED_WAKEUP_NEW);
					         CTFlines.add(KL);
					 		 Kernel.add(KL);
					 		 break;
					 		 
							 // KERNEL LINE sched_switch 
					case 4:  KL = new CTFKernelLine(line, CTFReader.SCHED_PROCESS_FREE);
					         CTFlines.add(KL);
					 		 Kernel.add(KL);
					 		 break;
					 		
	                    
				}
				//System.out.println("");
			}
			System.out.println(".. Done !");
			
			fileReader.close();
			
			System.out.println("Nb CTF Lines = " + CTFlines.size());
			System.out.println("Nb Users Lines = " + User.size());
			System.out.println("Nb Kernel Lines = " + Kernel.size());

            // create the MAP between Thread id and Function Task
			CTFUserLine userline;
			
			for(int i=0; i < User.size(); i++) {
				userline = User.get(i);
				String myname = TaskMapping.get(userline.getTaskId());
				
				if (myname ==null) {
					TaskMapping.put(userline.getTaskId(), userline.getTaskName());
				}				
			}
			System.out.println("Tasks mapping = " + TaskMapping.size());
			

		} catch (IOException e) {
				e.printStackTrace();
		 }
	}
	
	// Check if the kind of the Line : USER trace Line or KERNEL trace Line or OTHER
	private int LineKind (String line) {

		/* RESULT = 0 ==> OTHER LINE */
		/* RESULT = 1 ==> Tracepoint User Line */
		/* RESULT = 2 ==> Sched Switch KERNEL LINE */
		/* RESULT = 3 ==> Sched Wakeup New KERNEL LINE */
		/* RESULT = 4 ==> Sched Process Free KERNEL LINE */
		
		int result = 0;
		String[] tokens = line.split(" ");
		if (tokens.length>2) {
			String s = tokens[3];

			// is it a "sched_switch:" line ?
			if (s.equals(CTFReader.SCHED_SWITCH + ":")){
				result = 2;
			} 
			
			// is it a "Wakeup line:" line ?
			if (s.equals(CTFReader.SCHED_WAKEUP_NEW +":")){
				result = 3;
			} 
			
			// is it a "sched process Free:" line ?
			if (s.equals(CTFReader.SCHED_PROCESS_FREE + ":")){
				result = 4;
			} 
			if (result ==0) {
				// Is it a "tracepoint" in the line 
				if ( s.length()>11) {
					String t = s.substring(s.length()-11, s.length()-1);
					if (t.equals("tracepoint")){
						result = 1;
					}
				}
			}
		}
		return result;
	}
	
	//return the array of CTF Users Lines
	public ArrayList<CTFUserLine> getUser() {
		return User;
	}
	
	//return the CTF Users Line n°i
	public CTFUserLine getUser(int i) {
		return User.get(i);
	}
	
	//return the array of CTF Kernel Lines
	public ArrayList<CTFKernelLine> getKernel() {
		return Kernel;
	}
	
	//return the CTF Kernel Line n°i
	public CTFKernelLine getKernel(int i) {
		return Kernel.get(i);
	}
	
	//return the array of CTF Lines
	 public ArrayList<CTFLine> getCTFlines() {
			return CTFlines;
		}
		
		//return the CTF Kernel Line n°i
		public CTFLine getCTFline(int i) {
			return CTFlines.get(i);
		}
		
		
	private void createTidList(ArrayList<CTFUserLine> user, ArrayList<Long> T_id) {
		Long mytid;
		boolean found;
		
		for(int i=0; i< user.size(); i++){
			mytid = user.get(i).getTaskId();
			found = false;
			for(int j=0; (j<T_id.size()) && (!found); j++) {
				if (mytid.equals(T_id.get(j))) {
					found = true;
				}
			}
			if (!found) {
				T_id.add(mytid); 
			}
		}
		System.out.println("Nb Users TID  = " + T_id.size());
	}
	
	
	private void KernelFiltering(ArrayList<CTFKernelLine> kernel, ArrayList<CTFUserLine> user) {
		
		ArrayList<Long> T_id;
		boolean found;
		
		T_id = new ArrayList<Long>();
		createTidList(user, T_id);
		
		for (int i = 0; i < kernel.size(); i++) {
			found = false;
			for (int j=0; (j< T_id.size()) && (!found); j++) {
				if ( (T_id.get(j).equals(kernel.get(i).getTidPred())) || (T_id.get(j).equals(kernel.get(i).getTidSuc())) ) {
					found = true;
				}
			}
			// if not found remove the kernel line
			if (!found) {
				kernel.remove(i);
			}
		}
		System.out.println("Nb Kernel Lines reduced = " + kernel.size());
	}
}
