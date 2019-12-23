<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

First Page</br>
<%
	//seconde page로 다시 보내는 액션
	response.sendRedirect("secondPage.jsp");
%>
</body>
</html>