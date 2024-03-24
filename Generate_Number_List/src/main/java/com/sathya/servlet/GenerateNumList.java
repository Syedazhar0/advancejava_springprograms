package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//adv java
@WebServlet("/GenerateNumList")
public class GenerateNumList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step 1:read the requested data form the html form.
				int first=Integer.parseInt(request.getParameter("first"));
			int second=Integer.parseInt(request.getParameter("second"));
			String operation=request.getParameter("operation");
			
			// step:2 process the data
			int i,j=0;
			int count=0,count1=0,sum=0,temp=0,sum1=0;
			
			PrintWriter writer= response.getWriter();
			response.setContentType("text/html");
			writer.println("<html>");
			writer.println("<head>");
			writer.println("<body bgcolor='bisque'>");
			writer.println("<h1>Gemerate Number List</h1>");
			writer.println("<p>first number is: </p>"+first);
			writer.println("<p>second number is: </p>"+second);
			writer.println("<p>operator symbol is : </p>"+operation);
			switch (operation) {
			case "Even" :  writer.print("<p>EVEN NUMBERS ARE:</p>");
				for(i=first;i<=second;i++) {
				                       if (i%2==0) {
				       // step:3 render the response	 
				                    	   writer.print(i+" ");
									}
			                        }
				           break;
			case "Odd" : writer.println("<p>ODD NUMBERS ARE:</p>");
				for(i=first;i<=second;i++) {
                if (i%2!=0) {
                	  // step:3 render the response	 
             	   writer.print(i+" ");
				}
             }
		       break;
			
			case "Prime" : writer.println("<p>PRIME NUMBERS ARE:</p>");
				for(i=first;i<=second;i++) {
                                    count=0;
                                    for(j=1;j<=i;j++) {
                                    	if(i%j==0) {
                                    		count++;
                                    }      
                                    }
                                    if(count==2) {
                                    	 // step:3 render the response	 
                                  	   writer.print(i+" ");
                                    }
                                  }
		                   break;
			
			case "Perfect" : writer.println("<p>PERFECT NUMBERS ARE:</p>");
				for(i=first;i<=second;i++) {
				                         int fact=1, k=i; sum1=0;
				                         while(fact<k) {
				                        if (k%fact==0) 
											sum1=sum1+fact;
											fact++;
			                            }
				                         if (sum1==i) {
				                        	  // step:3 render the response	 
					                    	   writer.print(i+" ");
										}
			                          }
		                  break;
		               
			case "Strong" : writer.println("<p>STRONG NUMBERS ARE:</p>");
		
			 for(i=first;i<=second;i++) {
		           int n1=i,sum2=0;
		            while(n1>0) {
		                int fact1=1;
		                int digit1=n1%10;

		                for( j=1; j<=digit1;j++) {
		                    fact1=fact1*j;
		                }
		                sum2=sum2+fact1;
		                n1=n1/10;
		            }
		            if (sum2==i) {
		                // step:3 render the response
		                writer.println(i);
		            }

		        }
		                   break;
		                   
			case "Armstrong" : writer.println("<p>ARMSTRONG NUMBERS ARE:</p>");
				for(i=first;i<=second;i++) {
                                                    sum=0;
                                                   count1=0;
                                                   temp=i;
                                                   
                                                   while(temp>0) {
                                                	   count1++;
                                                	   temp=temp/10;
                                                   }
                                                   temp=i;
                                                   while(temp>0) {
                                                	   int digit=temp%10;
                                                	   sum=(int) (sum+Math.pow(digit , count1));
                                                	   temp=temp/10;
                                                   }
                                                   if (i==sum) {
                                                	   // step:3 render the response	 
            				                    	   writer.print(i+" ");
												}
                                             }
                         break;

			default:
				System.out.println("invalid Number");
				break;
			}
			writer.println("<body>");
			writer.println("<html>");
//			
	}

}
