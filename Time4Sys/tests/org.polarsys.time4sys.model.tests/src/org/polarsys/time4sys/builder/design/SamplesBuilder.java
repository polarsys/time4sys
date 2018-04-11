/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and code
 *******************************************************************************/
package org.polarsys.time4sys.builder.design;

import static org.polarsys.time4sys.builder.design.TaskBuilder.aTask;
import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.builder.design.DesignBuilder;

/**
 * Build some well-known not so simple examples.
 * @author loic
 *
 */
public class SamplesBuilder {
	
	public static DesignBuilder emmanuelCourseSampleSETR96(final ProjectBuilder project) {
		final DesignBuilder design = project.design();
		final ReferenceBuilder cpuStartRef = design.hasAReference().called("CPU Start");
		design.hasAProcessor().called("Main CPU").thatRuns(
				aTask().called("T1").ofPeriod("8ms").ofOffset("0ms").ofReference(cpuStartRef).ofDeadline("8ms").ofPriority(9),
				aTask().called("T2").ofDeadline("8ms").ofPriority(8),
				aTask().called("T3").ofPeriod("8ms").ofOffset("1ms").ofReference(cpuStartRef).ofDeadline("4ms").ofPriority(1),
				aTask().called("T4").ofDeadline("7ms").ofPriority(10)
		);
		final StepBuilder tau3 = design.task("T3").firstStep().called("tau_3").ofET("1ms");
		final TaskBuilder t1 = design.task("T1");
		final StepBuilder tau11 = t1.firstStep().called("tau_1,1").ofET("1ms");
		final StepBuilder tau12 = t1.anotherStep().called("tau_1,2").ofET("2ms");
		final StepBuilder tau13 = t1.anotherStep().called("tau_1,3").ofET("1ms");
		final StepBuilder tau4 = design.task("T4").firstStep().called("tau_4").ofET("1ms");
		final TaskBuilder t2 = design.task("T2");
		final StepBuilder tau21 = t2.firstStep().called("tau_2,1").ofET("1ms");
		final StepBuilder tau22 = t2.anotherStep().called("tau_2,2").ofET("2ms");
		final StepBuilder tau23 = t2.anotherStep().called("tau_2,3").ofET("1ms");
		
		final OutputPinBuilder t3O = tau3.hasAtLeastOneOutputPin().called("tau3_output").withExactBound(1);
		tau21.hasAtLeastOneInputPin().called("tau21_input").withExactBound(1);
		final OutputPinBuilder t23O = tau23.hasAtLeastOneOutputPin().called("tau3_output").withExactBound(1);
		final OutputPinBuilder t21O = tau21.hasAtLeastOneOutputPin().called("tau21_output").withExactBound(1);
		final OutputPinBuilder t11A = tau11.hasOneOutputPinNamed("t11_output_A").withExactBound(1);
		final OutputPinBuilder t11B = tau11.hasOneOutputPinNamed("t11_output_B").withExactBound(1);
		tau12.hasOneInputPinNamed("t12_input").withExactBound(1).activatedBy(t11A);
		final OutputPinBuilder t12O = tau12.hasOneOutputPinNamed("t12_output").withExactBound(1);
		
		tau21.hasOneInputPinNamed("tau21_input").withExactBound(1).activatedBy(t3O);
		
		tau22.hasOneInputPinNamed("tau22_input_A").withExactBound(1).activatedBy(t11B);
		tau22.hasOneInputPinNamed("tau22_input_B").withExactBound(1).activatedBy(t21O);
		final OutputPinBuilder t22A = tau22.hasOneOutputPinNamed("tau22_output_A").withExactBound(1);
		final OutputPinBuilder t22B = tau22.hasOneOutputPinNamed("tau22_output_B").withExactBound(1);
		tau23.hasOneInputPinNamed("tau23_input").withExactBound(1).activatedBy(t22B);
		
		tau13.hasOneInputPinNamed("tau13_input_A").withExactBound(1).activatedBy(t12O);
		tau13.hasOneInputPinNamed("tau13_input_B").withExactBound(1).activatedBy(t22A);
		
		tau4.hasAtLeastOneInputPin().called("tau4_input").activatedBy(t23O);

		design.build();
		return design;
	}
	

	/**
	 * This is an helper class
	 */
	private SamplesBuilder() {
	}

}
