package Lab2;
import java.lang.*;
import java.util.*;

import java.util.Arrays;

public class NumbersSort {
	public static int [] getSorted(int[] arr) {
	//String str1 = Arrays.toString(num);
	//StringBuffer  str2 = new StringBuffer();
	//str2.reverse();
		
	// reversing elements      
	int len = arr.length;
	for(int i=0;i<len;i++) {
		String s = Integer.toString(arr[i]);
		StringBuffer x = new StringBuffer();
		x.append(s);
		x.reverse();
		String s1 = x.toString();
		arr[i] = Integer.parseInt(s1);
	}
	Arrays.parallelSort(arr);
	return arr;
	
	
	}
	
		   	
	public static void main(String[] args ) {
		System.out.println("Enter the array size : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element" +i+1+"in array");
			arr[i] = sc.nextInt();
		}
		int [] result = getSorted(arr);
		for(int i=0;i<n;i++) {
			System.out.println(result[i]);
		}
		

	}

}
