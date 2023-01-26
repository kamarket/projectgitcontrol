package com.java;

public class Employee {
	public void id() {
		System.out.println("emp id");
	}
	public void empname() {
		System.out.println("emp name");
	}
	public void email() {
		System.out.println("emp email");
	}
	public void phno() {
		System.out.println("emp phone number");
	}
	public void address() {
		System.out.println("emp address");
	}
	public void dob() {
		 System.out.println("emp DOB");
	}
	public static void pinCode() {
		System.out.println("pincode");
	}
public static void main(String[] args) {
//	pinCode();
	Employee i = new Employee();
	i.id();
	i.empname();
	i.email();
	i.dob();
	i.address();
	i.phno();
}
}
