package com.Student_Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations_CRUD implements StudentInterface{
	Student_Factory sf=new Student_Factory();
	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String query="insert into StudentInfo values(?,?,?,?)";
		try {
			Connection con=sf.getConnection();
			
	    	System.out.println("enter the RoolNumber");
	    	int rollNumber=sc.nextInt();
	    	System.out.println("enter the name");
	    	String name=sc.next();
	    	
	    	System.out.println("Enter the mobileNumber");
	    	String mobileNumber=sc.next();
	    	System.out.println("Enter the emailId");
	    	String emailId=sc.next();
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, rollNumber);
			ps.setString(2, name);
			ps.setString(3, mobileNumber);
			ps.setString(4, emailId);
			ps.executeUpdate();
			System.out.println("Query exected Sucessfully");
	    	con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		String query="delete from StudentInfo where id= ?";
		
		
		
		try {
			Connection con=sf.getConnection();
			
			System.out.println("enter the Id");
			int id=sc.nextInt();
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("Deletion Successfull");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void updateMobileNumber() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String query="update StudentInfo set mobileNumber= ? where id= ?";
		try {
			Connection con=sf.getConnection();
			
			System.out.println("Enthe the roll number");
			int id=sc.nextInt();
			System.out.println("Enter the updated mobileNumber");
			long mobileNumber1=sc.nextLong();
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			ps.setLong(2, mobileNumber1);
			ps.executeUpdate();
			System.out.println("Updated Successfully");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void displayStudent() {
		Scanner sc=new Scanner(System.in);
		
    	
		String query="select * from StudentInfo ";
		try {
			Connection con=sf.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while (rs.next()) {
				
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				}
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
	}
	

}
