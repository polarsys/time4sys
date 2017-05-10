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
package org.polarsys.time4sys.ui.views.srm.parts;

/**
 * 
 * 
 */
public class SrmViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * General view descriptor
	 * 
	 */
	public static class General {
		public static class Properties {
	
			
			public static String name = "srm::General::properties::name";
			
			
			public static String elementSize = "srm::General::properties::elementSize";
			
			
			public static String speedFactor = "srm::General::properties::speedFactor";
			
			
			public static String resMult = "srm::General::properties::resMult";
			
			
			public static String memorySizeFootprint = "srm::General::properties::memorySizeFootprint";
			
			
			public static String isProtected = "srm::General::properties::isProtected";
			
			
			public static String isActive = "srm::General::properties::isActive";
			
			
			public static String isModifier = "srm::General::properties::isModifier";
			
			
			public static String isWatchdog = "srm::General::properties::isWatchdog";
			
			
			public static String isBuffered = "srm::General::properties::isBuffered";
			
			
			public static String activationCapacity = "srm::General::properties::activationCapacity";
			
			
			public static String accessedElement = "srm::General::properties::accessedElement";
			
			
			public static String identifierElements = "srm::General::properties::identifierElements";
			
			
			public static String periodElements = "srm::General::properties::periodElements";
			
			
			public static String stateElements = "srm::General::properties::stateElements";
			
			
			public static String adressSpace = "srm::General::properties::adressSpace";
			
			
			public static String scheduler = "srm::General::properties::scheduler";
			
			
			public static String mainScheduler = "srm::General::properties::mainScheduler";
			
			
			public static String dependentScheduler = "srm::General::properties::dependentScheduler";
			
			
			public static String host = "srm::General::properties::host";
			
			
			public static String entryPoints = "srm::General::properties::entryPoints";
			
			
			public static String kind = "srm::General::properties::kind";
			
			
			public static String isrEntryPoints = "srm::General::properties::isrEntryPoints";
			
			
			public static String sourcePort = "srm::General::properties::sourcePort";
			
			
			public static String targetPort = "srm::General::properties::targetPort";
			
			
			public static String start = "srm::General::properties::start";
			
			
			public static String set = "srm::General::properties::set";
			
			
			public static String get = "srm::General::properties::get";
			
			
			public static String reset = "srm::General::properties::reset";
			
			
			public static String pause = "srm::General::properties::pause";
			
			
			public static String processingUnits = "srm::General::properties::processingUnits";
			
			
			public static String schedulableResource = "srm::General::properties::schedulableResource";
			
			
			public static String scheduledResource = "srm::General::properties::scheduledResource";
			
			
			public static String ownedResource = "srm::General::properties::ownedResource";
			
			
			public static String ownedElement = "srm::General::properties::ownedElement";
			
			
			public static String ownedPort = "srm::General::properties::ownedPort";
			
			
			public static String ownedConnector = "srm::General::properties::ownedConnector";
			
			
			public static String usedBy = "srm::General::properties::usedBy";
			
			
			public static String brokedResource = "srm::General::properties::brokedResource";
			
			
			public static String managedResource = "srm::General::properties::managedResource";
			
			
			public static String schedParams = "srm::General::properties::schedParams";
			
			
			public static String devices = "srm::General::properties::devices";
			
			
			public static String memories = "srm::General::properties::memories";
			
			
			public static String sharedDataResources = "srm::General::properties::sharedDataResources";
			
			
			public static String messageResources = "srm::General::properties::messageResources";
			
			
			public static String notificationResources = "srm::General::properties::notificationResources";
			
	
		}
	
	}

	/**
	 * Timing view descriptor
	 * 
	 */
	public static class Timing {
		public static class Properties {
	
			
			public static String capacity = "srm::Timing::properties::capacity";
			
			
			public static String isPeriodic = "srm::Timing::properties::isPeriodic";
			
			
			public static String isPreemptable = "srm::Timing::properties::isPreemptable";
			
			
			public static String isFixedMessageSize = "srm::Timing::properties::isFixedMessageSize";
			
			
			public static String duration = "srm::Timing::properties::duration";
			
			
			public static String arrivalPattern = "srm::Timing::properties::arrivalPattern";
			
			
			public static String packetTime = "srm::Timing::properties::packetTime";
			
			
			public static String blockingTime = "srm::Timing::properties::blockingTime";
			
			
			public static String waitingQueueCapacity = "srm::Timing::properties::waitingQueueCapacity";
			
			
			public static String waitingQueuePolicy = "srm::Timing::properties::waitingQueuePolicy";
			
			
			public static String policy = "srm::Timing::properties::policy";
			
			
			public static String messageQueuePolicy = "srm::Timing::properties::messageQueuePolicy";
			
			
			public static String mechanism = "srm::Timing::properties::mechanism";
			
			
			public static String transmMode = "srm::Timing::properties::transmMode";
			
			
			public static String concurrentAccessProtocol = "srm::Timing::properties::concurrentAccessProtocol";
			
			
			public static String accessPolicy = "srm::Timing::properties::accessPolicy";
			
			
			public static String durationElements = "srm::Timing::properties::durationElements";
			
			
			public static String messageQueueCapacityElements = "srm::Timing::properties::messageQueueCapacityElements";
			
			
			public static String priorityElements = "srm::Timing::properties::priorityElements";
			
			
			public static String messageSizeElements = "srm::Timing::properties::messageSizeElements";
			
			
			public static String occurenceCountElements = "srm::Timing::properties::occurenceCountElements";
			
			
			public static String waitingPolicyElements = "srm::Timing::properties::waitingPolicyElements";
			
			
			public static String deadlineElements = "srm::Timing::properties::deadlineElements";
			
			
			public static String deadlineTypeElements = "srm::Timing::properties::deadlineTypeElements";
			
			
			public static String timeSliceElements = "srm::Timing::properties::timeSliceElements";
			
			
			public static String accCtrlPolicy = "srm::Timing::properties::accCtrlPolicy";
			
			
			public static String resCtrlPolicy = "srm::Timing::properties::resCtrlPolicy";
			
			
			public static String accessTokenElements = "srm::Timing::properties::accessTokenElements";
			
			
			public static String mutualExclusionResources = "srm::Timing::properties::mutualExclusionResources";
			
			
			public static String timers = "srm::Timing::properties::timers";
			
			
			public static String protectParams = "srm::Timing::properties::protectParams";
			
			
			public static String concurrentResources = "srm::Timing::properties::concurrentResources";
			
	
		}
	
	}

	/**
	 * Other view descriptor
	 * 
	 */
	public static class Other {
		public static class Properties {
	
			
			public static String packetSize = "srm::Other::properties::packetSize";
			
			
			public static String isMaskable = "srm::Other::properties::isMaskable";
			
			
			public static String isStaticSchedulingFeature = "srm::Other::properties::isStaticSchedulingFeature";
			
			
			public static String isIntraMemoryPartitionInteraction = "srm::Other::properties::isIntraMemoryPartitionInteraction";
			
			
			public static String memoryBlockAddressElements = "srm::Other::properties::memoryBlockAddressElements";
			
			
			public static String stackSizeElements = "srm::Other::properties::stackSizeElements";
			
			
			public static String heapSizeElements = "srm::Other::properties::heapSizeElements";
			
			
			public static String maskElements = "srm::Other::properties::maskElements";
			
			
			public static String vectorElements = "srm::Other::properties::vectorElements";
			
			
			public static String memoryBlockSizeElements = "srm::Other::properties::memoryBlockSizeElements";
			
			
			public static String ownedService = "srm::Other::properties::ownedService";
			
			
			public static String pInterface = "srm::Other::properties::pInterface";
			
			
			public static String rInterface = "srm::Other::properties::rInterface";
			
			
			public static String pServices = "srm::Other::properties::pServices";
			
			
			public static String rServices = "srm::Other::properties::rServices";
			
			
			public static String createServices = "srm::Other::properties::createServices";
			
			
			public static String deleteServices = "srm::Other::properties::deleteServices";
			
			
			public static String initializeServices = "srm::Other::properties::initializeServices";
			
			
			public static String activateServices = "srm::Other::properties::activateServices";
			
			
			public static String resumeServices = "srm::Other::properties::resumeServices";
			
			
			public static String suspendServices = "srm::Other::properties::suspendServices";
			
			
			public static String enableConcurrencyServices = "srm::Other::properties::enableConcurrencyServices";
			
			
			public static String disableConcurrencyServices = "srm::Other::properties::disableConcurrencyServices";
			
			
			public static String forkServices = "srm::Other::properties::forkServices";
			
			
			public static String exitServices = "srm::Other::properties::exitServices";
			
			
			public static String memorySpaces = "srm::Other::properties::memorySpaces";
			
			
			public static String closeServices = "srm::Other::properties::closeServices";
			
			
			public static String openServices = "srm::Other::properties::openServices";
			
			
			public static String acquireServices = "srm::Other::properties::acquireServices";
			
			
			public static String releaseServices = "srm::Other::properties::releaseServices";
			
			
			public static String controlServices = "srm::Other::properties::controlServices";
			
			
			public static String sendServices = "srm::Other::properties::sendServices";
			
			
			public static String receiveServices = "srm::Other::properties::receiveServices";
			
			
			public static String readServices = "srm::Other::properties::readServices";
			
			
			public static String writeServices = "srm::Other::properties::writeServices";
			
			
			public static String flushServices = "srm::Other::properties::flushServices";
			
			
			public static String signalServices = "srm::Other::properties::signalServices";
			
			
			public static String waitServices = "srm::Other::properties::waitServices";
			
			
			public static String clearServices = "srm::Other::properties::clearServices";
			
			
			public static String lockServices = "srm::Other::properties::lockServices";
			
			
			public static String unlockServices = "srm::Other::properties::unlockServices";
			
			
			public static String joinServices = "srm::Other::properties::joinServices";
			
			
			public static String yieldServices = "srm::Other::properties::yieldServices";
			
			
			public static String delayServices = "srm::Other::properties::delayServices";
			
			
			public static String mapServices = "srm::Other::properties::mapServices";
			
			
			public static String unmapServices = "srm::Other::properties::unmapServices";
			
			
			public static String terminateServices = "srm::Other::properties::terminateServices";
			
			
			public static String routineConnectServices = "srm::Other::properties::routineConnectServices";
			
			
			public static String routineDisconnectServices = "srm::Other::properties::routineDisconnectServices";
			
	
		}
	
	}

}
