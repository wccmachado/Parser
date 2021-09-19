package data;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Effect {
	public List objects =  new ArrayList(); // store the name of predicates that make up an action
	public Map effect =   new Hashtable(); // Map the name of effect to objects( i.e., can_traverse --> <?x ?y ?z >);
	public Map value =  new Hashtable<>(); // value (true ou false) associated with the effect.  
	

}
