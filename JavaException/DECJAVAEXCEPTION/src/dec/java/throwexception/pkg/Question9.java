/*
9. Throw ClassCastException when performing an invalid typecast.  
 */
package dec.java.throwexception.pkg;

public class Question9 
{
	public static void main(String[] args) {
		Object obj = "Hello";
		
		Integer num = (Integer) obj;
	}
}
