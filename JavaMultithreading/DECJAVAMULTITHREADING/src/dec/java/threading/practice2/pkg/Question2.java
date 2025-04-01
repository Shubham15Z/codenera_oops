/*
2.Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.

 */
package dec.java.threading.practice2.pkg;

class MyTriplet
{
	private int[] arr;
	private int size;
	private int x;
	
	public MyTriplet(int[] arr, int x) {
		this.arr = arr;
		this.size = arr.length;
		this.x = x;
	}
	
	public void findTriplet() 
	{
		boolean found = false;
		for(int i = 0; i < size-2; i++)
		{
			for(int j = i+1; j < size-1; j++)
			{
				for(int k = j+1; k < size; k++)
				{
					if(arr[i]+arr[j]+arr[k] == x)
					{
						System.out.println("The Triplet is : ("+arr[i]+", "+arr[j]+", "+arr[k]+")");
						found = true;
					}
				}
			}
		}
		if(!found)
		{
			System.out.println("Triplet is not found... for target sum : "+x);
		}
	}
}

class MyThread2 extends Thread
{
	private MyTriplet tr;

	public MyThread2(MyTriplet tr) 
	{
		this.tr = tr;
	}
	
	public void run()
	{
		tr.findTriplet();
	}
	
}
public class Question2 
{
	public static void main(String[] args) {
		int[] arr = {1,34,12,8,4};
		int x = 21;
		
		MyTriplet tr = new MyTriplet(arr, x);
		
		MyThread2 t2 = new MyThread2(tr);
		
		t2.start();
	}
}
