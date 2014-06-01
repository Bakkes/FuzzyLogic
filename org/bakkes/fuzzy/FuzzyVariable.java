package org.bakkes.fuzzy;

import java.util.HashMap;
import java.util.Map;

import org.bakkes.fuzzy.sets.IFuzzySet;

public class FuzzyVariable {

	Map<String, IFuzzySet> memberSets;
	float min;
	float max;
	public FuzzyVariable(){
		memberSets = new HashMap<>();
		min =0;
		max =0;
	}
	void addSet(String name, IFuzzySet set){
		memberSets.put(name, set);
		if(min > set.getMin()){
			min = set.getMin();
		}
		if(max < set.getMax()){
			max = set.getMax();
		}

	}
	
	void fuzzify(float val){
		assert val > min && val < max;
		for(IFuzzySet set : memberSets.values()){
			set.setValue(set.calculateValue(val));
		}
	}
	
	float deFuzzifyMaxAv(){
		float bottom = 0;
		float top = 0;
		for(IFuzzySet set: memberSets.values()){
			
			bottom += set.getValue();
			top += set.getPeak() * set.getValue();
		}
		if(bottom == 0){
			return 0;
		}
		return top/bottom;
	}
	float deFuzzifyCentroid(int samples){
		
		float stepSize = (max - min) / samples;
		float totalArea = 0;
		float sumOfMoments = 0;
		
		for(int sample = 1; sample < samples; ++sample){
			
			for(IFuzzySet set: memberSets.values()){
				float position  = min + sample*stepSize;
				float contribution = Math.min(set.calculateValue(position), set.getValue());
				totalArea += contribution;
				sumOfMoments += position * contribution;
			}
		}
		if(totalArea == 0){
			return 0;
		}
		return sumOfMoments/totalArea;
	}
	

}
