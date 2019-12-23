<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page errorPage="errorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String adminID;
	String adminPW;
	
	String imgdir;
	String testSeverIP;
	String realServerIP;
	String str="";
%>
<%
	adminID=config.getInitParameter("adminId");
	adminPW=config.getInitParameter("adminPw");
	
	
	imgdir=application.getInitParameter("imgDir");
	testSeverIP=application.getInitParameter("testSeverIP");
	realServerIP=application.getInitParameter("realSeverIP");
%>

<%
	application.setAttribute("connectedIP","165.62.58.23");
	application.setAttribute("connectedUser", "hong");
%>

<p>adminID:<%=adminID %></p>
<p>adminPW:<%=adminPW %></p>
<p>imgdir:<%=imgdir %></p>
<p>testSeverIP:<%=testSeverIP %></p>
<p>realServerIP:<%=realServerIP %></p>
<p>realServerIP:<%=realServerIP %></p>


<!-- out ��ü -->
		<%
			out.print("<h1>Hello JAVA World!!</h1>");
			out.print("<h2>Hello JSP World!!</h2>");
			out.print("<h3>Hello Servlet World!!</h3>");
		%>
		
		<!-- exception ��ü -->
		<%
			out.print(str.toString());
		%>

</body>
</html>