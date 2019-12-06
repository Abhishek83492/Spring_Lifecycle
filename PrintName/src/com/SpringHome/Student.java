package com.SpringHome;

public class Student
{
	private String name;
	private Integer Id;
	private Integer Id1;
	public Integer getId1() {
		return Id1;
	}
	public void setId1(Integer id1) {
		Id1 = id1;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void dispalyinfo()
	{
		System.out.println("Name is:"+name);
		System.out.println("----------------------------------");
		System.out.println("Id is:"+Id);
		System.out.println("----------------------------------");
		System.out.println("Id1 is:"+Id1);
		System.out.println("----------------------------------");
        System.out.println(Id+Id1+"=Addition of id and id1");
	}
	

}
