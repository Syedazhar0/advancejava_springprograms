package com.sathya.servlet;
//ADVANCE JAVA APPLICARION 1
import java.io.IOException;
import java.io.PrintWriter;
// IF U FOGOT URL THEN  SELECT PROJECT AND OPEN SRC FOLDER AND FIND WEB.XML FILE OPEN
// FIND PATTERN TAG AND THERE YOU GO
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldApp1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("welcome to sathyatech");
		writer.println("welcome to advance java");
		writer.println("hello world");
	}

}
