package com.example.jdbc.type4.CollableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.example.jdbc.util.ConnectionUtil;

public class GetQuantityUsingStoredFunction {

	public static void main(String[] args) {
		
		try {
			Connection con = ConnectionUtil.getDBConnection();
			
			CallableStatement cs= con.prepareCall("{ ?=call get_book_quantity(?)  }");
			cs.registerOutParameter(1, Types.INTEGER);
			cs.setString(2, "Bill Gates");
			cs.execute();
			
			System.out.println("Book Quantity:"+cs.getInt(1));
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
