import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class BatchProcessingEx {
public static void main(String [] args)throws ClassNotFoundException,SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","syed","azhar");
	Statement statement=connection.createStatement();
	statement.addBatch("create table STUDENT (id number ,name varchar2(20))");
	statement.addBatch("insert into STUDENT values(101,'azhar')");
	statement.addBatch("insert into STUDENT values(102,'syed')");
	statement.addBatch("delete from STUDENT where id=102");
	statement.addBatch("drop table STUDENT");
	int []results=statement.executeBatch();
	for (int result: results) {
		System.out.println(result);
	}
	connection.close();}}
