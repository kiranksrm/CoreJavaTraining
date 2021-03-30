package com.example.jdbc.type4.CollableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.example.jdbc.util.ConnectionUtil;

public class BookSummaryReport {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con =ConnectionUtil.getDBConnection();
		CallableStatement cs = con.prepareCall("{ call summary_report(?, ?, ?, ?) }");
		cs.registerOutParameter(2, Types.INTEGER);
		cs.registerOutParameter(3, Types.DOUBLE);
		cs.registerOutParameter(4, Types.DOUBLE);
		
		cs.setString(1, "Bill Gates");
		cs.setDouble(4, 50);
		
		cs.execute();
		
		Integer total_books= (Integer) cs.getObject(2, Integer.class);
		Double total_value=cs.getDouble(3); 
		Double high_price = cs.getDouble("high_price");
		
		System.out.println("Total Books: "+total_books);
		System.out.println("Total Value: "+total_value);
		System.out.println("High Price:"+high_price);
		
		cs.close();
	}

}
