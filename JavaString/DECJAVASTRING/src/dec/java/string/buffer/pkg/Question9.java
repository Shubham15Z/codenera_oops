/*
9. Ensure the capacity of a StringBuffer is at least 100 and print the new capacity.  
 */

package dec.java.string.buffer.pkg;

public class Question9 
{
	void printCapacity()
	{
		StringBuffer sb = new StringBuffer();
		sb.ensureCapacity(100);
		System.out.println("New Capacity : "+sb.capacity());
	}
	public static void main(String[] args) 
	{
		Question9 q9 = new Question9();
		q9.printCapacity();
	}
}
