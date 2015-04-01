package com.example.model.Autowiring.Annotation;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author Maulik
 * 
 */
public class CategoriesAnnotation {
	private static final Logger logger = Logger
			.getLogger(CategoriesAnnotation.class);

	@Autowired
	@Qualifier("stringAutowinring")
	private String name;
	@Autowired
	private Integer no;
	private BookAnnotation bk;

	// @Autowired
	// public CategoriesAnnotation(BookAnnotation bk) {
	// logger.info("In Constructor Method");
	// this.bk = bk;
	// }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BookAnnotation getBk() {
		return bk;
	}

	@Qualifier("bookMainDemo1")
	@Autowired
	public void setBk(BookAnnotation bk) {
		this.bk = bk;
	}

	public int getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "CategoriesAnnotation [name=" + name + ", no=" + no + ", bk="
				+ bk + "]";
	}

	public void init() {
		logger.info("Categories Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("Categories Beans will destroy now....!!!");
	}

}
