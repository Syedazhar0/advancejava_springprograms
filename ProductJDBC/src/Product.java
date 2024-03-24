
public class Product {
private int  pid;
private String pname;
private int price;
private String mkdDate;

public Product(int pid, String pname, int price, String mkdDate) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.price = price;
	this.mkdDate = mkdDate;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", mkdDate=" + mkdDate + "]";
}
public Product() {
	super();
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getMkdDate() {
	return mkdDate;
}
public void setMkdDate(String mkdDate) {
	this.mkdDate = mkdDate;
}
}
