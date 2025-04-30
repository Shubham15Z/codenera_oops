package hashset.pkg;

import java.util.HashSet;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet s1 = new HashSet();
		
		s1.add(10);
		s1.add(8);
		s1.add(16);
		s1.add(32);
		s1.add(20);
		s1.add(6);
		s1.add(48);
		s1.add(4);
		s1.add(null);
		
		System.out.println(s1);
	}
}
