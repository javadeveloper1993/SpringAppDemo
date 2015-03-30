package com.example.model.DI;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
public class QuestionDI {
	private static final Logger logger = Logger.getLogger(QuestionDI.class);
	private int id;
	private String name;
	private List<String> answers;
	private List<AnswerDI> answersList;

	public QuestionDI() {
		super();
	}

	public QuestionDI(int id, String name, List<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public QuestionDI(int id, String name, List<String> answers,
			List<AnswerDI> answersList) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
		this.answersList = answersList;
	}

	public void displayInfo() {
		logger.info("Question Id :" + id);
		logger.info("Question Name :" + name);
		logger.info("Answers are:");
		Iterator<String> itr = answers.iterator();
		while (itr.hasNext()) {
			logger.info(">>>>> : "+itr.next());
		}
	}

	public void displayInfoWithDIobject() {
		logger.info("Question Id :" + id);
		logger.info("Question Name :" + name);
		logger.info("Answers are:");
		Iterator<String> itr = answers.iterator();
		while (itr.hasNext()) {
			logger.info(itr.next());
		}
		Iterator<AnswerDI> iterator = answersList.iterator();
		while (iterator.hasNext()) {
			logger.info(iterator.next());
		}
	}

	public void init() {
		logger.info("QuestionDI Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("QuestionDI Beans will destroy now....!!!");
	}

}
