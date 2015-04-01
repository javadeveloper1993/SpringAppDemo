package com.example.spring.componetScaning;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Maulik
 * 
 */
public class ComponetAnnotationDemo {
	private static final Logger logger = Logger
			.getLogger(ComponetAnnotationDemo.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContextAnnotation.xml");

		CustomerService customerService = (CustomerService) context
				.getBean("test");
		logger.info(customerService);

	}
}
