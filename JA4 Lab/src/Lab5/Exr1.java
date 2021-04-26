package Lab5;

import java.util.Scanner;

class AgeException extends Exception{
	
	

	public void AgeException(String str) {
		System.out.println(str);
	}
}
public class Exr1 {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		try {
			if(age < 15) {
				throw new Exception("Invalid Age");
			}
			else {
				System.out.println("Valid age");
			}
		}
		catch(AgeException e) {
			System.out.println(e);
		}
		
	}
	

}
