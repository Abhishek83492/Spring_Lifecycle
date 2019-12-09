package com.scope;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Testing {

	public static void main(String[] args)
	{
		//Using Application context of IOC............
		/*ApplicationContext context = new ClassPathXmlApplicationContext("Singleton.xml");
		Singleton_class sc = (Singleton_class)context.getBean("sc");
		sc.setId(54);
		sc.setName("Abhi");
		sc.msg();
		
		
		Singleton_class sc1 = (Singleton_class)context.getBean("sc");
		sc1.msg();*/
		
		//Using Dependenct injection bean factory...............
		Resource resource = new ClassPathResource("Singleton.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Singleton_class sc = (Singleton_class)factory.getBean("sc");
		sc.setId(54);
		sc.setName("Abhi");
		sc.msg();
		
		
		Singleton_class sc1 = (Singleton_class)factory.getBean("sc");
		sc1.msg();

	}

}
