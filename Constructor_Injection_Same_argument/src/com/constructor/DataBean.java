package com.constructor;

public class DataBean 
{
	private String name;
	private String name1;
	
	public DataBean(String name,String name1)
	{
		this.name=name;
		this.name1=name1;
	}
	public void show()
	{
		System.out.println("Name is:"+name);
		System.out.println("Name1 is:"+name1);
	}

}
