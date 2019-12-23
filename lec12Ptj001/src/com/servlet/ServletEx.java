package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletEx")
public class ServletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String adminId=getServletConfig().getInitParameter("adminId");
		String adminPw=getServletConfig().getInitParameter("adminPw");
		
		String imgDir=getServletContext().getInitParameter("imgDir");
		String testSeverIP=getServletContext().getInitParameter("testSeverIP");
		String realSeverIP=getServletContext().getInitParameter("realSeverIP");
		
		PrintWriter out=response.getWriter();
		out.print("<p>admin Id: "+adminId+"</p>");
		out.print("<p>admin Pw: "+adminPw+"</p>");
		
		out.print("<p>imgDir Id: "+imgDir+"</p>");
		out.print("<p>testSeverIP Pw: "+testSeverIP+"</p>");
		out.print("<p>realSeverIP Id: "+realSeverIP+"</p>");
		
		
		getServletContext().setAttribute("connectedIP", "165.62.58.33");
		getServletContext().setAttribute("connectedUser", "gildong");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
