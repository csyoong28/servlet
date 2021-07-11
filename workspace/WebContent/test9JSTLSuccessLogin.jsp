<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="org.koushik.javabrains.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>dashboard</title>
</head>
<body>
	<h3>test9JSTLSuccessLogin.jsp login successful</h3> 
	<%--this is equivalent to below JSTL. 
	<%
	User user = (User)request.getAttribute("user");
	%>--%>
	<jsp:useBean id="user" class="org.koushik.javabrains.dto.User" scope="request">
	</jsp:useBean>
	<jsp:useBean id="userNotExist" class="org.koushik.javabrains.dto.User" scope="request">
		<jsp:setProperty property="userName" name="userNotExist" value="chia" />
	</jsp:useBean>
	<%--this is equivalent to below JSTL.--%>
	Hello <%= user.getUserName()%>
	<br>Hello <jsp:getProperty property="userName" name="user"/>
	<br>not exist: <jsp:getProperty property="userName" name="userNotExist"/>
</body>
</html>