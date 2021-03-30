package com.example.jdbc.type4.PreparedStatment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.jdbc.util.ConnectionUtil;

public class PrepateStatementUpdateExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con= ConnectionUtil.getDBConnection();
		PreparedStatement ps= con.prepareStatement("update emp SET name=? WHERE id=?");
		ps.setString(1,"JAVA");
		ps.setInt(2, 1001);
		
		int count=ps.executeUpdate();
		if(count>0)
			System.out.println("Record updated.");
		
		
		PreparedStatement ps1= con.prepareStatement("DELETE FROM emp WHERE id=?");
		ps1.setInt(1, 1001);
		
		int count1=ps1.executeUpdate();
		if(count1>0)
			System.out.println("Record deleted.");
		
	}

}
