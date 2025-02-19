package dec.inheritance.pkg;

class Parent1
{
	void print()
	{
		System.out.println("Parent1 print method");
	}
}

class Child1 extends Parent1
{
	void show()
	{
		System.out.println("Show method of Child1");
	}
}

class Child2 extends Parent1
{
	void display()
	{
		System.out.println("Display method of Child2");
	}
}

public class HierarchicalInheritance 
{
	public static void main(String[] args) 
	{
		Child1 ch1 = new Child1();
		ch1.show();
		ch1.print();
		
		System.out.println("------------------------------");
		
		Child2 ch2 = new Child2();
		ch2.display();
		ch2.print();
	}
}
