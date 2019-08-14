package main.java.com.patterns.core;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.com.patterns.entity.PermissionFactory;
import main.java.com.patterns.entity.PermissionType;
import main.java.com.patterns.interfaces.IPermissionFactory;

/**
 * Servlet implementation class ControllerPermission
 */
@WebServlet("/ControllerPermission")
public class ControllerPermission extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			IPermissionFactory factory = new PermissionFactory();
			Date strDate = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("startDate"));
			PermissionType type = PermissionType.valueOf(request.getParameter("type"));
			String comment = request.getParameter("comment");
			String doc = request.getParameter("doc");
			int days = Integer.parseInt(request.getParameter("days"));
			
			factory.NewPermission(type, days, strDate, comment, doc);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RequestDispatcher req = request.getRequestDispatcher("views/permission.jsp");
		req.forward(request, response);
		
	}

}
