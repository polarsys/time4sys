package org.polarsys.time4sys.analysis.tools;

import org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.AbstractHyperlinkAdapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;

public class ActivityExplorerActivityContribution extends AbstractHyperlinkAdapter{

	public ActivityExplorerActivityContribution(){
		super(null);
	}

	public ActivityExplorerActivityContribution(EObject root) {
		super(root);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void linkPressed(HyperlinkEvent event, EObject root, Session session) {
		// TODO Auto-generated method stub
		System.out.println("TEST");
	}

}
