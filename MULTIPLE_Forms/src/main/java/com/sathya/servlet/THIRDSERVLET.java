package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/THIRDSERVLET")
public class THIRDSERVLET extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// set the data
		String email = request.getParameter("email");
		String  mobile = request.getParameter("mobile");
		// create  session
		HttpSession session=request.getSession();
		// create response 
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<style> body{color:blue; background-color:black; font-family:algerian; text-align:center;}</style>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<pre>USERNAME :</pre>"+session.getAttribute("username"));
		writer.println("<pre>AGE :</pre>"+session.getAttribute("age"));
		writer.println("<pre>QUALIFICATION :</pre>"+session.getAttribute("qualification"));
		writer.println("<pre>DESIGNATION :</pre>"+session.getAttribute("designation"));
		writer.println("<pre>EMAIL ID :</pre>"+email);
		writer.println("<pre>MOBILE :</pre>"+mobile);
		writer.println("</body>");
		writer.println("</html>");}}
