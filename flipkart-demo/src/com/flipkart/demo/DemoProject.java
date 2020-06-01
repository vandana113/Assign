package com.flipkart.demo;

import com.flipkart.bean.Employee;

public class DemoProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Employee emp=new Employee();
		emp.setEmpid(001);
		emp.setEname("Jack");
		System.out.println(emp.getEmpid());
		System.out.println(emp.getEname());
	}

}
