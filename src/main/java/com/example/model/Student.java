package com.example.model;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
public class Student {
	private static final Logger logger = Logger.getLogger(Student.class);
	private String stuId;
	private String name;
	private int age;
	private String address;

	/**
	 * @return the stuId
	 */
	public String getStuId() {
		return stuId;
	}

	/**
	 * @param stuId
	 *            the stuId to set
	 */
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + ", age=" + age
				+ ", address=" + address + "]";
	}

	public void init() {
		logger.info("Student Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("Student Beans will destroy now....!!!");
	}
}
