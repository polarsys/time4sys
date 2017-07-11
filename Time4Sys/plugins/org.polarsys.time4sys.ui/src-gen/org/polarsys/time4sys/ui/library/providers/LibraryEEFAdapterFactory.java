/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 * Generated with Acceleo
 */
package org.polarsys.time4sys.ui.library.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.polarsys.time4sys.library.util.LibraryAdapterFactory;

/**
 * 
 * 
 */
public class LibraryEEFAdapterFactory extends LibraryAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.library.util.LibraryAdapterFactory#createTDMAAdapter()
	 * 
	 */
	public Adapter createTDMAAdapter() {
		return new TDMAPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.library.util.LibraryAdapterFactory#createDeadlineMonotonicSchedulingPolicyAdapter()
	 * 
	 */
	public Adapter createDeadlineMonotonicSchedulingPolicyAdapter() {
		return new DeadlineMonotonicSchedulingPolicyPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.library.util.LibraryAdapterFactory#createRateMonotonicSchedulingPolicyAdapter()
	 * 
	 */
	public Adapter createRateMonotonicSchedulingPolicyAdapter() {
		return new RateMonotonicSchedulingPolicyPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.library.util.LibraryAdapterFactory#createHardwareCANBusAdapter()
	 * 
	 */
	public Adapter createHardwareCANBusAdapter() {
		return new HardwareCANBusPropertiesEditionProvider();
	}

}
