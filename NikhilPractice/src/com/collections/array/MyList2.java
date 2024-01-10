package com.collections.array;

/*
 * This program explains concepts of loops and Iterator method of ARRAYLIST
 * 
 * */


import java.util.*;
public class MyList2 {
	
	public static void main(String args[])
	{
		
		ArrayList<String> arrlist = new ArrayList<String>();
		
		arrlist.add("Java");
		arrlist.add("Spark");
		arrlist.add("Python");
		arrlist.add("Scala");
		arrlist.add("Embeded");
		
		//for loop to print each values of list
		
		for(int i=0;i<arrlist.size();i++)
		{
			System.out.println(arrlist.get(i));
		}
		
		System.out.println(" \nFor Each loop");
		//for each loop

		for(String a :arrlist)
		{
			System.out.println(a);
		}
		
		System.out.println(" \nUsing Iterator");
		
		//for Iterator method
		
		Iterator<String>  itr =  arrlist.iterator();
		while(itr.hasNext())
		{
			String c=itr.next();
			
			System.out.println(c);
		}
		
		
		System.out.println(" \nUsing ListIterator Reverse");
		
		// HasPrevious
		
		ListIterator<String> itr1= arrlist.listIterator(arrlist.size());
		while(itr1.hasPrevious())
		{
			String b=itr1.previous();
			System.out.println(b);
		}
	}

}
