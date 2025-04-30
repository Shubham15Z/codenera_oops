package set.pkg;

import java.util.HashSet;
import java.util.Set;

public class SetDemo 
{
	public static void main(String[] args) 
	{
		Set s = new HashSet();
		s.add(10);
		s.add(20);
		s.add(100);
		s.add("Hello");
		s.add('B');
		s.add(12.5);
		s.add(true);
		s.add(100);
		
		
		
		System.out.println(s);
	}
}
