package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ex3 {
	
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		
		
		hm.put("java", 8);
		hm.put("c", 45);
		hm.put("python", 43);
		hm.put("spring", 458);
		hm.put("java", 467);
		
		System.out.println(hm);
		
		// random order
		//if same order is needed as input, use LinkedHashMap
		
		LinkedHashMap<String, Integer> lm= new LinkedHashMap<>();
		
		
		lm.put("java", 8);
		lm.put("c", 45);
		lm.put("python", 43);
		lm.put("spring", 458);
		lm.put("java", 467);
		
		System.out.println(lm);
		
		Iterator<Entry<String, Integer>> itr = hm.entrySet().iterator();
		while(itr.hasNext()){
			Entry<String, Integer> et = itr.next();
			
			System.out.println("Key :" + et.getKey()+" value  :"+et.getValue());
		}
		
	}

}
