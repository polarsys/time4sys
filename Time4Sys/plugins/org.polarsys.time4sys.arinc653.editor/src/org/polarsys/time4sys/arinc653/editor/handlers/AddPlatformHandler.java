package org.polarsys.time4sys.arinc653.editor.handlers;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.time4sys.builder.design.arinc653.Arinc653DesignBuilder;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.grm.ResourcePackage;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;
import org.polarsys.time4sys.simulation.commands.AbstractTransformationCommandHandler;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class AddPlatformHandler  extends AbstractTransformationCommandHandler<DesignModel, HardwareProcessor> {

	public static class TransfoCommand extends TransfoRunnable<DesignModel, HardwareProcessor> {

		public TransfoCommand(final TransactionalEditingDomain domain, final DesignModel ima) {
			super(domain, ima);
		}

		@Override
		public void doExecute() {
			final Arinc653DesignBuilder db = new Arinc653DesignBuilder(obj);
			setResult(db.hasAPlatform().build());
			db.build();
		}
	}

	public AddPlatformHandler() {
		super(DesignModel.class);
	}

	@Override
	protected TransfoRunnable<DesignModel, HardwareProcessor> createRecordingCommand(final TransactionalEditingDomain domain, final DesignModel ima) {
		return new TransfoCommand(domain, ima);
	}
	
	@Override
	protected DesignModel adapt(final Object obj) {
		if (obj instanceof DesignModel) {
			return (DesignModel)obj;
		}
		if (obj instanceof ResourcePackage) {
			return adapt(((ResourcePackage)obj).eContainer());
		}
		return null;
	}
}
