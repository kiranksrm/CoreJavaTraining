package com.example.jdbc.type1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOdbcExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1. Load the Driver class
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
		//2. Create Connection objection
		Connection con=DriverManager.getConnection("jdbc:odbc:kiran");
		//3. Prepare SQL Query
		String str="INSERT INTO [Sheet2$] VALUES (101, 'ABC',20)";
		
		//4. Create/get a Statement Object
			Statement st=con.createStatement();
		//5. Execute the query/statement
			//int i=st.executeUpdate(str);
			int k=10;
			ResultSet rs = st.executeQuery("Select * from [Sheet2$]");
			while(rs.next())
			{
				for (int i = 1; i <= 3; i++)  
                {  
                    if (i > 1)  
                        System.out.print(", ");  
                    String columnValue = rs.getString(i);  
                    System.out.print(columnValue);  
                }  
                System.out.println(""); 
			}
			if(k>0)
			{
				System.out.println("Successfully Inserted.");
			}
			else
				System.out.println("Failed to Insert the record");
		//6. Close the resources
			st.close();
			con.close();
	}

}
