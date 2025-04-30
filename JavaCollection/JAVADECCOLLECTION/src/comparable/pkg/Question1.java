/*
Sort an array of strings using Comparable.
Create a class MyString that implements Comparable<MyString>. Override compareTo() to sort strings in alphabetical order.
 */

package comparable.pkg;

import java.util.ArrayList;
import java.util.Collections;

class MyString implements Comparable<MyString>
{
	private String fruit;

	
	public MyString(String fruit) {
		super();
		this.fruit = fruit;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	
	

	@Override
	public String toString() {
		return fruit;
	}

	@Override
	public int compareTo(MyString o) 
	{
		return this.fruit.compareTo(o.getFruit());
	}
	
	
}
public class Question1 
{
	public static void main(String[] args) 
	{
		ArrayList<MyString> fruits = new ArrayList<MyString>();
		
		MyString f1 = new MyString("Pineapple");
		fruits.add(f1);
		fruits.add(new MyString("Grapes"));
		fruits.add(new MyString("Banana"));
		fruits.add(new MyString("Mango"));
		
		System.out.println("Before Sort");
		System.out.println(fruits);
		
		Collections.sort(fruits);
		System.out.println("After sort");
		System.out.println(fruits);
		
	}
}
