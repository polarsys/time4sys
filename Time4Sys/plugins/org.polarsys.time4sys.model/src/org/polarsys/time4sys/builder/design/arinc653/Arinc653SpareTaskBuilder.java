/**
 * 
 */
package org.polarsys.time4sys.builder.design.arinc653;

import org.eclipse.emf.ecore.EAnnotation;
import org.polarsys.time4sys.builder.design.TaskBuilder;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;

/**
 * @author loic
 *
 */
public class Arinc653SpareTaskBuilder {
	
	public static final String SPARE_ATTR = "spare";

	public static TaskBuilder aSpareTask() {
		final TaskBuilder taskBuilder = new TaskBuilder();
		asSpare(taskBuilder);
		return taskBuilder;
	}
	
	public static void asSpare(final SoftwareSchedulableResource task) {
		asSpare(new TaskBuilder(null, task));
	}
	
	public static void asSpare(final TaskBuilder taskBuilder) {
		final EAnnotation annot = taskBuilder.annotate(Arinc653Builder.ARINC653_URL);
		annot.getDetails().put(SPARE_ATTR, Boolean.TRUE.toString());
	}
	
	public static boolean isSpare(final SoftwareSchedulableResource task) {
		final EAnnotation annot = task.getEAnnotation(Arinc653Builder.ARINC653_URL);
		if (annot == null) {
			return false;
		}
		return annot.getDetails().get(SPARE_ATTR).equals(Boolean.TRUE.toString());
	}

	/**
	 * This is an helper class
	 */
	private Arinc653SpareTaskBuilder() {
	}

}
