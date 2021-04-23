package com.test;

public class Calculate {
	public static int calculateSum(int n) {
		int sum =0;
		for(int i=0;i<=n;i++) {
			if(n % 3== 0 || n % 5 ==0) {
				sum = sum + n;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n = 50;
		System.out.println(calculateSum(n));
	}

}
