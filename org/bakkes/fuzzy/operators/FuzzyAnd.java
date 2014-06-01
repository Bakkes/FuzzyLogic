package org.bakkes.fuzzy.operators;

import org.bakkes.fuzzy.IFuzzyTerm;

public class FuzzyAnd extends FuzzyOperator {

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
