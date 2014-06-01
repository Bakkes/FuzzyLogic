package org.bakkes.fuzzy;

public interface IFuzzyTerm extends Comparable<IFuzzyTerm> {
	/**
	 * @return the degree of membership
	 */
	public float getValue();
}

