import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductConnection {
public static Connection createConnection() {
	Connection connection=null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","syed","azhar");
	
	} catch (ClassNotFoundException|SQLException e) {
	
		e.printStackTrace();
	}
	return connection;
}
}
