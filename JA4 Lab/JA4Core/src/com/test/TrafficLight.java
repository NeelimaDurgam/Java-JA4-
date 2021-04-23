package com.test;
import java.util.*;

public class TrafficLight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		switch(choice) {
		case "Red":
			System.out.println("Stop!");
			break;
		case "Green":
			System.out.println("Go!!!");
			break;
		case "Orange":
			System.out.println("Get Ready to Go!!");
			break;
		default :
			System.out.println("Invalid input");
			break;
		}
	}

}
