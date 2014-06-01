package org.bakkes.fuzzy.sets;

import org.bakkes.fuzzy.FloatHelper;

public class LeftShoulder extends AFuzzySet {
	
	public LeftShoulder(float peak, float minOffset, float maxOffset) {
		super(peak,minOffset,maxOffset);
	}


	@Override
	public float calculateValue(float val) {
		if((FloatHelper.areEqual(minOffset, 0.0f) &&
				FloatHelper.areEqual(peakPoint, val)) ||
				(FloatHelper.areEqual(maxOffset, 0.0f) &&
				FloatHelper.areEqual(peakPoint, val))) {
			return 1.0f;
		} else if(val >= peakPoint && val < (peakPoint + maxOffset)) {
			float grad = 1.0f / -maxOffset;
			return grad * (val - peakPoint) + 1.0f;
		} else if(val < peakPoint && val >= (peakPoint - minOffset)) {
			return 1.0f;
		} else {
			return 0.0f;
		}
		
	}


}
