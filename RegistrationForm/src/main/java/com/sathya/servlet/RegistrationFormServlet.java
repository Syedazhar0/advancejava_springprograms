package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
//adv java
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationFormServlet")
public class RegistrationFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//step 1: read the data from request object
		String name = request.getParameter("user name");
		String password = request.getParameter("password");
		long mobile = Long.parseLong( request.getParameter("mobile"));
		String email = request.getParameter("email");
		String gender = request.getParameter("Gender");
		String [ ] qualification = request.getParameterValues("Qualification");
		String dob = request.getParameter("DOB");
		String country = request.getParameter("country");
		String [ ]languages = request.getParameterValues("Languages_known");
		String comment = request.getParameter("Comments");
		
		// step 2: process the data
		String qual= String.join(",", qualification);
		String lang= String.join("-", languages);
		
		//step 3: render the response
		
		PrintWriter writer = response.getWriter()	;
	    response.setContentType("text/html");
	   writer.println("<html>");
	   writer.println("<body>");
	   writer.println("your name      :"+name+"<br>");
	   writer.println("password      :"+password+"<br");
	   writer.println("mobile number      :"+mobile+"<br>");
	   writer.println("email id      :"+email+"<br>");
	   writer.println("gender      :"+gender+"<br>");
	   writer.println("qualification      :"+qual+"<br>");
	   writer.println("date of birth      :"+dob+"<br>");
	   writer.println("country      :"+country+"<br>");
	   writer.println("languages known      :"+lang+"<br>");
	   writer.println("your comments      :"+comment+"<br>");
	   writer.println("</body>");
	   writer.println("</html>");
	}
}
