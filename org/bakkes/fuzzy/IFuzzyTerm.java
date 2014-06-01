package org.bakkes.fuzzy;

public interface IFuzzyTerm{
	/**
	 * @return the degree of membership
	 */
	public float getValue();
	public void clearValue();
	public void ORwithValue(float value);
}

