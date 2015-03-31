package com.example.model.Autowiring;

import org.apache.log4j.Logger;

/**
 * @author Maulik
 * 
 */
public class CategoriesConstrucor {
	private static final Logger logger = Logger
			.getLogger(CategoriesConstrucor.class);

	private String name;
	private Book bk;

	public CategoriesConstrucor(Book bk) {
		super();
		this.bk = bk;
	}

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
		return "Categories Construcor [name=" + name + ", bk=" + bk + "]";
	}

	public void init() {
		logger.info("CategoriesConstrucor Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("CategoriesConstrucor Beans will destroy now....!!!");
	}

}
