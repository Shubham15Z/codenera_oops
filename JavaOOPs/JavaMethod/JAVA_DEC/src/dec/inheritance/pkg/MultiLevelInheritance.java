package dec.inheritance.pkg;


class Parent 
{
	void print()
	{
		System.out.println("Parent class print method ");
	}
}

class Child extends Parent
{
	void display()
	{
		System.out.println("Child class display method ");
	}
}

class GrandChild extends Child
{
	void showOff()
	{
		System.out.println("Grand child class showOff method");
	}
}

class GreatGrandChild extends GrandChild
{
	void show()
	{
		System.out.println("Great Grand child class show method");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args)
	{
		Parent parent = new Parent();
		parent.print();
		System.out.println("---------------------------------");
		
		Child child = new Child();
		child.display();
		child.print();
		System.out.println("---------------------------------");
		
		GrandChild gc = new GrandChild();
		gc.showOff();
		gc.display();
		gc.print();
		System.out.println("---------------------------------");
		
		GreatGrandChild ggc = new GreatGrandChild();
		ggc.show();
		ggc.showOff();
		ggc.display();
		ggc.print();
	}
}

