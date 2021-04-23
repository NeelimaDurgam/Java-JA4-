package LayeredArch;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSrt {
	public static void main(String[] args) {
		
		//creating array list
		ArrayList<Student> stdList = new ArrayList<Student>();
		
		//adding data using constructor
		Student std = new Student(122, "java", 25);
		
		stdList.add(std);
		// adding data using new operator
		stdList.add(new Student(121, "ram", 20));
		stdList.add(new Student(123, "spring", 30));
		stdList.add(new Student(124, "hello", 40));
		
		 
		Collections.sort(stdList);
		
	
		// printing the data
		for(Student stdl : stdList) {
			System.out.println("Std roll no : "+stdl.getRollNo()+ " Std Name : " + stdl.getName()+ " "+ stdl.getAge());
		}
		
		NameCompare nameComp = new NameCompare();
		Collections.sort(stdList, nameComp);
		for(Student stdl : stdList) {
			System.out.println("Std roll no : "+stdl.getRollNo()+ " Std Name : " + stdl.getName()+ " "+ stdl.getAge());
		}
		
	}

}
