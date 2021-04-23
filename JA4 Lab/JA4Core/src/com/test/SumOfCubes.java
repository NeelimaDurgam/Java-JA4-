package com.test;
import java.util.*;


public class SumOfCubes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		double sum = 0;
		int digit;
		int num = sc.nextInt();
		while(num > 0) {
			digit = num % 10;
			sum = sum + Math.pow(digit , 3);
			num = num / 10;
		}
		System.out.println("Answer = " + sum);
	}
}
