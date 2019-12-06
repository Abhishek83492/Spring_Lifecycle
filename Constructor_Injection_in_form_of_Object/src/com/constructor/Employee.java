package com.constructor;

public class Employee 
{
	private Integer id;
	private String name;
	private Address add;
	
	public Employee()
	{
		System.out.println("Default constructor");
	}
    public Employee(Integer id,String name,Address add)
    {
    	super();
    	this.id=id;
    	this.name=name;
    	this.add=add;
    }
    public void displayinfo()
    {
    	System.out.println(id+"---"+name);
    	System.out.println(add.show());
    }
    
	
}
