package org.bakkes.fuzzy.operators;

import org.bakkes.fuzzy.IFuzzyTerm;

public class FuzzyOr extends FuzzyOperator {

	public FuzzyOr(IFuzzyTerm... terms) {
		this.operate(terms);
	}
	
	@Override
	public float getValue() {
		float largest = Float.MIN_VALUE;
		for(IFuzzyTerm term : terms) {
			if(term.getValue() > largest) {
				largest = term.getValue();
			}
		}
		return largest;
	}

}
