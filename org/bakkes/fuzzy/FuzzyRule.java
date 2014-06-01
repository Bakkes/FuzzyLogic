package org.bakkes.fuzzy;

public class FuzzyRule {
	
	private AFuzzyTerm antecedent;
	private AFuzzyTerm consequence;
	
	public FuzzyRule(AFuzzyTerm antecedent, AFuzzyTerm consequence) {
		this.antecedent = antecedent;
		this.consequence = consequence;
	}
}
