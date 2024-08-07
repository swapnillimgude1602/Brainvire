<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Table</h2>
<hr>
<table border="1">
<tr>
<th> First Name </th>
<th> Last Name </th>
<th> Email </th>
</tr>

<c:forEach var="tempstudents" items="${student_list}">
<tr>
<td>${tempstudents.firstName}</td>
<td>${tempstudents.lastName}</td>
<td>${tempstudents.email}</td>
</tr>
</c:forEach>

</table>
</body>
</html>