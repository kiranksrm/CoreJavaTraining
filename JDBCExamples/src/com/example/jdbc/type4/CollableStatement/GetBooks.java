package com.example.jdbc.type4.CollableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.jdbc.util.ConnectionUtil;

public class GetBooks {

	public static void main(String[] args) {
		try {
			Connection con =ConnectionUtil.getDBConnection();
			
			CallableStatement cs= con.prepareCall("{ call get_books(?)}");
			
			cs.setInt(1, 3);
			boolean hadResults= cs.execute();
			
			while(hadResults)
			{
				ResultSet rs=cs.getResultSet();
				//process resultset
				while(rs.next())
				{
					String title=rs.getString("title");
					String descr= rs.getString("description");
					int rating = rs.getInt("rating");
					System.out.println(title+" || "+descr+" || "+rating);
				}
				hadResults = cs.getMoreResults();
			}
			
			cs.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
//	void getBooksByRating(int rate)
//	{
//		
//	}
//		
//	List getBooksByAuthorName(String name)
//	{
//		
//	}
//	List getBooksByAuthorId(int id)
//	{
//		
//	}
//	List getBooksByPrice()
//	{
//		
//	}
//	int chectBookQuantity(String title)
//	{
//		
//	}
}
