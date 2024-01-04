package polymor;

public class Demo3 {
	
	public static void main(String args[])
	{
		
		
		Demo1 demo=new Demo2();
		demo.book();
		
		Demo1 d= new Demo1();
		d.book();
		
		
		Demo2 demo2=(Demo2) demo;
		demo2.book();
	}
}
