package p1;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Ex3 {
	public static void main(String[] args) {
		Pattern ptr = Pattern.compile(".s");
		
		Matcher mtr = ptr.matcher("hs");
		
		boolean cnd = mtr.matches();
		
		System.out.println(cnd);
		
		boolean nd1 = Pattern.compile(".j").matcher("wwe").matches();
		System.out.println(nd1);
		
		System.out.println(Pattern.matches("[abc]+", "cc"));
	
	
       System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "Neel0399"));
       
       System.out.println(Pattern.matches("^(?=.[0-9)(?=..*[a-z)(?=.*[A-Z])(?.*[@#$%^&-++()])(?=\\S+$).{8,20}$",
    		   "Neelima0399*"));
	}

}
