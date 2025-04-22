package arraylist.pkg;

import java.util.ArrayList;

class ArrayListMethod
{
	public void add() 
	{
		ArrayList al = new ArrayList();
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('A');
		al.add(12);
		al.add("Hello");
		al.add(12.5f);
		al.add(true);
		al.add(3.15);
		System.out.println(al);
		System.out.println("\n---------------------------------");
	}
	
	public void addAll()
	{
		ArrayList al1 = new ArrayList();
		al1.add('A');
		al1.add('B');
		al1.add('C');
		al1.add("Hello");
		al1.add(12.5f);
		al1.add(true);
		al1.add('A');
		System.out.println(al1);
		
		ArrayList al2 = new ArrayList();
		al2.add('D');
		al2.add('E');
		al2.add("Java");
		al2.add(100.20);
		System.out.println(al2);
		
		al1.addAll(al2);
		System.out.println(al1);
		System.out.println("\n---------------------------------");
	}
	
	public void remove()
	{
		ArrayList al = new ArrayList();
		al.add('N');
		al.add(100);
		al.add(true);
		al.add(3.14);
		al.add("remove");
		System.out.println(al);
		
		al.remove(3);
		al.remove(true);
		System.out.println(al);
		System.out.println("\n---------------------------------");
	}
	
	public void removeAll()
	{
		ArrayList al = new ArrayList();
		al.add('N');
		al.add(100);
		al.add(true);
		al.add('D');
		al.add('E');
		al.add("Java");
		al.add(100.20);
		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		al2.add(100);
		al2.add('E');
		al2.add("Java");
		
		al.removeAll(al2);
		System.out.println(al);
		System.out.println("\n---------------------------------");
	}
	
	public void containsAndContainsAll()
	{
		ArrayList al = new ArrayList();
		al.add('A');
		al.add(12);
		al.add("Hello");
		al.add(12.5f);
		al.add(true);
		al.add(3.15);
		
		ArrayList al2 = new ArrayList();
		al2.add('A');
		al2.add(12);
		
		System.out.println(al.contains("Hello"));
		System.out.println(al.contains(10));
		System.out.println(al.containsAll(al2));
		System.out.println("\n---------------------------------");
	}
	
	public void isEmpty()
	{
		ArrayList al1 = new ArrayList();
		al1.add('A');
		System.out.println(al1.isEmpty());
		System.out.println("\n---------------------------------");
	}
	
	public void clear()
	{
		ArrayList al1 = new ArrayList();
		al1.add('A');
		al1.add(100);
		
		System.out.println(al1);
		al1.clear();
		System.out.println(al1);
		System.out.println("\n---------------------------------");
	}
	
	public void sizeMethod()
	{
		ArrayList al1 = new ArrayList();
		al1.add('A');
		al1.add(100);
		
		System.out.println(al1.size());
		System.out.println("\n---------------------------------");
	}
	
	public void retainAllMethod()
	{
		ArrayList al1 = new ArrayList();
		al1.add('A');
		al1.add(100);
		
		ArrayList al2 = new ArrayList();
		al2.add('A');
		al2.add(12);
		
		System.out.println(al1.retainAll(al2));
		System.out.println(al1);
		System.out.println("\n---------------------------------");
	}
	
	public void indexOfMethod()
	{
		ArrayList al1 = new ArrayList();
		al1.add('A');
		al1.add('B');
		al1.add(100);
		al1.add('A');
		al1.add('B');
		al1.add(200);
		al1.add('B');
		
		System.out.println(al1.indexOf('B'));
		System.out.println(al1.lastIndexOf('B'));
		System.out.println("\n---------------------------------");
	}
	
	public void getMethod()
	{
		ArrayList al1 = new ArrayList();
		al1.add('A');
		al1.add('B');
		al1.add(100);
		al1.add('A');
		al1.add('B');
		al1.add(100);
		
		System.out.println(al1.get(2));
		System.out.println(al1.get(4));
		System.out.println("\n---------------------------------");
	}
}

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayListMethod ob1 = new ArrayListMethod();
		ob1.add();
		ob1.addAll();
		ob1.remove();
		ob1.removeAll();
		ob1.containsAndContainsAll();
		ob1.isEmpty();
		ob1.clear();
		ob1.sizeMethod();
		ob1.retainAllMethod();
		ob1.indexOfMethod();
		ob1.getMethod();
	}
	
}
