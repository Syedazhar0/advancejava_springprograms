package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//step 1:read the requested data form the html form.
		int first=Integer.parseInt(request.getParameter("first"));
	int second=Integer.parseInt(request.getParameter("second"));
	String operation=request.getParameter("operation");
	
	// step:2 process the data
	double result=0;
	switch (operation) {
	case "+" :  result=first+second;
		           break;
	case "-" :  result=first-second;
                   break;
	
	case "*" : result=first*second;
                   break;
	
	case "/" :  result=first/second;
                  break;
	
	case "%" : result=first%second;
                   break;

	default:
		System.out.println("invalid operator");
		break;
	}
	
	// step:3 render the response
	PrintWriter writer= response.getWriter();
	response.setContentType("text/html");
	writer.println("<html>");
	writer.println("<head>");
	writer.println("<body bgcolor='bisque'>");
	writer.println("<h1>Calculation Result</h1>");
	writer.println("<p>first number is: </p>"+first);
	writer.println("<p>first number is: </p>"+second);
	writer.println("<p>operator symbol is : </p>"+operation);
	writer.println("<p>your result is :</p>"+result);
	writer.println("<body>");
	writer.println("<html>");
	
	}


}
