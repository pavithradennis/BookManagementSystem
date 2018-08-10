package com.cg.controller;

import java.util.Collection;

import com.cg.model.Book;
import com.cg.model.Cart;
import com.cg.service.ServiceImplementation;

public class ControllerImplementation implements ControllerInterface {

	private ServiceImplementation service = new ServiceImplementation();
	
	@Override
	public void addNewBook(int id) {
		service.addNewBook(id);
		
	}

	@Override
	public void deleteBook(int id) {
		service.deleteBook(id);
		
	}

	@Override
	public Collection<Book> viewAllBooks() {
		
		return service.viewAllBooks();
	}

	@Override
	public Collection<Cart> viewCart() {
		
		return service.viewCart();
	}

	@Override
	public int getTotalQuantity() {
		
		return service.getTotalQuantity();
	}

	@Override
	public double getTotalPrice() {
		
		return service.getTotalPrice();
	}

	
}
