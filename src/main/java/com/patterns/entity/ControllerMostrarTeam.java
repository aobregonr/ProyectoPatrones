package main.java.com.patterns.entity;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listTeam")
public class ControllerMostrarTeam extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        listTeam(request, response);
    }
 
    protected void listTeam(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                MostrarTeam mostrar = new MostrarTeam();

				try {
					List<Team> listTeam = mostrar.list();
                    request.setAttribute("listaTeam", listTeam);
                    
                   RequestDispatcher dispatcher = request.getRequestDispatcher("view/Team.jsp");
                    dispatcher.forward(request, response);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
                

            }
}