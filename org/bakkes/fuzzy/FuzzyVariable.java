package org.bakkes.fuzzy;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeSet;

import org.bakkes.fuzzy.sets.AFuzzySet;
import org.bakkes.fuzzy.sets.LinearSet;


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


		// we want to find the 2 sets that are just bigger or smaller then the x
		AFuzzySet bigger = null;
		AFuzzySet smaller = null;

		for(AFuzzySet set : sets){
			smaller = bigger;
			bigger = set;
			if(bigger.getValue() > x){
				// found it
				break;
			}
		}
		
		// these are the shoulder checks
		if(smaller == null){
			bigger.setValue(100);
			return;
		}
		if(bigger == null){
			smaller.setValue(100);
			return;
		}
	}
	
	public float deFuzzifyCentroid(int numSamples) {

		return 0f;
	}
	
	public float deFuzzifyMaxAv() {
		return 0f;
	}

}
