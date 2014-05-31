package org.bakkes.fuzzy;

public class AndOperator implements IOperator{

	float value = 0;
	@Override
	public float operate(IFuzzyTerm with) {
		// 4 and 5 is 9, so and in language is a plus
		value += with.getValue(); 
		return value;
	}

	@Override
	public float getValue() {
		return value;
	}

	
}
