/*******************************************************************************
 * Copyright (c) 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.simulation.commands;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;

/**
 * A simple wrapper to avoid the fact that a RecordingCommand expect a domain
 * to get the current transaction.
 * Indeed a recording command does not work on EMF Editor like the Time4SysEditor.
 * @author loic
 *
 */
public class RecWrapper implements Command {
	
	protected AutoRecordingCommand underlying;

	public RecWrapper(final AutoRecordingCommand value) {
		underlying = value;
	}

	@Override
	public boolean canExecute() {
		return underlying.canExecute();
	}

	@Override
	public void execute() {
		underlying.doExecute();
	}

	@Override
	public boolean canUndo() {
		return underlying.canUndo();
	}

	@Override
	public void undo() {
		underlying.undo();
	}

	@Override
	public void redo() {
		underlying.redo();
	}

	@Override
	public Collection<?> getResult() {
		return underlying.getResult();
	}

	@Override
	public Collection<?> getAffectedObjects() {
		return underlying.getAffectedObjects();
	}

	@Override
	public String getLabel() {
		return underlying.getLabel();
	}

	@Override
	public String getDescription() {
		return underlying.getDescription();
	}

	@Override
	public void dispose() {
		underlying.dispose();
	}

	@Override
	public Command chain(Command command) {
		return underlying.chain(command);
	}
	
}