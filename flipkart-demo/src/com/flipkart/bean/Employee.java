/**
 * 
 */
package com.flipkart.bean;

/**
 * @author Anuradha
 *
 */
public class Employee {
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public static String getEname() {
		return ename;
	}
	public static void setEname(String ename) {
		Employee.ename = ename;
	}
	private int empid;
	public static String ename;

}
