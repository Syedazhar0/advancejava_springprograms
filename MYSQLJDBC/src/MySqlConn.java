
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import javax.sound.midi.Soundbank;
import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
// user name root pass root database username URL AZHAR  EX: jdbc:mysql://localhost/AZHAR
public class MySqlConn {
public static void main(String [] args) throws  ClassNotFoundException,SQLException{
	// LOAD THE DRIVER 
	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/AZHAR","root","root");
//		System.out.println("connection with mysql created successfully");
		// insert into emp values
//		PreparedStatement preparedStatement = connection.prepareStatement("insert into emp values (?,?,?)");
//		preparedStatement.setInt(1, 115);
//		preparedStatement.setString(2, "bye");
//		preparedStatement.setFloat(3, 200000.50f);
		// to execute multiple queries at onec use batch
//		preparedStatement.addBatch();
		// execute the batch
//		preparedStatement.executeBatch();
//		System.out.println("data inserted successfully");
		
		// create resultset object 
		// when you create the reseultset the cursor is pointing to the before first object  
		// ex:-> resultset cursor
		// records ->111 hello 100000
		// records ->112 hello 100001
		// to move the cursor record by record use next() method
		//note resultset is by default forwordonly and readonly to make the resultset scrollable and updateable use the constants 
		// make the resultset scrollable and updateable
//	   Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//	   ResultSet set =statement.executeQuery("select * from emp");
	   // read all records backword direction
//	   set.afterLast();// move the cursor to after last record
//	   while(set.previous()) {
//		   System.out.println(set.getInt(1)+" "+set.getString(2)+set.getFloat(3));
//	   }
//	   set.first();// cursor is pointing first record
//		   System.out.println(set.getInt(1)+" "+set.getString(2)+set.getFloat(3));
//		   
//		   set.last();// cursor is pointing second record
//		   System.out.println(set.getInt(1)+" "+set.getString(2)+set.getFloat(3));
//		   
//		   set.absolute(2);// cursor is pointing specific  record
//		   System.out.println(set.getInt(1)+" "+set.getString(2)+set.getFloat(3));
		
		// resultset is used to store the table data
		// resultsetmetadata: it will store the table metadata number of columns, columns type, column name column size;
		// ex:number of column 3 etc;
		
//		Statement statement= connection.createStatement();
//		ResultSet resultSet = statement.executeQuery("select * from  emp");
//	    ResultSetMetaData metaData =resultSet.getMetaData();
//		System.out.println(metaData.getColumnCount());
//		System.out.println(metaData.getColumnName(2));
//		System.out.println(metaData.getColumnType(2));
//		System.out.println(metaData.getColumnDisplaySize(2));
//		connection.close();
		
		// databasemetadata:this will store the database information like database product name database version database url
		// database driver class-name.. etc
		
//		DatabaseMetaData metaData =connection.getMetaData();
//		System.out.println(metaData.getDatabaseProductName());
//		System.out.println(metaData.getDatabaseProductVersion());
//		System.out.println(metaData.getDriverName());
//		System.out.println(metaData.getUserName());
//		System.out.println(metaData.getURL());
//		connection.close();
		
		// ROWSET USED TO STORE THE DATA IT IS BY DEFAULT SCROLLABLE AND UPDATEABLE EVEN CONNECTION IS CLOSED 
		//CACHEDROWSET WILL STORE THE DATA BY DEFALULT IT WILL PRINT THE DATE IN SCROLLING NATURE
//		Statement statement= connection.createStatement();
//		ResultSet resultSet = statement.executeQuery("select * from  emp");
//		CachedRowSet rowSet= RowSetProvider.newFactory().createCachedRowSet();
//		rowSet.populate(resultSet);
//		rowSet.afterLast();
//		while (rowSet.previous()) {
//	           System.out.println(rowSet.getInt(1)+" "+rowSet.getString(2)+" "+rowSet.getFloat(3));
//		}
//		connection.close();
		
		// after closing connection reading data from rowset
		
		Statement statement= connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from  emp");
		CachedRowSet rowSet= RowSetProvider.newFactory().createCachedRowSet();
		rowSet.populate(resultSet);
		rowSet.afterLast();
		connection.close();
		while (rowSet.previous()) {
	           System.out.println(rowSet.getInt(1)+" "+rowSet.getString(2)+" "+rowSet.getFloat(3));
		}
	
}
}
