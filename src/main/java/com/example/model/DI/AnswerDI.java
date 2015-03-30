package com.example.model.DI;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
public class AnswerDI {
	private static final Logger logger = Logger.getLogger(AnswerDI.class);

	private int id;
	private String name;
	private String by;

	public AnswerDI() {
		super();
	}

	public AnswerDI(int id, String name, String by) {
		super();
		this.id = id;
		this.name = name;
		this.by = by;
	}

	public String toString() {
		return "Answer Id :" + id + " >>>>>  Answer Name :" + name
				+ " >>>>>  Answer Given By :" + by;
	}

	public void init() {
		logger.info("AnswerDI Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("AnswerDI Beans will destroy now....!!!");
	}

}
