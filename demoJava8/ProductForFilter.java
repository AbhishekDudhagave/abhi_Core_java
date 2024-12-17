package demoJava8;

public class ProductForFilter {
	String productName;
	Integer productPrice;
	
	public ProductForFilter() {
		
	}
	
	public ProductForFilter(String productName, Integer productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "ProductForFilter [productName=" + productName + ", productPrice=" + productPrice + "]";
	}
	
	
}
