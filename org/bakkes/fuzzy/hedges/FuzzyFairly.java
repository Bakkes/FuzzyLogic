package org.bakkes.fuzzy.hedges;

import org.bakkes.fuzzy.AFuzzySet;
import org.bakkes.fuzzy.AFuzzyTerm;

public class FuzzyFairly extends AFuzzyTerm {

	private AFuzzySet set;
	
	public FuzzyFairly(AFuzzySet fuzzySet) {
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
