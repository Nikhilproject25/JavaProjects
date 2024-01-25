package com.collections.array;

import java.util.*;

public class MyList3 {
	
	public static void main(String args[])
	{
		ArrayList <Integer> arr=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.Append");
			System.out.println("2.Insert");
			System.out.println("3.Replace");
			System.out.println("4.Delete");
			
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			
		
		
			if(ch==1)
			{
				System.out.println("Enter the element");
				int num=sc.nextInt();
				arr.add(num);
				System.out.println("The array List is:"+arr);
			}
			
			if(ch==2)
			{
				System.out.println("Enter the indexLocation");
				int loc=sc.nextInt();
				System.out.println("Enter the Element");
				int num=sc.nextInt();
				
				try
				{
					arr.add(loc, num);
					System.out.println("The array List is:"+arr);
					
				}
				catch(Exception e)
				{
					System.out.println("Error");
				}
				
			}
			
			if(ch==3)
			{
				System.out.println("Enter the indexLocation");
				int loc=sc.nextInt();
				System.out.println("Enter the Element");
				int num=sc.nextInt();
				
				try
				{
					arr.set(loc, num);
					System.out.println("The array List is:"+arr);
					
				}
				catch(Exception e)
				{
					System.out.println("Error");
				}
				
			}
			if(ch==4)
			{
				System.out.println("Enter the index postion");
				int loc=sc.nextInt();
				
				try 
				{
					arr.remove(loc);
					System.out.println("The array List is:"+arr);
				}
				catch(Exception e)
				{
					System.out.println("Error"); 
				}
			}
			
		}
		
		
		
	}

}
