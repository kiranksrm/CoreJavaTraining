package com.example.jdbc.type4.CollableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.example.jdbc.util.ConnectionUtil;

public class CallableStatementCreateStoredProc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = ConnectionUtil.getDBConnection();
		
		CallableStatement cs= con.prepareCall(" {call create_author(?,?)} ");
		cs.setString(1, "Bill Gates Microsft");
		cs.setString(2, "bill@microsoft.com");
		
		cs.execute();
		System.out.println("Stored procedure called successfully..");
		cs.close();
		con.close();
	}

}
