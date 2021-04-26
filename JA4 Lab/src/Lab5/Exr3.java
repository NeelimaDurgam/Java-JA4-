package Lab5;

import java.util.Scanner;

class EmployeeException extends Exception{
	
	public EmployeeException(String str) {
		super(str);
	}
}

public class Exr3 {
	
	void checkSalary(int salary) throws EmployeeException {
		
		if(salary< 3000) {
			throw new EmployeeException("The salary of the employee is less than 3000");
		}
		else {
			System.out.println("The salary of the employee is :" + salary);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the salary of the employee");
		int salary = sc.nextInt();
		
		Exr3 obj= new Exr3();
		
		try {
			obj.checkSalary(salary);
		}
		catch(EmployeeException e){
			System.out.println(e);
			//System.out.println(e.getMessage());
		}
	}
	

}
