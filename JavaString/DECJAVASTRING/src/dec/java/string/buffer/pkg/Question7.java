/*
7.  Find and print the capacity of an empty StringBuffer.
 */

package dec.java.string.buffer.pkg;

public class Question7 
{
	void printCapacity()
	{
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
	}
	public static void main(String[] args) 
	{
		Question7 q7 = new Question7();
		q7.printCapacity();
	}
}
