package com.example.spring.bean.scope;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Employee;

/**
 * @author maulik.patel
 * 
 */
public class PrototypeBeanScope {

	private static final Logger logger = Logger
			.getLogger(PrototypeBeanScope.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Employee employee = (Employee) context.getBean("empInfoScope");
		employee.setId("Emp002");
		employee.setFirstName("Parth");
		employee.setMiddleName("J");
		employee.setLastName("Patel");
		employee.setAge(25);
		 logger.info(">>>>>> 1st Object");
		 logger.info(employee);

		Employee employee1 = (Employee) context.getBean("empInfoScope");
		 logger.info(">>>>>> 2nd Object");
		 logger.info(employee1);
		context.registerShutdownHook();
	}

}
