<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Testing JSPs</h3>
<%--this is comment, method declared here will be available to all scriptlet --%>
<%!
public int add(int a, int b) {
	return a + b;
}
 %>

<%
int i = 1;
int j = 2;
int k;

k = add(i, j);
out.println("value of k: " + k);
%>
<br>
html way of value of k: <%= k%>

<%--the closing of FOR loop in another scriptlet
to show that can have normal html between script tag, will be treated as part of java--%>
<%
for (i = 0; i < 5; i++) {
%>
<br> i = <%= i %>

<%
}
%>
</body>
</html>