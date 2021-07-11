<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
public void jspInit() {
	String defaultUserName = getServletConfig().getInitParameter("defaultUserName");
	ServletContext servletContext = getServletContext();
	servletContext.setAttribute("defaultUserName", defaultUserName);
}
%>

<%-- to have JSP init, need to create servlet in web.xml --%>
the default user name from servlet config's init param is:
<%=getServletConfig().getInitParameter("defaultUserName")%>
<br>
the default user name from servlet context is:
<%=getServletContext().getAttribute("defaultUserName")%>
</body>
</html>