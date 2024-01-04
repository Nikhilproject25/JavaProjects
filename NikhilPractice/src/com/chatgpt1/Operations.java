package com.chatgpt1;

public class Operations {
	
	
	private float value1;
	private float value2;
	public float result;
	
	public Operations(float value1,float value2)
	{
		this.setValue1(value1);
		this.setValue2(value2);
	}
	
	public float addition()
	{
		result=getValue1()+getValue2();
		return result;	
	}
	
	public float subraction()
	{
		result=getValue1()-getValue2();
		return result;
	}
	public float multiplication()
	{
		result=getValue1()*getValue2();
		return result;
	}
	public float division()
	{
		result=getValue1()/getValue2();
		return result;
	}

	public float getValue1() {
		return value1;
	}

	public void setValue1(float value1) {
		this.value1 = value1;
	}

	public float getValue2() {
		return value2;
	}

	public void setValue2(float value2) {
		this.value2 = value2;
	}

}
