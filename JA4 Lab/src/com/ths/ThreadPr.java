package com.ths;

class Expr2 extends Thread{
	public void run() {
		try {
			for(int i =1;i<=10;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class ThreadPr extends Thread{
	public void run() {
	try {
		for(int i =1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		Expr2 t1 = new Expr2();
		Expr2 t2 = new Expr2();
		Expr2 t3 = new Expr2();
		Expr2 t4 = new Expr2();
		
		//t1.start();
		// printing names of priorities
		System.out.println("Default thread name - "+t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		System.out.println(t4.getName());
		
		// setting name of t1 to math
		t1.setName("math");
		System.out.println("After setting thread name - "+t1.getName());
	    
		// printing priorities for threads
		System.out.println("Default thread priority :" + t1.getPriority());
	    System.out.println("Default thread priority :" + t2.getPriority());
	    System.out.println("Default thread priority :" + t3.getPriority());
	    System.out.println("Default thread priority :" + t4.getPriority());
	    
	    // setting to max priority
	    t1.setPriority(MAX_PRIORITY);
	    System.out.println("after setting priority :" + t1.getPriority());
	}

}
