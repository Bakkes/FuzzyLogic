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
	

}
