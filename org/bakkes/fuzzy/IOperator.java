package org.bakkes.fuzzy;

public interface IOperator extends IFuzzyTerm{
	float operate(IFuzzyTerm with);
}
