/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and code
 *******************************************************************************/
package org.polarsys.time4sys.transformations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Context;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.MappableArtefact;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.mapping.MappingFactory;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Simulation;
import org.polarsys.time4sys.model.time4sys.Transformation;
import org.polarsys.time4sys.trace.Event;
import org.polarsys.time4sys.trace.SchedulingEvent;
import org.polarsys.time4sys.trace.Slice;

/**
 * Analyse a trace and get results back into a design model
 * 
 * @author loic
 *
 */
public class SimulationAnalyser {
	
	public static Transformation analyse(final Simulation simu) {
		if (simu == null) {
			return null;
		}
		Project project = null;
		EObject container = simu.eContainer();
		if (container instanceof Project) {
			project = (Project)container;
		}
		final Transformation transfo = analyse(project, simu);
		if (project != null && transfo != null) {
			project.getTransformations().add(transfo);
		}
		return transfo;
	}
	
	public static Transformation analyse(Project project, final Simulation simu) {
		return new SimulationAnalyser(project, simu).transform();
	}

	private final Project project;
	private final Simulation simu;
	private Transformation transfo;
	private DesignModel sourceModel;
	private Mapping simuMapping;
	private Mapping transfoMapping;
	private Context slice2duration;
	private MappingFactory mappingFactory;
	
	public SimulationAnalyser(final Project project, final Simulation simu) {
		this.project = project;
		this.simu = simu;
		assert(simu != null);
		//assert(project != null);
	}

	private Transformation transform() {
		sourceModel = simu.getDesignModel();
		if (sourceModel == null) {
			return null;
		}
		simuMapping = simu.getMapping();
		transfo = IdentityDerivation.duplicate(project, sourceModel);
		transfo.setName("Analysis of " + simu.getName());
		transfoMapping = transfo.getMapping();
		createRules();
		updateConstraints();
		return transfo;
	}
	
	public void createRules() {
		mappingFactory = MappingFactory.eINSTANCE;
		slice2duration = mappingFactory.createContext("Slice to Duration");
		transfoMapping.getRules().add(slice2duration);
	}

	private void updateConstraints() {
		for(EndToEndFlow flow: sourceModel.getEndToEndFlows()) {
			updateConstraint(flow);
		}
	}

	private void updateConstraint(final EndToEndFlow sourceFlow) {
		Collection<Slice> lengthiestSlices = new LinkedList<>();
		Duration lengthiestTime = NfpFactory.eINSTANCE.createDurationFromString("0ps");
		// Looking for lengthiest time
		for (Link lnk : simuMapping.getLinksForSource(sourceFlow)) {
			final Slice slice = (Slice) lnk.getUniqueTargetValue("slice");
			for (Slice instanceSlice : slice.getOwnedSubSlices()) {
				final EList<Event> events = instanceSlice.getAggregatedEvents();
				final SchedulingEvent activationEvt = searchActivationEvent(events);
				final SchedulingEvent terminatedEvt = searchTerminationEvent(events);
				final Duration duration = terminatedEvt.getTimestamp().sub(activationEvt.getTimestamp());
				final int comparison = duration.compareTo(lengthiestTime);
				if (comparison >= 0) {
					lengthiestTime = duration;
					if (comparison > 0) {
						lengthiestSlices = new LinkedList<>();
						lengthiestSlices.add(instanceSlice);
					} else if (comparison == 0) {
						lengthiestSlices.add(instanceSlice);
					}
				}
			}
		}
		// Update value and map slices
		for(Link lnk: transfoMapping.getLinksForSource(sourceFlow)) {
			final EndToEndFlow targetFlow = (EndToEndFlow) lnk.getUniqueTargetValue("copy");
			assert(targetFlow != null);
			targetFlow.setEndToEndTime(lengthiestTime);
//			targetFlow.setSchedulabilitySlack(sourceFlow.getEndToEndDeadline().sub(lengthiestTime));
			targetFlow.setIsSchedulable(lengthiestTime.compareTo(sourceFlow.getEndToEndDeadline()) <= 0);
			for(Slice lengthiestSlice: lengthiestSlices) {
				final MappableArtefact src = mappingFactory.createMappableArtefact("slice", lengthiestSlice);
				lnk.getSources().add(src);
				lnk.setRationale(slice2duration);
			}
		}
	}

	private SchedulingEvent searchTerminationEvent(final EList<Event> events) {
		final ArrayList<Event> reversedEvents = new ArrayList<Event>(events);
		Collections.reverse(reversedEvents);
		for(Event evt: reversedEvents) {
			if (evt instanceof SchedulingEvent) {
				final SchedulingEvent schedEvt = (SchedulingEvent) evt;
				switch(schedEvt.getKind()) {
				case TERMINATED:
					return schedEvt;
				default:
				}
			}
		}
		return null;
	}

	private SchedulingEvent searchActivationEvent(final EList<Event> events) {
		for(Event evt: events) {
			if (evt instanceof SchedulingEvent) {
				final SchedulingEvent schedEvt = (SchedulingEvent) evt;
				switch(schedEvt.getKind()) {
				case RUNNING: //in case of malformed trace having direct running and no activated
				case ACTIVATED:
					return schedEvt;
				default:
				}
			}
		}
		return null;
	}
}
