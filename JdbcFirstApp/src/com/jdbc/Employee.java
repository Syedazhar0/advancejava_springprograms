package com.jdbc;

public class Employee  {
 private	int empId;
 private	String empName;
 private	double Salary;
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Salary=" + Salary + "]";
	}
	public Employee() {
		 
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
}
