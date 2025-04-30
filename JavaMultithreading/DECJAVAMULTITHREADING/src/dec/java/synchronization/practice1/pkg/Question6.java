/*
Create a class with two threads that access a common object with a synchronized block inside a method.

 */

package dec.java.synchronization.practice1.pkg;

class MyThread06 extends Thread
{
    private final Object lock;

    MyThread06(Object lock) {
        this.lock = lock;
    }
    
	public void printName()
	{
		synchronized (lock)
		{
			for(int i = 0; i < 5; i++)
			{
				System.out.println(Thread.currentThread().getName()+" Hello "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	public void run()
	{
		printName();
	}
}

public class Question6 
{
	public static void main(String[] args)
	{
		Object commonlock = new Object();
		
		MyThread06 t1 = new MyThread06(commonlock);
		MyThread06 t2 = new MyThread06(commonlock);
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		
		t1.start();
		t2.start();
	}
}
