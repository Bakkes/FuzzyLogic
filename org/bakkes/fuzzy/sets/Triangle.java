package org.bakkes.fuzzy.sets;

import org.bakkes.fuzzy.FloatHelper;

//TODO: Check if triangle is equal to shoulder?
public class Triangle extends FuzzySet {

	private float peakPoint;
	private float leftOffset;
	private float rightOffset;
	
	public Triangle(float peak, float leftOffset, float rightOffset) {
		super(peak);
		this.peakPoint = peak;
		this.leftOffset = leftOffset;
		this.rightOffset = rightOffset;
	}

	@Override
	public float calculateValue(float val) {
		if((FloatHelper.areEqual(leftOffset, 0.0f) &&
				FloatHelper.areEqual(peakPoint, val)) ||
				(FloatHelper.areEqual(rightOffset, 0.0f) &&
				FloatHelper.areEqual(peakPoint, val))) {
			return 1.0f;
		} else if(val <= peakPoint && val >= (peakPoint - leftOffset)) {
			float grad = 1.0f / leftOffset;
			return grad * (val - (peakPoint - leftOffset));
		} else if(val > peakPoint && val < (peakPoint + rightOffset)) {
			float grad = 1.0f / -rightOffset;
			return grad * (val - peakPoint) + 1.0f;
		} else {
			return 0.0f;
		}
		
	}

}
