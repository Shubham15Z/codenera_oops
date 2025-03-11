/*
22. Find the index of the first occurrence of 'a' in the StringBuffer "Java Programming".  
 */

package dec.java.string.buffer.pkg;

public class Question22 
{
	void indexOfFirstOccurance()
	{
		StringBuffer sb = new StringBuffer("Java Programming");
	
		for(int i = 0; i < sb.length()-1; i++)
		{
			if(sb.charAt(i) == 'a')
			{
				System.out.println(i);
				break;
			}
		}
		
		System.out.println(sb.indexOf("a"));
	}
	public static void main(String[] args) 
	{
		Question22 q22 = new Question22();
		q22.indexOfFirstOccurance();
	}
}
