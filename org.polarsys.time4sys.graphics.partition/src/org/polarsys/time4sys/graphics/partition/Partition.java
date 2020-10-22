package org.polarsys.time4sys.graphics.partition;

import java.util.ArrayList;
import java.util.List;

public class Partition {

	private String name;
	private List<Slot> slots = new ArrayList<Slot>();

	public void setName(String value) {
		this.name= value;		
	}

	public void addSlot(String start, String end) {
		slots.add(new Slot(start,end));
		
	}

	public String getName() {
		return name;
	}

	public List<Slot> getSlots() {
		return slots;
	}

}
