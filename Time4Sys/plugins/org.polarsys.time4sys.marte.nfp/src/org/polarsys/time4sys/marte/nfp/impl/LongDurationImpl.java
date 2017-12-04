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
/**
 * 
 */
package org.polarsys.time4sys.marte.nfp.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;

/**
 * @author loic
 *
 */
public class LongDurationImpl extends DurationImpl {
	
	public static final DurationImpl ZERO = new LongDurationImpl(0L, TimeUnitKind.PS);
	
	public static long asLongPicoSecond(final TimeUnitKind unit) {
		if (unit == null) {
			throw new IllegalArgumentException("Time unit must not be null.");
		}
		switch (unit) {
		case PS:
			return 1L;
		case NS:
			return 1000L;
		case US:
			return 1000000L;
		case MS:
			return 1000000000L;
		case S:
			return 1000000000000L;
		case MN:
			return 60000000000000L;
		case H:
			return 3600000000000000L;
		case D:
			return 86400000000000000L;
		default:
			throw new IllegalArgumentException("Unexpected TimeUnitKind: " + unit.getLiteral());
		}
	}

	protected long picoseconds;

	public LongDurationImpl() {
		this(0L, TimeUnitKind.PS);
	}

	public LongDurationImpl(final long durationInPicoseconds, final TimeUnitKind unit) {
		super(((double)durationInPicoseconds) / ((double)asLongPicoSecond(unit)), unit);
		this.picoseconds  = durationInPicoseconds;
		
	}
	
	public LongDurationImpl(final double v, final TimeUnitKind unit) {
		super(v, unit);
		picoseconds = (long)(v * asLongPicoSecond(unit));
	}
	
	private long lcm(final long m, final long n) {
		if (m  == 0 && n == 0) {
			return 0;
		}
		final BigInteger mi = BigInteger.valueOf(m);
		final BigInteger ni = BigInteger.valueOf(n);
		final BigInteger gcd = mi.gcd(ni);
		final BigInteger r = mi.multiply(ni).divide(gcd);
		return r.longValue();
	}
	
	@Override
	public void setValue(double newValue) {
		picoseconds = (long)(newValue * asLongPicoSecond(unit));
		super.setValue(newValue);
	}
	
	@Override
	public Duration add(final Duration v) {
		if (v instanceof LongDurationImpl) {
			final TimeUnitKind targetUnit = d.findClosestUnitTo(this.getUnit(), v.getUnit());
			return new LongDurationImpl(picoseconds + ((LongDurationImpl)v).picoseconds, targetUnit);			
		} else {
			return super.add(v);
		}
	}
	
	@Override
	public Duration multiply(long v) {
		return new LongDurationImpl(picoseconds * v, unit);			
	}

	@Override
	public double div(final Duration v) {
		if (v instanceof LongDurationImpl) {
			return new BigDecimal(picoseconds).divide(new BigDecimal(((LongDurationImpl)v).picoseconds)).doubleValue();
		} else {
			return super.div(v);
		}
	}
	
	@Override
	public double div(final Duration v, final MathContext mc) {
		if (v instanceof LongDurationImpl) {
			return new BigDecimal(picoseconds).divide(new BigDecimal(((LongDurationImpl)v).picoseconds), mc).doubleValue();
		} else {
			return super.div(v);
		}
	}
	
	@Override
	public long divide(final Duration v) {
		if (v instanceof LongDurationImpl) {
			return picoseconds / ((LongDurationImpl)v).picoseconds;
		} else {
			return super.divide(v);
		}
	}
	
	@Override
	public Duration lcm(final Duration v) {
		if (v instanceof LongDurationImpl) {
			final TimeUnitKind targetUnit = d.findClosestUnitTo(this.getUnit(), v.getUnit());
			return new LongDurationImpl(lcm(picoseconds, ((LongDurationImpl)v).picoseconds), targetUnit);			
		} else {
			return super.lcm(v);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Duration convertToUnit(TimeUnitKind target) {
		if (unit == target) {
			return this;
		}
		return new LongDurationImpl(picoseconds, target);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Duration sub(Duration v) {
		if (v instanceof LongDurationImpl) {
			final TimeUnitKind targetUnit = d.findClosestUnitTo(this.getUnit(), v.getUnit());
			return new LongDurationImpl(picoseconds - ((LongDurationImpl)v).picoseconds, targetUnit);			
		} else {
			return super.sub(v);
		}
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
		if (!(obj instanceof Duration)) {
			return false;
		}
		if (obj instanceof LongDurationImpl) {
			return picoseconds == ((LongDurationImpl)obj).picoseconds;
		} else {
			return super.equals(obj);
		}
	}
	
	public long getValueInPicoSeconds() {
		return picoseconds;
	}
	
	public Duration simplify() {
		if (picoseconds == 0) {
			return this;
		}
		TimeUnitKind best = TimeUnitKind.PS;
		for (TimeUnitKind u: TimeUnitKind.values()) {
			if (picoseconds % asLongPicoSecond(u) != 0) {
				break;
			} else {
				best = u;
			}
		}
		return convertToUnit(best);
	}
	
	public int compareTo(final Duration anotherDuration) {
		if (anotherDuration instanceof LongDurationImpl) {
			return Long.compare(picoseconds, ((LongDurationImpl) anotherDuration).picoseconds);
		} else {
			return super.compareTo(anotherDuration);
		}
	}
	
	@Override
	public boolean isZero() {
		return picoseconds == 0;
	}
	
	@Override
	public Duration max(final Duration other) {
		if (other == null) {
			return this;
		}
		if (other instanceof LongDurationImpl) {
			final LongDurationImpl o = (LongDurationImpl)other;
			if (picoseconds >= o.picoseconds) {
				return this;
			} else {
				return other;
			}
		} else {
			return super.max(other);
		}
	}

	@Override
	public Duration min(final Duration other) {
		if (other == null) {
			return this;
		}
		if (other instanceof LongDurationImpl) {
			final LongDurationImpl o = (LongDurationImpl)other;
			if (picoseconds <= o.picoseconds) {
				return this;
			} else {
				return other;
			}
		} else {
			return super.min(other);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		if (isSimpleDuration()) {
			final Duration s = simplify();
			if (s == this) {
				final StringBuilder sb = new StringBuilder();
				sb.append(Long.toString(((LongDurationImpl)s).picoseconds / asLongPicoSecond(unit)));
				sb.append(s.getUnit().getName());
				return sb.toString();
			} else {
				return s.toString();
			}
		}
		
		return super.toString();
	}
}
