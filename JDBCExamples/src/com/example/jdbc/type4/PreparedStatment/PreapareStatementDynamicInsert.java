package com.example.jdbc.type4.PreparedStatment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.jdbc.util.ConnectionUtil;

public class PreapareStatementDynamicInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		Connection con=ConnectionUtil.getDBConnection();
		PreparedStatement ps = con.prepareStatement("insert into emp VALUES(?,?,?)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("Enter ID value:");
			int id= Integer.parseInt(br.readLine());
			
			System.out.println("Enter the Name value:");
			String name= br.readLine();
			
			System.out.println("Enter the Age Value:");
			int age = Integer.parseInt(br.readLine());
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			int count=ps.executeUpdate();
			if(count>0)
			{
				System.out.println("Record inserted.. ID:"+id);
			}
			
			System.out.println("Do you want to Continue: y/n");
			String s= br.readLine();
			if(s.equalsIgnoreCase("n") || s.equalsIgnoreCase("no"))
			{
				System.out.println("terminated...");
				break;
			}
		}while(true);
		
		ps.close();
		con.close();
	}

}
