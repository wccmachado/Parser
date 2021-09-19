package data;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



public class Predicate{
	protected String name;
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Predicate other = (Predicate) obj;
		return Objects.equals(name, other.name);
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<Object> getParameters() {
		return parameters;
	}



	public void setParameters(List<Object> parameters) {
		this.parameters = parameters;
	}



	protected List<Object> parameters = new ArrayList<Object>();
	
	
	
	public Predicate(String name, List<Object> parameters) {
		super();
		this.name = name;
		this.parameters = parameters;
	}
	
	
	@Override
    public String toString(){
		String prepositions="";
		for (Object object : parameters) {
			if (prepositions.equals("")) {
				prepositions = (String)object;
			}else
				prepositions = prepositions+ " " + object;
		}
        return name + " " + prepositions;
    }
 
}
