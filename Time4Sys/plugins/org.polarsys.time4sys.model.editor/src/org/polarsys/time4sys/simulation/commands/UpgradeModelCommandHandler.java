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
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.transformations.RemoveAndReplaceDeprecated;

public class UpgradeModelCommandHandler extends AbstractTransformationCommandHandler<Project, Project> {

	public static class UpgradeModelRunnable extends TransfoRunnable<Project, Project> {

		public UpgradeModelRunnable(final TransactionalEditingDomain domain, final Project value) {
			super(domain, value, "Remove deprecated");
		}

		@Override
		public void doExecute() {
			RemoveAndReplaceDeprecated.removeAndReplaceDeprecated(obj);
			setResult(obj);
		}

	}

	public UpgradeModelCommandHandler() {
		super(Project.class);
	}

	@Override
	public TransfoRunnable<Project, Project> createRecordingCommand(final TransactionalEditingDomain domain, final Project simu) {
		return new UpgradeModelRunnable(domain, simu);
	}

		
}
