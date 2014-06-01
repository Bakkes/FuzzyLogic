package org.bakkes.fuzzy.sets;

public abstract class AFuzzySet implements IFuzzySet{

	protected float peakPoint;
	protected float leftOffset;
	protected float rightOffset;

	protected float value;
	
	public AFuzzySet(float peak, float leftOffset, float rightOffset) {
		clearValue();
		this.peakPoint = peak;
		this.leftOffset = leftOffset;
		this.rightOffset = rightOffset;
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
}
