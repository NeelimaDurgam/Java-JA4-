package LayeredArch;

import java.util.HashMap;
import java.util.Map;


public class CollegeTest {

	public static void main(String[] args) {
		College cg1 = new College("java",11);
		College cg2 = new College("java",11);
		
		Map<College, String> hm = new HashMap<College, String>();
		
		hm.put(cg1, "data1");
		hm.put(cg2, "data2");
		
		//System.out.println(hm);
		
		for(College cg : hm.keySet()) {
			System.out.println(hm.get(cg).toString());
		}
	}
}
