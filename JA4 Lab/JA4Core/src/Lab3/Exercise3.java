package Lab3;

import java.util.Scanner;

public class Exercise3 {
	public static String alterString(String s) {
		char[] temp = s.toCharArray();
		for(int i=0;i<temp.length;i++) {
			if (temp[i] != 'a' && temp[i] != 'e' && temp[i] != 'i' && temp[i] != 'o' && temp[i] != 'u') {
				temp[i] = (char)(temp[i]+1);
				
			}
		}
		return String.valueOf(temp);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(alterString(s));
		
	}

}
