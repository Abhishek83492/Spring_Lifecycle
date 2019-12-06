package com.set;

import java.util.Iterator;
import java.util.Set;

public class Answer
{
	private Integer id;
	private String name;
	private Set across;
	
	public Answer()
	{
		
	}
	public Answer(Integer id,String name,Set across)
	{
		super();
		this.id=id;
		this.name=name;
		this.across=across;
	}
	public void displayinfo()
	{
		System.out.println("Id is:"+id);
		System.out.println("Name is:"+name);
		Iterator it = across.iterator();
		while(it.hasNext())
		{
			System.out.println("Set values:"+it.next());
		}
		
	}

}
