package com.example.spring.bean.beanInheritenc;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.HelloIndia;

/**
 * @author Maulik
 * 
 */
public class BeanInheritenceDemo {

	private static final Logger logger = Logger
			.getLogger(BeanInheritenceDemo.class);

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		// HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		// logger.info(">>>>> :: " + helloWorld);
		HelloIndia helloIndia = (HelloIndia) context.getBean("helloIndia");
		logger.info(">>>>> :: " + helloIndia);

		context.registerShutdownHook();
	}
}
