package org.bakkes.fuzzy;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FuzzyModule {
	public static final int CENTROID_SAMPLES = 15;
	
	private Map<String, FuzzyVariable> variables;
	private Collection<FuzzyRule> rules;
	
	public FuzzyModule() {
		variables = new HashMap<String, FuzzyVariable>();
		rules = new ArrayList<FuzzyRule>();
	}
	
	private void resetConfidences() {
		
	}
	
	public FuzzyVariable createFLV(String name) {
		variables.put(name, new FuzzyVariable());
		return variables.get(name);
	}
	
	public void addRule(AFuzzyTerm condition, AFuzzyTerm consequence) {
		rules.add(new FuzzyRule(condition, consequence));
	}
	
	public void fuzzify(String flv, float value) {
		assert !variables.containsKey(flv) : "FLV does not exist"; 
		variables.get(flv).fuzzify(value);
	}
	
	public float deFuzzify(String flv, DefuzzifyType method) {
		assert !variables.containsKey(flv) : "FLV does not exist"; 
		
		resetConfidences();
		for(FuzzyRule rule : rules) {
			rule.calculate();
		}
		
		switch(method) {
		case MAX_AV:
			break;
		case CENTROID:
			break;
		}
		return 0;
	}
}
