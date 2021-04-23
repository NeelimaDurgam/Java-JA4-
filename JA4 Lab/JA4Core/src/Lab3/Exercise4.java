package Lab3;
import java.lang.*;
import java.util.Scanner;

public class Exercise4 {
	public static int modifyNumber(int num) {
		int a = num % 10;
		String s = String.valueOf(num);
		
		int n = s.length();
		char c[] = new char [n];
		// assigning string to character array
		for(int i=0;i<n;i++) {
			c[i] = s.charAt(i);
		}
		StringBuffer s1 = new StringBuffer();
		
		for(int i=0;i<n-1;i++) {
			s1.append(Math.abs((c[i]-c[i+1])));
		}
		String s2 = s1.toString();
		String s3 = String.valueOf(a);
		String s4 = s2 + s3;
		int b = Integer.parseInt(s4);
		return b;
		}
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a number");
	  int n = sc.nextInt();
	  System.out.println(modifyNumber(n));
	  
  }

}