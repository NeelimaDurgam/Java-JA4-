package com.test;

public class PowerOf2 {

      static boolean checkNumber(int n) {
		if(n==0)
			return false;
		
		while(n != 1) {
			if(n % 2 != 0 ) 
				return false;
			n = n / 2;
			
			
		}
		return true;
		
	}
     
     public static void main(String[] args) {
    	 int a = 64;
    	 int b = 91;
    	 System.out.println(checkNumber(a));
    	 System.out.println(checkNumber(b));
     }
      
}
