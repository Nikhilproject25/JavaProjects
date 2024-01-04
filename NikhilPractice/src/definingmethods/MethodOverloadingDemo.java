package definingmethods;

public class MethodOverloadingDemo {
	
	public void method1(int x)
	{
		System.out.println("the value from method1 int:::::"+x);
	}
	
	public void method1(byte b)
	{
		System.out.println("The value from method1 byte:::"+b);
	}
	public void method1(short s)
	{
		System.out.println("the value from method1 short::"+s);
	}
	
	public static void main(String args[])
	{
		MethodOverloadingDemo methodOverloadingDemo=new MethodOverloadingDemo();
		methodOverloadingDemo.method1((byte)2);
		methodOverloadingDemo.method1(3);
		methodOverloadingDemo.method1((short )3);

		
	}

}
