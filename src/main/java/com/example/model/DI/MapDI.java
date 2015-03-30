package com.example.model.DI;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
public class MapDI {
	private static final Logger logger = Logger.getLogger(MapDI.class);

	private int id;
	private String name;
	private Map<AnswerDI, UserDI> answers;

	public MapDI() {
		super();
	}

	public MapDI(int id, String name, Map<AnswerDI, UserDI> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		logger.info(">>>>>  Question Id :" + id);
		logger.info(">>>>>  Question Name :" + name);
		logger.info(">>>>>  Answers :::");
		for (Entry<AnswerDI, UserDI> entry : answers.entrySet()) {
			logger.info(">>>>> Answer Information :" + entry.getKey());
			logger.info(">>>>> Posted By :" + entry.getValue());
		}

	}
	
	
	public void init() {
		logger.info("MapDI Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("MapDI Beans will destroy now....!!!");
	}
}
