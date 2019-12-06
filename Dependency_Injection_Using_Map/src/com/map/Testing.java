package com.map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Testing {

	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("Mapping.xml");
		BeanFactory bean = new XmlBeanFactory(resource);
		
		Mapping mapping = (Mapping)bean.getBean("map");
		mapping.show();
		

	}

}
