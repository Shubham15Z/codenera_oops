package parameter.method.java.pkg;

public class ParameterMethod {
	
	void printValues(int a, char ch, boolean b, double d, String s, float k)
	{
		System.out.println("int a : "+a);
		System.out.println("char ch : "+ch);
		System.out.println("boolean b : "+b);
		System.out.println("double d : "+d);
		System.out.println("String s : "+s);
		System.out.println("Float k : "+k);
	}
	
	public static void main(String args[])
	{
		int v = 10;
		char z = 'j';
		boolean flag = true;
		double dob = 12.56;
		String name = "Ajay";
		float t = 34.67f;
		ParameterMethod ob = new ParameterMethod();
		ob.printValues(v, z, flag, dob, name, t);
	}
}
