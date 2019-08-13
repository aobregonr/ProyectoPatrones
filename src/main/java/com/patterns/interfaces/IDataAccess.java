package main.java.com.patterns.interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface IDataAccess<T>{
	public T Map(ResultSet sqlResult) throws SQLException;
}
