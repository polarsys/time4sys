/**
 * 
 */
package org.polarsys.time4sys.arinc653.editor.properties.filters;

import org.polarsys.time4sys.marte.hrm.HardwareProcessor;

/**
 * @author loic
 *
 */
public class HardwareProcessorFilter extends FilterByEClass<HardwareProcessor> {

	public static final HardwareProcessorFilter SINGLETON = new HardwareProcessorFilter();
	
	/**
	 * @param clazz
	 */
	public HardwareProcessorFilter() {
		super(HardwareProcessor.class);
	}

}
