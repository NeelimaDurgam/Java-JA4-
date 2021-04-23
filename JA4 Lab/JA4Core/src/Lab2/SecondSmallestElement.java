package Lab2;
import java.util.*;
public class SecondSmallestElement {
	static int getSecondSmallest(int arr[],int len) {
		int temp;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		return arr[1];
	}
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(getSecondSmallest(arr,n));
	}

}
