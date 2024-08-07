<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="regform" method="post">
Name :<input type="text" name="name" placeholder="Enter you name..." /> <br><br>
E-Mail :<input type="text" name="email" placeholder="Enter you email..." /> <br><br>
Password :<input type="password" name="password" /> <br><br>
Gender :<input type="radio" name="gen1" value="male"/>Male	<input type="radio" name="gen1" value="female"/>Female <br><br>
City : 
<select name="city">
	<option> select city </option>
	<option> Delhi </option>
	<option> Pune </option>
	<option> Mumbai </option>
</select> <br><br>
<input type="submit" value="register">
</form>
</body>
</html>