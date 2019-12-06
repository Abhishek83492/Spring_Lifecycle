package com.check;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Bean_Flow bean = (Bean_Flow)context.getBean("beanf");
		bean.show();
		context.registerShutdownHook();
		 
		Bean_Flow bean1 = (Bean_Flow)context.getBean("beanf1");
		bean1.show();
		context.registerShutdownHook();
		

	}

}
