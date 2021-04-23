package com.ths;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentTest extends Thread {
	
	//static ArrayList al = new ArrayList();
	
	static CopyOnWriteArrayList al = new CopyOnWriteArrayList();
	
	public void run() {
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		al.add("java");
	}
	public static void main(String[] args) throws Exception {
		al.add("java");
		al.add("apple");
		al.add("mango");
		al.add("butter");
		al.add("dragon");
		
		ConcurrentTest t1 = new ConcurrentTest();
		
		t1.start();  //calls the run method
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			Thread.sleep(3000);
		}
	}

}
