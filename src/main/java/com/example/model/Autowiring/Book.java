package com.example.model.Autowiring;

import org.apache.log4j.Logger;

public class Book {
	private static final Logger logger = Logger.getLogger(Book.class);

	private String bookname;
	private int bookprice;

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getBookprice() {
		return bookprice;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", bookprice=" + bookprice + "]";
	}

	public void init() {
		logger.info("Book Beans is going through init....!!!");
	}

	public void destroye() {
		logger.info("Book Beans will destroy now....!!!");
	}
}
