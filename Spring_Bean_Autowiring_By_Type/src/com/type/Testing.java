package com.type;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Testing {

	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("Bytype.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Customer customer = (Customer)factory.getBean("custo");
		customer.displayinfo();
		


	}

}
