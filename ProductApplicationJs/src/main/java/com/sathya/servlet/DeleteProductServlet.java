package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int proid = Integer.parseInt(request.getParameter("proid"));
		
		ProductjsDao productjsDao = new ProductjsDao();
		int result =productjsDao.deletebyId(proid);
		
		if (result==1) {
			request.setAttribute("deleteRequest", result);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Productjs.jsp");
			dispatcher.forward(request, response);
		}else {
			request.setAttribute("deleteRequest", result);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Productjs.jsp");
			dispatcher.include(request, response);
		}
	}
}