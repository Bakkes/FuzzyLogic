package org.bakkes.fuzzy.operators;

import org.bakkes.fuzzy.IFuzzyTerm;

public class FuzzyAnd extends FuzzyOperator {

	public FuzzyAnd(IFuzzyTerm... terms) {
		this.operate(terms);
	}
	
	@Override
	public float getValue() {
		float smallest = Float.MAX_VALUE;
		for(IFuzzyTerm term : terms) {
			if(term.getValue() < smallest)
				smallest = term.getValue();
		}
		return smallest;
	}

}
