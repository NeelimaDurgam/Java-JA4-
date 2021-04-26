package Lab5;

import java.util.Scanner;

class InvalidNameException extends Exception{
	String str1;
	
	public InvalidNameException(String str){
		super(str);
	}
}
	


public class Exr2 {
	void checkName(String[] name) throws InvalidNameException {
		if(name[0].equals("-") && name[1].equals("-")) throw new InvalidNameException("Name is invalid ");
		else 
			System.out.println("Name is valid");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter full name with space");
		String fullName = sc.nextLine();
		String name[] = fullName.split(" ");
		Exr2 obj = new Exr2();
		try {
			obj.checkName(name);
			
		}
		catch(InvalidNameException e) {
			
			System.out.println(e);
		}
		
		
	}
	
	

}
