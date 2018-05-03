/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.analysis.tools;

import org.eclipse.emf.validation.AbstractModelConstraint;

public abstract class AbstractTime4SysRule extends AbstractModelConstraint {

	public boolean isActive = false;
	
}
