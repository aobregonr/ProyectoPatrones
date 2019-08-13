package main.java.com.patterns.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import main.java.com.patterns.interfaces.IDataAccess;
import main.java.com.patterns.interfaces.INotification;
import main.java.com.patterns.interfaces.IObserver;
import main.java.com.patterns.interfaces.IPermission;

public class EmployeeToAdmin implements IObserver, IDataAccess<EmployeeToAdmin> {
	private int ID;
	private int UserID;
	private int AdminID;
	
	private final String TNAME = "employeetoadmin";
	private IPermission perm;

	/**
	 * Notify to all user Administrators
	 */
	@Override
	public void update(IPermission _perm) {
		this.perm = _perm;
		Date currentDate = new Date();
		Person requested = Person.GetByID(perm.get_person().getId());
		try {
			for(EmployeeToAdmin adminEmp : this.GetAll()) {
			
				Person receiver = Person.GetByID(adminEmp.AdminID);
				
				INotification notify = new UnreadNotification();
				notify.setTitle("Permission Request");
				notify.setSubject("New Permission");
				notify.setContent("The Employee "+requested.getName() +" "+ requested.getLastName()+" send a request to new permission. "
						+ "Permission type: "+perm.getType()
						+ "Person ID: " + requested.getId()
						+ "Permission status: " + perm.getStartDate()
						+ "Payment: " + perm.isPayment() 
						+ "Start Date: " + perm.getStartDate()
						+ "Days: " + perm.getQuantityDays());
				
				notify.setReceiver(receiver);
				notify.setReciveDate(currentDate);
				notify.CreateNotification();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public EmployeeToAdmin Map(ResultSet sqlResult) throws SQLException {
		try {
			ID = sqlResult.getInt("id");
			UserID = sqlResult.getInt("id_user");
			AdminID = sqlResult.getInt("id_admin");
		}catch(SQLException ex) {
			
		}
		return this;
	}

	private List<EmployeeToAdmin> GetAll(){
		String query = "SELECT * FROM " + this.TNAME
				+ " WHERE id_user=" + perm.get_person().getId();
		
		return DBConexion.GetObjectsFromDB(query, rs -> this.Map(rs));
	}
	
	public boolean Create() throws SQLException  {
		boolean result = true;
		
		try {
			Connection conn = DBConexion.Connect();
			String query = "INSERT INTO " + this.TNAME
					+ " (id_user,id_admin)"
					+ " VALUES (?,?);";
			
			 PreparedStatement statement = conn.prepareStatement(query);
			 statement.setInt(1, this.UserID);
			 statement.setInt(2, this.AdminID);
			 
			 result = statement.execute();
			 DBConexion.Disconnect();
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return result;
	}
}
