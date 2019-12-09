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
		//using Application context of ioc.............. 
	/*	ApplicationContext context = new ClassPathXmlApplicationContext("Prototype.xml");
		Prototype_Class pc = (Prototype_Class)context.getBean("proto");
		pc.setId(501);
		pc.setName("Anand");
		pc.show();
		
		Prototype_Class pc1 = (Prototype_Class)context.getBean("proto");
        pc1.show(); 		*/
		
		//using BeanFactory of DI.............
		Resource resource = new ClassPathResource("Prototype.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Prototype_Class pc = (Prototype_Class)factory.getBean("proto");
		pc.setId(502);
		pc.setName("Abhi");
		pc.show();
		
		Prototype_Class pc1 = (Prototype_Class)factory.getBean("proto");
        pc1.show(); 		

	}

}
