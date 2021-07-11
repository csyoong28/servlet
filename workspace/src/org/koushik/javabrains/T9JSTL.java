package org.koushik.javabrains;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.koushik.javabrains.dto.User;
import org.koushik.javabrains.service.LoginService;

/**
 * Servlet implementation class T7MVCLoginServlet
 */
@WebServlet("/T9JSTL")
public class T9JSTL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		LoginService loginService = new LoginService();
		Boolean result = loginService.authenticate(userId, password);
		if (result) {
			User user = loginService.getUserDetails(userId);
			//since is forward, can save data into request object.
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("test9JSTLSuccessLogin.jsp");
			dispatcher.forward(request, response);
			return;			//this return is needed
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("test9JSTLLoginPage.jsp");
			dispatcher.forward(request, response);
			return;
		}
	}

}
