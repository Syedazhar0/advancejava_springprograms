package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletFirstApprochImplement5methods implements Servlet {

	public void init(ServletConfig config) throws ServletException {
		
	}

	public void destroy() {
		
	}
	public ServletConfig getServletConfig() {
		
		return null;
	}
	public String getServletInfo() {
	
		return null; 
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>this is first approch servlet application</h1>");
		writer.println("</html>");
	}
}
