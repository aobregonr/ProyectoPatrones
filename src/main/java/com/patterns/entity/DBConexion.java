package main.java.com.patterns.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import main.java.com.patterns.interfaces.IDataAccess;
import main.java.com.patterns.interfaces.INotification;

public class DBConexion {
    private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/recursoshumanos?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "abc123";
    private static final String MAX_POOL = "250";

    private static Connection connection;
    private static Properties properties;

    private static Properties GetProperties() {
        if (properties == null) {
            properties = new Properties();
            properties.setProperty("user", USERNAME);
            properties.setProperty("password", PASSWORD);
            properties.setProperty("MaxPooledStatements", MAX_POOL);
        }
        return properties;
    }
    
    // Singelton Pattern
    public static Connection Connect() {
        if (connection == null) {
            try {
                Class.forName(DATABASE_DRIVER);
                connection = DriverManager.getConnection(DATABASE_URL, GetProperties());
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    // disconnect database
    public static void Disconnect() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static <T> List<T> GetObjectsFromDB(String query, IDataAccess<T> obj)
    {
    	Connect();
        List<T> ResList = new ArrayList<>();
        try
        {
            Statement st = connection.createStatement();
            for (ResultSet rs = st.executeQuery(query); rs.next();)
            {
                ResList.add(((T) obj.Map(rs)));
            }
        }
        catch (SQLException ex)
        {
        	
        }
        Disconnect();
        return ResList;
    }
    
}