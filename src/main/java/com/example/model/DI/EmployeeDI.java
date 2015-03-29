package com.example.model.DI;

import org.apache.log4j.Logger;

/**
 * @author maulik.patel
 * 
 */
public class EmployeeDI {

	private static final Logger logger = Logger.getLogger(EmployeeDI.class);

	private String name;
	private int age;
	private Boolean isBoolean;
	private AddressDI addressDI;
	private StudentDI studentDI;

	public EmployeeDI() {
		super();
	}

	public EmployeeDI(String id) {
		this.name = id;
	}

	public EmployeeDI(int age) {
		this.age = age;
	}

	public EmployeeDI(Boolean isBoolean) {
		this.isBoolean = isBoolean;
	}

	public EmployeeDI(String name, int age, Boolean isBoolean) {
		this.name = name;
		this.age = age;
		this.isBoolean = isBoolean;
	}

	public EmployeeDI(String name, int age, Boolean isBoolean, AddressDI address) {
		this.name = name;
		this.age = age;
		this.isBoolean = isBoolean;
		this.addressDI = address;
	}

	public EmployeeDI(String name, int age, Boolean isBoolean,
			AddressDI addressDI, StudentDI studentDI) {
		super();
		this.name = name;
		this.age = age;
		this.isBoolean = isBoolean;
		this.addressDI = addressDI;
		this.studentDI = studentDI;
	}

	@Override
	public String toString() {
		return "EmployeeDI [name=" + name + ", age=" + age + ", isBoolean="
				+ isBoolean + ", addressDI=" + addressDI + ", studentDI="
				+ studentDI + "]";
	}

	public void init() {
		logger.info("Employee DI Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("Employee DI Beans will destroy now....!!!");
	}

}
