package com.example.jdbc.type4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.jdbc.util.ConnectionUtil;

public class Type4ExampleUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con=ConnectionUtil.getDBConnection();
		//3. create the statement obj
		Statement st=con.createStatement();
		//4. Prepare SQL QUERY
		//5. execute the QUERY
		int count=st.executeUpdate("UPDATE EMP SET name='XYZ' WHERE id=103");
		if(count>0)
		{
			System.out.println("Record updated succesfully.."+count);
		}
		
		st.close();
		con.close();
		
	}
	
}
