package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FullNameDisplay")
public class FullNameDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//step 1 read the data from html form
	String first_name =	request.getParameter("FirstName");
	String middle_name =	request.getParameter("MiddleName");
	String last_name =	request.getParameter("LastName");
	String password=	request.getParameter("password");
	String status;
	//step 2 process the data
	if(first_name.equals("hello")&&middle_name.equals("hi")&&last_name.equals("ciao")&&password.equals("azhar")) {
		status =(first_name+middle_name+last_name);
	}
	else {
		status =("name or password is invalid ");
		status =("please check the user name and password and retry");
	}
	//step 3 render response to the client
	PrintWriter writer = response.getWriter();
	response.setContentType("text/html");
	writer.println("<html>");
	writer.println("<h1>full name is </h1>"+status);
	writer.println("</html>");
	}

}
