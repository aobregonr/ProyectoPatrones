package main.java.com.patterns.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicationDao {

	
	public User validateUser(String username, String password) {
		User isValidUser = new User();
		try {

			// get the connection for the database
			Connection connection = DBConexion.Connect();
			

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
	
	public int registerUser(User user) {
		int rowsAffected = 0;

		try {
			// get the connection for the database
			Connection connection = DBConexion.Connect();

			// write the insert query
			String insertQuery = "insert into user (name,password,idPerson) values(?,?,?)";

			// set parameters with PreparedStatement
			java.sql.PreparedStatement statement = connection.prepareStatement(insertQuery);
			statement.setString(1, user.getName());
			statement.setString(2, user.getPassword());
			statement.setInt(3, user.getIdPerson());
			

			// execute the statement
			rowsAffected = statement.executeUpdate();

		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		return rowsAffected;
	}
	
	public int registerPerson(Person person) {
		int rowsAffected = 0;

		try {
			// get the connection for the database
			Connection connection = DBConexion.Connect();

			// write the insert query
			String insertQuery = "insert into parson (name,lastName,gender,address) values(?,?,?,?)";

			// set parameters with PreparedStatement
			java.sql.PreparedStatement statement = connection.prepareStatement(insertQuery);
			statement.setString(1, person.getName());
			statement.setString(2, person.getLastName());
			statement.setString(3, person.getGender());
			statement.setString(4, person.getAddress());
			

			// execute the statement
			rowsAffected = statement.executeUpdate();
	

		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		return rowsAffected;
	}
	
	public Person getPerson() throws ParseException {
		Person fPerson = new Person();
		try {

			// get the connection for the database
			Connection connection = DBConexion.Connect();
			

			// write the select query
			String sql = "SELECT * FROM parson ORDER BY id DESC LIMIT 1";

			// set parameters with PreparedStatement
			java.sql.PreparedStatement statement = connection.prepareStatement(sql);
			

			// execute the statement and check whether user exists

			ResultSet set = statement.executeQuery();
			while (set.next()) {
				fPerson.setName(set.getString("name"));
				fPerson.setLastName(set.getString("lastName"));
				fPerson.setGender(set.getString("gender"));
				fPerson.setId(set.getInt("id"));
				fPerson.setAddress(set.getString("address"));
			}
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		return fPerson;
	}
}
