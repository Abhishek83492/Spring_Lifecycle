package com.check;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean_Flow implements InitializingBean,DisposableBean
{
	private Integer id;
	private String name;
	
	public Bean_Flow()
	{
		System.out.println("Default of Bean");
	}
	public Bean_Flow(Integer id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("paramerter constructor of bean");
	}
	public void setId(Integer id)
	{
		this.id=id;
		System.out.println("Setter of id");
	}
	public Integer getId()
	{
		return id;
		
	}
	public void setName(String name)
	{
		this.name=name;
		System.out.println("Setter of name");
	}
	public String getName()
	{
		return name;
	}
	public void init()
	{
		System.out.println("Init method.....");
	}
	public void destroy()
	{
		System.out.println("Destroy method......");
	}
	public void afterPropertiesSet()
	{
		System.out.println("After_Properties_Set method method.....");
	}
	public void show()
	{
		System.out.println("Show method called");
		System.out.println("Id is:"+id);
		System.out.println("Name is:"+name);
	}

}
