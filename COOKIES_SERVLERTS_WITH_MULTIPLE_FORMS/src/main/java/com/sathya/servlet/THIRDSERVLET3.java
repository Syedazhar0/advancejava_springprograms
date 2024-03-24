package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/THIRDSERVLET3")
public class THIRDSERVLET3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//  get the data 
			String email = request.getParameter("email");
			// do not create int data type for age cuz cookie doesn't support use string
			String mobile = request.getParameter("mobile");
			
			// create cookies array to get the cookies data 
			Cookie [ ] cookies =request.getCookies();
			
			// create response 
			
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.println("<html>");
			writer.println("<head>");
			writer.println("<style>body{background-color:black; color:red;text-align:center; font-family:algerian;}</style>");
			writer.println("</head>");
			writer.println("<body>");
			writer.println("<p>USERNAME  :</p>"+cookies[0].getValue());
			writer.println("<p>AGE  :</p>"+cookies[1].getValue());
			writer.println("<p>QUALIFICATION :</p>"+cookies[2].getValue());
			writer.println("<p>DESIGNATION  :</p>"+cookies[3].getValue());
			writer.println("<p>EMAIL  :</p>"+email);
			writer.println("<p>MOBILE  :</p>"+mobile);
			writer.println("</body>");
			writer.println("</html>");
}
}
