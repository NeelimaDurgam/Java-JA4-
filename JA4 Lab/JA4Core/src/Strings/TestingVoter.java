package Strings;

import java.util.Scanner;

public class TestingVoter {

	public static void main(String[] args) throws ValidVoterException, InvalidVoterException {
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		Validator ve = new Validator();
		ve.checkAge(age);
	}
}
