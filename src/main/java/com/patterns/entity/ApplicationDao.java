package main.java.com.patterns.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicationDao {

	
	public User validateUser(String username, String password) {
		User isValidUser = new User();
		try {

			// get the connection for the database
			DBConexion dbc = new DBConexion();
			Connection connection = dbc.Connect();
			

			// write the select query
			String sql = "select * from user where name=? and password=?";

			// set parameters with PreparedStatement
			java.sql.PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, username);
			statement.setString(2, password);

			// execute the statement and check whether user exists

			ResultSet set = statement.executeQuery();
			while (set.next()) {
				isValidUser.setUserId(set.getInt("userId"));
				isValidUser.setName(set.getString("name"));
				isValidUser.setRole(set.getInt("role"));
				
			}
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		return isValidUser;
	}
}
