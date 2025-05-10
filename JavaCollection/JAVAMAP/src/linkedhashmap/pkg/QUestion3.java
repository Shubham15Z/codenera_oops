/*
3. Write a Java program to search for a key in a  LinkedHash Map.
4. Write a Java program to search for a value in a  LinkedHash Map.
 */

package linkedhashmap.pkg;

import java.util.LinkedHashMap;
import java.util.Map;

public class QUestion3 
{
	public static void main(String[] args) 
	{
		Map<Integer, Integer> m1 = new LinkedHashMap<Integer, Integer>();
		
		m1.put(10, 38);
		m1.put(20, 69);
		m1.put(15, 53);
		m1.put(40, 76);
		m1.put(25, 69);
		m1.put(15, 93);
		
		int keyToSearch = 40;
		int valueToSearch = 69;
		
		if(m1.containsKey(keyToSearch))
			System.out.println("Key "+keyToSearch+" is present..");
		else
			System.out.println("Key "+keyToSearch+" is not present..");
		
		if(m1.containsValue(valueToSearch))
			System.out.println("Value present");
		else
			System.out.println("Value is not present");
	}
}
