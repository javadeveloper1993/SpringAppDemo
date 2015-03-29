package com.example.spring.DI.constructor;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.DI.EmployeeDI;

/**
 * @author Maulik
 * 
 */
public class ConstrctorDI {

	private static final Logger logger = Logger.getLogger(ConstrctorDI.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		EmployeeDI employeeDI = (EmployeeDI) context.getBean("employeeDI");
		logger.info(employeeDI);
	}

}
