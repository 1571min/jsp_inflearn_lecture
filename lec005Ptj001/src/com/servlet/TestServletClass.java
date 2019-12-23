package com.servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TSC")
public class TestServletClass extends HttpServlet {
	//httpservlet을 상속 받아 servlet 파일로서 이용이 가능하다

	
	//서블릿으로 요청되는 방식이 get방식일 때
	//사용자의 요청에 대한 정보를 가지고 있는  request(사용자의 정보나 속성을 지님) ,응답해야할 때는 response(서버의 데이터를 보내 줄떄)
	
	//servlet실행
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("--------doGet()-------");
		
	}

	//서블릿으로 요청되는 방식이 post방식일 때
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	@PostConstruct
	public void postConstructor() {
		System.out.println("postConstructor");
	}

	
	//서블릿이 생성되는 시점에 작업을 하고 싶을 때( 데이터 서버의 로그인 아이디 패스워드 변수에 담음)
	// 데이터베이스를 사용하고 자원해 재할때 -> destroy
	
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("--------init()-------");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
		System.out.println("--------destroy()-------");
	}


	@PreDestroy
	public void preDestroy() {
		System.out.println("PreDestroy");
	}
	
	
}
