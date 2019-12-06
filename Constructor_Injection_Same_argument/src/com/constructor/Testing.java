package com.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Testing {

	public static void main(String[] args) 
	{
		Resource resource = new ClassPathResource("Constructor.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		DataBean bean = (DataBean)factory.getBean("bean");
		bean.show();
		

	}

}
