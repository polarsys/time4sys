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
/**
 * 
 */
package org.polarsys.time4sys.marte.nfp.impl;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author loic
 *
 */
public class NfpFactoryImplTest {

	/**
	 * Test method for {@link org.polarsys.time4sys.marte.nfp.impl.NfpFactoryImpl#convertDoubleToString(double)}.
	 */
	@Test
	public void testConvertDoubleToString() {
		assertEquals("5", NfpFactoryImpl.convertDoubleToString(5.0));
		assertEquals("5.5", NfpFactoryImpl.convertDoubleToString(5.5));
		assertEquals("0", NfpFactoryImpl.convertDoubleToString(0.0));
	}

}
