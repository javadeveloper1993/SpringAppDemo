package com.example.model.Autowiring;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
public class AutowiringDemo {

	private static final Logger logger = Logger.getLogger(AutowiringDemo.class);

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "AutowiringDemo [id=" + id + "]";
	}

	public void init() {
		logger.info("AutowiringDemo Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("AutowiringDemo Beans will destroy now....!!!");
	}
}
