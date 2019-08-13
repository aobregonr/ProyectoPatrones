package main.java.com.patterns.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import main.java.com.patterns.interfaces.INotification;

public class ReadNotification extends INotification {

	public ReadNotification() {
		super();
		this.setStatus(NotificationStatus.READ);
	}
	
	@Override
	public INotification Map(ResultSet sqlResult) throws SQLException {
		try {
			this.setID(sqlResult.getInt("id"));
			this.setTitle(sqlResult.getString("title"));
			this.setSubject(sqlResult.getString("subject"));
			this.setContent(sqlResult.getString("content"));
			this.setReciveDate(sqlResult.getTimestamp("date"));
			// Get the Person obj with the ID returned in the sql result
			// Get the Employee obj with the ID returned in the sql result
		}catch(SQLException ex) {
			
		}
		return this;
	}

	@Override
	public boolean CreateNotification() {
		boolean result = true;
		try {
			Connection conn = DBConexion.Connect();
			String query = "INSERT INTO notification "
					+ "(title,subject,content,receiver,date,status)"
					+ " VALUES (?,?,?,?,?,?);";
			
			 PreparedStatement statement = conn.prepareStatement(query);
			 statement.setString(1, this.getTitle());
			 statement.setString(2, this.getSubject());
			 statement.setString(3, this.getContent());
			 statement.setInt(4, this.getReceiver().getId());
			 statement.setTimestamp(5, new java.sql.Timestamp(this.getReciveDate().getTime()));
			 statement.setString(6, this.getStatus().name());
			 
			 result = statement.execute();
			 DBConexion.Disconnect();
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return result;
	}

	@Override
	public List<INotification> GetAllNotifications() {
		String Query = "SELECT * FROM notification"
				+ " WHERE id="+this.getReceiver().getId()+" "
				+ "AND status='"+NotificationStatus.READ+"'";

	    return DBConexion.GetObjectsFromDB(Query, rs -> this.Map(rs));
	}

	@Override
	public void UpdateReadedNotification() {
		// TODO Auto-generated method stub
		
	}
	
}
