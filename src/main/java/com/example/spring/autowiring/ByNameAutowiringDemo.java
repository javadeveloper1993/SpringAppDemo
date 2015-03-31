package com.example.spring.autowiring;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Autowiring.AutoWiringModel;

public class ByNameAutowiringDemo {
	private static final Logger logger = Logger
			.getLogger(ByNameAutowiringDemo.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");

		AutoWiringModel autoWiringModel = context.getBean("autowiringMainDemo",
				AutoWiringModel.class);
		logger.info(autoWiringModel);

	}
}
