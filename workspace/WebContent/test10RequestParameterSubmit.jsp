<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>
	<!-- to send parameter to another JSP -->
	<form action="test10RequestParameterProcess.jsp" method="post">
		<br>userId: <input type="text" name="userId" />
		<br>user name: <input type="text" name="userName" />
		<br>address1: <input type="text" name="address1" />
		<br>city: <input type="text" name="city" />
		<br>zipcode: <input type="text" name="zipCode" />
		<br><input type="submit"/>
 	</form>
</body>
</html>