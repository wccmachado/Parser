
/*********************************************************************************************************
 * This class represent the relationship between variables and types. This relationship is present both in
 * predicates (i.e, in predicate at we have ?x - rover) and parameters (i.e, in parameters of the action 
 * navigate at we have ?y - waypoint) 
 *********************************************************************************************************/
package data;

import java.util.Objects;

public class VarTypes {
	protected String var;
	protected String type;
	
	
	public VarTypes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public VarTypes(String var, String type) {
		this.var = var;
		this.type = type;
	}
	
	
	
	
	
	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public String relationshipVarAndType() {
		
		return var +  " - "  + type;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VarTypes other = (VarTypes) obj;
		return Objects.equals(type, other.type);
	}
	

}
