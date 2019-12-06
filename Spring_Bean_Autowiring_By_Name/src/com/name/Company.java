package com.name;

public class Company 
{
	private Integer compid;
	
	public Company()
	{
		System.out.println("company default");
	}
	public Company(Integer compid)
	{
		this.compid=compid;
	}
	public void setCompid(Integer compid)
	{
		this.compid=compid;
	}
	public Integer getCompid()
	{
		return compid;
	}
	public String show1()
	{
		return compid+"---";
	}
	

}
