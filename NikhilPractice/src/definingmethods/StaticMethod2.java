package definingmethods;

//storing data for common objects
public class StaticMethod2 {
	
	int sno;
	String name;
	
	public void method1(int num,String ename)
	{
		sno=num;
		name=ename;
	}
	
	public void method2()
	{
		System.out.println("the value of method2 from instanmce:::"+sno);
		System.out.println("the value of method2 from instanmce:::"+name);
	}
	
	public static void main(String args[])
	{
		StaticMethod2 staticMethod=new StaticMethod2();
		staticMethod.method1(1, "Nikhil");
		staticMethod.method2();
		
	}

}
