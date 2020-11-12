package org.polarsys.time4sys.graphics.partition;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.time4sys.marte.nfp.Duration;

public class Partition {

	private String name;
	private List<Slot> slots = new ArrayList<Slot>();

	public void setName(String value) {
		this.name= value;		
	}

	public void addSlot(Duration start, Duration end) {
		slots.add(new Slot(start,end));
		
	}

	public String getName() {
		return name;
	}

	public List<Slot> getSlots() {
		return slots;
	}

}
