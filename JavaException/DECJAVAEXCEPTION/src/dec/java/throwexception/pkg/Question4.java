/*
 4. Throw NumberFormatException for invalid number conversion.
 */

package dec.java.throwexception.pkg;

public class Question4
{
	void numberFormat()
	{
		String s1 = "123nsadn";
		
		if(!s1.matches("-?\\d+"))
		{
			throw new NumberFormatException("please check the string before conversion");
		}
		
		
		System.out.println(Integer.parseInt(s1));
	}
	
	public static void main(String[] args) {
		Question4 q4 = new Question4();
		q4.numberFormat();
	}
}
