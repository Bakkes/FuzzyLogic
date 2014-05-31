package org.bakkes.fuzzy;

/**
 * always a triangle
 * the max height of the triangle is always one
 * @author jappie
 *
 */
public class FuzzySet implements IFuzzyTerm{

	private float from = 0;
	private float to = 100;
	/**
	 * x is the position in the chart where the Y value is retrieved from
	 */
	private float x = 0;

	@Override
	public float getValue() {
		float halfDimension = (getTo() - getFrom()) /2;
		if(getX() < halfDimension){
			return getX() / halfDimension;
		}
		return (halfDimension - getX()) / halfDimension;
	}
	
	public float getFrom() {
		return from;
	}

	public void setFrom(float from) {
		this.from = from;
	}

	public float getTo() {
		return to;
	}

	public void setTo(float to) {
		this.to = to;
	}

	float getX() {
		return x;
	}

	void setX(float x) {
		this.x = x;
	}

}
