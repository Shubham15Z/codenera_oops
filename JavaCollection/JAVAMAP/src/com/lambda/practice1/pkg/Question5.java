/*
Write a lambda function to calculate the area of a rectangle given its length and width.
 */

package com.lambda.practice1.pkg;

interface AreaRectangle
{
	int findArea(int length, int width);
}
public class Question5
{
	public static void main(String[] args) 
	{
		int length = 12;
		int width = 5;
		AreaRectangle area = (l, w) -> l*w;
		
		int res = area.findArea(length,width);
		
		System.out.println(res);
	}
}
