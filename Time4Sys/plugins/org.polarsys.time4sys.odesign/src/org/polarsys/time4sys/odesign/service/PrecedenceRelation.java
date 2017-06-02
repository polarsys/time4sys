package org.polarsys.time4sys.odesign.service;

import java.util.Objects;

public class PrecedenceRelation<O, I> {
	    public final O output;
	    public final I input;

	    public PrecedenceRelation(O output, I input) {
	        this.output = output;
	        this.input = input;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (!(o instanceof PrecedenceRelation)) {
	            return false;
	        }
	        PrecedenceRelation<?, ?> p = (PrecedenceRelation<?, ?>) o;
	        return Objects.equals(p.output, output) && Objects.equals(p.input, input);
	    }

	    @Override
	    public int hashCode() {
	        return (output == null ? 0 : output.hashCode()) ^ (input == null ? 0 : input.hashCode());
	    }

	    public static <A, B> PrecedenceRelation <A, B> create(A a, B b) {
	        return new PrecedenceRelation<A, B>(a, b);
	    }
}
