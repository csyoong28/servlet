<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.koushik.javabrains.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>dashboard</title>
</head>
<body>
	<h3>login successful</h3> 
	<%--can get from request --%>
	<%
	User user = (User)request.getAttribute("user");
	%>
	
	Hello <%= user.getUserName()%>
</body>
</html>