/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 * Generated with Acceleo
 */
package org.polarsys.time4sys.ui.views.grm.parts;

/**
 * 
 * 
 */
public class GrmViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * General view descriptor
	 * 
	 */
	public static class General {
		public static class Properties {
	
			
			public static String name = "grm::General::Properties::name";
			
			
			public static String isPeriodic = "grm::General::Properties::isPeriodic";
			
			
			public static String value = "grm::General::Properties::value";
			
			
			public static String elementSize = "grm::General::Properties::elementSize";
			
			
			public static String resMult = "grm::General::Properties::resMult";
			
			
			public static String msgSize = "grm::General::Properties::msgSize";
			
			
			public static String packetSize = "grm::General::Properties::packetSize";
			
			
			public static String event = "grm::General::Properties::event";
			
			
			public static String speedFactor = "grm::General::Properties::speedFactor";
			
			
			public static String isProtected = "grm::General::Properties::isProtected";
			
			
			public static String isActive = "grm::General::Properties::isActive";
			
			
			public static String otherProtocol = "grm::General::Properties::otherProtocol";
			
			
			public static String protocol = "grm::General::Properties::protocol";
			
			
			public static String transmMode = "grm::General::Properties::transmMode";
			
			
			public static String start = "grm::General::Properties::start";
			
			
			public static String set = "grm::General::Properties::set";
			
			
			public static String get = "grm::General::Properties::get";
			
			
			public static String reset = "grm::General::Properties::reset";
			
			
			public static String pause = "grm::General::Properties::pause";
			
			
			public static String scheduler = "grm::General::Properties::scheduler";
			
			
			public static String type = "grm::General::Properties::type";
			
			
			public static String host = "grm::General::Properties::host";
			
			
			public static String dependentScheduler = "grm::General::Properties::dependentScheduler";
			
			
			public static String mainScheduler = "grm::General::Properties::mainScheduler";
			
			
			public static String sourcePort = "grm::General::Properties::sourcePort";
			
			
			public static String targetPort = "grm::General::Properties::targetPort";
			
			
			public static String usedBy = "grm::General::Properties::usedBy";
			
			
			public static String usedResource = "grm::General::Properties::usedResource";
			
			
			public static String processingUnits = "grm::General::Properties::processingUnits";
			
			
			public static String workload = "grm::General::Properties::workload";
			
			
			public static String brokedResource = "grm::General::Properties::brokedResource";
			
			
			public static String managedResource = "grm::General::Properties::managedResource";
			
			
			public static String schedulableResource = "grm::General::Properties::schedulableResource";
			
			
			public static String virtualProcessingUnit = "grm::General::Properties::virtualProcessingUnit";
			
			
			public static String protectParams = "grm::General::Properties::protectParams";
			
			
			public static String schedParams = "grm::General::Properties::schedParams";
			
			
			public static String requiredAmount = "grm::General::Properties::requiredAmount";
			
			
			public static String ownedElement = "grm::General::Properties::ownedElement";
			
			
			public static String ownedPort = "grm::General::Properties::ownedPort";
			
			
			public static String ownedConnector = "grm::General::Properties::ownedConnector";
			
			
			public static String ownedResource = "grm::General::Properties::ownedResource";
			
			
			public static String ownedService = "grm::General::Properties::ownedService";
			
			
			public static String usage = "grm::General::Properties::usage";
			
			
			public static String accCtrlPolicy = "grm::General::Properties::accCtrlPolicy";
			
			
			public static String resCtrlPolicy = "grm::General::Properties::resCtrlPolicy";
			
	
		}
	
	}

	/**
	 * Timing view descriptor
	 * 
	 */
	public static class Timing {
		public static class TimingProperties {
	
			
			public static String duration = "grm::Timing::Timing properties::duration";
			
			
			public static String policy = "grm::Timing::Timing properties::policy";
			
			
			public static String otherSchedPolicy = "grm::Timing::Timing properties::otherSchedPolicy";
			
			
			public static String capacity = "grm::Timing::Timing properties::capacity";
			
			
			public static String packetTime = "grm::Timing::Timing properties::packetTime";
			
			
			public static String blockingTime = "grm::Timing::Timing properties::blockingTime";
			
			
			public static String priorityCeiling = "grm::Timing::Timing properties::priorityCeiling";
			
			
			public static String preemptionLevel = "grm::Timing::Timing properties::preemptionLevel";
			
			
			public static String execTime = "grm::Timing::Timing properties::execTime";
			
	
		}
	
	}

	/**
	 * Other view descriptor
	 * 
	 */
	public static class Other {
		public static class OtherProperties {
	
			
			public static String allocatedmemory = "grm::Other::Other properties::allocatedmemory";
			
			
			public static String usedMemory = "grm::Other::Other properties::usedMemory";
			
			
			public static String powerPeak = "grm::Other::Other properties::powerPeak";
			
			
			public static String energy = "grm::Other::Other properties::energy";
			
			
			public static String pServices = "grm::Other::Other properties::pServices";
			
			
			public static String rServices = "grm::Other::Other properties::rServices";
			
			
			public static String pInterface = "grm::Other::Other properties::pInterface";
			
			
			public static String rInterface = "grm::Other::Other properties::rInterface";
			
	
		}
	
	}

}
