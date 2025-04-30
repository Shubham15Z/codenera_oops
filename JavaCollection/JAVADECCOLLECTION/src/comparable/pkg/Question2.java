/*
Sort a list of integers in descending order.
Create a wrapper class MyInteger that implements Comparable<MyInteger> and override compareTo() accordingly.
 */

package comparable.pkg;

import java.util.ArrayList;
import java.util.Collections;

class MyInteger implements Comparable<MyInteger>
{
	private Integer integer;

	public MyInteger(Integer integer) {
		super();
		this.integer = integer;
	}

	public Integer getInteger() {
		return integer;
	}

	public void setInteger(Integer integer) {
		this.integer = integer;
	}

	

	@Override
	public String toString() {
		return integer.toString();
	}

	@Override
	public int compareTo(MyInteger o) {
		return this.integer.compareTo(o.getInteger());
	}
	
	
	
}
public class Question2 
{
	public static void main(String[] args) 
	{
		ArrayList<MyInteger> list1 = new ArrayList<MyInteger>();
		
		list1.add(new MyInteger(10));
		list1.add(new MyInteger(300));
		list1.add(new MyInteger(60));
		list1.add(new MyInteger(5));
		list1.add(new MyInteger(3220));
		
		System.out.println(list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1.get(1));
	}
}
