package org.bakkes.fuzzy.operators;

import org.bakkes.fuzzy.AFuzzyTerm;

public class FuzzyAnd extends FuzzyOperator {

	@Override
	public float getValue() {
		float smallest = Float.MAX_VALUE;
		for(AFuzzyTerm term : terms) {
			if(term.getValue() < smallest)
				smallest = term.getValue();
		}
		return smallest;
	}

}
