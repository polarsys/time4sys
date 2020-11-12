package org.polarsys.time4sys.graphics.partition;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.impl.LongDurationImpl;
import org.polarsys.time4sys.marte.nfp.util.DurationComparator;

public class Slot {
	private Duration start;
	private Duration end;
	
	static public long maxEnd = 0;
	
	
	public Slot(Duration start, Duration end) {
		this.start = start;
		this.end = end;
		if(end instanceof LongDurationImpl)
		if(((LongDurationImpl)end).getValueInPicoSeconds() > maxEnd){
			maxEnd = ((LongDurationImpl)end).getValueInPicoSeconds();
		}
	}
	
	public long getStartValue(){
		if(start instanceof LongDurationImpl)
			return ((LongDurationImpl)start).getValueInPicoSeconds();
		return 0;
	}
	
	public long getEndValue(){
		if(end instanceof LongDurationImpl)
			return ((LongDurationImpl)end).getValueInPicoSeconds();
		return 0;
	}

	public Duration getStart() {
		return start;
	}

	public void setStart(Duration start) {
		this.start = start;
	}

	public Duration getEnd() {
		return end;
	}

	public void setEnd(Duration end) {
		if(((LongDurationImpl)end).getValueInPicoSeconds() > maxEnd){
			maxEnd = ((LongDurationImpl)end).getValueInPicoSeconds();
		}
		this.end = end;
	}
	
	public Duration getLength() {
		return end.sub(start);
	}
}
