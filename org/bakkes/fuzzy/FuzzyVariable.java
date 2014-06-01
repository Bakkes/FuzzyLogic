package org.bakkes.fuzzy;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class FuzzyVariable {

	Collection<AFuzzySet> sets;
	public FuzzyVariable(){
		// saves memory and no index acces is required
		sets = new LinkedList<>();
	}
	
	public void addSet(String name, float value){

		LinearSet set = new LinearSet(value);
		set.setName(name);
		sets.add(set);
	}
	
	public Map<String, Float> fuzzify(float x){
		Map<String, Float> result = new HashMap<>();


		return result;
	}
	
	public float deFuzzifyCentroid(int numSamples) {
		return 0f;
	}
	
	public float deFuzzifyMaxAv() {
		return 0f;
	}

}
