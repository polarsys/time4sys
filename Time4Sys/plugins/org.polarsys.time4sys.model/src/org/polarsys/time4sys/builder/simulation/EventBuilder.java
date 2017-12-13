package org.polarsys.time4sys.builder.simulation;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.trace.Event;
import org.polarsys.time4sys.trace.SchedulingEvent;

public class EventBuilder {

	private SchedulingEvent evt;

	public EventBuilder(final SliceBuilder sliceBuilder, final SchedulingEvent anEvt) {
		evt = anEvt;
	}

	public EventBuilder at(final String pit) {
		final Duration timestamp = NfpFactory.eINSTANCE.createDurationFromString(pit);
		evt.setTimestamp(timestamp);
		return this;
	}

	public Event build() {
		return evt;
	}

}
