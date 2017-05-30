/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
package org.polarsys.time4sys.marte.nfp.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.polarsys.time4sys.marte.nfp.Dimension;
import org.polarsys.time4sys.marte.nfp.ValueWithUnit;

/**
 * @author loic
 *
 */
public abstract class AbstractRealWithUnitValueImpl<U extends Enumerator, T extends ValueWithUnit<U> > extends MinimalEObjectImpl.Container implements ValueWithUnit<U> {
	
	protected final Dimension<U> d;

	public AbstractRealWithUnitValueImpl(final Dimension<U> dimension) {
		super();
		d = dimension;
	}
	
	public abstract U getUnit();
	
	public abstract double getValue();
	
	protected abstract T create(double e, U targetUnit);
	
	public T add(final T v) {
		final U targetUnit = d.findClosestUnitTo(this.getUnit(), v.getUnit());
		final T v1 = this.convertToUnit(targetUnit);
		final T v2 = convertToUnit(v, targetUnit);
		return create(v1.getValue() + v2.getValue(), targetUnit);
	}

	public T convertToUnit(U target) {
		return convertToUnit((T)this, target);
	}
	
	private T convertToUnit(T v, U target) {
		if (v.getUnit() == target) {
			return v;
		}
		return create(v.getValue() * d.getConversionFactor(v.getUnit(), target), target);
	}

	public T simplify() {
		T result = (T)this;
		// Try to upgrade unit
		for (U u : d.getValues().subList(getUnit().getValue(), d.getValues().size())) {
			T r = this.convertToUnit(u);
			if (r.getValue() <= 1.0) {
				break;
			}
			result = r;
		}
		if (result.getValue() >=1.0 || result.getUnit() == d.getLowestUnit()) {
			return result;
		}
		// Try to downgrade unit to make it integer round
		final List<U> du = new ArrayList<U>(d.getValues().subList(0, getUnit().getValue()));
		java.util.Collections.reverse(du);
		for (U u : du) {
			T r = this.convertToUnit(u);
			if (isInteger(r.getValue())) {
				result = r;
				break;
			}
		}
		return result;
	}

	public T sub(T v) {
		final U targetUnit = d.findClosestUnitTo(this.getUnit(), v.getUnit());
		final T v1 = this.convertToUnit(targetUnit);
		final T v2 = convertToUnit(v, targetUnit);
		return create(v1.getValue() - v2.getValue(), targetUnit);
	}

	public int compareTo(T anotherT) {
		final U targetUnit = d.findClosestUnitTo(this.getUnit(), anotherT.getUnit());
		final T v1 = this.convertToUnit(targetUnit);
		final T v2 = convertToUnit(anotherT, targetUnit);
		return Double.compare(v1.getValue(), v2.getValue());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d == null) ? 0 : d.hashCode());
		long temp;
		temp = Double.doubleToLongBits(getValue());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @generated NOT
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AbstractRealWithUnitValueImpl)) {
			return false;
		}
		final AbstractRealWithUnitValueImpl<U, T> other;
		try {
			other = (AbstractRealWithUnitValueImpl<U, T>) obj;
		} catch(ClassCastException e) {
			return false;
		}
		if (getUnit() == other.getUnit()) {
			return (Double.doubleToLongBits(getValue()) == Double.doubleToLongBits(other.getValue()));
		} else {
			if (isZero() && other.isZero()) {
				return true;
			} else {
				final U target = d.findClosestUnitTo(getUnit(), other.getUnit());
				return this.convertToUnit(target).equals(other.convertToUnit(target));
			}
		}
	}

	public boolean isZero() {
		return Double.doubleToLongBits(getValue()) == 0;
	}

	public boolean notZero() {
		return !isZero();
	}

	private boolean isInteger(final double v) {
		return (v == Math.floor(v)) && !Double.isInfinite(v);
	}
	
	public T max(final T other) {
		if (other == null) {
			return (T)this;
		}
		if (getUnit() == other.getUnit()) {
			if (getValue() >= other.getValue()) {
				return (T)this;
			} else {
				return other;
			}
		} else {
			final U target = d.findClosestUnitTo(getUnit(), other.getUnit());
			if (this.convertToUnit(target).getValue() >= convertToUnit(other, target).getValue()) {
				return (T)this;
			} else {
				return other;
			}
		}
	}

	public T min(final T other) {
		if (other == null) {
			return (T)this;
		}
		if (getUnit() == other.getUnit()) {
			if (getValue() <= other.getValue()) {
				return (T)this;
			} else {
				return other;
			}
		} else {
			final U target = d.findClosestUnitTo(getUnit(), other.getUnit());
			if (this.convertToUnit(target).getValue() <= convertToUnit(other, target).getValue()) {
				return (T)this;
			} else {
				return other;
			}
		}
	}

	public T multiply(long v) {
		return create(getValue() * v, getUnit());
	}

	public T lcm(T v) {
		final U targetUnit = d.findClosestUnitTo(this.getUnit(), v.getUnit());
		final T v1 = this.convertToUnit(targetUnit);
		final T v2 = convertToUnit(v, targetUnit);
		return create(lcm(v1.getValue(), v2.getValue(), 0.0000001), targetUnit);
	}

	private double lcm(final double m, final double n, final double epsilon) {
		if (Math.abs(m) < epsilon || Math.abs(n) < epsilon) {
			return 0.0;
		}
		return (m * n) / gcd(m, n, epsilon);
	}

	private double gcd(double m, double n, final double epsilon) {
		while (Math.abs(n) > epsilon) {
			double q = m;
			m = n;
			n = q % n;
		}
		return m;
	}

	public double div(final T v) {
		final U targetUnit = d.findClosestUnitTo(this.getUnit(), v.getUnit());
		final T v1 = this.convertToUnit(targetUnit);
		final T v2 = convertToUnit(v, targetUnit);
		return v1.getValue() / v2.getValue();
	}

	public long divide(final T v) {
		return (long)div(v);
	}
}
