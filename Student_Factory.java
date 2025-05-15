package com.Student_Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

class  Student_Factory{
	  
	public Connection getConnection() throws SQLException {
	    String url = "jdbc:mysql://localhost:3306/jdbc_m70"; // Include database name
	    String user = "root";
	    String password = "root";
	    return DriverManager.getConnection(url, user, password);
	}
	public boolean login()
	{
		while(true) {
		System.out.println("Enter the Mobile Number......");
		Scanner sc=new Scanner(System.in);
		long mobileNumber=sc.nextLong();
		boolean status=false;
		if(mobileNumber>6000000000l && mobileNumber<9999999999l)
		{
			int generateOTP=generateOTP();
			System.out.println("Your OTP is  "+generateOTP);
			System.out.println("Enter the Otp  ");
			int enteredOTP=sc.nextInt();
			if(enteredOTP==generateOTP)
			{
				System.out.println("\u001B[33m"+"Login Successfull....👍👍👍"  );
				status=true;
			}
			else
			{
				System.out.println("\u001B[31m"+"Invalid OTP 👎");
				System.out.println("Please Try again...");
			}
			
		}
		else
		{
			System.out.println("Invalid Mobile number");
		}
		return status;

	}
	}
	public int generateOTP()
	{
		Random random=new Random();
		int otp=random.nextInt( 9000)+1000;
		return otp;
	}
	
	
	   
	    }

		
			