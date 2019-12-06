package com.name;

public class Address
{
	private String city ;
	private String state;
	
	public Address()
	{
		System.out.println("Addres default");
	}
   
    public  Address(String city,String state)
	{
		this.city=city;
		this.state=state;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return city;
	}
	public void setState(String state)
	{
		this.state=state;
	}
	public String getState()
	{
		return state;
	}
	public String show()
	{
		return city+"-----"+state;
	}
}
