<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
	
		if(session.getAttribute("memberId")!=null)
			response.sendRedirect("loginOk.jsp");
		
	%>

	<form action="loginCon" method="post">
		ID: <input type ="text" name="mID"><br>
		PW: <input type ="password" name="mPW"><br>
		<input type ="submit" name="login"><br>
	</form>
</body>
</html>