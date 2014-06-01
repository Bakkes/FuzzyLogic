package org.bakkes.fuzzy;

/**
 * the range of this set is determined by the point of the other sets in fuzzy var
 * @author jappie
 *
 */
public class LinearSet extends AFuzzySet {

	private float value;
	private float point;
	public LinearSet(float pnt){
		value = 0;
		point = pnt;
	}

	@Override
	public float getValue() {
		return value;
	}

	@Override
	public float getPoint() {
		return point;
	}

	@Override
	public void setValue(float x) {
		value = x;
	}

	@Override
	public void clearValue() {
		setValue(0);
	}

	@Override
	public void ORwithValue(float value) {
		setValue(getValue()+value);
	}

}
