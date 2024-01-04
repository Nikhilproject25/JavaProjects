package definingmethods;

public class PassingParams {
	
	public int method2(int x,int y)
	{
		int z=x+y;
		return z;
	}
	
	
	
	public static void main(String args[])
	{
		PassingParams passingParams=new PassingParams();
		passingParams.method2(10,20);
		
		int a=passingParams.method2(10,20);
		System.out.println("The return value from method2:"+a);
	}

}
