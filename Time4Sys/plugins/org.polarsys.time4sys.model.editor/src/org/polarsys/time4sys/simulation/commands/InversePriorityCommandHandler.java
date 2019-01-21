/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.simulation.commands;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.model.time4sys.Transformation;
import org.polarsys.time4sys.transformations.PriorityUrgencyInverter;

public class InversePriorityCommandHandler extends AbstractTransformationCommandHandler<DesignModel, Transformation> {

	public static class InversePriorityRunnable extends TransfoRunnable<DesignModel, Transformation> {

		public InversePriorityRunnable(final TransactionalEditingDomain domain, final DesignModel value) {
			super(domain, value, "Inverse Priority");
		}

		@Override
		public void doExecute() {
			setResult(PriorityUrgencyInverter.transform(project, obj));
		}
	}

	public InversePriorityCommandHandler() {
		super(DesignModel.class);
	}

	@Override
	public TransfoRunnable<DesignModel, Transformation> createRecordingCommand(final TransactionalEditingDomain domain, final DesignModel simu) {
		return new InversePriorityRunnable(domain, simu);
	}

}
