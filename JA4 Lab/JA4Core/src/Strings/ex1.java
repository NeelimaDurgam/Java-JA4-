package Strings;

public class ex1 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			
			String name = "java";
			
			System.out.println(name.charAt(4));
			
			String[] ar = {"java", ".net", "py"};
		
		    System.out.println(ar[4]);
		
		}
		catch(ArithmeticException ae) {
			System.out.println("cant divide by zero");
		}
		catch(StringIndexOutOfBoundsException sie) {
			System.out.println("check your name");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("checka arr size ");
		}
		catch(Exception ee) {
			System.out.println("check your inputs");
		}
		finally {
			System.out.println("finally block execeuted");
		}
	}

}
