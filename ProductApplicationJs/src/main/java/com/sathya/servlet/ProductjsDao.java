package com.sathya.servlet;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductjsDao {

    public int save(Productjs product1) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int count = 0;
        try {
            // get connection
            connection = ProductjsConnection.createConnection();
            // create preparedStatement object
            preparedStatement = connection.prepareStatement("insert into product_data values(?,?,?,?,?,?,?,?,?,?)");
            // read the data from Product object and set to parameter
            preparedStatement.setInt(1, product1.getProid());
            preparedStatement.setString(2, product1.getPname());
            preparedStatement.setDouble(3, product1.getPprice());
            preparedStatement.setString(4, product1.getPbrand());
            preparedStatement.setString(5, product1.getpMadeIn());
            preparedStatement.setDate(6, product1.getPmfd());
            preparedStatement.setDate(7,  product1.getPexpdate());
            preparedStatement.setBytes(8, product1.getPimage());
            preparedStatement.setBytes(9, product1.getProAudio());
            preparedStatement.setBytes(10, product1.getProVideo());
            count = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the SQL exception
        } finally {
            // before releasing the connection check the connection is present or not
            if (connection != null)
                connection.close();
            if (preparedStatement != null)
                preparedStatement.close();
        }
        return count;
    }
	public static List<Productjs>findAll (){
	 	// create array-list object to store the all product details 
	 			ArrayList<Productjs>prod = new ArrayList<Productjs>();
	 			try (Connection connection=ProductjsConnection.createConnection()){
	 				Statement statement= connection.createStatement();
	 	// resultset is used to store the data coming from database
	 				ResultSet resultSet=statement.executeQuery("select * from product_data");
	 	// while loop reading all resources one by one
	 				while (resultSet.next()) {
	 					Productjs product=new Productjs();
	 					product.setProid(resultSet.getInt("proid"));
	 					product.setPname(resultSet.getString("pname"));
	 					product.setPprice(resultSet.getDouble("pprice"));
	 					product.setPbrand(resultSet.getString("pbrand"));
	 					product.setpMadeIn(resultSet.getString("pMadeIn"));
	 					product.setPmfd( resultSet.getDate("pmfd"));
	 					product.setPexpdate(resultSet.getDate("pexpdate"));
	 					product.setPimage(resultSet.getBytes("pimage"));
	 					product.setProAudio(resultSet.getBytes("proAudio"));
	 					product.setProVideo(resultSet.getBytes("proVideo"));
	 					
	 	// add product object into list
	 					prod.add(product);
	 				}
	 			} catch (SQLException e) {
	 				// TODO: handle exception
	 				e.printStackTrace();		
	 				}
	 			return prod;
	 		}
	public  int deletebyId(int proid) {
		// delete the record by using the product id
	 	int count=0;
	 		try(Connection connection=ProductjsConnection.createConnection()) {
	 			PreparedStatement	 prepareStatement =connection.prepareStatement("delete from product_data where proid=?");
	 			prepareStatement .setInt(1, proid);
	 			// execute the query
	 			count=prepareStatement.executeUpdate();
	 		}catch (SQLException e) {
	 			// TODO: handle exception
	 			e.printStackTrace();
	 		}
	 	
	 	return count;
	 }
	  public  Productjs findByPId(int proid) {
     	 // find product by id
		Productjs product=null;
		// try with resources to close the connection automatically  or once the try block
		// is completed the resources automatically closed
		// TODO: handle exception
		try(Connection connection=ProductjsConnection.createConnection()) {
			PreparedStatement	 prepareStatement =connection.prepareStatement("select * from product_data where proid=?");
			prepareStatement .setInt(1, proid);
//		//  EXECUTE THE QUERY
	// resultset is used to store the data coming from database
			ResultSet resultSet =prepareStatement.executeQuery();
			// if the record is present then execute the below code,if the record the 
			// is not present it will return null.
			if(resultSet.next()) {
				    product=new Productjs();
				    product.setProid(resultSet.getInt(1));
					product.setPname(resultSet.getString(2));
					product.setPprice(resultSet.getDouble(3));
					product.setPbrand(resultSet.getString(4));
					product.setpMadeIn(resultSet.getString(5));
					product.setPmfd( resultSet.getDate(6));
					product.setPexpdate(resultSet.getDate(7));
					product.setPimage(resultSet.getBytes(8));
					product.setProAudio(resultSet.getBytes(9));
 					product.setProVideo(resultSet.getBytes(10));
				}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();	
			}
		return product;
	}
	  
	  public  int UpdateById(Productjs product) {
			int count =0;
		String sql ="UPDATE product_data SET pname=? , pprice=?, pbrand=?, pMadeIn=?, pmfd=?, pexpdate=?,pimage=?where proid=?";
		
			try(Connection connection=ProductjsConnection.createConnection()) {
				PreparedStatement prepareStatement =connection.prepareStatement(sql);
				   // read the data from Product object and set to parameter
	            prepareStatement.setString(1, product.getPname());
	            prepareStatement.setDouble(2, product.getPprice());
	            prepareStatement.setString(3, product.getPbrand());
	            prepareStatement.setString(4, product.getpMadeIn());
	            prepareStatement.setDate(5, product.getPmfd());
	            prepareStatement.setDate(6, product.getPexpdate());
	            prepareStatement.setBytes(7, product.getPimage());
	            prepareStatement.setInt(8, product.getProid());
//	            prepareStatement.setBytes(9, product.getProAudio());
//	            prepareStatement.setBytes(10, product.getProVideo());
	            count = prepareStatement.executeUpdate();
			}catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();	
				}
			return count;
		}
	}

