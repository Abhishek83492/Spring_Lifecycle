package com.lossly;
import javax.naming.Context;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.lossly.Outer_helper_class_of_spring;
public class Test_call_spring_helper {

	public static void main(String[] args) 
	{
	/*	IOutputgeneratorr output;
       ApplicationContext app = new ClassPathXmlApplicationContext(new String[] {"Spring-Common.xml"});
       Outer_helper_class_of_spring outer = (Outer_helper_class_of_spring)output.get
       outer.generatoroutput();*/
		
		Resource resource  = new ClassPathResource("Spring-Common.xml");
		
		BeanFactory factory  =  new XmlBeanFactory(resource);
		
		Outer_helper_class_of_spring  outer =  (Outer_helper_class_of_spring)factory.getBean("Outer_helper_class_of_spring");
        outer.generatoroutput();
		

	}

}
