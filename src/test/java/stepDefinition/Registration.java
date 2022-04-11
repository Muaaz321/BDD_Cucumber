package stepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {

	
	  @Given("User is on registration page")
	  public void user_is_on_registration_open() {
		  
		  System.out.println("user navigates to registration page");
	  }
	  
	  
	  
	   @When("User enters following user details")
	   public void User_enters_following_user_details(DataTable dataTable) {
		   
		 List<List<String>> userList= dataTable.asLists(String.class);
		 
		 for(List<String>e : userList) {
			 System.out.println(e);
		 }
	   }
	   
	   
	   @When("User enters following user details with columns")
	   public void User_enters_following_user_details_with_columns(DataTable dataTable) {
	
		   List<Map<String, String>> userList = 
				   		dataTable.asMaps(String.class,String.class);
		   
		  // System.out.println("zero th value : " + userList.get(0).get("name"));
		  
		   for(Map<String, String> e : userList) {
			  System.out.println(e.get("name"));
			  System.out.println(e.get("envior"));
			  System.out.println(e.get("email"));
			  System.out.println(e.get("code"));
			  System.out.println(e.get("city"));
		   }
		   
		 }
	   
	
	   
	   @Then("user registration should be successful")
	   public void user_registration_should_be_successful() {
		   System.out.println("user registration is successfull");
	   }
	   
	   
	 
}
