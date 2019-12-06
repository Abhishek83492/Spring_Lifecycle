package com.constructor;

public class DemoBean
{
	
	private String name;
	private Integer id;
	
	public DemoBean(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
    public void show()
	{
		System.out.println("Id is:"+id);
		System.out.println("Name is:"+name);
	}
	

}
