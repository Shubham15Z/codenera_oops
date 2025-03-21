package dec.java.throwexception.pkg;

public class NullPointerExceptionDemo 
{
	void nullPointer()
	{
		int a[] = null;
		
		if(a == null)
		{
			throw new NullPointerException("Array is null");
		}
	}
	
	public static void main(String[] args) {
		NullPointerExceptionDemo n = new NullPointerExceptionDemo();
		n.nullPointer();
	}
}
