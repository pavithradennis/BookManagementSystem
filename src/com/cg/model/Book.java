package com.cg.model;

public class Book {

	private int id;
	private String bookName;
	private String bookAuthor;
	private String bookDescription;
	private int bookPrice;

	public Book() {
		super();
	}

	public Book(int id, String bookName, String bookAuthor, String bookDescription, int bookPrice) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookDescription = bookDescription;
		this.bookPrice = bookPrice;
	}

	public int getId() {
		return id;
	}

	public String getBookName() {
		return bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookDescription="
				+ bookDescription + ", bookPrice=" + bookPrice + "]";
	}

}
