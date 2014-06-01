package org.bakkes.fuzzy;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
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
	
	public void fuzzify(float x){
		List<AFuzzySet> list = new LinkedList<>(sets);
		ListIterator<AFuzzySet> it = list.listIterator();
		while(it.hasNext()){
			AFuzzySet set = it.next();
			if(set.getValue() > x){
				
			}
		}
	}
	
	public float deFuzzifyCentroid(int numSamples) {

		return 0f;
	}
	
	public float deFuzzifyMaxAv() {
		return 0f;
	}

}
