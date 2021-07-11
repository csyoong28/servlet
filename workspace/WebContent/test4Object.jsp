<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--run with http://localhost:8080/SimpleServletProject/test4Object.jsp?userName=aaaa&dbConnectionDetails=127001 --%>
<%
String userName = request.getParameter("userName");	//there is implicit object called request
String dbConnectionDetails = request.getParameter("dbConnectionDetails");
//can get session object by request.getSession(). But there is implicit session object in JSP called session
//there is implicit context object in JSP called application
if (userName != null) {
	session.setAttribute("savedUserName", userName);
}
if (dbConnectionDetails != null) {
	application.setAttribute("dbConnectionDetails", dbConnectionDetails);
}
if (userName != null) {
	//there is pageContext, this does not have equivalent in servlet
	pageContext.setAttribute("pageContextUserName", userName);
	//pageContext can access the session, request and application scope. Can also perform find operation in other scope
	pageContext.setAttribute("pageContextUserName", userName, PageContext.APPLICATION_SCOPE);
	pageContext.findAttribute("dbConnectionDetails");
}

%>


request's parameter userName: <%=userName %>
<br>
session's parameter savedUserName: <%=session.getAttribute("savedUserName") %>
<br>
application's parameter dbConnectionDetails: <%=application.getAttribute("dbConnectionDetails") %>
<br>
pageContext's parameter pageContextUserName: <%=pageContext.getAttribute("pageContextUserName") %>
</body>
</html>