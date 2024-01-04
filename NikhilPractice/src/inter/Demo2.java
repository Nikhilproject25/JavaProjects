package inter;

public class Demo2 implements Demo1 {
	
	@Override
	public void method1()
	{
		System.out.println("implements");
	}
	
	public void method2()
	{
		System.out.println("from method2 extended");
	}

}
