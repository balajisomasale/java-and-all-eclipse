package com.cognizant.constructor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class serv1 extends HttpServlet {
	
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	ServletConfig config=this.getServletConfig();
	String s=config.getInitParameter("uname");
	PrintWriter pw=response.getWriter();
	pw.println("Username is "+s);
	
	ServletContext context=this.getServletContext();
	String s1=context.getInitParameter("name");
	pw.println("Company Name is :"+s1);
	
	
	}

}
