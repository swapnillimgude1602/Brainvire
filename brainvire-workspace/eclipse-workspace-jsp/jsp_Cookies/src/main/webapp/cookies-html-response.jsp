<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>reading form data and send cokie</title>
</head>
<%

//read data
String favouritecar = request.getParameter("favcar");

//create cookie
Cookie cookie= new Cookie("mycar.favcar",favouritecar);

//set life span in seconds
cookie.setMaxAge(60*60*24*365);	//1yr

//send cookie to brower
response.addCookie(cookie); 

%>
<body>
We have set you favourite car to: ${param.favcar}
<br><hr>
<a href="cookies-homepage.jsp">--Back to home page--</a>
</body>
</html>