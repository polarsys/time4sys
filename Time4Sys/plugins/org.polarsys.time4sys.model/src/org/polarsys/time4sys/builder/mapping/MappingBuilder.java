package org.polarsys.time4sys.builder.mapping;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.builder.design.EndToEndFlowConstraintBuilder;
import org.polarsys.time4sys.builder.design.StepBuilder;
import org.polarsys.time4sys.builder.simulation.SimulationBuilder;
import org.polarsys.time4sys.builder.simulation.SliceBuilder;
import org.polarsys.time4sys.builder.simulation.TraceBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.mapping.Context;
import org.polarsys.time4sys.mapping.Link;
import org.polarsys.time4sys.mapping.Mapping;
import org.polarsys.time4sys.mapping.MappingFactory;

public class MappingBuilder {

	private SimulationBuilder simu;
	private Mapping mapping;

	public MappingBuilder(final SimulationBuilder simulationBuilder, final Mapping aMap) {
		simu = simulationBuilder;
		mapping = aMap;
	}

	public void about(final DesignBuilder designBuilder) {
		final DesignModel model = designBuilder.build();
		mapping.getSources().add(MappingFactory.eINSTANCE.createMappableArtefact("model", model));
	}

	public void tracing(TraceBuilder trace) {
		mapping.getTargets().add(MappingFactory.eINSTANCE.createMappableArtefact("trace", trace.build()));
	}

	protected void linking(Context rule,
			String srcRole,
			EObject source,
			String tgtRole,
			EObject target) {
		final Link link = MappingFactory.eINSTANCE.createLink(rule, srcRole, source, tgtRole, target);
		mapping.getSubLinks().add(link);
	}

	public void linking(StepBuilder step, SliceBuilder slice) {
		linking(null, "source", step.build(), "slice", slice.build());
	}

	public void linking(EndToEndFlowConstraintBuilder endToEndFlow, SliceBuilder slice) {
		linking(null, "source", endToEndFlow.build(), "slice", slice.build());
	}

}
