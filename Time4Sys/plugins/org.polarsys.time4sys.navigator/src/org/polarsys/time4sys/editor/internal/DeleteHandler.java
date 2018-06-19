/*******************************************************************************
 * Copyright (c) 2014, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.editor.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.ui.handlers.HandlerUtil;
import org.polarsys.time4sys.marte.nfp.coreelements.ModelElement;

/**
 * Delete UML Element.
 *
 * @author Melanie Bats <a href="mailto:melanie.bats@obeo.fr">melanie.bats@obeo.fr</a>
 */
public class DeleteHandler extends AbstractHandler {

	private Session collectSessionAndFillSelection(ISelection selection, List<EObject> selected) {
		Session session = null;

		if (selection instanceof StructuredSelection) {
			for (final Object obj : ((StructuredSelection)selection).toArray()) {
				if (obj instanceof ModelElement || obj instanceof EModelElement) {
					selected.add((EObject)obj);
					if (session == null) {
						session = SessionManager.INSTANCE.getSession((EObject)obj);
					}
				}
			}
		}
		return session;
	}

	/**
	 * {@inheritDoc}
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ISelection selection = HandlerUtil.getCurrentSelection(event);

		final List<EObject> selected = new ArrayList<EObject>();
		final Session session = collectSessionAndFillSelection(selection, selected);

		if (session != null) {
			final RecordingCommand cmd = new RecordingCommand(session.getTransactionalEditingDomain(),
					"Delete from model") { //$NON-NLS-1$
				@Override
				protected void doExecute() {

					for (final EObject element : selected) {
						destroy(element);
					}

					// Refresh all diagrams
					final Collection<DRepresentation> representations = DialectManager.INSTANCE
							.getAllRepresentations(session);
					for (final DRepresentation representation : representations) {
						// We test if the root element still exists
						if (representation instanceof DSemanticDiagram) {
							final DSemanticDiagram diagram = (DSemanticDiagram)representation;
							if (diagram.getTarget() != null
									&& DialectManager.INSTANCE.canRefresh(representation)) {
								DialectManager.INSTANCE.refresh(representation, new NullProgressMonitor());
							}
						}
					}
				}
			};
			session.getTransactionalEditingDomain().getCommandStack().execute(cmd);
		}
		return null;
	}

	/**
	 * Destroy a semantic element and all its references.
	 *
	 * @param ancestorEObject
	 *            Element to destroy
	 * @see ElementOperations#destroy(Element)
	 */
	public void destroy(EObject ancestorEObject) {
		if (ancestorEObject.eContents().isEmpty()) {
			if (ancestorEObject instanceof ModelElement) {
				removeReferences(ancestorEObject, ancestorEObject);
				ancestorEObject.eAdapters().clear();
			} else {
				removeReferences(ancestorEObject, null);
			}
		} else {

			for (final TreeIterator<EObject> allContents = EcoreUtil.getAllContents(ancestorEObject,
					true); allContents.hasNext();) {

				final EObject eObject = allContents.next();

			}

			for (final TreeIterator<EObject> allContents = EcoreUtil.getAllContents(ancestorEObject,
					true); allContents.hasNext();) {

				final EObject eObject = allContents.next();

				if (eObject instanceof ModelElement) {
					removeReferences(eObject, ancestorEObject);
				} else {
					removeReferences(eObject, null);
				}
			}

			for (final TreeIterator<EObject> allContents = EcoreUtil.getAllContents(ancestorEObject,
					true); allContents.hasNext();) {

				final EObject eObject = allContents.next();

				if (eObject instanceof ModelElement) {
					eObject.eAdapters().clear();
				}
			}
		}

		EcoreUtil.remove(ancestorEObject);
	}

	/**
	 * @see ElementOperations#destroy(Element)
	 */
	private void removeReferences(EObject eObject, EObject ancestorEObject) {
		for (final EStructuralFeature.Setting inverseReference : new ArrayList<EStructuralFeature.Setting>(
				getInverseReferences(eObject))) {

			if (inverseReference.getEStructuralFeature().isChangeable() && (ancestorEObject == null
					|| !EcoreUtil.isAncestor(ancestorEObject, inverseReference.getEObject()))) {
				EcoreUtil.remove(inverseReference, eObject);
			}
		}

		for (final EReference eReference : eObject.eClass().getEAllReferences()) {
			if (eReference.isChangeable() && !eReference.isContainer() && !eReference.isContainment()
					&& !eReference.isDerived() && eObject.eIsSet(eReference)) {

				if (eReference.isMany()) {
					final List<?> values = (List<?>)eObject.eGet(eReference);

					for (int i = 0; i < values.size(); i++) {
						final Object value = values.get(i);

						if (ancestorEObject == null
								|| !EcoreUtil.isAncestor(ancestorEObject, (EObject)value)) {

							values.remove(i);
						}
					}
				} else {

					if (ancestorEObject == null
							|| !EcoreUtil.isAncestor(ancestorEObject, (EObject)eObject.eGet(eReference))) {
						eObject.eUnset(eReference);
					}
				}
			}
		}
	}

	/**
	 * @see ElementOperations#destroy(Element)
	 */
	private Collection<EStructuralFeature.Setting> getInverseReferences(EObject eObject) {
		final ECrossReferenceAdapter crossReferenceAdapter = ECrossReferenceAdapter
				.getCrossReferenceAdapter(eObject);
		return crossReferenceAdapter == null ? Collections.<EStructuralFeature.Setting> emptyList()
				: crossReferenceAdapter.getInverseReferences(eObject);
	}

}
