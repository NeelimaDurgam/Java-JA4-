package com.test;
import java.util.*;

public class IncreasingOrder {
	
	public static Boolean checkNumber(int n) {
		boolean flag = false;
		int digit = n % 10;
		n = n/ 10;
		
		while(n>0) {
			if(digit <= n % 10) {
				flag = true;
				break;
			}
			digit = n % 10;
			n = n / 10;
		}
		if(flag) {
			return false;
			
		}
		else {543
			return true;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if (checkNumber(n) == true) {
			System.out.println("Number is an increasing number");
		}
		else {
			System.out.println("Number is not an increasing number");
	}
	

}
}
