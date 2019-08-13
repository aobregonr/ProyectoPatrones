package main.java.com.patterns.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import main.java.com.patterns.interfaces.IDataAccess;

public class Schedule implements IDataAccess<Schedule>{

	private int ID;
	private int EmployeeID;
	private Date Entry;
	private Date Exit;
	private int DatesOfWeek;
	
	private final String TNAME="schedule";
		
	
	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public int getEmployeeID() {
		return EmployeeID;
	}


	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}


	public Date getEntry() {
		return Entry;
	}


	public void setEntry(Date entry) {
		Entry = entry;
	}


	public Date getExit() {
		return Exit;
	}


	public void setExit(Date exit) {
		Exit = exit;
	}


	public int getDatesOfWeek() {
		return DatesOfWeek;
	}


	public void setDatesOfWeek(int datesOfWeek) {
		DatesOfWeek = datesOfWeek;
	}


	@Override
	public Schedule Map(ResultSet sqlResult) throws SQLException {
		try {
			this.setID(sqlResult.getInt("id"));
			this.setEmployeeID(sqlResult.getInt("id_employee"));
			this.setEntry(sqlResult.getTimestamp("entry"));
			this.setExit(sqlResult.getTimestamp("exitDate"));
			this.setDatesOfWeek(sqlResult.getInt("daysOfWeek"));
		}catch(SQLException ex) {
			
		}
		return this;
	}
	
	public List<Schedule> GetAll(){
		String Query = "SELECT * FROM " + this.TNAME
				+ " WHERE id_employee="+this.EmployeeID;

	    return DBConexion.GetObjectsFromDB(Query, rs -> this.Map(rs));
	}
	
}
