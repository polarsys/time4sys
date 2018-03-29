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
package org.polarsys.time4sys.builder.design.arinc653;

import org.polarsys.time4sys.builder.ProjectBuilder;

/**
 * @author Utilisateur
 *
 */
public class Arinc653Builder {

	/**
	 * 
	 */
	public Arinc653Builder() {
	}

	public static Arinc653DesignBuilder newDesign(final ProjectBuilder theProject) {
		return new Arinc653DesignBuilder(theProject.design());
	}

}
