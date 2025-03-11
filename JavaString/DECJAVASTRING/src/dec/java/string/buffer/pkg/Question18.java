/*
18. Append multiple values (int, double, boolean) to a StringBuffer and print it. 
 */
package dec.java.string.buffer.pkg;

public class Question18 
{
	void appendValues()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(123);
		sb.append(false);
		sb.append(12.67);
		sb.append('Z');
		sb.append("Hi");
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Question18 q18 = new Question18();
		q18.appendValues();
	}
}
