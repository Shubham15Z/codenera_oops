package vector.pkg;

import java.util.Vector;

public class VectorDemo 
{
	public static void printVector()
	{
		Vector ob = new Vector();
		
		ob.add(10);
		ob.add(20);
		ob.add("A");
		
		ob.addElement(30);
		ob.addFirst("C");
		ob.addLast(100);
		
		System.out.println(ob);
		System.out.println(ob.capacity());
		
		ob.remove(2);
//		boolean b = ob.remove(30);
		System.out.println(ob);
	}
	public static void main(String[] args) 
	{
		printVector();
	}
}
