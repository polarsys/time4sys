package org.polarsys.time4sys.graphics.partition.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.polarsys.time4sys.graphics.partition.Partition;
import org.polarsys.time4sys.graphics.partition.Slot;
import org.polarsys.time4sys.marte.grm.ComputingResource;
import org.polarsys.time4sys.marte.grm.TableEntryType;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;

public class PartitionDisplayer {
	//private static List<TableEntryType> tableEntryTypeList;
	private static Map<Partition,TableEntryType> partitionTableEntry = new HashMap<Partition,TableEntryType>();
	
	public static void displayPartitions(PartitionViewPart partitionViewPart, final List<TableEntryType> tableEntryList) {
		//tableEntryTypeList = tableEntryList;
		partitionTableEntry.clear();
		List<Partition> partitions = new ArrayList<Partition>();
		for(TableEntryType tableEntry: tableEntryList){
			SoftwareSchedulableResource partition = (SoftwareSchedulableResource)(tableEntry.eContainer());
			ComputingResource cpu = (ComputingResource)(partition.eContainer());
			
			partitionViewPart.setCPUName(cpu.getName());
			
			Partition part = new Partition();
			part.setName(tableEntry.getName().replace("Time Slots ", ""));
			
			int nbIter = Math.min(tableEntry.getOffset().size(), tableEntry.getTimeSlot().size());
			for(int i=0; i< nbIter; i++) {
				Duration start = tableEntry.getOffset().get(i);
				Duration end = tableEntry.getTimeSlot().get(i).add(start);
				part.addSlot(start,end);			
			}
			partitions.add(part);
			partitionTableEntry.put(part, tableEntry);
		}

		partitionViewPart.setPartitions(partitions);
		partitionViewPart.reinit();
	}
	
	public static void updatePartitions() {
		//SoftwareSchedulableResource partition = (SoftwareSchedulableResource)(tableEntry.eContainer());
		/* Updates values corresponding to tableEntry */
		for(Entry<Partition,TableEntryType> entry: partitionTableEntry.entrySet()) {
			List<Duration> offsets = new ArrayList<Duration>();
			List<Duration> timeSlots = new ArrayList<Duration>();					
			for(Slot slot: entry.getKey().getSlots()) {
				offsets.add(slot.getStart());
				timeSlots.add(slot.getEnd().sub(slot.getStart()));
			}
			updateTableEntry(entry.getValue(),offsets,timeSlots);	
		}	
	}
	
	private static void updateTableEntry(final TableEntryType tableEntry,final List<Duration> offsets, final List<Duration> timeSlots) {

		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(tableEntry);		
		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				tableEntry.getOffset().clear();
				for(Duration offset: offsets) {
					tableEntry.getOffset().add(offset);//NfpFactory.eINSTANCE.createDurationFromString("12345ms"));
				}
				tableEntry.getTimeSlot().clear();
				for(Duration timeSlot: timeSlots) {
					tableEntry.getTimeSlot().add(timeSlot);//NfpFactory.eINSTANCE.createDurationFromString("12345ms"));
				}
			}	
		});
	}
}
