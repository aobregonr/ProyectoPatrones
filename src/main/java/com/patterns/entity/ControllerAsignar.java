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

@WebServlet("/ControllerAsignar")
public class ControllerAsignar extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String idEquipo = request.getParameter("asignarEquipo");
        String idUser = request.getParameter("asignarUsuario");
        boolean result = true;

        try{
            Connection conn = DBConexion.Connect();
            String query = "INSERT INTO user_table"
                + "(teamId, userId)"
                +" VALUES (?, ?);";
                
                PreparedStatement statement = conn.prepareStatement(query);
                statement.setInt(1, Integer.parseInt(idEquipo));
                statement.setInt(2, Integer.parseInt(idUser));

                result = statement.execute();
                DBConexion.Disconnect();

                RequestDispatcher req = request.getRequestDispatcher("views/team.jsp");
				req.include(request, response);
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

}