package com.example.spring.container;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Employee;

/**
 * @author maulik.patel
 * 
 */
public class ApplicationContextContainerDemo {
	private static final Logger logger = Logger
			.getLogger(ApplicationContextContainerDemo.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		Employee employee = (Employee) context.getBean("empInfo");
		logger.info(employee);

	}
}
