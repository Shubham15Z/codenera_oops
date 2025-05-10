package map.pkg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethod
{
	public static void main(String[] args) 
	{
		Map<String, Integer> mp = new HashMap<String, Integer>();
		
		mp.put("Apple", 50);
		mp.put("Kiwi", 40);
		mp.put("Mango", 80);
		mp.put("Grapes", 20);
		mp.put("Orange", 70);
		
		System.out.println(mp.containsKey("Apple"));
		System.out.println(mp.containsValue(80));
		
		System.out.println(mp.get("Grapes"));
		
//		Set s = mp.keySet();
//		System.out.println(s);
//		
//		mp.remove("Mango");
//		System.out.println(mp);
		
//		mp.clear();
//		System.out.println(mp);
		
		for(Map.Entry<String, Integer> entry : mp.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		for(Integer num : mp.values())
		{
			System.out.print(num+" ");
		}
		System.out.println();
		for(String key : mp.keySet())
		{
			System.out.print(key+" ");
		}
		
	}
}
