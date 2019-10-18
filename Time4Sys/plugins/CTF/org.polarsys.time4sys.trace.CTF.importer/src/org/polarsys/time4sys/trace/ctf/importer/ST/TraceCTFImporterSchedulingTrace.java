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
An implementation of the class TraceCTFImporterSchedulingTrace
 The following features are implemented:
* - procs: list of ImportProcessor
* - SchedulingTrace
* 
* @author Khouloud
*
*/
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.design.DesignPackage;
import org.polarsys.time4sys.marte.grm.ResourcePackage;
import org.polarsys.time4sys.marte.grm.ResourcePackageableElement;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;
import org.polarsys.time4sys.marte.nfp.impl.DurationImpl;
import org.polarsys.time4sys.marte.nfp.util.DurationComparator;
import org.polarsys.time4sys.trace.Event;
import org.polarsys.time4sys.trace.SchedulingEvent;
import org.polarsys.time4sys.trace.SchedulingEventKind;
import org.polarsys.time4sys.trace.Slice;
import org.polarsys.time4sys.trace.SliceKind;
import org.polarsys.time4sys.trace.Trace;
import org.polarsys.time4sys.trace.TraceFactory;
import org.polarsys.time4sys.trace.TracePackage;
import org.polarsys.time4sys.trace.util.EventTimestampComparator;


//import org.polarsys.time4sys.schedulingtrace.model;


import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Time4sysPackage;
import org.polarsys.time4sys.schedulingtrace.Job;
import org.polarsys.time4sys.schedulingtrace.Processor;
import org.polarsys.time4sys.schedulingtrace.SchedulingTrace;
import org.polarsys.time4sys.schedulingtrace.SchedulingtraceFactory;
import org.polarsys.time4sys.schedulingtrace.TaskTrace;

public class TraceCTFImporterSchedulingTrace {
	
	static ArrayList<ImportProcessor> procs;
	static SchedulingTrace trace; 
	
	public TraceCTFImporterSchedulingTrace() {
		
	}
	
	public static void initXMIResources() {
		TracePackage.eINSTANCE.eClass();
		Time4sysPackage.eINSTANCE.eClass();
		DesignPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(TracePackage.eINSTANCE.getName(), new XMIResourceFactoryImpl());
		m.put(Time4sysPackage.eINSTANCE.getName(), new XMIResourceFactoryImpl());
		m.put(DesignPackage.eINSTANCE.getName(), new XMIResourceFactoryImpl());
	}
	
	
	public static void saveToFile(SchedulingTrace trace, String filePath) {		
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		// create a resource
		Resource resource = resSet.createResource(URI.createFileURI(filePath));
		
		resource.getContents().add(trace);	
		
		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
		
	public static SchedulingTrace loadFile(String filePath){
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource;
		try {
			resource = resSet.getResource(URI.createFileURI(filePath), true);
			return (SchedulingTrace) resource.getContents().get(0);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// IMPORTER CTF FILE to Scheduling Trace
	public static SchedulingTrace importCTFToSchedulingTrace(String filePath) {
		
		
		/*Parser le fichier filePath*/
		
		CTFReader myreader = new CTFReader(filePath);
			
		
		  trace = SchedulingtraceFactory.eINSTANCE.createSchedulingTrace();
		
			// INITIALISE trace
			initialiseTrace(trace, myreader);
		
			procs = new ArrayList<ImportProcessor>();
					
			// parse all lines of the CTF
			for(int i= 0; i < myreader.getCTFlines().size(); i++) {
				
				CTFLine line = myreader.getCTFline(i);  
				
				parseLine(line);
			}
			
		return trace;
	}

	
	// parse one CTF line
	private static void parseLine(CTFLine line) {
		
		String cpu = "";
		boolean found = false;
	    int j = 0;

			 
	    String mycpu = line.getCPU(); 
	    ImportProcessor myproc = null;
	    
		// check if Processor already created
		while ( (j< procs.size()) && (!found)) {
			cpu = procs.get(j).getName();
			if (cpu.equals(mycpu))  {
					found = true;
					myproc = procs.get(j);
			}
			j++;
		}
		
		// if CPU not fund so create it
		if (!found) {
			ImportProcessor myproc1 = new ImportProcessor(line);
			procs.add(myproc1);
			myproc = myproc1;
		}
		
		// create Events 
		myproc.parse(line);
		
	}
	
	
	
	// Initialize the structure of the TRACE
	public static void initialiseTrace(SchedulingTrace trace,CTFReader myreader) {
		NfpFactory nfpFactory = NfpFactory.eINSTANCE;
		
		//Set HOST
		// if there is User Tracepoint so take Host from this else take from KERNEL trace
		
		// get and set the HostID of the scheduling trace
		if (myreader.getUser().size()>0) {
			CTFUserLine UL = myreader.getUser(0);
			trace.setHostId(UL.gethost());
			System.out.println("HOST User = " + trace.getHostId());
		}
		else {
			CTFKernelLine KL = myreader.getKernel(0);
			trace.setHostId(KL.gethost());
			System.out.println("HOST Kernel = " + trace.getHostId());
		}
		
		
		// Set Precision
		Duration duration = NfpFactory.eINSTANCE.createDurationFromString("1ns");
		
		//duration.setUnit(TimeUnitKind.NS_LITERAL);
		//duration.setValue(1.0);
		trace.setPrecision(duration);

		// Set Range
		TimeInterval interval = nfpFactory.createTimeInterval();
		
		Duration min = nfpFactory.createDuration();
		min.setUnit(TimeUnitKind.NS);
		
		Duration max = nfpFactory.createDuration();
		max.setUnit(TimeUnitKind.NS);
		
		// find the min

		double vmin = (double) Double.MAX_VALUE;
		if (myreader.getCTFlines().size() > 0) {
			vmin = myreader.getCTFline(0).getTimeStamp();
			min.setValue(vmin);
		}
		else min.setValue(0);
		
		// find the max
		double vmax =0;
		
		if (myreader.getCTFlines().size() > 0) {
			vmax =myreader.getCTFline(myreader.getCTFlines().size()-1).getTimeStamp();
			max.setValue(vmax);
		}
		else max.setValue(0);	
		
		interval.setMin(min);
		interval.setMax(max);
		trace.setRange(interval);
	}
}
