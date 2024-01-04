package definingmethods;

public class ThisDemo {
	int x=2;
	
	public  void method1()
	{
		int x=6;
		System.out.println("the value from method 1:::::"+x);
		System.out.println("the value from instance this:::::"+this);
		System.out.println("the value from instance this:::::"+this.x);

	}
	public static void main(String args[])
	{
		ThisDemo thisDemo=new ThisDemo();
		thisDemo.method1();
	}

}
