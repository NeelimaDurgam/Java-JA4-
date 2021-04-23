package Lab3;
import java.util.*;
import java.io.*;


public class Exercise5 {
        public static void main(String[] args ) throws IOException{
        	int nl = 1, nw=0;
        	char ch;
        	Scanner sc = new Scanner(System.in);
        	System.out.println("\nEnter the file name");
        	String str = sc.nextLine();
        	FileInputStream f = new FileInputStream(str);
        	int n= f.available();
        	for(int i=0;i<n;i++) {
        		ch = (char)f.read();
        		if(ch=='\n') {
        		nl++;
        		}
        		else if(ch == ' ') {
        			nw++;
        	}
        	
}
        	System.out.println("\n Number of lines:"+ nl );
        	System.out.println("\n Number of words:"+ nw);
        	System.out.println("\n Number of characters"+n);
}
}