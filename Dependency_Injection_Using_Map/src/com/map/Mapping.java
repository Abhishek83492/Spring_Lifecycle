package com.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapping 
{
	private Integer id;
	private String name;
	private Map data;
	
	public Mapping()
	{
		
	}
	public Mapping(Integer id,String name,Map data)
	{
		super();
		this.id=id;
		this.name=name;
		this.data=data;
	}
	public void show()
	{
		System.out.println("Id  is:"+id);
		System.out.println("Name is:"+name);
		Set s = data.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey()+"---"+me.getValue());
		}
	}

}
