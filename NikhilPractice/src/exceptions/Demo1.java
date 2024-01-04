package exceptions;

import java.util.Scanner;

public class Demo1 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x,y;
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("the value of x==="+x+"the value of y=="+y);
		
		try 
		{
			int z=x/y;
			System.out.println("the value of z==="+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("y cant divide by xero");
			System.out.println("Re enter the y value");
			y=sc.nextInt();
			int z=x/y;
			System.out.println("the value of z==="+z);
		}
	}
		
		

}
