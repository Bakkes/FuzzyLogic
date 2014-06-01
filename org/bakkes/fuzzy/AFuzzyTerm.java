package org.bakkes.fuzzy;

public abstract class AFuzzyTerm implements IFuzzyTerm{

	@Override
	public int compareTo(IFuzzyTerm term) {
		if(this.getValue() < term.getValue()){
			return -1;
		}else if(this.getValue() > term.getValue()){
			return 1;
		}
		return 0;
	}

}

