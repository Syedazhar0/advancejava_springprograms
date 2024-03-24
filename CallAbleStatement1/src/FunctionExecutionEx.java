import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class FunctionExecutionEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// BEFORE EXECUTING THE PROGRAM DECLARE THE PL SQL CODE IN SQL * PLUS
		// COMMAND PROMT
		// call the function
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","syed","azhar");
		CallableStatement callableStatement=connection.prepareCall("{? =call getAvg(?,?)}");
		// first ? for input and remaining ?? for output
		//set the inputs
		callableStatement.setInt(2, 1015);
		callableStatement.setInt(3, 1013);
		// register the output  parameters
		callableStatement.registerOutParameter(1, Types.DOUBLE);
		//execute the function the out will be stored in register parameter
		callableStatement.executeUpdate();
		//print out 
		System.out.println(callableStatement.getDouble(1));
		connection.close();
}
}
