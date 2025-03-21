/*
5. Throw ArrayIndexOutOfBoundsException for an invalid array index.
 */

package dec.java.throwexception.pkg;

public class Question5
{
	void arrayIndex()
	{
		int a[] = {3,5,9,8,2};
		int index = 10;
		if(index > a.length)
		{
			throw new ArrayIndexOutOfBoundsException("please check the array index");
		}
		
		
		System.out.println(a[index]);
	}
	
	public static void main(String[] args) {
		Question5 q5 = new Question5();
		q5.arrayIndex();
	}
}
