package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/seg")
public class ServletGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String connectedIp=(String)getServletContext().getAttribute("connectedIP");
		String connectedUser=(String)getServletContext().getAttribute("connectedUser");
		
		PrintWriter out=response.getWriter();
		out.print("<p>connectedIP Id: "+connectedIp+"</p>");
		out.print("<p>connectedUser Pw: "+connectedUser+"</p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
