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

@WebServlet("/ControllerProyect")
public class ControllerProyect extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String nombreProyecto = request.getParameter("nombreProyecto");
		String idEquipo = request.getParameter("idEquipo");
		String descripcion = request.getParameter("descripcion");
		boolean result = true;
		
		if(nombreProyecto.isEmpty() || idEquipo.isEmpty() || descripcion.isEmpty())
		{
			RequestDispatcher req = request.getRequestDispatcher("views/login.jsp");
			req.include(request, response);
		} else {
			try {
				Connection conn = DBConexion.Connect();
				String query = "INSERT INTO proyect "
						+ "(nameProyect, teamAsing, description)"
						+" VALUES (?, ?, ?);";
				
				PreparedStatement statement = conn.prepareStatement(query);
				statement.setString(1, nombreProyecto);
				statement.setInt(2, Integer.parseInt(idEquipo));
				statement.setString(3, descripcion);

				result = statement.execute();
				DBConexion.Disconnect();

				RequestDispatcher req = request.getRequestDispatcher("views/proyect.jsp");
				req.forward(request, response);

			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
			}
	    }
		
	}

}