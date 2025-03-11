package dec.java.string.buffer.pkg;

public class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		StringBuilder sd = new StringBuilder("Hi");
		sd.append(" John");
		System.out.println(sd);
//		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.append(" Ajay");
//		sb.insert(2, "Vi");
//		sb.replace(2, 5, "y");
//		sb.delete(2, 4);
//		sb.reverse();
		sb1.setCharAt(2, 'y');
		
		
//		System.out.println(sb);
//		System.out.println(sb.capacity());
//		System.out.println(sb1.capacity());
//		System.out.println(sb1.charAt(4));
//		System.out.println(sb1);
		System.out.println(sb1.length());
	}
}
