package com.example.spring.autowiring;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Autowiring.Categories;
import com.example.model.Autowiring.CategoriesConstrucor;

public class ByConstructorAutowiringDemo {
	private static final Logger logger = Logger
			.getLogger(ByConstructorAutowiringDemo.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");

		// By Type
		Categories categories = context.getBean("categoriesMainDemo",
				Categories.class);
		logger.info(categories);
		// Constructor
		CategoriesConstrucor categoriesConstructor = context.getBean(
				"categoriesConstructorMainDemo", CategoriesConstrucor.class);
		logger.info(categoriesConstructor);

	}
}
