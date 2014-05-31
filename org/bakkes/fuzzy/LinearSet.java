package org.bakkes.fuzzy;

public class LinearSet extends FuzzySet {

	private float value;
	public LinearSet(float val){
		value = val;
	}
	@Override
	public float getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
