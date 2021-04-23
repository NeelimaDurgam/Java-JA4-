package Lab3;
import java.util.*;
public class Exercise2 {
	public static String getImage(String s) {
		StringBuffer s1 = new StringBuffer(s);
		String s2 = new StringBuffer(s1).reverse().toString();
		String s3 = (s1+ "|" + s2);
		return s3;
		
	}

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		System.out.println(getImage(s));
	}
}
