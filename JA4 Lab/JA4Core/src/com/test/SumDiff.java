package com.test;


public class SumDiff {
	public static int calculateDifference(int n){
		int s1 = n*(n+1)/2;
		int s = 0;
		int s2;
		for(int i=1;i<=n;i++) {
			s+=i;
		}
		s2 = (int) Math.pow(s,2);
		
		return s1-s2;
	}
	public static void main(String[] args) {
		int n = 10;
		System.out.println(calculateDifference(n));
		
	}

}
