package com.collections.listobj;

import java.util.*;

public class Example1 {
	
	public static void main(String args[])
	{
		
		ArrayList<Employee> emp= new ArrayList<Employee>();
		
		emp.add(new Employee (1,"Nikhil",2000));
		
		
		for(Employee e: emp)
		{
			System.out.println(e);
		}
		
		
	}

}
