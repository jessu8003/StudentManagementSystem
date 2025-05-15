package com.Student_Data;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class StudentMainClass {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		StudentInterface si=new Operations_CRUD();
		Student_Factory sf=new Student_Factory();
		boolean status=sf.login();
		if(status) {
			
			
			
			 while (true) {
		            System.out.println("\n--- Student Management System ---");
		            System.out.println("1. Add Student");
		            System.out.println("2. Delete Student");
		            System.out.println("3. Update Student mobile number");
		            System.out.println("4. Display All Student");
		            System.out.println("5. Exit");
		            System.out.print("Enter choice: ");
		            int choice = sc.nextInt();
		            switch(choice)
		            {
		            case 1:
		            {
		            	si.addStudent();
	         
		            }
	                break;
		            case 2:
		            {

		            	si.deleteStudent();
		            }
		            	break;
		            case 3:
		            {

		                 si.updateMobileNumber();
		                 break;
		            }
		            case 4:
		            	si.displayStudent();
		            	break;
		            case 5:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    System.exit(0);
		            
		            	
		            }
			 }

		}

	}

}
			
		
		