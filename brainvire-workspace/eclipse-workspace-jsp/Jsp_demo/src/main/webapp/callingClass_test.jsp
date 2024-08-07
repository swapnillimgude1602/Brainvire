<%@page import="Resource.calling_Class"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
--Calling a java File in jsp--
<%
//calling Static method
String s = calling_Class.lowerCase("CALLING A JAVA CLASS FILE...");
out.println(s);


//calling non static method

calling_Class i =new calling_Class(); //object of calling class
int z=i.sum(20);
out.println(z);


%>
</body>
</html>