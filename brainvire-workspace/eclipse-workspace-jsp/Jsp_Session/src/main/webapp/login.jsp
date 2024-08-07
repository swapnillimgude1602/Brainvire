<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String uname = request.getParameter("uname");
String pass = request.getParameter("pass");

if(uname.equals("swap") && pass.equals("swap123"))
{
	session.setAttribute("uname",uname);	//session is setted here
	response.sendRedirect("index.jsp");	
}
else
	out.println("--Invalid username and password--");
%>

</body>
</html>