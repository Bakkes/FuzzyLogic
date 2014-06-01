package org.bakkes.fuzzy.operators;

import java.util.ArrayList;
import java.util.Collection;

import org.bakkes.fuzzy.IFuzzyTerm;

public abstract class FuzzyOperator implements IFuzzyTerm {
	protected Collection<IFuzzyTerm> terms;
	
	public FuzzyOperator() {
		terms = new ArrayList<IFuzzyTerm>();
	}
	
	public void operate(IFuzzyTerm... op) {
		for(IFuzzyTerm term : op) {
			terms.add(term);
		}
	}
	
	@Override
	public void clearValue() {
		for(IFuzzyTerm term : terms) {
			term.clearValue();
		}
	}

	@Override
	public void ORwithValue(float value) {
		for(IFuzzyTerm term : terms) {
			term.ORwithValue(value);
		}
	}
}
