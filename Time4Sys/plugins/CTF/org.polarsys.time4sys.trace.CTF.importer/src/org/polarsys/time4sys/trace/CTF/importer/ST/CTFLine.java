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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
  An implementation of the class CTFLine
 
 * The following features are implemented:
 * - Timestamp
 * - Host
 * - CPU
 * 
 * @author Khouloud
 *
 */
public class CTFLine {
	
	private double timestamp;
	private String host;
	private String CPU;
	
// init CTF Line : init timestamp from parsing date in CTF File , init CPU from splitting line with " " ( tab[7])
	public CTFLine(String line) {
		
		//***** getTimestamp
		
		timestamp = 0;
		
		if (line.length()>19) { 
			
			String hour = line.substring(1, 9);
			String n = line.substring(10,19);
			Long nano;
			
			 DateFormat df = new SimpleDateFormat("HH:mm:ss");
			
			// Parse the date
		        try {
		            Date date = df.parse(hour);
		            nano = date.getTime();
		            
		            // miss 1 hour so add 1 hour in millisecond
		            nano += 3600000L;
		            // convert in nano second
		             nano = nano * 1000000L;
		            
		             // convert microsecond to Long and to nanosecond
		             Long nano2 = Long.valueOf(n);
		                         
		             timestamp = nano + nano2;
		             
		         }
		        catch(ParseException pe) {
		            System.out.println("ERROR: could not parse date in string \"" +
		                hour + "\"");
		        }
		}   
			//***** gethost
			CPU = "";
			host = "";
		
			String[] tokens = line.split(" ");
			if (tokens.length >=7) {
				host = tokens[2];
				//getCPU
				CPU = "CPU_";
				CPU = CPU.concat(tokens[7]);
			}
	}
	
	
	public double getTimeStamp() {
		return timestamp;
	}
	
	public String gethost() {
		return host;
	}
	
	public String getCPU() {
		return CPU;
	}
	
	public void display() {
		System.out.println("==> HEADER ****");
		System.out.print("  Timestamp = " + timestamp);
		System.out.print(" || Host = " + host);
		System.out.println(" || CPU = " + CPU);
	}
}
