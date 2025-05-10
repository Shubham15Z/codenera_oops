/*
java index = hashcode % 16 = 2
python index = hashcode % 16 = -4
html index = hashcode % 16 = 11
c index = hashcode % 16 = 3
javascript index = hashcode % 16 = 13
 */
package hashset.pkg;

import java.util.HashSet;

public class HashSetIndex 
{
	public static void main(String[] args) 
	{
		HashSet<String> ob = new HashSet<String>();
		
		String str = "java";
		System.out.println(str + " : "+str.hashCode() % 16); // it gives out index out of 16
		ob.add(str);
		
		str = "python";
		System.out.println(str + " : "+str.hashCode() % 16);
		ob.add(str);
		
		str = "html";
		System.out.println(str + " : "+str.hashCode() % 16);
		ob.add(str);
		
		str = "c";
		System.out.println(str + " : "+str.hashCode() % 16);
		ob.add(str);
		
		str = "javascript";
		System.out.println(str + " : "+str.hashCode() % 16);
		ob.add(str);
		
		System.out.println(ob);
	}
}
