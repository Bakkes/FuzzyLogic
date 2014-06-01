package org.bakkes.fuzzy.sets;

public abstract class AFuzzySet implements IFuzzySet{

	protected float peakPoint;
	protected float minOffset;
	protected float maxOffset;

	protected float value;
	private float repValue;
	
	public AFuzzySet(float repVal, float peak, float minOffset, float maxOffset) {
		clearValue();
		this.peakPoint = peak;
		this.minOffset = minOffset;
		this.maxOffset = maxOffset;
		repValue = repVal;
	}

	@Override
	public void clearValue() {
		value=0;
	}
	@Override
	public void setValue(float to){
		value=to;
	}
	@Override
	public float getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	@Override
	public void ORwithValue(float value) {
		if(getValue() < value){
			setValue(value);
		}
	}
	@Override
	public float getPeak() {
		return peakPoint;
	}


	@Override
	public float getMin() {
		// TODO Auto-generated method stub
		return minOffset;
	}


	@Override
	public float getMax() {
		// TODO Auto-generated method stub
		return maxOffset;
	}
	@Override
	public float getRepresentiveValue() {
		// TODO Auto-generated method stub
		return repValue;
	}
}
