/*
6. Create a thread using the Thread class to count frequency of each character in a string using threads  
 */

package dec.java.runnable2.pkg;

class MyThread6 extends Thread
{
	private String input;
	
	public MyThread6(String input) 
	{
		this.input = input;
	}
	
	public void countFrequency()
	{
		char[] ch = input.toCharArray();
		
		boolean[] visited = new boolean[ch.length];
		
		System.out.println("CHaracter Frequency is :");
		
		for(int i = 0; i < ch.length; i++)
		{
			if(!visited[i])
			{
				int count = 1;
				for(int j = i+1; j < ch.length; j++)
				{
					if(ch[i] == ch[j])
					{
						count++;
						visited[j] = true;
					}
				}
				System.out.println(ch[i]+" : "+count);
			}
		}
	}
	
	public void run()
	{
		countFrequency();
	}
	
}
public class Question6 
{
	public static void main(String[] args) 
	{
		String input = "Programming";
		
		MyThread6 t6 = new MyThread6(input);
		
		t6.start();
	}
}
