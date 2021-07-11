package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class T4ServletWithSession
 */
@WebServlet("/T4ServletWithSession")
public class T4ServletWithSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public T4ServletWithSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		String userName = request.getParameter("userName");
		String dbConnectionDetails = request.getParameter("dbConnectionDetails");
		//deal with session object
		HttpSession httpSession = request.getSession();
		if (userName != null && !userName.equals("")) {			
			httpSession.setAttribute("savedUserName", userName);
		}
		//deal with context object
		ServletContext servletContext = request.getServletContext();
		if (dbConnectionDetails != null && !dbConnectionDetails.equals("")) {
			servletContext.setAttribute("dbConnectionDetails", dbConnectionDetails);
		}
		
		printWriter.println("hello user:" + userName + " , session username: " + (String)httpSession.getAttribute("savedUserName"));
		printWriter.println("<br> dbConnectionDetails: " + servletContext.getAttribute("dbConnectionDetails"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
