/*
 1.Given an array, rotate the array by one position in clock-wise direction.
Input:
N = 5
A[] = {1, 2, 3, 4, 5}
 */

package dec.java.threading.practice2.pkg;

import java.util.Arrays;

class ArrayRotation
{
	private int[] arr;
	private int size;
	
	public ArrayRotation(int[] arr)
	{
		this.arr = arr;
		this.size = arr.length;
	}
	
	public void rotateClockwise()
	{
		int last = arr[size-1];
		for(int i = size-1; i > 0; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = last;
	}
	
	public void display()
	{
		System.out.println(Arrays.toString(arr));
	}
}
class MyThread1 extends Thread
{
	private ArrayRotation ar1;
	
	public MyThread1(ArrayRotation ar1)
	{
		this.ar1 = ar1;
	}
	
	public void run()
	{
		System.out.println("Before Rotation :");
		ar1.display();
		ar1.rotateClockwise();
		System.out.println("After Roatation :");
		ar1.display();
	}
}
public class Question1
{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		
		ArrayRotation ar = new ArrayRotation(arr);
		
		MyThread1 t1 = new MyThread1(ar);
		t1.start();
	}
}
