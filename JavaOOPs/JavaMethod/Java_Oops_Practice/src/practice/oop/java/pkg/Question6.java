package practice.oop.java.pkg;

class Bird
{
	public String fly()
	{
		return "Birds Fly...";
	}
}

class Eagle extends Bird
{
	public String fly()
	{
		return "Eagle fly at highest altitude...";
	}
}
public class Question6 
{
	public static void main(String[] args) {
		Bird b1 = new Bird();
		System.out.println(b1.fly());
		
		Bird b2 = new Eagle();
		System.out.println(b2.fly());
	}
}
