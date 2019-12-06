package com.constructor;

public class DemoBean
{
	private Integer id;
	private String name;
	
	public DemoBean(Integer id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public DemoBean(String name,Integer id)
	{
		this.name=name;
		this.id=id;
	}
	public void show()
	{
		System.out.println("Id is:"+id);
		System.out.println("Name is:"+name);
	}

}
