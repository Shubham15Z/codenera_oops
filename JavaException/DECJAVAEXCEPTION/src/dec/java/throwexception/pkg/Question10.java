/*
10. Throw SecurityException for unauthorized access.
 */

package dec.java.throwexception.pkg;

public class Question10 
{
	void checkUser()
	{
		String userRole = "guest";
		
		if(!"admin".equals(userRole))
		{
			throw new SecurityException("Access Denied : Admin privilegaes required");
		}
		
		System.out.println("Welcome to admin panel");
	}
	public static void main(String[] args) 
	{
		Question10 q10 = new Question10();
		q10.checkUser();
	}
}
