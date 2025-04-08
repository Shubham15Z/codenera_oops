package dec.java.sleepmethod.pkg;

class MyThread4 extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("The current thread is :"+Thread.currentThread().getName());
	}
}
public class ThreadPriority
{
	public static void main(String[] args) 
	{
		MyThread4 t1 = new MyThread4();
		MyThread4 t2 = new MyThread4();
		MyThread4 t3 = new MyThread4();
		MyThread4 t4 = new MyThread4();
		
		System.out.println("priority of main thread : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(3);
		System.out.println("priority of main thread : "+Thread.currentThread().getPriority());
		
		System.out.println("priority of th1 :"+t1.getPriority());
		System.out.println("priority of th2 :"+t2.getPriority());
		System.out.println("priority of th3 :"+t3.getPriority());
		System.out.println("priority of th4 :"+t4.getPriority());
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(9);
		
		System.out.println("priority of th1 :"+t1.getPriority());
		System.out.println("priority of th2 :"+t2.getPriority());
		System.out.println("priority of th3 :"+t3.getPriority());
		System.out.println("priority of th4 :"+t4.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
