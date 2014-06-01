package org.bakkes.fuzzy.sets;

public abstract class FuzzySet extends AFuzzySet {
	private float value;
	private float point;
	
	public FuzzySet(float point) {
		this.point = point;
		this.value = 0.0f;
	}
	
	//value = dom, representative = point
	// determines the range of the set (based on the neighbours ranges)
	@Override
	public float getPoint() {
		return point;
	}
	
	// sets the dom
	@Override
	public void setValue(float x) {
		assert (x <= 1 && x >= 0) : "value needs to be between 0 and 1 (" + x + ")";
		this.value = x;
	}
	
	@Override
	public float getValue() {
		return value;
	}
	
	@Override
	public void clearValue() {
		value = 0.0f;
	}
	
	public void ORwithValue(float value) {
		if(value > getValue()) {
			setValue(value);
		}
	}
}
