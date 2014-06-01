package org.bakkes.fuzzy;

public class FuzzyRule implements IFuzzyRule {
	
	private AFuzzyTerm antecedent;
	private AFuzzyTerm consequence;
	
	public FuzzyRule(AFuzzyTerm antecedent, AFuzzyTerm consequence) {
		this.antecedent = antecedent;
		this.consequence = consequence;
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		consequence.ORwithValue(antecedent.getValue());
	}

	@Override
	public void resetConfidenceOfConsequence() {
		consequence.clearValue();
	}
}
