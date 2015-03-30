package com.example.model.DI;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
public class UserDI {

	private static final Logger logger = Logger.getLogger(UserDI.class);
	private int id;
	private String name, email;

	public UserDI() {
		super();
	}

	public UserDI(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String toString() {
		return "User Id :" + id + " >>>>>  User Name :" + name
				+ " >>>>>  User Email :" + email;
	}

	public void init() {
		logger.info("UserDI Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("UserDI Beans will destroy now....!!!");
	}

}
