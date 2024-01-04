package relations;

public class HasDemo3 {
	
	public static void main(String args[])
	{
		HasDemo2 hasDemo2=new HasDemo2();
		hasDemo2.method2(30, 40);
		
		System.out.println("The value from demo2:::::"+hasDemo2.i);
		System.out.println("The value from demo2:::::"+hasDemo2.hasDemo1.n);
		
	}

}
