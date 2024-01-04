package relations;

public class IsDemo2 extends IsDemo1{
	
	int a=30;
	
	public void method1()
	{
		System.out.println("the value from super class by using super key:::::"+super.x);
		System.out.println("The value from sub class instance"+this.a);
		super.method1();
	}

}
