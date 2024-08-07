<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String[] cars = { "BMW", "AUDI", "CITROGEN", "TOYOTO" };

pageContext.setAttribute("mycars", cars);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="tempcar" items="${mycars}">
		${tempcar}
			<br>
	</c:forEach>


</body>	
</html>