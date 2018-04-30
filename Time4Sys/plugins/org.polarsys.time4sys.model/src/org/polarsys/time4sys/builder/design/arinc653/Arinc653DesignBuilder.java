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

import org.eclipse.emf.ecore.EObject;
import org.polarsys.time4sys.builder.ProjectBuilder;
import org.polarsys.time4sys.builder.design.DesignBuilder;
import org.polarsys.time4sys.design.DesignModel;

/**
 * @author Utilisateur
 *
 */
public class Arinc653DesignBuilder extends DesignBuilder {

	public static Arinc653DesignBuilder containing(EObject value) {
		value = searchDesign(value);
		return new Arinc653DesignBuilder((DesignModel)value);
	}
	
	/**
	 * @param model
	 */
	public Arinc653DesignBuilder(final DesignModel model) {
		super(model);
	}

	/**
	 * @param projectBuilder
	 * @param designModel
	 */
	public Arinc653DesignBuilder(final ProjectBuilder projectBuilder, final DesignModel designModel) {
		super(projectBuilder, designModel);
	}

	public Arinc653DesignBuilder(final DesignBuilder design) {
		this(design.build());
	}

	public Arinc653DesignBuilder called(String name) {
		super.called(name);
		return this;
	}

	public Arinc653PlatformBuilder hasAPlatform() {
		return new Arinc653PlatformBuilder(this);
	}

}
