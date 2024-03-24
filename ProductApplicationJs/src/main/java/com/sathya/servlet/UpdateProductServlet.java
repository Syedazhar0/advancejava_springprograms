package com.sathya.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

@WebServlet("/UpdateProductServlet")
@MultipartConfig
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int proid =Integer.parseInt( request.getParameter("proid"));
         String pname = request.getParameter("pname");
         double pprice =Double.parseDouble(request.getParameter("pprice"));
         String pbrand = request.getParameter("pbrand");
         String pMadeIn = request.getParameter("pMadeIn");
         Date pmfd = Date.valueOf(request.getParameter("pmfd"));
         Date pexpdate = Date.valueOf(request.getParameter("pexpdate"));
       
         // Create the product object
         Productjs productjs = new Productjs();
         productjs.setProid(proid);
         productjs.setPname(pname);
         productjs.setPprice(pprice);
         productjs.setPbrand(pbrand);
         productjs.setpMadeIn(pMadeIn);
         productjs.setPmfd(pmfd);
         productjs.setPexpdate(pexpdate);
         
         Part part = request.getPart("New_Image");// for new image
                 if (part != null && part.getSize()>0) {
                	 InputStream pimage = part.getInputStream();
                	 byte[] New_Image_Data = IOUtils.toByteArray(pimage);
                	 productjs.setPimage(New_Image_Data);
                     IOUtils.closeQuietly(pimage); // Close the InputStream
               
		}else {
			Part part1 = request.getPart("pimage");
			 InputStream inputStream = part1.getInputStream();
        	 byte[] pimage = IOUtils.toByteArray(inputStream);
        	 productjs.setPimage(pimage);
             IOUtils.closeQuietly(inputStream); // Close the InputStream
		}
                 ProductjsDao productjsDao = new ProductjsDao();
         		int result  = productjsDao.UpdateById(productjs);
         		if (result ==1) {
         			RequestDispatcher dispatcher=request.getRequestDispatcher("Productjs.jsp");
        		dispatcher.forward(request, response);
        		
				}else {
					response.setContentType("text/html");
					PrintWriter writer = response.getWriter();
					response.setContentType("text/html");
					writer.print("data insertion fail please check once....."+result);
					RequestDispatcher rDispatcher =request.getRequestDispatcher("ProductData.html");
					rDispatcher .include(request, response);
				}
	}

}
