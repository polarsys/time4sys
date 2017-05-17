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

import org.polarsys.time4sys.marte.grm.SchedulableResource;

/**
 * @author loic
 *
 */
public interface SchedulableResourceBuilder<T extends SchedulableResource, R extends SchedulableResourceBuilder<?,?>> {

	T build(DesignBuilder design);
}
