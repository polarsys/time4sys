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
package org.polarsys.time4sys.arinc653.editor.properties.sources;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653PlatformBuilder;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;
import org.polarsys.time4sys.simulation.commands.AutoRecordingCommand;
import org.polarsys.time4sys.simulation.commands.CommandRunner;

/**
 * @author loic
 *
 */
public class PlatformPropertySource implements IPropertySource {

	public static final String IS_PLATFORM_ATTR = "IS_PLATFORM".intern();
	protected static IPropertyDescriptor IS_PLATFORM_PROP = new TextPropertyDescriptor(IS_PLATFORM_ATTR,
			"Is platform?");

	public static final String MIF_ATTR = "mif".intern();
	protected static IPropertyDescriptor MIF_PROP = new TextPropertyDescriptor(MIF_ATTR, "MIF");

	public static final String MAF_ATTR = "maf".intern();
	protected static IPropertyDescriptor MAF_PROP = new TextPropertyDescriptor(MAF_ATTR, "MAF");

	public static final String MIF_COUNT_ATTR = "#mif".intern();
	protected static IPropertyDescriptor MIF_COUNT_PROP = new TextPropertyDescriptor(MIF_COUNT_ATTR, "#MIFs");

	protected static IPropertyDescriptor[] PROPS_WO = new IPropertyDescriptor[] { IS_PLATFORM_PROP };
	protected static IPropertyDescriptor[] PROPS = new IPropertyDescriptor[] { IS_PLATFORM_PROP, MIF_PROP, MAF_PROP,
			MIF_COUNT_PROP };
	protected HardwareProcessor proc;
	private Arinc653PlatformBuilder procBuilder;
	private IWorkbenchPage page;

	/**
	 * @param workbenchPage
	 * @param object
	 * 
	 */
	public PlatformPropertySource(final HardwareProcessor value, final IWorkbenchPage workbenchPage) {
		proc = value;
		page = workbenchPage;
		if (Arinc653PlatformBuilder.isInstance(proc)) {
			procBuilder = Arinc653PlatformBuilder.as(proc);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.views.properties.IPropertySource#getEditableValue()
	 */
	@Override
	public Object getEditableValue() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
	 */
	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		if (procBuilder == null) {
			return PROPS_WO;
		} else {
			return PROPS;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.
	 * lang.Object)
	 */
	@Override
	public Object getPropertyValue(Object id) {
		if (id == IS_PLATFORM_ATTR) {
			return (procBuilder == null) ? "False" : "True";
		} else if (id == MIF_ATTR) {
			try {
				return procBuilder.getSchedBuilder().getMIFDuration().toString();
			} catch (IllegalStateException e) {
				return null;
			}
		} else if (id == MAF_ATTR) {
			return procBuilder.getMAFDuration().toString();
		} else if (id == MIF_COUNT_ATTR) {
			return Long.toString(procBuilder.countMIF());
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.IPropertySource#isPropertySet(java.lang.
	 * Object)
	 */
	@Override
	public boolean isPropertySet(Object id) {
		if (procBuilder == null) {
			return false;
		}
		if (id == IS_PLATFORM_ATTR) {
			return true;
		} else if (id == MIF_ATTR || id == MAF_ATTR || id == MIF_COUNT_ATTR) {
			return (procBuilder != null);
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.
	 * lang.Object)
	 */
	@Override
	public void resetPropertyValue(Object id) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.
	 * lang.Object, java.lang.Object)
	 */
	@Override
	public void setPropertyValue(Object id, Object value) {
		final CommandRunner runner = new CommandRunner(page, value);
		AutoRecordingCommand aCmd = null;
		if (id == IS_PLATFORM_ATTR) {
			aCmd = setIsPlatform(value, runner);
		} else if (id == MIF_ATTR) {
			aCmd = setMIF(value, runner);
		}
		runner.execute(aCmd);
	}

	public AutoRecordingCommand setMIF(Object value, final CommandRunner runner) {
		if (value == null) {
			return null;
		}
		AutoRecordingCommand aCmd = new AutoRecordingCommand(runner.getDomain()) {

			@Override
			public void doExecute() {
				procBuilder.withMIFDuration(value.toString());
				procBuilder.build();
			}
		};
		return aCmd;
	}

	public AutoRecordingCommand setIsPlatform(final Object value, final CommandRunner runner) {
		if (value == null) {
			return null;
		}
		AutoRecordingCommand aCmd;
		if (Boolean.parseBoolean(value.toString())) {
			aCmd = new AutoRecordingCommand(runner.getDomain()) {

				@Override
				public void doExecute() {
					procBuilder = Arinc653PlatformBuilder.as(proc);
				}
			};
		} else {
			aCmd = new AutoRecordingCommand(runner.getDomain()) {

				@Override
				public void doExecute() {
					procBuilder.setNotAPlatform();
					procBuilder = null;
				}
			};
		}
		return aCmd;
	}

}
