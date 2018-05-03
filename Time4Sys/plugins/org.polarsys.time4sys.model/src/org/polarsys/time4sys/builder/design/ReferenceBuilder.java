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
package org.polarsys.time4sys.builder.design;

import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.Reference;

/**
 * @author loic
 *
 */
public class ReferenceBuilder {

	private Reference rawRef;

	public ReferenceBuilder(final Reference ref) {
		rawRef = ref;
	}

	public ReferenceBuilder(final DesignBuilder designBuilder) {
		rawRef = GqamFactory.eINSTANCE.createReference();
		designBuilder.addReference(rawRef);
	}

	public ReferenceBuilder called(final String name) {
		rawRef.setReferenceName(name);
		return this;
	}

	public Reference build() {
		return rawRef;
	}

	public String getName() {
		return rawRef.getReferenceName();
	}
}
