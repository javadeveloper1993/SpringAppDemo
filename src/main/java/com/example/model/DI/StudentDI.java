package com.example.model.DI;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
/**
 * @author Maulik
 *
 */
/**
 * @author Maulik
 * 
 */
public class StudentDI {
	private static final Logger logger = Logger.getLogger(StudentDI.class);
	private String stuId;
	private String stuName;
	private String stuAddress;

	public StudentDI(String stuId, String stuName, String stuAddress) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
	}

	@Override
	public String toString() {
		return "[stuId=" + stuId + ", stuName=" + stuName + ", stuAddress="
				+ stuAddress + "]";
	}

	public void init() {
		logger.info("Student Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("Student Beans will destroy now....!!!");
	}
}
