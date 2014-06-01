package org.bakkes.fuzzy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;


public class FuzzyVariable {

	Collection<AFuzzySet> sets;
	public FuzzyVariable(){
		// saves memory and no index acces is required
		sets = new TreeSet<>();
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

}
