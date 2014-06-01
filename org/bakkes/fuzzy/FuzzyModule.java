package org.bakkes.fuzzy;

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
	
	public FuzzyVariable CreateFLV(String name) {
		//TODO: Implement
		return null;
	}
	
	public void AddRule(AFuzzyTerm condition, AFuzzyTerm consequence) {
		rules.add(new FuzzyRule(condition, consequence));
	}
	
	public void fuzzify(String flv, double value) {
		
	}
	
	public double deFuzzify(String key, DefuzzifyType method) {
		return 0;
	}
}
