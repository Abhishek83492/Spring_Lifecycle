package com.SpringHome;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Testing 
{
	public static void main(String[] args)
	{
		   Resource resource=new ClassPathResource("Studentconfig.xml");  
		    BeanFactory factory=new XmlBeanFactory(resource);  
		      
		    Student student=(Student)factory.getBean("studentbean");  
	//	    student.setName("Aditya Gupta");
		    student.setId(101);
		    student.setId1(102);
		    student.dispalyinfo(); 
	}

}
