package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.net.aso.r;

public class EmployeeDao{

//	public  int save(Employee emp) throws SQLException {
//	// declare the resources
//	Connection connection=null;
//	PreparedStatement  prepareStatement=null;
//	int count=0;
//	try {
//		// get the connection
//		connection=DbConnection.createConnection();
//		//create the PreparedStatement object;
//		prepareStatement =connection.prepareStatement("insert into emp values(?,?,?)");
//	//read the data from emp object and set to parameter
//		prepareStatement.setInt(1, emp.getEmpId());
//		prepareStatement.setString(2, emp.getEmpName());
//		prepareStatement.setDouble(3,emp.getSalary());
//		count=prepareStatement.executeUpdate();
//	} catch (SQLException e) {
//		e.printStackTrace();
//		// TODO: handle exception
//	}
//	
//	finally {
//		// before release connection check the connection present or not
//		if (connection!=null) 
//			connection.close();
//			
//		if (prepareStatement!=null) 
//			prepareStatement.close();
//	}
//		return count;	
//	
//  }
////	public Employee findById(int empId) {
////		int count=0;
////		Employee employee=null;
////		// try with resources to close the connection automatically  or once the try block
////		// is completed the resources automatically closed
////		// TODO: handle exception
////		try(Connection connection=DbConnection.createConnection()) {
////			PreparedStatement	 prepareStatement =connection.prepareStatement("select * from emp where empId=?");
////			prepareStatement .setInt(1, empId);
////		//  EXECUTE THE QUERY
	// resultset is used to store the data coming from database
////			ResultSet resultSet =prepareStatement.executeQuery();
////			// if the record is present then execute the below code,if the record the 
////			// is not present it will return null.
////			if(resultSet.next()) {
////				employee=new Employee();
////				employee.setEmpId(resultSet.getInt(1));
////				employee.setEmpName(resultSet.getString(2));
////				employee.setSalary(resultSet.getDouble(3));
////				}
////		}catch (SQLException e) {
////			// TODO: handle exception
////			e.printStackTrace();	
////			}
////		return employee;
////	}
//	public int deleteById(int empId) {
//	// delete the record by using the employee id
//	int count=0;
//		try(Connection connection=DbConnection.createConnection()) {
//			PreparedStatement	 prepareStatement =connection.prepareStatement("delete from emp where empId=?");
//			prepareStatement .setInt(1, empId);
//			// execute the query
//			count=prepareStatement.executeUpdate();
//		}catch (SQLException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	
//	return count;
//}
//	public double deleteBySalary( double Salary) {
//		// delete the record by using the employee id
//		int count=0;
//			try(Connection connection=DbConnection.createConnection()) {
//				PreparedStatement	 prepareStatement =connection.prepareStatement("delete from emp where Salary>?");
//				prepareStatement .setDouble(1, Salary);
//				prepareStatement .setDouble(1, Salary);
//				// execute the query
//				count=prepareStatement.executeUpdate();
//			}catch (SQLException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
//		
//		return count;
//	}
//		public List<Employee>findAll (){
	// create array-list object to store the all emp details 
//			ArrayList<Employee>emps = new ArrayList<Employee>();
//			try (Connection connection=DbConnection.createConnection()){
//				Statement statement= connection.createStatement();
	// resultset is used to store the data coming from database
//				ResultSet resultSet=statement.executeQuery("select * from emp");
	//while loop reading all resources one by one
//				while (resultSet.next()) {
//					Employee employee=new Employee();
//					employee.setEmpId(resultSet.getInt(1));
//					employee.setEmpName(resultSet.getString(2));
//					employee.setSalary(resultSet.getDouble(3));
	// add employee object into list
//					emps.add(employee);
//				}
//			} catch (SQLException e) {
//				// TODO: handle exception
//				e.printStackTrace();		
//				}
//			return emps;
//		}
	public double updateBySalary(double curSalary,double incSalary) {
		// update the employee  current salary by incrementing the current salary
		int count =0;
		try(Connection connection=DbConnection.createConnection()) {
			PreparedStatement preparedStatement=connection.prepareStatement
					("update emp set Salary =Salary+? where Salary>?");
                     preparedStatement.setDouble(1, curSalary);
                    preparedStatement.setDouble(2, incSalary);
                    count=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return count;
}	
}
 
