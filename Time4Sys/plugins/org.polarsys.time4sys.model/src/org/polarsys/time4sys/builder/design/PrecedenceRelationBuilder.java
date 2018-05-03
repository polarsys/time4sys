/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 * 
 */
package org.polarsys.time4sys.builder.design;

import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.ConnectorKind;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;

/**
 * @author loic
 *
 */
public class PrecedenceRelationBuilder {
	
	protected static GqamFactory gqamFactory = GqamFactory.eINSTANCE;
	private DesignBuilder design;
	private PrecedenceRelation rel;

	public PrecedenceRelationBuilder(final DesignBuilder designBuilder) {
		this(designBuilder, designBuilder.build().getWorkloadBehavior().getBehavior().get(0));
	}
	
	public PrecedenceRelationBuilder(final DesignBuilder designBuilder, BehaviorScenario owner) {
		design = designBuilder;
		rel = gqamFactory.createPrecedenceRelation();
		rel.setConnectorKind(ConnectorKind.SEQUENCE);
		owner.getConnectors().add(rel);
	}

	public PrecedenceRelation build() {
		return rel;
	}

	public PrecedenceRelationBuilder from(StepBuilder... predecessors) {
		for(StepBuilder step: predecessors) {
			rel.getPredec().add(step.build());
		}
		return this;
	}
	
	public PrecedenceRelationBuilder to(StepBuilder... successors) {
		for(StepBuilder step: successors) {
			rel.getSucces().add(step.build());
		}
		return this;
	}

}
