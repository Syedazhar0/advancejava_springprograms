package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step 1 read the data from the html form
		int eid = Integer.parseInt(request.getParameter("empid"));
		String name = request.getParameter("empname");
		double basicsal = Double.parseDouble(request.getParameter("salary"));
		// step 2 process  the data 
		double GrossSal;
		double hra ;
		double da ;
		double pf ;
		if (basicsal>=50000) {
			hra=(basicsal*30/100);
			da=(basicsal*10/100);
			pf=(basicsal*6/100);
			GrossSal=(basicsal+hra+da)-pf;
		}else if (basicsal<50000&&basicsal>25000) {
			hra=(basicsal*20/100);
			da=(basicsal*5/100);
			pf=(basicsal*3/100);
			GrossSal=(basicsal+hra+da)-pf;
		}else {
			hra=(basicsal*10/100);
			da=(basicsal*3/100);
			pf=(basicsal*2/100);
			GrossSal=(basicsal+hra+da)-pf;
		}
		// step 3 render the response
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.print("<html>");
		writer.print("<head>");
		writer.print("<style>");
		writer.print("body{border:5px solid bisque;background-color:black;text-align:center}"
				+ "h1{color:red;"
		+ "font-family:algerian;font-style:italic;text-decoration:underline}"
		+ "p{color:blue;font-family:algerian;"
		+ "font-style:italic;width:1040px;height:0px;display:block}"
		+ "*{color:red;font-family:algerian;font-style:italic}");
		writer.print("</style>");
		writer.print("</head>");
		writer.print("<body>");
		writer.println("<h1>Employee Details</h1>");
		writer.println("<P>Employee ID :</P>"+eid);
		writer.println("<P>Employee Name :</P>"+name);
		writer.println("<P>Employee Basic_Salary :</P>"+basicsal );
		writer.println("<P>HRA Amount :</P>"+hra );
		writer.println("<P>DA Amount  :</P>"+da);
		writer.println("<P>PF  Amount :</P>"+pf);
		writer.println("<P>Gross Salary :</P>"+GrossSal);
		writer.print("</body");
		writer.print("</html>");
	}

}
