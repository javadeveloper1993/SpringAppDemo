package com.example.model;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
public class HelloIndia {

	private static final Logger logger = Logger.getLogger(HelloIndia.class);

	private String message1;
	private String message2;
	private String message3;

	public void setMessage1(String message) {
		this.message1 = message;
	}

	public void setMessage2(String message) {
		this.message2 = message;
	}

	public void setMessage3(String message) {
		this.message3 = message;
	}

	public void getMessage1() {
		logger.info("India Message1 : " + message1);
	}

	public void getMessage2() {
		logger.info("India Message2 : " + message2);
	}

	public void getMessage3() {
		logger.info("India Message3 : " + message3);
	}

	@Override
	public String toString() {
		return "HelloIndia [message1=" + message1 + ", message2=" + message2
				+ ", message3=" + message3 + "]";
	}
	
	public void init() {
		logger.info("HelloIndia Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("HelloIndia Beans will destroy now....!!!");
	}

}
