package org.bakkes.fuzzy.operators;

import org.bakkes.fuzzy.AFuzzyTerm;

public class FuzzyOr extends FuzzyOperator {

	@Override
	public float getValue() {
		float largest = Float.MIN_VALUE;
		for(AFuzzyTerm term : terms) {
			if(term.getValue() > largest) {
				largest = term.getValue();
			}
		}
		return largest;
	}

}
