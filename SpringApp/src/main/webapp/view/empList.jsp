<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<link rel="stylesheet" type="text/css" href="css/main.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee list</title>
</head>

<body>
	<p1>Employees:</p1>
	<c:forEach var="listValue" items="${list}">
		  <div class="emp" onclick="openPopup('${listValue.getEmpID()}')">
			<p>${listValue.getFirstName()} ${listValue.getLastName()}  Currently working: NO Reason: if here</p>
		</div> 
	</c:forEach>

	<script type="text/javascript">
		function openPopup(name) {
			window.open("./popup?empID="+name);
		}
	</script>
</body>
</html>