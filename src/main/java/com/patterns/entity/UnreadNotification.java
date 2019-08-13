package main.java.com.patterns.entity;

import main.java.com.patterns.interfaces.INotification;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UnreadNotification extends INotification {
	
	public UnreadNotification() {
		super();
		this.setStatus(NotificationStatus.UNREAD);
	}
	
	/**
	 * true if the first result is a ResultSet object; false if the first result is an update count or there is no result.
	 * @return boolean
	 * @throws SQLException
	 */
	@Override
	public boolean CreateNotification() throws SQLException {
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
				+ " WHERE receiver="+this.getReceiver().getId()+" "
				+ "AND status='"+NotificationStatus.UNREAD+"'";

	    return DBConexion.GetObjectsFromDB(Query, rs -> this.Map(rs));
	}

	@Override
	public void UpdateReadedNotification() {
		// TODO Auto-generated method stub
		
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


}
