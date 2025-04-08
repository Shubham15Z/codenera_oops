package dec.java.sleepmethod.pkg;

class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("The current thread is :"+Thread.currentThread().getName());
	}
}
public class CurrentThread
{
	public static void main(String[] args) {
		System.out.println("The current thread is :"+Thread.currentThread().getName());
		
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();
		MyThread2 t4 = new MyThread2();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
