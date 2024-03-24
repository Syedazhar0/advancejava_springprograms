import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

   public class ProductDao {
	//public static int  createproductTable() throws SQLException {
  // int count=0;
		// get connection
	//Connection connection= ProductConnection.createConnection(); 
   // Statement statement =connection.createStatement();
//	 create table using using statement
    //String q = "create table product1 (pid number(3),pname varchar2(20),price number,mkdDate date)";
    //return count=statement.executeUpdate(q);
	//}
        // public int saveProduct(Product product1) throws SQLException {
		//Connection connection= null;
	//PreparedStatement preparedStatement=null;
	//int count =0;
	//try {
		// get connection
		//connection=ProductConnection.createConnection();
		// create preparedStatement object
		//preparedStatement=connection.prepareStatement("insert into product1 values(?,?,?,?)");
//			// read the data from Product object and set to parameter
		//preparedStatement.setInt(1,product1.getPid());
		//preparedStatement.setString(2,product1.getPname());
		//preparedStatement.setInt(3,(int) product1.getPrice());
		//preparedStatement.setString(4,product1.getMkdDate());
	//	count=preparedStatement.executeUpdate();
	//}catch (SQLException e) {
	//	e.printStackTrace();
	//}finally {
		// before releasing the connection check the connection is present or not
		//if (connection !=null) 
		//	connection.close();
		//if (preparedStatement !=null) 
			//preparedStatement.close();
	//}
	//return count;
	//}
         public static Product findByPId(int pId) {
        	 // find product by id
 		int count=0;
 		Product product=null;
 		// try with resources to close the connection automatically  or once the try block
 		// is completed the resources automatically closed
 		// TODO: handle exception
 		try(Connection connection=ProductConnection.createConnection()) {
 			PreparedStatement	 prepareStatement =connection.prepareStatement("select * from product1 where pId=?");
 			prepareStatement .setInt(1, pId);
// 		//  EXECUTE THE QUERY
 	// resultset is used to store the data coming from database
 			ResultSet resultSet =prepareStatement.executeQuery();
 			// if the record is present then execute the below code,if the record the 
 			// is not present it will return null.
 			if(resultSet.next()) {
 				product=new Product();
 				product.setPid(resultSet.getInt(1));
 				product.setPname(resultSet.getString(2));
 				product.setPrice(resultSet.getInt(3));
 				product.setMkdDate(resultSet.getString(4));
 				}
 		}catch (SQLException e) {
 			// TODO: handle exception
 			e.printStackTrace();	
 			}
 		return product;
 	}
 	public static int deleteBypId(int pId) {
 	// delete the record by using the product id
 	int count=0;
 		try(Connection connection=ProductConnection.createConnection()) {
 			PreparedStatement	 prepareStatement =connection.prepareStatement("delete from product1 where pId=?");
 			prepareStatement .setInt(1, pId);
 			// execute the query
 			count=prepareStatement.executeUpdate();
 		}catch (SQLException e) {
 			// TODO: handle exception
 			e.printStackTrace();
 		}
 	
 	return count;
 }
 	public static int deleteBypname( String pname) {
 		// delete the record by using the product name
 		int count=0;
 			try(Connection connection=ProductConnection.createConnection()) {
 				PreparedStatement	 prepareStatement =connection.prepareStatement("delete from product1 where pname=?");
 				prepareStatement .setString(1, pname);
 				// execute the query
 				count=prepareStatement.executeUpdate();
 			}catch (SQLException e) {
 				// TODO: handle exception
 				e.printStackTrace();
 			}
 		
 		return count;
 	}
 		public static List<Product>findAllProducts (){
 	// create array-list object to store the all product details 
 			ArrayList<Product>prod = new ArrayList<Product>();
 			try (Connection connection=ProductConnection.createConnection()){
 				Statement statement= connection.createStatement();
 	// resultset is used to store the data coming from database
 				ResultSet resultSet=statement.executeQuery("select * from product1");
 	// while loop reading all resources one by one
 				while (resultSet.next()) {
 					Product product=new Product();
 					product.setPid(resultSet.getInt(1));
 					product.setPname(resultSet.getString(2));
 					product.setPrice(resultSet.getInt(3));
 					product.setMkdDate(resultSet.getString(4));
 	// add product object into list
 					prod.add(product);
 				}
 			} catch (SQLException e) {
 				// TODO: handle exception
 				e.printStackTrace();		
 				}
 			return prod;
 		}
 	public static int updateByProPrice(int currentvalue,int incrementvalue) {
 		// update the product the current price by incrementing the current price of the product
 		// where product price greater than 11000
 		int count =0;
 		try(Connection connection=ProductConnection.createConnection()) {
 			PreparedStatement preparedStatement=connection.prepareStatement
 					("update product1 set price =price+? where price>?");
                      preparedStatement.setInt(1, currentvalue);
                     preparedStatement.setInt(2, incrementvalue);
                     count=preparedStatement.executeUpdate();
 		} catch (SQLException e) {
 			// TODO: handle exception
 			e.printStackTrace();
 		}
 		return count;
	}
 	public static int deleteByProPrice(int  pprice) {
 	// delete by product price
 		int count=0;
 		try(Connection connection=ProductConnection.createConnection()) {
 			PreparedStatement preparedStatement=connection.prepareStatement("delete from product1 where price=?");
 			  preparedStatement.setInt(1, pprice);
 			  count=preparedStatement.executeUpdate();
 			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
 		return count;
         }
 	public static int deleteProTable()  {
 		int count=0;
 		try(Connection connection=ProductConnection.createConnection()) {
 			Statement statement=connection.createStatement();
 			String sq = "drop table product1";
 			count=statement.executeUpdate(sq);
 		}catch (SQLException e) {
			// TODO: handle exception
 			e.printStackTrace();
		}
 		return count;
 		}
 	}
 	
