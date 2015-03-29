package com.example.spring.bean.beanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Student;

/**
 * @author Maulik
 * 
 */
public class StudentBranLifeCycleDemo {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"ApplicationContext.xml");
		Student student = (Student) context.getBean("studentLifeCycle");
		context.registerShutdownHook();
	}
}
