package main.java.com.patterns.interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

import main.java.com.patterns.entity.EmployeeToSupervisor;

public interface IObserver {
	public void update(IPermission perm);
}
