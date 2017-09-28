<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/main.css"/>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Employee list</title>
	</head>
	
<body>
	<p1>Employees:</p1>
    
			<c:forEach var="listValue" items="${lists}">
				<div class="emp" onclick="location.href='./hello';"><p>${listValue}  Currently working: NO Reason: var</p></div>
			</c:forEach>
		

    
    
</body>
</html>