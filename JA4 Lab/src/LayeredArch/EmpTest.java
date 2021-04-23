package LayeredArch;

import java.util.ArrayList;
import java.util.List;

public class EmpTest {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee();
		
		e1.setId(1);
		e1.setName("Neelima");
		e1.setCmp("TCS");
		
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("jnfjj");
		e2.setCmp("CTS");
		
		empList.add(e1);
		empList.add(e2);
		
		EmpDao edao = new EmpDao();
		edao.addEmp(empList);
		/*
		for(Employee emp : empList) {
			System.out.println("EmP ID : "+emp.getId()+"Emp Name : " +emp.getName()+"Emp Company : "+ emp.getCmp());
		}*/
		
		
		List<Employee> emp = edao.lsitAll();
		for(Employee e : emp) {
			System.out.println("EmP ID : "+e.getId()+" Emp Name : "+e.getName()+ " Emp Company : "+ e.getCmp());
		}
		}
}
