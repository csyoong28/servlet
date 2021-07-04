package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class T3ServletWithParameter
 */
@WebServlet("/T3ServletWithParameter")
public class T3ServletWithParameter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		String userName = request.getParameter("userName");
		printWriter.println("doGet, hello user:" + userName);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		String job = request.getParameter("job");
		String location = request.getParameter("location");
		//when have multiple values, eg from <select>, and checkbox, use request.getParameterValues
		String[] hobbies = request.getParameterValues("hobby");		
		
		printWriter.println("doPost, hello user: " + userName + " ,fullname: " + fullName);
		printWriter.println("<br>job: " + job + ", at " + location);
		printWriter.println("<br>hobby: " + Arrays.toString(hobbies));
	}

}
