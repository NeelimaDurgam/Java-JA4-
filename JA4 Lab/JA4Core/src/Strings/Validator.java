package Strings;

public class Validator {

	 public void checkAge(int age) throws ValidVoterException,InvalidVoterException {
		 if(age >= 18) {
			 ValidVoterException ve = new ValidVoterException("elgible");
		     throw(ve);
		 
		 }
		 else {
			 InvalidVoterException ie = new InvalidVoterException("Not eligible");
		     throw(ie);
		 }
	 }
}
