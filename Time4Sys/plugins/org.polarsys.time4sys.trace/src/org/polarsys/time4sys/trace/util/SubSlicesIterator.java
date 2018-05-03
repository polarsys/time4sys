/*******************************************************************************
 * Copyright (c) 2017, 2018 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.trace.util;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.polarsys.time4sys.trace.Slice;
import org.polarsys.time4sys.trace.SliceKind;

/**
 * Iterates over sub-slices with a certain kind
 * @author Utilisateur
 *
 */
public class SubSlicesIterator implements Iterator<Slice>, Iterable<Slice> {
	
	protected Queue<Slice> toExplore = new LinkedBlockingQueue<>();
	protected Queue<Slice> nextSlices = new LinkedBlockingQueue<>();
	protected Slice nextSlice;
	protected SliceKind kindFilter;

	public SubSlicesIterator(final Slice root, final SliceKind kind) {
		if (root != null) {
			toExplore.add(root);
		}
		if (kind == null) {
			throw new IllegalArgumentException("kind filter must not be null");
		}
		kindFilter = kind;
	}
	
	public SubSlicesIterator(final Slice root, final String kindLabel) {
		this(root, SliceKind.OTHER);
	}

	@Override
	public boolean hasNext() {
		if (toExplore.isEmpty() && nextSlices.isEmpty()) {
			return false;
		}
		while(nextSlices.isEmpty() && !toExplore.isEmpty()) {
			final Slice current = toExplore.poll();
			for(Slice child: current.getOwnedSubSlices()) {
				if (kindFilter == child.getKind()) {
					nextSlices.add(child);
				} else {
					toExplore.add(child);
				}
			}
			for(Slice child: current.getSubSlices()) {
				if (kindFilter == child.getKind()) {
					nextSlices.add(child);
				} else {
					toExplore.add(child);
				}
			}
		}
		if (!nextSlices.isEmpty()) {
			nextSlice = nextSlices.poll();
		}
		return (nextSlice != null);
	}

	@Override
	public Slice next() {
		return nextSlice;
	}

	@Override
	public Iterator<Slice> iterator() {
		return this;
	}

}
