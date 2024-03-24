import java.awt.Window.Type;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.concurrent.Callable;

public class ProcedureExecutionEx {
// BEFORE EXECUTING THE CODE DECLARE PL/SQL IN SQL COMMAND PROMPT
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	//CALLABLE STATEMENTS PROCEDURE
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","syed","azhar");
         // call the procedure
		CallableStatement callableStatement=connection.prepareCall("{call getSal(?,?)}");
		//set the input data
		callableStatement.setInt(1, 1015);
		// register one variable to store the output
		callableStatement.registerOutParameter(2, Types.FLOAT);
		//EXECUTE THE PROCEDURE THE OUT PUT WILL BE STORED IN REGISTERED PARAMETER
		callableStatement.executeUpdate();
		// print out 
		System.out.println(callableStatement.getFloat(2));}}
