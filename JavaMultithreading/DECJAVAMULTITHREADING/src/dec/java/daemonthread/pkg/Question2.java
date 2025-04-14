/*
2. Modify a normal thread to a daemon thread using setDaemon(true) and print its status. 
 */

package dec.java.daemonthread.pkg;

class MyDaemon2 extends Thread
{
	public void run()
	{
		System.out.println("Daemon thread running....");
	}
}
public class Question2 
{
	public static void main(String[] args) 
	{
		MyDaemon2 d1 = new MyDaemon2();
		
		System.out.println(d1.isDaemon());
		d1.setDaemon(true);
		System.out.println(d1.isDaemon());
		
		d1.start();
	}
}
