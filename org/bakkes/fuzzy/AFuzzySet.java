package org.bakkes.fuzzy;

/**
 * always a triangle
 * the max height of the triangle is always one
 * @author jappie
 *
 */
public abstract class AFuzzySet extends AFuzzyTerm implements IFuzzyTerm{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object to){
		if(! (to instanceof AFuzzySet)){
			return false;
		}
		AFuzzySet target = (AFuzzySet) to;
		if(!target.getName().equals(getName())){
			return false;
		}
		if(!(target.getValue() == getValue())){
			return false;
		}
		return true;
	}
}
