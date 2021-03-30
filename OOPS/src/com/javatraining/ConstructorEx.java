package com.javatraining;

import java.util.ArrayList;
import java.util.List;

import com.pack1.Pack1Ex;
import com.pack2.*;
import com.pack2.subpack2.SubPack2Ex;
import java.lang.System;
public class ConstructorEx {
  
	int i=getValue();
	
	public int getValue()
	{
		System.out.println("inside getValue()");
		return 20;
	}
	
	
	
	{ //Non-Static or Instance block
		System.out.println("Inside non-static block");
	}
	
	static
	{ //Static block
		System.out.println("Inside Static Block");  //1
	}
	
	
	public ConstructorEx() {//constructor
		System.out.println("Inside Constructor");//2
	}
	
	void testMethod()
	{ //Non-Static or Instance block
		System.out.println("Inside non-static block");
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
     ConstructorEx c = new ConstructorEx();
     System.out.println(c.i);
     
     String str="hi";
     
     List<String> list=new ArrayList<String>();
     
     Pack1Ex p =new Pack1Ex();
     Pack2Ex p1= new Pack2Ex();
     TestEx t=new TestEx();
     SubPack2Ex s=new SubPack2Ex();
     
     Pack1Ex p2=p;
     
     if(p.equals(p2))
    	 System.out.println("true");
     
     ConstructorEx c2= (ConstructorEx)c.clone();
     
	}
	

}
