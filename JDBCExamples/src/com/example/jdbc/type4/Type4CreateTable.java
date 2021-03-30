package com.example.jdbc.type4;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.jdbc.util.ConnectionUtil;

public class Type4CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con = ConnectionUtil.getDBConnection();
		Statement st=con.createStatement();
		
		//st.executeUpdate("create database bookdb");
		
		st.executeUpdate("use bookdb");
		
		int i=st.executeUpdate("create table AUTHOR (author_id int(11) not null UNIQUE AUTO_INCREMENT, name varchar(45), email varchar(45))");
		
		if(i>=0)
		{
			System.out.println("Author table is created..");
			
			int count=st.executeUpdate("create table book (book_id int(11) not null UNIQUE AUTO_INCREMENT, title varchar(128), description varchar(512), published DATE, author_id int(11), price FLOAT, rating int(11))");
			if(count>=0)
			{
				System.out.println("Book table is created..");
			}
		}
		
		st.close();
		con.close();
	}

}
