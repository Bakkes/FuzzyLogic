package org.bakkes.fuzzy.sets;

import org.bakkes.fuzzy.FloatHelper;

public class RightShoulder extends AFuzzySet {
	private float peakPoint;
	private float leftOffset;
	private float rightOffset;

	
	public RightShoulder(float peak, float leftOffset, float rightOffset) {
		super(peak,leftOffset,rightOffset);
	}


	@Override
	public float calculateValue(float val) {
		if((FloatHelper.areEqual(leftOffset, 0.0f) &&
				FloatHelper.areEqual(peakPoint, val)) ||
				(FloatHelper.areEqual(rightOffset, 0.0f) &&
				FloatHelper.areEqual(peakPoint, val))) {
			return 1.0f;
		} else if(val <= peakPoint && val > (peakPoint - leftOffset)) {
			float grad = 1.0f / leftOffset;
			return grad * (val - (peakPoint - leftOffset));
		} else if(val > peakPoint && val <= (peakPoint  + rightOffset)) {
			return 1.0f;
		} else {
			return 0.0f;
		}
		
	}

}
