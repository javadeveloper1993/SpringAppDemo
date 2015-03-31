package com.example.spring.javaconfig;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.model.Employee;

/**
 * @author Maulik
 * 
 */
public class JavaConfigImplementaion {
	private static final Logger logger = Logger
			.getLogger(JavaConfigImplementaion.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				JavaConfigIocContainer.class);

		Employee employee = applicationContext.getBean(Employee.class);
		employee.setAge(10);
		employee.setFirstName("Maulik");
		employee.setId("e001");
		employee.setMiddleName("J");
		employee.setLastName("Patel");
		logger.info(employee);

	}

}
