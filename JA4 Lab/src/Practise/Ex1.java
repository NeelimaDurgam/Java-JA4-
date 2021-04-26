package Practise;

import java.util.HashMap;
import java.util.Map.Entry;

public class Ex1 {
	
	private HashMap<String, String> hm = new HashMap<String, String>();
	
	void makeMap(String[] str) {
		for(String i : str) {
			this.hm.put(i.substring(0,3).toUpperCase(),i);
		}
	}
	
	String showMap() {
		String str = "{";
		for(Entry<String, String> e: hm.entrySet()) {
			str = str.concat("{" + e.getKey()+ ","+e.getValue()+ "},");
		}
		str = str.substring(0,str.length()- 1) + "}";
		return str;
	}

	
	public static void main(String[] args) {
		String[] str = {"goa","kerala","gujarat"};
		
		Ex1 m = new Ex1();
		m.makeMap(str);
		System.out.println(m.showMap());
	}
	
}


