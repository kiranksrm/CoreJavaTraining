package com.example.jdbc.type4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.jdbc.util.ConnectionUtil;

public class Type4Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection con = ConnectionUtil.getDBConnection();
		Statement st =con.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT id,name FROM EMP");
		while(rs.next())
		{
			int id=rs.getInt("id");
			String name=rs.getString("name");
			//int age=rs.getInt("age");
			//System.out.println(id+","+name+","+age);
			System.out.println(id+","+name);
		}
		st.close();
		con.close();
	}

}
