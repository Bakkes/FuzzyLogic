package org.bakkes.fuzzy.sets;

import org.bakkes.fuzzy.IFuzzyTerm;

/**
 * always a triangle
 * the max height of the triangle is always one
 * @author jappie
 *
 */
public interface IFuzzySet extends IFuzzyTerm{
	public float calculateValue(float val);
	public void setValue(float val);
	public float getPeak();
	public float getMin();
	public float getMax();
	public float getRepresentiveValue();
}
