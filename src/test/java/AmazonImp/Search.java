package AmazonImp;

public class Search {
	
	public String displayProduct(Prod product) {
		
		if(product.getProductList().contains(product.getProductName())) {
			return product.getProductName();
		}
		return null;
	}

}
