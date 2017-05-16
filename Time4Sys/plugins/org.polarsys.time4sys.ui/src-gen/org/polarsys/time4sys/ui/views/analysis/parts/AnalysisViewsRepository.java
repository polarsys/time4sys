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
package org.polarsys.time4sys.ui.views.analysis.parts;

/**
 * 
 * @generated
 */
public class AnalysisViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * AnalyzedSystem view descriptor
	 * @generated
	 */
	public static class AnalyzedSystem {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::AnalyzedSystem::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String schedulableElements = "analysis::AnalyzedSystem::properties::schedulableElements";
			
			/**
			 * @generated
			 */
			
			public static String schedulers = "analysis::AnalyzedSystem::properties::schedulers";
			
			/**
			 * @generated
			 */
			
			public static String resources = "analysis::AnalyzedSystem::properties::resources";
			
			/**
			 * @generated
			 */
			
			public static String stimuli = "analysis::AnalyzedSystem::properties::stimuli";
			
			/**
			 * @generated
			 */
			
			public static String delays = "analysis::AnalyzedSystem::properties::delays";
			
			/**
			 * @generated
			 */
			
			public static String protectionProtocols = "analysis::AnalyzedSystem::properties::protectionProtocols";
			
			/**
			 * @generated
			 */
			
			public static String mutexes = "analysis::AnalyzedSystem::properties::mutexes";
			
			/**
			 * @generated
			 */
			
			public static String status = "analysis::AnalyzedSystem::properties::status";
			
			/**
			 * @generated
			 */
			
			public static String resultContainers = "analysis::AnalyzedSystem::properties::resultContainers";
			
			/**
			 * @generated
			 */
			
			public static String mappings = "analysis::AnalyzedSystem::properties::mappings";
			
			/**
			 * @generated
			 */
			
			public static String timeUnit = "analysis::AnalyzedSystem::properties::timeUnit";
			
	
		}
	
	}

	/**
	 * Communication view descriptor
	 * @generated
	 */
	public static class Communication {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::Communication::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String ports = "analysis::Communication::properties::ports";
			
			/**
			 * @generated
			 */
			
			public static String behaviorKind = "analysis::Communication::properties::behaviorKind";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::Communication::properties::parent";
			
			/**
			 * @generated
			 */
			
			public static String scheduledBy = "analysis::Communication::properties::scheduledBy";
			
			/**
			 * @generated
			 */
			
			public static String cET = "analysis::Communication::properties::CET";
			
			/**
			 * @generated
			 */
			
			public static String schedulingParameters = "analysis::Communication::properties::schedulingParameters";
			
			/**
			 * @generated
			 */
			
			public static String originalName = "analysis::Communication::properties::originalName";
			
			/**
			 * @generated
			 */
			
			public static String bus = "analysis::Communication::properties::bus";
			
	
		}
	
	}

	/**
	 * CommunicationResource view descriptor
	 * @generated
	 */
	public static class CommunicationResource {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::CommunicationResource::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String scheduler = "analysis::CommunicationResource::properties::scheduler";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::CommunicationResource::properties::parent";
			
			/**
			 * @generated
			 */
			
			public static String speedFactor = "analysis::CommunicationResource::properties::speedFactor";
			
			/**
			 * @generated
			 */
			
			public static String delay = "analysis::CommunicationResource::properties::delay";
			
			/**
			 * @generated
			 */
			
			public static String links = "analysis::CommunicationResource::properties::links";
			
			/**
			 * @generated
			 */
			
			public static String communicationsAffectedOn = "analysis::CommunicationResource::properties::communicationsAffectedOn";
			
			/**
			 * @generated
			 */
			
			public static String protocolName = "analysis::CommunicationResource::properties::protocolName";
			
			/**
			 * @generated
			 */
			
			public static String bandwidth = "analysis::CommunicationResource::properties::bandwidth";
			
	
		}
	
	}

	/**
	 * ComputingResource view descriptor
	 * @generated
	 */
	public static class ComputingResource {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::ComputingResource::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String scheduler = "analysis::ComputingResource::properties::scheduler";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::ComputingResource::properties::parent";
			
			/**
			 * @generated
			 */
			
			public static String speedFactor = "analysis::ComputingResource::properties::speedFactor";
			
			/**
			 * @generated
			 */
			
			public static String delay = "analysis::ComputingResource::properties::delay";
			
			/**
			 * @generated
			 */
			
			public static String tasksAffectedOn = "analysis::ComputingResource::properties::tasksAffectedOn";
			
			/**
			 * @generated
			 */
			
			public static String linkedBy = "analysis::ComputingResource::properties::linkedBy";
			
	
		}
	
	}

	/**
	 * ConstraintContainer view descriptor
	 * @generated
	 */
	public static class ConstraintContainer {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::ConstraintContainer::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String constraints = "analysis::ConstraintContainer::properties::constraints";
			
			/**
			 * @generated
			 */
			
			public static String analyzedSystem = "analysis::ConstraintContainer::properties::analyzedSystem";
			
	
		}
	
	}

	/**
	 * Delay view descriptor
	 * @generated
	 */
	public static class Delay {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::Delay::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String ports = "analysis::Delay::properties::ports";
			
			/**
			 * @generated
			 */
			
			public static String behaviorKind = "analysis::Delay::properties::behaviorKind";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::Delay::properties::parent";
			
			/**
			 * @generated
			 */
			
			public static String referencedEvent = "analysis::Delay::properties::referencedEvent";
			
			/**
			 * @generated
			 */
			
			public static String duration = "analysis::Delay::properties::duration";
			
	
		}
	
	}

	/**
	 * EventModel view descriptor
	 * @generated
	 */
	public static class EventModel {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String offsets = "analysis::EventModel::properties::offsets";
			
			/**
			 * @generated
			 */
			
			public static String period = "analysis::EventModel::properties::period";
			
			/**
			 * @generated
			 */
			
			public static String jitter = "analysis::EventModel::properties::jitter";
			
			/**
			 * @generated
			 */
			
			public static String dmin = "analysis::EventModel::properties::dmin";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::EventModel::properties::parent";
			
			/**
			 * @generated
			 */
			
			public static String isSporadic = "analysis::EventModel::properties::isSporadic";
			
	
		}
	
	}

	/**
	 * Fragment view descriptor
	 * @generated
	 */
	public static class Fragment {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::Fragment::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String lockedMutexes = "analysis::Fragment::properties::lockedMutexes";
			
			/**
			 * @generated
			 */
			
			public static String next = "analysis::Fragment::properties::next";
			
			/**
			 * @generated
			 */
			
			public static String previous = "analysis::Fragment::properties::previous";
			
			/**
			 * @generated
			 */
			
			public static String task = "analysis::Fragment::properties::task";
			
			/**
			 * @generated
			 */
			
			public static String cET = "analysis::Fragment::properties::CET";
			
	
		}
	
	}

	/**
	 * InputPort view descriptor
	 * @generated
	 */
	public static class InputPort {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::InputPort::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::InputPort::properties::parent";
			
			/**
			 * @generated
			 */
			
			public static String receiveFrom = "analysis::InputPort::properties::receiveFrom";
			
	
		}
	
	}

	/**
	 * InputStimulus view descriptor
	 * @generated
	 */
	public static class InputStimulus {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::InputStimulus::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::InputStimulus::properties::parent";
			
			/**
			 * @generated
			 */
			
			public static String outputPorts = "analysis::InputStimulus::properties::outputPorts";
			
	
		}
	
	}

	/**
	 * MemoryResource view descriptor
	 * @generated
	 */
	public static class MemoryResource {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::MemoryResource::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String scheduler = "analysis::MemoryResource::properties::scheduler";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::MemoryResource::properties::parent";
			
			/**
			 * @generated
			 */
			
			public static String speedFactor = "analysis::MemoryResource::properties::speedFactor";
			
			/**
			 * @generated
			 */
			
			public static String delay = "analysis::MemoryResource::properties::delay";
			
			/**
			 * @generated
			 */
			
			public static String size = "analysis::MemoryResource::properties::size";
			
	
		}
	
	}

	/**
	 * MutualExclusionResource view descriptor
	 * @generated
	 */
	public static class MutualExclusionResource {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::MutualExclusionResource::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String elements = "analysis::MutualExclusionResource::properties::elements";
			
			/**
			 * @generated
			 */
			
			public static String protectionParameters = "analysis::MutualExclusionResource::properties::protectionParameters";
			
			/**
			 * @generated
			 */
			
			public static String protectedBy = "analysis::MutualExclusionResource::properties::protectedBy";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::MutualExclusionResource::properties::parent";
			
	
		}
	
	}

	/**
	 * Offset view descriptor
	 * @generated
	 */
	public static class Offset {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String eventModel = "analysis::Offset::properties::eventModel";
			
			/**
			 * @generated
			 */
			
			public static String value = "analysis::Offset::properties::value";
			
			/**
			 * @generated
			 */
			
			public static String reference = "analysis::Offset::properties::reference";
			
	
		}
	
	}

	/**
	 * OutputPort view descriptor
	 * @generated
	 */
	public static class OutputPort {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::OutputPort::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::OutputPort::properties::parent";
			
			/**
			 * @generated
			 */
			
			public static String sendTo = "analysis::OutputPort::properties::sendTo";
			
	
		}
	
	}

	/**
	 * OutputStimulus view descriptor
	 * @generated
	 */
	public static class OutputStimulus {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::OutputStimulus::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::OutputStimulus::properties::parent";
			
			/**
			 * @generated
			 */
			
			public static String inputPorts = "analysis::OutputStimulus::properties::inputPorts";
			
	
		}
	
	}

	/**
	 * ProtectionParameterValue view descriptor
	 * @generated
	 */
	public static class ProtectionParameterValue {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String value = "analysis::ProtectionParameterValue::properties::value";
			
			/**
			 * @generated
			 */
			
			public static String type = "analysis::ProtectionParameterValue::properties::type";
			
	
		}
	
	}

	/**
	 * ProtectionProtocol view descriptor
	 * @generated
	 */
	public static class ProtectionProtocol {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String protocolName = "analysis::ProtectionProtocol::properties::protocolName";
			
			/**
			 * @generated
			 */
			
			public static String mutexes = "analysis::ProtectionProtocol::properties::mutexes";
			
			/**
			 * @generated
			 */
			
			public static String requiredParameters = "analysis::ProtectionProtocol::properties::requiredParameters";
			
			/**
			 * @generated
			 */
			
			public static String resourceParameterValue = "analysis::ProtectionProtocol::properties::resourceParameterValue";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::ProtectionProtocol::properties::parent";
			
	
		}
	
	}

	/**
	 * RequiredProtectionParameter view descriptor
	 * @generated
	 */
	public static class RequiredProtectionParameter {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::RequiredProtectionParameter::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::RequiredProtectionParameter::properties::parent";
			
	
		}
	
	}

	/**
	 * RequiredSchedulingParameter view descriptor
	 * @generated
	 */
	public static class RequiredSchedulingParameter {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::RequiredSchedulingParameter::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::RequiredSchedulingParameter::properties::parent";
			
	
		}
	
	}

	/**
	 * ResourceSchedulingParameterValue view descriptor
	 * @generated
	 */
	public static class ResourceSchedulingParameterValue {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::ResourceSchedulingParameterValue::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String value = "analysis::ResourceSchedulingParameterValue::properties::value";
			
	
		}
	
	}

	/**
	 * ResultContainer view descriptor
	 * @generated
	 */
	public static class ResultContainer {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::ResultContainer::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String analyzedSystem = "analysis::ResultContainer::properties::analyzedSystem";
			
	
		}
	
	}

	/**
	 * SchedulerParameterValue view descriptor
	 * @generated
	 */
	public static class SchedulerParameterValue {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String type = "analysis::SchedulerParameterValue::properties::type";
			
			/**
			 * @generated
			 */
			
			public static String value = "analysis::SchedulerParameterValue::properties::value";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::SchedulerParameterValue::properties::parent";
			
	
		}
	
	}

	/**
	 * Scheduler view descriptor
	 * @generated
	 */
	public static class Scheduler {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::Scheduler::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String policyKind = "analysis::Scheduler::properties::policyKind";
			
			/**
			 * @generated
			 */
			
			public static String scheduledElements = "analysis::Scheduler::properties::scheduledElements";
			
			/**
			 * @generated
			 */
			
			public static String usedBy = "analysis::Scheduler::properties::usedBy";
			
			/**
			 * @generated
			 */
			
			public static String requiredParameters = "analysis::Scheduler::properties::requiredParameters";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::Scheduler::properties::parent";
			
			/**
			 * @generated
			 */
			
			public static String resourceParameterValue = "analysis::Scheduler::properties::resourceParameterValue";
			
			/**
			 * @generated
			 */
			
			public static String preferredPolicy = "analysis::Scheduler::properties::preferredPolicy";
			
	
		}
	
	}

	/**
	 * Task view descriptor
	 * @generated
	 */
	public static class Task {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::Task::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String ports = "analysis::Task::properties::ports";
			
			/**
			 * @generated
			 */
			
			public static String behaviorKind = "analysis::Task::properties::behaviorKind";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::Task::properties::parent";
			
			/**
			 * @generated
			 */
			
			public static String scheduledBy = "analysis::Task::properties::scheduledBy";
			
			/**
			 * @generated
			 */
			
			public static String cET = "analysis::Task::properties::CET";
			
			/**
			 * @generated
			 */
			
			public static String schedulingParameters = "analysis::Task::properties::schedulingParameters";
			
			/**
			 * @generated
			 */
			
			public static String originalName = "analysis::Task::properties::originalName";
			
			/**
			 * @generated
			 */
			
			public static String lockedMutexes = "analysis::Task::properties::lockedMutexes";
			
			/**
			 * @generated
			 */
			
			public static String mappedTo = "analysis::Task::properties::mappedTo";
			
			/**
			 * @generated
			 */
			
			public static String fragments = "analysis::Task::properties::fragments";
			
			/**
			 * @generated
			 */
			
			public static String first = "analysis::Task::properties::first";
			
			/**
			 * @generated
			 */
			
			public static String blockingTime = "analysis::Task::properties::blockingTime";
			
	
		}
	
	}

	/**
	 * ResourceProtectionParameterValue view descriptor
	 * @generated
	 */
	public static class ResourceProtectionParameterValue {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String name = "analysis::ResourceProtectionParameterValue::properties::name";
			
			/**
			 * @generated
			 */
			
			public static String value = "analysis::ResourceProtectionParameterValue::properties::value";
			
	
		}
	
	}

	/**
	 * TwcaEventModel view descriptor
	 * @generated
	 */
	public static class TwcaEventModel {
		public static class Properties {
	
			/**
			 * @generated
			 */
			
			public static String offsets = "analysis::TwcaEventModel::properties::offsets";
			
			/**
			 * @generated
			 */
			
			public static String period = "analysis::TwcaEventModel::properties::period";
			
			/**
			 * @generated
			 */
			
			public static String jitter = "analysis::TwcaEventModel::properties::jitter";
			
			/**
			 * @generated
			 */
			
			public static String dmin = "analysis::TwcaEventModel::properties::dmin";
			
			/**
			 * @generated
			 */
			
			public static String parent_ = "analysis::TwcaEventModel::properties::parent";
			
			/**
			 * @generated
			 */
			
			public static String isSporadic = "analysis::TwcaEventModel::properties::isSporadic";
			
			/**
			 * @generated
			 */
			
			public static String deltamin_func = "analysis::TwcaEventModel::properties::deltamin_func";
			
	
		}
	
	}

}
