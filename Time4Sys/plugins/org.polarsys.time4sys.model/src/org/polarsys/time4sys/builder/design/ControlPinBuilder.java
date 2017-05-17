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

import org.polarsys.time4sys.marte.gqam.ControlPin;
import org.polarsys.time4sys.marte.gqam.GqamPackage;

/**
 * @author loic
 *
 */
public abstract class ControlPinBuilder<P extends ControlPin, B extends ControlPinBuilder<?,B>> {

	protected P pin;

	protected ControlPinBuilder(P pin) {
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
}
