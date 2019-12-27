package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/loginCon")
public class LoginCon extends HttpServlet {

       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String mID=request.getParameter("mID");
		String mPW=request.getParameter("mPW");
		
		out.print("m ID: "+mID);
		out.print("m PW: "+mPW);
		
		HttpSession session=request.getSession();
		session.setAttribute("memberId", mID);
		
		response.sendRedirect("loginOk.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
