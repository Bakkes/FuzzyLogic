package org.bakkes.fuzzy;

/**
 * always a triangle
 * the max height of the triangle is always one
 * @author jappie
 *
 */
public class FuzzySet implements IFuzzyTerm{

	float from = 0;
	float to = 100;
	/**
	 * x is the position in the chart where the Y value is retrieved from
	 */
	float x = 0;

	@Override
	public float getValue() {
		float halfDimension = (to - from) /2;
		if(x < halfDimension){
			return x / halfDimension;
		}
		return (halfDimension - x) / halfDimension;
	}
	
	void setX(float to){
		x = to;
	}

}
