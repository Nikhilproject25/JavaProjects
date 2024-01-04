package abstrct;

public class Demo2 extends Demo1{
	
	public static void main(String args[])
	{
		
		//Demo1 d =new Demo1();
		Demo2 demo2=new Demo2();
		demo2.method1();
		demo2.method2();
		
		
		Demo1 demo1=new Demo2();
		demo1.method1();
		
	}

	@Override
	void method2() {
		System.out.println("this is from absDemo2");
		
	}

}
