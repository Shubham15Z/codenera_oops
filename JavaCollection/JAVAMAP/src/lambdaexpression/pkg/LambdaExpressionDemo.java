package lambdaexpression.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Demo
{
	public void show();
}

interface AddTwoNum
{
	public void addNum(int a, int b);
}

interface Add2
{
	public int addTwoNum(int a, int b);
}

interface StringLength
{
	public int findLength(String s);
}

interface FilterEvenNumber
{
	public void findEven(List<Integer> l1);
}

public class LambdaExpressionDemo 
{
	public static void main(String[] args)
	{
		Demo ob = () -> {
			System.out.println("Hello , this is Lambda Expression...");
		};
		ob.show();
		
		AddTwoNum a1 = (int a, int b) -> {
			System.out.println("Addition of two number is : "+(a+b));
		};
		a1.addNum(10, 20);
		
		Add2 a2 = (int a, int b) -> {
			return a+b;
		};
		int sum2 = a2.addTwoNum(20, 40);
		System.out.println("Sum by return method : "+sum2);
		
		StringLength l1 = (String s)-> {
			return s.length();
		};
		int res1 = l1.findLength("LambdaExpression");
		System.out.println("Length of String is : "+res1);
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,3,6,9,24,37));
		FilterEvenNumber f2 = (List<Integer> l2) -> {
			for(int num : l2)
			{
				if(num % 2 == 0)
				{
					System.out.print(num+" ");
				}
			}
		};
		f2.findEven(list1);
	}
}
