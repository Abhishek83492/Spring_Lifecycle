package com.constructor;

public class DemoBean
{
	private Integer id;
	private String message;
	
	public DemoBean(Integer id,String message)
	{
		this.id=id;
		this.message=message;
	}
/*	public void setId(Integer id)
	{
		this.id=id;
	}
	public void setMessage(String message)
	{
		this.message=message;
	}
*/	public void show()
	{
		System.out.println("Id is:"+id);
		System.out.println("Message is:"+message);
	}
	

}
