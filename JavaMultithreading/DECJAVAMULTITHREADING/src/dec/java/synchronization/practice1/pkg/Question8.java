/*
Write a synchronized method that writes a message and sleeps for 1 second. Start two threads calling it.
 */

package dec.java.synchronization.practice1.pkg;
class Message
{
	public synchronized void printMessage()
	{
		for(int i = 1; i <= 5; i++)
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

class MyThread08 extends Thread
{
	private  final Message message;
	
	public MyThread08(Message message)
	{
		this.message = message;
	}
	public void run()
	{
		message.printMessage();
	}
}
public class Question8
{
	public static void main(String[] args) 
	{
		Message m = new Message();
		
		MyThread08 t1 = new MyThread08(m);
		MyThread08 t2 = new MyThread08(m);
		
		t1.setName("thread-1");
		t2.setName("Thread-2");
		
		t1.start();
		t2.start();
		
	}
}
