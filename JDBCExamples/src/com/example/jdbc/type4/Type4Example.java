package com.example.jdbc.type4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Type4Example {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con=null;
		Statement st=null;
		try {
		//1. Load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		   //for Mysql: com.mysql.jdbc.Driver
		//FOR MYSQL: com.mysql.cj.jdbc.Driver
		//for Oracle: 
		  //postgresSQL: org.postgresql.Driver
		
		//2. Get the connection
		// jdbc:mysql://<<IPADDRESS>:<<PORT of DB>>/<<Schema or Databasename>>
		String url="jdbc:mysql://localhost:3306/mydb";
		String userName="root";
		String password="admin";
		con=DriverManager.getConnection(url, userName, password);
		
		
		//3. SQL QUERY
		String str1="insert into emp (id, name, age) values (102, 'Deepika', 06)";
		String str2="insert into emp (id, name, age) values (104, 'Vikranth', 06)";
		String str3="insert into emp (id, name, age) values (105, 'Reddy', 16)";
		
		//4. Create STatement object
		 st=  con.createStatement();
		 
			for (int i = 0; i < 3; i++) {
				String name= "TEST"+i;
				str3="insert into emp (id, name, age) values ("+i+", "+name+","+i+")";
				int count = st.executeUpdate(str3);

				if (count > 0) {
					System.out.println("Record inserted.");
				} else
					System.out.println("Record is not inserted");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			st.close();
			con.close();
		}
		
		
	}

}
