package org.bakkes.fuzzy.hedges;

import org.bakkes.fuzzy.AFuzzyTerm;
import org.bakkes.fuzzy.sets.AFuzzySet;

public class FuzzyVery extends AFuzzyTerm {

	private AFuzzySet set;
	
	public FuzzyVery(AFuzzySet fuzzySet) {
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
