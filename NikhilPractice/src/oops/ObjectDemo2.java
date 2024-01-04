package oops;

public class ObjectDemo2 {
	int x=99999999;
	public void method1()
	{
		System.out.println("hi");
	}
	public static void main(String args[])
	{
		ObjectDemo od1=new ObjectDemo();
		System.out.println(od1);
		System.out.println("The value of x from parent class:"+od1.x);
		
		ObjectDemo2 o1=new ObjectDemo2();
		System.out.println("The X value from this class"+o1.x);
		
		ObjectDemo od2=new ObjectDemo();
		System.out.println(od2);
		int a=od2.y=3;
		System.out.println("The value of other is declared in this :"+a);
	}

}
