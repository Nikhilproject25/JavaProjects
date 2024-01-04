package definingmethods;

public class Compare {
	
	int x,y;
	
	public void method1(int x,int y)
	{
		this.x=x;
		this.y=y;	
		System.out.println("the value of method1 and instance same"+x);
		System.out.println("the value of method1 and instance same"+y);
	}
	 boolean method2(Compare o)
	{
		if(x==o.x &&y==o.y)
			
		{return true;}
		else {return false;}
	}

	public static void main(String args[])
	{
		Compare compare=new Compare();
		compare.method1(10,20);
		Compare compare1=new Compare();
		compare.method2(compare);
		
		boolean b=compare1.method2(compare);
		System.out.println(b);
		
	}

}
