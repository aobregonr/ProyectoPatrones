package main.java.com.patterns.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.patterns.interfaces.IPermission;

public class WithSalary extends IPermission {

	public WithSalary() {
		super();
		this.setType(PermissionType.WITHSALARY);
		this.setPayment(true);
	}

	@Override
	public IPermission Map(ResultSet sqlResult) throws SQLException {
		try {
			this.setID(sqlResult.getInt("id"));
			this.setType(PermissionType.WITHSALARY);
			this.setQuantityDays(sqlResult.getInt("cantDays"));
			this.setPayment(sqlResult.getBoolean("payment"));
			this.setStatus(PermissionStatus.valueOf(sqlResult.getString("status").toUpperCase()));
			this.setStartDate(sqlResult.getTimestamp("date"));
			this.setComment(sqlResult.getString("comment"));
			this.setDocumentMedical(sqlResult.getString("documentMedical"));
//			this.set_person(Person.GetByID(sqlResult.getInt("id_person")));
		}catch(SQLException ex) {
			
		}
		return this;
	}

	@Override
	public boolean Create() throws SQLException {
boolean result = true;
		
		try {
			Connection conn = DBConexion.Connect();
			String query = "INSERT INTO " + this.TNAME
					+ " (type,cantDays,payment,status,date,comment,documentMedical)"
					+ " VALUES (?,?,?,?,?,?);";
			
			 PreparedStatement statement = conn.prepareStatement(query);
			 statement.setString(1, this.getType().name());
			 statement.setInt(2, this.getQuantityDays());
			 statement.setBoolean(3, this.isPayment());
			 statement.setString(4, this.getStatus().name());
			 statement.setTimestamp(5, new java.sql.Timestamp(this.getStartDate().getTime()));
			 statement.setString(6, this.getComment());
			 statement.setString(7, this.getDocumentMedical());
			 
			 result = statement.execute();
			 DBConexion.Disconnect();
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return result;	
	}

	@Override
	public List<IPermission> GetAll() throws SQLException {
		String Query = "SELECT * FROM " + this.TNAME
				+ " WHERE id_person="+this.get_person().getId();

	    return DBConexion.GetObjectsFromDB(Query, rs -> this.Map(rs));
	}

	@Override
	public boolean Delete() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Update() throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
