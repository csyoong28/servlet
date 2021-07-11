<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>
	<jsp:useBean id="userDetails" class="org.koushik.javabrains.dto.UserDetails" scope="request">
		<jsp:setProperty property="userName" name="userDetails" param="userName"/>
		<jsp:setProperty property="*" name="userDetails"/>
	</jsp:useBean>
	username:<jsp:getProperty property="userName" name="userDetails"/>
	userId:<jsp:getProperty property="userId" name="userDetails"/>
	address1:<jsp:getProperty property="address1" name="userDetails"/>
	city:<jsp:getProperty property="city" name="userDetails"/>
	zipcode:<jsp:getProperty property="zipCode" name="userDetails"/>
</body>
</html>