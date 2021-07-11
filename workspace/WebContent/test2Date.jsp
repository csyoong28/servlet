<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
    <%--to import library, need to do above or can have multiple page directive--%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<%@ include file="/test3ForImport.jsp" %>
<br>
the time is: <%=new Date() %>
</body>
</html>