package com.constructor;

public class Address
{
	private String city;
	private String state;
	private String country;
	
	public Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
    }
	public String show()
	{
       return city+"----"+state+"---"+country;
	}

}
