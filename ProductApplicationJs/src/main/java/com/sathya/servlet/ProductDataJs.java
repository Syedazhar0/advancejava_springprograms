package com.sathya.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.commons.io.IOUtils;

@WebServlet("/ProductDataJs")
@MultipartConfig
public class ProductDataJs extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        try {
            // Read the data
            int proid = Integer.parseInt(request.getParameter("proid"));
            String pname = request.getParameter("pname");
            double pprice = Double.parseDouble(request.getParameter("pprice"));
            String pbrand = request.getParameter("pbrand");
            String pMadeIn = request.getParameter("pMadeIn");
            Date pmfd = Date.valueOf(request.getParameter("pmfd"));
            Date pexpdate = Date.valueOf(request.getParameter("pexpdate"));
            
            Part part = request.getPart("pimage");
            InputStream pimageStream = part.getInputStream();
            byte[] pimage = IOUtils.toByteArray(pimageStream);
            IOUtils.closeQuietly(pimageStream); // Close the InputStream
            
            Part part1 = request.getPart("proAudio");
            InputStream proAudio = part1.getInputStream();
            byte[] Audio = IOUtils.toByteArray(proAudio);
            IOUtils.closeQuietly(proAudio); // Close the InputStream
            
            Part part2 = request.getPart("proVideo");
            InputStream proVideo = part2.getInputStream();
            byte[] video = IOUtils.toByteArray(proVideo);
            IOUtils.closeQuietly(proAudio); // Close the InputStream
            
            // Create the product object
            Productjs productjs = new Productjs();
            productjs.setProid(proid);
            productjs.setPname(pname);
            productjs.setPprice(pprice);
            productjs.setPbrand(pbrand);
            productjs.setpMadeIn(pMadeIn);
            productjs.setPmfd(pmfd);
            productjs.setPexpdate(pexpdate);
            productjs.setPimage(pimage);
            productjs.setProAudio(Audio);
            productjs.setProVideo(video);

            // Save the product data
            ProductjsDao productjsDao = new ProductjsDao();
            int result = productjsDao.save(productjs);
            if (result==1) {
            	//send the data to jsp file and the data into request  object
            	request.setAttribute("saveResult", result);
				RequestDispatcher rDispatcher =request.getRequestDispatcher("Productjs.jsp");
				rDispatcher .forward(request, response);
			}else {
				response.setContentType("text/html");
				writer.print("data insertion fail please check once....."+result);
				RequestDispatcher rDispatcher =request.getRequestDispatcher("ProductData.html");
				rDispatcher .include(request, response);
				
			}
        } catch (NumberFormatException | SQLException e) {
            writer.print("Error: " + e.getMessage());
            e.printStackTrace(); // Log the exception for further investigation
        } finally {
            writer.close();
        }
        
    }
}