package LayeredArch;

import java.util.Comparator;

public class Student implements Comparable<Student> {

	private int rollNo;
	private String name;
	private int age;
	
	
	@Override
	public int compareTo(Student std) {
		return this.age - std.age;
}
	
	// Ceating default constructor
	public Student() {
		
	}
	public Student(int rollNo, String name, int age) {
		// creating parameterized constructors
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
}


// Sorting based on names in ascending order as we wrote std1.getName().compareTo(std2.getName())
// if we write, std2.getName().compareTo(std1.getName()), then it does sorting in descending order
class NameCompare implements Comparator<Student>{
	@Override
	public int compare(Student std1, Student std2) {
		return std1.getName().compareTo(std2.getName());
	}
	
}
	
