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

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.time4sys.model.time4sys.Project;

public abstract class AutoRecordingCommand extends RecordingCommand {

	/**
	 * Initializes me with the editing domain in which I am to be executed.
	 * 
	 * @param domain my domain
	 */
	public AutoRecordingCommand(TransactionalEditingDomain domain) {
		super(domain);
	}

	/**
	 * Initializes me with my editing domain and a human-readable label.
	 * 
	 * @param domain my domain
	 * @param label my user-friendly label
	 */
	public AutoRecordingCommand(TransactionalEditingDomain domain, String label) {
		super(domain, label);
	}

	/**
	 * Initializes me with my editing domain, label, and more expansive
	 * description.
	 * 
	 * @param domain my domain
	 * @param label my label
	 * @param description my long description
	 */
	public AutoRecordingCommand(TransactionalEditingDomain domain, String label, String description) {
		super(domain, label, description);
	}

	@Override
	public abstract void doExecute();
	
}
