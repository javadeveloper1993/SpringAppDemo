package com.example.model;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
public class TextEditor {
	private static final Logger logger = Logger.getLogger(TextEditor.class);

	private SpellChecker spellChecker;

	// A setter method to inject the dependency.
	public void setSpellChecker(SpellChecker spellChecker) {
		logger.info("Inside setSpellChecker.");
		this.spellChecker = spellChecker;
	}

	// A getter method to return spellChecker
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void init() {
		logger.info("TextEditor Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("TextEditor Beans will destroy now....!!!");
	}
}
