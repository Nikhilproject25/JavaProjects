package definingmethods;

public class InmemoryMethod {
	
	int x=9;//instance fields or instance variable
	
	public void method1()//instance methods or functions
	{
		int x=5;
		System.out.println("the value from local method1 "+x);
	}

	public void method2()//can't access values from method1
	{
		System.out.println("the value from metho2:"+x);
	}
	
	public static void main(String args[])
	
	{
		InmemoryMethod inmemoryMethod=new InmemoryMethod();
		System.out.println("The value from instance feilds"+inmemoryMethod.x);
		inmemoryMethod.method1();
		inmemoryMethod.method2();
	}
	

}
