package com.sathya.servlet;
//ADVANCE JAVA APPLICARION 2
import java.awt.Color;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.w3c.dom.Text;
// go to project HWA2 src SELECT WEB.XML OPEN AND  SELECT SOURCE FROM 
//BELOW AND 
// DELETE THE SERVELET ALL TAGS AND COME BACK TO PROJECT AND ADD 
// @WEBSERVLET("/HELLO")// OR ANAY OTHER NAME THIS IS NOTHING BUT URL
// U CAN CHANGE URL FROM HERE THE 10 LINES OF SERVLET TAG  OR XMLCODE 
//CAN BE 
// DONE BY SINGLE LINE ANNOTATION WHICH IS @WEBSERVLET("/HELLO")
@WebServlet("/HELLO")
public class HelloWorldApp0 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<body></body>");
		writer.println("<style>");
		writer.println("body{background-color:black}H3{color:blue;font-size:50px;background-color:orange;text-align:center;font-style:italic;font-family:algerian}H1{color:orange;font-size:50px;text-align:center;background-color:blue;font-style:italic;font-family:algerian}H4{color:green;font-size:50px;text-align:center;font-style:italic;font-family:algerian;background-color:pink}");
		writer.println("</style>");
		
		writer.println("<H1>welcome to servlet second application</H1>");
		writer.println("<H3>welcome to advance java</H3>");
		writer.println("<H4>comment-vastu</H4>");
		writer.println("<html>");
	}
}
