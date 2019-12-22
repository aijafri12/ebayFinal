 package com.stepdef;

import com.common.Base23;
import com.common.ScreenShot;
import com.ee.page.DropDown1;
import com.ee.page.MyhomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DropdownStepdef extends Base23  {
	DropDown1 DS;
	


	@Given("^user on  ebay home page$")
	public void user_on_ebay_home_page() throws Throwable {
	   driver= getDriver();
	   
	   
	}

	@Given("^user click on all categories$")
	public void user_click_on_all_categories() throws Throwable {
		
		DS = new DropDown1(driver);
		DS.click();
		ScreenShot.screenshot(driver, "iphone");
		
	    
	}

	@Given("^user select books$")
	public void user_select_books() throws Throwable {

	}

	@Then("^user should be succesful$")
	public void user_should_be_succesful() throws Throwable {
	driver.quit();
	}


	
	
	
	
	
	
	
	
	
	
}
