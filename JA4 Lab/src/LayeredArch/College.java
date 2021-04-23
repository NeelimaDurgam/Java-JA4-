package LayeredArch;

public class College {
	String name;
	int id;
	
	public College(String name , int id) {
		this.id = id;
		this.name = name;
	}
	
	// takes only unique data
	// if the record exist it check and overrides it
	@Override
	public boolean equals(Object obj) {
		if(this  == obj)
			return true;
		if(obj == null || obj.getClass() != this.getClass())
			return false;
		
		College cg = (College)obj;
		
		return (cg.name.contentEquals(this.name) && cg.id == this.id);
	}
	
	// hash bucket doesnot allow duplicate data 
	//so to do it we need to override by using the hashcode fun
	@Override
	public int hashCode()
	{
		return this.id;
	}

}
