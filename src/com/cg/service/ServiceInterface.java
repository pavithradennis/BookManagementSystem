package com.cg.service;

import java.util.Collection;

import com.cg.model.Book;
import com.cg.model.Cart;

public interface ServiceInterface {

	public void addNewBook(int id);

	public void deleteBook(int id);

	Collection<Book> viewAllBooks();

	Collection<Cart> viewCart();

	public int getTotalQuantity();

	public double getTotalPrice();

}
