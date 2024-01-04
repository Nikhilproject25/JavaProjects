package relations;

public class IsDemo3 {
	
	public static void main(String args[])
	{
		IsDemo2 isDemo2=new IsDemo2();
		isDemo2.method1();
		
		//as its non static we are creating object for 2 class as it extends class 1 so we can use them
		System.out.println("the value from 1class by creating 2 class obj"+isDemo2.x);
		
		//as its a static no nned of obj we are calling directly using class name 
		System.out.println("the value from 1class by creating 2 class obj"+IsDemo1.y);
		
		
		
	}

}
