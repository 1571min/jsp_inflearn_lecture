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
	//httpservlet�� ��� �޾� servlet ���Ϸμ� �̿��� �����ϴ�

	
	//�������� ��û�Ǵ� ����� get����� ��
	//������� ��û�� ���� ������ ������ �ִ�  request(������� ������ �Ӽ��� ����) ,�����ؾ��� ���� response(������ �����͸� ���� �ً�)
	
	//servlet����
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("--------doGet()-------");
		
	}

	//�������� ��û�Ǵ� ����� post����� ��
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	@PostConstruct
	public void postConstructor() {
		System.out.println("postConstructor");
	}

	
	//������ �����Ǵ� ������ �۾��� �ϰ� ���� ��( ������ ������ �α��� ���̵� �н����� ������ ����)
	// �����ͺ��̽��� ����ϰ� �ڿ��� ���Ҷ� -> destroy
	
	
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
