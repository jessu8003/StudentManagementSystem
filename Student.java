package com.Student_Data;

/**
 * Hello world!
 *
 */
class Student 
{
	//Step 1 :Encapsulation by making variables private and accessing them with the help of getters and setters.
    
    	private int roleNumber;
    	private String name;
    	private Long mobileNumber;
    	private String email;
    	public Student(int roleNumber, String name, Long mobileNumber, String email) {
    		super();
    		this.roleNumber = roleNumber;
    		this.name = name;
    		this.mobileNumber = mobileNumber;
    		this.email = email;
    	}
    	@Override
    	public String toString() {
    		return "Student [roleNumber=" + roleNumber + ", name=" + name + ", mobileNumber=" + mobileNumber + ", email="
    				+ email + "]";
    	}
    	public int getRoleNumber() {
    		return roleNumber;
    	}
    	public void setRoleNumber(int roleNumber) {
    		this.roleNumber = roleNumber;
    	}
    	public String getName() {
    		return name;
    	}
    	public void setName(String name) {
    		this.name = name;
    	}
    	public Long getMobileNumber() {
    		return mobileNumber;
    	}
    	public void setMobileNumber(Long mobileNumber) {
    		this.mobileNumber = mobileNumber;
    	}
    	public String getEmail() {
    		return email;
    	}
    	public void setEmail(String email) {
    		this.email = email;
    	}
    
    }

