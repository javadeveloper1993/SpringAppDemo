package com.example.model;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author maulik.patel
 * 
 */
public class Employee implements InitializingBean, DisposableBean {

	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(Employee.class);

	private String id;
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName
				+ ", age=" + age + "]";
	}

	@Override
	public void destroy() throws Exception {
//		logger.info(">>>>>>> Beans was Destroyed >>>>>>>>>");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
//		logger.info(">>>>>>> Beans was Created >>>>>>>>>");
	}

}
