package data;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InformationFile {
	public String domainName;
	//Action action = new Action();
	public Set requirements = new HashSet();   
    public Set types = new HashSet();                      
    public Set predicates = new HashSet();  
	public Map typeMap = new Hashtable();                   
	public Map predicatesMap = new Hashtable();
	
	public Map defineProblemMap = new Hashtable();
	public Map objectMap = new Hashtable();
	
	public Map initMap = new Hashtable();
	public Set action = new HashSet();
	
	public Map goalMap = new Hashtable();
	public Map<Object, List<Object>> preferenceMap = new Hashtable<Object, List<Object>>();
	
	public Map<String, List<Action>> actions = new Hashtable<String, List<Action>>();

	
	
	
	
	public Set getRequirements() {
		return requirements;
	}




	public void setRequirements(Set requirements) {
		this.requirements = requirements;
	}




	public Map getTypeMap() {
		return typeMap;
	}




	public void setTypeMap(Map typeMap) {
		this.typeMap = typeMap;
	}




	public Set getTypes() {
		return types;
	}




	public void setTypes(Set types) {
		this.types = types;
	}


















  


	
}
