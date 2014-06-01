package org.bakkes.fuzzy.operators;

import java.util.ArrayList;
import java.util.Collection;

import org.bakkes.fuzzy.AFuzzyTerm;

public abstract class FuzzyOperator extends AFuzzyTerm {
	protected Collection<AFuzzyTerm> terms;
	
	public FuzzyOperator() {
		terms = new ArrayList<AFuzzyTerm>();
	}
	
	public void operate(AFuzzyTerm... op) {
		for(AFuzzyTerm term : op) {
			terms.add(term);
		}
	}
	
	@Override
	public void clearValue() {
		// TODO Auto-generated method stub
		for(AFuzzyTerm term : terms) {
			term.clearValue();
		}
	}

	@Override
	public void ORwithValue(float value) {
		// TODO Auto-generated method stub
		for(AFuzzyTerm term : terms) {
			term.ORwithValue(value);
		}
	}
}
