package com.collections.array;


/*
 * 
 * This program is basic concepts of ARRYLIST
 * 
 * */
import java.util.*;
public class MyList {
	
	
	public static void main(String args[])
	{
		ArrayList<Integer> arrlist=new ArrayList<Integer>() ;
		
		
		arrlist.add(23);//append the elements it will add as we give
		arrlist.add(24);
		arrlist.add(25);
		arrlist.add(23);//duplicates are allowed
		arrlist.add(77);
		arrlist.add(88);
		arrlist.add(99);
		
		arrlist.set(5,55);
		
		System.out.println("List is: " +arrlist);
		System.out.println("List size is: "+ arrlist.size());
		
		try
		{
		System.out.println("The number from position 2:"+arrlist.get(20));//Retrieving the number from specific position
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Error"+e.getMessage());
		}
	
		
		if(arrlist.isEmpty())
		{
			System.out.println("List is Empty");
		}
		else
		{ 
			System.out.println("List has Values");
		}
		
	}

}
