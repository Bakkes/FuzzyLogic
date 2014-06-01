package org.bakkes.fuzzy.sets;

import org.bakkes.fuzzy.FloatHelper;

//TODO: Check if triangle is equal to shoulder?
public class Triangle extends AFuzzySet {

	public Triangle(float peak, float minOffset, float maxOffset) {
		super(peak, minOffset, maxOffset);
	}

	@Override
	public float calculateValue(float val) {
		if((FloatHelper.areEqual(minOffset, 0.0f) &&
				FloatHelper.areEqual(peakPoint, val)) ||
				(FloatHelper.areEqual(maxOffset, 0.0f) &&
				FloatHelper.areEqual(peakPoint, val))) {
			return 1.0f;
		} else if(val <= peakPoint && val >= (peakPoint - minOffset)) {
			float grad = 1.0f / minOffset;
			return grad * (val - (peakPoint - minOffset));
		} else if(val > peakPoint && val < (peakPoint + maxOffset)) {
			float grad = 1.0f / -maxOffset;
			return grad * (val - peakPoint) + 1.0f;
		} else {
			return 0.0f;
		}
		
	}

}
