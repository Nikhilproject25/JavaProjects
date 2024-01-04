package constructors;

public class Demo1 {

	int x,y;
	Demo1()
	{
		System.out.println("The value from Demo1 0 param::::    0");
	}
	Demo1(int x)
	{
		this.x=x;
		System.out.println("the value from 1 param::::"+x);
	}
	Demo1(Demo1 d)
	{
		System.out.println("the value is copied from demo2 obj by refereing Demo1 Type::::"+x);
	}
	public static void main(String args[])
	{
		Demo1 demo1=new Demo1();
		Demo1 demo2=new Demo1(10);
		//Demo1 demo3=new Demo1(demo2);
		System.out.println("the value from 1 param::::"+demo1);
		System.out.println("the value from 1 param::::"+demo2);
		//System.out.println("the value from 1 param::::"+demo3);
	}
}
