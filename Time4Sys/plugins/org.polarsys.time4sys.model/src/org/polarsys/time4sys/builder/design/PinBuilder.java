/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.builder.design;

import org.polarsys.time4sys.marte.gqam.GqamPackage;
import org.polarsys.time4sys.marte.gqam.Pin;

/**
 * @author loic
 *
 */
public abstract class PinBuilder<P extends Pin, B extends PinBuilder<?,B>> {

	protected P pin;

	protected PinBuilder(P pin) {
		this.pin = pin;
		if (!pin.eIsSet(GqamPackage.eINSTANCE.getMultiplicityElement_LowerBound())) {
			pin.setLowerBound(1);
		}
		if (!pin.eIsSet(GqamPackage.eINSTANCE.getMultiplicityElement_UpperBound())) {
			pin.setUpperBound(1);
		}
	}
	
	protected abstract B self();

	public B called(final String value) {
		pin.setName(value);
		return self();
	}
	
	public B withExactBound(int n) {
		withLowerBound(n);
		withUpperBound(n);
		return self();
	}

	public B withUpperBound(int n) {
		pin.setUpperBound(n);
		return self();
	}

	public B withLowerBound(int n) {
		pin.setLowerBound(n);
		return self();
	}
	
	public P build() {
		return pin;
	}
	
	public boolean isControl() {
		return pin.isIsControl();
	}
}
