package com.example.model.Autowiring;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
public class AutoWiringModel {

	private static final Logger logger = Logger
			.getLogger(AutoWiringModel.class);

	private String name;
	private AutowiringDemo autowiringDemo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AutowiringDemo getAutowiringDemo() {
		return autowiringDemo;
	}

	public void setAutowiringDemo(AutowiringDemo autowiringDemo) {
		this.autowiringDemo = autowiringDemo;
	}

	@Override
	public String toString() {
		return "AutoWiringModel [name=" + name + ", autowiringDemo="
				+ autowiringDemo + "]";
	}

	public void init() {
		logger.info("AutoWiringModel Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("AutoWiringModel Beans will destroy now....!!!");
	}
}
