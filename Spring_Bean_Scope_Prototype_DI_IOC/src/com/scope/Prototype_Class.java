package com.scope;

public class Prototype_Class
{
	private Integer id;
	private String name;
	
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void show()
	{
		System.out.println("Id is:"+id);
		System.out.println("Name is:"+name);
	}

}
