package org.bakkes.fuzzy;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;


public class FuzzyVariable {

	Collection<FuzzySet> sets;
	FuzzyVariable(){
		// saves memory and no index acces is required
		sets = new LinkedList<>();
	}
	
	void addSet(String name, float value){
		LinearSet set = new LinearSet(value);
		set.setName(name);
		sets.add(set);
	}

}
