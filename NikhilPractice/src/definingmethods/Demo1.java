package definingmethods;

public class Demo1 {
	
	void method1()
	{
		System.out.println("Hi this is method1");
	}
	
	
	public static void main(String args[])
	{
		Demo1 d1=new Demo1();
		d1.method1();
		InmemoryMethod inmemoryMethod=new InmemoryMethod();
		inmemoryMethod.method2();
		
	}

}
