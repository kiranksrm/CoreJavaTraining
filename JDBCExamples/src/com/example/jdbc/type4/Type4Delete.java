package com.example.jdbc.type4;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.jdbc.util.ConnectionUtil;

public class Type4Delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getDBConnection();
		
		Statement st=con.createStatement();
		int count=st.executeUpdate("DELETE FROM EMP WHERE id=104");
		if(count>0)
		{
			System.out.println("Deleted successufully.."+count);
		}
		
		st.close();
		con.close();
	}

}
