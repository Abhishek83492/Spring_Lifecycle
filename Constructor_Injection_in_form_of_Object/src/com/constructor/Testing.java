package com.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Testing {

	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("Object.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee emp = (Employee)factory.getBean("emp");
		emp.displayinfo();
		

	}

}
