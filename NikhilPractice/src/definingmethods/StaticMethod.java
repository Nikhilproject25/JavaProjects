package definingmethods;

public class StaticMethod {
	
	static int x=10;
	
	public void method1()
	{
		int y=20;
		int z=y+x;
		System.out.println("the sum of static instance and method vaiable:::"+z);
	}
	
	public static void main(String args[])
	{
		System.out.println("the value from static instance::::"+x);
		System.out.println("the value from static instance::::"+StaticMethod.x);
		StaticMethod staticMethod=new StaticMethod();
		staticMethod.method1();
		
	}

}
