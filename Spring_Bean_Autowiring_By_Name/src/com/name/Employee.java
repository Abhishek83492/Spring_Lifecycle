package com.name;

public class Employee 
{
	private Integer Id;
	private String name;
	private Address add;
	private Company comp;
	private Address add1;
	public Employee()
	{
		System.out.println("Employee dafault");
	}
	
	public Employee(Integer Id,String name,Address add,Company comp,Address add1)
	{
		this.Id=Id;
		this.name=name;
		this.add=add;
		this.comp=comp;
		this.add1=add1;
	}
	public Address getAdd1() {
		return add1;
	}

	public void setAdd1(Address add1) {
		this.add1 = add1;
	}

	public Company getComp() {
		return comp;
	}

	public void setComp(Company comp) {
		this.comp = comp;
	}

	public void setAdd(Address add)
	{
		this.add=add;
	}
	public Address getAdd()
	{
		return add;
	}
	public void setId(Integer Id)
	{
		this.Id=Id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public Integer getId()
	{
		return Id;
	}
	public String getName()
	{
		return name;
	}
	public void displayinfo()
	{
		System.out.println("Id is:"+Id);
		System.out.println("Name is:"+name);
		System.out.println(add.show());
		System.out.println(add1.show());
		System.out.println(comp.show1());
	}

}
