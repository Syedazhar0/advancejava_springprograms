import java.sql.SQLException;
import java.util.List;

public class ProductClient {

    public static void main(String[] args) throws SQLException {
    	 // create object of productdao to call the methods
        ProductDao product = new ProductDao();
//    	int count =ProductDao.createproductTable();
//    	if (count==0) {
//    		System.out.println("table created successfully"+count);
//    	}else {
//    		System.out.println("table cration failed please try again later"+count);
//    	}
//        try {
            // INSERT THE PRODUCT DETAILS
//        	int p1 = product.saveProduct(new Product(101, "azhar",10000,"21-10-2002"));
//            int p2 = product.saveProduct(new Product(102, "fridge", 11000, "23-08-2003"));
//            int p3 = product.saveProduct(new Product(103, "ac", 12000, "27-07-2005"));
//            int p4 = product.saveProduct(new Product(104, "cooler", 13000, "29-02-2008"));
//            int p5 = product.saveProduct(new Product(105, "fan", 14000, "30-06-2012"));
//            int p6 = product.saveProduct(new Product(106,"mobile",15000,"20-09-2015"));
//            int p7 = product.saveProduct(new Product(107, "remote", 16000, "01-02-2002"));
//            int p8 = product.saveProduct(new Product(108, "clock", 17000, "02-02-2002"));
//            System.out.println("DATA INSERTED SUCCESSFULLY " + p1 + " " + p2 + " " + p3 + " " + p4 + " " + p5 + " " + p6 + " " + p7 + " " + p8);
//        } catch (SQLException e) {
//            System.out.println("Error occurred while saving product: " + e.getMessage());
//        }
    	// read the data from the data base
	Product product1 =ProductDao.findByPId(101);
	System.out.println(product);
	Product product2 =ProductDao.findByPId(102);
	System.out.println(product2);
		
	int deleteCount=ProductDao.deleteBypId(106);
	if (deleteCount==1) {
		System.out.println("record delete successfully"+deleteCount);
	}else
	System.out.println("record deletion process faild please try again  "+deleteCount);

    int deleteCount1=ProductDao.deleteBypname("clock");
	if (deleteCount1>0) {
		System.out.println("record delete successfully"+deleteCount1);
	}else
	System.out.println("record deletion process faild please try again  "+deleteCount1);
   List<Product>pro=ProductDao.findAllProducts();
    for(Product pro1:pro) {
   	System.out.println(pro1);
    }
//	double count = ProductDao.updateByProPrice(11000, 500);
//	if (count>0) {
//		System.out.println("price updated successfully "+count);
//	}else {
//		System.out.println("product  updation failed please try again "+count);
//	}
	int count1 =ProductDao.deleteByProPrice(27000);
	if (count1>0) {
		System.out.println("product deleted successfully "+count1);
	}else {
		System.out.println("product deletion failed please try again "+count1);
	}
	int count2 =ProductDao.deleteProTable();
	if (count2==0) {
		System.out.println("table droped successfully "+count2);
	}else {
		System.out.println("table drop failed please try again "+count2);}}}
