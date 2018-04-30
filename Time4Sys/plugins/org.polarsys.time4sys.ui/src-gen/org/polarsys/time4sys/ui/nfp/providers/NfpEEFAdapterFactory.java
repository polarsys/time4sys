/**
 * Generated with Acceleo
 */
package org.polarsys.time4sys.ui.nfp.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.polarsys.time4sys.marte.nfp.util.NfpAdapterFactory;

/**
 * 
 * 
 */
public class NfpEEFAdapterFactory extends NfpAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.nfp.util.NfpAdapterFactory#createTimeIntervalAdapter()
	 * 
	 */
	public Adapter createTimeIntervalAdapter() {
		return new TimeIntervalPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.polarsys.time4sys.marte.nfp.util.NfpAdapterFactory#createDurationAdapter()
	 * 
	 */
	public Adapter createDurationAdapter() {
		return new DurationPropertiesEditionProvider();
	}

}
