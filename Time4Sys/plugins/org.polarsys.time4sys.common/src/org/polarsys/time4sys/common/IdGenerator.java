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
package org.polarsys.time4sys.common;

import java.util.UUID;

/**
 * Generate pseudo-unique IDs.
 * 
 * @version 0.8.0
 */
public class IdGenerator {
	/**
	 * Unique number inside a Java session.
	 */
	private static long __sessionUniqueNumber = 0;

	/**
	 * Generate a pseudo-unique ID.
	 * 
	 * @return a pseudo-unique ID
	 */
	public static String createId() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}

	/**
	 * Generate an unique long value (unique during one Java session).
	 * 
	 * @return an unique long value (unique during one Java session)
	 */
	public static long getSessionUniqueNumber() {
		return __sessionUniqueNumber++;
	}
}
