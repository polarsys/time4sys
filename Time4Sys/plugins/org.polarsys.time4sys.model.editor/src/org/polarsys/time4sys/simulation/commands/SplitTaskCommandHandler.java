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
package org.polarsys.time4sys.simulation.commands;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.model.time4sys.Transformation;
import org.polarsys.time4sys.transformations.TaskSplitter;

public class SplitTaskCommandHandler extends AbstractTransformationCommandHandler<DesignModel, Transformation> {

	public static class TransfoCommand extends TransfoRunnable<DesignModel, Transformation> {

		public TransfoCommand(final TransactionalEditingDomain domain, final DesignModel value) {
			super(domain, value, "Split Tasks");
		}

		@Override
		public void doExecute() {
			setResult(TaskSplitter.transform(
					TaskSplitter.defaultCfg().namesAreIndexBased(),
					AbstractTransformationCommandHandler.getProject(obj),
					obj));
		}
	}

	public SplitTaskCommandHandler() {
		super(DesignModel.class);
	}

	@Override
	public TransfoRunnable<DesignModel, Transformation> createRecordingCommand(final TransactionalEditingDomain domain, final DesignModel simu) {
		return new TransfoCommand(domain, simu);
	}

}
