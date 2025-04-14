package dec.java.daemonthread.pkg;

class MyTask1 extends Thread
{
	public void run()
	{
		System.out.println("Task 1");
	}
}

class MyTask2 extends Thread
{
	public void run()
	{
		System.out.println("Task 2");
	}
}

public class MultipleTask 
{
	public static void main(String[] args) 
	{
		MyTask1 t1 = new MyTask1();
		MyTask1 t2 = new MyTask1();
		MyTask1 t3 = new MyTask1();
		
		t1.start();
		t2.start();
		t3.start();
		
		MyTask2 t4 = new MyTask2();
		t4.start();
	}
}
