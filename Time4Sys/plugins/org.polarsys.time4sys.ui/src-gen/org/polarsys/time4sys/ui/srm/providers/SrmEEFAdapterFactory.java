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
package org.polarsys.time4sys.ui.srm.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory;

/**
 * 
 * 
 */
public class SrmEEFAdapterFactory extends SrmAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createSoftwareResourceAdapter()
	 * 
	 */
	public Adapter createSoftwareResourceAdapter() {
		return new SoftwareResourcePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createInterruptResourceAdapter()
	 * 
	 */
	public Adapter createInterruptResourceAdapter() {
		return new InterruptResourcePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createAlarmAdapter()
	 * 
	 */
	public Adapter createAlarmAdapter() {
		return new AlarmPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createDeviceBrokerAdapter()
	 * 
	 */
	public Adapter createDeviceBrokerAdapter() {
		return new DeviceBrokerPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createMemoryBrokerAdapter()
	 * 
	 */
	public Adapter createMemoryBrokerAdapter() {
		return new MemoryBrokerPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createMemoryPartitionAdapter()
	 * 
	 */
	public Adapter createMemoryPartitionAdapter() {
		return new MemoryPartitionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createMessageComResourceAdapter()
	 * 
	 */
	public Adapter createMessageComResourceAdapter() {
		return new MessageComResourcePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createNotificationResourceAdapter()
	 * 
	 */
	public Adapter createNotificationResourceAdapter() {
		return new NotificationResourcePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createSharedDataComResourceAdapter()
	 * 
	 */
	public Adapter createSharedDataComResourceAdapter() {
		return new SharedDataComResourcePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createSoftwareAccessServiceAdapter()
	 * 
	 */
	public Adapter createSoftwareAccessServiceAdapter() {
		return new SoftwareAccessServicePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createSoftwareArchitectureAdapter()
	 * 
	 */
	public Adapter createSoftwareArchitectureAdapter() {
		return new SoftwareArchitecturePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createSoftwareConnectorAdapter()
	 * 
	 */
	public Adapter createSoftwareConnectorAdapter() {
		return new SoftwareConnectorPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createSoftwareInterfaceAdapter()
	 * 
	 */
	public Adapter createSoftwareInterfaceAdapter() {
		return new SoftwareInterfacePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createSoftwareInterfacePackageAdapter()
	 * 
	 */
	public Adapter createSoftwareInterfacePackageAdapter() {
		return new SoftwareInterfacePackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createSoftwareMutualExclusionResourceAdapter()
	 * 
	 */
	public Adapter createSoftwareMutualExclusionResourceAdapter() {
		return new SoftwareMutualExclusionResourcePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createSoftwarePortAdapter()
	 * 
	 */
	public Adapter createSoftwarePortAdapter() {
		return new SoftwarePortPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createSoftwareResourcePackageAdapter()
	 * 
	 */
	public Adapter createSoftwareResourcePackageAdapter() {
		return new SoftwareResourcePackagePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createSoftwareSchedulableResourceAdapter()
	 * 
	 */
	public Adapter createSoftwareSchedulableResourceAdapter() {
		return new SoftwareSchedulableResourcePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createSoftwareSchedulerAdapter()
	 * 
	 */
	public Adapter createSoftwareSchedulerAdapter() {
		return new SoftwareSchedulerPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createSoftwareServiceAdapter()
	 * 
	 */
	public Adapter createSoftwareServiceAdapter() {
		return new SoftwareServicePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.srm.util.SrmAdapterFactory#createSoftwareTimerResourceAdapter()
	 * 
	 */
	public Adapter createSoftwareTimerResourceAdapter() {
		return new SoftwareTimerResourcePropertiesEditionProvider();
	}

}
