package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class T2ServletConfigByXML extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET method, from T2ServletConfigByXML");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<h1>can put html here, from T2ServletConfigByXML</h1>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}
