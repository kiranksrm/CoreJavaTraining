package com.example.jdbc.type4.PreparedStatment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.jdbc.util.ConnectionUtil;

public class PrepareStatementSelectExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con= ConnectionUtil.getDBConnection();
		PreparedStatement ps= con.prepareStatement("SELECT * FROM EMP WHERE id IN (?, ?, ?) ORDER BY name DESC");
		ps.setInt(1, 102);
		ps.setInt(2, 103);
		ps.setInt(3, 104);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println("id:"+rs.getInt("id")+",Name:"+rs.getString("name")+", Age:"+rs.getInt("age"));
		}
	}

}
