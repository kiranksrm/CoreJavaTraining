package com.example.jdbc.type4.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.jdbc.util.ConnectionUtil;

public class InsertImage {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Connection con=ConnectionUtil.getDBConnection();
		
		String sql="INSERT INTO EMP VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement ps= con.prepareStatement(sql);
		
		ps.setInt(1, 3002);
		ps.setString(2, "Kiran1");
		ps.setInt(3, 21);
		
		FileInputStream fin= new FileInputStream("E:\\Test.jpg");
			ps.setBinaryStream(4, fin, fin.available());
		ps.setFloat(5, 3500.00f);
		
		int count=ps.executeUpdate();
		if(count>0)
			System.out.println("Record inserted");
		
		ps.close();
		con.close();
	}

}
