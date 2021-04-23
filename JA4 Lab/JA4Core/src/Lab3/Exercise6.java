package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
	public static boolean isPositive(String s) {
		int n = s.length();
		char c[] = new char [n];
		// assigning string to character array
		for(int i=0;i<n;i++) {
			c[i] = s.charAt(i);
		}
		
		//sort the char array
		Arrays.parallelSort(c);
		
		for(int i=0;i<n;i++) 
			if(c[i] != s.charAt(i))
				return false;
		return true;
		
		}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String s = sc.nextLine();
	if(isPositive(s)) {
		System.out.println("String is a positive string");
	}
	else {
		System.out.println("String is not a positive string");
	}
}
}
