/*******************************************************************************
 * Copyright (c) 2017, 2019 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Aurelien Didier - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.marte.analysisrepository.tysco.util;

import org.polarsys.time4sys.marte.analysisrepository.tysco.TestImplementation;

public interface AbstractExogenousTransformation {

	public void transform(TestImplementation test);

}
