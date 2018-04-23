package org.polarsys.time4sys.simulation.commands;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.model.time4sys.Transformation;
import org.polarsys.time4sys.transformations.ActivationPropagator;

public class PropagateActivationsCommandHandler extends AbstractTransformationCommandHandler<DesignModel, Transformation> {

	public static class TransfoCommand extends TransfoRunnable<DesignModel, Transformation> {

		public TransfoCommand(final TransactionalEditingDomain domain, final DesignModel value) {
			super(domain, value, "Propagate Activations");
		}

		@Override
		public void doExecute() {
			setResult(ActivationPropagator.transform(
					project,
					obj));
		}
	}

	public PropagateActivationsCommandHandler() {
		super(DesignModel.class);
	}

	@Override
	protected TransfoRunnable<DesignModel, Transformation> createRecordingCommand(final TransactionalEditingDomain domain, final DesignModel simu) {
		return new TransfoCommand(domain, simu);
	}

}
