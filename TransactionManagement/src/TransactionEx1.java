// take the try block perform operation,after all operation use commit if any opration 
//failed goto catch block perform the rollback operations

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionEx1 {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement =null;
		try {
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","syed","azhar");
		    statement=connection.createStatement();
		    connection.setAutoCommit(false);
		    statement.executeUpdate("insert into emp values(1019,'hello',20000)");
		    statement.executeUpdate("insert into emp values(1020,'hi',21000)");
		    statement.executeUpdate("insert into emp values(1030,'bye',22000)");
		    statement.executeUpdate("delete from emp where empid=1017");
		    System.out.println("transaction successfull");
		    connection.commit();
		}catch (ClassNotFoundException|SQLException e) {
			// TODO: handle exception
			System.out.println("transaction failed ");
			connection.rollback();
			e.printStackTrace();
		}finally {
			if (connection!=null)
				connection.close();
			if (statement!=null) 
				statement.close();
		}
	}
}
