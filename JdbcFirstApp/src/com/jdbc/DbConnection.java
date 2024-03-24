package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
// this method create the connection and return the connection
	public static Connection createConnection() {
		Connection connection =null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","syed","azhar");
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return connection;
	}
}
