package com.example.spring.autowiring;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Autowiring.Categories;

public class ByTypeAutowiringDemo {
	private static final Logger logger = Logger
			.getLogger(ByTypeAutowiringDemo.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");

		Categories categories = context.getBean("categoriesMainDemo",
				Categories.class);
		logger.info(categories);

	}
}
