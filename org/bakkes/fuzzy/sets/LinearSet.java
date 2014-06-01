package org.bakkes.fuzzy.sets;

/**
 * the range of this set is determined by the point of the other sets in fuzzy var
 * @author jappie
 *
 */
public class LinearSet extends AFuzzySet {

	public LinearSet(float peak, float leftOffset, float rightOffset) {
		super(peak,leftOffset,rightOffset);
	}

	@Override
	public float calculateValue(float val) {
		if(val >= (peakPoint - leftOffset) && val <= peakPoint + rightOffset) {
			return 1.0f;
		} else {
			return 0f;
		}
	}


}
