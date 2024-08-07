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
String Firstname = request.getParameter("fname");
String Lastname  = request.getParameter("lname");
out.println("Firstname: "+Firstname+" Lastname: "+Lastname);
out.println();
%>
<!--Alternate Method for requesting -->
FirstName : ${param.fname}
LastName :  ${param.lname}
Country :   ${param.country}
Car : ${param.car}

<ul>
<% 
String []fcar = request.getParameterValues("fcar");
if(fcar!=null)		//handling null pointer exception if user does not checks the box
{
for(String list :fcar)
{
	out.println("<li>"+list+"</li>");
}
}
%>
</ul>
 </body>
</html>