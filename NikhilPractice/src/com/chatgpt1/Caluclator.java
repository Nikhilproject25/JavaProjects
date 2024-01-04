package com.chatgpt1;

import java.util.Scanner;

public class Caluclator {
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		Operations o=new Operations(3,4);
		
		System.out.println("\n 1.Addition");
		System.out.println("\n 2.Subraction");
		System.out.println("\n 3.Multiplications");
		System.out.println("\n 4.Division");
		System.out.println("\n Choose the operation");
		int choice=sc.nextInt();
		
		
		System.out.println("Enter the values");
		System.out.println("value1=");
		float value1=sc.nextFloat();
		System.out.println("value2=");
		float value2=sc.nextFloat();
		o.setValue1(value1);
		o.setValue2(value2);
		
		
		float result=0;
		if(choice==1) {result=o.addition();}
		else if(choice==2){result=o.subraction();}
		else if(choice==3) {result=o.multiplication();}
		else if(choice==4) {result=o.division();}
		
		
		System.out.println("The value=" +result);
	}

}
