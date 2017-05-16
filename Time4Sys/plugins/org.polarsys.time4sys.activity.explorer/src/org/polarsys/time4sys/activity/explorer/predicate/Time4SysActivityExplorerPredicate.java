/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.activity.explorer.predicate;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.predicates.IPredicate;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.polarsys.time4sys.model.time4sys.Project;

public class Time4SysActivityExplorerPredicate implements IPredicate {

	public Time4SysActivityExplorerPredicate() {
	}

	@Override
	public boolean isOk() {
		return ActivityExplorerManager.INSTANCE.getRootSemanticModel() instanceof Project;
	}
}
