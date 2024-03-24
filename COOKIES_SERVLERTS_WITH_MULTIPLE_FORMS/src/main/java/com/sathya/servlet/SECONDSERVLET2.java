package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SECONDSERVLET2")
public class SECONDSERVLET2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//  get the data 
		String qualification = request.getParameter("qualification");
		// do not create int data type for age cuz cookie doesn't support use string
		String designation = request.getParameter("designation");
		
		// create the cookies object
		Cookie c3= new Cookie("qualification", qualification);
		Cookie c4= new Cookie("designation", designation);
		
		// add the cookies into response object
		
		response.addCookie(c3);
		response.addCookie(c4);
		// create request dispatcher
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("form6.html");
		dispatcher.forward(request, response);
	}

}
