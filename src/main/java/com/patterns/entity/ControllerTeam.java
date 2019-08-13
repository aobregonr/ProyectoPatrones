package main.java.com.patterns.entity;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControllerTeam")
public class ControllerTeam extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String nombreEquipo = request.getParameter("nombreEquipo");
		String descripcion = request.getParameter("descripcion");
		boolean result = true;

		if(nombreEquipo.isEmpty() || descripcion.isEmpty())
		{
			RequestDispatcher req = request.getRequestDispatcher("login.jsp");
			req.include(request, response);
		} else {
			try {
				Connection conn = DBConexion.Connect();
				String query = "INSERT INTO team "
					  + "(name, description, proyectId, userId)"
					  +" VALUES (?, ?, ?, ?);";

				PreparedStatement statement = conn.prepareStatement(query);
				statement.setString(1, nombreEquipo);
				statement.setString(2, descripcion);
				statement.setInt(3, 0);
				statement.setInt(4, 0);

				result = statement.execute();
				DBConexion.Disconnect();

				RequestDispatcher req = request.getRequestDispatcher("team.jsp");
				req.forward(request, response);

			}catch(SQLException ex){
				System.out.println(ex.getMessage());
			}
		}
	}

}
