package com.example.spring.autowiring.annotation;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Autowiring.Annotation.CategoriesAnnotation;

/**
 * @author Maulik
 * 
 */
public class AutowiringAnnotationDemo {
	private static final Logger logger = Logger
			.getLogger(AutowiringAnnotationDemo.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContextAnnotation.xml");

		CategoriesAnnotation categoriesAnnotation = context.getBean(
				"categoriesMainDemo", CategoriesAnnotation.class);
		logger.info(categoriesAnnotation);

	}
}
