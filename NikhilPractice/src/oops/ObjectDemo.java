package oops;

public class ObjectDemo extends ObjectDemo2{
int x=200;
int y;

public static void main(String args[])
{
	ObjectDemo ob=new ObjectDemo();
	//creating the super class object in the sub class to access the super class variables
	ob.method1();

}
}
