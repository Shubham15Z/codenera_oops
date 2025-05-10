package map.pkg;

import java.util.HashMap;
import java.util.Map;

public class MapDemo 
{
	public static void main(String[] args) 
	{
		Map<String, Integer> mp = new HashMap<String, Integer>();
		
		String str = "java";
		System.out.println("index : "+str+" : "+(str.hashCode() % 16));
		mp.put(str, 60);
		
		str="python";
		System.out.println("index : "+str+" : "+(str.hashCode() % 16));
		mp.put(str, 80);
		
		str="html";
		System.out.println("index : "+str+" : "+str.hashCode() % 16);
		mp.put(str, 50);
		
		str="c";
		System.out.println("index : "+str+" : "+str.hashCode() % 16);
		mp.put(str, 100);
		
		str="javascript";
		System.out.println("index : "+str+" : "+str.hashCode() % 16);
		mp.put(str, 90);
		
		System.out.println(mp);
		
		
	}
}
