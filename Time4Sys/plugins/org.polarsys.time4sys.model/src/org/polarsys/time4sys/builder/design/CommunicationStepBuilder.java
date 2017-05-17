/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.builder.design;

import org.polarsys.time4sys.marte.gqam.Step;

/**
 * @author loic
 *
 */
public class CommunicationStepBuilder extends StepBuilder {

	/**
	 * @param designBuilder
	 * @param taskBuilder
	 */
	public CommunicationStepBuilder(DesignBuilder designBuilder, SchedulableResourceBuilder<?, ?> taskBuilder) {
		super(designBuilder, taskBuilder);
	}

	/**
	 * @param designBuilder
	 * @param taskBuilder
	 * @param raw
	 */
	public CommunicationStepBuilder(DesignBuilder designBuilder, SchedulableResourceBuilder<?, ?> taskBuilder,
			Step raw) {
		super(designBuilder, taskBuilder, raw);
	}

	
	public Step createRawStep() {
		return gqamFactory.createCommunicationStep();
	}
}
