package com.cg.model;

public class Cart {

	int quantity;
	Book book;

	public Cart(int quantity, Book book) {
		super();
		this.quantity = quantity;
		this.book = book;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Book getBook() {
		return book;
	}

}
