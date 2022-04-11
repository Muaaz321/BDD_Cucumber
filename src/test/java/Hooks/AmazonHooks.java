package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	//use cucumber annotations not junit
	
	//@Before(order = 1)
	@Before("@Smoke")
	public void setUp_browser(Scenario sc) {
		System.out.println("Launch chrome browser - Hooks");
		System.out.println(sc.getName());
		//int i = 9/0;
	}
	
//	@Before(order = 2)
//	public void setUp_url() {
//		System.out.println("Launch URL - Hooks");
//	}
//	
//	
//	@After(order = 2)
//	public void tearDown(Scenario sc) {
//		System.out.println("close the browser - Hooks");
//		System.out.println(sc.getName());
//	}
	
	//@After(order = 1)
	@After("@Smoke")
	public void tearDown_logout() {
		System.out.println("Logout from application - Hooks");
	}

	
	
//	@BeforeStep
//	public void takeScreenshot() {
//		System.out.println("Before step - take screenshot");
//	}
//	
//	@AfterStep
//	public void refresh() {
//		System.out.println("After step - refresh");
//	}
//	
}
