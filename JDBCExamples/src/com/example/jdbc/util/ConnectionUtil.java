package com.example.jdbc.util;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

	public static Connection getDBConnection() throws ClassNotFoundException, SQLException
	{
		Properties p= new Properties();
		try {
		FileReader reader = new FileReader("db.properties");
		p.load(reader);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//1. load the driver class
				Class.forName(p.getProperty("mysql.driver")); //if you are using JDBC4.0 this is optional
				  //TRY with Resources
				
				//2. Get The Connection Obj by using DriverManager.getConnection();
				Connection con=DriverManager.getConnection(p.getProperty("mysql.url"), p.getProperty("mysql.user"), p.getProperty("mysql.password"));
			
				return con;
	}

}
