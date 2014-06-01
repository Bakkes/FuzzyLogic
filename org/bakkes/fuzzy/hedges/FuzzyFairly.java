package org.bakkes.fuzzy.hedges;

import org.bakkes.fuzzy.IFuzzyTerm;
import org.bakkes.fuzzy.sets.IFuzzySet;

public class FuzzyFairly implements IFuzzyTerm {

	private IFuzzySet set;
	
	public FuzzyFairly(IFuzzySet fuzzySet) {
		this.set = fuzzySet;
	}
	
	@Override
	public float getValue() {
		return (float) Math.sqrt(set.getValue());
	}

	@Override
	public void clearValue() {
		set.clearValue();
	}

	@Override
	public void ORwithValue(float value) {
		set.ORwithValue((float) Math.sqrt(set.getValue()));
	}
	
}
