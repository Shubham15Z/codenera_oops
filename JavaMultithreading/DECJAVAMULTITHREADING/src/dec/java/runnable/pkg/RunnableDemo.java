package dec.java.runnable.pkg;

class MyThread1 implements Runnable
{
	public void printNumbers()
	{
		for(int i = 0; i <= 10; i++)
		{
			System.out.print(i+" ");
		}
	}
	
	@Override
	public void run() 
	{
		printNumbers();
	}
	
}

public class RunnableDemo 
{
	public static void main(String[] args)
	{
		MyThread1 mt1 = new MyThread1();
		
		Thread t1 = new Thread(mt1);
		
		t1.start();
	}
}
