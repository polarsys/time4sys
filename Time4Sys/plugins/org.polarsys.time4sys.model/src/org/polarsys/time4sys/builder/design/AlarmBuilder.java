/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.builder.design;

import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.ResourceService;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.Alarm;
import org.polarsys.time4sys.marte.srm.InterruptKind;
import org.polarsys.time4sys.marte.srm.NotificationResource;
import org.polarsys.time4sys.marte.srm.SoftwareTimerResource;
import org.polarsys.time4sys.marte.srm.SrmFactory;

/**
 * @author loic
 *
 */
public class AlarmBuilder {
	
	protected static DesignFactory df = DesignFactory.eINSTANCE;
	protected static GqamFactory gqamFactory = GqamFactory.eINSTANCE;
	protected static SrmFactory srmFactory = SrmFactory.eINSTANCE;
	protected static GrmFactory grmFactory = GrmFactory.eINSTANCE;
	protected static HrmFactory hrmFactory = HrmFactory.eINSTANCE;
	protected static NfpFactory nfpFactory = NfpFactory.eINSTANCE;

	public static AlarmBuilder anAlarm() {
		return new AlarmBuilder(null, null);
	}
	
	public static AlarmBuilder aWatchdog() {
		return new AlarmBuilder(null, null).usedAsAWatchdog();
	}

	private DesignBuilder designBuilder = null;
	private Alarm alarm = null;
	private String name = null;

	public AlarmBuilder(DesignBuilder designBuilder, Alarm alarm) {
		this.designBuilder = designBuilder;
		this.alarm = alarm;
	}

	public AlarmBuilder called(final String value) {
		name = value;
		return this;
	}
	
	protected boolean isWatchdog = false;
	private SoftwareTimerResource timer;
	private Duration duration;
	private ResourceService reset;
	private ResourceService signal;;
	
	public AlarmBuilder usedAsAWatchdog() {
		isWatchdog  = true;
		return this;
	}

	public Alarm build(final DesignBuilder value) {
		if (designBuilder == null && value != null) {
			designBuilder = value;
		}
		assert(designBuilder != null);
		if (alarm == null) {
			alarm = srmFactory.createAlarm();
			if (name != null) {
				alarm.setName(name);
			}
			alarm.setIsWatchdog(isWatchdog);
			if (isWatchdog) {
				alarm.setKind(InterruptKind.HARDWARE_INTERRUPTION);
			}
		}
		if (alarm.getTimers().isEmpty()) {
			timer = srmFactory.createSoftwareTimerResource();
			alarm.getOwnedResource().add(timer);
			alarm.getTimers().add(timer);
			if (duration != null) {
				timer.setDuration(duration);
			}
			NotificationResource notif = null;
			for(NotificationResource res: alarm.getNotificationResources()) {
				notif = (NotificationResource)res;
				break;
			}
			if (notif == null) {
				notif = srmFactory.createNotificationResource();
				notif.setName(name + " notification");
				alarm.getOwnedResource().add(notif);
				alarm.getNotificationResources().add(notif);
			}
			assert(notif != null);
			if (notif.getSignalServices().isEmpty()) {
				signal = grmFactory.createResourceService();
				signal.setName(name + " signal");
				alarm.getPServices().add(signal);
				notif.getSignalServices().add(signal);
			}
			if(timer.getReset() == null) {
				reset = grmFactory.createResourceService();
				reset.setName("reset " + name);
				timer.getPServices().add(reset);
				timer.setReset(reset);
			}
		}
		assert(reset != null);
		assert(signal != null);
		assert(!alarm.getNotificationResources().isEmpty());
		assert(!alarm.getNotificationResources().get(0).getSignalServices().isEmpty());
		return alarm;
	}

	public AlarmBuilder ofDuration(final String value) {
		duration = nfpFactory.createDurationFromString(value);
		return this;
	}

	public void activates(final StepBuilder step) {
		
	}

	public AlarmBuilder handledBy(final ProcessorBuilder theProcA) {
		build(null);
		final HardwareProcessor proc = theProcA.build();
		proc.getOwnedResource().add(alarm);
		return this;
	}

	public ResourceService buildResetService(final DesignBuilder value) {
		build(value);
		assert(reset != null);
		return reset;
	}
	
	public ResourceService buildSignalService(final DesignBuilder value) {
		build(value);
		assert(signal != null);
		return signal;
	}
}
