package com.example.jdbc.type4.CollableStatement;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="ABC$$##10.00$$##10";
		//Sting str2r=str1.replaceAll("$$##","    ");
		String[] st=str1.split("\\##");
		String[] st2=st[0].split("\\$");
		System.out.println(st2[0]);
		//StringTokenizer st1 = new StringTokenizer("$$##");
		
		//System.out.println(str1.);
		//st1.
		//System.out.println(st.length);
		
		System.out.println(st[0]);
		String[] name=st[0].split("\\$");
		String[] price=st[1].split("\\$");
		System.out.println(name[0]+","+price[0]+","+st[2]);
	}

}
