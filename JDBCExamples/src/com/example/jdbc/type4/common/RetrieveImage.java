package com.example.jdbc.type4.common;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.jdbc.util.ConnectionUtil;

public class RetrieveImage {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Connection con=ConnectionUtil.getDBConnection();
		
		PreparedStatement ps = con.prepareStatement("Select * from emp where id=?");
		ps.setInt(1, 3001);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age= rs.getInt("age");
			Blob b=rs.getBlob("photo");
			byte[] imgArry= b.getBytes(1, (int)b.length());
			
			FileOutputStream fout= new FileOutputStream("E:\\TEST1.jpg");
			fout.write(imgArry);
			fout.close();
			
			float salary= rs.getFloat("salary");
			
			System.out.println("ID:"+id+", name:"+name+", age:"+age+", salary:"+salary);
		}
		
		PreparedStatement ps1 = con.prepareStatement("Select * from emp where id=?");
		ps1.setInt(1, 3002);
		
		ResultSet rs1=ps1.executeQuery();
		while(rs1.next())
		{
			int id = rs1.getInt("id");
			String name = rs1.getString("name");
			int age= rs1.getInt("age");
			InputStream b=rs1.getBinaryStream("photo");
			
			FileOutputStream fout= new FileOutputStream("E:\\TEST22222.jpg");
			byte[] bytes = new byte[8192];
			int read;
            while ((read = b.read(bytes)) != -1) {
                fout.write(bytes, 0, read);
            }
			
			fout.close();
			
			float salary= rs1.getFloat("salary");
			
			System.out.println("ID:"+id+", name:"+name+", age:"+age+", salary:"+salary);
		}
		
		
		
		
		
		rs.close();
		ps.close();
		con.close();

	}

}
