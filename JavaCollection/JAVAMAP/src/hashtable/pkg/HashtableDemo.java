package hashtable.pkg;

import java.util.Hashtable;

public class HashtableDemo 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
		
		ht1.put(11, "Apple");  //  11%11 = 0
		ht1.put(16,"Mango");	// 16 % 11 = 5
		ht1.put(8, "Grapes");	// 8 % 11 = 8
		ht1.put(37, "Kiwi");	// 37 % 11 = 4
		ht1.put(44, "Orange");	// 44 % 11 = 0
								// 0 0 4 5 8  order is Descending order from 11 to 0
		System.out.println(ht1);
		
		System.out.println("java".hashCode());
		
		System.out.println(ht1.containsKey(8));
		System.out.println(ht1.containsValue("Kiwi"));
		System.out.println(ht1.isEmpty());
		System.out.println(ht1.size());
	}
}
