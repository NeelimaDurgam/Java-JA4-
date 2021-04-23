package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
	      public static String[] sortStrings(String[] arr) {
	    Arrays.sort(arr);
	    int len = arr.length;
	    for(int i=0;i<len;i++) {
	    	int lenOfString = arr[i].length();
	   if(lenOfString % 2==0) 
	     {
	    	arr[i] = arr[i].substring(0,lenOfString/2).toUpperCase()+arr[i].substring(lenOfString/2).toLowerCase();
	    }
	    
	    else {
	    	arr[i] = arr[i].substring(0,lenOfString/2+1).toUpperCase()+arr[i].substring(lenOfString/2+1).toLowerCase();
	    	
	    }
	    }
	    
	    	  return arr;
	      }

	      
	       public static void main(String[] args) {
	    	  System.out.println("Enter the array size : ");
	    	  Scanner sc = new Scanner(System.in);
	    	  int n = sc.nextInt();
	    	  String arr[] = new String[n];
	    	  for(int i=0;i<n;i++) {
	    		  System.out.println("Enter the string " + (i+1) +" in array");
	    		  arr[i] = sc.next();
	    	  }
	    	  String [] result  = sortStrings(arr);
	    	  for(int i=0;i<n;i++) {
	    		  System.out.println(result[i]);
	    	  }
	      }
}


