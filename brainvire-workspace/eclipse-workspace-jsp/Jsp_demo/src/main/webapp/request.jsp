<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Gives actual browser user using & operating system information -->
Request User Agent: <%= request.getHeader("User-Agent") %>
<br>
<!-- Request Language gives the language sys uses -->
Request Language: <%= request.getLocale() %>

</body>
</html>