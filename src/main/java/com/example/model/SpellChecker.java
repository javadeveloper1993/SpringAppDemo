package com.example.model;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
public class SpellChecker {
	private static final Logger logger = Logger.getLogger(SpellChecker.class);

	public SpellChecker() {
//		logger.info("Inside SpellChecker constructor.");
	}

	public void checkSpelling() {
		logger.info("Inside checkSpelling.");
	}

	public void init() {
		logger.info("SpellChecker Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("SpellChecker Beans will destroy now....!!!");
	}
}
