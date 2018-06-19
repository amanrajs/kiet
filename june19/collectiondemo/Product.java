package collectiondemo;

public class Product {

		//declare instance variables
	private int productId;
	private String productName;
	private double price;
	
	
	//provide constructor
	public Product() {
		super();
	}


	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}


	//provide getter/setter methods

	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "\n" + productId +"\t" + productName + "\t" + price;
				
	}

}
