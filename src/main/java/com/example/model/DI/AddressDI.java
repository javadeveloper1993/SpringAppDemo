package com.example.model.DI;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
public class AddressDI {

	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(AddressDI.class);

	private String city;
	private String state;
	private String country;

	public AddressDI(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "[city=" + city + ", state=" + state + ", country="
				+ country + "]";
	}

}
