package org.bakkes.fuzzy;

public class FuzzyRule implements IFuzzyRule {
	
	private IFuzzyTerm antecedent;
	private IFuzzyTerm consequence;
	
	public FuzzyRule(IFuzzyTerm antecedent, IFuzzyTerm consequence) {
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
