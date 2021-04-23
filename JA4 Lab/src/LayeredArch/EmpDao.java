package LayeredArch;

import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	
	List<Employee> e = null;
	
	public List<Employee> addEmp(List<Employee> e){
		this.e = e;
		
		return e;
	}
	
	public List<Employee> lsitAll(){
		return e;
	}
	

}
