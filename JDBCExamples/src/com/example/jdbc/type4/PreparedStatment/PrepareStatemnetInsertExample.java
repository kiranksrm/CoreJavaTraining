package com.example.jdbc.type4.PreparedStatment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.jdbc.util.ConnectionUtil;

public class PrepareStatemnetInsertExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection con= ConnectionUtil.getDBConnection();
		PreparedStatement ps= con.prepareStatement("insert into emp values(?,?,?)");
		ps.setInt(1, 1001);
		ps.setString(2, "NAME1");
		ps.setInt(3, 18);
		
		int count=ps.executeUpdate();
		if(count>0)
			System.out.println("Record Inserted");
		
		ps.close();
		con.close();
	}

}
