package com.sathya.servlet;
//adv java
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginForm")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//url loginf.html
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step read the date from html form
		String username= request.getParameter("UserName");
		String password= request.getParameter("password");
		String status;
		//Step 2 process the data
		if (username.equals("azhar")&&password.equals("syedazhar.4321")) {
			status="Login Successful......";
		}
		else {
			status="Login Fail......";
		}
		//step 3 render response
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>Login Status.......<h1>"+status);
		writer.println("</html>");
	}

}
