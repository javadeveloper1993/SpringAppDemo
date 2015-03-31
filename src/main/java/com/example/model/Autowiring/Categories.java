package com.example.model.Autowiring;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
public class Categories {
	private static final Logger logger = Logger.getLogger(Categories.class);

	private String name;
	private Book bk;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBk() {
		return bk;
	}

	public void setBk(Book bk) {
		this.bk = bk;
	}

	@Override
	public String toString() {
		return "Categories [name=" + name + ", bk=" + bk + "]";
	}

	public void init() {
		logger.info("Categories Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("Categories Beans will destroy now....!!!");
	}

}
