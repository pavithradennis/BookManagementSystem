package com.cg.controllerservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.controller.ControllerImplementation;
import com.cg.controller.ControllerInterface;


@WebServlet("*.app")
public class Controller extends HttpServlet {
	private ControllerInterface serv = new ControllerImplementation();
	private static final long serialVersionUID = 1L;
       
    
    public Controller() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String action = request.getServletPath();
		System.out.println(action);
		switch(action)
		{
		case "/addToCart.app":
			int id = Integer.parseInt(request.getParameter("id"));
			serv.addNewBook(id);
			session.setAttribute("cart", serv.viewCart());
			session.setAttribute("totalQuan", serv.getTotalQuantity() );
			session.setAttribute("totalPri", serv.getTotalPrice());
			
			System.out.println(serv.getTotalQuantity());
			response.sendRedirect("home.jsp");
			break;
			
		case "/viewCart.app":
			session = request.getSession();
			session.setAttribute("cart", serv.viewCart());
			session.setAttribute("totalQuan", serv.getTotalQuantity() );
			session.setAttribute("totalPri", serv.getTotalPrice());
			
			System.out.println(serv.getTotalQuantity());
			response.sendRedirect("cart.jsp");
			break;
			
		case "/viewAllBooks.app":
			session = request.getSession();
			session.setAttribute("book", serv.viewAllBooks());
			session.setAttribute("totalQuan", serv.getTotalQuantity());
			response.sendRedirect("home.jsp");
			break;
			
		case "/delete.app":
			id = Integer.parseInt(request.getParameter("id"));
			serv.deleteBook(id);
			response.sendRedirect("viewCart.app");
			break;
	
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
