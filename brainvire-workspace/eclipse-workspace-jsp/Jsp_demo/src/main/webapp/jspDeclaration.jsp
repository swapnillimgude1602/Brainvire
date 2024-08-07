<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Jsp Declaration -->
<%!
	String lower(String data){
		return data.toLowerCase();
	}
%>
	
	LowerCase String :<%= lower("HELLO..! Its lower") %>
</body>
</html>