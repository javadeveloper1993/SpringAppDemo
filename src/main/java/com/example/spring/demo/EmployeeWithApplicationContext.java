package com.example.spring.demo;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Employee;

/**
 * @author maulik.patel
 * 
 */
public class EmployeeWithApplicationContext {
	private static final Logger logger = Logger
			.getLogger(EmployeeWithApplicationContext.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Employee employee = (Employee) context.getBean("empInfo");
		logger.info(employee);

	}
}
