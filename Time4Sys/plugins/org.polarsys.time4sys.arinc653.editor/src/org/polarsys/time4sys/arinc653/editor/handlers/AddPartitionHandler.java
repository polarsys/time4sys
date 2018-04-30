package org.polarsys.time4sys.arinc653.editor.handlers;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653MIFBuilder;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653PlatformBuilder;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.simulation.commands.AbstractTransformationCommandHandler;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class AddPartitionHandler  extends AbstractTransformationCommandHandler<HardwareProcessor, SoftwareSchedulableResource> {

	public static class TransfoCommand extends TransfoRunnable<HardwareProcessor, SoftwareSchedulableResource> {

		public TransfoCommand(final TransactionalEditingDomain domain, final HardwareProcessor value) {
			super(domain, value, "Arinc653 partition creation");
		}

		@Override
		public void doExecute() {
			Arinc653PlatformBuilder.as(obj).addPartition(Arinc653MIFBuilder.aPartition());
		}
	}

	public AddPartitionHandler() {
		super(HardwareProcessor.class);
	}

	@Override
	protected TransfoRunnable<HardwareProcessor, SoftwareSchedulableResource> createRecordingCommand(final TransactionalEditingDomain domain, final HardwareProcessor ima) {
		return new TransfoCommand(domain, ima);
	}
}
