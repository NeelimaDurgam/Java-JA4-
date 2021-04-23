package com.ths;
class Cal{
	public void add() {
		System.out.println(12+45);
	}
}

class Math{
	public void div() {
		System.out.println(30/5);
	}
}
// using runnable interface 

class Exp4 implements Runnable{
	@Override
	public void run() {
		
		try {
		System.out.println("i am from run():"+Thread.currentThread().getName());
		/*Cal c = new Cal();
		c.add();
		Thread.sleep(2000);
		
		Math m = new Math();
		
		m.div();*/
	}
		catch(Exception e) {
			System.out.println("exception in thread");
		}
}
}

public class RunTest {
	public static void main(String[] args) {
		Exp4 t1 = new Exp4();
		//converting runnable interface object into thread class object
		// converting and giving name to it
		
		//Grouping the banks thread into tg1 group & math operations into tg2
		
		ThreadGroup tg1 = new ThreadGroup("Bank");
		Thread t2 = new Thread(tg1,t1,"Credit");
		Thread t3 = new Thread(tg1,t1,"Credit");
		Thread t4 = new Thread(tg1,t1,"Transfer");
		
		ThreadGroup tg2 = new ThreadGroup("Maths");
		
		Thread t5 = new Thread(tg2,t1,"Bank");
		Thread t6 = new Thread(tg2,t1,"Bank");
		Thread t7 = new Thread(tg2,t1,"Bank");
		
		t2.start();
		t4.start();
		//System.out.println(t2.getName());
		System.out.println("Bank group active threads :"+tg1.activeCount());
		t5.start();
		t6.start();
		System.out.println("Math group active threads : "+tg2.activeCount());
		
	}

}
