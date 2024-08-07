<%@ page import=" java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="list.jsp">
		Add Item To List : <input type="text" name="items"
			placeholder="Enter items here"> <input type="submit"
			value="submit">
	</form>


																			<!-- <br> Item entered :<%=request.getParameter("items")%> -->	
	<%
	//Add new item to list
	//get items from session
	List<String> listitems = (List<String>) session.getAttribute("myitems");

	//if mylist doesnt exist make new
	if (listitems == null) {
		listitems = new ArrayList<String>();
		session.setAttribute("myitems", listitems); //items set into session

	}
	
	String mitems = request.getParameter("items");
		if(mitems != null){
			listitems.add(mitems);
		}
			
	%>
	
	<!-- Display items -->
	<h2>List items</h2>
	<ol>
	<%
	for(String disp: listitems)
	{
		out.println("<li>"+disp+"</li>");
	}
	%>
	</ol>
	
	





</body>
</html>