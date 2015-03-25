package com.example.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.example.model.Employee;

/**
 * @author maulik.patel
 * 
 */
public class Employee_Resource_SpringDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		try {
			Resource resource = new ClassPathResource("applicationContext.xml");
			System.out.println(resource.contentLength());
			System.out.println(resource.getDescription());
			System.out.println(resource.isOpen());
			System.out.println(resource.getURI());
			System.out.println(resource.getURL());
			BeanFactory beanFactory = new XmlBeanFactory(resource);
			System.out.println(beanFactory.isSingleton("empInfo"));
			Employee employee = (Employee) beanFactory.getBean("empInfo");
			System.out.println(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
