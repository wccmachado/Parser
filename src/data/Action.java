package data;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Action {
	public String nameAction;
	public List  parameters = new ArrayList();
	public List<PrecondictionAction> lstPreCondictions = new ArrayList<PrecondictionAction>();
	public List<Effect> lstEffect = new ArrayList<Effect>();
	
	//public Map<String, List<String>> effects = new Hashtable<>();
	
	
	public List<VarTypes> getParameters() {
		return parameters;
	}
	public void setParameters(List<VarTypes> parameters) {
		this.parameters = parameters;
	}
	
	
	

}
