package com.cg.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.model.Book;
import com.cg.model.Cart;

public class ServiceImplementation implements ServiceInterface {

	private static Map<Integer, Book> book1 = new HashMap<Integer, Book>();
	private static Map<Integer, Cart> cart = new HashMap<Integer, Cart>();

	private static Book b1 = new Book(1, " Alchemist", "Paulo Coehlo", "Philosophy", 400);
	private static Book b2 = new Book(2, " All your perfects", "Colleen Hoover", "Romance", 499);
	private static Book b3 = new Book(3, " Twilight trilogy", "Stephanie Meyers", "Drama/Fiction", 999);
	private static Book b4 = new Book(4, " Walk to Remember", "Nicholas Sparks", "Romance", 450);
	private static Book b5 = new Book(5, "Harry Potter Series", "JK Rowling", "Children Fiction", 2350);

	static {
		book1.put(b1.getId(), b1);
		book1.put(b2.getId(), b2);
		book1.put(b3.getId(), b3);
		book1.put(b4.getId(), b4);
		book1.put(b5.getId(), b5);
	}

	@Override
	public void addNewBook(int id) {
		if (cart.get(id) == null) {
			for (Book book : viewAllBooks()) {
				Cart c = new Cart(1, book);
				cart.put(id, c);
			}
		} else {
			Cart c = cart.get(id);
			c.setQuantity(c.getQuantity() + 1);
		}

	}

	@Override
	public void deleteBook(int id) {
		for (Cart c : viewCart()) {
			if (c.getBook().getId() == id) {
				if (c.getQuantity() > 1) {
					c.setQuantity(c.getQuantity() - 1);
					break;
				} else {
					cart.remove(id);
					break;
				}
			}
		}

	}

	@Override
	public Collection<Book> viewAllBooks() {

		return book1.values();
	}

	@Override
	public Collection<Cart> viewCart() {

		return cart.values();
	}

	@Override
	public int getTotalQuantity() {
		int totalQuantity = 0;
		for (Cart c : viewCart()) {
			totalQuantity += c.getQuantity();

		}
		return totalQuantity;
	}

	@Override
	public double getTotalPrice() {
		int totalPrice = 0;
		for (Cart c : viewCart()) {
			totalPrice += (c.getQuantity()) * (c.getBook().getBookPrice());
		}
		return totalPrice;
	}

}
