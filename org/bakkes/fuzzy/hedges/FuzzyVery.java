package org.bakkes.fuzzy.hedges;

import org.bakkes.fuzzy.IFuzzyTerm;
import org.bakkes.fuzzy.sets.IFuzzySet;

public class FuzzyVery implements IFuzzyTerm {

	private IFuzzySet set;
	
	public FuzzyVery(IFuzzySet fuzzySet) {
		this.set = fuzzySet;
	}
	
	@Override
	public float getValue() {
		return set.getValue() * set.getValue();
	}

	@Override
	public void clearValue() {
		set.clearValue();
	}

	@Override
	public void ORwithValue(float value) {
		set.ORwithValue(value * value);
	}
	
}
