package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// ADV JAVA COOKIES
@WebServlet("/FIRSTSERVLET1")
public class FIRSTSERVLET1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//  get the data 
	String username = request.getParameter("username");
	// do not create int data type for age cuz cookie doesn't support use string
	String age = request.getParameter("age");
	
	// create the cookies object
	Cookie c1= new Cookie("username", username);
	Cookie c2= new Cookie("age", age);
	
	// add the cookies into response object
	
	response.addCookie(c1);
	response.addCookie(c2);

	// create request dispatcher
	
			RequestDispatcher dispatcher=request.getRequestDispatcher("form5.html");
	        dispatcher.forward(request, response);
	}
}
