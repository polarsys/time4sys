package org.polarsys.time4sys.graphics.partition.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeContainerSpec;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainer2EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerEditPart;
import org.eclipse.sirius.table.business.internal.metamodel.spec.DLineSpec;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653MIFBuilder;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653PlatformBuilder;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.SchedulingParameter;
import org.polarsys.time4sys.marte.grm.TableEntryType;
import org.polarsys.time4sys.marte.hrm.HardwareComputingResource;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;

public class CRSelectionListener implements ISelectionListener{

	static private Object lastSelection = null;
	
	private static CRSelectionListener instance;
	
	public static CRSelectionListener getInstance() {
		if (instance == null) {
			instance = new CRSelectionListener();
		}
		return instance;
	}
	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (!(selection instanceof IStructuredSelection))
			return;
		IStructuredSelection ss = (IStructuredSelection) selection;
		Object o = ss.getFirstElement();
		
		/* Prevent repetition of selection */
		if(o == lastSelection)
			return;
		lastSelection = o;
		
		if(o instanceof DNodeContainerEditPart){
			DNodeContainerEditPart dNode = (DNodeContainerEditPart)o;
			Object model = dNode.getPrimaryChildEditPart().getModel();
			if(model instanceof NodeImpl) {
				EObject element = ((NodeImpl) model).getElement();
				if(element instanceof DNodeContainerSpec) {
					EObject target = ((DNodeContainerSpec) element).getTarget();
					if(target instanceof HardwareComputingResource) {
						HardwareComputingResource hcr = (HardwareComputingResource)target;	
						//NetworkViewsSynchronizer.changeEdgeColorAccordingToPath(path,lineSpec.eResource(),"Network Architecture");
						
						System.out.println("CRSelectionListener -> HardwareComputingResource selected");
						
						if(isArinc653Platform(hcr)){
							List<TableEntryType> partitions = new ArrayList<TableEntryType>();
							for(Resource resource: hcr.getOwnedResource()){
								if(isArinc653Partition(resource)){
									SoftwareSchedulableResource schedResource = (SoftwareSchedulableResource)resource;
									for(SchedulingParameter param: schedResource.getSchedParams()){
										if(param instanceof TableEntryType){
											partitions.add((TableEntryType)param);
										}
									}
								}
							}
							IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
							IViewPart candidateView = page.findView(PartitionViewPart.ID);
							if(candidateView instanceof PartitionViewPart) {
								PartitionViewPart partitionViewPart = (PartitionViewPart)candidateView;
								PartitionDisplayer.displayPartitions(partitionViewPart,partitions);
							}
						}
						
//						if(GanttView.isSynchronized == true){
//							GanttDisplayer.clear();
//							//ViewUtils.showView("com.linkconet.ganttchart.api.views.GanttView");
		//
//			    			VirtualLink vl = (VirtualLink) ((DLineSpec)lineSpec.eContainer()).getTarget();
//			    			
//			    			String defaultLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
//			    			
//			    			
//			    			List<ComputingResourceResult> crResults = ResultRetriever.getSimulationCRResults(path, vl);
//			    			
//			    			//resultDisplayer.generateDistribution(crResults);
//						}
						
					}
				}
			}
//			if(dNode.getTarget() instanceof HardwareComputingResource){				
				
		}		
	}
	
	public static boolean isArinc653Platform(final EObject value) {
		final HardwareProcessor proc = unwrap(value, HardwareProcessor.class);
		if (proc != null) {
			return Arinc653PlatformBuilder.isInstance(proc);
		}
		return false;
	}
	
	public static boolean isArinc653Partition(final EObject value) {
		final SoftwareSchedulableResource task = unwrap(value, SoftwareSchedulableResource.class);
		if (task != null) {
			return Arinc653MIFBuilder.isInstance(task);
		}
		return false;
	}
	
	public static <T extends EObject> T unwrap(Object obj, final Class<T> clazz) {
		if (obj instanceof DNode) {
			obj = ((DNode)obj).getTarget();
		} 
		if (obj instanceof DNodeContainerSpec) {
			obj = ((DNodeContainerSpec)obj).getTarget();
		}
		if (obj == null) {
			return null;
		}
		if (clazz.isInstance(obj)) {
			return clazz.cast(obj);
		}
		return null;
	}

}
