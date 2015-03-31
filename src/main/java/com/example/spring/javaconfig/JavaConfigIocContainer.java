package com.example.spring.javaconfig;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.model.Employee;

/**
 * @author Maulik
 * 
 */
@Configuration
public class JavaConfigIocContainer {

	private static final Logger logger = Logger
			.getLogger(JavaConfigIocContainer.class);

	@Bean
	public Employee getEmployee() {
		logger.info(">>>>>  Employee Beans Created From JavaBased Configuration");
		return new Employee();
	}

}
