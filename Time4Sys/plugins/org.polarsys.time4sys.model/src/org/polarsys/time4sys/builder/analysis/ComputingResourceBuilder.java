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
/**
 * 
 */
package org.polarsys.time4sys.builder.analysis;

import org.polarsys.time4sys.analysis.AnalysisFactory;
import org.polarsys.time4sys.analysis.ComputingResource;

/**
 * @author loic
 *
 */
public class ComputingResourceBuilder {

	private AnalysisBuilder analysis;
	private String name;
	private ComputingResource value;

	public ComputingResourceBuilder() {
	}

	public ComputingResourceBuilder(final AnalysisBuilder analysisBuilder) {
		analysis = analysisBuilder;
	}

	public ComputingResourceBuilder called(final String value) {
		name = value;
		return this;
	}


	public ComputingResource build() {
		if (value != null) {
			return value;
		}
		value = AnalysisFactory.eINSTANCE.createComputingResource();
		value.setParent(analysis.build());
		value.setName(name);
		return value;
	}

}
