/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.builder.simulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.builder.design.EndToEndFlowConstraintBuilder;
import org.polarsys.time4sys.builder.design.StepBuilder;
import org.polarsys.time4sys.builder.mapping.MappingBuilder;
import org.polarsys.time4sys.mapping.Context;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.mapping.MappingFactory;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadBehavior;
import org.polarsys.time4sys.marte.grm.ComputingResource;
import org.polarsys.time4sys.marte.grm.ProcessingResource;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourcePackage;
import org.polarsys.time4sys.marte.grm.SchedulableResource;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.marte.sam.EndToEndFlow;
import org.polarsys.time4sys.model.time4sys.Simulation;
import org.polarsys.time4sys.trace.DurationValueChangeEvent;
import org.polarsys.time4sys.trace.Event;
import org.polarsys.time4sys.trace.SchedulingEvent;
import org.polarsys.time4sys.trace.SchedulingEventKind;
import org.polarsys.time4sys.trace.Slice;
import org.polarsys.time4sys.trace.SliceKind;
import org.polarsys.time4sys.trace.Trace;
import org.polarsys.time4sys.trace.TraceFactory;
import org.polarsys.time4sys.trace.TracePackage;

/**
 * @author loic
 *
 */
public class TraceBuilder {
	
	public static final String SIMUCTX = "simulation";

	public static Trace getOrCreateTrace(final Simulation simu) {
		if (simu.getTrace() == null) {
			simu.setTrace(TraceFactory.eINSTANCE.createTrace());
		}
		return simu.getTrace();
	}
	
	public static Trace getOrSetTrace(final Simulation simu, final Trace tr) {
		if (tr == null) {
			throw new IllegalArgumentException("trace must not be null");
		}
		if (simu.getTrace() != null && simu.getTrace() != tr) {
			throw new IllegalArgumentException("trace of simulation trace must not be already set");
		}
		simu.setTrace(tr);
		return simu.getTrace();
	}
	
	public static Mapping getOrCreateMapping(final Simulation simu) {
		if (simu.getMapping() == null) {
			simu.setMapping(MappingFactory.eINSTANCE.createMapping());
		}
		return simu.getMapping();
	}
	
	public static Context getOrCreateContext(final Simulation simu) {
		final Mapping mp = getOrCreateMapping(simu);
		for(Context c: mp.getRules()) {
			if (SIMUCTX.equals(c.getName())) {
				return c;
			}
		}
		final Context ctx = MappingFactory.eINSTANCE.createContext("simulation");
		mp.getRules().add(ctx);
		return ctx;
	}

	protected Map<Object, Slice> slices = new HashMap<>();
	protected final Trace trace;
	protected final Mapping mapping;
	protected final Context ctx;
	protected MappingBuilder mapBuilder;
	protected SimulationBuilder simuBuilder;
	private Slice allEndToEndFlows;
	
	public TraceBuilder(final Trace tr, final Mapping map, final Context context) {
		trace = tr;
		if (tr == null) {
			throw new IllegalArgumentException("argument tr must not be null");
		}
		mapping = map;
		if (map == null) {
			throw new IllegalArgumentException("argument map must not be null");
		}
		ctx = context;
		if (context == null) {
			throw new IllegalArgumentException("argument context must not be null");
		}
		if (map.getRationale() == null) {
			map.setRationale(ctx);
		}
		mapBuilder = new MappingBuilder(map);
		mapBuilder.tracing(this);
	}
	
	public TraceBuilder(final Simulation simu) {
		this(getOrCreateTrace(simu), getOrCreateMapping(simu), getOrCreateContext(simu));
	}
	
	public TraceBuilder(final Simulation simu, final Trace theTrace) {
		this(getOrSetTrace(simu, theTrace), getOrCreateMapping(simu), getOrCreateContext(simu));
	}

	public TraceBuilder(final SimulationBuilder simulationBuilder, final Trace theTrace) {
		this(simulationBuilder.build(), theTrace);
		simuBuilder = simulationBuilder;
	}

	private void map(EObject res, Slice resSlice) {
		slices.put(res, resSlice);
		final Link l = MappingFactory.eINSTANCE.createLink(ctx, "source", res, "slice", resSlice);
		mapping.getSubLinks().add(l);
	}
	
	private void attachToParent(final Slice resSlice, final EObject obj) {
		final EObject parent = obj.eContainer();
		if (parent == null) {
			trace.getSlices().add(resSlice);
		} else if (parent instanceof ResourcePackage) {
			getSliceFor((ResourcePackage)parent).getOwnedSubSlices().add(resSlice);
		} else if (parent instanceof Resource) {
			getSliceFor((Resource)parent).getOwnedSubSlices().add(resSlice);
		} else if (parent instanceof WorkloadBehavior) {
			getSliceFor((WorkloadBehavior)parent).getOwnedSubSlices().add(resSlice);	
		} else {
			trace.getSlices().add(resSlice);
		}
	}
	
	public synchronized Slice getSliceFor(final BehaviorScenario scenario) {
		if (scenario == null) {
			return null;
		}
		Slice resSlice = slices .get(scenario);
		if (resSlice == null) {
			resSlice = TraceFactory.eINSTANCE.createSlice();
			map(scenario, resSlice);
			resSlice.setName(scenario.getName());
			resSlice.setKindLabel("Package");
			attachToParent(resSlice, scenario);
		}
		return resSlice;
	}
	
	public synchronized Slice getSliceFor(final Resource res) {
		Slice resSlice = slices.get(res);
		if (resSlice == null) {
			resSlice = TraceFactory.eINSTANCE.createSlice();
			resSlice.setName(res.getName());
			map(res, resSlice);
			resSlice.setKind(SliceKind.RESOURCE);
			attachToParent(resSlice, res);
		}
		return resSlice;
	}
	
	public synchronized Slice getSliceFor(final ResourcePackage res) {
		Slice resSlice = slices .get(res);
		if (resSlice == null) {
			resSlice = TraceFactory.eINSTANCE.createSlice();
			String label = res.getName();
			if (label == null || label.trim().isEmpty()) {
				label ="Resource Package";
			}
			resSlice.setName(label);
			map(res, resSlice);
			resSlice.setKindLabel("Package");
			trace.getSlices().add(resSlice);
		}
		return resSlice;
	}
	
	public synchronized Slice getSliceFor(final SchedulableResource task) {
		Slice resSlice = slices .get(task);
		if (resSlice == null) {
			resSlice = TraceFactory.eINSTANCE.createSlice();
			map(task, resSlice);
			resSlice.setName(task.getName());
			resSlice.setKind(SliceKind.TASK);
			attachToParent(resSlice, task);
		}
		return resSlice;
	}
	
	public synchronized Slice getSliceFor(final Step step) {
		Slice resSlice = slices .get(step);
		if (resSlice == null) {
			resSlice = TraceFactory.eINSTANCE.createSlice();
			map(step, resSlice);
			resSlice.setName(step.getName());
			resSlice.setKind(SliceKind.FUNCTION);
			
			if (step.getScenario() != null) {
				getSliceFor(step.getConcurRes()).getSubSlices().add(resSlice);
				getSliceFor(step.getScenario()).getOwnedSubSlices().add(resSlice);
			} else if (step.eContainer() instanceof WorkloadBehavior) {
				getSliceFor((WorkloadBehavior)step.eContainer()).getOwnedSubSlices().add(resSlice);
			} else {
				getSliceFor(step.getConcurRes()).getOwnedSubSlices().add(resSlice);
			}
		}
		return resSlice;
	}
	
	public Slice getSliceFor(final EndToEndFlow flow) {
		Slice resSlice = slices.get(flow);
		if (resSlice == null) {
			resSlice = TraceFactory.eINSTANCE.createSlice();
			slices.put(flow, resSlice);
			resSlice.setName("Constraint " + Integer.toString(flow.hashCode()));
			resSlice.setKind(SliceKind.TEMPORAL_CHAIN);
			getAllEndToEndFlows().getOwnedSubSlices().add(resSlice);
			map(flow, resSlice);
		}
		return resSlice;
	}

	public synchronized Slice getAllEndToEndFlows() {
		if (allEndToEndFlows == null) {
			allEndToEndFlows = hasASlice().called("end-to-end-flows").ofKindPackage().build();
		}
		return allEndToEndFlows;
	}

	public Trace build() {
		return trace;
	}
	
	public TraceBuilder startAt(final String value) {
		final Duration pit = NfpFactory.eINSTANCE.createDurationFromString(value);
		final TimeInterval timeInt = getRange();
		timeInt.setMin(pit);
		trace.setRange(timeInt);
		return this;
	}
	
	public TraceBuilder endAt(final String value) {
		final Duration pit = NfpFactory.eINSTANCE.createDurationFromString(value);
		final TimeInterval timeInt = getRange();
		timeInt.setMax(pit);
		trace.setRange(timeInt);
		return this;
	}

	protected TimeInterval getRange() {
		final TimeInterval timeInt;
		if (trace.eIsSet(TracePackage.eINSTANCE.getTrace_Range())) {
			timeInt = trace.getRange();
		} else {
			timeInt = NfpFactory.eINSTANCE.createTimeInterval();
		}
		return timeInt;
	}

	public EventBuilder logActivationOf(final StepBuilder step) {
		final SliceBuilder aSlice = getSliceFor(step);
		return aSlice.logEvent(SchedulingEventKind.ACTIVATED);
	}

	public SliceBuilder getSliceFor(final StepBuilder step) {
		//final Step aStep = step.build();
		
		final Slice aSlice = TraceFactory.eINSTANCE.createSlice();
		aSlice.setKind(SliceKind.TASK);
		aSlice.setName(step.name());
		trace.getSlices().add(aSlice);
		final SliceBuilder slice = new SliceBuilder(this, aSlice);
		/* TODO Add slice hierarchy */
		/* Add slice mapping */
		mapBuilder.linking(step, slice);
		return slice;
	}
	

	public SliceBuilder getSliceFor(final EndToEndFlowConstraintBuilder endToEndFlow) {
		final Slice aSlice = TraceFactory.eINSTANCE.createSlice();
		aSlice.setKind(SliceKind.TEMPORAL_CHAIN);
		aSlice.setName(endToEndFlow.toString());
		trace.getSlices().add(aSlice);
		/* TODO Add slice hierarchy */
		/* Add slice mapping */
		final SliceBuilder slice = new SliceBuilder(this, aSlice);
		mapBuilder.linking(endToEndFlow, slice);
		return slice;
	}
	
	public synchronized Slice getSliceFor(final WorkloadBehavior res) {
		Slice resSlice = slices .get(res);
		if (resSlice == null) {
			resSlice = TraceFactory.eINSTANCE.createSlice();
			String label = res.getName();
			if (label == null || label.trim().isEmpty()) {
				label ="Workload Behavior";
			}
			resSlice.setName(label);
			map(res, resSlice);
			resSlice.setKindLabel("Package");
			trace.getSlices().add(resSlice);
		}
		return resSlice;
	}
	
	public synchronized SliceBuilder getSliceForInstanceOfEndToEndFlow(final Object cst, final EndToEndFlow parent) {
		Slice resSlice = slices.get(cst);
		if (resSlice == null) {
			resSlice = TraceFactory.eINSTANCE.createSlice();
			slices.put(cst, resSlice);
			resSlice.setKind(SliceKind.TEMPORAL_CHAIN);
			getSliceFor(parent).getOwnedSubSlices().add(resSlice);
		}
		return new SliceBuilder(this, resSlice);
	}

	public Slice getSliceFor(final List<Object> keys, final String name, final SliceKind kind, final Slice parent) {
		if (keys == null) {
			throw new IllegalArgumentException("keys must not be null");
		}
		if (parent == null) {
			throw new IllegalArgumentException("parent must not be null");
		}
		Slice resSlice = null;
		for(Object aKey: keys) {
			resSlice = slices.get(aKey);
			if (resSlice != null) {
				return resSlice;
			}
		}
		assert(resSlice == null);
		resSlice = TraceFactory.eINSTANCE.createSlice();
		for(Object aKey: keys) {
			slices.put(aKey, resSlice);
		}
		resSlice.setName(name);
		resSlice.setKind(kind);
		parent.getOwnedSubSlices().add(resSlice);
		return resSlice;
	}
	
	public Slice getSliceForTaskOnResource(final SchedulableResource task, final ProcessingResource resource) {
		final Object key = task.hashCode() + 11 * resource.hashCode(); 
		final String name = task.getName() + "_x_" + resource.getName();
		final Slice resSlice = getSliceFor(Arrays.asList(key), name, SliceKind.OTHER, getSliceFor(task));
		resSlice.setKindLabel("Task_x_Resource");
		if (resource != task.eContainer()) {
			getSliceFor(resource).getSubSlices().add(resSlice);
		}
		return resSlice;
	}
	
	public Slice getSliceForJob(final Step step, final int activationId, final SchedulableResource task, final ProcessingResource resource, Object key) {
		final String name = step.getName() + "_" + Integer.toString(activationId);
		final Slice resSlice = getSliceFor(Arrays.asList(activationId, key), name, SliceKind.JOB, getSliceFor(step));
		if (resource != null) {
			final Slice upperSlice = getSliceForTaskOnResource(task, resource);
			upperSlice.getSubSlices().add(resSlice);
		}
		return resSlice;
	}
	
	public Event log(final Duration currentTime, final Slice parent, final SchedulingEventKind kind) {
		final SchedulingEvent evt = TraceFactory.eINSTANCE.createSchedulingEvent();
		evt.setTimestamp(currentTime);
		evt.setKind(kind);
		trace.getEvents().add(evt);
		parent.getEvents().add(evt);
		return evt;
	}
	
	public DurationValueChangeEvent logWorkloadDemand(final Duration currentTime, final Slice parent, final ProcessingResource procResource, final Duration workload) {
		final DurationValueChangeEvent evt = TraceFactory.eINSTANCE.createDurationValueChangeEvent();
		evt.setTimestamp(currentTime);
		evt.setTrace(trace);
		evt.setObject(procResource);
		evt.setValue(workload);
		//TODO evt.setProperty(prop);
		parent.getEvents().add(evt);
		return evt;
	}
	
	public EventBuilder logStartOf(final StepBuilder step) {
		final SliceBuilder aSlice = getSliceFor(step);
		return aSlice.logEvent(SchedulingEventKind.RUNNING);
	}

	public EventBuilder logEndOf(final StepBuilder step) {
		final SliceBuilder aSlice = getSliceFor(step);
		return aSlice.logEvent(SchedulingEventKind.TERMINATED);
	}

	public SliceBuilder logAJobOf(final StepBuilder step) {
		final SliceBuilder aStepSlice = getSliceFor(step);
		final SliceBuilder aJobSlice = aStepSlice.hasJobSlice();
		return aJobSlice;
	}

	public void hasEvent(final EventBuilder evt) {
		trace.getEvents().add(evt.build());
	}

	public SliceBuilder hasASlice() {
		final Slice sl = TraceFactory.eINSTANCE.createSlice();
		build().getSlices().add(sl);
		return new SliceBuilder(this, sl);
	}

	public MappingBuilder mapBuilder() {
		return mapBuilder;
	}
	
	public SchedulingEvent removeLastSchedulingEventFromTrace(final Slice slc) {
		final ArrayList<Event> events = new ArrayList<Event>(slc.getEvents());
		Collections.reverse(events);
		for(Event evt: events) {
			if (evt != null && evt instanceof SchedulingEvent) {
				final SchedulingEvent latest = (SchedulingEvent) evt;
				slc.getEvents().remove(latest);
				return latest;
			}
		}
		return null;
	}

}
