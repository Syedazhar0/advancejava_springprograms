package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class DataBaseClient {
public static void main(String [] args) throws SQLException   {
	EmployeeDao employeeDao=new EmployeeDao();
//		int res1 = employeeDao.save(new Employee(1001,"azhar",10000));
//		System.out.println("data inserted successfully..."+res1);
//		
//		int res2=employeeDao.save(new Employee(1002,"syed",11000));
//		System.out.println("data inserted successfully..."+res2);
	// read the data from the data base
//		Employee employee =employeeDao.findById(1001);
//		System.out.println(employee);
//		Employee employee1 =employeeDao.findById(1002);
//		System.out.println(employee1);
		
//		int deleteCount=employeeDao.deleteById(1001);
//		if (deleteCount==1) {
//			System.out.println("record delete successfully"+deleteCount);
//		}else
//		System.out.println("record deletion process faild please try again  "+deleteCount);

//	double deleteCount1=employeeDao.deleteBySalary(20000);
//	if (deleteCount1>0) {
//		System.out.println("record delete successfully"+deleteCount1);
//	}else
//	System.out.println("record deletion process faild please try again  "+deleteCount1);
//    List<Employee>empsEmployees=employeeDao.findAll();
//    for(Employee emp1:empsEmployees) {
//    	System.out.println(emp1);
//    }
	double count = employeeDao.updateBySalary(9000, 500);
	if (count>0) {
		System.out.println("Salary updated successfully "+count);
	}else {
		System.out.println("Salary updation failed please try again "+count);
	}}}

