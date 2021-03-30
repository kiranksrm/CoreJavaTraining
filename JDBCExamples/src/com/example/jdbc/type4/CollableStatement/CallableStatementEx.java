package com.example.jdbc.type4.CollableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.example.jdbc.util.ConnectionUtil;

public class CallableStatementEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con=ConnectionUtil.getDBConnection();
		
		String str="{  call GETAGEPROCEDURE(?,?)    }";
		CallableStatement cs=con.prepareCall(str);
		cs.setInt(1, 102);
		cs.registerOutParameter(2, Types.VARCHAR);
		
		cs.execute();
		
		String name = (String) cs.getObject(2, String.class);
		System.out.println(name);
		
	}

}
