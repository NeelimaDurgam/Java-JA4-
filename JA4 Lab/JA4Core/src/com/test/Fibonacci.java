package com.test;

public class Fibonacci {
	public static int fib1(int n) {
		int a =0, b=1;
		int c;
		if ( n==0) {
			return a;
		}
		for(int i= 2; i <= n;i++) {
			c = a+b;
			a =b;
			b=c;
		}
		return b;
	}
	
	public static int fib2(int n) {
		if (n <= 1) 
			return n;
			
		return fib2(n-1)+fib2(n-2);
		
	}
	
	public static void main(String[] arags) {
		int n= 9;
		System.out.println(fib1(n));
		System.out.println(fib2(n));
	}

}
