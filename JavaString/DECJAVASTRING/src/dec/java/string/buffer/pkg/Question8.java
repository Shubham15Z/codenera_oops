/*
8. Create a StringBuffer with an initial capacity of 50 and print its capacity.  
 */

package dec.java.string.buffer.pkg;

public class Question8 
{
	void printCapacity()
	{
		StringBuffer sb = new StringBuffer(50);
		System.out.println(sb.capacity());
	}
	public static void main(String[] args) 
	{
		Question8 q8 = new Question8();
		q8.printCapacity();
	}
}
