package Practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Ex2 {
	private HashMap<String, String> hm = new HashMap<String, String>();
	
	void makeMap(HashMap<String, String> hm) {
		this.hm = hm;
	}

	String[] showMap(String val) {
		ArrayList<String> str = new ArrayList<String>();
		for(Entry<String, String> e :hm.entrySet()) {
			if(e.getValue().contentEquals(val))
				str.add(e.getKey());
		}
		String[] ret = new String[str.size()];
		ret = str.toArray(ret);
		return ret;
	}
	public static void main(String[] args) {
		Ex2 e = new Ex2();
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("ram", "hari");
		hm.put("cisco", "barfi");
		hm.put("honeywell", "cs");
		hm.put("cts", "hari");
		e.makeMap(hm);
		for(String i : e.showMap("hari"))
			System.out.println(i);
		
	}
			

}
