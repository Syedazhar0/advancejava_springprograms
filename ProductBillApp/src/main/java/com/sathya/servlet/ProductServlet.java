package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//adv java 
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step 1 read the requested data from client or html form
		int proid =Integer.parseInt(request.getParameter("productid"));
		String name =request.getParameter("productName");
		double price =Double.parseDouble( request.getParameter("productPrice"));
		double qty =Double.parseDouble( request.getParameter("productQty"));
		//step 2 process the data
		String status;
		double netamt;
		double dis=0;
		double totalbill=(price*qty);
		if(totalbill<=1000) {
			status="sorry no discount";
			netamt=totalbill;
		}else if(totalbill>1000&&totalbill<5000) {
			dis=(totalbill*5/100);
		}else if(totalbill>5000&&totalbill<10000) {
			dis=(totalbill*10/100);
		}else {
			dis=(totalbill*15/100);
		}
		 netamt=totalbill-dis;
		//step 3 render the response
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		 writer.print("<html>");
		 writer.print("<head>");
		 writer.print("<style>");
		 writer.print("body{background-color:black}h1{color:orange}label{color:blue}*{color:red}");
		 writer.print("</style>");
		 writer.print("<body >");
		 writer.print("<h1>product bill :</h1>");
		 writer.println("<label>product Id :</label>"+proid +" "+"<br>"+"<br>");
		 writer.println("<label>product  Name :</label>"+name+"<br>"+"<br>");
		 writer.println("<label>product  Price :</label>"+price+" <br>" +"<br>");
		 writer.println("<label>product  Quantity :</label>"+qty+"<br>" +"<br>");
		 writer.println("<label>Total Bill Amounts :</label>"+totalbill+"<br>"+"<br>");
		 writer.println("<label>Discount :</label>"+dis+"<br>"+"<br>");
		 writer.println("<label>NetAmount :</label>"+netamt+"<br>"+"<br>");
		 writer.print("</head>");
		 writer.print("</body>");
		 writer.print("</html>");
	}
	}
