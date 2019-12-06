package com.set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Testing {

	public static void main(String[] args)
	{
		Resource resource = new ClassPathResource("Application.xml");
		BeanFactory bean = new XmlBeanFactory(resource);
		
		Answer answer = (Answer)bean.getBean("answer");
		answer.displayinfo();
        
		

	}

}
