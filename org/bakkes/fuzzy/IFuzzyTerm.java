package org.bakkes.fuzzy;

public interface IFuzzyTerm extends Comparable<IFuzzyTerm> {
	public float getValue();
	public void clearValue();
	public void ORwithValue(float value);
}

