<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%

//create sample data
String carBrands[]={"BMW","Mercedes","Audi","Volkswagen","Suzuki"};
pageContext.setAttribute("my_cars", carBrands);

%>

<html>
<body>

<c:forEach var="tempcars" items="${my_cars}">

${tempcars} <br>

</c:forEach>

</body>
</html>