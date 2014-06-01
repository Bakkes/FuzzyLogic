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
		
	}

	@Override
	public void resetConfidence() {
		// TODO Auto-generated method stub
		
	}
}
