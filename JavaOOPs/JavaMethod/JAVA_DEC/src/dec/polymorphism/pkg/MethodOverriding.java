package dec.polymorphism.pkg;


class Father
{
	void repaire()
	{
		System.out.println("TypeWriter Repairing");
	}
	void display()
	{
		System.out.println("Father display method");
	}
	
}

class Son extends Father
{
	void repaire()
	{
		System.out.println("TypeWriter + Computer Repairing");
	}
}

class Gson extends Son
{
	void repaire()
	{
		System.out.println("TypeWriter + Computer + Laptop + Smartphones Repairing");
	}
	
//	void display()
//	{
//		System.out.println("Gson display method");
//	}
}


public class MethodOverriding {
	public static void main(String[] args) 
	{
		Father ob;
		ob =  new Father();
//		ob.repaire();
//		ob.display();
		
		ob = new Son();
		ob.repaire();
		ob.display();
		
		ob = new Gson();
		ob.repaire();
		ob.display();
		
		
	}
	
}
