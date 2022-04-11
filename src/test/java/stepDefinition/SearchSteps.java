package stepDefinition;

import AmazonImp.Prod;
import AmazonImp.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Product;
import junit.framework.Assert;
import io.cucumber.core.plugin.JUnitFormatter;

public class SearchSteps {
	
	Prod product;
	Search search;
	
	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
	 System.out.println("Step 1 : I am on search page");
	}

	@When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
	
		System.out.println("Step 2 : Search for the product " + productName + " with " + price);
		
		product = new Prod(productName, price);
	}
	  

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String prod) {
	  System.out.println("Step 3 : Product successfully displayed " + prod);
	  
	  search = new Search();
	  String productName = search.displayProduct(product);
	  System.out.println("My product name " + productName);
	  
	//  Assert.assertEquals(product.getProductName(), productName);
	 
	}
	
	
	@Then("Orderid is {int} and username is {string}")
	public void orderid_is_and_username_is(Integer int1, String string) {
	  
	}	
	
	
}
