<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/popup.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<img src="data:image/jpeg;base64,${emp.getEncodedPhoto()}"/>
	<p>Name: ${emp.getFirstName()}  ${emp.getLastName()}</p>
	<p>Telephone: ${emp.getPhoneNumber()}</p>
	<p>Email:  ${emp.getEmail()}</p>
	<p>Status:</p>
	<p id="activ">Activity:</p>
	
</body>
</html>