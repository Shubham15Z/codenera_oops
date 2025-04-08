package dec.java.sleepmethod.pkg;

class MyThread3 extends Thread
{
	public void run()
	{
		System.out.println("The current thread is :"+Thread.currentThread().getName());
	}
}

public class JoinDemo 
{
	public static void main(String[] args) {
		
		MyThread3 t1 = new MyThread3();
		MyThread3 t2 = new MyThread3();
		MyThread3 t3 = new MyThread3();
		MyThread3 t4 = new MyThread3();
		
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.start();
		t3.start();
		t4.start();
	}
}
