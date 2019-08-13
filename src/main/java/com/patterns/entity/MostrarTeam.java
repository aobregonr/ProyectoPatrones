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

public class MostrarTeam {

    public List<Team> list() throws SQLException {
        List<Team> listaTeam = new ArrayList<>();
        try {
            Connection conn = DBConexion.Connect();
            String sql = "SELECT * FROM team ORDER BY name";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                Team team = new Team(id, name);

                listaTeam.add(team);
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listaTeam;
    }

}