package com.example.model;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
public class HelloWorld {

	private static final Logger logger = Logger.getLogger(HelloWorld.class);

	private String message1;
	private String message2;

	public void setMessage1(String message) {
		this.message1 = message;
	}

	public void setMessage2(String message) {
		this.message2 = message;
	}

	public void getMessage1() {
		logger.info("World  Message1 : " + message1);
	}

	public void getMessage2() {
		logger.info("World  Message2 : " + message2);
	}

	@Override
	public String toString() {
		return "HelloWorld [message1=" + message1 + ", message2=" + message2
				+ "]";
	}

	public void init() {
		logger.info("HelloWorld Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("HelloWorld Beans will destroy now....!!!");
	}
}
