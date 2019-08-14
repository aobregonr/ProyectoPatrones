package main.java.com.patterns.core;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.com.patterns.entity.ApplicationDao;
import main.java.com.patterns.entity.User;

/**
 * Servlet implementation class LoginServlet1
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//resp.sendRedirect("views/login.jsp"); 
		req.getRequestDispatcher("views/login.jsp").forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//get the username from the login form
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		//call DAO for validation logic
		ApplicationDao dao= new ApplicationDao();
		User isValidUser = dao.validateUser(username, password);
		
		//check if user is invalid and set up an error message
		if(isValidUser.getName() != null){
			//set up the HTTP session
			HttpSession session = req.getSession();
			
			//set the session attributes
			session.setAttribute("idUser", isValidUser.getUserId());
			session.setAttribute("username", isValidUser.getName());
			session.setAttribute("role", isValidUser.getRole());
			//forward to home jsp
			
			//resp.sendRedirect("views/dashboard.jsp"); 
			
			req.getRequestDispatcher("views/dashboard.jsp").forward(req, resp);
			
		}
		else{
			String errorMessage="Invalid credentials, please try again or register a new user!";
			req.setAttribute("errorLogin", errorMessage);
			req.getRequestDispatcher("views/login.jsp").forward(req, resp);
			
			//ServletContext context = getServletContext();
			//context.removeAttribute("errorLogin");
			//context.setAttribute("errorLogin",errorMessage);
			//resp.sendRedirect("views/login.jsp"); 
			
			
			
		}
	}

}
