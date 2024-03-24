package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEX1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//step 1 : load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//step 2:create the connection
		Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","syed","azhar");
        //step 3:static  query execution
		Statement statement = connection.createStatement();
		String q1="create table emp(id number,name varchar2(30) ,salary number)";
		int res1 = statement.executeUpdate(q1);
		System.out.println("table created successfully...."+res1);
		String q2 ="drop table emp";
		int res2=statement.executeUpdate(q2);
		System.out.println("table droped successfully...."+res2);
		//step 4:release the connection
		connection.close();
		System.out.println("connection closed successfully");
	}

}
