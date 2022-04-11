package AmazonImp;

import java.util.ArrayList;
import java.util.List;

public class Prod {
	
	String productName;
	int prodPrice;
	
	public Prod(String product, int prodPrice) {
		this.productName = product;
		this.prodPrice = prodPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	
	public List<String> getProductList(){
		List<String> productList = new ArrayList<>();
		
		productList.add("Apple Mac book pro");
		productList.add("Apple Mac Book Air");
		productList.add("Apple iPhone12");
		return productList;
	}

}
