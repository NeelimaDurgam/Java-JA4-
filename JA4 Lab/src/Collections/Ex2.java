package Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Ex2 {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("dell", 34561);
		tm.put("Lenovo", 7676);
		tm.put("apple", 78992);
		tm.put("sony", 552);
		tm.put("think Pad", 7000);
		tm.put("asus", 50000);
		
		System.out.println(tm);
		
		// default prints sorted order
		
		// priority is given to upper case
		
		Iterator<Entry<String, Integer>> itr = tm.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<String, Integer> et = itr.next();
			System.out.println("Product :" +et.getKey()+"Price:"+et.getValue());
		}
	}
}
