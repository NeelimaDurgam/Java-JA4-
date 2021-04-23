package Lab2;

import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
	public static int [] modifyArray(int[] arr) {
		Arrays.parallelSort(arr);
		int len = arr.length;
		   int[] temp = new int[len];
		   int j=0;
		   for(int i=0;i<len-1;i++) {
			   if(arr[i] != arr[i+1] ){
				   temp[j++] = arr[i];
			   }
		   }
		    temp[j++] = arr[len-1];
		   for(int k= 0;k<j;k++) {
			   arr[k] = temp[k];
		   }
		   int array[] = Arrays.copyOfRange(arr,0,j);
		   

		
		return array;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,1,2,4,6};
		int [] res =modifyArray(arr);
		for (int i=0;i<res.length;i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
