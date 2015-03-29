package com.example.spring.container;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.example.model.Employee;

/**
 * @author maulik.patel
 * 
 */
@SuppressWarnings("deprecation")
public class BeanFactoryContainerDemo {
	private static final Logger logger = Logger
			.getLogger(BeanFactoryContainerDemo.class);

	public static void main(String[] args) {
		try {
			Resource resource = new ClassPathResource("ApplicationContext.xml");
			// logger.info(resource.contentLength());
			// logger.info(resource.getDescription());
			// logger.info(resource.isOpen());
			// logger.info(resource.getURI());
			// logger.info(resource.getURL());
			BeanFactory beanFactory = new XmlBeanFactory(resource);
			logger.info("IsSingleton : " + beanFactory.isSingleton("empInfo"));
			Employee employee = (Employee) beanFactory.getBean("empInfo");
			logger.info("Employee : " + employee);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
