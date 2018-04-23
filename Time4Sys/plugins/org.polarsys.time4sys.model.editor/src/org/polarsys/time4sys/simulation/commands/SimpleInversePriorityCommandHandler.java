package org.polarsys.time4sys.simulation.commands;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.model.time4sys.Transformation;
import org.polarsys.time4sys.transformations.PriorityUrgencyInverter;

public class SimpleInversePriorityCommandHandler extends AbstractTransformationCommandHandler<DesignModel, Transformation> {

	public static class SimpleInversePriorityRunnable extends TransfoRunnable<DesignModel, Transformation> {

		public SimpleInversePriorityRunnable(final TransactionalEditingDomain domain, final DesignModel value) {
			super(domain, value, "Simple Priority Inversion");
		}

		@Override
		public void doExecute() {
			setResult(PriorityUrgencyInverter.transform(
					PriorityUrgencyInverter.defaultCfg().inverseOnly(),
					project,
					obj));
		}

	}

	public SimpleInversePriorityCommandHandler() {
		super(DesignModel.class);
	}

	@Override
	protected TransfoRunnable<DesignModel, Transformation> createRecordingCommand(final TransactionalEditingDomain domain, final DesignModel simu) {
		return new SimpleInversePriorityRunnable(domain, simu);
	}

}
