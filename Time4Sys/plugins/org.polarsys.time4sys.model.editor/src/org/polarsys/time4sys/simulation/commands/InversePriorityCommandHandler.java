package org.polarsys.time4sys.simulation.commands;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.model.time4sys.Transformation;
import org.polarsys.time4sys.transformations.PriorityUrgencyInverter;

public class InversePriorityCommandHandler extends AbstractTransformationCommandHandler<DesignModel, Transformation> {

	public static class InversePriorityRunnable extends TransfoRunnable<DesignModel, Transformation> {

		public InversePriorityRunnable(final TransactionalEditingDomain domain, final DesignModel value) {
			super(domain, value, "Inverse Priority");
		}

		@Override
		public void doExecute() {
			setResult(PriorityUrgencyInverter.transform(project, obj));
		}
	}

	public InversePriorityCommandHandler() {
		super(DesignModel.class);
	}

	@Override
	protected TransfoRunnable<DesignModel, Transformation> createRecordingCommand(final TransactionalEditingDomain domain, final DesignModel simu) {
		return new InversePriorityRunnable(domain, simu);
	}

}
